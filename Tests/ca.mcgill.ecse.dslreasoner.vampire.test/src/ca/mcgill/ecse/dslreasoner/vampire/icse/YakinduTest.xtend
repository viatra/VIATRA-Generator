package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.FamPatterns
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.PrintWriter
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class YakinduTest {
	def static void main(String[] args) {
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

		// Workspace setup
		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''output/YakinduTest/''', "")
		workspace.initAndClear

		// Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")

//		val metamodel = GeneralTest.loadMetamodel(YakindummPackage.eINSTANCE)
		val metamodel = GeneralTest.loadMetamodel(FunctionalarchitecturePackage.eINSTANCE)
//		val partialModel = GeneralTest.loadPartialModel(inputs, "yakindu/Yakindu.xmi")
		val partialModel = GeneralTest.loadPartialModel(inputs, "FAM/FaModel.xmi")
//		val queries = GeneralTest.loadQueries(metamodel, YakinduPatterns.instance)
		val queries = GeneralTest.loadQueries(metamodel, FamPatterns.instance)
//		val queries = null
		println("DSL loaded")

		var MAX = 150
		var START = 10
		var INC = 20
		var REPS = 1
		
		val EXACT = -1
		if (EXACT!= -1) {
			MAX = EXACT
			START = EXACT
			INC = 1
			REPS = 5
		}

		var writer = new PrintWriter(workspace.workspaceURI + "//yakinduStats.csv")
		writer.append("size,")
		for (var x = 0; x < REPS; x++) {
			writer.append("t" + x + ",")
		}
		writer.append("avg\n")
		var totalTime = 0.0
		var totFound = 0.0
		var modelFound = true
		var LogicResult solution = null
		for (var i = START; i <= MAX; i += INC) {
			val num = (i - START) / INC
			print("Generation " + num + ": SIZE=" + i + " Attempt: ")
			writer.append(i + ",")
			totalTime = 0.0
			totFound = 0.0
			modelFound = true
			for (var j = 0; j < REPS; j++) {

				print(j)

				val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
				var problem = modelGenerationProblem.output
				problem = instanceModel2Logic.transform(modelGenerationProblem, partialModel).output
//		problem = viatra2Logic.transformQueries(queries, modelGenerationProblem, new Viatra2LogicConfiguration).output
				workspace.writeModel(problem, "Yakindu.logicproblem")

//				 println("Problem created")
//				 Start Time
				var startTime = System.currentTimeMillis

				var VampireSolver reasoner
				// *
				reasoner = new VampireSolver

				// /////////////////////////////////////////////////////
				// Minimum Scope
//			val classMapMin = new HashMap<Class, Integer>
//			classMapMin.put(Region, 1)
//			classMapMin.put(Transition, 2)
//			classMapMin.put(CompositeElement, 3)
//			val typeMapMin = GeneralTest.getTypeMap(classMapMin, metamodel, ecore2Logic, modelGenerationProblem.trace)
				// Maximum Scope
//			val classMapMax = new HashMap<Class, Integer>
//			classMapMax.put(Region, 5)
//			classMapMax.put(Transition, 2)
//			classMapMax.put(Synchronization, 4)
//			val typeMapMax = GeneralTest.getTypeMap(classMapMax, metamodel, ecore2Logic, modelGenerationProblem.trace)
				// Define Config File		
				val size = i
				val inc = INC
				val vampireConfig = new VampireSolverConfiguration => [
					// add configuration things, in config file first
					it.documentationLevel = DocumentationLevel::FULL

					it.typeScopes.minNewElements = size - inc
					it.typeScopes.maxNewElements = size
//			if(typeMapMin.size != 0) it.typeScopes.minNewElementsByType = typeMapMin
//			if(typeMapMin.size != 0) it.typeScopes.maxNewElementsByType = typeMapMax
					it.contCycleLevel = 5
					it.uniquenessDuplicates = false
				]

				solution = reasoner.solve(problem, vampireConfig, workspace)
//				print((solution as ModelResult).representation.get(0))
				val soln = ((solution as ModelResult).representation.get(0) as VampireModel)
//				println(soln.confirmations)
//				println((solution as ModelResult).representation)
//				modelFound = !soln.confirmations.filter [
//					class == VLSFiniteModelImpl
//				].isEmpty
//
//				if (modelFound) {
				val time = solution.statistics.transformationTime / 1000.0
				writer.append(time + ",")
				print("(" + time + ")..")
				totalTime += time
				totFound += 1
//				} else {
//					writer.append("MNF" + ",")
////					print("MNF")
//				}
			// println("Problem solved")
			// visualisation, see 
//				var interpretations = reasoner.getInterpretations(solution as ModelResult)
			/*	interpretations.get(0) as VampireModelInterpretation
			 * 	println(ecore2Logic.IsAttributeValue(modelGenerationProblem.trace, )
			 * 		Literal(modelGenerationProblem.trace, ecore2Logic.allLiteralsInScope(modelGenerationProblem.trace).get(0) )
			 * 	)
			 * 	println((ecore2Logic.allAttributesInScope(modelGenerationProblem.trace)).get(0).EAttributeType)
			 print(interpretations.class)*/
//			 for (interpretation : interpretations) {
//			 val model = logic2Ecore.transformInterpretation(interpretation, modelGenerationProblem.trace)
//			 workspace.writeModel(model, "model.xmi")
			/* 		val representation = im2pi.transform(modelGenerationProblem, model.eAllContents.toList, false)//solution.representation.get(0) // TODO: fix for multiple represenations
			 * 		if (representation instanceof PartialInterpretation) {
			 * 			val vis1 = new PartialInterpretation2Gml
			 * 			val gml = vis1.transform(representation)
			 * 			workspace.writeText("model.gml", gml)

			 * 			val vis2 = new GraphvizVisualiser
			 * 			val dot = vis2.visualiseConcretization(representation)
			 * 			dot.writeToFile(workspace, "model.png")
			 * 		} else {
			 * 			println("ERROR")
			 * 		}
			 look here: hu.bme.mit.inf.dslreasoner.application.execution.GenerationTaskExecutor*/
//			}
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
//			 var totalTimeMin = (System.currentTimeMillis - startTime) / 60000
//			 var totalTimeSec = ((System.currentTimeMillis - startTime) / 1000) % 60
//			 println("Problem solved")
//			 println("Time was: " + totalTimeMin + ":" + totalTimeSec)
			}
			println()
			var avg = 0.0
			if (totFound == 0) {
				avg = -1
			} else {
				avg = totalTime / totFound
			}
			writer.append(avg.toString)
			writer.append("\n")
		}
		writer.close

	}

}
