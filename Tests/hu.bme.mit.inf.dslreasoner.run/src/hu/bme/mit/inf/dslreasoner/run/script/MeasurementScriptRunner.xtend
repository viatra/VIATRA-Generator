package hu.bme.mit.inf.dslreasoner.run.script

import com.google.gson.Gson
import hu.bme.mit.inf.dslreasoner.ecore2logic.EClassMapper
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.run.EcoreLoader
import hu.bme.mit.inf.dslreasoner.run.FAMLoader
import hu.bme.mit.inf.dslreasoner.run.FileSystemLoader
import hu.bme.mit.inf.dslreasoner.run.MetamodelLoader
import hu.bme.mit.inf.dslreasoner.run.SatelliteLoader
import hu.bme.mit.inf.dslreasoner.run.YakinduLoader
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorConstraints
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.FileReader
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory
import org.eclipse.xtend.lib.annotations.Data

class MeasurementScriptRunner {
	static val MODEL_SIZE_GAP = 0
	static val SCOPE_PROPAGATOR_TIMEOUT = 10
	static val USEC_TO_MSEC = 1000000

	static extension val LogicresultFactory = LogicresultFactory.eINSTANCE

	val MeasurementScript script
	val ReasonerWorkspace inputWorkspace
	val ReasonerWorkspace outputWorkspace
	val MetamodelLoader metamodelLoader

	new(MeasurementScript script) {
		this.script = script
		inputWorkspace = new FileSystemWorkspace(script.inputPath + "/", "")
		outputWorkspace = new FileSystemWorkspace(script.outputPath +
			"/", '''«script.domain»_«script.solver»_«script.scope»_«script.scopePropagator ?: "na"»_«script.propagatedConstraints ?: "na"»_«script.polyhedronSolver ?: "na"»_«script.scopeHeuristic ?: "na"»_''')
		metamodelLoader = switch (script.domain) {
			case fs: new FileSystemLoader(inputWorkspace)
			case ecore: new EcoreLoader(inputWorkspace)
			case Yakindu: new YakinduLoader(inputWorkspace) => [useSynchronization = false; useComplexStates = true]
			case FAM: new FAMLoader(inputWorkspace)
			case satellite: new SatelliteLoader(inputWorkspace)
			default: throw new IllegalArgumentException("Unsupported domain: " + script.domain)
		}
	}

	def run() {
		if (script.sizes.empty) {
			return
		}
		val start = System.currentTimeMillis
		val warmupSize = script.sizes.head
		for (var int i = 0; i < script.warmupIterations; i++) {
			System.err.println('''Warmup «i + 1»/«script.warmupIterations»...''')
			runExperiment(warmupSize)
		}
		val warmupEnd = System.currentTimeMillis
		System.err.println('''Warmup completed in «(warmupEnd - start) / 1000» seconds''')
		for (size : script.sizes) {
			var int failures = 0
			for (var int i = 0; i < script.iterations; i++) {
				System.err.println("Running GC...")
				runGc()
				System.err.println('''Iteration «i + 1»/«script.iterations» of size «size»...''')
				val startTime = System.currentTimeMillis
				val result = runExperiment(size)
				val headerPrefix = '''«script.toCsvHeader»,«size»,«i + 1»,«result.resultName»'''
				println('''«headerPrefix»,startTime,«startTime»''')
				println('''«headerPrefix»,logic2SolverTransformationTime,«result.statistics.transformationTime»''')
				println('''«headerPrefix»,solverTime,«result.statistics.solverTime»''')
				for (statistic : result.statistics.entries) {
					val valueString = switch (statistic) {
						IntStatisticEntry: statistic.value.toString
						RealStatisticEntry: statistic.value.toString
						StringStatisticEntry: statistic.value.toString
						default: statistic.toString
					}
					println('''«headerPrefix»,«statistic.name»,«valueString»''')
				}
				if (script.saveModels && result.model !== null) {
					outputWorkspace.writeModel(result.model, '''«size»_«i + 1».xmi''')
				}
				if (result.resultName === "InsuficientResourcesResultImpl") {
					failures++
				}
				System.out.flush
			}
			if (failures == script.iterations) {
				System.err.println("All measurements failed")
				return
			}
		}
		val end = System.currentTimeMillis
		System.err.println('''Measurement completed in «(end - start) / 1000» seconds''')
	}

	private static def void runGc() {
		System.gc
		Thread.sleep(100)
		System.gc
		Thread.sleep(100)
		System.gc
		Thread.sleep(800)
	}

	private def runExperiment(int modelSize) {
		if (script.solver != Solver.ViatraSolver) {
			throw new IllegalArgumentException("Only VIATRA-Generator is supported")
		}
		val config = new ViatraReasonerConfiguration
		config.solutionScope.numberOfRequiredSolutions = 1
		config.scopePropagatorStrategy = switch (script.scopePropagator) {
			case none:
				ScopePropagatorStrategy.None
			case basic:
				switch (script.propagatedConstraints) {
					case none:
						ScopePropagatorStrategy.Basic
					case typeHierarchy:
						ScopePropagatorStrategy.BasicTypeHierarchy
					case relations,
					case hints:
						throw new IllegalArgumentException(
							"Basic scope propagator does not support relational and hint constraints")
					default:
						throw new IllegalArgumentException("Unknown scope constraints: " + script.propagatedConstraints)
				}
			case polyhedral: {
				val constraints = switch (script.propagatedConstraints) {
					case none:
						throw new IllegalArgumentException(
							"Polyhedral scope propagator needs at least type hierarchy constraints")
					case typeHierarchy:
						PolyhedralScopePropagatorConstraints.TypeHierarchy
					case relations,
					case hints:
						PolyhedralScopePropagatorConstraints.Relational
					default:
						throw new IllegalArgumentException("Unknown scope constraints: " + script.propagatedConstraints)
				}
				val polyhedronSolver = switch (script.polyhedronSolver) {
					case Z3Integer: PolyhedralScopePropagatorSolver.Z3Integer
					case Z3Real: PolyhedralScopePropagatorSolver.Z3Real
					case Cbc: PolyhedralScopePropagatorSolver.Cbc
					case Clp: PolyhedralScopePropagatorSolver.Clp
					default: throw new IllegalArgumentException("Unknown polyhedron solver: " + script.polyhedronSolver)
				}
				val updateHeuristic = script.scopeHeuristic != ScopeHeuristic.basic
				new ScopePropagatorStrategy.Polyhedral(constraints, polyhedronSolver, updateHeuristic,
					SCOPE_PROPAGATOR_TIMEOUT)
			}
			default:
				throw new IllegalArgumentException("Unknown scope propagator: " + script.scopePropagator)
		}
		config.runtimeLimit = script.timeout
		config.documentationLevel = if(script.saveTemporaryFiles) DocumentationLevel.NORMAL else DocumentationLevel.NONE
		config.debugConfiguration.partialInterpretatioVisualiser = null
		config.searchSpaceConstraints.additionalGlobalConstraints += metamodelLoader.additionalConstraints

		val modelLoadingStart = System.nanoTime
		val metamodelDescriptor = metamodelLoader.loadMetamodel
		val partialModelDescriptor = metamodelLoader.loadPartialModel
		val queryDescriptor = metamodelLoader.loadQueries(metamodelDescriptor)
		val modelLoadingTime = System.nanoTime - modelLoadingStart

		val domain2LogicTransformationStart = System.nanoTime
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		var modelGeneration = ecore2Logic.transformMetamodel(metamodelDescriptor, new Ecore2LogicConfiguration())
		var problem = modelGeneration.output
		problem = instanceModel2Logic.transform(
			modelGeneration,
			partialModelDescriptor
		).output
		problem = viatra2Logic.transformQueries(
			queryDescriptor,
			modelGeneration,
			new Viatra2LogicConfiguration
		).output
		initializeScope(config, modelSize, problem, ecore2Logic, modelGeneration.trace)
		if (script.propagatedConstraints == ScopeConstraints.hints) {
			config.hints = metamodelLoader.getHints(ecore2Logic, modelGeneration.trace)
		}
		val domain2LogicTransformationTime = System.nanoTime - domain2LogicTransformationStart

		if (config.documentationLevel != DocumentationLevel.NONE) {
			outputWorkspace.writeModel(problem, "initial.logicproblem")
		}

		val solver = new ViatraReasoner
		val result = solver.solve(problem, config, outputWorkspace)
		val statistics = result.statistics
		statistics.entries += createIntStatisticEntry => [
			name = "modelLoadingTime"
			value = (modelLoadingTime / USEC_TO_MSEC) as int
		]
		statistics.entries += createIntStatisticEntry => [
			name = "domain2LogicTransformationTime"
			value = (domain2LogicTransformationTime / USEC_TO_MSEC) as int
		]
		var EObject modelResult = null
		if (result instanceof ModelResult) {
			val intepretations = solver.getInterpretations(result)
			if (intepretations.size != 1) {
				throw new IllegalStateException("Expected 1 interpretation, got " + intepretations.size)
			}
			var resultTransformationStart = System.nanoTime
			val logic2Ecore = new Logic2Ecore(ecore2Logic)
			modelResult = logic2Ecore.transformInterpretation(intepretations.head, modelGeneration.trace)
			val resultTransformationTime = System.nanoTime - resultTransformationStart
			statistics.entries += createIntStatisticEntry => [
				name = "ecore2LogicTransformationTime"
				value = (resultTransformationTime / USEC_TO_MSEC) as int
			]
		}

		new ExperimentResult(result.class.simpleName, statistics, modelResult)
	}

	private def initializeScope(ViatraReasonerConfiguration config, int modelSize, LogicProblem problem,
		EClassMapper eClassMapper, Ecore2Logic_Trace trace) {
		val knownElements = initializeKnownElements(problem, config.typeScopes)
		if (modelSize < 0) {
			config.typeScopes.minNewElements = 0
			config.typeScopes.maxNewElements = TypeScopes.Unlimited
		} else {
			val numberOfKnownElements = knownElements.values.flatten.toSet.size
			val newElementCount = modelSize - numberOfKnownElements
			config.typeScopes.minNewElements = newElementCount
			config.typeScopes.maxNewElements = newElementCount + MODEL_SIZE_GAP
		}
		switch (script.scope) {
			case none:
				return
			case quantiles: {
				val quantiles = metamodelLoader.typeQuantiles
				for (eClassInScope : eClassMapper.allClassesInScope(trace)) {
					val quantile = quantiles.get(eClassInScope.name)
					if (quantile !== null) {
						val type = eClassMapper.TypeofEClass(trace, eClassInScope)
						val knownInstances = knownElements.get(type)
						val currentCount = if(knownInstances === null) 0 else knownInstances.size
						val lowCount = Math.floor(modelSize * quantile.low) as int
						val highCount = Math.ceil((modelSize + MODEL_SIZE_GAP) * quantile.high) as int
						config.typeScopes.minNewElementsByType.put(type, lowCount - currentCount)
						config.typeScopes.maxNewElementsByType.put(type, highCount - currentCount)
					}
				}
			}
			default:
				throw new IllegalArgumentException("Unknown scope: " + script.scope)
		}
	}

	/*
	 * Copied from hu.bme.mit.inf.dslreasoner.application.execution.ScopeLoader.initialiseknownElements(LogicProblem, TypeScopes)
	 */
	private static def initializeKnownElements(LogicProblem p, TypeScopes s) {
		val Map<Type, Set<DefinedElement>> res = new HashMap

		// 1. fill map with every types
		for (t : p.types) {
			res.put(t, new HashSet)
		}

		// 2. fill map with every objects
		for (definedType : p.types.filter(TypeDefinition)) {
			val supertypes = CollectionsUtil.<Type>transitiveClosureStar(definedType)[supertypes]
			for (supertype : supertypes) {
				for (element : definedType.elements) {
					res.get(supertype).add(element)
				}
			}
		}
		val partialModelContents = p.annotations.filter(PartialModelRelation2Assertion).map[target].toList.map [
			eAllContents.toIterable
		].flatten.toList
		s.knownIntegers += partialModelContents.filter(IntLiteral).map[it.value]
		s.knownReals += partialModelContents.filter(RealLiteral).map[it.value]
		s.knownStrings += partialModelContents.filter(StringLiteral).map[it.value]

		res
	}

	public static def void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Missing measurement script name.")
			System.exit(-1)
		}
		EMFPatternLanguageStandaloneSetup.doSetup
		ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE,
			ReteBackendFactory.INSTANCE)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl)
		val config = readConfig(args.get(0))
		val runnner = new MeasurementScriptRunner(config)
		runnner.run()
	}

	static def readConfig(String scriptPath) {
		val gson = new Gson
		val reader = new FileReader(scriptPath)
		try {
			gson.fromJson(reader, MeasurementScript)
		} finally {
			reader.close
		}
	}

	@Data
	private static class ExperimentResult {
		String resultName
		Statistics statistics
		EObject model
	}
}
