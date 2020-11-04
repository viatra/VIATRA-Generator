package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableList
import org.eclipse.xtend.lib.annotations.Accessors

abstract class AbstractPolyhedronSaturationOperator implements PolyhedronSaturationOperator {
	@Accessors val Polyhedron polyhedron

	new(Polyhedron polyhedron) {
		if (polyhedron.dimensions.empty) {
			throw new IllegalArgumentException("Polyhedron must have at least one dimension.")
		}
		this.polyhedron = polyhedron
	}

	override saturate() {
		if (polyhedron.expressionsToSaturate.empty) {
			return PolyhedronSaturationResult.SATURATED
		}
		for (constraint : polyhedron.constraints) {
			if (constraint.zero) {
				if (constraint.lowerBound !== null && constraint.lowerBound > 0) {
					return PolyhedronSaturationResult.EMPTY
				}
				if (constraint.upperBound !== null && constraint.upperBound < 0) {
					return PolyhedronSaturationResult.EMPTY
				}
			} else {
				if (constraint.lowerBound !== null && constraint.upperBound !== null &&
					constraint.upperBound < constraint.lowerBound) {
					return PolyhedronSaturationResult.EMPTY
				}
			}
		}
		doSaturate()
	}

	protected def PolyhedronSaturationResult doSaturate()

	protected def getNonTrivialConstraints() {
		ImmutableList.copyOf(polyhedron.constraints.filter [ constraint |
			(constraint.lowerBound !== null || constraint.upperBound !== null) && !constraint.zero
		])
	}

	private static def isZero(LinearConstraint constraint) {
		constraint.coefficients.values.forall[it == 0]
	}

	override close() throws Exception {
		// Nothing to close by default.
	}
}
