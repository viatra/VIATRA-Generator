package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import java.text.DecimalFormat
import java.util.HashMap
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

abstract class CostDistance {
	def abstract double naDistance(List<Double> samples);	
	def abstract double mpcDistance(List<Double> samples);
	def abstract double outDegreeDistance(List<Double> samples);
	
	def protected pmfFromSamples(double[] samples, DecimalFormat formatter){
		var length = samples.length;
		var pmfMap = new HashMap<String, Double>();
		
		for(sample : samples){
			pmfMap.put(formatter.format(sample), pmfMap.getOrDefault(formatter.format(sample), 0.0) + 1.0 / length);
		}
		
		return pmfMap;
	}
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