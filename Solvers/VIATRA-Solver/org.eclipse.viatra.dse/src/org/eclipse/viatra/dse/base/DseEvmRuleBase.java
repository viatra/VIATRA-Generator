/*******************************************************************************
 * Copyright (c) 2010-2016, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.base;

import org.eclipse.viatra.transformation.evm.api.Agenda;
import org.eclipse.viatra.transformation.evm.api.RuleBase;
import org.eclipse.viatra.transformation.evm.api.event.EventRealm;

public class DseEvmRuleBase extends RuleBase {

    public DseEvmRuleBase(EventRealm eventRealm, Agenda agenda) {
        super(eventRealm, agenda);
    }

}
