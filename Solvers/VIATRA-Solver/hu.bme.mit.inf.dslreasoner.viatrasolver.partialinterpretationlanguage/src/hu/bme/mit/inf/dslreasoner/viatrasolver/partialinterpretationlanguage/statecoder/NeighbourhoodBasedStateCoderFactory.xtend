package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodOptions
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
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
		new NeighbourhoodBasedPartialInterpretationStateCoder(options)
	}

}

class NeighbourhoodBasedPartialInterpretationStateCoder extends AbstractNeighbourhoodBasedPartialInterpretationStateCoder {
	val calculator = new PartialInterpretation2ImmutableTypeLattice

	var Map<DefinedElement, ? extends AbstractNodeDescriptor> nodeRepresentations = null
	var Map<? extends AbstractNodeDescriptor, Integer> modelRepresentation = null

	new(NeighbourhoodOptions options) {
		super(options)
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
		var int index = 0
		var int equivalenceHash = 0
		val prime = 31

		while (index < size) {
			res.add(getCode(match.get(index)))
			index++
			for (var i = 0; i < index; i++) {
				val number = if (match.get(index) === match.get(i)) {
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
