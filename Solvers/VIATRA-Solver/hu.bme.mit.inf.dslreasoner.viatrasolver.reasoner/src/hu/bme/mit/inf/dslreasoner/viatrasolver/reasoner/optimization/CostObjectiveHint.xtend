package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.BoundSaturationListener
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ExtendedLinearExpressionBuilder
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeConstraintHint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeExpressionBuilderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronExtensionOperator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Accessors

abstract class CostObjectiveHint implements LinearTypeConstraintHint, BoundSaturationListener {
	@Accessors ThreeValuedCostObjective objective
	@Accessors IObjectiveBoundsProvider boundsProvider
	
	Integer bestUpper = null

	override getAdditionalPatterns(PatternGenerator patternGenerator, Map<String, PQuery> fqnToPQuery) {
		''''''
	}

	override createConstraintUpdater(LinearTypeExpressionBuilderFactory builderFactory) {
		null
	}
	
	def isExact() {
		false
	}

	def PolyhedronExtensionOperator createPolyhedronExtensionOperator(
		Map<String, CostElementMatchers> costElementMatchers) {
		null
	}
	
	def setObjective(ThreeValuedCostObjective objective) {
		if (this.objective !== null) {
			throw new IllegalStateException("Objective was already set")
		}
		this.objective = objective
	}
	
	def setBoundsProvider(IObjectiveBoundsProvider boundsProvider) {
		if (this.boundsProvider !== null) {
			throw new IllegalStateException("Objective bounds provider was already set")
		}
		this.boundsProvider = boundsProvider
	}
	
	protected def buildWithBounds(ExtendedLinearExpressionBuilder builder) {
		val bounds = builder.build(this)
		if (objective !== null && boundsProvider !== null) {
			boundsProvider.computeRequiredBounds(objective, bounds)
		}
		if (exact && bestUpper !== null) {
			bounds.tightenLowerBound(bestUpper)
		}
		bounds
	}
	
	override boundsSaturated(Integer lower, Integer upper) {
		if (upper !== null && (bestUpper === null || bestUpper < upper)) {
			bestUpper = upper
		}
		objective?.boundsSaturated(lower, upper)
	}
	
}
