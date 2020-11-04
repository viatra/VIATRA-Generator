package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import java.util.Collection
import java.util.Map
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation

interface PolyhedronExtensionOperator {
	def void extendPolyhedron(ExtendedLinearExpressionBuilderFactory factory)
}

class ExtendedPolyhedronScopePropagatorStrategy extends PolyhedronScopePropagatorStrategy {
	val PolyhedronSolver solver
	val Collection<PolyhedronExtensionOperator> extensionOperators

	var Map<Type, LinearBoundedExpression> typeBounds
	var Map<Map<Dimension, Integer>, LinearBoundedExpression> initialExpressionsCache

	new(PolyhedronSolver solver, Collection<PolyhedronExtensionOperator> extensionOperators,
		ModelGenerationStatistics statistics) {
		super(statistics)
		this.solver = solver
		this.extensionOperators = extensionOperators
	}

	override setPolyhedron(Polyhedron polyhedron, Map<Type, LinearBoundedExpression> typeBounds,
		Map<Map<Dimension, Integer>, LinearBoundedExpression> initialExpressionsCache) {
		super.setPolyhedron(polyhedron, typeBounds, initialExpressionsCache)
		this.typeBounds = typeBounds
		this.initialExpressionsCache = initialExpressionsCache
	}

	override isRelevantRelation(Relation relation) {
		true
	}

	override protected doSaturate() {
		val builder = new ExtendedPolyhedronBuilder(polyhedron, typeBounds, initialExpressionsCache)
		for (extensionOperator : extensionOperators) {
			extensionOperator.extendPolyhedron(builder)
		}
		val extendedPolyhedron = builder.buildPolyhedron()
		val saturationOperator = solver.createSaturationOperator(extendedPolyhedron)
		val result = try {
				saturationOperator.saturate()
			} finally {
				saturationOperator.close()
			}
		if (result == PolyhedronSaturationResult.EMPTY) {
			// The partial model cannot be refined any more, we can't provide objective bounds.
			for (pair : builder.saturationListeners) {
				pair.value.boundsSaturated(null, null)
			}
			return false
		}
		for (pair : builder.saturationListeners) {
			val expression = pair.key
			pair.value.boundsSaturated(expression.lowerBound, expression.upperBound)
		}
		true
	}
}
