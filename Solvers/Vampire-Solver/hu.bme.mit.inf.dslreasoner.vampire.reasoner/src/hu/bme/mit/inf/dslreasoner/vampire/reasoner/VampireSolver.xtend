package hu.bme.mit.inf.dslreasoner.vampire.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguagePackage
import hu.bme.mit.inf.dslreasoner.VampireLanguageStandaloneSetupGenerated
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.VampireHandler
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException
import java.io.File
import java.io.PrintWriter

//ASK
class VampireSolver extends LogicReasoner{
	
	new() {
		VampireLanguagePackage.eINSTANCE.eClass
		val x = new VampireLanguageStandaloneSetupGenerated
		x.createInjectorAndDoEMFRegistration //ASK
	}
	
	//TODO
	 val Logic2VampireLanguageMapper forwardMapper = new Logic2VampireLanguageMapper(new Logic2VampireLanguageMapper_TypeMapper_FilteredTypes)
	 //TODO
	 val VampireHandler handler = new VampireHandler
	 //val Vampire2LogicMapper backwardMapper = new Vampire2LogicMapper
	 
	 val fileName = "problem.tptp"
	 
	 override solve(LogicProblem problem, LogicSolverConfiguration configuration, ReasonerWorkspace workspace) throws LogicReasonerException {
		val vampireConfig = configuration.asConfig
		
		// Start: Logic -> Vampire mapping
		val transformationStart = System.currentTimeMillis
		val result = forwardMapper.transformProblem(problem,vampireConfig)
		val vampireProblem = result.output
		val forwardTrace = result.trace
		
		var String fileURI = null;
		var String vampireCode = null;
		if(vampireConfig.writeToFile) {
			fileURI = workspace.writeModel(vampireProblem,fileName).toFileString
		} else {
			vampireCode = workspace.writeModelToString(vampireProblem,fileName)
		} 
		val transformationTime = System.currentTimeMillis - transformationStart
		// Finish: Logic -> Alloy mapping
		
		/* 	
		 * not for now
		 *  
		// Start: Solving Alloy problem
		val solverStart = System.currentTimeMillis
		val result2 = handler.callSolver(alloyProblem,workspace,alloyConfig,fileURI,alloyCode)
		val logicResult = backwardMapper.transformOutput(problem,configuration.solutionScope.numberOfRequiredSolution,result2,forwardTrace,transformationTime)
		val solverFinish = System.currentTimeMillis-solverStart
		// Finish: Solving Alloy problem
				
		if(vampireConfig.writeToFile) workspace.deactivateModel(fileName)
		
		return logicResult
		*/
		
		//Creates a file containing the tptp code after transformation
		val out = new PrintWriter("vampireCode.tptp")
		out.println(vampireCode)
		out.close()
		
		return null // for now
	}
	
	def asConfig(LogicSolverConfiguration configuration){
		if(configuration instanceof VampireSolverConfiguration) {
			return configuration
		} else {
			throw new IllegalArgumentException('''The configuration have to be an «VampireSolverConfiguration.simpleName»!''')	
		}
	}
	
	/*
	 * not for now
	 * 
	override getInterpretations(ModelResult modelResult) {
		//val answers = (modelResult.representation as MonitoredAlloySolution).aswers.map[key]
		val sols = modelResult.representation// as List<A4Solution>
		//val res = answers.map 
		sols.map[
			new VampireModelInterpretation(
				forwardMapper.typeMapper.typeInterpreter,
				it as A4Solution,
				forwardMapper,
				modelResult.trace as Logic2AlloyLanguageMapperTrace
			)
		]
	}	
	*/
	
}