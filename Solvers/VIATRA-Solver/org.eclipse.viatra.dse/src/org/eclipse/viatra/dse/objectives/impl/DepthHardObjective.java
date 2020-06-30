/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.objectives.impl;

import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.objectives.IObjective;

/**
 * This hard objective is fulfilled if the trajectory is in the specified interval (inclusive).
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class DepthHardObjective extends BaseObjective {

    private static final String DEFAULT_NAME = "DepthHardObjective";
    protected int minDepth;
    protected int maxDepth;
    private ThreadContext context;

    public DepthHardObjective() {
        this(DEFAULT_NAME, 0, Integer.MAX_VALUE);
    }

    public DepthHardObjective(String name) {
        this(name, 0, Integer.MAX_VALUE);
    }

    public DepthHardObjective(int minDepth) {
        this(DEFAULT_NAME, minDepth, Integer.MAX_VALUE);
    }

    public DepthHardObjective(String name, int minDepth) {
        this(name, minDepth, Integer.MAX_VALUE);
    }

    public DepthHardObjective(int minDepth, int maxDepth) {
        this(DEFAULT_NAME, minDepth, maxDepth);
    }
    
    public DepthHardObjective(String name, int minDepth, int maxDepth) {
        super(name);
        this.minDepth = minDepth;
        this.maxDepth = maxDepth;
    }

    public DepthHardObjective withMinDepth(int minDepth) {
        this.minDepth = minDepth;
        return this;
    }

    public DepthHardObjective withMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
        return this;
    }

    @Override
    public void init(ThreadContext context) {
        super.init(context);
        this.context = context;
    }

    @Override
    public Double getFitness(ThreadContext context) {
        return 0d;
    }

    @Override
    public boolean isHardObjective() {
        return true;
    }

    @Override
    public boolean satisifiesHardObjective(Double fitness) {
        return minDepth <= context.getDepth() && context.getDepth() <= maxDepth;
    }

    @Override
    public IObjective createNew() {
        return new DepthHardObjective(name, minDepth, maxDepth);
    }

}
