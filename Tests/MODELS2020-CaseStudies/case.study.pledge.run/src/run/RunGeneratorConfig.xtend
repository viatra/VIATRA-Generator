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
import java.text.SimpleDateFormat
import java.util.Date
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options
import org.apache.commons.cli.ParseException
import org.eclipse.core.runtime.NullProgressMonitor
import org.apache.commons.cli.BasicParser

class RunGeneratorConfig {
	static var SIZE = 20

	static var RUNS = 10
	static var RUNTIME = 600

	static var DOMAIN = "FamilyTree" // "FamilyTree", "Taxation", "Satellite"
	static val QUERIES = true
	static val INITIAL = true

	def static void main(String[] args) {

		val options = new Options()

		val s = new Option("s", "size", true, "generated model Lower bound")
		options.addOption(s)

		val n = new Option("n", "numRuns", true, "number of runs")
		options.addOption(n)

		val rt = new Option("rt", "runtime", true, "runtime limit")
		options.addOption(rt)

		val d = new Option("d", "domain", true, "domain")
		options.addOption(d)
		
		val CommandLineParser parser = new BasicParser
		val formatter = new HelpFormatter()
		var CommandLine cmd

		try {
			cmd = parser.parse(options, args)
		} catch (ParseException e) {
			System.out.println(e.getMessage())
			formatter.printHelp("utility-name", options)
			System.exit(1)
		}
		
		val sIn = cmd.getOptionValue("size")
		if(sIn !== null) SIZE = Integer.parseInt(sIn)
		val nIn = cmd.getOptionValue("numRuns")
		if(nIn !== null) RUNS = Integer.parseInt(nIn)
		val rtIn = cmd.getOptionValue("runtime")
		if(rtIn !== null) RUNTIME = Integer.parseInt(rtIn)
		val dIn = cmd.getOptionValue("domain")
		if(dIn !== null) DOMAIN = dIn
		
		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm")
		val formattedDate = format.format(date)

		val executor = new ScriptExecutor
		val path = "config//generic" + DOMAIN + ".vsconfig"
		var ConfigurationScript config = StandaloneScriptExecutor.loadScript(path)

		// /////////////////////////
		// BEGIN RUN
		println("<<DOMAIN: " + DOMAIN + ", SIZE=" + SIZE + ",Runs=" + RUNS + ",Runtime=" + RUNTIME+">>\n")

		val outputPath = "measurements/" + "models/"+ DOMAIN + "/size" + SIZE + "_" + formattedDate
		val debugPath = "measurements/" + "debug/" + DOMAIN + "/size" + SIZE + "_" + formattedDate
		val logPath = debugPath + "/log.txt"
		val statsPath = "measurements/" + "stats/" + DOMAIN + "/size" + SIZE + "x" + RUNS + "stats_" + formattedDate + ".csv"

		// Basic Adjustments
		val genTask = config.commands.get(1) as GenerationTask
		if(!QUERIES) genTask.patterns = null
		if(!INITIAL) genTask.partialModel = null
		genTask.runs = RUNS

		// Size
		val scopeSpec = genTask.scope as ScopeSpecification
		val objScope = scopeSpec.scopes.get(0) as ObjectTypeScope
		val interval = objScope.number as IntervallNumber
		interval.min = SIZE
		interval.maxUnlimited = true

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
		executor.executeScript(config, new NullProgressMonitor)

		println()
	}

}
