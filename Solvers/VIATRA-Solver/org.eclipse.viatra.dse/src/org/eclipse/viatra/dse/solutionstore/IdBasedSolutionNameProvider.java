/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.solutionstore;

/**
 * Provides file name with a String <code>[prefix][id].[extension]</code> pattern.
 * @author Andras Szabolcs Nagy
 *
 */
public class IdBasedSolutionNameProvider implements ISolutionNameProvider {

    private int id = 1;
    private String prefix;
    private String extension;

    public IdBasedSolutionNameProvider(String prefix, String extension) {
        this.extension = extension;
        this.prefix = prefix;

    }

    @Override
    public String getName() {
        StringBuilder sb = new StringBuilder(prefix);
        sb.append(id++);
        sb.append('.');
        sb.append(extension);
        return sb.toString();
    }

}