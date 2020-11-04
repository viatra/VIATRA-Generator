package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.cache.Cache
import com.google.common.cache.CacheBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
abstract class PolyhedronScopePropagatorStrategy {
	val ModelGenerationStatistics statistics

	@Accessors(PUBLIC_GETTER) var Polyhedron polyhedron

	def void setPolyhedron(Polyhedron polyhedron, Map<Type, LinearBoundedExpression> typeBounds,
		Map<Map<Dimension, Integer>, LinearBoundedExpression> initialExpressionsCache) {
		if (this.polyhedron !== null) {
			throw new IllegalStateException("polyhedron was already set")
		}
		this.polyhedron = polyhedron
		initialize()
	}

	def boolean saturate() {
		if (polyhedron === null) {
			throw new IllegalStateException("polyhedron was not set")
		}
		doSaturate()
	}
	
	def boolean isRelevantRelation(Relation relation) {
		false
	}

	protected def incrementScopePropagationSolverCount() {
		statistics.incrementScopePropagationSolverCount()
	}

	protected def void initialize() {
	}

	protected def boolean doSaturate()
}

@FinalFieldsConstructor
class CachingSimplePolyhedronScopePropagatorStrategy extends PolyhedronScopePropagatorStrategy {
	static val CACHE_SIZE = 10000

	val PolyhedronSolver solver

	val Cache<PolyhedronSignature, PolyhedronSignature> cache = CacheBuilder.newBuilder.maximumSize(CACHE_SIZE).build
	var PolyhedronSaturationOperator operator

	new(PolyhedronSolver solver, ModelGenerationStatistics statistics) {
		super(statistics)
		this.solver = solver
	}

	override protected initialize() {
		operator = solver.createSaturationOperator(polyhedron)
	}

	override protected doSaturate() {
		val signature = polyhedron.createSignature
		val cachedSignature = cache.getIfPresent(signature)
		switch (cachedSignature) {
			case null: {
				incrementScopePropagationSolverCount()
				val result = operator.saturate()
				if (result == PolyhedronSaturationResult.EMPTY) {
					cache.put(signature, PolyhedronSignature.EMPTY)
					false
				} else {
					val resultSignature = polyhedron.createSignature
					cache.put(signature, resultSignature)
					true
				}
			}
			case PolyhedronSignature.EMPTY:
				false
			PolyhedronSignature.Bounds: {
				polyhedron.applySignature(signature)
				true
			}
			default:
				throw new IllegalStateException("Unknown polyhedron signature: " + signature)
		}
	}
}
