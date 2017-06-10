package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import java.util.Map
import org.eclipse.xtend.lib.annotations.Data

@Data class NeighbourhoodWithTraces<ModelRep,NodeRep> {
	ModelRep modelRepresentation
	Map<DefinedElement,? extends NodeRep> nodeRepresentations
	NeighbourhoodWithTraces<ModelRep,NodeRep> previousRepresentation
}
