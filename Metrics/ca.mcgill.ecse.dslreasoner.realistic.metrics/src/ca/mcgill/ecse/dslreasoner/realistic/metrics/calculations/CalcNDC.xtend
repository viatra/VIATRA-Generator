package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcNDC {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph

	def static getNDCfromModel(EObject model) {

		val NDA = CalcNDA.getNDAfromModel(model)
		val nodes = model.eResource.allContents.toList
		val numNodes = nodes.length
		val NDC = NDA / numNodes
		return NDC
	}

	def static getNDCfromNHShape(PartialInterpretation pm) {
		return getNDCfromNHShape(pm, 1)
	}

	def static getNDCfromNHShape(PartialInterpretation pm, Integer depth) {
		// Get NH Shape
		val nh = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val gs = neighbouhood2ShapeGraph.createShapeGraph(nh, pm)

		// calculations
		val NDA = CalcNDA.getNDAfromNHShape(pm, depth)
		val nodes = gs.nodes
		var numNodes = 0

		// calculations
		for (node : nodes) {
			numNodes += node.correspondingAND.lookup(nhRep) as Integer
		}

		val NDC = NDA / numNodes
		return NDC
	}
}
