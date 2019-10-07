package ca.mcgill.ecse.dslreasoner.vampire.reasoner

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup
import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetupGenerated
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.MonitoredVampireSolution
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Vampire2LogicMapper
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireHandler
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireModelInterpretation
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSFiniteModelImpl
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

	val Logic2VampireLanguageMapper forwardMapper = new Logic2VampireLanguageMapper
	val Vampire2LogicMapper backwardMapper = new Vampire2LogicMapper
	val VampireHandler handler = new VampireHandler

	var fileName = "problem.tptp"

	def solve(LogicProblem problem, LogicSolverConfiguration config, ReasonerWorkspace workspace, String location) {
		fileName = location + fileName
		solve(problem, config, workspace)
	}

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
		
		
		
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("tptp", new VampireLanguageFactoryImpl)
////		val Resource resource = Resource.
////		Resource.getResource(wsURI+"problem.tptp") as Resource
////		resource
//		val model = workspace.readModel(VampireModel, "problem.tptp").eResource.contents
//		println(model)
		

		// Result as String
		val transformationTime = System.currentTimeMillis - transformationStart
		// Finish: Logic -> Vampire mapping
		
		// Start: Solving .tptp problem
		val solverStart = System.currentTimeMillis
		val MonitoredVampireSolution vampSol = handler.callSolver(vampireProblem, workspace, vampireConfig)
		val solvingTime = System.currentTimeMillis - solverStart
		// Finish: Solving .tptp problem
		
		// Start: Vampire -> Logic mapping
		val backTransformationStart = System.currentTimeMillis
		// Backwards Mapper
		val logicResult = backwardMapper.transformOutput(problem,vampireConfig.solutionScope.numberOfRequiredSolution,vampSol,forwardTrace,solvingTime)

		val backTransformationTime = System.currentTimeMillis - backTransformationStart
		// Finish: Vampire -> Logic Mapping
		
//		print(vampSol.generatedModel.tfformulas.size)
		return logicResult //currently only a ModelResult
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
//		 val answers = (modelResult.representation as MonitoredAlloySolution).aswers.map[key]
		val sols = modelResult.representation// as List<A4Solution>
		//val res = answers.map 
		sols.map[
			new VampireModelInterpretation(
//				forwardMapper.typeMapper.typeInterpreter,
				it as VampireModel,
//				forwardMapper,
				modelResult.trace as Logic2VampireLanguageMapperTrace
			)
		]
	}
//	*/
}
