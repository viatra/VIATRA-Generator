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

import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IGlobalConstraint;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

/**
 * This global constraint collects a list of VIATRA Query pattern and checks if any of them has a match on along a trajectory.
 * If any of the patterns has a match then it is unsatisfied and the exploration should backtrack.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class ModelQueriesGlobalConstraint implements IGlobalConstraint {

    public static final String GLOBAL_CONSTRAINT = "GlobalConstraint";
    protected String name;
    protected List<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> constraints;
    protected List<ViatraQueryMatcher<? extends IPatternMatch>> matchers = new ArrayList<ViatraQueryMatcher<? extends IPatternMatch>>();
    protected ModelQueryType type = ModelQueryType.NO_MATCH;

    public ModelQueriesGlobalConstraint(String name,
            List<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> constraints) {
        Objects.requireNonNull(name, "Name of the global constraint cannot be null.");
        Objects.requireNonNull(constraints, "The list of constraints cannot be null.");

        this.name = name;
        this.constraints = constraints;
    }

    public ModelQueriesGlobalConstraint(
            List<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> constraints) {
        this(GLOBAL_CONSTRAINT, constraints);
    }

    public ModelQueriesGlobalConstraint(String name) {
        this(name, new ArrayList<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>());
    }

    public ModelQueriesGlobalConstraint() {
        this(GLOBAL_CONSTRAINT,
                new ArrayList<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>());
    }

    /**
     * Adds a new VIATRA Query pattern.
     * 
     * @param constraint
     *            A VIATRA Query pattern.
     * @return The actual instance to enable builder pattern like usage.
     */
    public ModelQueriesGlobalConstraint withConstraint(
            IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> constraint) {
        constraints.add(constraint);
        return this;
    }

    public ModelQueriesGlobalConstraint withType(ModelQueryType type) {
        this.type = type;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean checkGlobalConstraint(ThreadContext context) {
        for (ViatraQueryMatcher<? extends IPatternMatch> matcher : matchers) {
            if ((type.equals(ModelQueryType.NO_MATCH) && matcher.countMatches() > 0)
                    || (type.equals(ModelQueryType.MUST_HAVE_MATCH) && matcher.countMatches() == 0)) {
//            	System.out.println(type + " " + matcher.countMatches());
//            	System.out.println(matcher.getSpecification().getSimpleName());
                return false;
            }
        }
        return true;
    }

    @Override
    public void init(ThreadContext context) {
        try {
            ViatraQueryEngine queryEngine = context.getQueryEngine();

            for (IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification : constraints) {
                ViatraQueryMatcher<? extends IPatternMatch> matcher = querySpecification.getMatcher(queryEngine);
                matchers.add(matcher);
            }

        } catch (ViatraQueryException e) {
        throw new DSEException("Couldn't get the VIATRA Query matcher, see inner exception", e);
        }
    }

    @Override
    public IGlobalConstraint createNew() {
        return new ModelQueriesGlobalConstraint(name, constraints);
    }

}
