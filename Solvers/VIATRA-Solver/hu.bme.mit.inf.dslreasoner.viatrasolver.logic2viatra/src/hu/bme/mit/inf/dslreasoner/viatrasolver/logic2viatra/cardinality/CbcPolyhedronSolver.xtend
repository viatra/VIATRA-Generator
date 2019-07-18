package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.ilp.cbc.CbcResult
import hu.bme.mit.inf.dslreasoner.ilp.cbc.CbcSolver
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class CbcPolyhedronSolver implements PolyhedronSolver {
	val double timeoutSeconds
	val boolean silent

	new() {
		this(10, true)
	}

	override createSaturationOperator(Polyhedron polyhedron) {
		new CbcSaturationOperator(polyhedron, timeoutSeconds, silent)
	}
}

class CbcSaturationOperator implements PolyhedronSaturationOperator {
	@Accessors val Polyhedron polyhedron
	val double timeoutSeconds
	val boolean silent
	val double[] columnLowerBounds
	val double[] columnUpperBounds
	val double[] objective
	val Map<Dimension, Integer> dimensionsToIndicesMap

	new(Polyhedron polyhedron, double timeoutSeconds, boolean silent) {
		this.polyhedron = polyhedron
		this.timeoutSeconds = timeoutSeconds
		this.silent = silent
		val numDimensions = polyhedron.dimensions.size
		columnLowerBounds = newDoubleArrayOfSize(numDimensions)
		columnUpperBounds = newDoubleArrayOfSize(numDimensions)
		objective = newDoubleArrayOfSize(numDimensions)
		dimensionsToIndicesMap = ImmutableMap.copyOf(polyhedron.dimensions.indexed.toMap([value], [key]))
	}

	override saturate() {
		val numDimensions = polyhedron.dimensions.size
		for (var int j = 0; j < numDimensions; j++) {
			val dimension = polyhedron.dimensions.get(j)
			columnLowerBounds.set(j, dimension.lowerBound.toDouble(Double.NEGATIVE_INFINITY))
			columnUpperBounds.set(j, dimension.upperBound.toDouble(Double.POSITIVE_INFINITY))
		}
		val numConstraints = polyhedron.constraints.size
		val rowStarts = newIntArrayOfSize(numConstraints + 1)
		val rowLowerBounds = newDoubleArrayOfSize(numConstraints)
		val rowUpperBounds = newDoubleArrayOfSize(numConstraints)
		val numEntries = polyhedron.constraints.map[coefficients.size].reduce[a, b|a + b] ?: 0
		rowStarts.set(numConstraints, numEntries)
		val columnIndices = newIntArrayOfSize(numEntries)
		val entries = newDoubleArrayOfSize(numEntries)
		var int index = 0
		for (var int i = 0; i < numConstraints; i++) {
			rowStarts.set(i, index)
			val constraint = polyhedron.constraints.get(i)
			rowLowerBounds.set(i, constraint.lowerBound.toDouble(Double.NEGATIVE_INFINITY))
			rowUpperBounds.set(i, constraint.upperBound.toDouble(Double.POSITIVE_INFINITY))
			if (!dimensionsToIndicesMap.keySet.containsAll(constraint.coefficients.keySet)) {
				throw new IllegalArgumentException("Constrains has unknown dimensions")
			}
			for (var int j = 0; j < numDimensions; j++) {
				val dimension = polyhedron.dimensions.get(j)
				val coefficient = constraint.coefficients.get(dimension)
				if (coefficient !== null && coefficient != 0) {
					columnIndices.set(index, j)
					entries.set(index, coefficient)
					index++
				}
			}
		}
		if (index != numEntries) {
			throw new AssertionError("Last entry does not equal the number of entries in the constraint matrix")
		}
		for (expressionToSaturate : polyhedron.expressionsToSaturate) {
			for (var int j = 0; j < numDimensions; j++) {
				objective.set(j, 0)
			}
			switch (expressionToSaturate) {
				Dimension: {
					val j = getIndex(expressionToSaturate)
					objective.set(j, 1)
				}
				LinearConstraint: {
					for (pair : expressionToSaturate.coefficients.entrySet) {
						val j = getIndex(pair.key)
						objective.set(j, pair.value)
					}
				}
				default:
					throw new IllegalArgumentException("Unknown expression: " + expressionToSaturate)
			}
			val minimizationResult = CbcSolver.solve(columnLowerBounds, columnUpperBounds, rowStarts, columnIndices,
				entries, rowLowerBounds, rowUpperBounds, objective, timeoutSeconds, silent)
			switch (minimizationResult) {
				CbcResult.SolutionBounded: {
					val value = Math.floor(minimizationResult.value)
					expressionToSaturate.lowerBound = value as int
					setBound(expressionToSaturate, value, columnLowerBounds, rowLowerBounds)
				}
				case CbcResult.SOLUTION_UNBOUNDED: {
					expressionToSaturate.lowerBound = null
					setBound(expressionToSaturate, Double.NEGATIVE_INFINITY, columnLowerBounds, rowLowerBounds)
				}
				case CbcResult.UNSAT:
					return PolyhedronSaturationResult.EMPTY
				case CbcResult.ABANDONED,
				case CbcResult.TIMEOUT:
					return PolyhedronSaturationResult.UNKNOWN
				default:
					throw new RuntimeException("Unknown CbcResult: " + minimizationResult)
			}
			for (var int j = 0; j < numDimensions; j++) {
				val objectiveCoefficient = objective.get(j)
				objective.set(j, -objectiveCoefficient)
			}
			val maximizationResult = CbcSolver.solve(columnLowerBounds, columnUpperBounds, rowStarts, columnIndices,
				entries, rowLowerBounds, rowUpperBounds, objective, timeoutSeconds, silent)
			switch (maximizationResult) {
				CbcResult.SolutionBounded: {
					val value = Math.ceil(-maximizationResult.value)
					expressionToSaturate.upperBound = value as int
					setBound(expressionToSaturate, value, columnUpperBounds, rowUpperBounds)
				}
				case CbcResult.SOLUTION_UNBOUNDED: {
					expressionToSaturate.upperBound = null
					setBound(expressionToSaturate, Double.POSITIVE_INFINITY, columnUpperBounds, rowUpperBounds)
				}
				case CbcResult.UNSAT:
					throw new RuntimeException("Minimization was SAT, but maximization is UNSAT")
				case CbcResult.ABANDONED,
				case CbcResult.TIMEOUT:
					return PolyhedronSaturationResult.UNKNOWN
				default:
					throw new RuntimeException("Unknown CbcResult: " + maximizationResult)
			}
		}
		PolyhedronSaturationResult.SATURATED
	}

	private def toDouble(Integer nullableInt, double defaultValue) {
		if (nullableInt === null) {
			defaultValue
		} else {
			nullableInt.doubleValue
		}
	}

	private def int getIndex(Dimension dimension) {
		val index = dimensionsToIndicesMap.get(dimension)
		if (index === null) {
			throw new IllegalArgumentException("Unknown dimension: " + dimension)
		}
		index
	}

	private def void setBound(LinearBoundedExpression expression, double bound, double[] columnBounds,
		double[] rowBounds) {
		switch (expression) {
			Dimension: {
				val j = getIndex(expression)
				columnBounds.set(j, bound)
			}
			LinearConstraint: {
				val i = polyhedron.constraints.indexOf(expression)
				if (i >= 0) {
					rowBounds.set(i, bound)
				}
			}
		}
	}

	override close() throws Exception {
		// Nothing to close
	}
}
