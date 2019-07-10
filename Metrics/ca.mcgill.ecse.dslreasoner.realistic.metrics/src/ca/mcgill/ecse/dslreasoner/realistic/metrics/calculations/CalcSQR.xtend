package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcSQR {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	def static getSQRfromModel(EObject model) {
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

		// Measurements
		var totalC = 0.0
		var max2ndNeighbours = 0.0
		var tot2ndNeighbours = 0.0
		var num1stNeighbours = 0.0
		for (node : nodes) {
			val neighbours = node.lookup(node2Neighbours)
			num1stNeighbours = neighbours.size
			max2ndNeighbours = 0
			tot2ndNeighbours = 0
			var numSquares = 0.0
			for (neighbour1 : neighbours) {
				for (neighbour2 : neighbours) {
					if (neighbour1 != neighbour2) {
						val neighsOfNeigh = neighbour1.lookup(node2Neighbours)
						tot2ndNeighbours += neighsOfNeigh.size
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
//			val num2ndNeighbours = num1stNeighbours * max2ndNeighbours
			val num2ndNeighbours = tot2ndNeighbours
			
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

	def static getSQRfromNHLattice(PartialInterpretation pm, Integer v) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}
	def static getSQRfromNHLattice(PartialInterpretation pm, Integer depth, Integer v) {
		return 0.0
	}
}
