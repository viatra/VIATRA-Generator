package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.Multimap
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

class GraphStatistic {
	val incomingEdges = new HashMap<String, Multimap<EObject, EObject>>;
	val outcomingEdges = new HashMap<String, Multimap<EObject, EObject>>;

	val edgeTypes = new HashSet<String>();
	val nodeToType = new HashMap<EObject, Set<String>>();	

	/**
	 * Add an edge type to to the graph
	 * @param type: type to add
	 */
	def void addEdgeType(String type){
		
		
		if(edgeTypes.contains(type)){
			return;
	  	}
	  	
		edgeTypes.add(type);
		incomingEdges.put(type, ArrayListMultimap.create());
		outcomingEdges.put(type, ArrayListMultimap.create());
	}
	
	/**
	 * Add a node to the graph with one type in its type hierarchy
	 * @param node: node to add
	 */
	 def void addNodeWithType(EObject n, String Type){
	 	var types = nodeToType.getOrDefault(n, new HashSet<String>());
	 	types.add(Type);
	 	nodeToType.put(n, types);
	 }
	 
	 /**
	  * Add a node to the graph with all types in its type hierarchy
	  */
	 def void addNodeWithAllTypes(EObject n, Set<String> types){
	 	nodeToType.put(n, types);
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
	   * calculate the number of edge types for a given node.
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
	  
	  def Map<EObject, Set<String>> getNodeToTypesMap(){
	  	return nodeToType;
	  }
	  
	  def List<EObject> getAllNodes(){
	  	return nodeToType.keySet().toList();
	  }
	  
	  def HashMap<String, Multimap<EObject, EObject>> getOutgoingEdges(){
	  	return outcomingEdges; 
	  }
	  
}

