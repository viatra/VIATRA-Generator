package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class CalcNDA {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph

	def static getNDAfromModel(EObject model) {
		val Map<EObject, Set<EObject>> dim2NumActNodes = Util.dim2NumActNodesFromModel(model)

		var totalNDA = 0.0
		for (actNodes : dim2NumActNodes.values) {
			totalNDA += actNodes.length
		}

		val numDims = dim2NumActNodes.keySet.length
		val avgNDA = totalNDA / numDims
		return avgNDA
	}

	def static getNDAfromNHShape(PartialInterpretation pm) {
		return getNDAfromNHShape(pm, 1)
	}

	def static getNDAfromNHShape(PartialInterpretation pm, Integer depth) {
		// Get NH Shape
		val nh = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val nhShapeGraph = neighbouhood2ShapeGraph.createShapeGraph(nh, pm)

		// TODO make below map from OutgoingRelationGND to value
		val Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodes = Util.dim2NumActNodesFromNHShape(nhShapeGraph)

		// calculations
		var totalNDA = 0.0
		for (actNodes : dim2NumActNodes.values) {
			for (actNode : actNodes) {
				val numInstances = actNode.lookup(nhRep) as Integer
				totalNDA += numInstances
			}
		}

		val numDims = dim2NumActNodes.keySet.length
		val avgNDA = totalNDA / numDims
		return avgNDA
	}
}
