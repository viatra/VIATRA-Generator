package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcNDC extends CalcMetric2{
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph
	static val NDACalculator = new CalcNDA

	override calcFromModel(EObject model) {

		val ndaDistrib = NDACalculator.calcFromModel(model)
		val nodes = model.eResource.allContents.toList
		val numNodes = nodes.length
		
		val List<Double> metricDistrib = newArrayList
		for (nda : ndaDistrib) {
			var metVal = 0.0
			if (nda != 0) {
				metVal = nda / numNodes
			}
			metricDistrib.add(metVal)
			}

		return metricDistrib
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
		val NDA = NDACalculator.getNDAfromNHShape(pm, depth)
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

	override calcFromNHLattice(PartialInterpretation pm) {
		return calcFromNHLattice(pm, 1)
	}

	override calcFromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get NH Lattice and deepLattice
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap

		// calculations
		val ndaDistrib = NDACalculator.calcFromNHLattice(nhDeepRep, nhRep, depth)
		val nodes = nhRep.keySet
		var numNodes = 0

		// get number of nodes
		for (node : nodes) {
			val nodeAND = node as AbstractNodeDescriptor
			if (!Util.toLocalNode(nodeAND).types.empty) {
				numNodes += nodeAND.lookup(nhRep) as Integer
			}
		}
		
		//get distribution
		val List<Double> metricDistrib = newArrayList
		for (nda : ndaDistrib) {
			var metVal = 0.0
			if (nda != 0) {
				metVal = nda / numNodes
			}
			metricDistrib.add(metVal)
			}

		return metricDistrib
	}
}
