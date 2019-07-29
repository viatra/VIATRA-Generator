package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.ilp.cbc.CbcResult
import hu.bme.mit.inf.dslreasoner.ilp.cbc.CbcSolver
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class CbcPolyhedronSolver implements PolyhedronSolver {
	val boolean lpRelaxation
	val double timeoutSeconds
	val boolean silent

	new() {
		this(false, -1, true)
	}

	override createSaturationOperator(Polyhedron polyhedron) {
		new CbcSaturationOperator(polyhedron, lpRelaxation, timeoutSeconds, silent)
	}
}

class CbcSaturationOperator extends AbstractPolyhedronSaturationOperator {
	val boolean lpRelaxation
	val double timeoutSeconds
	val boolean silent
	val double[] columnLowerBounds
	val double[] columnUpperBounds
	val double[] objective
	val Map<Dimension, Integer> dimensionsToIndicesMap

	new(Polyhedron polyhedron, boolean lpRelaxation, double timeoutSeconds, boolean silent) {
		super(polyhedron)
		this.lpRelaxation = lpRelaxation
		this.timeoutSeconds = timeoutSeconds
		this.silent = silent
		val numDimensions = polyhedron.dimensions.size
		columnLowerBounds = newDoubleArrayOfSize(numDimensions)
		columnUpperBounds = newDoubleArrayOfSize(numDimensions)
		objective = newDoubleArrayOfSize(numDimensions)
		dimensionsToIndicesMap = ImmutableMap.copyOf(polyhedron.dimensions.indexed.toMap([value], [key]))
	}

	override doSaturate() {
		val numDimensions = polyhedron.dimensions.size
		for (var int j = 0; j < numDimensions; j++) {
			val dimension = polyhedron.dimensions.get(j)
			columnLowerBounds.set(j, dimension.lowerBound.toDouble(Double.NEGATIVE_INFINITY))
			columnUpperBounds.set(j, dimension.upperBound.toDouble(Double.POSITIVE_INFINITY))
		}
		val constraints = nonTrivialConstraints
		val numConstraints = constraints.size
		val rowStarts = newIntArrayOfSize(numConstraints + 1)
		val rowLowerBounds = newDoubleArrayOfSize(numConstraints)
		val rowUpperBounds = newDoubleArrayOfSize(numConstraints)
		val numEntries = constraints.map[coefficients.size].reduce[a, b|a + b] ?: 0
		rowStarts.set(numConstraints, numEntries)
		val columnIndices = newIntArrayOfSize(numEntries)
		val entries = newDoubleArrayOfSize(numEntries)
		val unconstrainedDimensions = new HashSet
		for (dimension : polyhedron.dimensions) {
			if (dimension.lowerBound === null && dimension.upperBound === null) {
				unconstrainedDimensions += dimension
			}
		}
		var int index = 0
		for (var int i = 0; i < numConstraints; i++) {
			rowStarts.set(i, index)
			val constraint = constraints.get(i)
			rowLowerBounds.set(i, constraint.lowerBound.toDouble(Double.NEGATIVE_INFINITY))
			rowUpperBounds.set(i, constraint.upperBound.toDouble(Double.POSITIVE_INFINITY))
			if (!dimensionsToIndicesMap.keySet.containsAll(constraint.coefficients.keySet)) {
				throw new IllegalArgumentException("Constrains has unknown dimensions")
			}
			for (var int j = 0; j < numDimensions; j++) {
				val dimension = polyhedron.dimensions.get(j)
				val coefficient = constraint.coefficients.get(dimension)
				if (coefficient !== null && coefficient != 0) {
					unconstrainedDimensions -= dimension
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
			val result = saturate(expressionToSaturate, rowStarts, columnIndices, entries, rowLowerBounds,
				rowUpperBounds, unconstrainedDimensions, constraints)
			if (result != PolyhedronSaturationResult.SATURATED) {
				return result
			}
		}
		PolyhedronSaturationResult.SATURATED
	}

	protected def saturate(LinearBoundedExpression expressionToSaturate, int[] rowStarts, int[] columnIndices,
		double[] entries, double[] rowLowerBounds, double[] rowUpperBounds, Set<Dimension> unconstrainedDimensions,
		ImmutableList<LinearConstraint> constraints) {
		val numDimensions = objective.size
		for (var int j = 0; j < numDimensions; j++) {
			objective.set(j, 0)
		}
		switch (expressionToSaturate) {
			Dimension: {
				// CBC will return nonsensical results or call free() with invalid arguments if
				// it is passed a fully unconstrained (-Inf lower and +Int upper bound, no inequalities) variable
				// in the objective function.
				if (unconstrainedDimensions.contains(expressionToSaturate)) {
					return PolyhedronSaturationResult.SATURATED
				}
				val j = getIndex(expressionToSaturate)
				objective.set(j, 1)
			}
			LinearConstraint: {
				for (pair : expressionToSaturate.coefficients.entrySet) {
					val dimension = pair.key
					// We also have to check for unconstrained dimensions here to avoid crashing.
					if (unconstrainedDimensions.contains(dimension)) {
						expressionToSaturate.lowerBound = null
						expressionToSaturate.upperBound = null
						return PolyhedronSaturationResult.SATURATED
					}
					val j = getIndex(dimension)
					objective.set(j, pair.value)
				}
			}
			default:
				throw new IllegalArgumentException("Unknown expression: " + expressionToSaturate)
		}
		val minimizationResult = CbcSolver.solve(columnLowerBounds, columnUpperBounds, rowStarts, columnIndices,
			entries, rowLowerBounds, rowUpperBounds, objective, lpRelaxation, timeoutSeconds, silent)
		switch (minimizationResult) {
			CbcResult.SolutionBounded: {
				val value = Math.floor(minimizationResult.value)
				expressionToSaturate.lowerBound = value as int
				setBound(expressionToSaturate, constraints, value, columnLowerBounds, rowLowerBounds)
			}
			case CbcResult.SOLUTION_UNBOUNDED: {
				expressionToSaturate.lowerBound = null
				setBound(expressionToSaturate, constraints, Double.NEGATIVE_INFINITY, columnLowerBounds, rowLowerBounds)
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
			entries, rowLowerBounds, rowUpperBounds, objective, lpRelaxation, timeoutSeconds, silent)
		switch (maximizationResult) {
			CbcResult.SolutionBounded: {
				val value = Math.ceil(-maximizationResult.value)
				expressionToSaturate.upperBound = value as int
				setBound(expressionToSaturate, constraints, value, columnUpperBounds, rowUpperBounds)
			}
			case CbcResult.SOLUTION_UNBOUNDED: {
				expressionToSaturate.upperBound = null
				setBound(expressionToSaturate, constraints, Double.POSITIVE_INFINITY, columnUpperBounds, rowUpperBounds)
			}
			case CbcResult.UNSAT:
				throw new RuntimeException("Minimization was SAT, but maximization is UNSAT")
			case CbcResult.ABANDONED,
			case CbcResult.TIMEOUT:
				return PolyhedronSaturationResult.UNKNOWN
			default:
				throw new RuntimeException("Unknown CbcResult: " + maximizationResult)
		}
		return PolyhedronSaturationResult.SATURATED
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

	private def void setBound(LinearBoundedExpression expression, List<LinearConstraint> constraints, double bound,
		double[] columnBounds, double[] rowBounds) {
		switch (expression) {
			Dimension: {
				val j = getIndex(expression)
				columnBounds.set(j, bound)
			}
			LinearConstraint: {
				val i = constraints.indexOf(expression)
				if (i >= 0) {
					rowBounds.set(i, bound)
				}
			}
		}
	}
}
