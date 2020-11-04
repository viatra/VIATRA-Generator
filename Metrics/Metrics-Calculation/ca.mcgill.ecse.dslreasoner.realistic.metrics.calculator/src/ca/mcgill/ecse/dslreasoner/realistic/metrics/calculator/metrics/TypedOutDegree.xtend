package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic
import java.util.ArrayList
import java.util.HashMap
import java.util.List

class TypedOutDegree extends Metric{
	
	def private calculateMetric(GraphStatistic g){
		var outgoingEdges = g.outgoingEdges;
		//record metric as a list of samples for each node type / edge type pair
		var metric = new HashMap<String, List<Integer>>();
		var nodeToTypes = g.nodeToTypesMap;
		
		for(edgeType : outgoingEdges.keySet){
			for(node : outgoingEdges.get(edgeType).keySet){
				//find all classes the node belongs to
				var classes = nodeToTypes.get(node);
				for(cl : classes){
					// get or create entry for node type / edge type pair
					var key = cl + ' ' + edgeType;
					var typeCount = metric.get(key);
					if(typeCount === null){
						typeCount = new ArrayList<Integer>();
						metric.put(key, typeCount);
					}
					
					// get or create sample list
					typeCount.add(outgoingEdges.get(edgeType).get(node).size);
				}
			}
		}
		
		return metric;
	}
	
	override evaluate(GraphStatistic g) {
		var metric = calculateMetric(g);
		var output = new ArrayList<String[]>();
		
		output.add(newArrayList('Typed Out Degree'));
		for(key : metric.keySet){
			var samples = metric.get(key);
			var String[] outputForOnePair = newArrayOfSize(samples.size+1);
			outputForOnePair.set(0, key);
			for(var i = 0; i < samples.size; i++){
				outputForOnePair.set(i+1, samples.get(i)+'');
			}
			output.add(outputForOnePair);
		}
		
		return output;
	}
	
	override evaluateSamples(GraphStatistic g) {
		return calculateMetric(g);
	}
	
}