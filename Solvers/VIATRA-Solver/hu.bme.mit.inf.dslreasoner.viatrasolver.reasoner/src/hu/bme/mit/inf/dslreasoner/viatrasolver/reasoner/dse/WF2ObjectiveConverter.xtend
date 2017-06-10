package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

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
	
	def createCompletenessObjective(
		Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWF)
	{
		val res = new ConstraintsObjective('''unfinishedWFs''',
			unfinishedWF.map[
				new QueryConstraint(it.fullyQualifiedName,it,1.0)
			].toList
		)
		res.withComparator(Comparators.LOWER_IS_BETTER)
		res.level = 2
		return res
	}
	
	def IGlobalConstraint createInvalidationObjective(
		Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidatedByWF)
	{
		return new ModelQueriesGlobalConstraint('''invalidatedWFs''',
			new ArrayList(invalidatedByWF)
		)
	}
}