package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import java.util.Map
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement

class FurtherNodeDescriptorWithEquivalenceCounter extends FurtherNodeDescriptor<AbstractNodeDescriptor> {
	
	new(AbstractNodeDescriptor previousRepresentation,
		Map<IncomingRelation<AbstractNodeDescriptor>, Integer> incomingEdges,
		Map<OutgoingRelation<AbstractNodeDescriptor>, Integer> outgoingEdges,
		Map<DefinedElement, FurtherNodeDescriptor<AbstractNodeDescriptor>> node2Representation)
	{
		super(previousRepresentation, incomingEdges, outgoingEdges)
	}

}