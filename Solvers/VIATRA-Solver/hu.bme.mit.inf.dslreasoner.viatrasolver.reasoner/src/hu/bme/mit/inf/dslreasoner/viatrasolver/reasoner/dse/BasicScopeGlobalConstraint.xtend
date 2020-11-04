package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import java.util.Comparator
import java.util.List
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.viatra.dse.objectives.IGlobalConstraint
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class BasicScopeGlobalConstraint implements IGlobalConstraint, IObjective {
	val PartialInterpretation p
	val List<ScopeAssertion> assertions

	new(PartialInterpretation p) {
		this.p = p
		assertions = ImmutableList.copyOf(p.scopes.map [
			val currentSize = targetTypeInterpretation.elements.size
			val minElements = minNewElements + currentSize
			val maxElements = if (maxNewElements < 0) {
				-1
			} else {
				maxNewElements + currentSize
			}
			new ScopeAssertion(minElements, maxElements, targetTypeInterpretation)
		])
	}

	override init(ThreadContext context) {
		if (context.model != p) {
			throw new IllegalArgumentException(
				"Partial model must be passed to the constructor of BasicScopeGlobalConstraint")
		}
	}

	override checkGlobalConstraint(ThreadContext context) {
		assertions.forall[upperBoundSatisfied]
	}

	override getFitness(ThreadContext context) {
		var double fitness = p.minNewElements
		for (assertion : assertions) {
			if (!assertion.lowerBoundSatisfied) {
				fitness += 1
			}
		}
		fitness
	}

	override satisifiesHardObjective(Double fitness) {
		fitness <= 0.01
	}

	override BasicScopeGlobalConstraint createNew() {
		this
	}

	override getName() {
		class.name
	}

	override getComparator() {
		Comparators.LOWER_IS_BETTER
	}

	override getLevel() {
		2
	}

	override isHardObjective() {
		true
	}

	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException
	}

	override setLevel(int level) {
		throw new UnsupportedOperationException
	}

	@FinalFieldsConstructor
	private static class ScopeAssertion {
		val int lowerBound
		val int upperBound
		val PartialTypeInterpratation typeDefinitions

		private def getCount() {
			typeDefinitions.elements.size
		}

		private def isLowerBoundSatisfied() {
			count >= lowerBound
		}

		private def isUpperBoundSatisfied() {
			upperBound < 0 || count <= upperBound
		}
	}
}
