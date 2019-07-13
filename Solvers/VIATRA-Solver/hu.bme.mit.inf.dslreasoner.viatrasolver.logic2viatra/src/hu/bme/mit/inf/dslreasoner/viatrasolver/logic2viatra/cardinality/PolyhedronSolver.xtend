package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

interface PolyhedronSolver {
	def PolyhedronSaturationOperator createSaturationOperator(Polyhedron polyhedron)
}

enum PolyhedronSaturationResult {
	SATURATED,
	EMPTY,
	UNKNOWN
}

interface PolyhedronSaturationOperator extends AutoCloseable {
	def Polyhedron getPolyhedron()

	def PolyhedronSaturationResult saturate()
}

@FinalFieldsConstructor
@Accessors
class Polyhedron {
	/**
	 * The list of dimensions (variables) for this polyhedron.
	 * 
	 * This list must not be modified after the polyhedron was created.
	 * However, lower and upper bounds of the dimensions may be changed.
	 * 
	 * Names of dimensions in this list are assumed to be unique.
	 */
	val List<Dimension> dimensions

	/**
	 * The list of constraints defining this polyhedron.
	 * 
	 * The list and its elements may be freely modified.
	 */
	val List<LinearConstraint> constraints

	/**
	 * The list of constraints that should be saturated (tightened)
	 * when a {@link PolyhedronSaturationOperator} is invoked.
	 * 
	 * This list may be freely modified.
	 * 
	 * Place all dimensions and constraints here to saturate all the bounds.
	 */
	val List<LinearBoundedExpression> expressionsToSaturate

	override toString() '''
		Dimensions:
			«FOR dimension : dimensions»
				«dimension»
			«ENDFOR»
		Constraints:
			«FOR constraint : constraints»
				«constraint»
			«ENDFOR»
«««		Saturate:
«««			«FOR expression : expressionsToSaturate»
«««				«IF expression instanceof Dimension»dimension«ELSEIF expression instanceof LinearConstraint»constraint«ELSE»unknown«ENDIF» «expression»
«««			«ENDFOR»
	'''

}

@Accessors
abstract class LinearBoundedExpression {
	var Integer lowerBound
	var Integer upperBound
}

@Accessors
class Dimension extends LinearBoundedExpression {
	val String name

	@FinalFieldsConstructor
	new() {
	}

	new(String name, Integer lowerBound, Integer upperBound) {
		this(name)
		this.lowerBound = lowerBound
		this.upperBound = upperBound
	}

	override toString() {
		'''«IF lowerBound !== null»«lowerBound» <= «ENDIF»«name»«IF upperBound !== null» <= «upperBound»«ENDIF»'''
	}

}

@Accessors
class LinearConstraint extends LinearBoundedExpression {
	val Map<Dimension, Integer> coefficients

	@FinalFieldsConstructor
	new() {
	}

	new(Map<Dimension, Integer> coefficients, Integer lowerBound, Integer upperBound) {
		this(coefficients)
		this.lowerBound = lowerBound
		this.upperBound = upperBound
	}

	override toString() {
		'''«IF lowerBound !== null»«lowerBound» <= «ENDIF»«FOR pair : coefficients.entrySet SEPARATOR " + "»«IF pair.value != 1»«pair.value» * «ENDIF»«pair.key.name»«ENDFOR»«IF upperBound !== null» <= «upperBound»«ENDIF»'''
	}

}
