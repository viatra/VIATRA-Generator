/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.strategy.interfaces.IStrategy;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.transformation.evm.api.RuleEngine;

/**
 * This class implements the {@link Runnable} interface, to able to run an exploration strategy in a separate thread. It
 * is also responsible to initialize the exploration, start the exploration (call the {@link IStrategy#explore()}
 * method), catch any exception during exploration and to shutdown the thread correctly.
 * 
 * @author Földenyi Miklos & Nagy Andras Szabolcs
 * 
 */
public class ExplorerThread implements Runnable {

    private final ThreadContext threadContext;

    private IStrategy strategy;

    public ExplorerThread(final ThreadContext context) {
        this.threadContext = context;
        strategy = threadContext.getStrategy();
    }

    /**
     * Signals the {@link IStrategy} instance that execution should be stopped. By contract, the strategy is to
     * stop execution at the next stage of execution where stopping and exiting is appropriate.
     */
    public void stopRunning() {
        strategy.interruptStrategy();
    }

    /**
     * Starts the design space exploration. Returns only when the {@link IStrategy#explore()} method returns.
     */
    public void run() {
        GlobalContext globalContext = threadContext.getGlobalContext();
        try {
            
            threadContext.init();

            strategy.initStrategy(threadContext);

            strategy.explore();

            threadContext.backtrackUntilRoot();

        } catch (Throwable e) {
            Logger.getLogger(IStrategy.class).error("Thread stopped unexpectedly!", e);
            globalContext.registerException(e);
        } finally {
            globalContext.strategyFinished(this);
            dispose();
        }
    }

    /**
     * Disposes of this strategy. Recursively calls dispose on the underlying {@link RuleEngine} and
     * {@link ViatraQueryEngine}. Calling this is only required if the design space exploration was launched in thread, as
     * the underlying engines get collected on the stop of the running {@link Thread}.
     */
    public void dispose() {
        threadContext.getRuleEngine().dispose();
        DseIdPoolHelper.INSTANCE.disposeByThread();
    }

    /**
     * Returns the associated {@link ThreadContext} that houses all the thread specific data about the exploration
     * process, and is also the gateway to the {@link GlobalContext} which stores data relevant to the design space
     * exploration process as a whole.
     * 
     * @return the relevant {@link ThreadContext}.
     */
    public ThreadContext getThreadContext() {
        return threadContext;
    }

}
