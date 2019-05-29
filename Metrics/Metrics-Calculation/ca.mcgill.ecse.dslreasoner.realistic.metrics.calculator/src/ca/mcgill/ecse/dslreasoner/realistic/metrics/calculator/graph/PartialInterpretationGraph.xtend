package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BooleanElementImpl
import java.util.ArrayList
import java.util.List

class PartialInterpretationGraph extends Graph{
	
	/**
	 * Define a new PartialInterpretationGraph by parse every element from a PartialInterpretation
	 */
	new(PartialInterpretation partial, List<Metric> metrics, String name){		
		//the edge types are defined in terms of RelationDeclaration
		partial.problem.relations.filter(RelationDeclaration).forEach[
			this.statistic.addType(it.name);
		]
		// add all elements
		val elements = getElements(partial);
		for(element : elements){
			statistic.addNode(element)
		}
		
		for(relationInterpretation : partial.partialrelationinterpretation) {
			val type = relationInterpretation.interpretationOf.name
			
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
	
	private def getElements(PartialInterpretation partial){
		return partial.newElements.filter[!(it instanceof BooleanElementImpl)] + partial.problem.elements;
	}
	
	override getStatistic() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getName() {
		return name;
	}
	
}