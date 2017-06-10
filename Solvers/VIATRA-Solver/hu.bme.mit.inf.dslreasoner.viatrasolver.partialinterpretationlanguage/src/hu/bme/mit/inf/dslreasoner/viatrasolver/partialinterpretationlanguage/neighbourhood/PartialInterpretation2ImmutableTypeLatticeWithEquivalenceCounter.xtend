package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import java.util.Map
import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.HashMap

class PartialInterpretation2ImmutableTypeLatticeWithEquivalenceCounter extends
	PartialInterpretation2NeighbourhoodRepresentation<
		Map<? extends AbstractNodeDescriptor,Integer>, // <- Model Descriptor
		AbstractNodeDescriptor> // <- Node Descriptor
	{
		
	protected new() {
		super(true,false)
	}
	
	override protected createLocalRepresentation(Map<DefinedElement, LocalNodeDescriptor> node2Representation, Map<LocalNodeDescriptor, Integer> representation2Amount) {
		return new NeighbourhoodWithTraces(node2Representation.immutableCopy,node2Representation.immutableCopy,null)
	}
	
	override protected createFurtherRepresentation(
		Map<FurtherNodeDescriptor<AbstractNodeDescriptor>, Integer> nodeDescriptors,
		Map<DefinedElement, FurtherNodeDescriptor<AbstractNodeDescriptor>> node2Representation,
		NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> previous,
		boolean deepRepresentation
	) {
		if(deepRepresentation) {
			return new NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor>(nodeDescriptors,node2Representation,previous)
		} else {
			return new NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor>(nodeDescriptors,node2Representation,null)
		}
	}
	
	public def finalRepresentation(NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>,AbstractNodeDescriptor> representation) {
		val node2Representation = representation.nodeRepresentations
		val node2LocalRepresentation = new HashMap
		//val localRepresentation2Node = new HashMap
		for(entry: node2Representation.entrySet) {
			val node = entry.key
			val localNodeDescriptor = entry.value.toLocalDescriptor
			node2LocalRepresentation.put(node,localNodeDescriptor)
		}
		
	}
	
	public def LocalNodeDescriptor toLocalDescriptor(AbstractNodeDescriptor descriptor) {
		if(descriptor instanceof LocalNodeDescriptor) {
			return descriptor
		} else if(descriptor instanceof FurtherNodeDescriptor<?>) {
			(descriptor.previousRepresentation as AbstractNodeDescriptor).toLocalDescriptor
		} else throw new IllegalArgumentException('''Unsupported descriptor type: «descriptor.class.simpleName»''')
	}
	
	
}
