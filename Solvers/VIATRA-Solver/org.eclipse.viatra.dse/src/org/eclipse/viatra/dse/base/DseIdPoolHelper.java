/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.viatra.dse.api.DSEException;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

public enum DseIdPoolHelper {

    INSTANCE;
    
    public static interface IGetRuleExecutions {
        int getRuleExecutions(BatchTransformationRule<?, ?> rule);
    }

    public static class IdProvider {

        private final BatchTransformationRule<?, ?> rule;
        private IGetRuleExecutions getRuleExecutions;

        public IdProvider(IGetRuleExecutions getRuleExecutions, BatchTransformationRule<?, ?> rule) {
            this.getRuleExecutions = getRuleExecutions;
            this.rule = rule;
        }

        public int getId() {
            return getRuleExecutions.getRuleExecutions(rule);
        }

    }

    private ConcurrentHashMap<Thread, HashMap<BatchTransformationRule<?, ?>, IdProvider>> idProviders = new ConcurrentHashMap<>();

    public int getId(BatchTransformationRule<?, ?> rule) {
        Thread currentThread = Thread.currentThread();
        HashMap<BatchTransformationRule<?, ?>, IdProvider> ruleMap = idProviders.get(currentThread);
        if (ruleMap == null) {
            throw new DSEException("There is no registered id provider");
        }
        IdProvider idProvider = ruleMap.get(rule);
        return idProvider.getId();
    }

    public void registerRules(IGetRuleExecutions getRuleExecutions, Collection<BatchTransformationRule<?, ?>> rules) {
        Thread currentThread = Thread.currentThread();
        HashMap<BatchTransformationRule<?, ?>, IdProvider> ruleMap = new HashMap<>();
        for (BatchTransformationRule<?, ?> rule : rules) {
            IdProvider idProvider = new IdProvider(getRuleExecutions, rule);
            ruleMap.put(rule, idProvider);
        }
        idProviders.put(currentThread, ruleMap);
    }

    public void disposeByThread() {
        Thread currentThread = Thread.currentThread();
        idProviders.remove(currentThread);
    }
}
