package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import java.util.Map
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement

class PartialInterpretation2Hash extends PartialInterpretation2NeighbourhoodRepresentation<Integer, Integer>{
	
	protected new() {
		super(false, true)
	}
	
	override protected createLocalRepresentation(Map<DefinedElement, LocalNodeDescriptor> node2Representation, Map<LocalNodeDescriptor, Integer> representation2Amount) {
		return new NeighbourhoodWithTraces(
			representation2Amount.hashCode,node2Representation.mapValues[it.hashCode],
			null)
	}
	
	override protected createFurtherRepresentation(Map<FurtherNodeDescriptor<Integer>, Integer> nodeDescriptors, Map<DefinedElement, FurtherNodeDescriptor<Integer>> node2Representation, NeighbourhoodWithTraces<Integer, Integer> previous, boolean deepRepresentation) {
		return new NeighbourhoodWithTraces(
			nodeDescriptors.hashCode,
			node2Representation.mapValues[it.hashCode],
			if(deepRepresentation) {previous} else {null})
	}
	
}
