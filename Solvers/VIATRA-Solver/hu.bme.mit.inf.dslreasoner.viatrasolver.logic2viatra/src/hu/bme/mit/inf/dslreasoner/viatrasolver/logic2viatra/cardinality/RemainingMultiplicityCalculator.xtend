package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.Iterator
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
abstract class MultiplicityCalculator<Match extends IPatternMatch> {
	val ViatraQueryMatcher<Match> matcher

	def getMultiplicity() {
		val iterator = matcher.streamAllMatches.iterator
		getMultiplicity(iterator)
	}
	
	def getMultiplicity(PartialInterpretation interpretation) {
		val partialMatch = matcher.newEmptyMatch
		partialMatch.set(0, interpretation.problem)
		partialMatch.set(1, interpretation)
		val iterator = matcher.streamAllMatches(partialMatch).iterator
		getMultiplicity(iterator)
	}

	protected def int getMultiplicity(Iterator<? extends Match> iterator)
}

class RemainingMultiplicityCalculator<Match extends IPatternMatch> extends MultiplicityCalculator<Match> {
	val int bound

	@FinalFieldsConstructor
	private new() {
	}

	protected override getMultiplicity(Iterator<? extends Match> iterator) {
		var res = 0
		while (iterator.hasNext) {
			val match = iterator.next
			val existingMultiplicity = match.get(3) as Integer
			if (existingMultiplicity < bound) {
				res += bound - existingMultiplicity
			}
		}
		res
	}
	
	static def <Match extends IPatternMatch> of(ViatraQueryMatcher<Match> matcher, int bound) {
		if (bound < 0) {
			new RemainingInfiniteMultiplicityCalculator(matcher)
		} else {
			new RemainingMultiplicityCalculator(matcher, bound)
		}
	}
}

package class RemainingInfiniteMultiplicityCalculator<Match extends IPatternMatch> extends MultiplicityCalculator<Match> {
	
	@FinalFieldsConstructor
	package new() {
	}
	
	protected override getMultiplicity(Iterator<? extends Match> iterator) {
		if (iterator.hasNext) {
			-1
		} else {
			0
		}
	}
}

@FinalFieldsConstructor
class UnrepairableMultiplicityCalculator<Match extends IPatternMatch> extends MultiplicityCalculator<Match> {
	val int lowerBound
	
	override protected getMultiplicity(Iterator<? extends Match> iterator) {
		var res = 0
		while (iterator.hasNext) {
			val match = iterator.next
			val existingMultiplicity = match.get(3) as Integer
			if (existingMultiplicity < lowerBound) {
				val missingMultiplcity = lowerBound - existingMultiplicity
				val numerOfRepairMatches = match.get(4) as Integer
				val unrepairableMultiplicty = missingMultiplcity - numerOfRepairMatches
				if (unrepairableMultiplicty > res) {
					res = unrepairableMultiplicty
				}
			}
		}
		res
	}
}

@FinalFieldsConstructor
class RemainingInverseMultiplicityCalculator<Match extends IPatternMatch> extends MultiplicityCalculator<Match> {
	val int upperBound
	
	override protected getMultiplicity(Iterator<? extends Match> iterator) {
		var res = 0
		while (iterator.hasNext) {
			val match = iterator.next
			val existingMultiplicity = match.get(3) as Integer
			if (existingMultiplicity < upperBound) {
				val availableMultiplicity = upperBound - existingMultiplicity
				val numberOfRepairMatches = match.get(4) as Integer
				res += Math.min(availableMultiplicity, numberOfRepairMatches)
			}
		}
		res
	}
}
