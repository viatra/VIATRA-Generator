package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.vampire.queries.Patterns
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl

class YakinduTestAlloy {
	def static void main(String[] args) {
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
		val formattedDate = format.format(date)

		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val dataWorkspace = new FileSystemWorkspace('''output/YakinduTest/''', "")
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

		var SZ_TOP = 100
		var SZ_BOT = 100
		var INC = 20
		var REPS = 25

		val RUNTIME = 300

		var solverTimes = newArrayList
		var transformationTimes = newArrayList
		var LogicResult solution = null
		var solver = "Alloy"

		for (var k = 0; k < 1; k++) {

			for (var i = SZ_BOT; i <= SZ_TOP; i += INC) {
				var writer = new PrintWriter(
					dataWorkspace.workspaceURI + "//_alloy" + i + "x" + REPS + "-" + formattedDate + ".csv")
				writer.append("solver,size,TransformatonTime,sat?,kodkodTime,model?,modelTime\n")

				val num = (i - SZ_BOT) / INC
				println()
				println("SOLVER: " + solver + ", SIZE=" + i)
				println()

				solverTimes.clear
				transformationTimes.clear
				for (var j = 0; j < REPS; j++) {
					val Date date2 = new Date(System.currentTimeMillis)
					val formattedDate2 = format.format(date2)
					println(formattedDate2)
					println("<<Run number " + j + ">> :")

					val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel,
						new Ecore2LogicConfiguration())
					var modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel)
					var validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem,
						new Viatra2LogicConfiguration)

					var problem = modelGenerationProblem.output
//				workspace.writeModel(problem, "Yakindu.logicproblem")
//				 println("Problem created")
//				 Start Time
					var startTime = System.currentTimeMillis

					var AlloySolver reasoner
					// *
					reasoner = new AlloySolver

					// /////////////////////////////////////////////////////
					// Define Config File		
					val size = i
					val inc = INC
					val iter = j
					val solverConfig = new AlloySolverConfiguration => [
						// add configuration things, in config file first
						it.documentationLevel = DocumentationLevel::FULL
//						it.iteration = iter
						it.runtimeLimit = RUNTIME
//					it.typeScopes.maxNewElements = size
						it.typeScopes.minNewElements = size
						it.typeScopes.maxNewElements = size
					]
					solution = reasoner.solve(problem, solverConfig, workspace)
//				print((solution as ModelResult).representation.get(0))
//				val soln = ((solution as ModelResult).representation.get(0) as VampireModel)
//				println(soln.confirmations)
//				println((solution as ModelResult).representation)
//				modelFound = !soln.confirmations.filter [
//					class == VLSFiniteModelImpl
//				].isEmpty
//	ADD TO CSV
					writer.append(solver + ",")
					writer.append(size + ",")
					writer.append(solution.statistics.transformationTime / 1000.0 + ",")

//					val satOut = (solution.statistics.entries.filter[name == "satOut"].get(0) as StringStatisticEntry).
//						value
					val kodKodTime = (solution.statistics.entries.filter[name == "Alloy2KodKodTransformationTime"].
						get(0) as IntStatisticEntry).value
//						print(solution.class)
					val modOut = if(solution.class == ModelResultImpl) "FiniteModel" else "no"
					val mod = solution.statistics.entries.filter[name == "Answer0Time"]
					var modTime = 0.0
					if (!mod.isEmpty) {
						modTime = (mod.get(0) as IntStatisticEntry).value / 1000.0

					}
					writer.append("-,")
					writer.append(kodKodTime.toString + ",")
					writer.append(modOut + ",")
					writer.append(modTime.toString + "")
					writer.append("\n")

					println("->" + modOut + " ... " + modTime)

					// Run Garbage Collector
					val Runtime r = Runtime.getRuntime();
					r.gc();
					r.gc();
					r.gc();
					Thread.sleep(3000)

//				print("(" + tTime + "/" + sTime + "s)..")
//				solverTimes.add(sTime)
//				transformationTimes.add(tTime)
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
//			println()
//			var solverMed = solverTimes.sort.get(REPS / 2)
//			var transformationMed = transformationTimes.sort.get(REPS / 2)
//			writer.append(solverMed.toString + "," + transformationMed.toString)
				writer.close
			}

		}

	}

}
