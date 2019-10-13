package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.vampire.queries.Patterns
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.BackendSolver
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
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry
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

		var SZ_TOP = 150
		var SZ_BOT = 150
		var INC = 10
		var REPS = 10

		val RUNTIME = 300

		val EXACT = -1
		if (EXACT != -1) {
			SZ_TOP = EXACT
			SZ_BOT = EXACT
			INC = 1
			REPS = 10
		}
		val BACKENDSOLVERS = newArrayList(
//			BackendSolver::CVC4
//			, 
//			BackendSolver::DARWINFM
//			, 
//			BackendSolver::EDARWIN
//			,			
//			BackendSolver::GEOIII
//			, 
//			BackendSolver::IPROVER
//			, 
//			BackendSolver::PARADOX
//			, 
//			BackendSolver::VAMPIRE
//			,
			BackendSolver::Z3
			)
		

		var str = ""

		for (solver : BACKENDSOLVERS) {
			str += solver.name.substring(0, 1)
		}

		var writer = new PrintWriter(
			dataWorkspace.workspaceURI + "//_stats" + formattedDate + "-" + str + SZ_BOT + "to" + SZ_TOP + "by" + INC +
				"x" + REPS + ".csv")
		writer.append("solver,size,transTime,sat?,satTime,model?,modelTime\n")
		var solverTimes = newArrayList
		var transformationTimes = newArrayList
		var LogicResult solution = null

		for (BESOLVER : BACKENDSOLVERS) {

			for (var i = SZ_BOT; i <= SZ_TOP; i += INC) {
				val num = (i - SZ_BOT) / INC
				println()
				println("SOLVER: " + BESOLVER.name + ", SIZE=" + i)
				println()

				solverTimes.clear
				transformationTimes.clear
				for (var j = 0; j < REPS; j++) {

					print("<<Run number " + j + ">> :")

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

					var VampireSolver reasoner
					// *
					reasoner = new VampireSolver

					// /////////////////////////////////////////////////////
					// Minimum Scope
					val classMapMin = new HashMap<Class, Integer>
					classMapMin.put(Region, 1)
					classMapMin.put(Transition, 2)
					classMapMin.put(CompositeElement, 3)
					val typeMapMin = GeneralTest.getTypeMap(classMapMin, metamodel, ecore2Logic,
						modelGenerationProblem.trace)
					// Maximum Scope
					val classMapMax = new HashMap<Class, Integer>
					classMapMax.put(Region, 5)
					classMapMax.put(Transition, 2)
					val typeMapMax = GeneralTest.getTypeMap(classMapMax, metamodel, ecore2Logic,
						modelGenerationProblem.trace)
					// Define Config File		
					val size = i
					val inc = INC
					val iter = j
					val vampireConfig = new VampireSolverConfiguration => [
						// add configuration things, in config file first
						it.documentationLevel = DocumentationLevel::FULL
						it.iteration = iter
						it.runtimeLimit = RUNTIME
//					it.typeScopes.maxNewElements = size
						it.typeScopes.minNewElements = size

						it.genModel = true
						it.server = true
						it.solver = BESOLVER

//					if(typeMapMin.size != 0) it.typeScopes.minNewElementsByType = typeMapMin
//					if(typeMapMin.size != 0) it.typeScopes.maxNewElementsByType = typeMapMax
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
//	ADD TO CSV
					writer.append(vampireConfig.solver.name + ",")
					writer.append(size + ",")
					writer.append(solution.statistics.transformationTime / 1000.0 + ",")

					val satOut = (solution.statistics.entries.filter[name == "satOut"].get(0) as StringStatisticEntry).
						value
					val satTime = (solution.statistics.entries.filter[name == "satTime"].get(0) as RealStatisticEntry).
						value
					val modOut = (solution.statistics.entries.filter[name == "modOut"].get(0) as StringStatisticEntry).
						value
					val modTime = (solution.statistics.entries.filter[name == "modTime"].get(0) as RealStatisticEntry).
						value

					writer.append(satOut + ",")
					writer.append(satTime + ",")
					writer.append(modOut + ",")
					writer.append(modTime + "")
					writer.append("\n")

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
			}

		}
		writer.close
	}

}
