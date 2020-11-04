/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.multithreading;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.base.ExplorerThread;

/**
 * 
 * @author Andras Szabolcs Nagy
 * 
 */
public class DSEThreadPool extends ThreadPoolExecutor {

    private static final long THREAD_KEEP_ALIVE_IN_SECONDS = 60;

    public DSEThreadPool() {
        // Based on the Executors.newCachedThreadPool()
        super(0, getProcNumber(), THREAD_KEEP_ALIVE_IN_SECONDS, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    }

    // helper for constructor
    private static int getProcNumber() {
        return Runtime.getRuntime().availableProcessors();
    }

    public boolean tryStartNewStrategy(ExplorerThread strategy) {

        if (!canStartNewThread()) {
            return false;
        }

        try {
            submit(strategy);
        } catch (RejectedExecutionException e) {
            Logger.getLogger(DesignSpaceExplorer.class).info("Couldn't start new thread.", e);
            return false;
        }

        return true;
    }

    public boolean canStartNewThread() {
        return getMaximumPoolSize() > getActiveCount();
    }
}
