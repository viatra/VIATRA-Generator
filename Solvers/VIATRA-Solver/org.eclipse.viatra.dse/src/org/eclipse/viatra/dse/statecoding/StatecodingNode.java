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
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public class StatecodingNode {

    private StatecodingDependencyGraph graph;

    private final EClass clazz;
    private Set<EAttribute> attributes = new TreeSet<EAttribute>(Comparator.comparing(EAttribute::getName));
    private List<StatecodingDependency> dependencies = new ArrayList<StatecodingDependency>();
    private boolean stateCodeIsId = false;
    private StatecodingNodeType statecodingNodeType = StatecodingNodeType.CREATE_AND_DELETE;

    public StatecodingNode(EClass clazz) {
        this.clazz = clazz;
    }

    public StatecodingNode withAttribute(EAttribute attribute) {
        attributes.add(attribute);
        return this;
    }

    public StatecodingNode withType(StatecodingNodeType type) {
        statecodingNodeType = type;
        return this;
    }

    public StatecodingNode withUniqueness() {
        stateCodeIsId = true;
        return this;
    }

    public StatecodingNode withDependency(EReference reference, StatecodingNode node) {
        dependencies.add(new StatecodingDependency(reference, node));
        return this;
    }

    public StatecodingNode withInverseDependency(EReference reference, StatecodingNode node) {
        dependencies.add(new StatecodingDependency(reference, node, false, StatecodingDependencyType.INVERSE));
        return this;
    }

    public void addDependency(StatecodingDependency statecodingDependency) {
        dependencies.add(statecodingDependency);
    }

    public EClass getClazz() {
        return clazz;
    }

    public boolean isStateCodeIsId() {
        return stateCodeIsId;
    }

    public void setStateCodeIsId(boolean stateCodeIsId) {
        this.stateCodeIsId = stateCodeIsId;
    }

    public StatecodingNodeType getStatecodingNodeType() {
        return statecodingNodeType;
    }

    public void setStatecodingNodeType(StatecodingNodeType statecodingNodeType) {
        this.statecodingNodeType = statecodingNodeType;
    }

    public Set<EAttribute> getAttributes() {
        return attributes;
    }

    public List<StatecodingDependency> getStatecodingDependencies() {
        return dependencies;
    }

    public StatecodingDependencyGraph getGraph() {
        return graph;
    }

    public void setGraph(StatecodingDependencyGraph graph) {
        this.graph = graph;
    }

}
