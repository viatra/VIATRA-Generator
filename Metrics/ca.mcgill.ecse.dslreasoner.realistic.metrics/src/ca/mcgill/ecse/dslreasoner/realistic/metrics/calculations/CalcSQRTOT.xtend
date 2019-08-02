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

/////////////////////
//SQRCNT(v) = # squares containing v / total # squares in model
/////////////////////
class CalcSQRTOT extends CalcMetric {

	// ///////////////////
	// SQRTOT(v) = # squares containing v / total # of 2-jump paths from v
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
		var tot2ndNeighbours = 0.0
		var num1stNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			num1stNeighbours = neighbours.size
			tot2ndNeighbours = 0
			var numSquares = 0.0
//			println("xxxxxxxxxxxxxxxx")
//			println(neighbours)
//			println("xxxxxxxxxxxxxxxx")
			for (neighbour1 : neighbours) {
				val neighsOfNeigh = neighbour1.lookup(node2Neighbours)
				tot2ndNeighbours += neighsOfNeigh.size - 1 // -1 to not consider edge to self
				for (neighbour2 : neighbours) {
					if (neighbour1 != neighbour2) {
						for (neighOfNeigh1 : neighsOfNeigh) {
							if (neighOfNeigh1 != node && neighOfNeigh1.lookup(node2Neighbours).contains(neighbour2)) {
//								print("-----")
//								print(neighbour1)
//								print("   ")
//								print(neighbour2)
//								print("   ")
//								print(neighOfNeigh1)
//								println()
								numSquares++
							}
						}

					}
				}
			}

//			println(node)
			val num2ndNeighbours = tot2ndNeighbours

//			print("(" + numSquares + "x" + num2ndNeighbours)
			var sqr = 0.0
			if (num2ndNeighbours != 0) {
				sqr = numSquares / num2ndNeighbours
			}

//			println("=" + sqr + ")")
//			println()
			totalSQR += sqr
		}
		val numNodes = nodes.length
		val avgC = totalSQR / numNodes

		return avgC
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

		// Operations
		val Map<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>> deep2shallowNeighbours = new HashMap

		for (deepNode : nhDeepNodes) {
			deep2shallowNeighbours.put(deepNode as FurtherNodeDescriptor, new HashMap)
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
//					println(deepNodeDesc.lookup(deep2shallowNeighbours))
//					println()
//				print(edgeFromAND.lookup(deepNodeDesc.lookup(deep2shallowNeighbours)) as Integer)
			}
			for (outEdge : deepNodeDesc.outgoingEdges.keySet) {
				val edgeDesc = (outEdge as OutgoingRelation)
				val edgeToAND = edgeDesc.to as AbstractNodeDescriptor
				Util.putInside(deepNodeDesc, edgeToAND, outEdge.lookup(deepNodeDesc.outgoingEdges) as Integer,
					deep2shallowNeighbours)
			}
//			print
//			deep2shallowNeighbours.put(deepNodeDesc, neighbours)
		}

//		print(deep2shallowNeighbours)
		var totalSQR = 0.0
		var tot2ndNeighbours = 0.0
		for (deepNode : nhDeepNodes) {
			val deepNodeDesc = deepNode as FurtherNodeDescriptor
			var numSquares = 0.0
			if (!Util.toLocalNode(deepNodeDesc).types.empty) {
//				print("in-")
				// get neighbours
				val Set<AbstractNodeDescriptor> relevantNodes = deepNodeDesc.lookup(deep2shallowNeighbours).keySet
//				print(relevantNodes)
				// look for 2ndNeighbours
				for (rel1 : relevantNodes) {
					for (rel2 : relevantNodes) {
						if (rel1 != rel2) {
//							print("in2-")
							for (pot2ndN : nhDeepNodes) {
								if (deepNode != pot2ndN) {
//									print("in3-")
									// find neighbours
									val pot2ndNDesc = pot2ndN as FurtherNodeDescriptor
									val Set<AbstractNodeDescriptor> neighbours = pot2ndNDesc.lookup(
										deep2shallowNeighbours).keySet

//									print(neighbours)
//									print(rel1)
									// see if pot2ndN is 2nd Neighbour
									if (neighbours.contains(rel1)) {

										// consider multiplicity of the link from pot2ndN to rel1
										// consider # occurences of pot2ndN and of rel1
//										tot2ndNeighbours++//V1
//										tot2ndNeighbours += (pot2ndN.lookup(nhDeepRep) as Integer * rel1.lookup(nhRep) as Integer)//V2
										tot2ndNeighbours +=
											( rel1.lookup(pot2ndNDesc.lookup(deep2shallowNeighbours)) as Integer) // V3
									}

									// see if square exists
									if (neighbours.contains(rel1) && neighbours.contains(rel2)) {
										// consider multiplicity of the link from pot2ndN to rel1
										// consider # occurences of pot2ndN and of rel1
//										numSquares++//V1
//										numSquares += (pot2ndN.lookup(nhDeepRep) as Integer * rel1.lookup(nhRep) as Integer * rel2.lookup(nhRep) as Integer)//V2
										numSquares +=
											(rel1.lookup(pot2ndNDesc.lookup(deep2shallowNeighbours)) as Integer *
												rel2.lookup(pot2ndNDesc.lookup(deep2shallowNeighbours)) as Integer) // V3
									}
								}
							}
						}
					}
				}
			}
			var sqr = 0.0
			if (tot2ndNeighbours != 0) {
				sqr = numSquares / tot2ndNeighbours
			}
//			println(numSquares + "/" + tot2ndNeighbours)
			totalSQR += sqr

		}

		val numDeepNodes = nhDeepNodes.length

		var averageSQR = 0.0
		if (totalSQR != 0) {
			averageSQR = totalSQR / numDeepNodes
		}

		return averageSQR
	}
}


