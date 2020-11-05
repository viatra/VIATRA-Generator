package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup
import java.util.HashMap
import java.util.HashSet
import java.util.List
import org.apache.commons.math3.stat.inference.KolmogorovSmirnovTest

class KSDistance extends CostDistance {
	var static ksTester = new KolmogorovSmirnovTest();
	var MetricSampleGroup g;
	
	new(MetricSampleGroup g){
		this.g = g;	
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
	
	// actually calculates Manhattan Distance due to KS-Distance does not make sense for discrete distributions
	def nodeTypeDistance(HashMap<String, Double> samples){
		var typesDistMap = g.nodeTypeSamples;
		var keys = new HashSet<String>(typesDistMap.keySet());
		keys.addAll(samples.keySet());
		var distance = 0.0;
		
		for(key : keys){
			distance += Math.abs(typesDistMap.getOrDefault(key, 0.0) - samples.getOrDefault(key, 0.0));
		}
		
		return distance;
	}
	
	def edgeTypeDistance(HashMap<String, Double> samples){
		var typesDistMap = g.edgeTypeSamples;
		var sourceDist = newArrayList();
		var instanceDist = newArrayList();
		
		for(key : typesDistMap.keySet()){
			sourceDist.add(typesDistMap.get(key));
			instanceDist.add(samples.getOrDefault(key, 0.0));
		}
		
		return ks_distance_two_dist(sourceDist, instanceDist);
	}
	
	def double ks_distance_two_dist(List<Double> dist1, List<Double> dist2){
		// Since we already know the pdf, we compute the ks-test manully
		var ksStatistics = 0.0;
		var sum1 = 0.0;
		var sum2 = 0.0;
		for(var i = 0; i < dist1.size(); i++){
			sum1 += dist1.get(i);
			sum2 += dist2.get(i);
			
			ksStatistics = Math.max(ksStatistics, Math.abs(sum1 - sum2));
		} 
		return ksStatistics;
	}
}