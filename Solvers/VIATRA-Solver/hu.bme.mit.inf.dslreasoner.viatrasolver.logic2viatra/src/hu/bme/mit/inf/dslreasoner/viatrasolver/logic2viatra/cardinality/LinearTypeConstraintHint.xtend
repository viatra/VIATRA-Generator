package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

interface LinearTypeExpressionBuilderFactory {
	def ViatraQueryMatcher<? extends IPatternMatch> createMatcher(String queryName)
	
	def LinearTypeExpressionBuilder createBuilder()
}

interface LinearTypeExpressionBuilder {
	def LinearTypeExpressionBuilder add(int scale, Type type)

	def LinearBoundedExpression build()
}

@FunctionalInterface
interface RelationConstraintUpdater {
	def void update(PartialInterpretation p)
}

interface LinearTypeConstraintHint {
	def CharSequence getAdditionalPatterns(PatternGenerator patternGenerator)
	
	def RelationConstraintUpdater createConstraintUpdater(LinearTypeExpressionBuilderFactory builderFactory)
}
