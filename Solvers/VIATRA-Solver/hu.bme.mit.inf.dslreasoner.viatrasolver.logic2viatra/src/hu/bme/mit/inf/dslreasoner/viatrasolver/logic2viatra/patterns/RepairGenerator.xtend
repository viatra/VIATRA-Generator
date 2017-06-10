package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem

class RepairGenerator {
	val PatternGenerator base;
	new(PatternGenerator base) {
		this.base = base
	}
	
	def generateRepairUnfinishedMultiplicityPatterns(LogicProblem problem) {
		//val refinements = base.relationRefinementGenerator.getRelationRefinements(problem)
		//val unfinisedLowerMultiplicities = base.get
	}
	def getRepairUnfinishedMultiplicityPatterns() {
		
	}
}