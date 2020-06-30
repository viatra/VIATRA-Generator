/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.objectives.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.designspace.api.TrajectoryInfo;
import org.eclipse.viatra.dse.objectives.ActivationFitnessProcessor;
import org.eclipse.viatra.dse.objectives.Comparators;
import org.eclipse.viatra.dse.objectives.IObjective;
import org.eclipse.viatra.query.runtime.matchers.util.Preconditions;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

/**
 * This soft objective calculates a fitness value based on the length of the trajectory. Costs to the rules can be
 * assigned.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class TrajectoryCostSoftObjective extends BaseObjective {

    public static final String DEFAULT_NAME = "TrajectoryCostObjective";
    protected Map<BatchTransformationRule<?, ?>, Double> fixCosts;
    protected Map<BatchTransformationRule<?, ?>, ActivationFitnessProcessor> activationCostProcessors;
    protected double trajectoryLengthWeight = 0.0;
    protected boolean calculateTrajectoryLengthWeight;

    public TrajectoryCostSoftObjective(String name) {
        super(name);
        comparator = Comparators.LOWER_IS_BETTER;
    }

    public TrajectoryCostSoftObjective() {
        this(DEFAULT_NAME);
    }

    /**
     * Sets the cost of a rule.
     * 
     * @param rule
     * @param cost
     * @return The actual instance to enable builder pattern like usage.
     */
    public TrajectoryCostSoftObjective withRuleCost(BatchTransformationRule<?, ?> rule, double cost) {
        Objects.requireNonNull(rule);
        if (fixCosts == null) {
            fixCosts = new HashMap<BatchTransformationRule<?, ?>, Double>();
        }
        Preconditions.checkArgument(!fixCosts.containsKey(rule));
        fixCosts.put(rule, cost);
        return this;
    }

    /**
     * Sets an activation processor for a rule.
     * 
     * @param rule
     * @param activationCostProcessor
     * @return The actual instance to enable builder pattern like usage.
     */
    public TrajectoryCostSoftObjective withActivationCost(BatchTransformationRule<?, ?> rule,
            ActivationFitnessProcessor activationCostProcessor) {
        Objects.requireNonNull(rule);
        Objects.requireNonNull(activationCostProcessor);
        if (activationCostProcessors == null) {
            activationCostProcessors = new HashMap<BatchTransformationRule<?, ?>, ActivationFitnessProcessor>();
        }
        Preconditions.checkArgument(!activationCostProcessors.containsKey(rule));
        activationCostProcessors.put(rule, activationCostProcessor);
        return this;
    }

    /**
     * The length of the trajectory multiplied with given parameter will be added to the fitness value.
     * 
     * @param trajectoryLengthWeight
     *            The weight of a transformation rule application.
     * @return The actual instance to enable builder pattern like usage.
     */
    public TrajectoryCostSoftObjective withTrajectoryLengthWeight(double trajectoryLengthWeight) {
        this.trajectoryLengthWeight = trajectoryLengthWeight;
        this.calculateTrajectoryLengthWeight = true;
        return this;
    }

    @Override
    public Double getFitness(ThreadContext context) {

        DesignSpaceManager dsm = context.getDesignSpaceManager();
        TrajectoryInfo trajectoryInfo = dsm.getTrajectoryInfo();
        List<Object> trajectory = trajectoryInfo.getTrajectory();
        List<BatchTransformationRule<?, ?>> rules = trajectoryInfo.getRules();

        double result = 0;

        for (int i = 0; i < trajectory.size(); i++) {
            BatchTransformationRule<?, ?> rule = rules.get(i);

            Double cost = fixCosts.get(rule);
            if (cost != null) {
                result += cost;
            }

            Map<String, Double> costs = trajectoryInfo.getMeasuredCosts().get(i);
            if (costs != null) {
                cost = costs.get(name);
                if (cost != null) {
                    result += cost;
                }
            }
        }

        if (calculateTrajectoryLengthWeight) {
            result += trajectory.size() * trajectoryLengthWeight;
        }

        return result;
    }

    @Override
    public void init(ThreadContext context) {
        super.init(context);
        DesignSpaceManager dsm = context.getDesignSpaceManager();
        if (activationCostProcessors != null) {
            for (Entry<BatchTransformationRule<?, ?>, ActivationFitnessProcessor> entry : activationCostProcessors.entrySet()) {
                dsm.registerActivationCostProcessor(name, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public IObjective createNew() {
        return this;
    }
}
