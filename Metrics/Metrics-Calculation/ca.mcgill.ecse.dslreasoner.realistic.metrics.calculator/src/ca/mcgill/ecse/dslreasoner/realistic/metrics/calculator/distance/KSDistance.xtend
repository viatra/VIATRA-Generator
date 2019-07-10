package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.RepMetricsReader
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Set
import org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest

class KSDistance extends CostDistance {
	var static ksTester = new KolmogorovSmirnovTest();
	var MetricSampleGroup g;
	new(Domain d){
		var metrics = RepMetricsReader.read(d);
		this.g = metrics;
	}
	
	override double mpcDistance(List<Double> samples){
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(samples.size < 2) return 1;
		return ksTester.kolmogorovSmirnovStatistic(g.mpcSamples, samples);
	}
	
	override double naDistance(List<Double> samples){
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(samples.size < 2) return 1;
		return ksTester.kolmogorovSmirnovStatistic(g.naSamples as double[], samples);
	}
	
	override double outDegreeDistance(List<Double> samples){
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(samples.size < 2) return 1;
		return ksTester.kolmogorovSmirnovStatistic(g.outDegreeSamples, samples);
	}
	
	def double typedOutDegreeDistance(HashMap<String, List<Integer>> map){
		var value = 0.0;
		// map list to array
		val keySet = new HashSet<String>(map.keySet);
		keySet.addAll(g.typedOutDegreeSamples.keySet);
		for(key : keySet){
			if(!map.containsKey(key) ){
				value += 1;
			}else if(!g.typedOutDegreeSamples.containsKey(key)){
				value += map.get(key).size * 100;	
			}else{
				var double[] rep = g.typedOutDegreeSamples.get(key).stream().mapToDouble([it|it]).toArray();
				var double[] ins = map.get(key).stream().mapToDouble([it|it]).toArray();
				if((rep.size < 2 || ins.size < 2) ){
					if(rep.size < 2 && rep.containsAll(ins)){
						value += 0;
					}else{
						value += 1;
					}
				}else if(rep.size >= 2 && ins.size >= 2){
					value += ksTester.kolmogorovSmirnovStatistic(rep, ins);
				}
			}
		} 
		
		
		return value;
	}
}