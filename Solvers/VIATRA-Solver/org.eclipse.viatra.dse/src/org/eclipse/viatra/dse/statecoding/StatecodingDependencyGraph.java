/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.statecoding;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

public class StatecodingDependencyGraph {

    private List<StatecodingNode> nodes = new ArrayList<StatecodingNode>();

    public StatecodingNode createNode(EClass clazz) {
        StatecodingNode node = new StatecodingNode(clazz);
        node.setGraph(this);
        addNode(node);
        return node;
    }

    public void addNode(StatecodingNode node) {
        nodes.add(node);
    }

    public StatecodingNode getNodeByClass(EClass eClass) {
        for (StatecodingNode node : nodes) {
            if (node.getClazz().equals(eClass)) {
                return node;
            }
        }
        return null;
    }

    public List<StatecodingNode> getNodes() {
        return nodes;
    }

}
