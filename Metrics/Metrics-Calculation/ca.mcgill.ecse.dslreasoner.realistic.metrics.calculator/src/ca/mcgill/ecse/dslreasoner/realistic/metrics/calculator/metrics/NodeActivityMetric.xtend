package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic
import java.util.HashMap

class NodeActivityMetric extends Metric {
	static val countName = "NACount";
	static val valueName = "NAValue";
	
	override evaluate(GraphStatistic g) {
		val map = new HashMap<Integer, Integer>();
		
		//calculate the metric distribution
		g.allNodes.forEach[
			val value = g.numOfEdgeTypes(it);
			if(!map.containsKey(value)){
				map.put(value, 1);
			}else{
				map.put(value, map.get(value) + 1);
			}
		]
		
		//convert it into a 2 dimentional array
		val String[][] datas = newArrayOfSize(2, map.size+1);
		datas.get(0).set(0, valueName);
		datas.get(1).set(0, countName)

		var count = 1;
		for(entry : map.entrySet.sortBy[it.key]){
			datas.get(0).set(count, entry.key+"");
			datas.get(1).set(count, entry.value+"");
			count++;
		}
		
		return datas;
	}
}