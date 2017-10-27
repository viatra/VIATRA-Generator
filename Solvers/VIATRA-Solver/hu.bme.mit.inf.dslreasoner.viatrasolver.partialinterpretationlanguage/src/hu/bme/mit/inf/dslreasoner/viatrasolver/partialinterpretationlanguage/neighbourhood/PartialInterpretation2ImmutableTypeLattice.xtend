package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import java.util.Map

class PartialInterpretation2ImmutableTypeLattice extends PartialInterpretation2NeighbourhoodRepresentation<
		Map<? extends AbstractNodeDescriptor,Integer>,//ModelRep
		AbstractNodeDescriptor//NodeRep
	>{
	
	public new() {
		super(false, true)
	}
	public new(boolean deeprepresnetation, boolean mergeSimilarNeighbourhood) {
		super(deeprepresnetation,mergeSimilarNeighbourhood)
	}
	
	override protected createLocalRepresentation(Map<DefinedElement, LocalNodeDescriptor> node2Representation, Map<LocalNodeDescriptor, Integer> representation2Amount) {
		val res = new NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor>(
			representation2Amount,
			node2Representation,
			null
		)
		return res
	}
	
	override protected createFurtherRepresentation(Map<FurtherNodeDescriptor<AbstractNodeDescriptor>, Integer> nodeDescriptors, Map<DefinedElement, FurtherNodeDescriptor<AbstractNodeDescriptor>> node2Representation, NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> previous, boolean deepRepresentation) {
		if(deepRepresentation) {
			return new NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor>(nodeDescriptors,node2Representation,previous)
		} else {
			return new NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor>(nodeDescriptors,node2Representation,null)
		}
	}
}
