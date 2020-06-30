/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.visualizer;

public class DesignSpaceVisualizerOptions {

    public boolean showExplorationTrace = true;
    public boolean showStateCodes = true;
    public boolean showTransitionCodes = true;

    public DesignSpaceVisualizerOptions withOutExploraionTrace() {
        showExplorationTrace = false;
        return this;
    }

    public DesignSpaceVisualizerOptions withOutstateCodes() {
        showStateCodes = false;
        return this;
    }

    public DesignSpaceVisualizerOptions withOutTransitionCodes() {
        showTransitionCodes = false;
        return this;
    }

    public boolean isShowExplorationTrace() {
        return showExplorationTrace;
    }

    public void setShowExplorationTrace(boolean showExplorationTrace) {
        this.showExplorationTrace = showExplorationTrace;
    }

    public boolean isShowStateCodes() {
        return showStateCodes;
    }

    public void setShowStateCodes(boolean showStateCodes) {
        this.showStateCodes = showStateCodes;
    }

    public boolean isShowTransitionCodes() {
        return showTransitionCodes;
    }

    public void setShowTransitionCodes(boolean showTransitionCodes) {
        this.showTransitionCodes = showTransitionCodes;
    }

}
