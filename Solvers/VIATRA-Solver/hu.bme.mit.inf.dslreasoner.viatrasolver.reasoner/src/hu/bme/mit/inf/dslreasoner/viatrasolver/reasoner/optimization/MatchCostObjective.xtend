package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import com.google.common.collect.ImmutableList
import java.util.Collection
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.xtend.lib.annotations.Data

@Data
class MatchCostElement {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification
	val double weight
}

class MatchCostObjective extends DirectionalThresholdObjective {
	val Collection<MatchCostElement> costElements
	Collection<CostElementMatcher> matchers

	new(String name, Collection<MatchCostElement> costElements, ObjectiveKind kind, ObjectiveThreshold threshold,
		int level) {
		super(name, kind, threshold, level)
		this.costElements = costElements
	}

	override createNew() {
		new MatchCostObjective(name, costElements, kind, threshold, level)
	}

	override init(ThreadContext context) {
		val queryEngine = context.queryEngine
		matchers = ImmutableList.copyOf(costElements.map [
			val matcher = querySpecification.getMatcher(queryEngine)
			new CostElementMatcher(matcher, weight)
		])
	}

	override protected getRawFitness(ThreadContext context) {
		var double cost = 0
		for (it : matchers) {
			cost += weight * matcher.countMatches
		}
		cost
	}

	@Data
	private static class CostElementMatcher {
		val ViatraQueryMatcher<? extends IPatternMatch> matcher
		val double weight
	}
}
