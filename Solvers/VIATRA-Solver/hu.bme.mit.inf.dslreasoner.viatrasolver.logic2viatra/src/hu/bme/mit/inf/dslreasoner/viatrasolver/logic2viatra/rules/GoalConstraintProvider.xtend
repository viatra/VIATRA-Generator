package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.MultiplicityGoalConstraintCalculator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.GeneratedPatterns
import java.util.ArrayList

class GoalConstraintProvider {
	
	def getUnfinishedMultiplicityQueries(LogicProblem p, GeneratedPatterns patterns) {
		val res = new ArrayList()
		for (entry : patterns.multiplicityConstraintQueries.entrySet) {
			val constraint = entry.key
			if (constraint.constrainsUnfinished) {
				val queries = entry.value
				val targetRelationName = constraint.relation.name
				val query = queries.unfinishedMultiplicityQuery
				val minValue = constraint.lowerBound
				val containment = constraint.containment
				res += new MultiplicityGoalConstraintCalculator(targetRelationName, query, minValue, containment, 1)
			}
		}
		return res
	}

}