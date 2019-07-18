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
class CalcSQRTOT {

	// ///////////////////
	// SQRTOT(v) = # squares containing v / total # of 2-jump paths from v
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRTOTfromModel(EObject model) {
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

	def static getSQRTOTfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQRTOTfromNHLattice(PartialInterpretation pm, Integer depth) {
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

class CalcSQRMAX {

	// ///////////////////
	// SQRMAX(v) = # squares containing v / (# neighbours of v * max # of neeighbours of any neighbour of v)
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRMAXfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalC = 0.0
		var max2ndNeighbours = 0.0
		var num1stNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			num1stNeighbours = neighbours.size
			max2ndNeighbours = 0
			var numSquares = 0.0
			for (neighbour1 : neighbours) {
				for (neighbour2 : neighbours) {
					if (neighbour1 != neighbour2) {
						val neighsOfNeigh = neighbour1.lookup(node2Neighbours)
						if (max2ndNeighbours < neighsOfNeigh.size) {
							max2ndNeighbours = neighsOfNeigh.size
						}
						for (neighOfNeigh1 : neighsOfNeigh) {
							if (neighOfNeigh1 != node && neighOfNeigh1.lookup(node2Neighbours).contains(neighbour2)) {
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
			val num2ndNeighbours = num1stNeighbours * max2ndNeighbours

//			print("(" + numSquares + "x" + num2ndNeighbours)
			var sqr = 0.0
			if (num2ndNeighbours != 0) {
				sqr = numSquares / num2ndNeighbours
			}

//			println("=" + sqr + ")")
			totalC += sqr
		}
		val numNodes = nodes.length
		val avgC = totalC / numNodes

		return avgC
	}

	def static getSQRMAXfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQRMAXfromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQROSZ {

	// ///////////////////
	// SQROSZ(v) = # depth-4 paths that lead to v / 
	// (# 1-d neighs * # 2-d neighs * # 3-d neighs * # 4-d neighs) (NOT MEANINGFUL????)
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQROSZfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var totalDenom = 0.0
		var num1stNeighbours = 0.0
		var num2ndNeighbours = 0.0
		var num3rdNeighbours = 0.0
		var num4thNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			num1stNeighbours = neighbours.size

			for (neighbour1 : neighbours) {
				val neighbours1 = neighbour1.lookup(node2Neighbours)
				num2ndNeighbours = neighbours1.size

				for (neighbour2 : neighbours1) {
					val neighbours2 = neighbour2.lookup(node2Neighbours)
					num3rdNeighbours = neighbours2.size

					for (neighbour3 : neighbours2) {
						val neighbours3 = neighbour3.lookup(node2Neighbours)
						num4thNeighbours = neighbours3.size

						if (neighbours3.contains(node)) {
							totalSQR += 1
						}
						totalDenom += num1stNeighbours * num2ndNeighbours * num3rdNeighbours * num4thNeighbours
					}
				}
			}
		}
		val avgSQR = totalSQR / totalDenom

		return avgSQR
	}

	def static getSQROSZfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQROSZfromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQROSZ2 {

	// ///////////////////
	// SQROSZ2(v) = # depth-4 paths that lead to v / total # depth-4 paths
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQROSZ2fromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var totalDenom = 0.0
		var num4thNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)

			for (neighbour1 : neighbours) {
				val neighbours1 = neighbour1.lookup(node2Neighbours)

				for (neighbour2 : neighbours1) {
					val neighbours2 = neighbour2.lookup(node2Neighbours)

					for (neighbour3 : neighbours2) {
						val neighbours3 = neighbour3.lookup(node2Neighbours)
						num4thNeighbours = neighbours3.size

						if (neighbours3.contains(node)) {
							totalSQR += 1
						}
						totalDenom += num4thNeighbours
					}
				}
			}
		}
		val avgSQR = totalSQR / totalDenom

		return avgSQR
	}

	def static getSQROSZ2fromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQROSZ2fromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQROCOOL {

	// ///////////////////
	// SQROCOOL (v) = (# 1-d neighs * # 1-d neighs ) / (# 1-d neighs * # 1-d neighs * # depth-2 paths from v)
	// 1 / # depth-2 paths from v
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQROCOOLfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		// fill HashSet
		var Map<EObject, Set<EObject>> node2Neighbours = new HashMap
		Util.fillWithNodes(nodes, node2Neighbours)

		// iterate over nodes and add connected nodes
		Util.getNeighboursList(nodes, node2Neighbours)

		// Measurements
		var totalSQR = 0.0
		var totalDenom = 0.0
		var num4thNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)

			for (neighbour1 : neighbours) {

				for (neighbour2 : neighbours) {

					for (neighbour3 : neighbours) {
						val neighbours3 = neighbour3.lookup(node2Neighbours)
						num4thNeighbours = neighbours3.size

						if (neighbours3.contains(node)) {
							totalSQR += 1
						}
						totalDenom += num4thNeighbours
					}
				}
			}
		}
		val avgSQR = totalSQR / totalDenom

		return avgSQR
	}

	def static getSQROCOOLfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQROCOOLfromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}

class CalcSQRCNT {

	// ///////////////////
	// SQRCNT(v) = # neighbour pairs of v that are linked by a 2-jump path / 
	// (# neighbours of v * (#neighbours of v - 1) )
	// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRCNTfromModel(EObject model) {
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

	def static getSQRCNTfromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	def static getSQRCNTfromNHLattice(PartialInterpretation pm, Integer depth) {
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

class CalcSQRNUM {

// ///////////////////
// SQRNUM = calculate # of squares
// ///////////////////
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRNUMfromModel(EObject model) {
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

	def static getSQRNUMfromNHLattice(PartialInterpretation pm) {
		return getSQRNUMfromNHLattice(pm, 5)
	}

	def static getSQRNUMfromNHLattice(PartialInterpretation pm, Integer depth) {
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
