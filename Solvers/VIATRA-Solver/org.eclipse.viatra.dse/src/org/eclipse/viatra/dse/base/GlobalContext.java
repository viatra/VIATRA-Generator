/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategyFactory;
import org.eclipse.viatra.dse.designspace.api.IDesignSpace;
import org.eclipse.viatra.dse.multithreading.DSEThreadPool;
import org.eclipse.viatra.dse.objectives.IGlobalConstraint;
import org.eclipse.viatra.dse.objectives.IObjective;
import org.eclipse.viatra.dse.objectives.LeveledObjectivesHelper;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.dse.util.EMFHelper;
import org.eclipse.viatra.dse.visualizer.IDesignSpaceVisualizer;
import org.eclipse.viatra.transformation.evm.api.RuleSpecification;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver;
import org.eclipse.viatra.transformation.evm.specific.ConflictResolvers;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/**
 * Creates new contexts for strategies. It is needed because of the multithreading.
 * 
 * @author Andras Szabolcs Nagy
 * 
 */
public class GlobalContext {

    // **** fields and methods for multi threading *****//
    // *************************************************//

    public enum ExplorationProcessState {
        NOT_STARTED,
        RUNNING,
        STOPPING,
        COMPLETED
    }

    private ConcurrentLinkedQueue<Throwable> exceptions = new ConcurrentLinkedQueue<Throwable>();

    private volatile ExplorationProcessState state = ExplorationProcessState.NOT_STARTED;
    private final Set<ExplorerThread> runningThreads = new HashSet<ExplorerThread>();
    private DSEThreadPool threadPool = new DSEThreadPool();
    private int numberOfStartedThreads = 0;
    private IDesignSpace designSpace;

    private AtomicBoolean firstThreadContextInited = new AtomicBoolean(false);
    private AtomicBoolean firstThreadContextIniting = new AtomicBoolean(false);

    private Map<RuleSpecification<?>, BatchTransformationRule<?,?>> specificationRuleMap;

    private Object terminationSnycObject = new Object();

    private Logger logger = Logger.getLogger(IStrategy.class);

    private boolean isAlreadyInited;

    public void waitForTermination() {
        synchronized (terminationSnycObject) {
            while (!isDone()) {
                try {
                    terminationSnycObject.wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }

    /**
     * Starts a new thread to explore the design space.
     * 
     * @param originalThreadContext The context of the thread which starts the new thread.
     * @param model The model to start from.
     * @param cloneModel It should be true in most cases.
     * @param strategy The strategy, the thread will use.
     * @return The {@link ExplorerThread}
     */
    private synchronized ExplorerThread tryStartNewThread(ThreadContext originalThreadContext, Notifier model,
            IStrategy strategy) {
        
        if(!isAlreadyInited) {
            isAlreadyInited = true;
            init();
        }

        if (state != ExplorationProcessState.COMPLETED && state != ExplorationProcessState.STOPPING
                && threadPool.canStartNewThread()) {

            ThreadContext newThreadContext = new ThreadContext(this, strategy, model);

            // TODO : clone undo list? slave strategy can't go further back...
            ExplorerThread explorerThread = new ExplorerThread(newThreadContext);
            newThreadContext.setExplorerThread(explorerThread);

            boolean isSuccessful = threadPool.tryStartNewStrategy(explorerThread);

            if (isSuccessful) {
                runningThreads.add(explorerThread);

                state = ExplorationProcessState.RUNNING;
                ++numberOfStartedThreads;

                logger.info("New thread started, active threads: " + runningThreads.size());

                return explorerThread;
            }
        }
        return null;
    }

    public synchronized ExplorerThread tryStartNewThread(ThreadContext originalThreadContext, IStrategy strategy) {
        return tryStartNewThread(originalThreadContext, EMFHelper.clone(originalThreadContext.getModel()), strategy);
    }

    public synchronized ExplorerThread tryStartNewThreadWithoutModelClone(ThreadContext originalThreadContext,
            IStrategy strategy) {
        return tryStartNewThread(originalThreadContext, originalThreadContext.getModel(), strategy);
    }

    public synchronized ExplorerThread startFirstThread(IStrategy strategy, Notifier model) {
        Preconditions.checkState(!isAlreadyInited, "First thread is already started.");
        return tryStartNewThread(null, EMFHelper.clone(model), strategy);
    }

    public synchronized ExplorerThread startFirstThreadWithoutModelClone(IStrategy strategy, Notifier model) {
        Preconditions.checkState(!isAlreadyInited, "First thread is already started.");
        return tryStartNewThread(null, model, strategy);
    }
    
    public synchronized void startAllThreads(ThreadContext originalThreadContext, IStrategyFactory strategyFactory) {
        while (canStartNewThread()) {
            tryStartNewThread(originalThreadContext, strategyFactory.createStrategy());
        }
    }

    /**
     * Starts a new thread to explore the design space.
     * 
     * @param strategyBase
     *            The {@link Strategy}.
     * @param tedToClone
     *            The model to clone. Hint: context.getTed()
     */

    public synchronized void strategyFinished(ExplorerThread strategy) {
        runningThreads.remove(strategy);

        logger.info("Thread finished, active threads: " + runningThreads.size());

        // is the first part necessary?
        if (runningThreads.isEmpty()) {
            state = ExplorationProcessState.COMPLETED;
            threadPool.shutdown();

            // if the main thread (which started the exploration)
            // is waiting for the solution, than wake it up
            synchronized (terminationSnycObject) {
                terminationSnycObject.notify();
                logger.info("Exploration terminated.");
            }

        }
    }

    public synchronized boolean isDone() {
        return state == ExplorationProcessState.COMPLETED && runningThreads.isEmpty();
    }

    public synchronized boolean isNotStarted() {
        return state == ExplorationProcessState.NOT_STARTED;
    }

    public boolean canStartNewThread() {
        return (state == ExplorationProcessState.NOT_STARTED || state == ExplorationProcessState.RUNNING)
                && threadPool.canStartNewThread();
    }

    public synchronized void stopAllThreads() {
        if (state == ExplorationProcessState.RUNNING) {
            state = ExplorationProcessState.STOPPING;
            logger.info("Stopping all threads.");
            for (ExplorerThread strategy : runningThreads) {
                strategy.stopRunning();
            }
        }
    }

    public void registerException(Throwable e) {
        exceptions.add(e);
    }

    // ******* fields and methods for exploration *******//
    // **************************************************//

    private List<IObjective> objectives = new ArrayList<IObjective>();
    private IObjective[][] leveledObjectives;
    private List<IGlobalConstraint> globalConstraints = new ArrayList<IGlobalConstraint>();
    private Set<BatchTransformationRule<?, ?>> transformations = new HashSet<BatchTransformationRule<?, ?>>();
    private IStateCoderFactory stateCoderFactory;
    private SolutionStore solutionStore = new SolutionStore(1);
    private Object sharedObject;
    private List<IDesignSpaceVisualizer> visualizers;

    private ConflictResolver conflictResolver = ConflictResolvers.createArbitraryResolver();

    private void init() {
        leveledObjectives = new LeveledObjectivesHelper(objectives).initLeveledObjectives();
        
        specificationRuleMap = new HashMap<>();
        for (BatchTransformationRule<?,?> rule : transformations) {
            specificationRuleMap.put(rule.getRuleSpecification(), rule);
        }
    }

    public List<IDesignSpaceVisualizer> getVisualizers() {
        return ImmutableList.copyOf(visualizers);
    }

    public void registerDesignSpaceVisualizer(IDesignSpaceVisualizer visualizer) {
        if (visualizer == null) {
            return;
        }
        if (visualizers == null) {
            visualizers = new ArrayList<IDesignSpaceVisualizer>();
        }
        visualizers.add(visualizer);
    }

    public void deregisterDesignSpaceVisualizer(IDesignSpaceVisualizer visualizer) {
        if (visualizer == null) {
            return;
        }
        if (visualizers != null) {
            visualizers.remove(visualizer);
        }
    }

    public boolean isDesignSpaceVisualizerRegistered(IDesignSpaceVisualizer visualizer) {
        if (visualizers != null) {
            return visualizers.contains(visualizer);
        }
        return false;
    }

    public void initVisualizersForThread(ThreadContext threadContext) {
        if (visualizers != null && !visualizers.isEmpty()) {
            for (IDesignSpaceVisualizer visualizer : visualizers) {
                visualizer.init(threadContext);
                threadContext.getDesignSpaceManager().registerExploreEventHandler(visualizer);
            }
        }
    }

    public boolean isExceptionHappendInOtherThread() {
        return !exceptions.isEmpty();
    }

    public Collection<Throwable> getExceptions() {
        return exceptions;
    }

    public IStateCoderFactory getStateCoderFactory() {
        return stateCoderFactory;
    }

    public void setStateCoderFactory(IStateCoderFactory stateCoderFactory) {
        this.stateCoderFactory = stateCoderFactory;
    }

    public Set<BatchTransformationRule<?, ?>> getTransformations() {
        return transformations;
    }

    public void setTransformations(Set<BatchTransformationRule<?, ?>> transformations) {
        this.transformations = transformations;
    }

    public DSEThreadPool getThreadPool() {
        return threadPool;
    }

    public IDesignSpace getDesignSpace() {
        return designSpace;
    }

    public void setDesignSpace(IDesignSpace designSpace) {
        this.designSpace = designSpace;
    }

    public int getNumberOfStartedThreads() {
        return numberOfStartedThreads;
    }

    public Object getSharedObject() {
        return sharedObject;
    }

    public void setSharedObject(Object sharedObject) {
        this.sharedObject = sharedObject;
    }

    public ExplorationProcessState getState() {
        return state;
    }

    public List<IObjective> getObjectives() {
        return objectives;
    }

    public void setObjectives(List<IObjective> objectives) {
        this.objectives = objectives;
    }

    public List<IGlobalConstraint> getGlobalConstraints() {
        return globalConstraints;
    }

    public void setGlobalConstraints(List<IGlobalConstraint> globalConstraints) {
        this.globalConstraints = globalConstraints;
    }

    AtomicBoolean getFirstThreadContextInited() {
        return firstThreadContextInited;
    }

    AtomicBoolean getFirstThreadContextIniting() {
        return firstThreadContextIniting;
    }

    public IObjective[][] getLeveledObjectives() {
        return leveledObjectives;
    }

    public void setSolutionStore(SolutionStore solutionStore) {
        this.solutionStore = solutionStore;
    }

    public SolutionStore getSolutionStore() {
        return solutionStore;
    }

    public Map<RuleSpecification<?>, BatchTransformationRule<?, ?>> getSpecificationRuleMap() {
        return specificationRuleMap;
    }

    public void setConflictResolver(ConflictResolver conflictResolver) {
        this.conflictResolver = conflictResolver;
    }

    public ConflictResolver getConflictResolver() {
        return conflictResolver;
    }
}
