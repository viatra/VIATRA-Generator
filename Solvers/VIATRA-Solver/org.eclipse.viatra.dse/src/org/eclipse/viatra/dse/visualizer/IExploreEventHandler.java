/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.visualizer;

import org.eclipse.viatra.dse.base.DesignSpaceManager;

/**
 * An implementation of this interface is notified about every move in the design space (firing a rule activation or
 * undoing it) of a single thread, if registered to the corresponding {@link DesignSpaceManager}. Its methods are called
 * synchronously, therefore the implementation can have an impact on the performance. Also note, if the same instance is
 * registered to multiple threads ({@link DesignSpaceManager}), it has to be thread safe.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public interface IExploreEventHandler {

    /**
     * Called by the {@link DesignSpaceManager}, after a rule activation (transition) is fired. Multiple calls with the
     * same transition can occur.
     * 
     * @param transition The fired transition.
     */
    void transitionFired(Object transition);

    /**
     * Called by the {@link DesignSpaceManager}, after undoing the previously fired rule activation (transition).
     * Multiple calls with the same transition can occur.
     * 
     * @param transition The undone transition.
     */
    void undo(Object transition);

}
