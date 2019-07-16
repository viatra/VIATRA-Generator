package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic
import java.util.ArrayList
import java.util.HashMap

class NodeTypeMetric extends Metric {
	
	
	override evaluate(GraphStatistic g) {
		var map = evaluateSamples(g) as HashMap<String, Double>;
		var output = new ArrayList<String[]>();
		output.add(newArrayList('Node Type'));
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
		var map = new HashMap<String, Double>();
		var nodes = g.allNodes;
		var single = 1.0 / nodes.size();
		var nodeToType = g.nodeToTypesMap;
		for(node : nodes){			
			for(cl : nodeToType.get(node)){
				var value = map.getOrDefault(cl, 0.0);
				map.put(cl, value + single);
			}	
		}
		
		return map;
	}
	
}