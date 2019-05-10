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

class SumTest {
	val aggregator = new IntervalAggregationOperator(IntervalAggregationMode.SUM)
	var IntervalRedBlackNode value = null

	@Before
	def void reset() {
		value = aggregator.createNeutral
	}

	@Test
	def void emptyTest() {
		assertEquals(ZERO)
	}

	@Test
	def void addSingleTest() {
		add(between(-1, 1))
		assertEquals(between(-1, 1))
	}

	@Test
	def void addRemoveTest() {
		add(between(-1, 1))
		remove(between(-1, 1))
		assertEquals(ZERO)
	}

	@Test
	def void addTwoTest() {
		add(between(-1, 1))
		add(above(2))
		assertEquals(above(1))
	}

	@Test
	def void addTwoRemoveFirstTest() {
		add(between(-1, 1))
		add(above(2))
		remove(between(-1, 1))
		assertEquals(above(2))
	}

	@Test
	def void addTwoRemoveSecondTest() {
		add(between(-1, 1))
		add(above(2))
		remove(above(2))
		assertEquals(between(-1, 1))
	}

	@Test
	def void addMultiplicityTest() {
		add(between(-1, 1))
		add(between(-1, 1))
		add(between(-1, 1))
		assertEquals(between(-3, 3))
	}

	@Test
	def void removeAllMultiplicityTest() {
		add(between(-1, 1))
		add(between(-1, 1))
		add(between(-1, 1))
		remove(between(-1, 1))
		remove(between(-1, 1))
		remove(between(-1, 1))
		assertEquals(ZERO)
	}

	@Test
	def void removeSomeMultiplicityTest() {
		add(between(-1, 1))
		add(between(-1, 1))
		add(between(-1, 1))
		remove(between(-1, 1))
		remove(between(-1, 1))
		assertEquals(between(-1, 1))
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
			val expected = current.stream.reduce(aggregator.mode).orElse(ZERO)
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

	private def add(Interval interval) {
		update(interval, true)
	}

	private def remove(Interval interval) {
		update(interval, false)
	}

	private def assertEquals(Interval interval) {
		val actual = aggregator.getAggregate(value)
		Assert.assertEquals(interval, actual)
	}
}
