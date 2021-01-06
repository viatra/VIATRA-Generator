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
import hu.bme.mit.inf.dslreasoner.application.execution.StandardOutputBasedScriptConsole
import java.io.File
import java.io.PrintWriter
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
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.impl.ConfigEntryImpl
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.CustomEntry

class RunGeneratorConfig {
	static var SIZE_LB = 20
	static var SIZE_UB = -1
	static var HOUSEHOLD = 0

	static var RUNS = 10
	static var MODELS = 10
	static var RUNTIME = 1500
	static var NUM_SOLVER = "z3"
	static var SCOPE_PROPAGATOR = "typeHierarchy"

	static var DOMAIN = "FamilyTree" // "FamilyTree", "Satellite", "Taxation"
	static val QUERIES = true
	static val INITIAL = true

	def static void main(String[] args) {
//		MyChangeFactory.install()
		
//		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
//		val workspace = new FileSystemWorkspace('''x/''', "")
//		workspace.initAndClear

		val options = new Options()

		val lb = new Option("lb", "lowerBound", true, "generated model Lower bound")
		options.addOption(lb)

		val ub = new Option("ub", "upperBound", true, "generated model Upper bound")
		options.addOption(ub)

		val nr = new Option("nr", "numRuns", true, "number of runs")
		options.addOption(nr)

		val nm = new Option("nm", "numModels", true, "number of models")
		options.addOption(nm)

		val rt = new Option("rt", "runtime", true, "runtime limit")
		options.addOption(rt)
		
		val ns = new Option("ns", "numericSolver", true, "what numeric solver to use")
		options.addOption(ns)
		
		val sp = new Option("sp", "scopePropagator", true, "scope Propagator")
		options.addOption(sp)

		val d = new Option("d", "domain", true, "domain")
		options.addOption(d)

		val hh = new Option("hh", "household", true, "number of households")
		options.addOption(hh)

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

		val lbIn = cmd.getOptionValue("lowerBound")
		if(lbIn !== null) SIZE_LB = Integer.parseInt(lbIn)
		val ubIn = cmd.getOptionValue("upperBound")
		if(ubIn !== null) SIZE_UB = Integer.parseInt(ubIn)
		val nrIn = cmd.getOptionValue("numRuns")
		if(nrIn !== null) RUNS = Integer.parseInt(nrIn)
		val nmIn = cmd.getOptionValue("numModels")
		if(nmIn !== null) MODELS = Integer.parseInt(nmIn)
		val rtIn = cmd.getOptionValue("runtime")
		if(rtIn !== null) RUNTIME = Integer.parseInt(rtIn)
		val nsIn = cmd.getOptionValue("numericSolver")
		if(nsIn !== null && nsIn.equals("dreal")) NUM_SOLVER = "dreal"
		val spIn = cmd.getOptionValue("scopePropagator")
		if(spIn !== null ) SCOPE_PROPAGATOR = spIn
		val dIn = cmd.getOptionValue("domain")
		if(dIn !== null) DOMAIN = dIn
		val hhIn = cmd.getOptionValue("household")
		if(hhIn !== null) HOUSEHOLD = Integer.parseInt(hhIn)

		val isTaxation = DOMAIN == "Taxation"
		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm")
		val formattedDate = format.format(date)

		val executor = new ScriptExecutor(StandardOutputBasedScriptConsole.FACTORY)
		val path = "config//generic" + DOMAIN + ".vsconfig"
		var ConfigurationScript config = StandaloneScriptExecutor.loadScript(path)

		// /////////////////////////
		// BEGIN RUN
		println(
			"<<DOMAIN: " + DOMAIN + 
			", NumSolver=" + NUM_SOLVER + 
			", scopeProp=" + SCOPE_PROPAGATOR +
			", SIZE=" + SIZE_LB + "to" + SIZE_UB + 
			", Runs=" + RUNS + 
			", ModelsPerRun=" + MODELS + 
			", Runtime=" + RUNTIME + ">>")
		if (isTaxation) println("<<Households: " + HOUSEHOLD + ">>")

		var naming = DOMAIN + "/size" + toStr(SIZE_LB) + "to" + toStr(SIZE_UB) +
					"r" + RUNS + 
					"n" + MODELS + 
					"rt" + RUNTIME +
					"ns" + NUM_SOLVER
		if (isTaxation) naming = naming + "hh" + HOUSEHOLD
		val outputPath = "measurements/" + "models/" + naming + "_" + formattedDate
		val debugPath = "measurements/" + "debug/" + naming + "_" + formattedDate
		val logPath = debugPath + "/log.txt"
		val statsPath = "measurements/" + "stats/" + naming + "stats_" + formattedDate + ".csv"

		// Basic Adjustments
		val genTask = config.commands.get(1) as GenerationTask
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

		if (isTaxation) {
			if (HOUSEHOLD > 0) {
				val pms = genTask.partialModel as PartialModelSpecification
				val me = pms.entry.get(0) as ModelEntry
				val fs = me.path as FileSpecification
				val modelPath = "inputs/Resource" + HOUSEHOLD + "hh.xmi"
				val modelFile = new File(modelPath)
				if (!modelFile.exists) {
					val writer = new PrintWriter(modelFile)
					try {
						writer.println('''
						<?xml version="1.0" encoding="UTF-8"?>
						<TaxCardWithRoot:Resource
						    xmi:version="2.0"
						    xmlns:xmi="http://www.omg.org/XMI"
						    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
						    xmlns:TaxCardWithRoot="http:///TaxCardWithRoot.ecore"
						    xsi:schemaLocation="http:///TaxCardWithRoot.ecore ../../case.study.pledge.model/model/TaxationWithRoot.ecore">
						    «FOR i : 0 ..< HOUSEHOLD»
						    	<contains/>
						    «ENDFOR»
						</TaxCardWithRoot:Resource>
						''')
					} finally {
						writer.close
					}
				}
				fs.path = modelPath
				println("<<Using " + fs.path + " as initial model>>")
			} else {
				scopeSpec.scopes.remove(1)
			}
		}
//		workspace.writeModel(config, '''x.xmi''')
		// Config
		val configScope = genTask.config as ConfigSpecification
		val runtimeEntry = configScope.entries.get(0) as RuntimeEntry
		runtimeEntry.millisecLimit = RUNTIME
		val numSolverEntry = configScope.entries.get(1) as CustomEntry
		numSolverEntry.value = NUM_SOLVER
		val scopePropEntry = configScope.entries.get(2) as CustomEntry
		scopePropEntry.value = SCOPE_PROPAGATOR

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
