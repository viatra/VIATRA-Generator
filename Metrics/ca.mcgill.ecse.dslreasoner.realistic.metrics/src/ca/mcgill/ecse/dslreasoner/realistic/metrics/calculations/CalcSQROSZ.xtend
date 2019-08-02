package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcSQROSZ extends CalcMetric {

	// ///////////////////
	// SQROSZ(v) = # depth-4 paths that lead to v / 
	// (# 1-d neighs * # 2-d neighs * # 3-d neighs * # 4-d neighs) (NOT MEANINGFUL????)
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

	override calcFromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	override calcFromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}