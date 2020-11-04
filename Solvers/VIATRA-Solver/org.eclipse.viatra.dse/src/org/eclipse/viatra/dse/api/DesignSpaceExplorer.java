/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.base.GlobalContext;
import org.eclipse.viatra.dse.designspace.api.DesignSpace;
import org.eclipse.viatra.dse.designspace.api.IDesignSpace;
import org.eclipse.viatra.dse.objectives.IGlobalConstraint;
import org.eclipse.viatra.dse.objectives.IObjective;
import org.eclipse.viatra.dse.solutionstore.ISolutionNameProvider;
import org.eclipse.viatra.dse.solutionstore.IdBasedSolutionNameProvider;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory;
import org.eclipse.viatra.dse.visualizer.IDesignSpaceVisualizer;
import org.eclipse.viatra.query.runtime.matchers.util.Preconditions;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

/**
 * <p>
 * The {@link DesignSpaceExplorer} is the main API of the <b>Design Space Exploration</b> engine.
 * </p>
 * 
 * <p>
 * To parameterize the algorithm one must use the following methods after instantiating:
 * <ul>
 * <li>{@link #setInitialModel(EObject)} or it's overloads to set the starting model.</li>
 * <li>{@link #addTransformationRule(BatchTransformationRule)} to define the transformations.</li> <li
 * {@link #addObjective(IObjective)} to define the objective functions. Use the {@link Objectives} helper class for
 * instantiating built-in, configurable objectives.</li>
 * <li>{@link #startExploration(IStrategy)} or it's overloads to start an exploration with the given exploration
 * strategy. Use the {@link Strategies} helper class for instantiating built-in, configurable exploration strategies.
 * </li>
 * </ul>
 * </p>
 * 
 * <p>
 * <b>Designs Space Exploration</b> is the process of finding a sequence (or sequences) of predefined transformation
 * rules ("transitions") that, if applied in order on the starting model, results in a new model state that fulfills the
 * hard (or goal) constraints and is near optimal with respect to the objectives.
 * </p>
 * 
 * <p>
 * An extension to this paradigm is the introduction of global constraints, which guarantees, that no sequence will be
 * returned, which if executed, results in an intermediate model state that violates the specified global constraints,
 * including the final state. You can add constraints by invoking {@link #addGlobalConstraint(IGlobalConstraint)}.
 * </p>
 * 
 * @author Andras Szabolcs Nagy & Miklos Foldenyi
 * 
 */
public class DesignSpaceExplorer {

    private Notifier model;

    private GlobalContext globalContext = new GlobalContext();

    private final Logger logger = Logger.getLogger(this.getClass());

    private Set<EPackage> metaModelPackages = new HashSet<EPackage>();

    private static final String MODEL_NOT_YET_GIVEN = "The starting model is not given yet. Please call the setInitialModel method first.";

    private boolean deepCopyModel;

    /**
     * <p>
     * Creates a {@link DesignSpaceExplorer} object that is able to execute a design space exploration process.
     * </p>
     * 
     * <p>
     * By default the state coder used is the generic (not meta-model specific) {@link GraphHash}. You can provide your
     * custom state coder by implementing the {@link IStateCoderFactory} and {@link IStateCoder} interfaces, and passing
     * the former to the {@link #setStateCoderFactory(IStateCoderFactory)} method.
     * 
     */
    public DesignSpaceExplorer() {
        setDesignspace(new DesignSpace());
    }

    /**
     * Adds a metamodel in the form of {@link EPackage}, which is needed for certain guidance.
     * 
     * @param metaModelPackage
     */
    public void addMetaModelPackage(EPackage metaModelPackage) {
        metaModelPackages.add(metaModelPackage);
    }

    /**
     * Defines the initial model of the exploration, and whether it is supposed to be used to execute the DSE process or
     * it should be cloned. Please note, that in multithreaded mode any subsequent threads will be working on cloned
     * models.
     * 
     * @param model
     *            The root object of the EMF model.
     * @param deepCopyModel
     *            If it is set to true, the exploration will run on a cloned model.
     */
    public void setInitialModel(Notifier model, boolean deepCopyModel) {
        this.model = model;
        this.deepCopyModel = deepCopyModel;
    }

    /**
     * Defines the initial model of the exploration. The model will be cloned, which is desired in most cases as the
     * given model won't be changed.
     * 
     * @param model
     *            The root object of the EMF model.
     */
    public void setInitialModel(Notifier model) {
        setInitialModel(model, true);
    }

    /**
     * Defines the initial model of the exploration. The given model won't be cloned, thus the exploration will modify
     * it.
     * 
     * @param model
     *            The root object of the EMF model. It won't be cloned.
     */
    public void setInitialModelUncloned(Notifier model) {
        setInitialModel(model, false);
    }

    /**
     * Adds a {@link BatchTransformationRule}.
     * 
     * @param rule
     *            The transformationRule.
     */
    public void addTransformationRule(BatchTransformationRule<?, ?> rule) {
        Preconditions.checkArgument(rule != null);
        for (BatchTransformationRule<?, ?> rule2 : globalContext.getTransformations()) {
            if (rule.getPrecondition().equals(rule2.getPrecondition())) {
                throw new DSEException(
                        "Two transformation rule ("
                                + rule.getName()
                                + "; "
                                + rule2.getName()
                                + ") uses the same LHS VIATRA Query pattern ("
                                + rule.getPrecondition().getFullyQualifiedName()
                                + "), which may lead to hash collision."
                                + " Please wrap the pattern with an other pattern with the 'find' keyword (or duplicate the code), and use that for one of the rules LHS.");
            }
        }

        globalContext.getTransformations().add(rule);
    }

    /**
     * Adds a global constraint to the exploration process. Please see the {@link IGlobalConstraint} interface and its
     * implementations for details.
     * 
     * @param constraint
     *            The global constraint.
     * @see IGlobalConstraint
     */
    public void addGlobalConstraint(IGlobalConstraint constraint) {
        globalContext.getGlobalConstraints().add(constraint);
    }

    /**
     * Adds an objective the the exploration process. Please see the {@link IObjective} interface and its
     * implementations for details.
     * 
     * @param objective
     *            The objective.
     * @see IObjective
     */
    public void addObjective(IObjective objective) {
        for (IObjective o : globalContext.getObjectives()) {
            if (o.getName().equals(objective.getName())) {
                throw new DSEException("Two objectives with the same name cannot be registered:" + o.getName());
            }
        }
        globalContext.getObjectives().add(objective);
    }

    /**
     * Sets a {@link IStateCoderFactory} for which will be used for creating {@link IStateCoder}s. The default
     * implementation is the {@link SimpleStateCoderFactory}, which works well in most of the cases.
     * 
     * @param stateCoderFactory
     *            The factory.
     */
    public final void setStateCoderFactory(IStateCoderFactory stateCoderFactory) {
        globalContext.setStateCoderFactory(stateCoderFactory);
    }

    /**
     * Defines the maximum processing threads that the design space exploration can use. Note, that this is only
     * limiting the threads doing the actual calculation. By default this value will be set to the number of logical
     * processors (including HyperThreading) in the computer, reported by {@link Runtime#availableProcessors()}.
     * 
     * @param maxNumberOfThreads
     *            The number of maximum processing threads available to the design space exploration process.
     */
    public void setMaxNumberOfThreads(int maxNumberOfThreads) {
        globalContext.getThreadPool().setMaximumPoolSize(maxNumberOfThreads);
    }

    /**
     * Sets the {@link IDesignSpace} implementation that is to be used during the design space exploration process. By
     * default, the {@link DesignSpace} implementation is used.
     * 
     * @param designspace
     *            The {@link IDesignSpace} implementation.
     */
    public final void setDesignspace(IDesignSpace designspace) {
        globalContext.setDesignSpace(designspace);
    }

    /**
     * Sets the solution store for strategies. Please see the {@link SolutionStore} for how to configure it.
     * 
     * @param solutionStore
     *            The parameterized {@link SolutionStore} implementation.
     */
    public void setSolutionStore(SolutionStore solutionStore) {
        globalContext.setSolutionStore(solutionStore);
    }

    /**
     * Starts the design space exploration. It returns only when the strategy decides to stop the execution.
     * 
     * @param strategy
     *            The strategy of the exploration.
     */
    public void startExploration(IStrategy strategy) {
        startExploration(strategy, true, -1);
    }

    /**
     * Starts the design space exploration asynchronously. Completion of the process can be verified by calling
     * {@link DesignSpaceExplorer#isDone()}.
     * 
     * @param strategy
     *            The strategy of the exploration.
     */
    public void startExplorationAsync(IStrategy strategy) {
        startExploration(strategy, false, -1);
    }

    /**
     * Starts the design space exploration with a timeout. It returns only when the strategy decides to stop the
     * execution or the given timeout is elapsed.
     * 
     * @param strategy
     *            The strategy of the exploration.
     * @param timeout
     *            The number of milliseconds before the exploration is forced to stop.
     * @return Returns true if the exploration stopped by the timeout.
     */
    public boolean startExplorationWithTimeout(IStrategy strategy, long timeout) {
        return startExploration(strategy, true, timeout);
    }

    /**
     * Starts the design space exploration asynchronously with a timeout. Completion of the process can be verified by
     * calling {@link DesignSpaceExplorer#isDone()}.
     * 
     * @param strategy
     *            The strategy of the exploration.
     * @param timeout
     *            The number of milliseconds before the exploration is forced to stop.
     * @return Returns true if the exploration stopped by the timeout.
     */
    public boolean startExplorationAsyncWithTimeout(IStrategy strategy, long timeout) {
        return startExploration(strategy, false, timeout);
    }

    /**
     * Starts the design space exploration. If {@code waitForTermination} is true, then it returns only when the
     * strategy decides to stop the execution or there was a timeout, otherwise when the exploration process is started
     * it returns immediately. In this case, process completion can be verified by calling
     * {@link DesignSpaceExplorer#isDone()}.
     * 
     * @param strategy
     *            The strategy of the exploration.
     * @param waitForTermination
     *            True if the method must wait for the engine to stop, i.e. whether to start synchronously.
     * @param timeout
     *            The number of milliseconds before the exploration is forced to stop.
     * @return Returns true if the exploration stopped by the timeout.
     */
    public boolean startExploration(IStrategy strategy, boolean waitForTermination, final long timeout) {
        initExploration(strategy);

        Timer timer = new Timer();
        final AtomicBoolean wasTimeout = new AtomicBoolean(false);

        if (timeout > 0) {
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    logger.info("Timeout, stopping threads...");
                    globalContext.stopAllThreads();
                    wasTimeout.set(true);
                }
            };
            timer.schedule(timerTask, timeout);
        }

        if (waitForTermination) {
            waitForTerminaition();
            timer.cancel();
        } else {
            logger.info("Design space exploration started asynchronously.");
        }

        return wasTimeout.get();

    }

    private void initExploration(IStrategy strategy) {
        Preconditions.checkArgument(model != null, MODEL_NOT_YET_GIVEN);
        Preconditions.checkArgument(strategy != null, "A strategy must be given. Use the Strategies helper class.");
        Preconditions.checkState(!globalContext.getTransformations().isEmpty(),
                "At least one transformation rule must be added to start the exploration.");

        if (globalContext.getStateCoderFactory() == null) {
            if (getMetaModelPackages() == null || getMetaModelPackages().isEmpty()) {
                throw new DSEException("Cannot initialize state coder."
                        + " Please specifiy the EPackages your model uses with addMetaModelPackage(EPackage)");
            }
            globalContext.setStateCoderFactory(new SimpleStateCoderFactory(getMetaModelPackages()));
        }

        logger.info("DesignSpaceExplorer started exploration.");

        if (deepCopyModel) {
            globalContext.startFirstThread(strategy, model);
        } else {
            globalContext.startFirstThreadWithoutModelClone(strategy, model);
        }
    }

    /**
     * Returns all of the found {@link Solution}s, trajectories. Call it after
     * {@link DesignSpaceExplorer#startExploration()}. Calling this while the process is running returns the solutions
     * that have been found <b>so far</b>. The returned {@link Solution} objects may change internal state after they
     * have been returned, if a shorter trajectory has been found to the referred state.
     * 
     * @return The found solutions.
     */
    public Collection<Solution> getSolutions() {
        return globalContext.getSolutionStore().getSolutions();
    }

    /**
     * Returns an arbitrary solution trajectory or null if the exploration failed to find any.
     * 
     * @return An arbitrary solution trajectory.
     */
    public SolutionTrajectory getArbitrarySolution() {
        Collection<Solution> solutions = getSolutions();
        if (solutions.isEmpty()) {
            return null;
        }
        return solutions.iterator().next().getArbitraryTrajectory();
    }

    /**
     * Returns the number of distinct states the exploration process has visited so far.
     * 
     * @return the number of distinct states.
     */
    public long getNumberOfStates() {
        return globalContext.getDesignSpace().getNumberOfStates();
    }

    /**
     * Returns the number of distinct transitions the exploration process has discovered (but not necessarily traversed)
     * so far.
     * 
     * @return the number of distinct transitions.
     */
    public long getNumberOfTransitions() {
        return globalContext.getDesignSpace().getNumberOfTransitions();
    }

    /**
     * Returns the {@link EPackage}s, which were registered with the
     * {@link DesignSpaceExplorer#addMetaModelPackage(EPackage)} method.
     * 
     * @return The set of meta model packages.
     */
    public Set<EPackage> getMetaModelPackages() {
        return metaModelPackages;
    }

    /**
     * Returns true if the {@link IExplorerThread strategy} decided to stop, and all the threads finished their work.
     * 
     * @return true if the process has finished, false otherwise.
     */
    public boolean isDone() {
        return globalContext.isDone();
    }

    /**
     * Returns the {@link GlobalContext} which holds the configurations such as rule, objectives, etc.
     * 
     * @return The global context.
     */
    public GlobalContext getGlobalContext() {
        return globalContext;
    }

    /**
     * Registers a design space visualizer. Please see the corresponding interface {@link IDesignSpaceVisualizer}.
     * 
     * @see IDesignSpaceVisualizer
     * 
     * @param visualizer
     */
    public void addDesignSpaceVisulaizer(IDesignSpaceVisualizer visualizer) {
        globalContext.registerDesignSpaceVisualizer(visualizer);
    }

    /**
     * Creates a string containing the state codes of all the found solutions and the found trajectories to these
     * solutions with fitness values.
     * 
     * @return A pretty string with the solutions.
     */
    public String toStringSolutions() {
        StringBuilder sb = new StringBuilder();
        Collection<Solution> solutions = getSolutions();
        sb.append("Number of solutions: ");
        sb.append(solutions.size());
        sb.append("\n");
        for (Solution solution : solutions) {
            sb.append("Solution: ");
            sb.append(solution.getStateCode());
            sb.append("\n");
            for (SolutionTrajectory trajectory : solution.getTrajectories()) {
                sb.append("  ");
                sb.append(trajectory.toPrettyString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * A conflict resolver can filter rule activations the DSE engine will see. The primary use of this is symmetry
     * reduction. This function is subject to change for better API.
     * 
     * @param conflictResolver
     */
    public void setConflictResolver(ConflictResolver conflictResolver) {
        globalContext.setConflictResolver(conflictResolver);
    }

    /**
     * Enumeration for different use cases of logging, including:
     * <ul>
     * <li>OFF - no error messages.</li>
     * <li>WARN - only error and warn messages.</li>
     * <li>BASIC - logs basic information on how the exploration is going.</li>
     * <li>VERBOSE_STRATEGY - logs everything the exploration strategy is prepared for.</li>
     * <li>VERBOSE_FULL - logs every transformation.</li>
     * </ul>
     * 
     * @author Andras Szabolcs Nagy
     *
     */
    public enum DseLoggingLevel {
        OFF, WARN, BASIC, VERBOSE_STRATEGY, VERBOSE_FULL
    }

    /**
     * Changes the level of logging. See {@link DseLoggingLevel} for details.
     * 
     * @param dseLoggingLevel
     */
    public static void turnOnLogging(DseLoggingLevel dseLoggingLevel) {
        switch (dseLoggingLevel) {
        case OFF:
            Logger.getLogger(DesignSpaceExplorer.class).setLevel(Level.OFF);
            Logger.getLogger(IStrategy.class).setLevel(Level.OFF);
            Logger.getLogger(DesignSpaceManager.class).setLevel(Level.OFF);
            break;
        case WARN:
            Logger.getLogger(DesignSpaceExplorer.class).setLevel(Level.WARN);
            Logger.getLogger(IStrategy.class).setLevel(Level.WARN);
            Logger.getLogger(DesignSpaceManager.class).setLevel(Level.WARN);
            break;
        case BASIC:
            Logger.getLogger(DesignSpaceExplorer.class).setLevel(Level.INFO);
            Logger.getLogger(IStrategy.class).setLevel(Level.INFO);
            Logger.getLogger(DesignSpaceManager.class).setLevel(Level.WARN);
            break;
        case VERBOSE_STRATEGY:
            Logger.getLogger(DesignSpaceExplorer.class).setLevel(Level.DEBUG);
            Logger.getLogger(IStrategy.class).setLevel(Level.DEBUG);
            Logger.getLogger(DesignSpaceManager.class).setLevel(Level.WARN);
            break;
        case VERBOSE_FULL:
            Logger.getLogger(DesignSpaceExplorer.class).setLevel(Level.DEBUG);
            Logger.getLogger(IStrategy.class).setLevel(Level.DEBUG);
            Logger.getLogger(DesignSpaceManager.class).setLevel(Level.DEBUG);
            break;
        default:
            throw new DSEException("Not supported logging level.");
        }
    }

    /**
     * Changes the level of logging. See {@link DseLoggingLevel} for details.
     * 
     * Also configures a basic console appender for log4j.
     * 
     * @param dseLoggingLevel
     */
    public static void turnOnLoggingWithBasicConfig(DseLoggingLevel dseLoggingLevel) {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.WARN);
        turnOnLogging(dseLoggingLevel);
    }

    /**
     * Stops the exploration and waits for termination. It has no effect if the exploration is already terminated or not
     * even started.
     */
    public void stopExploration() {
        if (globalContext.isDone()) {
            logger.info("Cannot stop exploration - design space exploration has already finished.");
        } else if (globalContext.isNotStarted()) {
            logger.info("Cannot stop exploration - design space exploration has not been started.");
        } else {
            globalContext.stopAllThreads();
            waitForTerminaition();
        }
    }

    /**
     * Stops the exploration asynchronously. It has no effect if the exploration is already terminated or not even
     * started.
     */
    public void stopExplorationAsync() {
        if (globalContext.isDone()) {
            logger.info("Cannot stop exploration - design space exploration has already finished.");
        } else if (globalContext.isNotStarted()) {
            logger.info("Cannot stop exploration - design space exploration has not been started.");
        } else {
            globalContext.stopAllThreads();
        }
    }

    /**
     * Waits for termination.
     */
    public void waitForTerminaition() {
        globalContext.waitForTermination();
    }

    /**
     * Serializes all the found solutions by transforming the given initial model.
     * </p>Files will be named <code>solution[id].xmi</code>.
     * @param model The initial model.
     */
    public void saveModels(Notifier model) {
        this.saveModels(model, "solution", "xmi");
    }

    /**
     * Serializes all the found solutions by transforming the given initial model.
     * </p>Files will be named <code>solution[id].[extension]</code>.
     * @param model The initial model.
     * @param extension The extension of the omitted file.
     */
    public void saveModels(Notifier model, String extension) {
        this.saveModels(model, "solution", extension);
    }

    /**
     * Serializes all the found solutions by transforming the given initial model.
     * </p>Files will be named <code>[fileNamePrefix][id].[extension]</code>.
     * @param model The initial model.
     * @param fileNamePrefix The prefix (optionally including a file path) of the omitted file.
     * @param extension The extension of the omitted file.
     */
    public void saveModels(Notifier model, String fileNamePrefix, String extension) {
        globalContext.getSolutionStore().saveModels(model, new IdBasedSolutionNameProvider(fileNamePrefix, extension));
    }

    /**
     * Serializes all the found solutions by transforming the given initial model.
     * </p>Files will be named using the {@link ISolutionNameProvider}.
     * @param model The initial model.
     */
    public void saveModels(Notifier model, ISolutionNameProvider solutionNameProvider) {
        globalContext.getSolutionStore().saveModels(model, solutionNameProvider);
    }
}
