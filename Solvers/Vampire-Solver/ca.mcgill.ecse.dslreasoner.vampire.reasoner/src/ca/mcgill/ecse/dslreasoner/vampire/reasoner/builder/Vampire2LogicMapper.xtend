package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory

class Vampire2LogicMapper {
	val extension LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE

//	
	public def transformOutput(LogicProblem problem, int requiredNumberOfSolution,
		MonitoredVampireSolution monitoredVampireSolution, Logic2VampireLanguageMapperTrace trace,
		long transformationTime) {

		// ModelRsult implements LogicResult
		return createModelResult => [
			it.problem = problem
			it.representation += monitoredVampireSolution.generatedModel
			it.trace = trace
			it.statistics = transformStatistics(monitoredVampireSolution, transformationTime)
		]
	}

	def transformStatistics(MonitoredVampireSolution solution, long transformationTime) {
		return createStatistics => [
			it.transformationTime = solution.solverTime as int
		]
//		createStatistics => [
//			it.transformationTime = transformationTime as int
//			for(solutionIndex : 0..<solution.aswers.size) {
//				val solutionTime = solution.aswers.get(solutionIndex).value
//				 it.entries+= createIntStatisticEntry => [
//					it.name = '''Answer«solutionIndex»Time'''
//					it.value = solutionTime.intValue
//				]
//			}
//			it.entries+= createIntStatisticEntry => [
//				it.name = "Alloy2KodKodTransformationTime"
//				it.value = solution.kodkodTime as int
//			]
//			it.entries+= createIntStatisticEntry => [
//				it.name = "Alloy2KodKodTransformationTime"
//				it.value = solution.kodkodTime as int
//			]
//			it.entries+= createStringStatisticEntry => [
//				it.name = "warnings"
//				it.value = '''[«FOR warning : solution.warnings SEPARATOR ","»«warning»«ENDFOR»]'''
//			]
//		]
	}

}
