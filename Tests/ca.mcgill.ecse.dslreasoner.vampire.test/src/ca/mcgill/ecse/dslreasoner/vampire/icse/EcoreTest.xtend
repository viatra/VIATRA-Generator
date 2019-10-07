package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace

class EcoreTest {
	def static void main(String[] args) {
		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''output/FEcoreTest/''', "")
		workspace.initAndClear

		println("Input and output workspaces are created")

		val metamodel = GeneralTest.loadMetamodel(filesystemPackage.eINSTANCE)
		val partialModel = GeneralTest.loadPartialModel(inputs, "fs/filesystemInstance.xmi")
//		val queries = GeneralTest.loadQueries(metamodel, ecorePatterns.instance)
		val queries = null

		println("DSL loaded")

		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
		val modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel)
//		val validModelExtensionProblem = viatra2Logic.transformQueries(queries,modelGenerationProblem,new Viatra2LogicConfiguration)
		val logicProblem = modelGenerationProblem.output
//		val logicProblem = modelExtensionProblem.output
//		val logicProblem = validModelExtensionProblem.output
		println("Problem created")

		var LogicResult solution
		var LogicReasoner reasoner
		// *
		reasoner = new VampireSolver
		val vampireConfig = new VampireSolverConfiguration => [
			// add configuration things, in config file first
			it.documentationLevel = DocumentationLevel::FULL
		]

		solution = reasoner.solve(logicProblem, vampireConfig, workspace)

		println("Problem solved")

	}

}
