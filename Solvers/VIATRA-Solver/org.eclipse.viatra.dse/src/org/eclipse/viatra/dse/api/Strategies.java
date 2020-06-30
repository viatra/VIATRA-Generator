/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api;

import org.eclipse.viatra.dse.api.strategy.impl.BestFirstStrategy;
import org.eclipse.viatra.dse.api.strategy.impl.BreadthFirstStrategy;
import org.eclipse.viatra.dse.api.strategy.impl.DepthFirstStrategy;
import org.eclipse.viatra.dse.api.strategy.impl.FixedPriorityStrategy;
import org.eclipse.viatra.dse.api.strategy.impl.HillClimbingStrategy;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;

/**
 * Helper class for instantiating strategies. To implement a new strategy use the {@link IStrategy} interface.
 * 
 * @author Andras Szabolcs Nagy
 * 
 */
public final class Strategies {

    private Strategies() {
    }

    /**
     * Creates a depth-first search exploration strategy without a depth limit.
     * 
     * @return The strategy.
     * @see DepthFirstStrategy
     */
    public static DepthFirstStrategy createDfsStrategy() {
        return new DepthFirstStrategy();
    }

    /**
     * Creates a depth-first search exploration strategy with a depth limit. A negative depth limit means no
     * depth limit, zero means that it will check the initial state.
     * 
     * @param depthLimit
     * @return The strategy.
     * @see DepthFirstStrategy
     */
    public static DepthFirstStrategy createDfsStrategy(int depthLimit) {
        return new DepthFirstStrategy(depthLimit);
    }

    /**
     * Creates a fixed priority exploration strategy without a depth limit. It is a depth-first search exploration
     * strategy but from a current state it only explores the activations with the highest priority. Priorities can be
     * defined on the strategy itself.
     * 
     * @return The strategy.
     * @see FixedPriorityStrategy
     */
    public static FixedPriorityStrategy createFixedPriorityStrategy() {
        return createFixedPriorityStrategy(-1);
    }

    /**
     * Creates a fixed priority exploration strategy with a depth limit, where a zero or negative depth limit means no
     * depth limit. It is a depth-first search exploration strategy but from a current state it only explores the
     * activations with the highest priority. Priorities can be defined on the strategy itself.
     * 
     * @param depthLimit
     * @return The strategy.
     * @see FixedPriorityStrategy
     */
    public static FixedPriorityStrategy createFixedPriorityStrategy(int depthLimit) {
        return new FixedPriorityStrategy().withDepthLimit(depthLimit);
    }

    /**
     * Creates a breadth-first search exploration strategy without a depth limit.
     * 
     * @return The strategy.
     * @see BreadthFirstStrategy
     */
    public static BreadthFirstStrategy createBfsStrategy() {
        return new BreadthFirstStrategy();
    }

    /**
     * Creates a breadth-first search exploration strategy with a depth limit. A zero or negative depth limit means no
     * depth limit.
     * 
     * @param depthLimit
     * @return The strategy.
     * @see BreadthFirstStrategy
     */
    public static BreadthFirstStrategy createBfsStrategy(int depthLimit) {
        return new BreadthFirstStrategy(depthLimit);
    }

    /**
     * Creates a hill climbing exploration strategy. By default, it explores all neighborhood states and chooses the
     * best one to continue with until all neighborhood states are dominated by the current state. Other options are
     * available on the strategy.
     * 
     * @return The strategy.
     * @see HillClimbingStrategy
     */
    public static HillClimbingStrategy creatHillClimbingStrategy() {
        return new HillClimbingStrategy();
    }

    /**
     * See {@link BestFirstStrategy}.
     */
    public static BestFirstStrategy createBestFirstStrategy() {
        return new BestFirstStrategy();
    }

    /**
     * See {@link BestFirstStrategy}.
     */
    public static BestFirstStrategy createBestFirstStrategy(int depthLimit) {
        return new BestFirstStrategy(depthLimit);
    }
}
