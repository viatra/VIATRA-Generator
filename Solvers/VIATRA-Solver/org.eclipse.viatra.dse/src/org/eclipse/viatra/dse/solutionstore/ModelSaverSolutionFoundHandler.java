/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.solutionstore;

import java.util.HashSet;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.util.EMFHelper;

public class ModelSaverSolutionFoundHandler implements ISolutionFoundHandler {

    private HashSet<Object> savedSolutions = new HashSet<Object>();
    private ISolutionNameProvider solutionNameProvider;

    public ModelSaverSolutionFoundHandler() {
        solutionNameProvider = new IdBasedSolutionNameProvider("solution", "xmi");
    }

    public ModelSaverSolutionFoundHandler(String extension) {
        solutionNameProvider = new IdBasedSolutionNameProvider("solution", extension);
    }

    public ModelSaverSolutionFoundHandler(String prefix, String extension) {
        solutionNameProvider = new IdBasedSolutionNameProvider(prefix, extension);
    }

    public ModelSaverSolutionFoundHandler(ISolutionNameProvider solutionNameProvider) {
        this.solutionNameProvider = solutionNameProvider;
    }

    @Override
    public void solutionTriedToSave(ThreadContext context, SolutionTrajectory trajectory) {
    }

    @Override
    public void solutionFound(ThreadContext context, SolutionTrajectory trajectory) {
        Object stateCode = trajectory.getSolution().getStateCode();

        if (savedSolutions.contains(stateCode)) {
            return;
        }

        savedSolutions.add(stateCode);
        Notifier clonedModel = EMFHelper.clone(context.getModel());
        EMFHelper.saveModel(clonedModel, solutionNameProvider.getName());
    }
}