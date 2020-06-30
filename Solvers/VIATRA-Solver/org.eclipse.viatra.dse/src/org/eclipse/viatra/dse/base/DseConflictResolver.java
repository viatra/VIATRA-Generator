/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.transformation.evm.api.resolver.ChangeableConflictSet;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver;

public class DseConflictResolver implements ConflictResolver {

    private ConflictResolver activationOrderingconflictResolver;
    private IStateCoder stateCoder;
    private DseConflictSet lastCreatedConflictSet;

    public DseConflictResolver(ConflictResolver activationOrderingConflictResolver, IStateCoder stateCoder) {
        this.activationOrderingconflictResolver = activationOrderingConflictResolver;
        this.stateCoder = stateCoder;
    }

    @Override
    public ChangeableConflictSet createConflictSet() {
        lastCreatedConflictSet = new DseConflictSet(this, activationOrderingconflictResolver, stateCoder);
        return lastCreatedConflictSet;
    }

    public DseConflictSet getLastCreatedConflictSet() {
        return lastCreatedConflictSet;
    }
}
