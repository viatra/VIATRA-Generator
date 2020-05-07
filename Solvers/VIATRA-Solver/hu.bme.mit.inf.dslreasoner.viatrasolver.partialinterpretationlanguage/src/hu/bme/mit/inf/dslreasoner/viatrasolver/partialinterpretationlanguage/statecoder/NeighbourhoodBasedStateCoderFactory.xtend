package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodOptions
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2Hash
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2NeighbourhoodRepresentation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.ArrayList
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IPatternMatch

class NeighbourhoodBasedStateCoderFactory extends AbstractNeighbourhoodBasedStateCoderFactory {
	new() {
	}

	new(NeighbourhoodOptions options) {
		super(options)
	}

	override protected doCreateStateCoder(NeighbourhoodOptions options) {
		new NeighbourhoodBasedPartialInterpretationStateCoder(new PartialInterpretation2ImmutableTypeLattice, options)
	}
}

class NeighbourhoodBasedHashStateCoderFactory extends AbstractNeighbourhoodBasedStateCoderFactory {
	new() {
	}

	new(NeighbourhoodOptions options) {
		super(options)
	}

	override protected doCreateStateCoder(NeighbourhoodOptions options) {
		new NeighbourhoodBasedPartialInterpretationStateCoder(new PartialInterpretation2Hash, options)
	}
}

class NeighbourhoodBasedPartialInterpretationStateCoder<ModelRep, NodeRep> extends AbstractNeighbourhoodBasedPartialInterpretationStateCoder {
	val PartialInterpretation2NeighbourhoodRepresentation<ModelRep, NodeRep> calculator
	var Map<DefinedElement, ? extends NodeRep> nodeRepresentations = null
	var ModelRep modelRepresentation = null

	new(PartialInterpretation2NeighbourhoodRepresentation<ModelRep, NodeRep> calculator, NeighbourhoodOptions options) {
		super(options)
		this.calculator = calculator
	}

	override protected isRefreshNeeded() {
		nodeRepresentations === null || modelRepresentation === null
	}

	override doRefreshStateCodes(PartialInterpretation target, NeighbourhoodOptions options) {
		val code = calculator.createRepresentation(target, options)
		modelRepresentation = code.modelRepresentation
		nodeRepresentations = code.nodeRepresentations
	}

	override doCreateActivationCode(IPatternMatch match) {
		val size = match.specification.parameters.size
		val res = new ArrayList(size)
		var int equivalenceHash = 0
		val prime = 31

		for (var int index = 0; index < size; index++) {
			val matchArgument = match.get(index)
			res.add(getCode(matchArgument))
			for (var i = 0; i < index; i++) {
				val number = if (matchArgument === match.get(i)) {
						1
					} else {
						0
					}
				equivalenceHash = prime * equivalenceHash + number
			}
		}

		match.specification.fullyQualifiedName -> (res -> equivalenceHash).hashCode
	}

	def private getCode(Object o) {
		switch (o) {
			DefinedElement:
				nodeRepresentations.get(o)
			default:
				getFallbackCode(o)
		}
	}

	override doCreateStateCode() {
		modelRepresentation.hashCode
	}

	override doInvalidate() {
		nodeRepresentations = null
		modelRepresentation = null
	}
}
