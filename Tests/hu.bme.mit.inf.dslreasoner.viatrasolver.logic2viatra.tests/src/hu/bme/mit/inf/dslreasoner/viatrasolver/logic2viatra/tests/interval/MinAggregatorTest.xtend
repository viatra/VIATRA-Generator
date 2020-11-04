package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.tests.interval

import com.google.common.collect.HashMultiset
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.Interval
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.IntervalAggregationMode
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.IntervalAggregationOperator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.IntervalRedBlackNode
import java.math.BigDecimal
import java.util.Random
import org.junit.Assert
import org.junit.Before
import org.junit.Test

import static hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.Interval.*

class MinAggregatorTest {
	val aggregator = new IntervalAggregationOperator(IntervalAggregationMode.MIN)
	var IntervalRedBlackNode value = null

	@Before
	def void reset() {
		value = aggregator.createNeutral
	}

	@Test
	def void emptyTest() {
		assertEquals(EMPTY)
	}

	@Test
	def void largeTest() {
		val starts = #[null, new BigDecimal(-3), new BigDecimal(-2), new BigDecimal(-1)]
		val ends = #[new BigDecimal(1), new BigDecimal(2), new BigDecimal(3), null]
		val current = HashMultiset.create
		val random = new Random(1)
		for (var int i = 0; i < 1000; i++) {
			val start = starts.get(random.nextInt(starts.size))
			val end = ends.get(random.nextInt(ends.size))
			val interval = Interval.of(start, end)
			val isInsert = !current.contains(interval) || random.nextInt(3) == 0
			if (isInsert) {
				current.add(interval)
			} else {
				current.remove(interval)
			}
			val expected = current.stream.reduce(aggregator.mode).orElse(EMPTY)
			update(interval, isInsert)
			assertEquals(expected)
		}
	}

	private def update(Interval interval, boolean isInsert) {
		value = aggregator.update(value, interval, isInsert)
		val nodes = newArrayList
		var node = value.min
		while (node !== null) {
			nodes += node
			node = node.successor
		}
		value.assertSubtreeIsValid
	}

	private def assertEquals(Interval interval) {
		val actual = aggregator.getAggregate(value)
		Assert.assertEquals(interval, actual)
	}
}
