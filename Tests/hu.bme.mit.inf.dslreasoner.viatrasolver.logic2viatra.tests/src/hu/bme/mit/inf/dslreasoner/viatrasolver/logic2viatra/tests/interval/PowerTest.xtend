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
class PowerTest {
	@Parameters(name="{index}: {0} ** {1} = {2}")
	static def Collection<Object[]> data() {
		#[
			#[EMPTY, EMPTY, EMPTY],
			#[EMPTY, between(-1, 1), EMPTY],
			#[between(-1, 1), EMPTY, EMPTY],
			#[upTo(-1), between(-1, 2), EMPTY],
			#[upTo(0), between(-1, 2), between(0, 0)],
			#[upTo(2), between(-1, 2), above(0)],
			#[upTo(2), between(1, 2), between(0, 4)],
			#[above(1), between(1, 2), above(1)],
			#[between(2, 4), upTo(1), between(0, 4)],
			#[between(0.25, 0.5), upTo(1), above(0.25)],
			#[between(2, 3), above(1), above(2)],
			#[between(0.25, 0.5), above(1), between(0, 0.5)],
			#[between(1, 2), between(-1, 2), between(0.5, 4)]
		]
	}

	@Parameter(0) public var Interval a
	@Parameter(1) public var Interval b
	@Parameter(2) public var Interval result

	@Test
	def void powerTest() {
		Assert.assertEquals(result, a ** b)
	}
}
