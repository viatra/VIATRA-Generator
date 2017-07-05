package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory

class Alloy2LogicMapper {
	val extension LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE
	
	public def transformOutput(LogicProblem problem, int requiredNumberOfSolution, MonitoredAlloySolution monitoredAlloySolution, Logic2AlloyLanguageMapperTrace trace, long transformationTime) {
		val models = monitoredAlloySolution.aswers.map[it.key].toList
		
		if(!monitoredAlloySolution.finishedBeforeTimeout) {
			return createInsuficientResourcesResult => [
				it.problem = problem
				it.representation += models
				it.trace = trace
				it.statistics = transformStatistics(monitoredAlloySolution,transformationTime)
			]
		} else {
			if(models.last.satisfiable || requiredNumberOfSolution == -1) {
				return createModelResult => [
					it.problem = problem
					it.representation += models
					it.trace = trace
					it.statistics = transformStatistics(monitoredAlloySolution,transformationTime)
				]
			} else {
				return createInconsistencyResult => [
					it.problem = problem
					it.representation += models
					it.trace = trace
					it.statistics = transformStatistics(monitoredAlloySolution,transformationTime)
				]
			}
		}
	}
	
	def transformStatistics(MonitoredAlloySolution solution, long transformationTime) {
		createStatistics => [
			it.transformationTime = transformationTime as int
			for(solutionIndex : 0..<solution.aswers.size) {
				val solutionTime = solution.aswers.get(solutionIndex).value
				 it.entries+= createIntStatisticEntry => [
					it.name = '''Answer«solutionIndex»Time'''
					it.value = solutionTime.intValue
				]
			}
			it.entries+= createIntStatisticEntry => [
				it.name = "Alloy2KodKodTransformationTime"
				it.value = solution.kodkodTime as int
			]
			it.entries+= createIntStatisticEntry => [
				it.name = "Alloy2KodKodTransformationTime"
				it.value = solution.kodkodTime as int
			]
			it.entries+= createStringStatisticEntry => [
				it.name = "warnings"
				it.value = '''[«FOR warning : solution.warnings SEPARATOR ","»«warning»«ENDFOR»]'''
			]
		]
	}
	
	def sum(Iterable<Long> ints) {
		ints.reduce[p1, p2|p1+p2]
	}
}