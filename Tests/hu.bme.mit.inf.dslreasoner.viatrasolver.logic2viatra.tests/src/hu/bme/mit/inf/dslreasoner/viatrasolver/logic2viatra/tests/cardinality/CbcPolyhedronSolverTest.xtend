package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.tests.cardinality

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.CbcPolyhedronSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Dimension
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Polyhedron
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronSaturationResult
import org.junit.Test

import static org.junit.Assert.*

class CbcPolyhedronSolverTest extends IntegerPolyhedronSolverTest {

	override protected createSolver() {
		new CbcPolyhedronSolver(10, true)
	}
}

class CbcPolyhedronSolverTimeoutTest {

	@Test
	def void timeoutTest() {
		val solver = new CbcPolyhedronSolver(0, true)
		val x = new Dimension("x", 0, 1)
		val polyhedron = new Polyhedron(#[x], #[], #[x])
		val operator = solver.createSaturationOperator(polyhedron)
		try {
			val result = operator.saturate

			assertEquals(PolyhedronSaturationResult.UNKNOWN, result)
		} finally {
			operator.close()
		}
	}
}
