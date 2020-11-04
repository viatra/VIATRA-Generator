/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy, Zoltan Ujhelyi and Daniel Varro
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

import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IObjective;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * This objective serves as soft and as hard objective at the same time by defining two lists of VIATRA Query
 * specifications.
 * 
 * As a soft objective, it collects a list of VIATRA Query specifications, which have predefined weights. Then the
 * fitness value of an arbitrary solution is calculated in the following way:
 * <p>
 * <code>fitness = sum( pattern[i].countMatches() * weight[i] )</code>
 * <p>
 * As a hard objective it collects a separate list of VIATRA Query specifications. If every one of them has a match the
 * hard constraint is considered to be fulfilled.
 * 
 * @author Andras Szabolcs Nagy
 * @see IObjective
 *
 */
public class ConstraintsObjective extends BaseObjective {

    public static final String DEFAULT_NAME = "ConstraintsObjective";

    public static class QueryConstraint {
        public final String name;
        public final IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> query;
        public final Double weight;
        public final ModelQueryType type;

        public QueryConstraint(String name,
                IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> query, Double weight,
                ModelQueryType type) {
            this.name = name;
            this.query = query;
            this.weight = weight;
            this.type = type;
        }

        public QueryConstraint(String name,
                IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> query, Double weight) {
            this(name, query, weight, ModelQueryType.MUST_HAVE_MATCH);
        }

        public QueryConstraint(String name,
                IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> query, ModelQueryType type) {
            this(name, query, 0d, type);
        }
    }

    protected List<QueryConstraint> softConstraints;
    protected List<QueryConstraint> hardConstraints;

    protected List<ViatraQueryMatcher<? extends IPatternMatch>> softMatchers;
    protected List<ViatraQueryMatcher<? extends IPatternMatch>> hardMatchers;
    protected List<Integer> softMatches;
    protected List<Integer> hardMatches;

    public ConstraintsObjective(String name, List<QueryConstraint> softConstraints,
            List<QueryConstraint> hardConstraints) {
        super(name);
        Objects.requireNonNull(softConstraints, "The list of soft constraints cannot be null.");
        Objects.requireNonNull(hardConstraints, "The list of hard constraints cannot be null.");

        this.softConstraints = softConstraints;
        this.hardConstraints = hardConstraints;
    }

    public ConstraintsObjective(String name, List<QueryConstraint> hardConstraints) {
        this(name, new ArrayList<QueryConstraint>(), hardConstraints);
    }

    public ConstraintsObjective(List<QueryConstraint> hardConstraints) {
        this(DEFAULT_NAME, new ArrayList<QueryConstraint>(), hardConstraints);
    }

    public ConstraintsObjective(String name) {
        this(name, new ArrayList<QueryConstraint>(), new ArrayList<QueryConstraint>());
    }

    public ConstraintsObjective() {
        this(DEFAULT_NAME, new ArrayList<QueryConstraint>(), new ArrayList<QueryConstraint>());
    }

    /**
     * Adds a new soft constraint.
     * 
     * @param name
     *            A name for the soft constraint.
     * @param softConstraint
     *            A VIATRA Query pattern specification.
     * @param weight
     *            The weight of the pattern.
     * @return The actual instance to enable builder pattern like usage.
     */
    public ConstraintsObjective withSoftConstraint(String name,
            IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> softConstraint, double weight) {
        softConstraints.add(new QueryConstraint(name, softConstraint, weight));
        return this;
    }

    /**
     * Adds a new soft constraint with the name of the query specification's fully qualified name.
     * 
     * @param softConstraint
     *            A VIATRA Query pattern specification.
     * @param weight
     *            The weight of the pattern.
     * @return The actual instance to enable builder pattern like usage.
     */
    public ConstraintsObjective withSoftConstraint(
            IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> softConstraint, double weight) {
        return withSoftConstraint(softConstraint.getFullyQualifiedName(), softConstraint, weight);
    }

    /**
     * Adds a new hard constraint.
     * 
     * @param name
     *            A name for the hard constraint.
     * @param softConstraint
     *            A VIATRA Query pattern specification.
     * @param type
     *            {@link ModelQueryType}, which determines whether the constraint should have at least one match or none
     *            at all.
     * @return The actual instance to enable builder pattern like usage.
     */
    public ConstraintsObjective withHardConstraint(String name,
            IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hardConstraint,
            ModelQueryType type) {
        hardConstraints.add(new QueryConstraint(name, hardConstraint, type));
        return this;
    }

    /**
     * Adds a new hard constraint with the default {@link ModelQueryType#MUST_HAVE_MATCH}.
     * 
     * @param name
     *            A name for the hard constraint.
     * @param softConstraint
     *            A VIATRA Query pattern specification.
     * @return The actual instance to enable builder pattern like usage.
     */
    public ConstraintsObjective withHardConstraint(String name,
            IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hardConstraint) {
        hardConstraints.add(new QueryConstraint(name, hardConstraint, ModelQueryType.MUST_HAVE_MATCH));
        return this;
    }

    /**
     * Adds a new hard constraint with the name of the query specification's fully qualified name and the default
     * {@link ModelQueryType#MUST_HAVE_MATCH}.
     * 
     * @param softConstraint
     *            A VIATRA Query pattern specification.
     * @return The actual instance to enable builder pattern like usage.
     */
    public ConstraintsObjective withHardConstraint(
            IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hardConstraint) {
        return withHardConstraint(hardConstraint.getFullyQualifiedName(), hardConstraint,
                ModelQueryType.MUST_HAVE_MATCH);
    }

    /**
     * Adds a new hard constraint with the name of the query specification's fully qualified name.
     * 
     * @param softConstraint
     *            A VIATRA Query pattern specification.
     * @param type
     *            {@link ModelQueryType}, which determines whether the constraint should have at least one match or none
     *            at all.
     * @return The actual instance to enable builder pattern like usage.
     */
    public ConstraintsObjective withHardConstraint(
            IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hardConstraint,
            ModelQueryType type) {
        return withHardConstraint(hardConstraint.getFullyQualifiedName(), hardConstraint, type);
    }

    @Override
    public Double getFitness(ThreadContext context) {

        if (softConstraints.isEmpty()) {
            return 0d;
        }

        double result = 0;

        for (int i = 0; i < softConstraints.size(); i++) {
            int countMatches = softMatchers.get(i).countMatches();
            result += countMatches * softConstraints.get(i).weight;
            softMatches.set(i, Integer.valueOf(countMatches));
        }

        return result;
    }

    @Override
    public void init(ThreadContext context) {

        super.init(context);

        softMatches = new ArrayList<Integer>(softConstraints.size());
        softMatchers = new ArrayList<ViatraQueryMatcher<? extends IPatternMatch>>(softConstraints.size());
        hardMatches = new ArrayList<Integer>(hardConstraints.size());
        hardMatchers = new ArrayList<ViatraQueryMatcher<? extends IPatternMatch>>(hardConstraints.size());
        for (int i = 0; i < softConstraints.size(); i++) {
            softMatches.add(0);
        }
        for (int i = 0; i < hardConstraints.size(); i++) {
            hardMatches.add(0);
        }

        try {
            ViatraQueryEngine queryEngine = context.getQueryEngine();

            for (QueryConstraint qc : softConstraints) {
                softMatchers.add(qc.query.getMatcher(queryEngine));
            }

            for (QueryConstraint qc : hardConstraints) {
                hardMatchers.add(qc.query.getMatcher(queryEngine));
            }

        } catch (ViatraQueryException e) {
            throw new DSEException("Couldn't initialize the VIATRA Query matcher, see inner exception", e);
        }
    }

    @Override
    public IObjective createNew() {
        new ArrayList<Double>(softConstraints.size());
        ConstraintsObjective result = new ConstraintsObjective(name, softConstraints, hardConstraints);
        if (isThereFitnessConstraint) {
            result.withHardConstraintOnFitness(fitnessConstraint, fitnessConstraintComparator);
        }
        return result.withComparator(comparator).withLevel(level);
    }

    @Override
    public boolean isHardObjective() {
        return !hardConstraints.isEmpty() || super.isHardObjective();
    }

    @Override
    public boolean satisifiesHardObjective(Double fitness) {

        boolean result = true;

        for (int i = 0; i < hardConstraints.size(); i++) {
            ModelQueryType type = hardConstraints.get(i).type;
            int countMatches = hardMatchers.get(i).countMatches();
            hardMatches.set(i, Integer.valueOf(countMatches));
            if ((type.equals(ModelQueryType.MUST_HAVE_MATCH) && countMatches <= 0)
                    || (type.equals(ModelQueryType.NO_MATCH) && countMatches > 0)) {
                result = false;
            }
        }
        
        result = super.satisifiesHardObjective(fitness) ? result : false;
        
        return result;
    }

    public List<QueryConstraint> getSoftConstraints() {
        return softConstraints;
    }

    public List<QueryConstraint> getHardConstraints() {
        return hardConstraints;
    }

    public String getSoftName(int index) {
        return softConstraints.get(index).name;
    }

    public String getHardName(int index) {
        return hardConstraints.get(index).name;
    }

    public List<Integer> getSoftMatches() {
        return softMatches;
    }

    public List<Integer> getHardMatches() {
        return hardMatches;
    }

    public List<String> getSoftNames() {
        List<String> softNames = new ArrayList<>(softConstraints.size());
        for (QueryConstraint qc : softConstraints) {
            softNames.add(qc.name);
        }
        return softNames;
    }

}
