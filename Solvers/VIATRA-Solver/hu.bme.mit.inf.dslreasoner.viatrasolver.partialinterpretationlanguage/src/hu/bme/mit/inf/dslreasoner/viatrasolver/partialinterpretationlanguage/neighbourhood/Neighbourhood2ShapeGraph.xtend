package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Neighbourhood2ShapeGraph {

	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def createShapeGraph(NeighbourhoodWithTraces n, PartialInterpretation pm) {
		val modRep = n.modelRepresentation as HashMap
		val depth = calculateDepth(modRep.keySet.get(0))
		return createShapeGraph(n, pm, depth)
	}

	def createShapeGraph(NeighbourhoodWithTraces n, PartialInterpretation pm, Integer depth) {

		// Maps for GraphShape Object
		val List<GraphNodeDescriptorGND> graphNodes = new ArrayList
		val Map<AbstractNodeDescriptor, GraphNodeDescriptorGND> AND2GND = new HashMap
		val Map<AbstractNodeDescriptor, List<FurtherNodeDescriptor>> AND2children = new HashMap

		val modRep = n.modelRepresentation as HashMap

		// BEGIN TRANSFORMATION	
		// SRTEP 1: get nodes and create GNDs
		for (nodeKey : modRep.keySet) {
			val correspondingLND = toCorrespondingLND(nodeKey)
			if (correspondingLND != null) {
				val nodeDesc = nodeKey as AbstractNodeDescriptor
				val graphNodeRep = new GraphNodeDescriptorGND(nodeDesc)
				AND2GND.put(nodeDesc, graphNodeRep)
				graphNodes.add(graphNodeRep)
			}

		}

		// STEP 2: calculate deeper neighbourhood
		val deeperNeighbourhood = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE,
			Integer.MAX_VALUE)
		val deepModRep = deeperNeighbourhood.modelRepresentation as HashMap

		// STEP3: Associate each deepNode to their parent
		for (deepNodeKey : deepModRep.keySet) {
			val deepNodeDesc = deepNodeKey as FurtherNodeDescriptor
			val parentDesc = deepNodeDesc.previousRepresentation as AbstractNodeDescriptor
			if (AND2GND.keySet.contains(parentDesc)) {
				if (AND2children.keySet.contains(parentDesc)) {
					parentDesc.lookup(AND2children).add(deepNodeDesc)
				} else {
					AND2children.put(parentDesc, newArrayList(deepNodeDesc))
				}
			}
		}

		// STEP 4: get edges for each Shape Graph Node
		for (currentNode : AND2children.keySet) {
			transformEdge(currentNode, AND2GND, AND2children)
		}

		// STEP 5: find corresponding in- and out- edges, and fill distributions accordingly
		for (node : graphNodes) {
			for (outEdge : node.outgoingEdges) {
				val toNode = outEdge.to
				for (inEdge : toNode.incomingEdges) {
					if (inEdge.from == node && inEdge.type == outEdge.type) {
						// outEdge and inEdge correspond to eachother
						// There should only be one
						outEdge.targetDistrib.addAll(inEdge.targetDistrib)
						inEdge.sourceDistrib.addAll(outEdge.sourceDistrib)
					}
				}
			}
		}

		// STEP 6: return graphShape object
		return new GraphShape(graphNodes, n, AND2GND)

	}

	protected def transformEdge(AbstractNodeDescriptor currentNode,
		Map<AbstractNodeDescriptor, GraphNodeDescriptorGND> AND2GND,
		Map<AbstractNodeDescriptor, List<FurtherNodeDescriptor>> children) {

		val List<IncomingRelationGND> inRelations = newArrayList
		val List<OutgoingRelationGND> outRelations = newArrayList

		// Get children of current shallow node 
		val List<FurtherNodeDescriptor> subNodes = currentNode.lookup(children)
		for (subNode : subNodes) {
			
			// handling outgoing edges
			for (outEdge : subNode.outgoingEdges.keySet) {
				val edgeRelation = (outEdge as OutgoingRelation)
				val edgeName = edgeRelation.type
				val edgePointingTo = (outEdge as OutgoingRelation).to as AbstractNodeDescriptor
				val edgePointingToGND = edgePointingTo.lookup(AND2GND)
				val edgeOutMultip = outEdge.lookup(subNode.outgoingEdges) as Integer

				var OutgoingRelationGND outRelation = null
				var needNew = true
				for (rel : outRelations) {
					if (rel.type == edgeName && rel.to == edgePointingToGND) {
						needNew = false
						outRelation = rel
					}
				}
				if (needNew) {
					outRelation = new OutgoingRelationGND(edgePointingToGND, edgeName)
					outRelation.sourceDistrib.add(edgeOutMultip)
					outRelations.add(outRelation)
				} else {
					outRelation.sourceDistrib.add(edgeOutMultip)
				}
			}

			// handling incoming edges
			for (inEdge : subNode.incomingEdges.keySet) {
				val edgeRelation = (inEdge as IncomingRelation)
				val edgeName = edgeRelation.type
				val edgePointingFrom = (inEdge as IncomingRelation).from as AbstractNodeDescriptor
				val edgePointingFromGND = edgePointingFrom.lookup(AND2GND)
				val edgeInMultip = inEdge.lookup(subNode.incomingEdges) as Integer

				var IncomingRelationGND inRelation = null
				var needNew = true
				for (rel : inRelations) {
					if (rel.type == edgeName && rel.from == edgePointingFromGND) {
						needNew = false
						inRelation = rel
					}
				}
				if (needNew) {
					inRelation = new IncomingRelationGND(edgePointingFromGND, edgeName)
					inRelation.targetDistrib.add(edgeInMultip)
					inRelations.add(inRelation)
				} else {
					inRelation.targetDistrib.add(edgeInMultip)
				}
			}
		}
		// fill in the 0 multiplicities (OUTGOING)
		for (outRelation : outRelations) {
			var outEdgesNum = outRelation.sourceDistrib.size
			val sourceChildrenNum = currentNode.lookup(children).size
			while (outEdgesNum != sourceChildrenNum) {
				outRelation.sourceDistrib.add(0)
				outEdgesNum++
			}
		}

		// fill in the 0 multiplicities (INCOMING)
		for (inRelation : inRelations) {
			var inEdgesNum = inRelation.targetDistrib.size
			val targetChildrenNum = currentNode.lookup(children).size
			while (inEdgesNum != targetChildrenNum) {
				inRelation.targetDistrib.add(0)
				inEdgesNum++
			}
		}

		// Complete modifications required for creation of graphShape Object cration
		val currentGND = currentNode.lookup(AND2GND)
		currentGND.outgoingEdges.addAll(outRelations)
		currentGND.incomingEdges.addAll(inRelations)
	}

	def calculateDepth(Object node) {
		var keyDescriptor = node
		var depth = 0
		while (!keyDescriptor.class.equals(LocalNodeDescriptor)) {
			keyDescriptor = (keyDescriptor as FurtherNodeDescriptor).previousRepresentation
			depth++
		}
		return depth
	}

	def protected toCorrespondingLND(Object nodeKey) {
		var topKeyDescriptor = nodeKey
		while (!topKeyDescriptor.class.equals(LocalNodeDescriptor)) {
			topKeyDescriptor = (topKeyDescriptor as FurtherNodeDescriptor).previousRepresentation
		}
		// Only keep relevant nodes
		if ((topKeyDescriptor as LocalNodeDescriptor).types.empty) {
			return null
		} else {
			return topKeyDescriptor as LocalNodeDescriptor
		}

	}
}
