/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api.strategy.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.objectives.ObjectiveComparatorHelper;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;

/**
 * This exploration strategy eventually explorers the whole design space but goes in the most promising directions
 * first, based on the {@link Fitness}.
 * 
 * There are a few parameter to tune such as
 * <ul>
 * <li>maximum depth</li>
 * <li>continue the exploration from a state that satisfies the hard objectives (the default that it will
 * backtrack),</li>
 * <li>whether to continue the exploration from the newly explored state if it is at least equally good than the
 * previous one or only if it is better (default is "at least equally good").</li>
 * </ul>
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class BestFirstStrategy implements IStrategy {

    private ThreadContext context;
    private SolutionStore solutionStore;

    private int maxDepth;
    private boolean isInterrupted = false;
    private boolean backTrackIfSolution = true;
    private boolean onlyBetterFirst = false;

    private PriorityQueue<TrajectoryWithFitness> trajectoiresToExplore;
    private Logger logger = Logger.getLogger(IStrategy.class);

    private static class TrajectoryWithFitness {

        public Object[] trajectory;
        public Fitness fitness;

        public TrajectoryWithFitness(Object[] trajectory, Fitness fitness) {
            super();
            this.trajectory = trajectory;
            this.fitness = fitness;
        }

        @Override
        public String toString() {
            return Arrays.toString(trajectory) + fitness.toString();
        }

    }

    /**
     * Creates a new best-first search algorithm without depth limit.
     */
    public BestFirstStrategy() {
        this(-1);
    }

    /**
     * Creates a new best-first search algorithm with depth limit.
     * 
     * @param maxDepth
     *            A negative <code>maxDepth</code> means no depth limit, zero means the checking of the initial state.
     */
    public BestFirstStrategy(int maxDepth) {
        if (maxDepth < 0) {
            this.maxDepth = Integer.MAX_VALUE;
        } else {
            this.maxDepth = maxDepth;
        }
    }

    public BestFirstStrategy continueIfHardObjectivesFulfilled() {
        backTrackIfSolution = false;
        return this;
    }

    public BestFirstStrategy goOnOnlyIfFitnessIsBetter() {
        onlyBetterFirst = true;
        return this;
    }

    @Override
    public void initStrategy(ThreadContext context) {
        this.context = context;
        this.solutionStore = context.getGlobalContext().getSolutionStore();
        final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();

        trajectoiresToExplore = new PriorityQueue<TrajectoryWithFitness>(11,
                (o1, o2) -> objectiveComparatorHelper.compare(o2.fitness, o1.fitness));
    }

    @Override
    public void explore() {
        final ObjectiveComparatorHelper objectiveComparatorHelper = context.getObjectiveComparatorHelper();

        boolean globalConstraintsAreSatisfied = context.checkGlobalConstraints();
        if (!globalConstraintsAreSatisfied) {
            logger.info("Global contraint is not satisifed in the first state. Terminate.");
            return;
        }

        final Fitness firstFittness = context.calculateFitness();
        if (firstFittness.isSatisifiesHardObjectives()) {
            context.newSolution();
            logger.info("First state is a solution. Terminate.");
            return;
        }

        if (maxDepth == 0) {
            return;
        }

        final Object[] firstTrajectory = context.getTrajectory().toArray(new Object[0]);
        TrajectoryWithFitness currentTrajectoryWithFittness = new TrajectoryWithFitness(firstTrajectory, firstFittness);
        trajectoiresToExplore.add(currentTrajectoryWithFittness);

        mainLoop: while (!isInterrupted) {

            if (currentTrajectoryWithFittness == null) {
                if (trajectoiresToExplore.isEmpty()) {
                    logger.debug("State space is fully traversed.");
                    return;
                } else {
                    currentTrajectoryWithFittness = trajectoiresToExplore.element();
                    if (logger.isDebugEnabled()) {
                        logger.debug("New trajectory is chosen: " + currentTrajectoryWithFittness);
                    }
                    context.getDesignSpaceManager().executeTrajectoryWithMinimalBacktrackWithoutStateCoding(currentTrajectoryWithFittness.trajectory);
                }
            }

            Collection<Object> activationIds = context.getUntraversedActivationIds();
            Iterator<Object> iterator = activationIds.iterator();

            while (!isInterrupted && iterator.hasNext()) {
                final Object nextActivation = iterator.next();
                if (!iterator.hasNext()) {
                    logger.debug("Last untraversed activation of the state.");
                    trajectoiresToExplore.remove(currentTrajectoryWithFittness);
                }

                if (logger.isDebugEnabled()) {
                    logger.debug("Executing new activation: " + nextActivation);
                }
                context.executeAcitvationId(nextActivation);
                if (context.isCurrentStateAlreadyTraversed()) {
                    logger.info("The new state is already visited.");
                    context.backtrack();
                } else if (!context.checkGlobalConstraints()) {
                    logger.debug("Global contraint is not satisifed.");
                    context.backtrack();
                } else {
                    final Fitness nextFitness = context.calculateFitness();
                    if (nextFitness.isSatisifiesHardObjectives()) {
                        solutionStore.newSolution(context);
                        logger.debug("Found a solution.");
                        if (backTrackIfSolution) {
                            context.backtrack();
                            continue;
                        }
                    }
                    if (context.getDepth() >= maxDepth) {
                        logger.debug("Reached max depth.");
                        context.backtrack();
                        continue;
                    }

                    TrajectoryWithFitness nextTrajectoryWithFittness = new TrajectoryWithFitness(
                            context.getTrajectory().toArray(), nextFitness);
                    trajectoiresToExplore.add(nextTrajectoryWithFittness);

                    int compare = objectiveComparatorHelper.compare(currentTrajectoryWithFittness.fitness,
                            nextTrajectoryWithFittness.fitness);
                    if (compare < 0) {
                        logger.debug("Better fitness, moving on: " + nextFitness);
                        currentTrajectoryWithFittness = nextTrajectoryWithFittness;
                        continue mainLoop;
                    } else if (compare == 0) {
                        if (onlyBetterFirst) {
                            logger.debug("Equally good fitness, backtrack: " + nextFitness);
                            context.backtrack();
                            continue;
                        } else {
                            logger.debug("Equally good fitness, moving on: " + nextFitness);
                            currentTrajectoryWithFittness = nextTrajectoryWithFittness;
                            continue mainLoop;
                        }
                    } else {
                        logger.debug("Worse fitness.");
                        currentTrajectoryWithFittness = null;
                        continue mainLoop;
                    }
                }
            }

            logger.debug("State is fully traversed.");
            trajectoiresToExplore.remove(currentTrajectoryWithFittness);
            currentTrajectoryWithFittness = null;

        }
        logger.info("Interrupted.");
    }

    @Override
    public void interruptStrategy() {
        isInterrupted = true;
    }

}
