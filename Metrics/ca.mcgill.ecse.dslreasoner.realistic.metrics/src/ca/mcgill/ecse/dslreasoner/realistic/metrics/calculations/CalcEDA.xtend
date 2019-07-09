package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.MetricsCalculationUsingShapes

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcEDA {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph

	def static getEDAfromModel(EObject model) {
		val Map<EObject, Integer> dim2Occ = Util.dim2NumOccurencesFromModel(model)

		print("Real  :")
		MetricsCalculationUsingShapes.printer(dim2Occ)
		println()

		var totalEDA = Util.sum(dim2Occ.values)
		val numDims = dim2Occ.keySet.length
		val avgEDA = Double.valueOf(totalEDA) / numDims
		return avgEDA
	}

	def static getEDAfromNHShape(PartialInterpretation pm) {
		return getEDAfromNHShape(pm, 1, 0)
	}

	def static getEDAfromNHShape(PartialInterpretation pm, Integer depth, Integer vers) {
		// Get NH Shape
		val nh = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val gs = neighbouhood2ShapeGraph.createShapeGraph(nh, pm)

		// TODO make below map from OutgoingRelationGND to value
		// calculations
		val nodes = gs.nodes as List<GraphNodeDescriptorGND>

		val Map<String, Double> dim2Occ = new HashMap
		var newVal = 0.0
		for (node : nodes) {
			for (dim : node.outgoingEdges) {
				val dimName = dim.type
				val numNodeOcc = node.correspondingAND.lookup(nhRep) as Integer
				val numNodeChildren = dim.sourceDistrib.size

				val toNode = dim.to
				val numToNodeOcc = toNode.correspondingAND.lookup(nhRep) as Integer
				val numToNodeChildren = dim.targetDistrib.size

				var amountToAdd = 0.0

				switch vers {
					case 0:
						amountToAdd = (Util.sum(dim.sourceDistrib) * numNodeOcc / numNodeChildren) // +
//					Util.sum(dim.targetDistrib) * numToNodeOcc / numToNodeChildren) /2
					case 1:
						amountToAdd = (Util.sum(dim.targetDistrib) * numToNodeOcc / numToNodeChildren)
					default:
						amountToAdd = (Util.sum(dim.sourceDistrib) * numNodeOcc / numNodeChildren +
							Util.sum(dim.targetDistrib) * numToNodeOcc / numToNodeChildren) / 2.0
				}

				if (dim2Occ.keySet.contains(dimName)) {
					newVal = dimName.lookup(dim2Occ) + amountToAdd
				} else {
					newVal = amountToAdd
				}
				dim2Occ.put(dimName, newVal)
			}
		}
		println("Calc    :" + dim2Occ)
		// calculations
		var totalEDA = Util.sum2(dim2Occ.values)
		val numDims = dim2Occ.keySet.length
		val avgEDA = Double.valueOf(totalEDA) / numDims
		return avgEDA
	}
}
