/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.statecoding;

import org.eclipse.emf.ecore.EReference;

public class StatecodingDependency {

    protected EReference eReference;
    protected StatecodingNode node;
    protected boolean isContained;
    protected StatecodingDependencyType type;

    public StatecodingDependency(EReference eReference, StatecodingNode node, boolean isContained,
            StatecodingDependencyType type) {
        super();
        this.eReference = eReference;
        this.node = node;
        this.isContained = isContained;
        this.type = type;
    }

    public StatecodingDependency(EReference eReference, StatecodingNode node) {
        this(eReference, node, false, StatecodingDependencyType.NORMAL);
    }

}