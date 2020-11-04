/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import java.util.Set;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.transformation.evm.api.Activation;
import org.eclipse.viatra.transformation.evm.api.resolver.ChangeableConflictSet;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver;

public class DseConflictSet implements ChangeableConflictSet {

    private ActivationCodesConflictSet activationCodesConflictSet;
    private ChangeableConflictSet activationOrderingConflictSet;
    private ChangeableConflictSet prevActivationOrderingConflictSet;
    private ConflictResolver resolver;

    public DseConflictSet(ConflictResolver resolver, ConflictResolver activationOrderingConflictResolver,
            IStateCoder stateCoder) {
        this.resolver = resolver;
        activationOrderingConflictSet = activationOrderingConflictResolver.createConflictSet();
        activationCodesConflictSet = new ActivationCodesConflictSet(activationOrderingConflictSet, stateCoder);
    }

    @Override
    public Activation<?> getNextActivation() {
        return activationOrderingConflictSet.getNextActivation();
    }

    @Override
    public Set<Activation<?>> getNextActivations() {
        return activationOrderingConflictSet.getNextActivations();
    }

    @Override
    public Set<Activation<?>> getConflictingActivations() {
        return activationOrderingConflictSet.getConflictingActivations();
    }

    @Override
    public ConflictResolver getConflictResolver() {
        return resolver;
    }

    @Override
    public boolean addActivation(Activation<?> activation) {
        activationCodesConflictSet.addActivation(activation);
        return activationOrderingConflictSet.addActivation(activation);
    }

    @Override
    public boolean removeActivation(Activation<?> activation) {
        activationCodesConflictSet.removeActivation(activation);
        return activationOrderingConflictSet.removeActivation(activation);
    }

    public ActivationCodesConflictSet getActivationCodesConflictSet() {
        return activationCodesConflictSet;
    }

    public void changeActivationOrderingConflictSet(ChangeableConflictSet newActivationOrderingConflictSet) {
        for (Activation<?> activation : activationOrderingConflictSet.getConflictingActivations()) {
            newActivationOrderingConflictSet.addActivation(activation);
        }
        activationCodesConflictSet.reinitWithActivations(newActivationOrderingConflictSet);
        ChangeableConflictSet tmp = activationOrderingConflictSet;
        activationOrderingConflictSet = newActivationOrderingConflictSet;
        prevActivationOrderingConflictSet = tmp;
    }

    public void changeActivationOrderingConflictSetBack() {
        ChangeableConflictSet newActivationOrderingConflictSet =
                prevActivationOrderingConflictSet.getConflictResolver().createConflictSet();
        changeActivationOrderingConflictSet(newActivationOrderingConflictSet);
    }
}
