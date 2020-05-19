package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodOptions
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PairwiseNeighbourhoodRepresentation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2PairwiseNeighbourhoodRepresentation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.ArrayList
import org.eclipse.viatra.query.runtime.api.IPatternMatch

class PairwiseNeighbourhoodBasedStateCoderFactory extends AbstractNeighbourhoodBasedStateCoderFactory {
	new() {
	}

	new(NeighbourhoodOptions options) {
		super(options)
	}

	override protected doCreateStateCoder(NeighbourhoodOptions options) {
		new PairwiseNeighbourhoodBasedPartialInterpretationStateCoder(options)
	}
}

class PairwiseNeighbourhoodBasedPartialInterpretationStateCoder extends AbstractNeighbourhoodBasedPartialInterpretationStateCoder {
	val calculator = new PartialInterpretation2PairwiseNeighbourhoodRepresentation(
		new PartialInterpretation2ImmutableTypeLattice)
	var PairwiseNeighbourhoodRepresentation<? extends AbstractNodeDescriptor> representation

	new(NeighbourhoodOptions options) {
		super(options)
	}

	override protected isRefreshNeeded() {
		representation === null
	}

	override protected doRefreshStateCodes(PartialInterpretation target, NeighbourhoodOptions options) {
		representation = calculator.createRepresentation(target, options)
	}

	override protected doCreateActivationCode(IPatternMatch match) {
		val size = match.specification.parameters.size
		val res = new ArrayList(size * size)
		for (var int i = 0; i < size; i++) {
			val a = match.get(i)
			for (var int j = 0; j < size; j++) {
				val b = match.get(j)
				res.add(getPairwiseRepresentation(a, b))
			}
		}
		match.specification.fullyQualifiedName -> res.hashCode
	}

	private def getPairwiseRepresentation(Object a, Object b) {
		if (b instanceof DefinedElement) {
			if (a instanceof DefinedElement) {
				representation.getPairwiseRepresentation(a, b)
			} else {
				representation.getBasicRepresentation(b)
			}
		} else {
			getFallbackCode(b)
		}
	}

	override protected doCreateStateCode() {
		representation.modelRepresentation.hashCode
	}

	override protected doInvalidate() {
		representation = null
	}
}
