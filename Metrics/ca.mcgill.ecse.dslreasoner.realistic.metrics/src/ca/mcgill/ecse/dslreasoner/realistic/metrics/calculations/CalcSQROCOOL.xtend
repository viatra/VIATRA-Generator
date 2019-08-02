package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcSQROCOOL extends CalcMetric {

	// ///////////////////
	// SQROCOOL (v) = (# 1-d neighs * # 1-d neighs ) / (# 1-d neighs * # 1-d neighs * # depth-2 paths from v)
	// 1 / # depth-2 paths from v
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

	override calcFromNHLattice(PartialInterpretation pm) {
		return 0.0
//		return getCfromNHLattice(pm, 2, v)
	}

	override calcFromNHLattice(PartialInterpretation pm, Integer depth) {
		return 0.0
	}
}
