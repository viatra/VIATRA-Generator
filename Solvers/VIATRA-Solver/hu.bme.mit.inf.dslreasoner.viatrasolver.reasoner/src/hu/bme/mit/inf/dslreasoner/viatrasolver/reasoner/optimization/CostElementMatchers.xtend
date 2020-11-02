package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.xtend.lib.annotations.Data
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation

@FunctionalInterface
interface ParameterScopeBound {
	def double getUpperBound()
}

@Data
class CostElementMatch {
	val IPatternMatch match
	val boolean must

	def isMulti() {
		CostElementMatchers.isMultiMatch(match)
	}
}

@Data
class CostElementMatchers {
	val ViatraQueryMatcher<? extends IPatternMatch> currentMatcher
	val ViatraQueryMatcher<? extends IPatternMatch> mayMatcher
	val ViatraQueryMatcher<? extends IPatternMatch> mustMatcher
	val List<ParameterScopeBound> parameterScopeBounds
	val int weight

	def getCurrentNumberOfMatches() {
		currentMatcher.countMatches
	}

	def getMinimumNumberOfMatches() {
		mustMatcher.countMatches
	}

	def getMaximumNumberOfMatches() {
		var double sum = 0
		val iterator = mayMatcher.streamAllMatches.iterator
		while (iterator.hasNext) {
			val match = iterator.next
			var double product = 1
			val numberOfParameters = parameterScopeBounds.size
			for (var int i = 0; i < numberOfParameters; i++) {
				if (isMulti(match.get(i + 2))) {
					val scopeBound = parameterScopeBounds.get(i)
					product *= scopeBound.upperBound
				}

			}
			sum += product
		}
		sum
	}

	def getMatches() {
		ImmutableList.copyOf(mayMatcher.streamAllMatches.iterator.map [ match |
			new CostElementMatch(match, mustMatcher.isMatch(match))
		])
	}
	
	def projectMayMatch(IPatternMatch match, int... indices) {
		mayMatcher.projectMatch(match, indices)
	}
	
	private static def <T extends IPatternMatch> projectMatch(ViatraQueryMatcher<T> matcher, IPatternMatch match, int... indices) {
		checkMatch(match)
		val n = matcher.specification.parameters.length - 2
		if (indices.length != n) {
			throw new IllegalArgumentException("Invalid number of projection indices")
		}
		val newMatch = matcher.newEmptyMatch
		newMatch.set(0, match.get(0))
		newMatch.set(1, match.get(1))
		for (var int i = 0; i < n; i++) {
			newMatch.set(i + 2, match.get(indices.get(i)))
		}
		if (!matcher.hasMatch(newMatch)) {
			throw new IllegalArgumentException("Projected match does not exist")
		}
		return newMatch
	}

	private static def <T extends IPatternMatch> isMatch(ViatraQueryMatcher<T> matcher, IPatternMatch match) {
		val n = matcher.specification.parameters.length
		if (n != match.specification.parameters.length) {
			throw new IllegalArgumentException("Invalid number of match arguments")
		}
		val newMatch = matcher.newEmptyMatch
		for (var int i = 0; i < n; i++) {
			newMatch.set(i, match.get(i))
		}
		return matcher.hasMatch(newMatch)
	}

	static def isMulti(Object o) {
		if (o instanceof EObject) {
			switch (feature : o.eContainmentFeature) {
				case LogicproblemPackage.eINSTANCE.logicProblem_Elements,
				case PartialinterpretationPackage.eINSTANCE.partialInterpretation_NewElements:
					false
				case PartialinterpretationPackage.eINSTANCE.partialInterpretation_OpenWorldElements:
					true
				default:
					throw new IllegalStateException("Unknown containment feature for element: " + feature)
			}
		} else {
			false
		}
	}

	static def isMultiMatch(IPatternMatch match) {
		checkMatch(match)
		val n = match.specification.parameters.length
		for (var int i = 2; i < n; i++) {
			if (isMulti(match.get(i))) {
				return true
			}
		}
		false
	}
	
	private static def checkMatch(IPatternMatch match) {
		val n = match.specification.parameters.length
		if (n < 2 || !(match.get(0) instanceof LogicProblem) || !(match.get(1) instanceof PartialInterpretation)) {
			throw new IllegalArgumentException("Match is not from the partial interpretation")
		}
	}
}
