/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.statecoding;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Implementation of this interface is responsible to provide {@link EObject}s of a given {@link EClass} for
 * {@link TheStateCoder}
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public interface IObjectsProvider {

    /**
     * Initialize the {@link IObjectsProvider} on a given model and {@link StatecodingDependencyGraph}.
     * 
     * @param notifier
     *            The root of the model.
     * @param statecodingDependencyGraph
     *            The state coding dependency graph.
     */
    void init(Notifier notifier, StatecodingDependencyGraph statecodingDependencyGraph);

    /**
     * Returns the instances of an {@link EClass} in a model.
     * 
     * @param eClass
     *            The class of the objects.
     * @return The collection of the instances.
     */
    Collection<EObject> getEObjects(EClass eClass);

}
