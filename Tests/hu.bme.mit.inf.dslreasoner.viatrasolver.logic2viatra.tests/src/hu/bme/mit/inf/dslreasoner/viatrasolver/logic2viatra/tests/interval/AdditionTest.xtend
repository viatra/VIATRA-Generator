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
class AdditionTest {
	@Parameters(name = "{index}: {0} + {1} = {2}")
	static def Collection<Object[]> data() {
		#[
			#[EMPTY, EMPTY, EMPTY],
			#[EMPTY, between(-1, 1), EMPTY],
			#[between(-1, 1), EMPTY, EMPTY],
			#[UNBOUNDED, UNBOUNDED, UNBOUNDED],
			#[UNBOUNDED, upTo(2), UNBOUNDED],
			#[UNBOUNDED, above(-2), UNBOUNDED],
			#[UNBOUNDED, between(-1, 1), UNBOUNDED],
			#[upTo(2), UNBOUNDED, UNBOUNDED],
			#[upTo(2), upTo(1), upTo(3)],
			#[upTo(2), above(-1), UNBOUNDED],
			#[upTo(2), between(-1, 2), upTo(4)],
			#[above(-2), UNBOUNDED, UNBOUNDED],
			#[above(-2), upTo(1), UNBOUNDED],
			#[above(-2), above(-1), above(-3)],
			#[above(-2), between(-1, 2), above(-3)],
			#[between(-2, 3), UNBOUNDED, UNBOUNDED],
			#[between(-2, 3), upTo(1), upTo(4)],
			#[between(-2, 3), above(-1), above(-3)],
			#[between(-2, 3), between(-1, 2.5), between(-3, 5.5)]
		]
	}
	
	@Parameter(0) public var Interval a
	@Parameter(1) public var Interval b
	@Parameter(2) public var Interval result
	
	@Test
	def void additionTest() {
		Assert.assertEquals(result, a + b)
	}
}
