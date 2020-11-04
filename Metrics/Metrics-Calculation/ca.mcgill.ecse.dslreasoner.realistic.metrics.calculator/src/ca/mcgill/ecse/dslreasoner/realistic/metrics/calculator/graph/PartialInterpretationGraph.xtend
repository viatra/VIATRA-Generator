package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl
import java.util.ArrayList
import java.util.List

class PartialInterpretationGraph extends Graph{
	val typeToExclude = "undefinedpart";
	val classSuffix = " class";
	
	/**
	 * Define a new PartialInterpretationGraph by parse every element from a PartialInterpretation
	 */
	new(PartialInterpretation partial, List<Metric> metrics, String name){		
		//the edge types are defined in terms of RelationDeclaration
		partial.problem.relations.filter(RelationDeclaration).forEach[
			//only need the name of the reference type (remove everything with and after "reference")
			var n = it.name.split(" ").get(0);
				this.statistic.addEdgeType(n);
		]
		// add all elements
		val typeInterpretations = getTypes(partial);
		for(type : typeInterpretations){
			//Only consider the most concrete class
			if(isConcreteType(type.interpretationOf)){
				var typeName = type.interpretationOf.name.replace(classSuffix, '');
				for(node : type.elements){
					if(!this.statistic.containsNode(node)){
						this.statistic.addNodeWithType(node, typeName);
					}else{
						// if the current type of the node is a super type of the type to check, 
						// substitute the current type with the new type
						var currentType = statistic.getTypesForNode(node).get(0);
						if(isSuperType(currentType, type.interpretationOf)){
							statistic.overwriteCurrentType(node, typeName);
						}
					}
				}
			}
		}
		
		for(relationInterpretation : partial.partialrelationinterpretation) {
			//only need the name of the reference type (remove everything with and after "reference")
			val type = relationInterpretation.interpretationOf.name.split(" ").get(0);
			for(edge : relationInterpretation.relationlinks.filter(BinaryElementRelationLink)){
				statistic.addEdge(edge.param1, edge.param2, type);
			}	
		}	
		
		this.name = name;
		this.metrics = metrics;	
	}
	
	/**
	 * recursively check if a type is the super type of another
	 */
	 def boolean isSuperType(String typeName, Type subtypeToCheck){
	 	var superTypes = subtypeToCheck.supertypes;
	 	if(superTypes.size == 0){
	 		return false;
	 	}else if(subtypeToCheck.supertypes.map[it.name.replace(classSuffix, '')].contains(typeName)){
	 		return true;
	 	}else{
	 		for(superType : superTypes){
	 			if(isSuperType(typeName, superType)){
	 				return true;
	 			}
	 		}
	 		return false;
	 	}
	 }
	 
	 /**
	  * Check if a Type object is the class that we want to consider
	  *	A type object is to be considered if it satisfy one of the following:
	  * 	1. if it is not abstract
	  * 	2. if it is abstract but has a subclass of type TypeDefinition (This means the generation is
	  * 	   started with nodes in this type) 
	  */
	def boolean isConcreteType(Type t){
		if(!t.isAbstract || t.subtypes.findFirst[it instanceof TypeDefinition] !== null){
			return true;
		}
		return false;
	}
	
	/**
	 * Set basic information for the output
	 */
	override setBasicInformation(ArrayList<ArrayList<String>> output){
		val metaInfo = new ArrayList<String>();
		metaInfo.add(META_MODEL_HEADER);
		metaInfo.add(this.metaModel);
		
		val edgeInfo = new ArrayList<String>();
		edgeInfo.add(NUM_EDGE_TYPE_HEADER);
		edgeInfo.add(this.statistic.allTypes.size()+"");
		
		val nodeInfo = new ArrayList<String>();
		nodeInfo.add(NUM_NODE_HEADER);
		nodeInfo.add(this.statistic.allNodes.size()+"");
		
		val stateInfo = new ArrayList<String>();
		stateInfo.add(STATE_ID_HEADER);
		stateInfo.add(this.name);
		
		output.add(metaInfo);
		output.add(edgeInfo);
		output.add(nodeInfo);
		output.add(stateInfo);
	}
	
	private def getTypes(PartialInterpretation partial){
		//only the complex type interpretations are the ones defined in meta model
		//do not care about undefined types as it will be included in the class type
		return partial.partialtypeinterpratation.filter(PartialComplexTypeInterpretationImpl)
												.filter[!it.interpretationOf.name.toLowerCase.contains(typeToExclude)];
	}
	
	override getStatistic() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getName() {
		return name;
	}
	
}