package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class QueryBasedObjective extends DirectionalThresholdObjective {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification
	ViatraQueryMatcher<? extends IPatternMatch> matcher

	new(IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification,
		ObjectiveKind kind, ObjectiveThreshold threshold, int level) {
		super(querySpecification.simpleName + " objective", kind, threshold, level)
		if (querySpecification.parameters.size != 1) {
			throw new IllegalArgumentException("Objective query must have a single parameter")
		}
		this.querySpecification = querySpecification
	}

	override createNew() {
		new QueryBasedObjective(querySpecification, kind, threshold, level)
	}

	override init(ThreadContext context) {
		matcher = querySpecification.getMatcher(context.queryEngine)
	}

	override protected getRawFitness(ThreadContext context) {
		val iterator = matcher.allMatches.iterator
		if (!iterator.hasNext) {
			return invalidValue
		}
		val value = iterator.next.get(0)
		if (iterator.hasNext) {
			throw new IllegalStateException("Multiple matches for objective query")
		}
		if (value instanceof Number) {
			value.doubleValue
		} else {
			throw new IllegalStateException("Objective value is not an instance of Number")
		}
	}

	private def getInvalidValue() {
		kind.invalidValue
	}
}
