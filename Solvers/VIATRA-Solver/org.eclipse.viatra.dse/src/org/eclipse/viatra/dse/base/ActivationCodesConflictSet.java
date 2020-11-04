/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.transformation.evm.api.Activation;
import org.eclipse.viatra.transformation.evm.api.resolver.ChangeableConflictSet;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictResolver;
import org.eclipse.viatra.transformation.evm.api.resolver.ConflictSet;

public class ActivationCodesConflictSet implements ChangeableConflictSet {

    private static class ActivationCodesMultiBiMap {
        public Map<Activation<?>, Object> activationsToCodes = new HashMap<>();
        public Map<Object, Set<Activation<?>>> codesToActivations = new HashMap<>();

        public void addActivation(Activation<?> activation, Object activationCode) {
            activationsToCodes.put(activation, activationCode);
            codesToActivations.computeIfAbsent(activationCode, k -> new HashSet<>()).add(activation);
        }

        public void removeActivaion(Activation<?> activation) {
            Object activationCode = activationsToCodes.remove(activation);
            Set<Activation<?>> activations = codesToActivations.get(activationCode);
            if (activations != null) {
                activations.remove(activation);
            }
        }

        public void clear() {
            activationsToCodes.clear();
            codesToActivations.clear();
        }
    }
    
    protected ActivationCodesMultiBiMap activationCodes;
    protected IStateCoder stateCoder;

    protected Set<Activation<?>> newActivations = new HashSet<>();
    protected Set<Activation<?>> removedActivations = new HashSet<>();
//    private Logger logger = Logger.getLogger(getClass());

    private boolean isIncremental = false;
    private ConflictSet nextActivationsConflictSet;

    public void setIncremental(boolean isIncremental) {
        this.isIncremental = isIncremental;
    }

    public ActivationCodesConflictSet(ConflictSet nextActivationsConflictSet, IStateCoder stateCoder) {
        Objects.requireNonNull(nextActivationsConflictSet);
        this.nextActivationsConflictSet = nextActivationsConflictSet;
        this.stateCoder = stateCoder;
        activationCodes = new ActivationCodesMultiBiMap();
    }

    private Object createActivationCode(Activation<?> activation) {
        return stateCoder.createActivationCode((IPatternMatch) activation.getAtom());
    }

    @Override
    public boolean removeActivation(Activation<?> activation) {
        if (isIncremental) {
//*
            removedActivations.add(activation);
            newActivations.remove(activation);
/*/
            if(!removedActivations.add(activation)) {
                logger.debug("Abnormal: already marked to remove: " + activation);
            } else {
                logger.debug("marked to remove: " + activation);
            }
            if(newActivations.remove(activation)) {
                logger.debug("Abnormal: removed from new activations: " + activation);
            }
//*/
        }
        return false;
    }

    @Override
    public boolean addActivation(Activation<?> activation) {
        if (isIncremental) {
//*
            newActivations.add(activation);
            removedActivations.remove(activation);
            /*/
            if (activation.isEnabled()) {
                if (!newActivations.add(activation)) {
                    logger.debug("Abnormal: already added as new: " + activation);
                } else {
                    logger.debug("activation added: " + activation);
                }
            }
            if(removedActivations.remove(activation)) {
                logger.debug("Abnormal: was already marked to remove: " + activation);
            }
//*/
        }
        return false;
    }

    public Object getActivationId(Activation<?> activation) {
        return activationCodes.activationsToCodes.get(activation);
    }

    public Activation<?> getActivation(Object activationId) {
        Set<Activation<?>> activationsSet = activationCodes.codesToActivations.get(activationId);
        if (activationsSet == null || activationsSet.isEmpty()) {
            return null;
        } else {
            return activationsSet.iterator().next();
        }
    }

    public void updateActivationCodes() {
//        logger.debug("Updating activation codes.");

        if (isIncremental) {
          for (Activation<?> activation : removedActivations) {
              activationCodes.removeActivaion(activation);
//              logger.debug("removed activation: " + activationId);
          }
    
          for (Activation<?> activation : newActivations) {
              if (activation.getState().isInactive()) {
                  continue;
              }
              Object activationCode = createActivationCode(activation);
              activationCodes.addActivation(activation, activationCode);
//              logger.debug("new activation: " + activationId);
//              Activation<?> similarActivation = activationIds.inverse().get(activationId);
//              if (similarActivation != null) {
//                  logger.debug("Activation " + toStringAct(activation) + " is already present with id: " + activationId);
//                  if (similarActivation.isEnabled()) {
//                      logger.warn("Duplicate activation code: " + activationId);
//                  } else {
//                      logger.debug("Force put: " + activationId);
//                  }
//                  continue;
//              }
//              activationIds.put(activation, activationId);
          }
          removedActivations.clear();
          newActivations.clear();
        } else {
            activationCodes.clear();
            for (Activation<?> activation : nextActivationsConflictSet.getNextActivations()) {
                Object activationCode = createActivationCode(activation);
                activationCodes.addActivation(activation, activationCode);
            }
        }


    }

    protected void reinitWithActivations(ConflictSet nextActivationsConflictSet) {
        this.nextActivationsConflictSet = nextActivationsConflictSet;
        activationCodes.clear();
        for (Activation<?> activation : nextActivationsConflictSet.getNextActivations()) {
            Object activationCode = createActivationCode(activation);
            activationCodes.addActivation(activation, activationCode);
        }
    }

    @Override
    public Activation<?> getNextActivation() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Activation<?>> getNextActivations() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Activation<?>> getConflictingActivations() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ConflictResolver getConflictResolver() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object activationCode : activationCodes.activationsToCodes.values()) {
            sb.append(activationCode);
            sb.append(" | ");
        }
        return sb.toString();
    }

    public Collection<Object> getCurrentActivationCodes() {
        return activationCodes.activationsToCodes.values();
    }
}
