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
	
	new(List<GraphNodeDescriptor> nodes, NeighbourhoodWithTraces<ModelRep, NodeRep> correspondingNH) {
		this.nodes = nodes
		this.correspondingNH = correspondingNH
	}
}

@Data class GraphNodeDescriptor {
	LocalNodeDescriptor correspondingNode
	// String id
	Map<IncomingRelation<GraphNodeDescriptor>, List<Integer>> incomingEdges
	Map<OutgoingRelation<GraphNodeDescriptor>, List<Integer>> outgoingEdges

//	new(String id, Set<String> types) {
//		this.types = types
//		this.id = id
//		this.incomingEdges = new HashMap
//		this.outgoingEdges = new HashMap
//	}
	new(LocalNodeDescriptor correspondingNode) {
		this.correspondingNode = correspondingNode
		this.incomingEdges = new HashMap
		this.outgoingEdges = new HashMap
	}
}
