package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import org.eclipse.xtend.lib.annotations.Accessors

class CostDistance {

}

class StateData{
	@Accessors(PUBLIC_GETTER)
	var double[] features;
	@Accessors(PUBLIC_GETTER)
	var double value;
	@Accessors(PUBLIC_GETTER)
	var Object lastState;
	
	new(double[] features, double value, Object lastState){
		this.features = features;
		this.value = value
		this.lastState = lastState;
	}
}