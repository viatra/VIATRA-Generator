package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcSQRCNT extends CalcMetric {

	// ///////////////////
	// SQRCNT(v) = # neighbour pairs of v that are linked by a 2-jump path / 
	// (# neighbours of v * (#neighbours of v - 1) )
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
		var totalSQR = 0.0
		var numNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			numNeighbours = neighbours.size
			var numSquares = 0.0
//			println("xxxxxxxxxxxxxxxx")
//			println(neighbours)
//			println("xxxxxxxxxxxxxxxx")
			for (neighbour1 : neighbours) {

				val neighsOfNeigh = neighbour1.lookup(node2Neighbours)

				for (neighbour2 : neighbours) {
					var foundSquare = false
					if (neighbour1 != neighbour2) {
						for (neighOfNeigh1 : neighsOfNeigh) {
							if (!foundSquare) {
								if (neighOfNeigh1 != node &&
									neighOfNeigh1.lookup(node2Neighbours).contains(neighbour2)) {
//								print("-----")
//								print(neighbour1)
//								print("   ")
//								print(neighbour2)
//								print("   ")
//								print(neighOfNeigh1)
//								println()
									numSquares++
									foundSquare = true
								}
							}
						}

					}
				}
			}

//			println(node)
//			print("(" + numSquares + "x" + num2ndNeighbours)
			var sqr = 0.0
			if (numSquares != 0) {
				sqr = numSquares / numNeighbours / (numNeighbours - 1 )
			}

//			println("=" + sqr + ")")
//			println()
			totalSQR += sqr
		}
		val numNodes = nodes.length
		var avgSQR = 0.0
		if (totalSQR != 0) {
			avgSQR = totalSQR / numNodes
		}

//		println("RESULT : " + avgSQR)
		return avgSQR
	}

	override calcFromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	override calcFromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get required neighbourhoods
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		val Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> deep2shallowNeighbours = new HashMap
		Util.getNeighbourSet(nhDeepNodes, deep2shallowNeighbours)

//		printMap(nhDeepRep, deep2shallowNeighbours)
		// Operations
		var totalSQR = 0.0
		var totNumNodes = 0.0
		var numNeighbours = 0.0
		for (deepNode : nhDeepNodes) {
			val deepNodeDesc = deepNode as FurtherNodeDescriptor
			if (!Util.toLocalNode(deepNodeDesc).types.empty) {
				// get neighbours
				val Set<AbstractNodeDescriptor> relevantNodes = deepNodeDesc.lookup(deep2shallowNeighbours)

				numNeighbours = relevantNodes.size // V1
				var numSquares = 0.0
				// look for 2ndNeighbours
				for (rel1 : relevantNodes) {
//					numNeighbours += rel1.lookup(nhRep) as Integer//V2
					for (rel2 : relevantNodes) {
						var foundSquare = false
						if (rel1 != rel2) {
							for (pot2ndN : nhDeepNodes) {
								if (!foundSquare) {
									if (deepNode != pot2ndN) {
										// find neighbours
										val pot2ndNDesc = pot2ndN as FurtherNodeDescriptor

										val Set<AbstractNodeDescriptor> neighbours = pot2ndNDesc.lookup(
											deep2shallowNeighbours)

										// see if square exists
										if (neighbours.contains(rel1) && neighbours.contains(rel2)) {
											numSquares++ // V1
//											numSquares += rel1.lookup(nhRep) as Integer * rel2.lookup(nhRep) as Integer//V2
											foundSquare = true
										}
									}
								}
							}
						}
					}
				}

				var sqr = 0.0
				if (numSquares != 0) {
					sqr = numSquares / numNeighbours / (numNeighbours - 1 )
				}

				var numOcc = deepNode.lookup(nhDeepRep) as Integer
				sqr *= numOcc
				totNumNodes += numOcc

				totalSQR += sqr

			}

		}

		var avgSQR = 0.0
		if (totalSQR != 0) {
			avgSQR = totalSQR / totNumNodes
		}
//		println("RESULT : " + avgSQR)
		return avgSQR
	}

	def static printMap(Map<AbstractNodeDescriptor, Integer> nhDeepRep,
		Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> map) {
		for (key : map.keySet) {
			println(key.lookup(nhDeepRep) + " " + key + " -> " + key.lookup(map))
		}
	}
}
