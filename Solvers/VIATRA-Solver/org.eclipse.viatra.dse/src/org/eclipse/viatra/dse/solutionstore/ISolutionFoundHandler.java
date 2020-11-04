/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.solutionstore;

import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.solutionstore.SolutionStore.ISolutionSaver;

/**
 * Contains callback methods which are called when a solution is found by the exploration {@link IStrategy}.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public interface ISolutionFoundHandler {

    /**
     * Called when a solution is saved by the {@link ISolutionSaver}. Later, this solution can be omitted from the final
     * set of solutions.
     * 
     * @param context
     * @param trajectory
     */
    void solutionFound(ThreadContext context, SolutionTrajectory trajectory);

    /**
     * Called when the exploration found a solution but it was not saved because of certain conditions.
     * 
     * @param context
     * @param trajectory
     */
    void solutionTriedToSave(ThreadContext context, SolutionTrajectory trajectory);
}