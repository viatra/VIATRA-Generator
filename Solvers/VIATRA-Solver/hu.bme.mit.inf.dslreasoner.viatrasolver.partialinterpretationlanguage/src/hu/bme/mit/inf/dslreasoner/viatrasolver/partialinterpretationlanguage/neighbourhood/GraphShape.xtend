package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

@Data class GraphShape<ModelRep, NodeRep> {
	List<GraphNodeDescriptor> nodes
	NeighbourhoodWithTraces<ModelRep, NodeRep> correspondingNH
	Map<AbstractNodeDescriptor, GraphNodeDescriptor> abstract2graphNodes
	
	new(List<GraphNodeDescriptor> nodes, NeighbourhoodWithTraces<ModelRep, NodeRep> correspondingNH, Map<AbstractNodeDescriptor, GraphNodeDescriptor> abstract2graphNodes) {
		this.nodes = nodes
		this.correspondingNH = correspondingNH
		this.abstract2graphNodes = abstract2graphNodes
	}
}

//@Data class GraphNodeDescriptor<gndRep, andRep> {
//	AbstractNodeDescriptor correspondingAND
//	// String id
//	Map<IncomingRelation<gndRep>, List<Integer>> incomingEdges
//	Map<OutgoingRelation<gndRep>, List<Integer>> outgoingEdges
//
//	new(AbstractNodeDescriptor correspondingNode) {
//		this.correspondingAND = correspondingNode
//		this.incomingEdges = new HashMap
//		this.outgoingEdges = new HashMap
//	}
//}

 
 @Data class GraphNodeDescriptor<gndRep, andRep> {
	AbstractNodeDescriptor correspondingAND
	List<IncomingRelationGND> incomingEdges
	List<OutgoingRelationGND> outgoingEdges

	new(AbstractNodeDescriptor correspondingNode) {
		this.correspondingAND = correspondingNode
		this.incomingEdges = newArrayList
		this.outgoingEdges = newArrayList
	}
}

@Data abstract class IncomingRelationGND {
	GraphNodeDescriptor from
	String type
	List<Integer> sourceDistrib
	List<Integer> targetDisrib
	
	new(GraphNodeDescriptor from, String type) {
		this.from = from
		this.type = type
		this.sourceDistrib = newArrayList
		this.targetDisrib = newArrayList
		
	}
}

@Data abstract class OutgoingRelationGND {
	GraphNodeDescriptor to
	String type
	List<Integer> sourceDistrib
	List<Integer> targetDisrib
	
	new(GraphNodeDescriptor from, String type) {
		this.to = to
		this.type = type
		this.sourceDistrib = newArrayList
		this.targetDisrib = newArrayList
		
	}
}
