package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.RepMetricsReader
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup
import com.google.common.collect.Sets
import java.text.DecimalFormat
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set

class EuclideanDistance extends CostDistance{
	var MetricSampleGroup g;
	var HashMap<String, Double> mpcPMF;
	var HashMap<String, Double> naPMF;
	var HashMap<String, Double> outDegreePMF;
	var DecimalFormat formatter;
	
	new(MetricSampleGroup g){
		this.g = g;
		
		var mpcSamples = g.mpcSamples;
		var naSamples = g.naSamples.stream.mapToDouble([it]).toArray();
		var outDegreeSamples = g.outDegreeSamples.stream.mapToDouble([it]).toArray();
		
		//needs to format the number to string avoid precision issue
		formatter = new DecimalFormat("#0.00000");  
		
		mpcPMF = pmfFromSamples(mpcSamples, formatter);
   		naPMF = pmfFromSamples(naSamples, formatter);
   		outDegreePMF = pmfFromSamples(outDegreeSamples, formatter);	
	}
	
	override naDistance(List<Double> samples) {
		var pmfMap = pmfFromSamples(samples, formatter);
		return euclideanDistance(pmfMap, naPMF);
	}
	
	override mpcDistance(List<Double> samples) {
		var pmfMap = pmfFromSamples(samples, formatter);
		return euclideanDistance(pmfMap, mpcPMF);
	}
	
	override outDegreeDistance(List<Double> samples) {
		var pmfMap = pmfFromSamples(samples, formatter);
		return euclideanDistance(pmfMap, outDegreePMF);
	}
	
	
	def private euclideanDistance(HashMap<String, Double> pmf1, HashMap<String, Double> pmf2){
		var keys = Sets.union(pmf1.keySet(), pmf2.keySet());
		var pmfList1 = pmfMapToList(pmf1, keys);
		var pmfList2 = pmfMapToList(pmf2, keys);
		var distance = 0.0;
		for(var i = 0; i < pmfList1.size(); i++){
			distance += Math.pow(pmfList1.get(i) + pmfList2.get(i), 2);
		}
		
		return Math.sqrt(distance);
	}	
	
	def private pmfMapToList(Map<String, Double> map, Set<String> keys){
		var list = new ArrayList<Double>();
		for(key : keys){
			var value = map.getOrDefault(key, 0.0);
			list.add(value);
		}
		return list;
	}
}