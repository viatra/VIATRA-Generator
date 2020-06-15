package run

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntervallNumber
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ModelEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectTypeScope
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RuntimeEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeSpecification
import hu.bme.mit.inf.dslreasoner.application.execution.ScriptExecutor
import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.text.SimpleDateFormat
import java.util.Date
import org.apache.commons.cli.BasicParser
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options
import org.apache.commons.cli.ParseException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class RunVampireConfig {
	static var SIZE_LB = 10
	static var SIZE_UB = -1

	static var RUNS = 3
	static var MODELS = 3
	static var RUNTIME = 300

	static var DOMAIN = "Yakindu-Vampire" // "FamilyTree", "Satellite", "Taxation"
	static val QUERIES = false
	static val INITIAL = true

	def static void main(String[] args) {
//		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
//		val workspace = new FileSystemWorkspace('''x/''', "")
//		workspace.initAndClear

		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm")
		val formattedDate = format.format(date)

		val executor = new ScriptExecutor
		val path = "config//genericVampire.vsconfig"
		var ConfigurationScript config = StandaloneScriptExecutor.loadScript(path)

		// /////////////////////////
		// BEGIN RUN
		println(
			"<<DOMAIN: " + DOMAIN + ", SIZE=" + SIZE_LB + "to" + SIZE_UB + ", Runs=" + RUNS + ", ModelsPerRun=" +
				MODELS + ", Runtime=" + RUNTIME + ">>")

		var naming = "size" + toStr(SIZE_LB) + "to" + toStr(SIZE_UB) + "r" + RUNS + "n" + MODELS + "rt" + RUNTIME
		val outputPath = "output-Vampire/" + naming + "_" + formattedDate + "/models"
		val debugPath = "output-Vampire/" + naming + "_" + formattedDate + "/debug"
		val logPath = debugPath + "/log.txt"
		val statsPath = "output-Vampire/" + naming + "_" + formattedDate + "/stats.csv"

		// Basic Adjustments
		val genTask = config.commands.get(0) as GenerationTask
		if(!QUERIES) genTask.patterns = null
		if(!INITIAL) genTask.partialModel = null
		genTask.runs = RUNS
		genTask.number = MODELS

		// Size
		val scopeSpec = genTask.scope as ScopeSpecification
		val objScope = scopeSpec.scopes.get(0) as ObjectTypeScope
		val interval = objScope.number as IntervallNumber
		interval.min = SIZE_LB
		if (SIZE_UB == -1)
			interval.maxUnlimited = true
		else {
			interval.maxUnlimited = false
			interval.maxNumber = SIZE_UB
		}

//		workspace.writeModel(config, '''x.xmi''')
		// Runtime
		val configScope = genTask.config as ConfigSpecification
		val runtimeEntry = configScope.entries.get(0) as RuntimeEntry
		runtimeEntry.millisecLimit = RUNTIME

		// Output locations
		val debug = genTask.debugFolder as FileSpecification
		debug.path = debugPath
		val output = genTask.tagetFolder as FileSpecification
		output.path = outputPath
		val log = genTask.targetLogFile as FileSpecification
		log.path = logPath
		val stats = genTask.targetStatisticsFile as FileSpecification
		stats.path = statsPath

		// Run Generator
		println()
		executor.executeScript(config, new NullProgressMonitor)

		println()
	}

	static def String toStr(int i) {
		var toAdd = ""
		if(i < 100 && i != -1) toAdd = "0"
		return toAdd + i
	}

}
