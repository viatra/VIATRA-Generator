/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.designspace.api;

import java.util.Collection;

public interface IDesignSpace {

    Collection<Object> getStates();
    Collection<Object> getRoots();
    void addState(Object sourceStateId, Object firedActivationId, Object newStateId);

    boolean isTraversed(Object stateId);

    Collection<Object> getActivationIds(Object stateId);
    Object getRandomActivationId(Object stateId);

    long getNumberOfStates();
    long getNumberOfTransitions();

}
