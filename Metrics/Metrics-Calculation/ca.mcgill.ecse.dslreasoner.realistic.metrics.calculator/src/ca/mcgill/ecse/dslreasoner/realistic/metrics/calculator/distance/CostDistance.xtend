package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import org.apache.commons.math3.stat.regression.SimpleRegression
import org.eclipse.xtend.lib.annotations.Accessors

class CostDistance {
	
	var SimpleRegression regression;
	
	new(){
		regression = new SimpleRegression(true);
	}
	
}

class StateData{
	@Accessors(PUBLIC_GETTER)
	var double numOfNodeFeature;
	@Accessors(PUBLIC_GETTER)
	var double value;
	@Accessors(PUBLIC_GETTER)
	var Object lastState;
	
	new(int numOfNode, double value, Object lastState){
		this.numOfNodeFeature = 1.0 / numOfNode;
		this.value = value
		this.lastState = lastState;
	}
}