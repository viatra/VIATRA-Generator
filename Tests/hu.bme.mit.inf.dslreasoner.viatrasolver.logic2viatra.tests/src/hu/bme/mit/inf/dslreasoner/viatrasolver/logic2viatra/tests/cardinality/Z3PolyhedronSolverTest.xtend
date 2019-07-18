package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.tests.cardinality

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Z3PolyhedronSolver

class Z3PolyhedronSolverTest extends PolyhedronSolverTest {
	
	override protected createSolver() {
		new Z3PolyhedronSolver(false)
	}
}
