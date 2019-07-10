package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic
import java.util.ArrayList
import java.util.HashMap

class EdgeTypeMetric extends Metric {
	
	override evaluate(GraphStatistic g) {
		var map = evaluateSamples(g) as HashMap<String, Double>;
		var output = new ArrayList<String[]>();
		output.add(newArrayList('Edge Type'));
		
		var keys = map.keySet;
		var values = newArrayList();
		for(key : keys){
			values.add(map.get(key)+'');
		}
		
		output.add(keys);
		output.add(values);
		
		return output;
	}
	
	override evaluateSamples(GraphStatistic g) {
		val map = new HashMap<String, Double>();
		var outgoingEdges = g.outgoingEdges;
		
		//get the total number of edges
		val edgeCount = outgoingEdges.values.fold(0, [r, t| r + t.asMap.values.fold(0, [r1, t1| r1 + t1.size])]) as double;
		outgoingEdges.forEach[k, v|
			var value = v.asMap.values.fold(0, [r, t| r + t.size]) / edgeCount;
			map.put(k, value);
		]
		
			
		return map;
	}
	
}