package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue
import java.math.BigDecimal

class Smt2LogicMapper {
	val extension LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE
	
	public def transformOutput(LogicProblem problem, SMTOutput output, Logic2SmtMapperTrace trace, long transformationTime, long solverTime) {
		val satResult = output.satResult
		if(satResult === null) { // Timeout
			return createInsuficientResourcesResult => [ init(problem,output,transformationTime,solverTime) it.resourceName = "time"]
		} else {
			if(satResult instanceof SMTErrorResult) {
				return createErrorResult => [init(problem,output,transformationTime,solverTime) message = satResult.message]
			} else if(satResult instanceof SMTUnsupportedResult) {
				return createUndecidableResult => [init(problem,output,transformationTime,solverTime)]
			} else if(satResult instanceof SMTSatResult) {
				if(satResult.sat) {
					return createModelResult => [
						init(problem,output,transformationTime,solverTime)
						representation += output.eContainer
						it.trace = trace
					]
				} else if(satResult.unsat) {
					return createInconsistencyResult => [init(problem,output,transformationTime,solverTime)]
				} else if(satResult.unknown) {
					return createUndecidableResult => [init(problem,output,transformationTime,solverTime)]	
				}
			} else throw new LogicReasonerException("The solver resulted with unknown result.")
		}
	}
	
	private def init(LogicResult result,LogicProblem problem, SMTOutput output, long transformationTime, long solverTime) {
		result.problem = problem
		result.statistics = output.statistics.transformStatistics(transformationTime,solverTime)
	}
	
	protected def transformStatistics(SMTStatisticsSection section, long transformationTime, long solverTime) {
		createStatistics => [
			it.transformationTime = transformationTime.intValue
			it.solverTime = solverTime.intValue
			
			val memorySection = section.values.filter[it.name==":memory"].head
			if(memorySection != null) {
				it.solverMemory = ((memorySection as SMTStatisticDoubleValue).value.add(BigDecimal.valueOf(0.5))).intValue
			}
			entries += section.values.map[transformEntry]
		]
	}
	
	protected def dispatch transformEntry(SMTStatisticIntValue entry) {
		createIntStatisticEntry => [name = entry.exportName value = entry.value] }
	protected def dispatch transformEntry(SMTStatisticDoubleValue entry) {
		createRealStatisticEntry => [name = entry.exportName value = entry.value.doubleValue] }
	
	private def exportName(SMTStatisticValue value) {
		return value.name.replaceFirst(":","")
	}
}