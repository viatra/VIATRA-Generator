package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap
import java.util.HashMap
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.EObject

class GraphStatistic {
	val incomingEdges = new HashMap<String, Multimap<EObject, EObject>>;
	val outcomingEdges = new HashMap<String, Multimap<EObject, EObject>>;
	
	val edgeTypes = new HashSet<String>();
	val nodes = new HashSet<EObject>();
		
	/**
	 * Add an edge type to to the graph
	 * @param type: type to add
	 */
	def void addType(String type){
		if(edgeTypes.contains(type)){
	  		return;
	  	}
		edgeTypes.add(type);
		incomingEdges.put(type, ArrayListMultimap.create());
		outcomingEdges.put(type, ArrayListMultimap.create());
	}
	
	/**
	 * Add a node to he graph 
	 * @param node: node to add
	 */
	 def void addNode(EObject n){
	 	if(nodes.contains(n)){
	 		return;
	 	}
	 	
	 	nodes.add(n);
	 }
	 
	 /**
	  * Add an edge to the graph
	  * @param source: source node
	  * @param target: target node
	  * @param type: type of the reference
	  */
	  def void addEdge(EObject source, EObject target, String type){
	  	outcomingEdges.get(type).put(source, target);
	  	incomingEdges.get(type).put(target, source);
	  }
	  
	  /**
	   * calculate the out degree for an object
	   */
	  def int outDegree(EObject o){
		var count = 0;
		
	  	for (String type : edgeTypes){
	  		count += outcomingEdges.get(type).get(o).size();
	  	}
	  	return count;
	  }
	  
	  /**
	   * calculate the in degree of an object
	   */
	  def int inDegree(EObject o){
	  	var count = 0;
	  	
	  	for (String type : edgeTypes){
	  		count += incomingEdges.get(type).get(o).size();
	  	}
	  	return count;
	  }
	  
	  /**
	   * calculate the dimentional degree of a node
	   */
	  def int dimentionalDegree(EObject o, String type){
	  	return incomingEdges.get(type).get(o).size() + outcomingEdges.get(type).get(o).size();
	  }
	  
	  /**
	   * calculate the number of edge types for a given degree.
	   */
	  def int numOfEdgeTypes(EObject o){
	  	var count = 0;
	  	
	  	for(String type : edgeTypes){
	  		if(dimentionalDegree(o, type) > 0){
	  			count++;
	  		}
	  	}
	  	
	  	return count;
	  }
	  
	  def List<String> getAllTypes(){
	  	return edgeTypes.toList();
	  }
	  
	  def List<EObject> getAllNodes(){
	  	return nodes.toList();
	  }
}

