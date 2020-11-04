package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import java.util.Map
import org.eclipse.collections.api.factory.Maps

class PartialInterpretation2Hash extends PartialInterpretation2NeighbourhoodRepresentation<Integer, Integer>{
	
	new() {
		super(false, true)
	}
	
	override protected createLocalRepresentation(Map<DefinedElement, LocalNodeDescriptor> node2Representation, Map<LocalNodeDescriptor, Integer> representation2Amount) {
		return new NeighbourhoodWithTraces(
			representation2Amount.hashCode,node2Representation.hashValues,
			null)
	}
	
	override protected createFurtherRepresentation(Map<FurtherNodeDescriptor<Integer>, Integer> nodeDescriptors, Map<DefinedElement, FurtherNodeDescriptor<Integer>> node2Representation, NeighbourhoodWithTraces<Integer, Integer> previous, boolean deepRepresentation) {
		return new NeighbourhoodWithTraces(
			nodeDescriptors.hashCode,
			node2Representation.hashValues,
			if(deepRepresentation) {previous} else {null})
	}
	
	private def <T> hashValues(Map<DefinedElement, T> map) {
		val hashedMap = Maps.mutable.ofInitialCapacity(map.size)
		for (entry : map.entrySet) {
			hashedMap.put(entry.key, entry.value.hashCode)
		}
		hashedMap
	}
}
