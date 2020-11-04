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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

import com.google.common.collect.Lists;

/**
 * Works as {@link DepthFirstStrategy} but:
 * <ul>
 * <li>works only with single thread,</li>
 * <li>in a given state, it only traverses the activations with locally the highest priority.</li>
 * </ul>
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class FixedPriorityStrategy implements IStrategy {

    private int maxDepth = Integer.MAX_VALUE;
    private AtomicBoolean isInterrupted = new AtomicBoolean(false);
    private ThreadContext context;

    private Logger logger = Logger.getLogger(IStrategy.class);
    private Map<BatchTransformationRule<?, ?>, Integer> priorities = new HashMap<BatchTransformationRule<?, ?>, Integer>();

    private Random random = new Random();
    private Map<Object, List<Object>> bestPriorityInState = new HashMap<>();

    /**
     * Adds a depth limit to the strategy.
     * 
     * @param depthLimit
     *            The depth limit.
     * @return The actual instance to enable a builder pattern like usage.
     */
    public FixedPriorityStrategy withDepthLimit(int maxDepth) {
        if (maxDepth < 0) {
            this.maxDepth = Integer.MAX_VALUE;
        } else {
            this.maxDepth = maxDepth;
        }
        return this;
    }

    /**
     * Assigns a priority to a rule. Unassigned rule will have a priority of 0.
     * 
     * @param rule
     *            The transformation rule.
     * @param priority
     *            The priority of the rule. Higher is better.
     * @return The actual instance to enable a builder pattern like usage.
     */
    public FixedPriorityStrategy withRulePriority(BatchTransformationRule<?, ?> rule, int priority) {
        priorities.put(rule, priority);
        return this;
    }

    public Map<BatchTransformationRule<?, ?>, Integer> getPriorities() {
        return priorities;
    }

    @Override
    public void initStrategy(ThreadContext context) {
        this.context = context;

        logger.info("Fixed priority exploration strategy is initied.");
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
                boolean isSuccessfulUndo = context.backtrack();
                if (!isSuccessfulUndo) {
                    logger.info("Found a solution but cannot backtrack.");
                    break;
                } else {
                    logger.debug("Found a solution, backtrack.");
                    continue;
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

            List<Object> transitions;

            do {

                transitions = bestPriorityInState.get(context.getCurrentStateId());

                if (transitions == null) {
                    Integer bestPriority = getBestPriority(context.getCurrentActivationIds());
                    transitions = Lists.newArrayList();
                    for (Object iTransition : context.getCurrentActivationIds()) {
                        Integer integer = priorities.get(context.getRuleByActivationId(iTransition));
                        if (integer == null) {
                            integer = Integer.valueOf(0);
                        }
                        if (integer.equals(bestPriority)) {
                            transitions.add(iTransition);
                        }
                    }
                    bestPriorityInState.put(context.getCurrentStateId(), transitions);
                }

                if (transitions.isEmpty()) {
                    boolean isSuccessfulUndo = context.backtrack();
                    if (!isSuccessfulUndo) {
                        logger.info("No more transitions from current state and cannot backtrack.");
                        break mainloop;
                    } else {
                        logger.debug("No more transitions from current state, backtrack.");
                        continue;
                    }
                }
            } while (transitions.isEmpty());

            int index = random.nextInt(transitions.size());
            Object transition = transitions.remove(index);

            context.executeAcitvationId(transition);

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

        } while (true);

        logger.info("Terminated.");
    }

    @Override
    public void interruptStrategy() {
        isInterrupted.set(true);
    }

    private Integer getBestPriority(Collection<? extends Object> transitions) {
        Integer bestPriority = Integer.MIN_VALUE;
        for (Object iTransition : transitions) {
            Integer priority = priorities.get(context.getRuleByActivationId(iTransition));
            if (priority == null) {
                priority = Integer.valueOf(0);
            }
            if (priority > bestPriority) {
                bestPriority = priority;
            }
        }
        return bestPriority;
    }
}
