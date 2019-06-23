package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

@Data class GraphShape<ModelRep, NodeRep> {
	List<GraphNodeDescriptorGND> nodes
	NeighbourhoodWithTraces<ModelRep, NodeRep> correspondingNH
	Map<AbstractNodeDescriptor, GraphNodeDescriptorGND> abstract2graphNodes

	new(List<GraphNodeDescriptorGND> nodes, NeighbourhoodWithTraces<ModelRep, NodeRep> correspondingNH,
		Map<AbstractNodeDescriptor, GraphNodeDescriptorGND> abstract2graphNodes) {
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

//
//@Data class IncomingRelationGeneralized {
//	IncomingRelation inRel
//	FurtherNodeDescriptor targetNode
//	
//	new(IncomingRelation inRel,	FurtherNodeDescriptor targetNode) {
//		this.inRel = inRel
//		this.targetNode = targetNode
//	}
//}
@Data class GraphNodeDescriptorGND {
	Integer uniqueID
	AbstractNodeDescriptor correspondingAND
	List<IncomingRelationGND> incomingEdges
	List<OutgoingRelationGND> outgoingEdges

	new(AbstractNodeDescriptor correspondingNode, Integer uniqueID) {
		this.uniqueID = uniqueID
		this.correspondingAND = correspondingNode
		this.incomingEdges = newArrayList
		this.outgoingEdges = newArrayList
	}
}

@Data class IncomingRelationGND {
	GraphNodeDescriptorGND from
	String type
	List<Integer> sourceDistrib
	List<Integer> targetDistrib

	new(GraphNodeDescriptorGND from, String type) {
		this.from = from
		this.type = type
		this.sourceDistrib = newArrayList
		this.targetDistrib = newArrayList

	}
}

@Data class OutgoingRelationGND {
	GraphNodeDescriptorGND to
	String type
	List<Integer> sourceDistrib
	List<Integer> targetDistrib

	new(GraphNodeDescriptorGND to, String type) {
		this.to = to
		this.type = type
		this.sourceDistrib = newArrayList
		this.targetDistrib = newArrayList

	}
}
