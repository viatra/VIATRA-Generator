package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic
import java.text.DecimalFormat
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import org.eclipse.emf.ecore.EObject

class TypedClusteringCoefficientMetric extends Metric {
	public static val countName = "TCCCount";
	public static val valueName = "TCCValue";
	val formatter = new DecimalFormat("#0.00000");    
	
	override evaluate(GraphStatistic g) {
		//because the precision issue of double, we translate double values into String to be the key
		
		val map = new HashMap<String, Integer>();
		//calculate the metric distribution
		g.allNodes.forEach[n|
			var coef = calculateTCC1(n, g);
			if(coef > 0){
				println(n);
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
	
	override evaluateSamples(GraphStatistic g){
		val samples = new ArrayList<Double>();
		//calculate the metric distribution
		g.allNodes.forEach[
			samples.add(calculateTCC1(it, g));
		]
		
		return samples;
	}

	/**
	 * Compute TCC1 metric for node n
	 */	
	def double calculateTCC1(EObject n, GraphStatistic g){
		var wedges = 0;
		var triangles = 0;

		for(type1 : g.allTypes){
			val typed1RelatedOfN = new HashSet<EObject>(g.outgoingEdges.get(type1).get(n));
			val type1EdgeSourceNodesOfN = new HashSet<EObject>(g.incomingEdges.get(type1).get(n));
			
			typed1RelatedOfN.addAll(type1EdgeSourceNodesOfN);
			
			
			
			// number of wedges
			val d = typed1RelatedOfN.size
			wedges += d * (d-1) // we will also count each closed triangle twice

			// pairs of neighbors
			for (n1: typed1RelatedOfN) {
				for (n2: typed1RelatedOfN) {
					for(type2 : g.allTypes){
						if ((type1 != type2) &&
							(g.outgoingEdges.get(type2).containsEntry(n1, n2) || 
							 g.outgoingEdges.get(type2).containsEntry(n2, n1)
						 	)) {
							triangles++
						}					
					}
				}
			}
		}		
		
		if (wedges == 0.0) {
			return 0.0
		} else {
			return (triangles as double)/wedges
		}
	}
}