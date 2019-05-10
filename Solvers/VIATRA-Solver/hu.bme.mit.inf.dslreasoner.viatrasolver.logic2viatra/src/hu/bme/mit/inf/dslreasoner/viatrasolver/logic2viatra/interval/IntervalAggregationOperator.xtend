package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval

import java.util.stream.Stream
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.IMultisetAggregationOperator
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class IntervalAggregationOperator implements IMultisetAggregationOperator<Interval, IntervalRedBlackNode, Interval> {
	@Accessors val IntervalAggregationMode mode

	override getName() {
		mode.modeName
	}

	override getShortDescription() {
		mode.description
	}

	override createNeutral() {
		mode.empty
	}

	override isNeutral(IntervalRedBlackNode result) {
		result.leaf
	}

	override update(IntervalRedBlackNode oldResult, Interval updateValue, boolean isInsertion) {
		if (isInsertion) {
			val newNode = mode.createNode(updateValue)
			oldResult.add(newNode)
		} else {
			oldResult.remove(updateValue)
		}
	}

	override getAggregate(IntervalRedBlackNode result) {
		if (result.leaf) {
			null
		} else {
			result.result
		}
	}

	override aggregateStream(Stream<Interval> stream) {
		stream.reduce(mode).orElse(null)
	}
}
