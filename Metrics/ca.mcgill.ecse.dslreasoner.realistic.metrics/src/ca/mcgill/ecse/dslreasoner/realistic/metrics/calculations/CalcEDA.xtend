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
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor

class CalcEDA {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph

	def static getEDAfromModel(EObject model) {
		val Map<EObject, Integer> dim2Occ = Util.dim2NumOccurencesFromModel(model)

		var totalEDA = Util.sumInt(dim2Occ.values)
		val numDims = dim2Occ.keySet.length
		
		var avgEDA = 0.0
		if (Double.valueOf(totalEDA) != 0) {
			avgEDA = Double.valueOf(totalEDA) / numDims
		} 
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
						amountToAdd = (Util.sumInt(dim.sourceDistrib) * numNodeOcc / numNodeChildren) // +
//					Util.sum(dim.targetDistrib) * numToNodeOcc / numToNodeChildren) /2
					case 1:
						amountToAdd = (Util.sumInt(dim.targetDistrib) * numToNodeOcc / numToNodeChildren)
					default:
						amountToAdd = (Util.sumInt(dim.sourceDistrib) * numNodeOcc / numNodeChildren +
							Util.sumInt(dim.targetDistrib) * numToNodeOcc / numToNodeChildren) / 2.0
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
		var totalEDA = Util.sumDbl(dim2Occ.values)
		val numDims = dim2Occ.keySet.length

		var avgEDA = 0.0
		if (Double.valueOf(totalEDA) != 0) {
			avgEDA = Double.valueOf(totalEDA) / numDims
		}
		return avgEDA
	}

	def static getEDAfromNHLattice(PartialInterpretation pm) {
		return getEDAfromNHLattice(pm, 0)
	}

	def static getEDAfromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get NH Lattice and deepLattice
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		// TODO make below map from OutgoingRelation to value
		// calculations
		val Map<String, Double> dim2Occ = new HashMap
		var newVal = 0.0
		for (node : nhDeepNodes) {
			val nodeFND = node as FurtherNodeDescriptor<AbstractNodeDescriptor>
			for (dim : nodeFND.outgoingEdges.keySet) {
				val dimName = dim.type
				val numNodeOcc = nodeFND.lookup(nhDeepRep) as Integer
				val numEdgeOcc = dim.lookup(nodeFND.outgoingEdges)

				var amountToAdd = numNodeOcc * numEdgeOcc

				if (dim2Occ.keySet.contains(dimName)) {
					newVal = dimName.lookup(dim2Occ) + amountToAdd
				} else {
					newVal = amountToAdd
				}
				dim2Occ.put(dimName, newVal)
			}
		}
		// calculations
		var totalEDA = Util.sumDbl(dim2Occ.values)
		val numDims = dim2Occ.keySet.length
		
		var avgEDA = 0.0
		if (Double.valueOf(totalEDA) != 0) {
			avgEDA = Double.valueOf(totalEDA) / numDims
		} 
		return avgEDA
	}
}
