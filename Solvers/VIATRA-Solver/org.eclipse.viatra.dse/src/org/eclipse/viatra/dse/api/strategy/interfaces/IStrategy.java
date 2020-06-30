/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api.strategy.interfaces;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.solutionstore.SolutionStore;

/**
 * This high level interface is responsible for defining basic operations of an exploration strategy.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public interface IStrategy {

    /**
     * Initializes the strategy with a specific {@link ThreadContext}.
     * 
     * @param context
     *            The context.
     */
    void initStrategy(ThreadContext context);

    /**
     * This method explores the design space as the implementation specifies. It will be called only once, hence the
     * exploration loop is run by the implementation. The termination condition is also specified by the implementation
     * and when it returns the exploration thread will be disposed.
     */
    void explore();

    /**
     * The implementation of this interface should be ready to be interrupted. If this method is called, the
     * {@link IStrategy#explore()} method should return ASAP.
     * 
     * This method is also called by the {@link SolutionStore} class if enough solutions are found. 
     */
    void interruptStrategy();
}
