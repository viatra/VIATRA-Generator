package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic
import java.text.DecimalFormat
import java.util.ArrayList
import java.util.HashMap
import org.eclipse.emf.ecore.EObject

class MultiplexParticipationCoefficientMetric extends Metric {
	public static val countName = "MPCCount";
	public static val valueName = "MPCValue";
	val formatter = new DecimalFormat("#0.00000");    
	
	override evaluate(GraphStatistic g) {
		//because the precision issue of double, we translate double values into String to be the key
		 
		
		//get number of different types
		val typeCounts = g.allTypes.size;
		val map = new HashMap<String, Integer>();
		//calculate the metric distribution
		g.allNodes.forEach[n|
			var coef = calculateMPC(n, g, typeCounts);
			
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
	
	override evaluateSamples(GraphStatistic g){
		val samples = new ArrayList<Double>();
		val typeCounts = g.allTypes.size;
		//calculate the metric distribution
		g.allNodes.forEach[
			samples.add(calculateMPC(it, g, typeCounts));
		]
		
		return samples;
	}
	
	def double calculateMPC(EObject n, GraphStatistic g, int typeCounts){
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
		if(Double.isNaN(coef)){
			coef = 0;
		}
		
		return Double.parseDouble(formatter.format(coef));
	}
}