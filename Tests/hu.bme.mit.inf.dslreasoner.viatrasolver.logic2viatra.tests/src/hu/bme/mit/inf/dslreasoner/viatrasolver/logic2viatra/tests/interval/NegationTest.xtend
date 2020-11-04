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
class NegationTest {
	@Parameters(name = "{index}: -{0} = {1}")
	static def Collection<Object[]> data() {
		#[
			#[EMPTY, EMPTY],
			#[UNBOUNDED, UNBOUNDED],
			#[upTo(1), above(-1)],
			#[above(1), upTo(-1)],
			#[between(2, 3), between(-3, -2)]
		]
	}
	
	@Parameter(0) public var Interval a
	@Parameter(1) public var Interval result
	
	@Test
	def void negationTest() {
		Assert.assertEquals(result, -a)
	}
}
