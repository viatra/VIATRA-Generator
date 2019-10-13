package ca.mcgill.ecse.dslreasoner.vampire.reasoner

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup
import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetupGenerated
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.MonitoredVampireSolution
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Vampire2LogicMapper
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireHandler
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireModelInterpretation
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory
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
	val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val extension LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE

//	var fileName = "problem.tptp"
//	def solve(LogicProblem problem, LogicSolverConfiguration config, ReasonerWorkspace workspace, String location) {
//		fileName = location + fileName
//		solve(problem, config, workspace)
//	}
	override solve(LogicProblem problem, LogicSolverConfiguration config,
		ReasonerWorkspace workspace) throws LogicReasonerException {
		val vampireConfig = config.asConfig
		var fileName = "problem_" + vampireConfig.typeScopes.minNewElements + "-" +
			vampireConfig.typeScopes.maxNewElements + ".tptp"

		// Start: Logic -> Vampire mapping
		val transformationStart = System.currentTimeMillis
		// TODO
		val result = forwardMapper.transformProblem(problem, vampireConfig)
		val transformationTime = System.currentTimeMillis - transformationStart

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
		// Finish: Logic -> Vampire mapping
		if (vampireConfig.genModel) {
			if (vampireConfig.server) {
				val form = support.makeForm(vampireCode, vampireConfig.solver, vampireConfig.runtimeLimit)
				var response = newArrayList
				var ind = 0
				var done = false
				print(" ")
				while (!done) {
					print("(x)")
					done = false
					response = support.sendPost(form)

					var responseFound = false
					ind = 0
					while (!responseFound) {
						var line = response.get(ind)
//						println(line)
						if (line.length >= 5 && line.substring(0, 5) == "ERROR") {
							done = false
							responseFound = true
						} else {
							if (line == "</PRE>") {
								done = true
								responseFound = true
							}
						}
						ind++
					}
				}
				val satRaw = response.get(ind - 3)
				val modRaw = response.get(ind - 2)

				val sat = newArrayList(satRaw.split(" "))
				val mod = newArrayList(modRaw.split(" "))

				val satOut = sat.get(1)
				val modOut = mod.get(1)
				val satTime = sat.get(2)
				val modTime = mod.get(2)

				println()
				println(sat)
				println(mod)

				return createModelResult => [
					it.problem = null
					it.representation += createVampireModel => []
					it.trace = trace
					it.statistics = createStatistics => [
						it.transformationTime = transformationTime as int
						it.entries += createStringStatisticEntry => [
							it.name = "satOut"
							it.value = satOut
						]
						it.entries += createRealStatisticEntry => [
							it.name = "satTime"
							it.value = Double.parseDouble(satTime)
						]
						it.entries += createStringStatisticEntry => [
							it.name = "modOut"
							it.value = modOut
						]
						it.entries += createRealStatisticEntry => [
							it.name = "modTime"
							it.value = Double.parseDouble(modTime)
						]

					]
				]

//				return newArrayList(line1, line2)
			} else {

				// Start: Solving .tptp problem
				val MonitoredVampireSolution vampSol = handler.callSolver(vampireProblem, workspace, vampireConfig)
				// Finish: Solving .tptp problem
				// Start: Vampire -> Logic mapping
				val backTransformationStart = System.currentTimeMillis
				// Backwards Mapper
				val logicResult = backwardMapper.transformOutput(problem,
					vampireConfig.solutionScope.numberOfRequiredSolution, vampSol, forwardTrace, transformationTime)

				val backTransformationTime = System.currentTimeMillis - backTransformationStart
				// Finish: Vampire -> Logic Mapping
//		print(vampSol.generatedModel.tfformulas.size)
				return logicResult // currently only a ModelResult
			}
		}
		return backwardMapper.transformOutput(problem, vampireConfig.solutionScope.numberOfRequiredSolution,
			new MonitoredVampireSolution(-1, null), forwardTrace, transformationTime)
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
		val sols = modelResult.representation // as List<A4Solution>
		// val res = answers.map 
		sols.map [
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
