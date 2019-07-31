package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

enum PolyhedralScopePropagatorConstraints {
	TypeHierarchy,
	Relational
}

enum PolyhedralScopePropagatorSolver {
	Z3Real,
	Z3Integer,
	Cbc,
	Clp
}

abstract class ScopePropagatorStrategy {
	public static val BasicCount = new Simple("BasicCount")

	public static val BasicTypeHierarchy = new Simple("BasicTypeHierarchy")

	private new() {
	}

	def boolean requiresUpperBoundIndexing()

	static class Simple extends ScopePropagatorStrategy {
		val String name

		@FinalFieldsConstructor
		private new() {
		}

		override requiresUpperBoundIndexing() {
			false
		}

		override toString() {
			name
		}
	}

	@Data
	static class Polyhedral extends ScopePropagatorStrategy {
		public static val UNLIMITED_TIME = -1

		val PolyhedralScopePropagatorConstraints constraints
		val PolyhedralScopePropagatorSolver solver
		val double timeoutSeconds

		@FinalFieldsConstructor
		new() {
		}

		new(PolyhedralScopePropagatorConstraints constraints, PolyhedralScopePropagatorSolver solver) {
			this(constraints, solver, UNLIMITED_TIME)
		}

		override requiresUpperBoundIndexing() {
			constraints == PolyhedralScopePropagatorConstraints.Relational
		}
	}
}
