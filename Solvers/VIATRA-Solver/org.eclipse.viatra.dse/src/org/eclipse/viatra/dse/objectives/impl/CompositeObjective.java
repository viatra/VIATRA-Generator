/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.objectives.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IObjective;
import org.eclipse.viatra.query.runtime.matchers.util.Preconditions;

/**
 * This objective collects a list of other objectives. It returns the weighted sum of the objectives.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class CompositeObjective extends BaseObjective {

    public static final String DEFAULT_NAME = "CompositeObjective";
    protected List<IObjective> objectives;
    protected List<Double> weights;
    protected boolean hardObjective;

    public CompositeObjective(String name, List<IObjective> objectives, List<Double> weights) {
        super(name);
        Objects.requireNonNull(objectives, "The list of objectives cannot be null.");
        Objects.requireNonNull(weights, "The list of weights cannot be null.");
        Preconditions.checkState(objectives.size() == weights.size(), "The size of the objectives and weights must match.");
        this.objectives = objectives;
        this.weights = weights;
    }

    public CompositeObjective(List<IObjective> objectives, List<Double> weights) {
        this(DEFAULT_NAME, objectives, weights);
    }

    public CompositeObjective(String name) {
        this(name, new ArrayList<IObjective>(), new ArrayList<Double>());
    }

    public CompositeObjective() {
        this(DEFAULT_NAME, new ArrayList<IObjective>(), new ArrayList<Double>());
    }

    /**
     * Adds a new objective.
     * 
     * @param objective
     * @return The actual instance to enable builder pattern like usage.
     */
    public CompositeObjective withObjective(IObjective objective) {
        objectives.add(objective);
        weights.add(1d);
        return this;
    }

    /**
     * Adds a new objective.
     * 
     * @param objective
     * @return The actual instance to enable builder pattern like usage.
     */
    public CompositeObjective withObjective(IObjective objective, double weight) {
        objectives.add(objective);
        weights.add(weight);
        return this;
    }

    @Override
    public Double getFitness(ThreadContext context) {

        double result = 0;

        for (int i = 0; i < objectives.size(); i++) {
            IObjective objective = objectives.get(i);
            Double weight = weights.get(i);
            result += objective.getFitness(context) * weight;
        }
        return result;
    }

    @Override
    public void init(ThreadContext context) {
        super.init(context);
        hardObjective = false;
        for (IObjective objective : objectives) {
            objective.init(context);
            if (objective.isHardObjective()) {
                hardObjective = true;
            }
        }
    }

    @Override
    public IObjective createNew() {

        List<IObjective> newObjectives = new ArrayList<IObjective>();

        for (IObjective objective : objectives) {
            newObjectives.add(objective.createNew());
        }

        CompositeObjective objective = new CompositeObjective(name, newObjectives, weights);
        if (isThereFitnessConstraint) {
            objective.withHardConstraintOnFitness(fitnessConstraint, fitnessConstraintComparator);
        }

        return objective.withComparator(comparator).withLevel(level);
    }

    @Override
    public boolean isHardObjective() {
        return hardObjective;
    }

    @Override
    public boolean satisifiesHardObjective(Double fitness) {

        boolean hardObjectiveSatisfied = true;

        for (IObjective objective : objectives) {
            hardObjectiveSatisfied = objective.satisifiesHardObjective(fitness) ? hardObjectiveSatisfied : false;
        }

        hardObjectiveSatisfied = super.satisifiesHardObjective(fitness) ? hardObjectiveSatisfied : false;

        return hardObjectiveSatisfied;
    }
}
