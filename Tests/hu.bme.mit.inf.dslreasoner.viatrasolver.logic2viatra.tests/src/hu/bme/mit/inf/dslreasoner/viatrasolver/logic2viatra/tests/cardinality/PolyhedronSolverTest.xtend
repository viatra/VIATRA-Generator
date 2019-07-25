package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.tests.cardinality

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Dimension
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearConstraint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Polyhedron
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronSaturationOperator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronSaturationResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronSolver
import org.junit.After
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*

abstract class PolyhedronSolverTest {
	var PolyhedronSolver solver
	var PolyhedronSaturationOperator operator

	protected def PolyhedronSolver createSolver()

	@Before
	def void setUp() {
		solver = createSolver()
	}

	@After
	def void tearDown() {
		destroyOperatorIfExists()
	}

	@Test
	def void singleDimensionTest() {
		val x = new Dimension("x", 0, 1)
		createSaturationOperator(new Polyhedron(#[x], #[], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, x.lowerBound)
		assertEquals(1, x.upperBound)
	}

	@Test
	def void singleDimensionNegativeValueTest() {
		val x = new Dimension("x", -2, -1)
		createSaturationOperator(new Polyhedron(#[x], #[], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(-2, x.lowerBound)
		assertEquals(-1, x.upperBound)
	}

	@Test
	def void singleDimensionConstraintTest() {
		val x = new Dimension("x", null, null)
		val constraint = new LinearConstraint(#{x -> 2}, 0, 2)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, x.lowerBound)
		assertEquals(1, x.upperBound)
	}

	@Test
	def void singleDimensionConstraintUnitCoefficientTest() {
		val x = new Dimension("x", null, null)
		val constraint = new LinearConstraint(#{x -> 1}, 1, 3)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(1, x.lowerBound)
		assertEquals(3, x.upperBound)
	}

	@Test
	def void singleDimensionUnboundedFromAboveTest() {
		val x = new Dimension("x", 0, null)
		createSaturationOperator(new Polyhedron(#[x], #[], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, x.lowerBound)
		assertEquals(null, x.upperBound)
	}

	@Test
	def void singleDimensionUnboundedFromBelowTest() {
		val x = new Dimension("x", null, 0)
		createSaturationOperator(new Polyhedron(#[x], #[], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(null, x.lowerBound)
		assertEquals(0, x.upperBound)
	}

	@Test
	def void singleDimensionUnsatisfiableTest() {
		val x = new Dimension("x", 0, 1)
		val constraint = new LinearConstraint(#{x -> 2}, -2, -1)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.EMPTY, result)
	}

	@Test
	def void equalityConstraintTest() {
		val x = new Dimension("x", null, null)
		val y = new Dimension("y", 1, 2)
		val constraint = new LinearConstraint(#{x -> 2, y -> 2}, 6, 6)
		createSaturationOperator(new Polyhedron(#[x, y], #[constraint], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(1, x.lowerBound)
		assertEquals(2, x.upperBound)
	}

	@Test
	def void saturateConstraintTest() {
		val x = new Dimension("x", 0, 2)
		val y = new Dimension("y", 1, 2)
		val constraint = new LinearConstraint(#{x -> 2, y -> 1}, 0, 8)
		createSaturationOperator(new Polyhedron(#[x, y], #[constraint], #[constraint]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(1, constraint.lowerBound)
		assertEquals(6, constraint.upperBound)
	}

	@Test(expected=IllegalArgumentException)
	def void unknownVariableTest() {
		val x = new Dimension("x", 0, 1)
		val y = new Dimension("y", 0, 1)
		val constraint = new LinearConstraint(#{y -> 2}, 0, 2)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[x]))

		saturate()
	}

	@Test
	def void emptyConstraintTest() {
		val x = new Dimension("x", 0, 1)
		val constraint = new LinearConstraint(emptyMap, 0, 1)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[constraint]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, constraint.lowerBound)
		assertEquals(0, constraint.upperBound)
	}

	@Test
	def void emptyConstraintUnsatisfiableTest() {
		val x = new Dimension("x", 0, 1)
		val constraint = new LinearConstraint(emptyMap, 1, 0)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[constraint]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.EMPTY, result)
	}

	protected def createSaturationOperator(Polyhedron polyhedron) {
		destroyOperatorIfExists()
		operator = solver.createSaturationOperator(polyhedron)
	}

	protected def destroyOperatorIfExists() {
		if (operator !== null) {
			operator.close
		}
	}

	protected def saturate() {
		operator.saturate
	}
}

abstract class IntegerPolyhedronSolverTest extends PolyhedronSolverTest {
	@Test
	def void singleDimensionConstraintNonIntegerTest() {
		val x = new Dimension("x", null, null)
		val constraint = new LinearConstraint(#{x -> 2}, 0, 3)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, x.lowerBound)
		assertEquals(1, x.upperBound)
	}

	@Test
	def void unsatisfiableMultipleInheritanceTest() {
		val x = new Dimension("x", 0, 1)
		val y = new Dimension("y", 0, 1)
		val z = new Dimension("z", 0, 1)
		createSaturationOperator(new Polyhedron(
			#[x, y, z],
			#[
				new LinearConstraint(#{x -> 1, y -> 1}, 1, 1),
				new LinearConstraint(#{x -> 1, z -> 1}, 1, 1),
				new LinearConstraint(#{y -> 1, z -> 1}, 1, 1)
			],
			#[x, y, z]
		))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.EMPTY, result)
	}

	@Test
	def void unboundedRelaxationWithNoIntegerSolutionTest() {
		val x = new Dimension("x", 0, 1)
		val y = new Dimension("y", 0, null)
		createSaturationOperator(new Polyhedron(
			#[x, y],
			#[new LinearConstraint(#{x -> 2}, 1, 1)],
			#[x, y]
		))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.EMPTY, result)
	}
}

abstract class RelaxedPolyhedronSolverTest extends PolyhedronSolverTest {
	@Test
	def void singleDimensionConstraintNonIntegerTest() {
		val x = new Dimension("x", null, null)
		val constraint = new LinearConstraint(#{x -> 2}, 0, 3)
		createSaturationOperator(new Polyhedron(#[x], #[constraint], #[x]))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, x.lowerBound)
		assertEquals(2, x.upperBound)
	}

	@Test
	def void unsatisfiableMultipleInheritanceTest() {
		val x = new Dimension("x", 0, 1)
		val y = new Dimension("y", 0, 1)
		val z = new Dimension("z", 0, 1)
		createSaturationOperator(new Polyhedron(
			#[x, y, z],
			#[
				new LinearConstraint(#{x -> 1, y -> 1}, 1, 1),
				new LinearConstraint(#{x -> 1, z -> 1}, 1, 1),
				new LinearConstraint(#{y -> 1, z -> 1}, 1, 1)
			],
			#[x, y, z]
		))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, x.lowerBound)
		assertEquals(1, x.upperBound)
		assertEquals(0, y.lowerBound)
		assertEquals(1, y.upperBound)
		assertEquals(0, z.lowerBound)
		assertEquals(1, z.upperBound)
	}

	@Test
	def void unboundedRelaxationWithNoIntegerSolutionTest() {
		val x = new Dimension("x", 0, 1)
		val y = new Dimension("y", 0, null)
		createSaturationOperator(new Polyhedron(
			#[x, y],
			#[new LinearConstraint(#{x -> 2}, 1, 1)],
			#[x, y]
		))

		val result = saturate()

		assertEquals(PolyhedronSaturationResult.SATURATED, result)
		assertEquals(0, x.lowerBound)
		assertEquals(1, x.upperBound)
		assertEquals(0, y.lowerBound)
		assertEquals(null, y.upperBound)
	}
}
