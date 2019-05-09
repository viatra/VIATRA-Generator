package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.tests.interval

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.Interval
import java.util.Collection
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameter
import org.junit.runners.Parameterized.Parameters

import static hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.Interval.*

@RunWith(Parameterized)
class RelationTest {
	@Parameters(name = "{index}: {0} <> {1}")
	static def Collection<Object[]> data() {
		#[
			#[EMPTY, EMPTY, true, false, true, false, EMPTY],
			#[EMPTY, between(1, 2), true, false, true, false, between(1, 2)],
			#[between(1, 2), EMPTY, true, false, true, false, between(1, 2)],
			#[upTo(1), upTo(0), false, true, false, true, upTo(1)],
			#[upTo(1), upTo(1), false, true, false, true, upTo(1)],
			#[upTo(1), upTo(2), false, true, false, true, upTo(2)],
			#[upTo(1), above(0), false, true, false, true, UNBOUNDED],
			#[upTo(1), above(1), false, true, false, true, UNBOUNDED],
			#[upTo(1), above(2), false, false, true, true, UNBOUNDED],
			#[upTo(1), between(-1, -1), false, true, false, true, upTo(1)],
			#[upTo(1), between(-1, 0), false, true, false, true, upTo(1)],
			#[upTo(1), between(-1, 1), false, true, false, true, upTo(1)],
			#[upTo(1), between(-1, 2), false, true, false, true, upTo(2)],
			#[upTo(1), between(1, 1), false, true, false, true, upTo(1)],
			#[upTo(1), between(1, 2), false, true, false, true, upTo(2)],
			#[upTo(1), between(2, 2), false, false, true, true, upTo(2)],
			#[upTo(1), between(2, 3), false, false, true, true, upTo(3)],
			#[above(1), upTo(0), false, false, false, false, UNBOUNDED],
			#[above(1), upTo(1), false, true, false, false, UNBOUNDED],
			#[above(1), upTo(2), false, true, false, true, UNBOUNDED],
			#[above(1), above(0), false, true, false, true, above(0)],
			#[above(1), above(1), false, true, false, true, above(1)],
			#[above(1), above(2), false, true, false, true, above(1)],
			#[above(1), between(-1, -1), false, false, false, false, above(-1)],
			#[above(1), between(-1, 0), false, false, false, false, above(-1)],
			#[above(1), between(-1, 1), false, true, false, false, above(-1)],
			#[above(1), between(-1, 2), false, true, false, true, above(-1)],
			#[above(1), between(1, 1), false, true, false, false, above(1)],
			#[above(1), between(1, 2), false, true, false, true, above(1)],
			#[above(1), between(2, 2), false, true, false, true, above(1)],
			#[above(1), between(2, 3), false, true, false, true, above(1)],
			#[between(1, 1), upTo(0), false, false, false, false, upTo(1)],
			#[between(1, 1), upTo(1), false, true, false, false, upTo(1)],
			#[between(1, 1), upTo(2), false, true, false, true, upTo(2)],
			#[between(1, 1), above(0), false, true, false, true, above(0)],
			#[between(1, 1), above(1), false, true, false, true, above(1)],
			#[between(1, 1), above(2), false, false, true, true, above(1)],
			#[between(1, 1), between(-1, -1), false, false, false, false, between(-1, 1)],
			#[between(1, 1), between(-1, 0), false, false, false, false, between(-1, 1)],
			#[between(1, 1), between(-1, 1), false, true, false, false, between(-1, 1)],
			#[between(1, 1), between(-1, 2), false, true, false, true, between(-1, 2)],
			#[between(1, 1), between(1, 1), true, true, false, false, between(1, 1)],
			#[between(1, 1), between(1, 2), false, true, false, true, between(1, 2)],
			#[between(1, 1), between(2, 2), false, false, true, true, between(1, 2)],
			#[between(1, 1), between(2, 3), false, false, true, true, between(1, 3)],
			#[between(-1, 1), upTo(-2), false, false, false, false, upTo(1)],
			#[between(-1, 1), upTo(-1), false, true, false, false, upTo(1)],
			#[between(-1, 1), upTo(0), false, true, false, true, upTo(1)],
			#[between(-1, 1), upTo(1), false, true, false, true, upTo(1)],
			#[between(-1, 1), upTo(2), false, true, false, true, upTo(2)],
			#[between(-1, 1), above(-2), false, true, false, true, above(-2)],
			#[between(-1, 1), above(-1), false, true, false, true, above(-1)],
			#[between(-1, 1), above(0), false, true, false, true, above(-1)],
			#[between(-1, 1), above(1), false, true, false, true, above(-1)],
			#[between(-1, 1), above(2), false, false, true, true, above(-1)],
			#[between(-1, 1), between(-3, -2), false, false, false, false, between(-3, 1)],
			#[between(-1, 1), between(-2, -2), false, false, false, false, between(-2, 1)],
			#[between(-1, 1), between(-2, -1), false, true, false, false, between(-2, 1)],
			#[between(-1, 1), between(-2, 0), false, true, false, true, between(-2, 1)],
			#[between(-1, 1), between(-2, 1), false, true, false, true, between(-2, 1)],
			#[between(-1, 1), between(-2, 2), false, true, false, true, between(-2, 2)],
			#[between(-1, 1), between(-1, -1), false, true, false, false, between(-1, 1)],
			#[between(-1, 1), between(-1, 0), false, true, false, true, between(-1, 1)],
			#[between(-1, 1), between(-1, 1), false, true, false, true, between(-1, 1)],
			#[between(-1, 1), between(-1, 2), false, true, false, true, between(-1, 2)],
			#[between(-1, 1), between(0, 0), false, true, false, true, between(-1, 1)],
			#[between(-1, 1), between(0, 1), false, true, false, true, between(-1, 1)],
			#[between(-1, 1), between(0, 2), false, true, false, true, between(-1, 2)],
			#[between(-1, 1), between(1, 1), false, true, false, true, between(-1, 1)],
			#[between(-1, 1), between(1, 2), false, true, false, true, between(-1, 2)],
			#[between(-1, 1), between(2, 2), false, false, true, true, between(-1, 2)],
			#[between(-1, 1), between(2, 3), false, false, true, true, between(-1, 3)]
		]
	}
	
	@Parameter(0) public var Interval a
	@Parameter(1) public var Interval b
	@Parameter(2) public var boolean mustEqual
	@Parameter(3) public var boolean mayEqual
	@Parameter(4) public var boolean mustBeLessThan
	@Parameter(5) public var boolean mayBeLessThan
	@Parameter(6) public var Interval join
	
	@Test
	def void mustEqualTest() {
		Assert.assertEquals(mustEqual, a.mustEqual(b))
	}
	
	@Test
	def void mayEqualTest() {
		Assert.assertEquals(mayEqual, a.mayEqual(b))
	}
	
	@Test
	def void mustBeLessThanTest() {
		Assert.assertEquals(mustBeLessThan, a.mustBeLessThan(b))
	}
	
	@Test
	def void mayBeLessThanTest() {
		Assert.assertEquals(mayBeLessThan, a.mayBeLessThan(b))
	}
	
	@Test
	def void joinTest() {
		Assert.assertEquals(join, a.join(b))
	}
}
