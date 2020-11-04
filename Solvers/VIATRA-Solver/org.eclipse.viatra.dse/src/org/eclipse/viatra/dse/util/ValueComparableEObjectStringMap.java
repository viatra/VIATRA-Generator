/*******************************************************************************
 * Copyright (c) 2010-2015, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Functions;
import com.google.common.collect.Ordering;

/**
 * 
 * This custom {@link TreeMap} implementation enables to store {@link EObject}-{@link String} pairs sorted by values
 * (strings). It works as expected if the map is modified in any way, hence the map will still be sorted by values on
 * the new set of entries.
 * 
 * It is allowed to have two entries with the same EObject key (and also with same values).
 * 
 * The short coming of the class is that EObjects are compared to each other by their
 * {@link System#identityHashCode(Object)}, which may lead to unexpected errors.
 * 
 * @author Andras Szabolcs Nagy
 *
 */
public class ValueComparableEObjectStringMap extends TreeMap<EObject, String> {

    private static final class EObjectComparator implements Comparator<EObject> {
        @Override
        public int compare(EObject o1, EObject o2) {
            return Integer.valueOf(System.identityHashCode(o1)).compareTo(Integer.valueOf(System.identityHashCode(o2)));
        }
    }

    private final Map<EObject, String> innerMap;

    public ValueComparableEObjectStringMap() {
        this(new HashMap<EObject, String>());
    }

    private ValueComparableEObjectStringMap(Map<EObject, String> innerMap) {
        super(Ordering.natural().onResultOf(Functions.forMap(innerMap)).compound(new EObjectComparator()));
        this.innerMap = innerMap;
    }

    @Override
    public String put(EObject keyEObject, String stringValue) {
        if (innerMap.containsKey(keyEObject)) {
            remove(keyEObject);
        }
        innerMap.put(keyEObject, stringValue);
        return super.put(keyEObject, stringValue);
    }
}
