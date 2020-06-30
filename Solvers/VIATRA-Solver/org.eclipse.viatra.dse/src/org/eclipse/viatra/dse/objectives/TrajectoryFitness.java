/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.objectives;

import java.util.Arrays;
import java.util.List;

import org.eclipse.viatra.dse.designspace.api.TrajectoryInfo;

/**
 * This class represents a trajectory and its fitness.
 * @author Andras Szabolcs Nagy
 *
 */
public class TrajectoryFitness {

    public Object[] trajectory;
    public Fitness fitness;

    public int rank;
    public double crowdingDistance;

    private int hash;
    
    public int survive;

    /**
     * Creates a {@link TrajectoryFitness} with the full trajectory.
     * @param trajectory The trajectory.
     * @param fitness The fitness.
     */
    public TrajectoryFitness(Object[] trajectory, Fitness fitness) {
        this.fitness = fitness;
        this.trajectory = trajectory;
    }

    /**
     * Creates a {@link TrajectoryFitness} with the full trajectory.
     * @param trajectoryInfo The trajectory.
     * @param fitness The fitness.
     */
    public TrajectoryFitness(TrajectoryInfo trajectoryInfo, Fitness fitness) {
        this.fitness = fitness;
        List<Object> fullTraj = trajectoryInfo.getTrajectory();
        trajectory = fullTraj.toArray(new Object[fullTraj.size()]);
    }

    /**
     * Creates a {@link TrajectoryFitness} with the given activation id}
     * @param transition The transition.
     * @param fitness The fitness.
     */
    public TrajectoryFitness(Object transition, Fitness fitness) {
        this.fitness = fitness;
        trajectory = new Object[] {transition};
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TrajectoryFitness) {
            return Arrays.equals(trajectory, ((TrajectoryFitness) obj).trajectory);
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (hash == 0 && trajectory.length > 0) {
            hash = Arrays.hashCode(trajectory);
        }
        return hash;
    }

    @Override
    public String toString() {
        return Arrays.toString(trajectory) + fitness.toString();
    }
}
