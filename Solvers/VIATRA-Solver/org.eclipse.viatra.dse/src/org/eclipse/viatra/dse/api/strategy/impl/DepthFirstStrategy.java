/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api.strategy.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Fitness;

/**
 * A depth-first search algorithm implementation, that
 * <ul>
 * <li>can work with multiple threads,</li>
 * <li>randomly traverses the search space,</li>
 * <li>saves all states (trajectories) as solutions that fulfill all the hard objectives,</li>
 * <li>can have a depth limit,</li>
 * <li>will backtrack when a model satisfies the hard objectives (after saving it as a solution), which can be modified
 * by calling {@link #continueIfHardObjectivesFulfilled()}</li>
 * </ul>
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class DepthFirstStrategy implements IStrategy {

    private int maxDepth;
    private AtomicBoolean isInterrupted = new AtomicBoolean(false);
    private ThreadContext context;
    
    private Logger logger = Logger.getLogger(IStrategy.class);

    private Random random = new Random();
    private boolean backTrackIfSolution = true; 

    /**
     * Creates a new depth-first search algorithm without depth limit.
     */
    public DepthFirstStrategy() {
        this.maxDepth = Integer.MAX_VALUE;
    }

    /**
     * Creates a new depth-first search algorithm with depth limit.
     * 
     * @param maxDepth
     *            A negative <code>maxDepth</code> means no depth limit, zero means the checking of the initial state.
     */
    public DepthFirstStrategy(int maxDepth) {
        if (maxDepth < 0) {
            this.maxDepth = Integer.MAX_VALUE;
        } else {
            this.maxDepth = maxDepth;
        }
    }

    /**
     * If called, the algorithm will not backtrack after the hard objectives are fulfilled, instead it goes deeper in
     * the search space.
     */
    public DepthFirstStrategy continueIfHardObjectivesFulfilled() {
        backTrackIfSolution = false;
        return this;
    }

    @Override
    public void initStrategy(ThreadContext context) {
        this.context = context;

        if (context.getSharedObject() == null) {
            context.setSharedObject(new Object());
            logger.info("Depth-first exploration strategy is initied.");
            startThreads();
        }
        
    }

    private void startThreads() {
        context.startAllThreads(() -> new DepthFirstStrategy(maxDepth));
    }

    @Override
    public void explore() {

        mainloop: do {

            boolean globalConstraintsAreSatisfied = context.checkGlobalConstraints();
            if (!globalConstraintsAreSatisfied) {
                boolean isSuccessfulUndo = context.backtrack();
                if (!isSuccessfulUndo) {
                    logger.info("Global contraint is not satisifed and cannot backtrack.");
                    break;
                } else {
                    logger.debug("Global contraint is not satisifed, backtrack.");
                    continue;
                }
            }
            
            Fitness fitness = context.calculateFitness();
            if (fitness.isSatisifiesHardObjectives()) {
                context.newSolution();
                if (backTrackIfSolution) {
                    boolean isSuccessfulUndo = context.backtrack();
                    if (!isSuccessfulUndo) {
                        logger.info("Found a solution but cannot backtrack.");
                        break;
                    } else {
                        logger.debug("Found a solution, backtrack.");
                        continue;
                    }
                }
            }

            if (context.getDepth() >= maxDepth) {
                boolean isSuccessfulUndo = context.backtrack();
                if (!isSuccessfulUndo) {
                    logger.info("Reached max depth but cannot bactrack.");
                    break;
                } else {
                    logger.debug("Reached max depth, bactrack.");
                    continue;
                }
            }
            
            if (isInterrupted.get()) {
                logger.info("Interrupted, stop exploration.");
                break;
            }

            Object activationId = null;
            Collection<Object> activationIds;

            do {
                activationIds = context.getUntraversedActivationIds();
                if (activationIds.isEmpty()) {
                    boolean isSuccessfulUndo = context.backtrack();
                    if (!isSuccessfulUndo) {
                        logger.info("No more transitions from current state and cannot backtrack.");
                        break mainloop;
                    } else {
                        logger.debug("No more transitions from current state, backtrack.");
                        continue;
                    }
                } 
            } while (activationIds.isEmpty());

            int index = random.nextInt(activationIds.size());
            
            Iterator<Object> iterator = activationIds.iterator();
            while (index-- > 0) {
                iterator.next();
            }
            activationId = iterator.next();
                
            context.executeAcitvationId(activationId);

            boolean loopInTrajectory = context.isCurrentStateInTrajectory();
            if (loopInTrajectory) {
                boolean isSuccessfulUndo = context.backtrack();
                if (!isSuccessfulUndo) {
                    throw new DSEException("The new state is present in the trajectoy but cannot bactkrack. Should never happen!");
                } else {
                    logger.info("The new state is already visited in the trajectory, backtrack.");
                }
            }
            
        } while (true);
        
        logger.info("Terminated.");
    }

    @Override
    public void interruptStrategy() {
        isInterrupted.set(true);
    }

}
