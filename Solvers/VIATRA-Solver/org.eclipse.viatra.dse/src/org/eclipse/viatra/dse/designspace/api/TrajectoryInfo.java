/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.designspace.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

public class TrajectoryInfo {

    private final List<Object> trajectory;
    private final List<Object> trajectoryView;
    private final List<BatchTransformationRule<?, ?>> rules;
    private final List<BatchTransformationRule<?, ?>> rulesView;
    private final List<Object> stateIds;
    private final List<Object> stateIdsView;
    private final List<Map<String, Double>> measuredCosts;

    public TrajectoryInfo(Object initialStateId) {
        Objects.requireNonNull(initialStateId);

        stateIds = new ArrayList<>();
        stateIds.add(initialStateId);

        trajectory = new ArrayList<>();
        rules = new ArrayList<>();
        measuredCosts = new ArrayList<>();

        trajectoryView = Collections.unmodifiableList(trajectory);
        stateIdsView = Collections.unmodifiableList(stateIds);
        rulesView = Collections.unmodifiableList(rules);
    }

    /**
     * Copy constructor
     * 
     * @since 0.17
     */
    public TrajectoryInfo(TrajectoryInfo other) {
        this(other.stateIds, other.trajectory, other.rules, other.measuredCosts);
    }
    
    protected TrajectoryInfo(List<Object> stateIds, List<Object> trajectory, List<BatchTransformationRule<?, ?>> rules, List<Map<String, Double>> measuredCosts) {

        this.stateIds = new ArrayList<>(stateIds);
        this.trajectory = new ArrayList<>(trajectory);
        this.rules = new ArrayList<>(rules);
        trajectoryView = Collections.unmodifiableList(trajectory);
        stateIdsView = Collections.unmodifiableList(stateIds);
        rulesView = Collections.unmodifiableList(rules);
        this.measuredCosts = new ArrayList<>(measuredCosts);
    }

    public void addStep(Object activationId, BatchTransformationRule<?, ?> rule, Object newStateId, Map<String, Double> measuredCosts) {
        stateIds.add(newStateId);
        trajectory.add(activationId);
        rules.add(rule);
        this.measuredCosts.add(measuredCosts);
    }

    public void backtrack() {
        int size = trajectory.size();

        if (size == 0) {
            throw new DSEException("Cannot step back any further!");
        }

        trajectory.remove(size - 1);
        rules.remove(size - 1);
        stateIds.remove(size);
        measuredCosts.remove(size - 1);
    }

    public Object getInitialStateId() {
        return stateIds.get(0);
    }

    public Object getCurrentStateId() {
        return stateIds.get(stateIds.size() - 1);
    }

    public Object getLastActivationId() {
        return trajectory.get(trajectory.size() - 1);
    }

    public List<Object> getTrajectory() {
        return trajectoryView;
    }

    public List<Object> getStateTrajectory() {
        return stateIdsView;
    }

    public List<BatchTransformationRule<?, ?>> getRules() {
        return rulesView;
    }

    public int getDepth() {
        return trajectory.size();
    }

    public List<Map<String, Double>> getMeasuredCosts() {
        return measuredCosts;
    }

    public SolutionTrajectory createSolutionTrajectory(final IStateCoderFactory stateCoderFactory, final IBacktrackListener listener) {

        List<Object> activationIds = new ArrayList<>(trajectory);
        List<BatchTransformationRule<?, ?>> copiedRules = new ArrayList<>(rules);

        return new SolutionTrajectory(activationIds, copiedRules, stateCoderFactory, listener);
    }

    public boolean canStepBack() {
        return !trajectory.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Trajectory:\n");
        for (Object activationId : trajectory) {
            sb.append(activationId);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * This method is only used by the {@link DesignSpaceManager}.
     * @param stateCode 
     * @return false if the initial state code is the last one, otherwise true.
     */
    public boolean modifyLastStateCode(Object stateCode) {
        if (stateIds.size() == 1) {
            return false;
        }
        stateIds.set(stateIds.size() - 1, stateCode);
        return true;
    }
}
