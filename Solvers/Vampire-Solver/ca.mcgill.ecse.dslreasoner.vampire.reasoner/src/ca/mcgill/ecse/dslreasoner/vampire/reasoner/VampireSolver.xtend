package ca.mcgill.ecse.dslreasoner.vampire.reasoner

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup
import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetupGenerated
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapper_FilteredTypes
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Vampire2LogicMapper
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireHandler
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace

class VampireSolver extends LogicReasoner {

	new() {
		VampireLanguagePackage.eINSTANCE.eClass
		val x = new VampireLanguageStandaloneSetupGenerated
		VampireLanguageStandaloneSetup::doSetup()
	}

	val Logic2VampireLanguageMapper forwardMapper = new Logic2VampireLanguageMapper(
		new Logic2VampireLanguageMapper_TypeMapper_FilteredTypes)
	val Vampire2LogicMapper backwardMapper = new Vampire2LogicMapper
	val VampireHandler handler = new VampireHandler

	val fileName = "vampireProblem.tptp"

	override solve(LogicProblem problem, LogicSolverConfiguration config,
		ReasonerWorkspace workspace) throws LogicReasonerException {
		val vampireConfig = config.asConfig

		// Start: Logic -> Vampire mapping
		val transformationStart = System.currentTimeMillis
		// TODO
		val result = forwardMapper.transformProblem(problem, vampireConfig)
		val vampireProblem = result.output
		val forwardTrace = result.trace

		var String fileURI = null;
		var String vampireCode = null;
		vampireCode = workspace.writeModelToString(vampireProblem, fileName)

		val writeFile = (
			vampireConfig.documentationLevel === DocumentationLevel::NORMAL ||
			vampireConfig.documentationLevel === DocumentationLevel::FULL)
		if (writeFile) {
			fileURI = workspace.writeModel(vampireProblem, fileName).toFileString
		}

		// Result as String
		val transformationTime = System.currentTimeMillis - transformationStart
		// Finish: Logic -> Vampire mapping
		/*	  
		 * // Start: Solving Alloy problem
		 * val solverStart = System.currentTimeMillis
		 * //Calling Solver (Currently Manually)
		 * val result2 = handler.callSolver(vampireProblem,workspace,vampireConfig,vampireCode)
		 * //		val result2 = null
		 * //TODO
		 * //Backwards Mapper
		 * val logicResult = backwardMapper.transformOutput(problem,config.solutionScope.numberOfRequiredSolution,result2,forwardTrace,transformationTime)
		 * 
		 * val solverFinish = System.currentTimeMillis-solverStart
		 * // Finish: Solving Alloy problem
		 * 		
		 * if(vampireConfig.writeToFile) workspace.deactivateModel(fileName)
		 * 
		 * return logicResult
		 * 
		 /*/
		return null // for now
		// */
	}

	def asConfig(LogicSolverConfiguration configuration) {
		if (configuration instanceof VampireSolverConfiguration) {
			return configuration
		} else {
			throw new IllegalArgumentException('''The configuration have to be an «VampireSolverConfiguration.simpleName»!''')
		}
	}

//	/*
//	 * not for now
//	 * 
	override getInterpretations(ModelResult modelResult) {
		// val answers = (modelResult.representation as MonitoredAlloySolution).aswers.map[key]
//		val sols = modelResult.representation// as List<A4Solution>
//		//val res = answers.map 
//		sols.map[
//			new VampireModelInterpretation(
//				forwardMapper.typeMapper.typeInterpreter,
//				it as A4Solution,
//				forwardMapper,
//				modelResult.trace as Logic2AlloyLanguageMapperTrace
//			)
//		]
	}
//	*/
}
