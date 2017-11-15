package hu.bme.mit.inf.dlsreasoner.alloy.reasoner

import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Alloy2LogicMapper
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.AlloyHandler
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.AlloyModelInterpretation
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.AlloyModelInterpretation_TypeInterpretation_FilteredTypes
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Logic2AlloyLanguageMapper
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Logic2AlloyLanguageMapperTrace
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.Logic2AlloyLanguageMapper_TypeMapper_FilteredTypes
import hu.bme.mit.inf.dslreasoner.AlloyLanguageStandaloneSetupGenerated
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.PrintWriter

class AlloySolver extends LogicReasoner{
	
	new() {
		AlloyLanguagePackage.eINSTANCE.eClass
		val x = new AlloyLanguageStandaloneSetupGenerated
		x.createInjectorAndDoEMFRegistration
	}
	
	val Logic2AlloyLanguageMapper forwardMapper = new Logic2AlloyLanguageMapper(new Logic2AlloyLanguageMapper_TypeMapper_FilteredTypes)
	val AlloyHandler handler = new AlloyHandler
	val Alloy2LogicMapper backwardMapper = new Alloy2LogicMapper
	
	val fileName = "problem.als"
	
	override solve(LogicProblem problem, LogicSolverConfiguration configuration, ReasonerWorkspace workspace) throws LogicReasonerException {
		val alloyConfig = configuration.asConfig
		
		// Start: Logic -> Alloy mapping
		val transformationStart = System.currentTimeMillis
		val result = forwardMapper.transformProblem(problem,alloyConfig)
		val alloyProblem = result.output
		val forwardTrace = result.trace
		
		var String fileURI = null;
		var String alloyCode = null;
		if(alloyConfig.writeToFile) {
			fileURI = workspace.writeModel(alloyProblem,fileName).toFileString
		} else {
			alloyCode = workspace.writeModelToString(alloyProblem,fileName)
		} 
		val transformationTime = System.currentTimeMillis - transformationStart
		// Finish: Logic -> Alloy mapping
		
		
		//ADDED BY AREN
		//Creates a file containing the tptp code after transformation
		val out = new PrintWriter("vampireCode.tptp")
		out.println(alloyCode)
		out.close()
		
		
		// Start: Solving Alloy problem
		val solverStart = System.currentTimeMillis
		val result2 = handler.callSolver(alloyProblem,workspace,alloyConfig,fileURI,alloyCode)
		val logicResult = backwardMapper.transformOutput(problem,configuration.solutionScope.numberOfRequiredSolution,result2,forwardTrace,transformationTime)
		val solverFinish = System.currentTimeMillis-solverStart
		// Finish: Solving Alloy problem
		
		if(alloyConfig.writeToFile) workspace.deactivateModel(fileName)
		
		return logicResult
	}
	
	def asConfig(LogicSolverConfiguration configuration) {
		if(configuration instanceof AlloySolverConfiguration) {
			return configuration
		} else {
			throw new IllegalArgumentException('''The configuration have to be an «AlloySolverConfiguration.simpleName»!''')	
		}
	}
	
	override getInterpretations(ModelResult modelResult) {
		//val answers = (modelResult.representation as MonitoredAlloySolution).aswers.map[key]
		val sols = modelResult.representation// as List<A4Solution>
		//val res = answers.map 
		sols.map[
			new AlloyModelInterpretation(
				forwardMapper.typeMapper.typeInterpreter,
				it as A4Solution,
				forwardMapper,
				modelResult.trace as Logic2AlloyLanguageMapperTrace
			)
		]
	}	
}