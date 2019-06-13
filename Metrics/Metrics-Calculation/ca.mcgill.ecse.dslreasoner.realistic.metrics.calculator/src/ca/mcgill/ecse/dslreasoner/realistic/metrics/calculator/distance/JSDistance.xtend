package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.RepMetricsReader
import com.google.common.collect.Sets
import java.text.DecimalFormat
import java.util.HashMap
import java.util.List

class JSDistance {
	var HashMap<String, Double> mpcPMF;
	var HashMap<String, Double> naPMF;
	var HashMap<String, Double> outDegreePMF;
	var DecimalFormat formatter;
	
	new(Domain d){
		var metrics = RepMetricsReader.read(d);
		var mpcSamples = metrics.mpcSamples;
		var naSamples = metrics.naSamples.stream.mapToDouble([it]).toArray();
		var outDegreeSamples = metrics.outDegreeSamples.stream.mapToDouble([it]).toArray();
		
		//needs to format the number to string avoid precision issue
		formatter = new DecimalFormat("#0.00000");  
		
		mpcPMF = pmfFromSamples(mpcSamples, formatter);
   		naPMF = pmfFromSamples(naSamples, formatter);
   		outDegreePMF = pmfFromSamples(outDegreeSamples, formatter);	
	}
	
	def private pmfFromSamples(double[] samples, DecimalFormat formatter){
		var length = samples.length;
		var pmfMap = new HashMap<String, Double>();
		
		for(sample : samples){
			pmfMap.put(formatter.format(sample), pmfMap.getOrDefault(formatter.format(sample), 0.0) + 1.0 / length);
		}
		
		return pmfMap;
	}
	
	def private combinePMF(HashMap<String, Double> pmf1, HashMap<String, Double> pmf2){
		var pmfMap = new HashMap<String, Double>();
		
		var union = Sets.union(pmf1.keySet(), pmf2.keySet());
		
		for(key : union){
			// corresponding to M in JS distance
			var value = 1.0/2 * (pmf1.getOrDefault(key, 0.0) + pmf2.getOrDefault(key, 0.0));
			pmfMap.put(key, value);
		}
		return pmfMap;
	}
	
	def private jsDivergence(HashMap<String, Double> p, HashMap<String, Double> q){
		val m = combinePMF(q, p);
		var distance = 1.0/2 * klDivergence(p, m) + 1.0/2 * klDivergence(q, m);
		return distance;
	}
	
	def klDivergence(HashMap<String, Double> p, HashMap<String, Double> q){
		var distance = 0.0;
		for(key : q.keySet()){
			//need to convert log e to log 2
			if(p.containsKey(key)){
				distance -= p.get(key) * Math.log(q.get(key) / p.get(key)) / Math.log(2);
			}
		}
		return distance;
	}
	
	def double mpcDistance(List<Double> samples){
		// map list to array
		var map = pmfFromSamples(samples.stream().mapToDouble([it]).toArray(), formatter);
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(map.size < 2) return 1;
		return jsDivergence(map, mpcPMF);
	}
	
	def double naDistance(List<Double> samples){
		// map list to array
		var map = pmfFromSamples(samples.stream().mapToDouble([it]).toArray(), formatter);
		
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(map.size < 2) return 1;
		return jsDivergence(map, naPMF);
	}
	
	def double outDegreeDistance(List<Double> samples){
		// map list to array
		var map = pmfFromSamples(samples.stream().mapToDouble([it]).toArray(), formatter);
		//if the size of array is smaller than 2, ks distance cannot be performed, simply return 1
		if(map.size < 2) return 1;
		return jsDivergence(map, outDegreePMF);
	}
}