package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcSQRNUM extends CalcMetric {

// ///////////////////
// SQRNUM = calculate # of squares
// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	override calcFromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var numSquares = 0.0
		for (node : nodes) {
			val neighboursD1 = node.lookup(node2Neighbours)

			for (neighbour1 : neighboursD1) {
				val neighboursD2 = neighbour1.lookup(node2Neighbours)

				for (neighbour2 : neighboursD2) {
					val neighboursD3 = neighbour2.lookup(node2Neighbours)

					for (neighbour3 : neighboursD3) {
						val neighboursD4 = neighbour3.lookup(node2Neighbours)

						if (neighboursD4.contains(node)) {
							numSquares++
						}
					}
				}
			}
		}
		print(numSquares + " ")
		return numSquares
	}

	override calcFromNHLattice(PartialInterpretation pm) {
		return calcFromNHLattice(pm, 5)
	}

	override calcFromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get required neighbourhoods
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

//		printMap(nhDeepRep, deep2shallowNeighbours)
		// Operations
		// Operations
		val Map<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>> deep2shallowNeighbours = new HashMap
		val Map<AbstractNodeDescriptor, Map<FurtherNodeDescriptor, Integer>> shallow2deepNeighbours = new HashMap

		for (deepNode : nhDeepNodes) {
			deep2shallowNeighbours.put(deepNode as FurtherNodeDescriptor, new HashMap)
		}

		for (node : nhNodes) {
			shallow2deepNeighbours.put(node as AbstractNodeDescriptor, new HashMap)
		}
		for (deepNode : nhDeepNodes) {

			// get neighbours
			val Map<AbstractNodeDescriptor, Integer> neighbours = new HashMap
			val deepNodeDesc = deepNode as FurtherNodeDescriptor
			for (inEdge : deepNodeDesc.incomingEdges.keySet) {
				val edgeDesc = (inEdge as IncomingRelation)
				val edgeFromAND = edgeDesc.from as AbstractNodeDescriptor
//				print(inEdge.lookup(deepNodeDesc.incomingEdges) as Integer)
				Util.putInside(deepNodeDesc, edgeFromAND, inEdge.lookup(deepNodeDesc.incomingEdges) as Integer,
					deep2shallowNeighbours)
				Util.putInside(edgeFromAND, deepNodeDesc, inEdge.lookup(deepNodeDesc.incomingEdges) as Integer,
					shallow2deepNeighbours)
//					println(deepNodeDesc.lookup(deep2shallowNeighbours))
//					println()
//				print(edgeFromAND.lookup(deepNodeDesc.lookup(deep2shallowNeighbours)) as Integer)
			}
			for (outEdge : deepNodeDesc.outgoingEdges.keySet) {
				val edgeDesc = (outEdge as OutgoingRelation)
				val edgeToAND = edgeDesc.to as AbstractNodeDescriptor
				Util.putInside(deepNodeDesc, edgeToAND, outEdge.lookup(deepNodeDesc.outgoingEdges) as Integer,
					deep2shallowNeighbours)
				Util.putInside(edgeToAND, deepNodeDesc, outEdge.lookup(deepNodeDesc.outgoingEdges) as Integer,
					shallow2deepNeighbours)
			}
//			print
//			deep2shallowNeighbours.put(deepNodeDesc, neighbours)
		}

//		print(deep2shallowNeighbours)
		var numSquares = 0.0
		for (n0 : nhDeepNodes) {
			val n0Desc = n0 as FurtherNodeDescriptor
			if (!Util.toLocalNode(n0Desc).types.empty) {

				val deepNodeMultip = n0Desc.lookup(nhDeepRep) as Integer
				val Set<AbstractNodeDescriptor> neighboursD1 = n0Desc.lookup(deep2shallowNeighbours).keySet

				for (n1 : neighboursD1) {
					val n1Multip = n1.lookup(nhRep) as Integer
					val Set<FurtherNodeDescriptor> neighboursD2 = n1.lookup(shallow2deepNeighbours).keySet

					for (n2 : neighboursD2) {
						val n2Multip = n2.lookup(nhDeepRep) as Integer
						val Set<AbstractNodeDescriptor> neighboursD3 = n2.lookup(deep2shallowNeighbours).keySet

						for (n3 : neighboursD3) {
							val n3Multip = n3.lookup(nhRep) as Integer
							val Set<FurtherNodeDescriptor> neighboursD4 = n3.lookup(shallow2deepNeighbours).keySet

							if (neighboursD4.contains(n0Desc)) {
//										numSquares++//V1
//										numSquares += (pot2ndN.lookup(nhDeepRep) as Integer * rel1.lookup(nhRep) as Integer * rel2.lookup(nhRep) as Integer)//V2
								val toAdd = (n1.lookup(n0Desc.lookup(deep2shallowNeighbours)) as Integer *
									n2.lookup(n1.lookup(shallow2deepNeighbours)) as Integer *
									n3.lookup(n2.lookup(deep2shallowNeighbours)) as Integer *
									n0Desc.lookup(n3.lookup(shallow2deepNeighbours)) as Integer * deepNodeMultip *
									n1Multip * n2Multip * n3Multip
												)
//								println(toAdd)
								numSquares += toAdd

							}
						}

					}
				}
			}

		}

		print(numSquares + " ")
		return numSquares

	}

	def static printMap(Map<AbstractNodeDescriptor, Integer> nhDeepRep,
		Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> map) {
		for (key : map.keySet) {
			println(key.lookup(nhDeepRep) + " " + key + " -> " + key.lookup(map))
		}
	}
}
