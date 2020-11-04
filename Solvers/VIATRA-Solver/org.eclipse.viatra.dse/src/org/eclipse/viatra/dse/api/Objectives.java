/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api;

import org.eclipse.viatra.dse.objectives.impl.CompositeObjective;
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective;
import org.eclipse.viatra.dse.objectives.impl.AlwaysSatisfiedDummyHardObjective;
import org.eclipse.viatra.dse.objectives.impl.DepthHardObjective;
import org.eclipse.viatra.dse.objectives.impl.NeverSatisfiedDummyHardObjective;
import org.eclipse.viatra.dse.objectives.impl.NoRuleActivationsHardObjective;
import org.eclipse.viatra.dse.objectives.impl.TrajectoryCostSoftObjective;

/**
 * 
 * Helper class for creating built-in objectives.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class Objectives {

    private Objectives() {
    }

    /**
     * This objective uses VIATRA Queries to calculate fitness and/or goal constraints. Use methods on the returned
     * objective to configure it.
     * 
     * @param name
     * @return The objective.
     * @see ConstraintsObjective
     */
    public static ConstraintsObjective createConstraintsObjective(String name) {
        return new ConstraintsObjective(name);
    }

    /**
     * This objective calculates fitness on the trajectory by adding either fix costs to the rules, or by calculating
     * custom fitness on activation of rules.
     * 
     * @param name
     * @return The objective.
     * @see TrajectoryCostSoftObjective
     */
    public static TrajectoryCostSoftObjective createTrajcetoryCostObjective(String name) {
        return new TrajectoryCostSoftObjective(name);
    }

    /**
     * This objective adds a goal constraint that a solution state should not have any activations.
     * 
     * @return The objective.
     * @see NoRuleActivationsHardObjective
     */
    public static NoRuleActivationsHardObjective createNoRuleActivationsHardConstraint() {
        return new NoRuleActivationsHardObjective();
    }

    /**
     * This objective adds a goal constraint that a solution state should not have any activations.
     * 
     * @param name
     * @return The objective.
     * @see NoRuleActivationsHardObjective
     */
    public static NoRuleActivationsHardObjective createNoRuleActivationsHardConstraint(String name) {
        return new NoRuleActivationsHardObjective(name);
    }

    /**
     * This objective can combine the calculated fitness value of other objectives. Weights are supported.
     * 
     * @param name
     * @return The objective.
     * @see NoRuleActivationsHardObjective
     */
    public static CompositeObjective createCompositeObjective(String name) {
        return new CompositeObjective(name);
    }

    /**
     * This hard objective is fulfilled in any circumstances. Use it if all states should be regarded as a valid
     * solution.
     * 
     * @return The objective.
     * @see AlwaysSatisfiedDummyHardObjective
     */
    public static AlwaysSatisfiedDummyHardObjective createAlwaysSatisfiedDummyHardObjective() {
        return new AlwaysSatisfiedDummyHardObjective();
    }

    /**
     * This hard objective is fulfilled in any circumstances. Use it if all states should be regarded as a valid
     * solution.
     * 
     * @param name
     * @return The objective.
     * @see AlwaysSatisfiedDummyHardObjective
     */
    public static AlwaysSatisfiedDummyHardObjective createDummyHardObjective(String name) {
        return new AlwaysSatisfiedDummyHardObjective(name);
    }

    /**
     * This hard objective is never fulfilled. Use it if all states should be regarded as an invalid solution.
     * 
     * @return The objective.
     * @see AlwaysSatisfiedDummyHardObjective
     */
    public static NeverSatisfiedDummyHardObjective createNeverSatisfiedDummyHardObjective() {
        return new NeverSatisfiedDummyHardObjective();
    }

    /**
     * This hard objective is never fulfilled. Use it if all states should be regarded as an invalid solution.
     * 
     * @return The objective.
     * @see AlwaysSatisfiedDummyHardObjective
     */
    public static NeverSatisfiedDummyHardObjective createNeverSatisfiedDummyHardObjective(String name) {
        return new NeverSatisfiedDummyHardObjective(name);
    }

    /**
     * This hard objective is fulfilled if the length of the trajectory is in the specified interval (inclusive). Use
     * {@link DepthHardObjective#withMinDepth(int)} and {@link DepthHardObjective#withMaxDepth(int)} to configure.
     * 
     * @return The objective.
     * @see DepthHardObjective
     */
    public static DepthHardObjective createDepthHardObjective() {
        return new DepthHardObjective();
    }

    /**
     * This hard objective is fulfilled if the length of the trajectory is in the specified interval (inclusive). Use
     * {@link DepthHardObjective#withMinDepth(int)} and {@link DepthHardObjective#withMaxDepth(int)} to configure.
     * 
     * @param name
     * @return The objective.
     * @see DepthHardObjective
     */
    public static DepthHardObjective createDepthHardObjective(String name) {
        return new DepthHardObjective(name);
    }

}
