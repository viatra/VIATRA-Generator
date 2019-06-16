package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import com.google.common.collect.ImmutableList
import java.util.Collection
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.xtend.lib.annotations.Data

@Data
class ThreeValuedCostElement {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> currentMatchQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> mayMatchQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> mustMatchQuery
	val int weight
}

class ThreeValuedCostObjective extends AbstractThreeValuedObjective {
	val Collection<ThreeValuedCostElement> costElements
	Collection<CostElementMatchers> matchers

	new(String name, Collection<ThreeValuedCostElement> costElements, ObjectiveKind kind, ObjectiveThreshold threshold,
		int level) {
		super(name, kind, threshold, level)
		this.costElements = costElements
	}

	override createNew() {
		new ThreeValuedCostObjective(name, costElements, kind, threshold, level)
	}

	override init(ThreadContext context) {
		val queryEngine = context.queryEngine
		matchers = ImmutableList.copyOf(costElements.map [ element |
			new CostElementMatchers(
				queryEngine.getMatcher(element.currentMatchQuery),
				queryEngine.getMatcher(element.mayMatchQuery),
				queryEngine.getMatcher(element.mustMatchQuery),
				element.weight
			)
		])
	}

	override getRawFitness(ThreadContext context) {
		var int cost = 0
		for (matcher : matchers) {
			cost += matcher.weight * matcher.currentMatcher.countMatches
		}
		cost as double
	}

	override getLowestPossibleFitness(ThreadContext threadContext) {
		var int cost = 0
		for (matcher : matchers) {
			if (matcher.weight >= 0) {
				cost += matcher.weight * matcher.mustMatcher.countMatches
			} else if (matcher.mayMatcher.countMatches > 0) {
				// TODO Count may matches.
				return Double.NEGATIVE_INFINITY
			}
		}
		cost as double
	}

	override getHighestPossibleFitness(ThreadContext threadContext) {
		var int cost = 0
		for (matcher : matchers) {
			if (matcher.weight <= 0) {
				cost += matcher.weight * matcher.mustMatcher.countMatches
			} else if (matcher.mayMatcher.countMatches > 0) {
				return Double.POSITIVE_INFINITY
			}
		}
		cost as double
	}

	@Data
	private static class CostElementMatchers {
		val ViatraQueryMatcher<? extends IPatternMatch> currentMatcher
		val ViatraQueryMatcher<? extends IPatternMatch> mayMatcher
		val ViatraQueryMatcher<? extends IPatternMatch> mustMatcher
		val int weight
	}
}
