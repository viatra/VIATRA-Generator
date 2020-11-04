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
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.base.api.IndexingLevel;
import org.eclipse.viatra.query.runtime.base.api.NavigationHelper;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

public class IncrementalObjectProvider implements IObjectsProvider {

    private Logger logger = Logger.getLogger(getClass());
    private NavigationHelper baseIndex;

    @Override
    public void init(Notifier notifier, StatecodingDependencyGraph statecodingDependencyGraph) {

        try {
            EMFScope scope = new EMFScope(notifier);
            ViatraQueryEngine queryEngine = ViatraQueryEngine.on(scope);

            Set<EClass> classes = new HashSet<EClass>();
//          Set<EReference> references = new HashSet<EReference>();
            for (StatecodingNode node : statecodingDependencyGraph.getNodes()) {
                classes.add(node.getClazz());
//              for (StatecodingDependency dependency : node.getStatecodingDependencies()) {
//                  // TODO inverse reference
//                  references.add(dependency.eReference);
//              }
            }
            baseIndex = EMFScope.extractUnderlyingEMFIndex(queryEngine);
            baseIndex.registerEClasses(classes, IndexingLevel.FULL);
        } catch (ViatraQueryException e) {
            logger.error("Failed to initialize VIATRA Query engine on the given notifier", e);
            throw new DSEException("Failed to initialize VIATRA Query engine on the given notifier");
        }
    }

    @Override
    public Collection<EObject> getEObjects(EClass eClass) {
        return baseIndex.getAllInstances(eClass);
    }

}
