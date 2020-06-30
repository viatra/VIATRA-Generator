/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.statecode;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;

/**
 * <p>
 * To be able to efficiently explore a design space, a state that has been explored before through an other trajectory
 * needs to be recognized and ignored accordingly.
 * </p>
 * 
 * <p>
 * This is done by generating a pseudo-unique value (object) that is only depended on the relevant parts of the model's
 * internal state, that is, the values of two states can only be equal if the states themselves can be considered equal.
 * </p>
 * 
 * <p>
 * The processing engine however assumes, that any two states that share this pseudo-unique value has the same
 * characteristics, meaning they have the same amount and type of outgoing transitions available, and firing the
 * appropriate transitions from both states also result in states that share their pseudo-unique identifier. If this
 * condition is not satisfied, the exploration process's result will be non-deterministic, and in consequence, solutions
 * can be lost.
 * </p>
 * 
 * <p>
 * In addition to providing pseudo-unique identifiers to model states, the state coder must provide pseud-unique
 * identifiers to the outgoing transitions as well, but they only need to be unique on the scope of the particular
 * state, not globally. Global addressing thus can be achieved by considering the pseudo-unique identifier of the state
 * and the pseudo-unique identifier of the transition together if needed.
 * </p>
 * 
 * <p>
 * Both identifiers can be arbitrary objects, and equality is checked by calling {@link Object#equals(Object)} on the
 * two identifiers.
 * </p>
 * 
 * <p>
 * For any particular implementation an {@link IStateCoderFactory} implementation must also be supplied that handles the
 * creation of {@link IStateCoder} instances.
 * </p>
 * 
 * <p>
 * Usually it is unnecessary to represent everything from the model in a state code, only the parts which are modified
 * by the transformation rules.
 * </p>
 * 
 * @author Miklos Foldenyi, Andras Szabolcs Nagy
 * 
 */
public interface IStateCoder {

    /**
     * Initializes the state coder on the given model.
     * 
     * @param notifier
     */
    void init(Notifier notifier);

    /**
     * Returns a pseudo-unique identifier that describes the underlying model's current internal state.
     * 
     * @return an arbitrary {@link Object} that can be used as the identifier.
     */
    Object createStateCode();

    /**
     * Returns a pseudo-unique identifier that describes the given {@link IPatternMatch} in the context of the
     * underlying model's current internal state.
     * 
     * @return an arbitrary {@link Object} that can be used as the identifier in the given state.
     */
    Object createActivationCode(IPatternMatch match);

}
