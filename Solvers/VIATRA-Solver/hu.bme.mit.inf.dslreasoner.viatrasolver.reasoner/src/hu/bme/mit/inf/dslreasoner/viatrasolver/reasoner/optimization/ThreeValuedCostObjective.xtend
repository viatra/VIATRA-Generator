package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.BoundSaturationListener
import java.util.Map
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.xtend.lib.annotations.Accessors

class ThreeValuedCostObjective extends AbstractThreeValuedObjective implements BoundSaturationListener {
	@Accessors val Map<String, CostElementMatchers> matchers
	double lowerBoundHint = Double.NEGATIVE_INFINITY
	double upperBoundHint = Double.POSITIVE_INFINITY

	new(String name, Map<String, CostElementMatchers> matchers, ObjectiveKind kind, ObjectiveThreshold threshold,
		int level) {
		super(name, kind, threshold, level)
		this.matchers = matchers
	}

	override createNew() {
		// new ThreeValuedCostObjective(name, matchers, kind, threshold, level)
		throw new UnsupportedOperationException("ThreeValuedCostObjective can only be used from a single thread")
	}

	override init(ThreadContext context) {
	}

	override getRawFitness(ThreadContext context) {
		var double cost = 0
		for (matcher : matchers.values) {
			cost += matcher.weight * matcher.currentNumberOfMatches
		}
		cost
	}

	override getLowestPossibleFitness(ThreadContext threadContext) {
		var double cost = 0
		for (matcher : matchers.values) {
			if (matcher.weight >= 0) {
				cost += matcher.weight * matcher.minimumNumberOfMatches
			} else {
				cost += matcher.weight * matcher.maximumNumberOfMatches
			}
		}
		val boundWithHint = Math.max(lowerBoundHint, cost)
		if (boundWithHint > upperBoundHint) {
			throw new IllegalStateException("Inconsistent cost bounds")
		}
		boundWithHint
	}

	override getHighestPossibleFitness(ThreadContext threadContext) {
		var double cost = 0
		for (matcher : matchers.values) {
			if (matcher.weight <= 0) {
				cost += matcher.weight * matcher.minimumNumberOfMatches
			} else {
				cost += matcher.weight * matcher.maximumNumberOfMatches
			}
		}
		val boundWithHint = Math.min(upperBoundHint, cost)
		if (boundWithHint < lowerBoundHint) {
			throw new IllegalStateException("Inconsistent cost bounds")
		}
		boundWithHint
	}

	override boundsSaturated(Integer lower, Integer upper) {
		lowerBoundHint = if (lower === null) {
			Double.NEGATIVE_INFINITY
		} else {
			lower
		}
		upperBoundHint = if (upper === null) {
			Double.POSITIVE_INFINITY
		} else {
			upper
		}
		println('''Bounds saturated: «lower»..«upper»''')
	}
}
