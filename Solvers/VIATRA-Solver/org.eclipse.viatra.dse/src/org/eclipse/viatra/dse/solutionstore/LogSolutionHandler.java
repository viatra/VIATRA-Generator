/*******************************************************************************
 * Copyright (c) 2010-2017, Andras Szabolcs Nagy and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.solutionstore;

import org.apache.log4j.Logger;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.base.ThreadContext;

public class LogSolutionHandler implements ISolutionFoundHandler {

    Logger logger = Logger.getLogger(LogSolutionHandler.class);

    @Override
    public void solutionFound(ThreadContext context, SolutionTrajectory trajectory) {
        logger.info("Solution registered: " + trajectory.toPrettyString());
    }

    @Override
    public void solutionTriedToSave(ThreadContext context, SolutionTrajectory trajectory) {
        logger.debug("Not good enough solution: " + trajectory.toPrettyString());
    }
}