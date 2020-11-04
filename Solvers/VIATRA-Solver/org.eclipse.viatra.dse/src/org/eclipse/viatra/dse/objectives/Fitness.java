/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.objectives;

import java.util.HashMap;

public class Fitness extends HashMap<String, Double>{

    private boolean satisifiesHardObjectives;
    
    public boolean isSatisifiesHardObjectives() {
        return satisifiesHardObjectives;
    }
    
    public void setSatisifiesHardObjectives(boolean satisifiesHardObjectives) {
        this.satisifiesHardObjectives = satisifiesHardObjectives;
    }
    
    @Override
    public String toString() {
        return super.toString() + " hardObjectives=" + satisifiesHardObjectives;
    }
}
