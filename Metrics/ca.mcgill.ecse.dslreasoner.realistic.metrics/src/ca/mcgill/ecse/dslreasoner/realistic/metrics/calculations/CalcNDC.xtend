package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
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
		
		var NDC = 0.0
		if(NDA != 0 ) {
			NDC = NDA / numNodes
		}
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

		var NDC = 0.0
		if(NDA != 0 ) {
			NDC = NDA / numNodes
		}
		return NDC
	}

	def static getNDCfromNHLattice(PartialInterpretation pm) {
		return getNDCfromNHLattice(pm, 1)
	}

	def static getNDCfromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get NH Lattice and deepLattice
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap

		// calculations
		val NDA = CalcNDA.getNDAfromNHLattice(nhDeepRep, nhRep, depth)
		val nodes = nhRep.keySet
		var numNodes = 0

		// calculations
		for (node : nodes) {
			val nodeAND = node as AbstractNodeDescriptor
			if (!Util.toLocalNode(nodeAND).types.empty) {
				numNodes += nodeAND.lookup(nhRep) as Integer
			}
		}

		var NDC = 0.0
		if(NDA != 0 ) {
			NDC = NDA / numNodes
		}
		return NDC
	}
}
