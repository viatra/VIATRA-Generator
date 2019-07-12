package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
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

class CalcNA {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph

	def static getNAfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		var totalNA = 0.0
		val numNodes = nodes.length

		// fill HashSet
		var Map<EObject, Set<String>> node2ActiveDims = new HashMap
		for (node : nodes) {
			node2ActiveDims.put(node, new HashSet)
		}

		// iterate over nodes and their references
		for (node : nodes) {
			for (reference : node.eClass.EAllReferences) {
				val pointingTo = node.eGet(reference)

				if (!(pointingTo instanceof List)) {
					if (pointingTo !== null) {
						// Add for source
						node.lookup(node2ActiveDims).add(reference.name)
						// Add for target
						(pointingTo as EObject).lookup(node2ActiveDims).add(reference.name)
					}
				} else {
					val pointingToSet = pointingTo as List
					if (!pointingToSet.empty) {
						for (target : pointingToSet) {
							// Add for source
							node.lookup(node2ActiveDims).add(reference.name)
							// Add for target
							(target as EObject).lookup(node2ActiveDims).add(reference.name)
						}
					}
				}
			}
		}

		// Measure NA
		for (activeDims : node2ActiveDims.values) {
			totalNA += activeDims.length
		}

		val averageNA = totalNA / numNodes

		return averageNA
	}
	
	def static getNAfromNHLattice(PartialInterpretation partialModel) {
		getNAfromNHLattice(partialModel, 1)
	}

	def static getNAfromNHLattice(PartialInterpretation partialModel, Integer depth) {
		// Get required neighbourhoods
		val nh = neighbourhoodComputer.createRepresentation(partialModel, depth+1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		// Storing active dims in a HashMap
		var Map<AbstractNodeDescriptor, Set<String>> node2ActiveDims = new HashMap

		// fill activeDims with empty lists for each node descriptor
		for (nhNode : nhNodes) {
			node2ActiveDims.put(nhNode as AbstractNodeDescriptor, new HashSet)
		}

		// populate node2ActiveDims HashMap
		for (nhDeepNode : nhDeepNodes) {
			val nhDeepNodeDesc = nhDeepNode as FurtherNodeDescriptor
			val nhParentNode = (nhDeepNodeDesc.previousRepresentation as AbstractNodeDescriptor)
			// for incoming Edges
			for (inEdge : nhDeepNodeDesc.incomingEdges.keySet) {
				val edgeDim = (inEdge as IncomingRelation).type
				nhParentNode.lookup(node2ActiveDims).add(edgeDim)
			}

			// for outgoing Edges
			for (outEdge : nhDeepNodeDesc.outgoingEdges.keySet) {
				val edgeDim = (outEdge as OutgoingRelation).type
				nhParentNode.lookup(node2ActiveDims).add(edgeDim)
			}
		}

		// Get NAs per node, considering the number of occurences in the partialModel
		var totalNA = 0.0
		var numModelElems = 0
		for (nhNode : node2ActiveDims.keySet) {
			var activeDimsForNode = nhNode.lookup(node2ActiveDims)
			var numNodeOccurences = nhNode.lookup(nhRep) as Integer

			// ASSUME THAT THERE IS NO NODE WITHOUT ANY CONNECTIONS
			// ^valid assumption because of containment edges
			if (!activeDimsForNode.empty) {
				totalNA += (activeDimsForNode.length * numNodeOccurences)
				numModelElems += numNodeOccurences
			}
		}

		// return average NA
		
		var averageNAwithWeight = 0.0
		if(totalNA != 0) {
			averageNAwithWeight = totalNA / numModelElems
		}
		return averageNAwithWeight

	}

	def static getNAfromNHShape(PartialInterpretation pm) {
		getNAfromNHShape(pm, 1)
	}

	def static getNAfromNHShape(PartialInterpretation partialModel, Integer depth) {
		// Get NH Shape
		val nh = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val nhShapeGraph = neighbouhood2ShapeGraph.createShapeGraph(nh, partialModel)

		// Useful variable initializations
		var totalMetricValue = 0.0
		var numNodesTotal = 0
		var Set<Object> activeDims = new HashSet

		// look at the in and out edges of each shape node
		for (node : nhShapeGraph.nodes) {
			for (inEdge : node.incomingEdges) {
				activeDims.add(inEdge.type)
			}
			for (outEdge : node.outgoingEdges) {
				activeDims.add(outEdge.type)
			}

			// Measure preliminary results for NA
			val numOccurrences = node.correspondingAND.lookup(nhRep) as Integer
			val numActDims = activeDims.length
			val totalActDims = numActDims * numOccurrences

			numNodesTotal += numOccurrences
			totalMetricValue += totalActDims
			activeDims.clear
		}
		
		var averageMetricValue = 0.0
		if(totalMetricValue != 0) {
			averageMetricValue = totalMetricValue / numNodesTotal
		}
		return averageMetricValue

	}
}
