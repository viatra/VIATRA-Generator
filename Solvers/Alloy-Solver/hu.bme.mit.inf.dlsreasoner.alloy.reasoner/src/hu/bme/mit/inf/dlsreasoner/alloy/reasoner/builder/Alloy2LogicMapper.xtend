package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory

class Alloy2LogicMapper {
	val extension LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE
	
	public def transformOutput(LogicProblem problem, MonitoredAlloySolution solution, Logic2AlloyLanguageMapperTrace trace, long transformationTime) {
		if(solution == null) {
			return createInsuficientResourcesResult => [
				it.problem = problem
				it.statistics = transformStatistics(solution,transformationTime)
			]
		} else {
			val logicResult = solution.solution
			if(logicResult.satisfiable) {
				return createModelResult => [
					it.problem = problem
					it.representation += solution
					it.maxInteger = logicResult.max
					it.minInteger = logicResult.min
					it.trace = trace
					it.statistics = transformStatistics(solution,transformationTime)
				]
			} else {
				return createInconsistencyResult => [
					it.problem = problem
					//trace?
					it.statistics = transformStatistics(solution,transformationTime)
				]
			}
		}
	}
	
	def transformStatistics(MonitoredAlloySolution solution, long transformationTime) {
		createStatistics => [
			it.transformationTime = transformationTime as int
			if(solution != null) {
				it.solverTime = solution.runtimeTime as int
				it.entries += LogicresultFactory.eINSTANCE.createIntStatisticEntry => [
					it.name = "KoodkodToCNFTransformationTime"
					it.value = solution.getKodkodTime as int
				]
			}
		]
	}
}