/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.statecoding;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

public class TheStateCoder implements IStateCoder {

    private StatecodingDependencyGraph sdg;
    private IObjectsProvider objectProvider;

    public TheStateCoder(StatecodingDependencyGraph sdg, IObjectsProvider objectProvider) {
        this.sdg = sdg;
        this.objectProvider = objectProvider;
    }

    @Override
    public void init(Notifier notifier) {
        // TODO checks
        // TODO node sorting based on traversal - in factory

        // this.notifier = notifier;
        // try {
        // EMFScope scope = new EMFScope(notifier);
        // queryEngine = ViatraQueryEngine.on(scope);
        // } catch (ViatraQueryException e1) {
        // logger.error("Failed to initialize VIATRA Query engine on the given notifier", e1);
        // throw new DSEException("Failed to initialize VIATRA Query engine on the given notifier");
        // }

        objectProvider.init(notifier, sdg);
    }

    @Override
    public String createStateCode() {

        StringBuilder sb = new StringBuilder();

        // TODO sort
        for (StatecodingNode node : sdg.getNodes()) {
            sb.append(node.getClazz().getName());
            sb.append(':');
            sb.append(addStateCode(node));
            sb.append('|');
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();

    }

    @Override
    public Object createActivationCode(IPatternMatch match) {
        // TODO root object
        // TODO parameterless?

        int i = 0;
        StringBuilder sb = new StringBuilder();
        Object object;
        do {
            object = match.get(i++);
            if (object != null) {
                if (object instanceof EObject) {
                    EObject eObject = (EObject) object;
                    sb.append(addStateCode(sdg.getNodeByClass(eObject.eClass()), eObject));
                } else {
                    // TODO toString or not to toString
                }
            }
        } while (object != null);

        return sb.toString();
    }

    public String addStateCode(StatecodingNode node, EObject eObject) {
        StringBuilder sb = new StringBuilder();

        Set<EAttribute> attributes = node.getAttributes();
        if (!attributes.isEmpty()) {
            for (EAttribute eAttribute : attributes) {
                // attributes are sorted
                // TODO handle collection
                sb.append(eObject.eGet(eAttribute));
                sb.append(';');
            }
            sb.deleteCharAt(sb.length() - 1);
        }

        List<StatecodingDependency> dependencies = node.getStatecodingDependencies();
        int dependenciesSize = dependencies.size();
        if (dependenciesSize > 0) {
            String[] codeParts = new String[dependenciesSize];
            int i = 0;
            for (StatecodingDependency dependency : dependencies) {
                String code = addStateCodeFromDependency(dependency, eObject);
                codeParts[i++] = code;
            }
            Arrays.sort(codeParts);

            sb.append("(");
            sb.append(codeParts[0]);
            for (i = 1; i < codeParts.length; i++) {
                sb.append(';');
                sb.append(codeParts[i]);
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public String addStateCode(StatecodingNode node) {
        Collection<EObject> eObjects = objectProvider.getEObjects(node.getClazz());
        int size = eObjects.size();

        if (size > 0) {
            String[] codeParts = new String[size];
            int i = 0;
            for (EObject eObject : eObjects) {
                String code = addStateCode(node, eObject);
                codeParts[i++] = code;
            }
            Arrays.sort(codeParts);

            StringBuilder sb = new StringBuilder();
            sb.append(codeParts[0]);
            for (i = 1; i < codeParts.length; i++) {
                sb.append(';');
                sb.append(codeParts[i]);
            }
            return sb.toString();
        }

        return "";
    }

    public String addStateCodeFromDependency(StatecodingDependency sd, EObject eObject) {

        if (sd.type.equals(StatecodingDependencyType.NORMAL)) {

            Object eReferred = eObject.eGet(sd.eReference);
            if (eReferred == null) {
                return "";
            } else if (eReferred instanceof EList<?>) {
                EList<?> refferedList = (EList<?>) eReferred;
                // TODO test
                if (!refferedList.isEmpty()) {

                    String[] codeParts = new String[refferedList.size()];
                    int i = 0;
                    for (Object referredEObject : refferedList) {
                        String code = addStateCode(sd.node, (EObject) referredEObject);
                        codeParts[i++] = code;
                    }
                    Arrays.sort(codeParts);

                    StringBuilder sb = new StringBuilder();
                    sb.append('[');
                    sb.append(codeParts[0]);
                    for (i = 1; i < codeParts.length; i++) {
                        sb.append(';');
                        sb.append(codeParts[i]);
                    }
                    sb.append(']');
                    return sb.toString();

                }
            } else if (eReferred instanceof EObject) {
                return addStateCode(sd.node, (EObject) eReferred);
            } else {
                throw new DSEException("The EObject " + eObject.toString() + " does not have a feature "
                        + eReferred.toString() + ".");
            }

        } else {
            for (EObject dependentEObject : objectProvider.getEObjects(sd.node.getClazz())) {
                Object eReferred = dependentEObject.eGet(sd.eReference);
                if (eReferred == null) {
                    continue;
                } else if (eReferred instanceof EList<?>) {
                    // TODO this is slow, use VIATRA Query
                    for (Object referredEObject : ((EList<?>) eReferred)) {
                        if (referredEObject.equals(eObject)) {
                            return addStateCode(sd.node, (EObject) dependentEObject);
                        }
                    }
                } else if (eReferred.equals(eObject)) {
                    // Probably never happens?
                    return addStateCode(sd.node, (EObject) dependentEObject);
                } else {
                    throw new DSEException("The EObject " + eObject.toString() + " does not have a feature "
                            + eReferred.toString() + ".");
                }
            }
        }

        return "";
    }
}
