package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
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

	def static getNDAfromNHLattice(PartialInterpretation pm) {
		return getNDAfromNHLattice(pm, 1)
	}

	def static getNDAfromNHLattice(PartialInterpretation pm, Integer depth) {
		// Get NH Lattice and deepLattice
		val nh = neighbourhoodComputer.createRepresentation(pm, depth + 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		return(getNDAfromNHLattice(nhDeepRep, nhRep, depth))

	}

	def static getNDAfromNHLattice(HashMap nhDeepRep, HashMap nhRep, Integer depth) {
		//initialisations
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		// Calculations		
		val Map<String, Set<AbstractNodeDescriptor>> dim2ActNodes = newHashMap

		for (node : nhDeepNodes) {
			val nodeFND = node as FurtherNodeDescriptor
			for (edge : nodeFND.incomingEdges.keySet) {
				val edgeDesc = edge as IncomingRelation<AbstractNodeDescriptor>
				val dimName = edgeDesc.type
				if (dim2ActNodes.keySet.contains(dimName)) {
					dimName.lookup(dim2ActNodes).add(edgeDesc.from)
				} else {
					dim2ActNodes.put(dimName, newHashSet(edgeDesc.from))
				}
			}

			for (edge : nodeFND.outgoingEdges.keySet) {
				val edgeDesc = edge as OutgoingRelation<AbstractNodeDescriptor>
				val dimName = edgeDesc.type
				if (dim2ActNodes.keySet.contains(dimName)) {
					dimName.lookup(dim2ActNodes).add(edgeDesc.to)
				} else {
					dim2ActNodes.put(dimName, newHashSet(edgeDesc.to))
				}
			}
		}

		// calculations
		var totalNDA = 0.0
		for (actNodes : dim2ActNodes.values) {
			for (actNode : actNodes) {
				val numInstances = actNode.lookup(nhRep) as Integer
				totalNDA += numInstances
			}
		}

		val numDims = dim2ActNodes.keySet.length
		val avgNDA = totalNDA / numDims
		return avgNDA
	}
}
