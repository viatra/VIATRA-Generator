package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval

import java.math.BigDecimal
import java.math.MathContext
import java.util.SortedMap
import java.util.TreeMap
import java.util.stream.Stream
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.IMultisetAggregationOperator

abstract class IntervalHullAggregatorOperator<T extends Comparable<T>> implements IMultisetAggregationOperator<T, SortedMap<T, Integer>, Interval> {
	protected new() {
	}
	
	override getName() {
		"intervalHull"
	}

	override getShortDescription() {
		"Calculates the interval hull of a set of numbers"
	}

	override createNeutral() {
		new TreeMap
	}

	override getAggregate(SortedMap<T, Integer> result) {
		if (result.neutral) {
			Interval.EMPTY
		} else {
			toInterval(result.firstKey, result.lastKey)
		}
	}
	
	protected abstract def BigDecimal toBigDecimal(T value, MathContext mc)
	
	private def toInterval(T min, T max) {
		Interval.of(min.toBigDecimal(Interval.ROUND_DOWN), max.toBigDecimal(Interval.ROUND_UP))
	}

	override isNeutral(SortedMap<T, Integer> result) {
		result.empty
	}

	override update(SortedMap<T, Integer> oldResult, T updateValue, boolean isInsertion) {
		if (isInsertion) {
			oldResult.compute(updateValue) [ key, value |
				if (value === null) {
					1
				} else if (value > 0) {
					value + 1
				} else {
					throw new IllegalStateException("Invalid count: " + value)
				}
			]
		} else {
			oldResult.compute(updateValue) [ key, value |
				if (value === 1) {
					null
				} else if (value > 1) {
					value - 1
				} else {
					throw new IllegalStateException("Invalid count: " + value)
				}
			]
		}
		oldResult
	}

	override aggregateStream(Stream<T> stream) {
		val iterator = stream.iterator
		if (!iterator.hasNext) {
			return Interval.EMPTY
		}
		var min = iterator.next
		var max = min
		while (iterator.hasNext) {
			val element = iterator.next
			if (element.compareTo(min) < 0) {
				min = element
			}
			if (element.compareTo(max) > 0) {
				max = element
			}
		}
		toInterval(min, max)
	}
}
