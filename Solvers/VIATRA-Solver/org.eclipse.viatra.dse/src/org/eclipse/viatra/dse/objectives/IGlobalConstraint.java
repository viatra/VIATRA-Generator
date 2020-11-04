/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.objectives;

import org.eclipse.viatra.dse.base.ThreadContext;

/**
 * 
 * Implementation of this interface represents a global constraint of the DSE problem, which can halt an exploration
 * continuing from a state which dissatisfies the global constraint.
 * <p>
 * Certain global constraints can have inner state for the validation. In this case a new instance is necessary for
 * every new thread, and the {@code createNew} method should not return the same instance more than once.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public interface IGlobalConstraint {

    /**
     * Returns the name of the global constraint.
     * 
     * @return The name of the global constraint.
     */
    String getName();

    /**
     * Checks whether the current state satisfies the global constraint.
     * 
     * @param context
     *            The {@link ThreadContext} which contains the necessary information.
     * @return True if the state is valid and exploration can be continued from the actual state.
     */
    boolean checkGlobalConstraint(ThreadContext context);

    /**
     * Initializes the global constraint. It is called exactly once for every thread starts.
     * 
     * @param context
     *            The {@link ThreadContext}.
     */
    void init(ThreadContext context);

    /**
     * Returns an instance of the {@link IGlobalConstraint}. If it returns the same instance, all the methods has to be
     * thread save as they are called concurrently.
     * 
     * @return An instance of the global constraint.
     */
    IGlobalConstraint createNew();

}
