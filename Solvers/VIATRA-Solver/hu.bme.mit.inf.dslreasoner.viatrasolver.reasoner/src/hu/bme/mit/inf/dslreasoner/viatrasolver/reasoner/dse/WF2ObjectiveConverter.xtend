package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import com.google.common.collect.ImmutableList
import java.util.ArrayList
import java.util.Collection
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.viatra.dse.objectives.IGlobalConstraint
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective
import org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective.QueryConstraint
import org.eclipse.viatra.dse.objectives.impl.ModelQueriesGlobalConstraint
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class WF2ObjectiveConverter {
	static val UNFINISHED_WFS_NAME = "unfinishedWFs"
	static val INVALIDATED_WFS_NAME = "invalidatedWFs"

	def createCompletenessObjective(
		Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWF) {
		createConstraintObjective(UNFINISHED_WFS_NAME, unfinishedWF)
	}

	def createInvalidationObjective(
		Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidatedByWF) {
		createConstraintObjective(INVALIDATED_WFS_NAME, invalidatedByWF)
	}

	def IGlobalConstraint createInvalidationGlobalConstraint(
		Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidatedByWF) {
		new ModelQueriesGlobalConstraint(INVALIDATED_WFS_NAME, new ArrayList(invalidatedByWF))
	}

	private def createConstraintObjective(String name,
		Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> queries) {
		val res = new ConstraintsObjective(
			name,
			ImmutableList.copyOf(queries.map [
				new QueryConstraint(it.fullyQualifiedName, it, 1.0)
			])
		)
		res.withComparator(Comparators.LOWER_IS_BETTER)
		res.level = 2
		res
	}
}
