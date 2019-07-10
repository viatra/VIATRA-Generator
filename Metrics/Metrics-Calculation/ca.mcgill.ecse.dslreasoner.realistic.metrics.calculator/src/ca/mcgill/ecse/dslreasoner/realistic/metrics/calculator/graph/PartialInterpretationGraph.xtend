package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
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
			this.statistic.addEdgeType(it.name.split(" ").get(0));
		]
		// add all elements
		val typeInterpretations = getTypes(partial);
		for(type : typeInterpretations){
			var typeName = type.interpretationOf.name.replace(classSuffix, '');
			for(node : type.elements){
				this.statistic.addNodeWithType(node, typeName);
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