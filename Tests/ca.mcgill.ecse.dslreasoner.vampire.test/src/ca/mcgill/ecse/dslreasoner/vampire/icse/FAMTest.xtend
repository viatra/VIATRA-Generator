package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.BackendSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import functionalarchitecture.FAMTerminator
import functionalarchitecture.Function
import functionalarchitecture.FunctionalArchitectureModel
import functionalarchitecture.FunctionalInterface
import functionalarchitecture.FunctionalOutput
import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class FAMTest {
	def static void main(String[] args) {
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		val InstanceModel2PartialInterpretation im2pi = new InstanceModel2PartialInterpretation

		// Workspace setup
		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''output/FAMTest/''', "")
		workspace.initAndClear

		// Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")

		// Load DSL
		val metamodel = GeneralTest.loadMetamodel(FunctionalarchitecturePackage.eINSTANCE)
//		val partialModel = GeneralTest.loadPartialModel(inputs, "FAM/FaModel.xmi")
//		val queries = GeneralTest.loadQueries(metamodel, FamPatterns.instance)
		val queries = null

		println("DSL loaded")

		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
		var problem = modelGenerationProblem.output
//		problem = instanceModel2Logic.transform(modelGenerationProblem, partialModel).output
//		problem = viatra2Logic.transformQueries(queries, modelGenerationProblem, new Viatra2LogicConfiguration).output
		workspace.writeModel(problem, "Fam.logicproblem")

		println("Problem created")

		// Start Time
		var startTime = System.currentTimeMillis

		var VampireSolver reasoner
		// *
		reasoner = new VampireSolver

		// /////////////////////////////////////////////////////
		// Minimum Scope
		val classMapMin = new HashMap<Class, Integer>
//		classMapMin.put(FunctionalArchitectureModel, 1)
//		classMapMin.put(Function, 1)
//		classMapMin.put(FunctionalInterface, 2)
//		classMapMin.put(FunctionalOutput, 3)
		classMapMin.put(FAMTerminator, 1)

		val typeMapMin = GeneralTest.getTypeMap(classMapMin, metamodel, ecore2Logic, modelGenerationProblem.trace)

		// Maximum Scope
		val classMapMax = new HashMap<Class, Integer>
		classMapMax.put(FunctionalArchitectureModel, 3)
		classMapMax.put(Function, 5)
		classMapMax.put(FunctionalInterface, 3)
		classMapMax.put(FunctionalOutput, 4)

		val typeMapMax = GeneralTest.getTypeMap(classMapMax, metamodel, ecore2Logic, modelGenerationProblem.trace)
		
		// Define Config File		
		val vampireConfig = new VampireSolverConfiguration => [
			// add configuration things, in config file first
			it.documentationLevel = DocumentationLevel::FULL

			it.typeScopes.minNewElements = 8//24
			it.typeScopes.maxNewElements = 10//25
//			if(typeMapMin.size != 0) it.typeScopes.minNewElementsByType = typeMapMin
//			if(typeMapMax.size != 0) it.typeScopes.maxNewElementsByType = typeMapMax
			it.solver = BackendSolver::LOCVAMP
			it.contCycleLevel = 5
			it.uniquenessDuplicates = false
		]

		var LogicResult solution = reasoner.solve(problem, vampireConfig, workspace)
		
		println("Problem solved")
		// visualisation, see 
		var interpretations = reasoner.getInterpretations(solution as ModelResult)
//		interpretations.get(0) as VampireModelInterpretation
//		println(ecore2Logic.IsAttributeValue(modelGenerationProblem.trace, )
//			Literal(modelGenerationProblem.trace, ecore2Logic.allLiteralsInScope(modelGenerationProblem.trace).get(0) )
//		)
//		println((ecore2Logic.allAttributesInScope(modelGenerationProblem.trace)).get(0).EAttributeType)
//		print(interpretations.class)
//		for (interpretation : interpretations) {
//			val model = logic2Ecore.transformInterpretation(interpretation, modelGenerationProblem.trace)
//			workspace.writeModel(model, "model.xmi")
//
////			val representation = im2pi.transform(modelGenerationProblem, model.eAllContents.toList, false)//solution.representation.get(0) // TODO: fix for multiple represenations
////			if (representation instanceof PartialInterpretation) {
////				val vis1 = new PartialInterpretation2Gml
////				val gml = vis1.transform(representation)
////				workspace.writeText("model.gml", gml)
////
////				val vis2 = new GraphvizVisualiser
////				val dot = vis2.visualiseConcretization(representation)
////				dot.writeToFile(workspace, "model.png")
////			} else {
////				println("ERROR")
////			}
//// look here: hu.bme.mit.inf.dslreasoner.application.execution.GenerationTaskExecutor
//		}

// transform interpretation to ecore, and it is easy from there
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

		println("Time was: " + totalTimeMin + ":" + totalTimeSec)
	}

}
