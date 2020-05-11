package run

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntervallNumber
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectTypeScope
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RuntimeEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeSpecification
import hu.bme.mit.inf.dslreasoner.application.execution.ScriptExecutor
import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.PrintWriter
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Date
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.IQueryGroup

class GenerateFromConfig {
	static val SIZE_LB = 20
	static val SIZE_UB = 20
	static val SIZE_MUL = 1
	static val SIZE_INC = 5

	static var REPS = 1
	static val RUNTIME = 2100

	static val DOMAIN = "Taxation" // "FamilyTree", "Taxation"
	static val QUERIES = true
	static val INITIAL = true
	static val INDIV_WRT = false
	static val GLOBAL_WRT = false
	static val q2t = if(QUERIES) "Y" else "N"

	def static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
		val formattedDate = DOMAIN + "-" + format.format(date)

		val workspace = new FileSystemWorkspace('''output/''' + formattedDate + '''/''', "")
		workspace.initAndClear

		println("Input and output workspaces are created")

		val executor = new ScriptExecutor
		val path = "config//generic" + DOMAIN + ".vsconfig"
		var ConfigurationScript config = StandaloneScriptExecutor.loadScript(path)

		println("Config File loaded")

		// /////////////////////////
		// BEGIN RUN
		var PrintWriter global_writer = null
		val header = "domain, queries?,size,model?,timeout,measuredTime,TransformatonTime,SolverTime\n"
		if (GLOBAL_WRT) {
			global_writer = new PrintWriter(
				workspace.workspaceURI + "//_" + DOMAIN + SIZE_LB + "to" + SIZE_UB + "x" + REPS + "q" + q2t + "-" +
					formattedDate + ".csv")
			global_writer.append(header)
		}

		var NEXT_INC = SIZE_INC
		for (var size = SIZE_LB; size <= SIZE_UB; size += NEXT_INC) {
			NEXT_INC *= SIZE_MUL

			var PrintWriter indiv_writer = null
			if (INDIV_WRT) {
				indiv_writer = new PrintWriter( // TODO
				workspace.workspaceURI + "//__" + DOMAIN + "Sz" + size + "x" + REPS + "q" + q2t + "-" + formattedDate +
					".csv")
				indiv_writer.append(header)
			}

			println()
			println("DOMAIN: " + DOMAIN + ", SIZE=" + size)

			for (var i = 0; i < REPS; i++) {

				print("<<Run number " + i + ">> : ")


				// /////////////////////////////////////////////////////
				// Define Config File	
				val knownIntegers = new ArrayList<Integer>
				knownIntegers.addAll(0, 10, 20, 30, 40, 50)

				val knownReals = new ArrayList<BigDecimal>
				knownReals.addAll(new BigDecimal("0.0"))

				val knownStrings = new ArrayList<String>
				knownStrings.addAll("r0", "r1", "r2", "r3", "r4", "r5", "r6")

				val outputPath = "output/" + formattedDate + "/size" + size + "/run" + i + "/models/"
				val debugPath = "output/" + formattedDate + "/size" + size + "/run" + i + "/debug/"
				val logPath = debugPath + "log.txt"
				val statsPath = debugPath + "statistics.csv"

				// Adjust configuration
				val genTask = config.commands.get(0) as GenerationTask
				if(!QUERIES) genTask.patterns = null
				if(!INITIAL) genTask.partialModel = null

				val scopeSpec = genTask.scope as ScopeSpecification
				val objScope = scopeSpec.scopes.get(0) as ObjectTypeScope
				val interval = objScope.number as IntervallNumber
				interval.min = size
				interval.maxUnlimited = true

				val configScope = genTask.config as ConfigSpecification
				val runtimeEntry = configScope.entries.get(0) as RuntimeEntry
				runtimeEntry.millisecLimit = RUNTIME

				// TODO add known ints, reals, string...
				val debug = genTask.debugFolder as FileSpecification
				debug.path = debugPath
				val output = genTask.tagetFolder as FileSpecification
				output.path = outputPath
				val log = genTask.targetLogFile as FileSpecification
				log.path = logPath
				val stats = genTask.targetStatisticsFile as FileSpecification
				stats.path = statsPath

//				workspace.writeModel(config, '''x.xmi''')
				val startTime = System.currentTimeMillis
				executor.executeScript(config, new NullProgressMonitor)
				val measuredTime = System.currentTimeMillis - startTime

				println("<<END ->" + measuredTime / 1000.0 + "s >>\n")

//				val toAddtoCSV = DOMAIN + "," + QUERIES + "," + size + "," +
//					(solution.class == ModelResultImpl).toString + "," + RUNTIME + "," + measuredTime / 1000.0 + "," +
//					solution.statistics.transformationTime / 1000.0 + "," + solution.statistics.solverTime / 1000.0 +
//					"\n"
//
//				if(GLOBAL_WRT) global_writer.append(toAddtoCSV)
//				if(INDIV_WRT) indiv_writer.append(toAddtoCSV)
//				solution.writeStats(totalTime, solverConfig)
				// Run Garbage Collector
				val Runtime r = Runtime.getRuntime();
				r.gc();
				r.gc();
				r.gc();
				Thread.sleep(3000)
			}
			if(INDIV_WRT) indiv_writer.close
		}
		if(GLOBAL_WRT) global_writer.close
	}

	def static writeStats(LogicResult solution, long time, ViatraReasonerConfiguration config) {
		val stats = solution.statistics
		println("  Statistics:")
//		for (e : stats.entries.filter[name.substring(0, 9) == "_Solution"]) {
//			println("    " + e.name + ": " + (e as IntStatisticEntry).value + " ms")
//		}
		println(
			"    #new nodes    : [" + config.typeScopes.minNewElements + ".." +
				(if(config.typeScopes.maxNewElements == 2147483647) "*" else config.typeScopes.maxNewElements) + "]")
		println("    \"solve\" time: " + time as double / 1000 + " s")

//		println("<<End Statistics>>")
	}
}
