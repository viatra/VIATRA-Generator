/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.api;

import java.util.Objects;
import java.util.function.Consumer;

import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;

/**
 * An instance of this class is a specification of a graph transformation rule on a given metamodel. Such a rule
 * consists of a left hand side (LHS), which is specified by an {@link IQuerySpecification} and a right hand side (RHS),
 * which is specified by an {@link Consumer}.
 * 
 * @author Andras Szabolcs Nagy
 * 
 * @param <Match>
 *            A VIATRA Query pattern match - left hand side of the rule
 * @param <Matcher>
 *            A VIATRA Query pattern matcher - left hand side of the rule
 * @deprecated
 */
@Deprecated
public class DSETransformationRule<Match extends IPatternMatch, Matcher extends ViatraQueryMatcher<Match>> extends
        BatchTransformationRule<Match, Matcher> {

    public DSETransformationRule(String name, IQuerySpecification<Matcher> querySpec,
            Consumer<Match> action) {
        super(name, querySpec, BatchTransformationRule.STATELESS_RULE_LIFECYCLE, action);

        Objects.requireNonNull(name);
        Objects.requireNonNull(querySpec);
        Objects.requireNonNull(action);

    }

    public DSETransformationRule(IQuerySpecification<Matcher> querySpec,
            Consumer<Match> action) {
        this(querySpec.getFullyQualifiedName(), querySpec, action);
    }

}
