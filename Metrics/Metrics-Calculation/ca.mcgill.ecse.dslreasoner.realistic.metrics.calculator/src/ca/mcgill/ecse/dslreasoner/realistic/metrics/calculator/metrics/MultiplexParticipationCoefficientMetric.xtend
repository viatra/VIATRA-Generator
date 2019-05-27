package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic
import java.text.DecimalFormat
import java.util.HashMap

class MultiplexParticipationCoefficientMetric extends Metric {
	static val countName = "MPCCount";
	static val valueName = "MPCValue";
	
	
	override evaluate(GraphStatistic g) {
		//because the precision issue of double, we translate double values into String to be the key
		val formatter = new DecimalFormat("#0.00000");     
		
		//get number of different types
		val typeCounts = g.allTypes.size;
		val map = new HashMap<String, Integer>();
		//calculate the metric distribution
		g.allNodes.forEach[n|
			val edgeCounts = g.outDegree(n) + g.inDegree(n);
			
			var coef = 0.0;
			
			for(type : g.allTypes){
				val degree = g.dimentionalDegree(n, type) as double;
				coef += Math.pow(degree / edgeCounts, 2);
			}		
			coef = 1 - coef;		
			coef = coef * typeCounts / (typeCounts-1);
			
			//Consider the case that either typeCounts-1 or the edgeCounts could be 0 in some situation
			//in this case the metric should be evaluated to 0
			if(typeCounts == 1){
				println("bad");
			}
			
			if(Double.isNaN(coef)){
				coef = 0;
			}
			
			//format number to String
			val value = formatter.format(coef);
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