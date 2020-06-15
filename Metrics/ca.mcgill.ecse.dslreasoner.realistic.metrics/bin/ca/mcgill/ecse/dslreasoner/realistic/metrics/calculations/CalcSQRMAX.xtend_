package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcSQRMAX extends CalcMetric{

	// ///////////////////
	// SQRMAX(v) = # squares containing v / (# neighbours of v * max # of neeighbours of any neighbour of v)
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

	override calcFromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	override calcFromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}