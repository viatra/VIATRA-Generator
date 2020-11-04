/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.statecoding;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;

public class TheStateCoderFactory implements IStateCoderFactory {

    private StatecodingDependencyGraph sdg;
    private IObjectsProviderFactory objectProviderFactory;

    public TheStateCoderFactory(StatecodingDependencyGraph sdg) {
        this(sdg, new IncrementalObjectProviderFactory());
    }

    public TheStateCoderFactory(StatecodingDependencyGraph sdg, IObjectsProviderFactory objectProviderFactory) {
        this.sdg = sdg;
        this.objectProviderFactory = objectProviderFactory;

        // TODO cyclic dependency? - exception
        
        // TODO make plan for traversal
        
        // TODO If the type is FIXED and all dependency is FIXED then do not create state code for it (them)
        // This is not true :( e.g. matchmaking - they are fixed, but the references must be encoded
    }

    @Override
    public IStateCoder createStateCoder() {
        return new TheStateCoder(sdg, objectProviderFactory.createObjectsProvider());
    }

}
