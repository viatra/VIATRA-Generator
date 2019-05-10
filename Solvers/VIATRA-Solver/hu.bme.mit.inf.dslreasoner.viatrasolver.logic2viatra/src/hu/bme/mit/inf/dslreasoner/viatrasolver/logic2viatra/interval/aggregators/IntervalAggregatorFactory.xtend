package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.aggregators

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.Interval
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.IntervalAggregationMode
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.IntervalAggregationOperator
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.AggregatorType
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.BoundAggregator
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.IAggregatorFactory
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@AggregatorType(parameterTypes = #[Interval], returnTypes = #[Interval])
abstract class IntervalAggregatorFactory implements IAggregatorFactory {
	val IntervalAggregationMode mode
	
	@FinalFieldsConstructor
	protected new() {
	}
	
	override getAggregatorLogic(Class<?> domainClass) {
		if (domainClass == Interval) {
			new BoundAggregator(new IntervalAggregationOperator(mode), Interval, Interval)
		} else {
			throw new IllegalArgumentException("Unknown domain class: " + domainClass)
		}
	}
}

class intervalSum extends IntervalAggregatorFactory {
	new() {
		super(IntervalAggregationMode.SUM)
	}
}

class intervalMin extends IntervalAggregatorFactory {
	new() {
		super(IntervalAggregationMode.MIN)
	}
}

class intervalMax extends IntervalAggregatorFactory {
	new() {
		super(IntervalAggregationMode.MAX)
	}
}

class intervalJoin extends IntervalAggregatorFactory {
	new() {
		super(IntervalAggregationMode.JOIN)
	}
}
