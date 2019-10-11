package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.vampire.queries.Patterns
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.CompositeElement
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Region
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class YakinduTest {
	def static void main(String[] args) {
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("MMdd-HHmmss");
		val formattedDate = format.format(date)

		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''output/YakinduTest/''' + formattedDate + '''/''', "")
		workspace.initAndClear

		// Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")

		val metamodel = GeneralTest.loadMetamodel(YakindummPackage.eINSTANCE)
		val partialModel = GeneralTest.loadPartialModel(inputs, "yakindu/Yakindu.xmi")
		val queries = GeneralTest.loadQueries(metamodel, Patterns.instance)
//		val metamodel = GeneralTest.loadMetamodel(FunctionalarchitecturePackage.eINSTANCE)
//		val partialModel = GeneralTest.loadPartialModel(inputs, "FAM/FaModel.xmi")
//		val queries = GeneralTest.loadQueries(metamodel, FamPatterns.instance)
//		val queries = null
		println("DSL loaded")

		var SZ_TOP = 10
		var SZ_BOT = 126
		var INC = 1
		var REPS = 1
		
		val RANGE = 3

		val EXACT = 10
		if (EXACT != -1) {
			SZ_TOP = EXACT
			SZ_BOT = EXACT
			INC = 1
			REPS = 1
		}

		var writer = new PrintWriter(workspace.workspaceURI + "//_yakinduStats.csv")
		writer.append("size,")
		for (var x = 0; x < REPS; x++) {
			writer.append("tTransf" + x + "," + "tSolv" + x + ",")
		}
		writer.append("medSolv,medTransf\n")
		var solverTimes = newArrayList
		var transformationTimes = newArrayList
		var modelFound = true
		var LogicResult solution = null
		for (var i = SZ_BOT; i <= SZ_TOP; i += INC) {
			val num = (i - SZ_BOT) / INC
			print("Generation " + num + ": SIZE=" + i + " Attempt: ")
			writer.append(i + ",")
			solverTimes.clear
			transformationTimes.clear
			modelFound = true
			for (var j = 0; j < REPS; j++) {

				print(j)

				val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
				var modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel)
				var validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem,
					new Viatra2LogicConfiguration)

				var problem = modelGenerationProblem.output
				workspace.writeModel(problem, "Yakindu.logicproblem")

//				 println("Problem created")
//				 Start Time
				var startTime = System.currentTimeMillis

				var VampireSolver reasoner
				// *
				reasoner = new VampireSolver

				// /////////////////////////////////////////////////////
				// Minimum Scope
			val classMapMin = new HashMap<Class, Integer>
			classMapMin.put(Region, 1)
			classMapMin.put(Transition, 2)
			classMapMin.put(CompositeElement, 3)
			val typeMapMin = GeneralTest.getTypeMap(classMapMin, metamodel, ecore2Logic, modelGenerationProblem.trace)
				// Maximum Scope
			val classMapMax = new HashMap<Class, Integer>
			classMapMax.put(Region, 5)
			classMapMax.put(Transition, 2)
			val typeMapMax = GeneralTest.getTypeMap(classMapMax, metamodel, ecore2Logic, modelGenerationProblem.trace)
				// Define Config File		
				val size = i
				val inc = INC
				val iter = j
				val vampireConfig = new VampireSolverConfiguration => [
					// add configuration things, in config file first
					it.documentationLevel = DocumentationLevel::FULL
					it.iteration = iter
					it.runtimeLimit = 60
					it.typeScopes.maxNewElements = -1
					it.typeScopes.minNewElements = size
					it.genModel = false
			if(typeMapMin.size != 0) it.typeScopes.minNewElementsByType = typeMapMin
			if(typeMapMin.size != 0) it.typeScopes.maxNewElementsByType = typeMapMax
					it.contCycleLevel = 5
					it.uniquenessDuplicates = false
				]

				solution = reasoner.solve(problem, vampireConfig, workspace)
//				print((solution as ModelResult).representation.get(0))
//				val soln = ((solution as ModelResult).representation.get(0) as VampireModel)
//				println(soln.confirmations)
//				println((solution as ModelResult).representation)
//				modelFound = !soln.confirmations.filter [
//					class == VLSFiniteModelImpl
//				].isEmpty
//
//				if (modelFound) {
				val tTime = solution.statistics.transformationTime / 1000.0
				val sTime = solution.statistics.solverTime / 1000.0
				writer.append(tTime + "," + sTime + ",")
				print("(" + tTime + "/" + sTime + "s)..")
				solverTimes.add(sTime)
				transformationTimes.add(tTime)
//				} else {
//					writer.append("MNF" + ",")
////					print("MNF")
//				}
			// println("Problem solved")
			// visualisation, see 
//				var interpretations = reasoner.getInterpretations(solution as ModelResult)
//			 for (interpretation : interpretations) {
//			 val model = logic2Ecore.transformInterpretation(interpretation, modelGenerationProblem.trace)
//			 workspace.writeModel(model, "model.xmi")
//			}
//			 var totalTimeMin = (System.currentTimeMillis - startTime) / 60000
//			 var totalTimeSec = ((System.currentTimeMillis - startTime) / 1000) % 60
//			 println("Problem solved")
//			 println("Time was: " + totalTimeMin + ":" + totalTimeSec)
			}
			println()
			var solverMed = solverTimes.sort.get(REPS / 2)
			var transformationMed = transformationTimes.sort.get(REPS / 2)
			writer.append(solverMed.toString + "," + transformationMed.toString)
			writer.append("\n")
		}
		writer.close

	}

}
