package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.microsoft.z3.ArithExpr
import com.microsoft.z3.Context
import com.microsoft.z3.Expr
import com.microsoft.z3.IntNum
import com.microsoft.z3.Optimize
import com.microsoft.z3.Status
import com.microsoft.z3.Symbol
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class Z3PolyhedronSolver implements PolyhedronSolver {
	val boolean lpRelaxation

	@FinalFieldsConstructor
	new() {
	}

	new() {
		this(true)
	}

	override createSaturationOperator(Polyhedron polyhedron) {
		new Z3SaturationOperator(polyhedron, lpRelaxation)
	}
}

class Z3SaturationOperator implements PolyhedronSaturationOperator {
	static val INFINITY_SYMBOL_NAME = "oo"
	static val MULT_SYMBOL_NAME = "*"

	extension val Context context
	val Symbol infinitySymbol
	val Symbol multSymbol
	@Accessors val Polyhedron polyhedron
	val Map<Dimension, ArithExpr> variables

	new(Polyhedron polyhedron, boolean lpRelaxation) {
		context = new Context
		infinitySymbol = context.mkSymbol(INFINITY_SYMBOL_NAME)
		multSymbol = context.mkSymbol(MULT_SYMBOL_NAME)
		this.polyhedron = polyhedron
		variables = polyhedron.dimensions.toInvertedMap [ dimension |
			val name = dimension.name
			if (lpRelaxation) {
				mkRealConst(name)
			} else {
				mkIntConst(name)
			}
		]
	}

	override saturate() {
		val status = doSaturate()
		convertStatusToSaturationResult(status)
	}

	private def convertStatusToSaturationResult(Status status) {
		switch (status) {
			case SATISFIABLE:
				PolyhedronSaturationResult.SATURATED
			case UNSATISFIABLE:
				PolyhedronSaturationResult.EMPTY
			case UNKNOWN:
				PolyhedronSaturationResult.UNKNOWN
			default:
				throw new IllegalArgumentException("Unknown Status: " + status)
		}
	}

	private def doSaturate() {
		for (expressionToSaturate : polyhedron.expressionsToSaturate) {
			val expr = expressionToSaturate.toExpr
			val lowerResult = saturateLowerBound(expr, expressionToSaturate)
			if (lowerResult != Status.SATISFIABLE) {
				return lowerResult
			}
			val upperResult = saturateUpperBound(expr, expressionToSaturate)
			if (upperResult != Status.SATISFIABLE) {
				return upperResult
			}
		}
		Status.SATISFIABLE
	}

	private def saturateLowerBound(ArithExpr expr, LinearBoundedExpression expressionToSaturate) {
		val optimize = prepareOptimize
		val handle = optimize.MkMinimize(expr)
		val status = optimize.Check()
		if (status == Status.SATISFIABLE) {
			val value = switch (resultExpr : handle.lower) {
				IntNum:
					resultExpr.getInt()
				default:
					if (isNegativeInfinity(resultExpr)) {
						null
					} else {
						throw new IllegalArgumentException("Integer result expected, got: " + resultExpr)
					}
			}
			expressionToSaturate.lowerBound = value
		}
		status
	}

	private def saturateUpperBound(ArithExpr expr, LinearBoundedExpression expressionToSaturate) {
		val optimize = prepareOptimize
		val handle = optimize.MkMaximize(expr)
		val status = optimize.Check()
		if (status == Status.SATISFIABLE) {
			val value = switch (resultExpr : handle.upper) {
				IntNum:
					resultExpr.getInt()
				default:
					if (isPositiveInfinity(resultExpr)) {
						null
					} else {
						throw new IllegalArgumentException("Integer result expected, got: " + resultExpr)
					}
			}
			expressionToSaturate.upperBound = value
		}
		status
	}

	private def isPositiveInfinity(Expr expr) {
		expr.app && expr.getFuncDecl.name == infinitySymbol
	}

	private def isNegativeInfinity(Expr expr) {
		// Negative infinity is represented as (* (- 1) oo)
		if (!expr.app || expr.getFuncDecl.name != multSymbol || expr.numArgs != 2) {
			return false
		}
		isPositiveInfinity(expr.args.get(1))
	}

	private def prepareOptimize() {
		val optimize = mkOptimize()
		assertConstraints(optimize)
		optimize
	}

	private def assertConstraints(Optimize it) {
		for (pair : variables.entrySet) {
			assertBounds(pair.value, pair.key)
		}
		for (constraint : polyhedron.constraints) {
			val expr = createLinearCombination(constraint.coefficients)
			assertBounds(expr, constraint)
		}
	}

	private def assertBounds(Optimize it, ArithExpr expression, LinearBoundedExpression bounds) {
		val lowerBound = bounds.lowerBound
		val upperBound = bounds.upperBound
		if (lowerBound == upperBound) {
			if (lowerBound === null) {
				return
			}
			Assert(mkEq(expression, mkInt(lowerBound)))
		} else {
			if (lowerBound !== null) {
				Assert(mkGe(expression, mkInt(lowerBound)))
			}
			if (upperBound !== null) {
				Assert(mkLe(expression, mkInt(upperBound)))
			}
		}
	}

	private def toExpr(LinearBoundedExpression linearBoundedExpression) {
		switch (linearBoundedExpression) {
			Dimension: variables.get(linearBoundedExpression)
			LinearConstraint: createLinearCombination(linearBoundedExpression.coefficients)
			default: throw new IllegalArgumentException("Unknown linear bounded expression:" + linearBoundedExpression)
		}
	}

	private def createLinearCombination(Map<Dimension, Integer> coefficients) {
		val size = coefficients.size
		val array = newArrayOfSize(size)
		var int i = 0
		for (pair : coefficients.entrySet) {
			val variable = variables.get(pair.key)
			if (variable === null) {
				throw new IllegalArgumentException("Unknown dimension: " + pair.key.name)
			}
			val coefficient = pair.value
			val term = if (coefficient == 1) {
					variable
				} else {
					mkMul(mkInt(coefficient), variable)
				}
			array.set(i, term)
			i++
		}
		mkAdd(array)
	}

	override close() throws Exception {
		context.close()
	}
}
