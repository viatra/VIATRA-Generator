package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.tests.cardinality

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Z3PolyhedronSolver

class Z3PolyhedronSolverTest extends IntegerPolyhedronSolverTest {
	
	override protected createSolver() {
		new Z3PolyhedronSolver(false, 10)
	}
}

class RelaxedZ3PolyhedronSolverTest extends RelaxedPolyhedronSolverTest {
	
	override protected createSolver() {
		new Z3PolyhedronSolver(true, 10)
	}
}
