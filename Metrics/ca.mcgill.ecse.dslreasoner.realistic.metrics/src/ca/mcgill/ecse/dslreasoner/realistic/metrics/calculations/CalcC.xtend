package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcC {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getCfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		for (node : nodes) {
			node2Neighbours.put(node, new HashSet)
		}

		// iterate over nodes and add connected nodes
		for (node : nodes) {
			for (reference : node.eClass.EAllReferences) {
				val pointingTo = node.eGet(reference)

				if (!(pointingTo instanceof List)) {
					if (pointingTo !== null) {
						// Add for source
						node.lookup(node2Neighbours).add(pointingTo as EObject)
						// Add for target
						(pointingTo as EObject).lookup(node2Neighbours).add(node)
					}
				} else {
					val pointingToSet = pointingTo as List
					if (!pointingToSet.empty) {
						for (target : pointingToSet) {
							// Add for source
							node.lookup(node2Neighbours).add(target as EObject)
							// Add for target
							(target as EObject).lookup(node2Neighbours).add(node)
						}
					}
				}
			}
		}
		
		//Measurements
		var totalC = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			val numNeighbours = neighbours.length
			var numTriangles = 0.0
			for (neighbour1 : neighbours) {
				for(neighbour2 : neighbours) {
					if (neighbour1 != neighbour2) {
						if(neighbour1.lookup(node2Neighbours).contains(neighbour2)) {
							numTriangles++
						}
					}
				}
			}
//			println(node)
//			println(numTriangles)
//			println(numNeighbours)
			
			var c = numTriangles / numNeighbours / (numNeighbours-1)
			totalC += c
			
//			println(c)
			
		}
		val numNodes = nodes.length
		val avgC = totalC / numNodes

		return avgC
	}

	def static getCfromNHLattice(PartialInterpretation pm) {
		return getCfromNHLattice(pm, 2)
	}

	def static getCfromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get required neighbourhoods
		val nh = neighbourhoodComputer.createRepresentation(pm, depth+1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		// Storing neighbours in a HashMap
		var Map<AbstractNodeDescriptor, Set<AbstractNodeDescriptor>> node2Neighbours = new HashMap

		// fill neighbours with empty lists for each node descriptor
		for (nhNode : nhNodes) {
			node2Neighbours.put(nhNode as AbstractNodeDescriptor, new HashSet)
		}

		// populate node2ActiveDims HashMap
		for (nhDeepNode : nhDeepNodes) {
			val nhDeepNodeDesc = nhDeepNode as FurtherNodeDescriptor
			val nhParentNode = (nhDeepNodeDesc.previousRepresentation as AbstractNodeDescriptor)
			// for incoming Edges
			for (inEdge : nhDeepNodeDesc.incomingEdges.keySet) {
				val edgeDesc = inEdge as IncomingRelation
				nhParentNode.lookup(node2Neighbours).add(edgeDesc.from as AbstractNodeDescriptor)
			}

			// for outgoing Edges
			for (outEdge : nhDeepNodeDesc.outgoingEdges.keySet) {
				val edgeDesc = outEdge as OutgoingRelation
				nhParentNode.lookup(node2Neighbours).add(edgeDesc.to as AbstractNodeDescriptor)
			}
		}
		
		var totalC = 0.0
		for (node : nhNodes) {
			val nodeAND = node as AbstractNodeDescriptor
			val neighbours = nodeAND.lookup(node2Neighbours)
			val numNeighbours = neighbours.length
			var numTriangles = 0.0
			for (neighbour1 : neighbours) {
				for(neighbour2 : neighbours) {
					if (neighbour1 != neighbour2) {
						if(neighbour1.lookup(node2Neighbours).contains(neighbour2)) {
							numTriangles++
						}
					}
				}
			}
//			println(node)
//			println(numTriangles)
//			println(numNeighbours)
			
			var c = numTriangles / numNeighbours / (numNeighbours-1)
			totalC += c
			
//			println(c)
			
		}
		val numNodes = nodes.length
		val avgC = totalC / numNodes

		return avgC
	}
}
