/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
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
 * This hard objective is never fulfilled. Use it if all states should be regarded as an invalid solution.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class NeverSatisfiedDummyHardObjective extends BaseObjective {

    private static final String DEFAULT_NAME = "NeverSatisfiedDummyHardObjective";

    public NeverSatisfiedDummyHardObjective() {
        super(DEFAULT_NAME);
    }

    public NeverSatisfiedDummyHardObjective(String name) {
        super(name);
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
        return false;
    }

    @Override
    public IObjective createNew() {
        return this;
    }

}
