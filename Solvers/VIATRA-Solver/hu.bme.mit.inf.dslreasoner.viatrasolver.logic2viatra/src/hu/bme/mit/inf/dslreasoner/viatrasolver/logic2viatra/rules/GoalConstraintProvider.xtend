package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.MultiplicityGoalConstraintCalculator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.GeneratedPatterns
import java.util.ArrayList

class GoalConstraintProvider {
	def public getUnfinishedMultiplicityQueries(GeneratedPatterns patterns) {
		val multiplicityQueries = patterns.unfinishedMulticiplicityQueries
		val res = new ArrayList(multiplicityQueries.size)
		for(multiplicityQuery : multiplicityQueries.entrySet) {
			val targetRelationName = multiplicityQuery.key.name
			val query = multiplicityQuery.value
			res += new MultiplicityGoalConstraintCalculator(targetRelationName,query);
		}
		return res
	}
}