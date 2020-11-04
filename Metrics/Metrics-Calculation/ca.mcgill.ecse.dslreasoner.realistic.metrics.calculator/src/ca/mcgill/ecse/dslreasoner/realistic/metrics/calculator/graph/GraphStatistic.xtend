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
	val outgoingEdges = new HashMap<String, Multimap<EObject, EObject>>;

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
		outgoingEdges.put(type, ArrayListMultimap.create());
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
	 
	 def boolean containsNode(EObject o){
	 	return nodeToType.containsKey(o);
	 }
	 
	 def Set<String> getTypesForNode(EObject o){
	 	return nodeToType.getOrDefault(o, new HashSet<String>());
	 }
	 
	 def void overwriteCurrentType(EObject o, String type){
	 	var typeSet = nodeToType.getOrDefault(o, new HashSet<String>());
	 	
	 	// clear current types
	 	typeSet.clear();
	 	typeSet.add(type);
	 	nodeToType.put(o, typeSet);
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
	  	outgoingEdges.get(type).put(source, target);
	  	incomingEdges.get(type).put(target, source);
	  }
	  
	  /**
	   * check if this graph contains a specific edge type
	   */
	   def boolean containsEdgeType(String typeName){
	   	 if(outgoingEdges.containsKey(typeName) && incomingEdges.containsKey(typeName)){
	   	 	return true;
	   	 }
	   	 return false;
	   }
	   
	   /**
	    * remove references from the statistics, potentially remove the nodes associated with it
	    * @Param name: name of the reference
	    * @Param isContainment: if true then the corresponding nodes on the incoming side will also be removed
	    */
	    def removeReference(String name, boolean isContainment){
	    	if(!edgeTypes.contains(name)){
	    		return;
	    	}
	    	
	    	edgeTypes.remove(name);
	    	var incomingSet = incomingEdges.remove(name);
	    	outgoingEdges.remove(name);
	    	
	    	// if the reference is not a containment, then removing the reference is enough
	    	if(!isContainment){
	    		return;
	    	}
	    	
	    	// else remove all corresponding nodes
	    	val nodesToRemove = incomingSet.keySet();
	    	
	    	//remove nodes from node sets
	    	nodesToRemove.forEach[nodeToType.remove(it)];
	    	
	    	val removeForMultimap = [Multimap<EObject, EObject> refMap| 
	    		nodesToRemove.forEach[refMap.removeAll(it)];
	    		var values = refMap.values()
	    		//remove the values from the list is equavalent to remove it in the multimap
	    		values.removeAll(nodesToRemove); 
	    		return;
	    	];
	    	
	    	//remove nodes from all other references on incomingEdges
	    	incomingEdges.values.forEach(removeForMultimap);
	    	outgoingEdges.values.forEach(removeForMultimap);
	    }
	  
	  /**
	   * calculate the out degree for an object
	   */
	  def int outDegree(EObject o){
		var count = 0;
		
	  	for (String type : edgeTypes){
	  		count += outgoingEdges.get(type).get(o).size();
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
	  	return incomingEdges.get(type).get(o).size() + outgoingEdges.get(type).get(o).size();
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
	  	return outgoingEdges; 
	  }
	  
	  def HashMap<String, Multimap<EObject, EObject>> incomingEdges(){
	  	return incomingEdges; 
	  }
	  
}

