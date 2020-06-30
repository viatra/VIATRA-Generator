/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api.strategy.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.dse.objectives.ObjectiveComparatorHelper;
import org.eclipse.viatra.dse.objectives.TrajectoryFitness;

public class HillClimbingStrategy implements IStrategy {

    private AtomicBoolean isInterrupted = new AtomicBoolean(false);
    private ThreadContext context;

    private Logger logger = Logger.getLogger(IStrategy.class);

    private Random random = new Random();
    private double percentOfOpenedStates;
    private ObjectiveComparatorHelper objectiveComparatorHelper;

    public HillClimbingStrategy() {
        this(2);
    }

    public HillClimbingStrategy(double percentOfOpenedStates) {
        this.percentOfOpenedStates = percentOfOpenedStates;
    }

    @Override
    public void initStrategy(ThreadContext context) {
        this.context = context;
        objectiveComparatorHelper = context.getObjectiveComparatorHelper();
        logger.info("Hill climbing exploration strategy is initied.");
    }

    @Override
    public void explore() {

        boolean globalConstraintsAreSatisfied = context.checkGlobalConstraints();
        if (!globalConstraintsAreSatisfied) {
            boolean isSuccessfulUndo = context.backtrack();
            if (!isSuccessfulUndo) {
                logger.info("Global contraint is not satisifed and cannot backtrack.");
                return;
            }
        }

        mainloop: do {

            Fitness previousFitness = context.calculateFitness();

            logger.debug("Current depth: " + context.getDepth() + " Fitness: " + previousFitness);

            Collection<Object> transitionsFromCurrentState = context.getCurrentActivationIds();

            while (transitionsFromCurrentState.isEmpty()) {
                logger.debug("No transitions from current state: considered as a solution.");
                saveSolutionAndBacktrack();
                continue mainloop;
            }

            ArrayList<Object> transitionsToTry = new ArrayList<>(transitionsFromCurrentState.size());
            for (Object transition : transitionsFromCurrentState) {
                transitionsToTry.add(transition);
            }
            double numberOfTransitionsToTry = transitionsToTry.size() * percentOfOpenedStates;

            for (; numberOfTransitionsToTry > 0 && !transitionsToTry.isEmpty(); numberOfTransitionsToTry--) {
                int index = random.nextInt(transitionsToTry.size());
                Object transition = transitionsToTry.remove(index);

                context.executeAcitvationId(transition);

                if (!context.checkGlobalConstraints()) {
                    logger.debug("Global contraint is not satisifed, backtrack.");
                    context.backtrack();
                    continue;
                }
                if (context.isCurrentStateInTrajectory()) {
                    logger.debug("Current state is in trajectory, backtrack.");
                    context.backtrack();
                    continue;
                }

                Fitness fitness = context.calculateFitness();
                objectiveComparatorHelper.addTrajectoryFitness(
                        new TrajectoryFitness(context.getTrajectoryInfo().getLastActivationId(), fitness));
                context.backtrack();
            }

            if (objectiveComparatorHelper.getTrajectoryFitnesses().isEmpty()) {
                logger.debug("No viable transitions from current state: considered as a solution.");
                saveSolutionAndBacktrack();
                continue;
            }

            TrajectoryFitness randomBestFitness = objectiveComparatorHelper.getRandomBest();
            objectiveComparatorHelper.clearTrajectoryFitnesses();

            int compare = objectiveComparatorHelper.compare(previousFitness, randomBestFitness.fitness);

            if (compare > 0) {
                saveSolutionAndBacktrack();
                continue;
            } else {
                previousFitness = randomBestFitness.fitness;
                Object transition = randomBestFitness.trajectory[randomBestFitness.trajectory.length - 1];
                context.executeAcitvationId(transition);
            }

        } while (!isInterrupted.get());

        logger.info("Terminated.");
    }

    private void saveSolutionAndBacktrack() {
        context.calculateFitness();
        context.newSolution();
        logger.debug("Found solution: " + context.getTrajectoryInfo().toString());
        logger.debug("Backtrack for more solutions, if needed.");
        context.backtrackUntilRoot();
    }

    @Override
    public void interruptStrategy() {
        isInterrupted.set(true);
    }

}
