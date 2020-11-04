/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
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
 * This hard objective is satisfied if there are no rule activations from the current state (returning 1 in this case).
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class NoRuleActivationsHardObjective extends BaseObjective {

    protected static final String DEFAULT_NAME = "NoMoreActivationHardObjective";
    private ThreadContext context;

    public NoRuleActivationsHardObjective(String name) {
        super(name);
    }

    public NoRuleActivationsHardObjective() {
        this(DEFAULT_NAME);
    }

    @Override
    public Double getFitness(ThreadContext context) {
        return 0d;
    }

    @Override
    public void init(ThreadContext context) {
        super.init(context);
        this.context = context;
    }

    @Override
    public IObjective createNew() {
        return new NoRuleActivationsHardObjective(name);
    }

    @Override
    public boolean isHardObjective() {
        return true;
    }

    @Override
    public boolean satisifiesHardObjective(Double fitness) {
        return context.getConflictSet().getNextActivations().isEmpty();
    }

}
