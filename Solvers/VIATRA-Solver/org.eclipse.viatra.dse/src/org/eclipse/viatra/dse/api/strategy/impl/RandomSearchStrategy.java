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
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.GlobalContext;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.designspace.api.TrajectoryInfo;
import org.eclipse.viatra.dse.objectives.Fitness;

public class RandomSearchStrategy implements IStrategy {

    private static class SharedData {
        public final AtomicInteger triesLeft;
        public final int minDepth;
        public final int maxDepth;

        public SharedData(int minDepth, int maxDepth, int numberOfTries) {
            this.minDepth = minDepth;
            this.maxDepth = maxDepth;
            this.triesLeft = new AtomicInteger(numberOfTries);
        }
    }

    private int maxDepth = -1;
    private Random rnd = new Random();
    private SharedData shared;
    private TrajectoryInfo trajectoryInfo;
    int nth;
    private ThreadContext context;
    private AtomicBoolean isInterrupted = new AtomicBoolean(false);
    private Logger logger = Logger.getLogger(IStrategy.class);

    public RandomSearchStrategy(int minDepth, int maxDepth, int numberOfTries) {
        shared = new SharedData(minDepth, maxDepth, numberOfTries);
    }

    private RandomSearchStrategy() {
    }

    @Override
    public void initStrategy(ThreadContext context) {
        this.context = context;
        trajectoryInfo = context.getTrajectoryInfo();
        GlobalContext gc = context.getGlobalContext();

        Object sharedObject = gc.getSharedObject();
        if (sharedObject == null) {
            gc.setSharedObject(shared);
            logger.info("Random exploration strategy is initied.");
            startThreads();
        } else {
            shared = (SharedData) sharedObject;
        }

        maxDepth = rnd.nextInt(shared.maxDepth - shared.minDepth) + shared.minDepth;

    }

    @Override
    public void explore() {

        do {

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
                boolean isSuccessfulUndo = context.backtrack();
                if (!isSuccessfulUndo) {
                    logger.info("Found a solution but cannot backtrack.");
                    break;
                } else {
                    logger.debug("Found a solution, backtrack.");
                    continue;
                }
            }

            if (trajectoryInfo.getDepth() < maxDepth) {

                Collection<Object> transitions = context.getCurrentActivationIds();
                int index = rnd.nextInt(transitions.size());
                Object transition = getByIndex(transitions, index);
                context.executeAcitvationId(transition);

            } else {

                nth = shared.triesLeft.getAndDecrement();
                logger.debug(nth + " tries left");
                if (nth > 0) {

                    context.backtrackUntilRoot();
                    maxDepth = rnd.nextInt(shared.maxDepth - shared.minDepth) + shared.minDepth;

                } else {
                    break;
                }
            }

            boolean loopInTrajectory = context.isCurrentStateInTrajectory();
            if (loopInTrajectory) {
                boolean isSuccessfulUndo = context.backtrack();
                if (!isSuccessfulUndo) {
                    throw new DSEException(
                            "The new state is present in the trajectoy but cannot bactkrack. Should never happen!");
                } else {
                    logger.info("The new state is already visited in the trajectory, backtrack.");
                }
            }

        } while (isInterrupted.get());

        logger.info("Terminated.");
    }

    @Override
    public void interruptStrategy() {
        isInterrupted.set(true);
    }

    private void startThreads() {
        context.startAllThreads(RandomSearchStrategy::new);
    }

    private static Object getByIndex(Collection<Object> availableTransitions, int index) {
        int i = 0;
        Iterator<Object> iterator = availableTransitions.iterator();
        while (iterator.hasNext()) {
            Object transition = iterator.next();
            if (i == index) {
                return transition;
            } else {
                ++i;
            }
        }
        throw new IndexOutOfBoundsException("size: " + availableTransitions.size() + ", index: " + index);
    }
}
