package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir
import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.File
import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class FileSystemTest {
	def static void main(String[] args) {
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

		// Workspace setup
		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''output/FileSystemTest/''', "")
		workspace.initAndClear

		// Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")


		val metamodel = GeneralTest.loadMetamodel(filesystemPackage.eINSTANCE)
		val partialModel = GeneralTest.loadPartialModel(inputs, "fs/filesystemInstance.xmi")
//		val queries = GeneralTest.loadQueries(metamodel, FileSystemPatterns.instance)

		println("DSL loaded")

		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
		var problem = modelGenerationProblem.output
		problem = instanceModel2Logic.transform(modelGenerationProblem, partialModel).output
//		problem = viatra2Logic.transformQueries(queries, modelGenerationProblem, new Viatra2LogicConfiguration).output
		workspace.writeModel(problem, "FileSystem.logicproblem")

		println("Problem created")

		// Start Time
		var startTime = System.currentTimeMillis

		var VampireSolver reasoner
		// *
		reasoner = new VampireSolver

		// /////////////////////////////////////////////////////
		// Minimum Scope
		val classMapMin = new HashMap<Class, Integer>
//		Currently does not work
//		classMapMin.put(FSObject, 20)
		classMapMin.put(Dir, 10)
		classMapMin.put(File, 5)
		val typeMapMin = GeneralTest.getTypeMap(classMapMin, metamodel, ecore2Logic, modelGenerationProblem.trace)

		// Maximum Scope
		val classMapMax = new HashMap<Class, Integer>
		classMapMax.put(File, 15)
		classMapMax.put(Dir, 15)
//		Currently does not work
//		classMapMax.put(FSObject, 20)
		val typeMapMax = GeneralTest.getTypeMap(classMapMax, metamodel, ecore2Logic, modelGenerationProblem.trace)

		// Define Config File		
		val vampireConfig = new VampireSolverConfiguration => [
			// add configuration things, in config file first
			it.documentationLevel = DocumentationLevel::FULL

			it.typeScopes.minNewElements = 10
			it.typeScopes.maxNewElements = 25
			if(typeMapMin.size != 0) it.typeScopes.minNewElementsByType = typeMapMin
			if(typeMapMin.size != 0) it.typeScopes.maxNewElementsByType = typeMapMax
			it.contCycleLevel = 5
			it.uniquenessDuplicates = false
		]

		var LogicResult solution = reasoner.solve(problem, vampireConfig, workspace)

		/*/
		 * 
		 * reasoner = new AlloySolver
		 * val alloyConfig = new AlloySolverConfiguration => [
		 * 	it.typeScopes.maxNewElements = 7
		 * 	it.typeScopes.minNewElements = 3
		 * 	it.solutionScope.numberOfRequiredSolution = 1
		 * 	it.typeScopes.maxNewIntegers = 0
		 * 	it.documentationLevel = DocumentationLevel::NORMAL
		 * ]
		 * solution = reasoner.solve(problem, alloyConfig, workspace)
		 //*/
		// /////////////////////////////////////////////////////
		var totalTimeMin = (System.currentTimeMillis - startTime) / 60000
		var totalTimeSec = ((System.currentTimeMillis - startTime) / 1000) % 60

		println("Problem solved")
		println("Time was: " + totalTimeMin + ":" + totalTimeSec)
	}

}
