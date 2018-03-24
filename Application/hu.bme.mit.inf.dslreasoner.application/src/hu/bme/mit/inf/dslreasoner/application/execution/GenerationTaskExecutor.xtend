package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.application.validation.MetamodelValidator
import hu.bme.mit.inf.dslreasoner.application.validation.QueryAndMetamodelValidator
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolutionScope
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UnknownResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualisation
import hu.bme.mit.inf.dslreasoner.workspace.ProjectWorkspace
import java.util.Optional
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import java.util.LinkedHashMap
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.logic.model.statistics.StatisticSections2CSV

class GenerationTaskExecutor {
	val metamodelLoader = new MetamodelLoader
	val modelLoader = new ModelLoader
	val queryLoader = new QueryLoader
	val solverLoader = new SolverLoader
	val scopeLoader = new ScopeLoader
	val statisticsUtil = new StatisticSections2CSV
	
	val metamodelValidator = new MetamodelValidator
	val queryAndMetamodelValidator = new QueryAndMetamodelValidator
	
	def executeGenerationTask(
		GenerationTask task,
		ScriptExecutor scriptExecutor,
		IProgressMonitor monitor)
	{
		monitor.subTask('''Collecting all resources''')
		// 1. Load all resources
		val metamodelSpecification = scriptExecutor.getMetamodelSpecification(task.metamodel)
		val patternSpecification = scriptExecutor.getPatternSpecification(task.patterns)
		val partialmodelSpecification = scriptExecutor.getPartialModelSpecification(task.partialModel)
		val scopeSpecification = scriptExecutor.getScopeSpecification(task.scope)
		
		val messageFile = scriptExecutor.getFileSpecification(task.targetLogFile)
		val debugFolder = scriptExecutor.getFileSpecification(task.debugFolder)
		val outputFolder = scriptExecutor.getFileSpecification(task.getTagetFolder)
		val statisticsFile = scriptExecutor.getFileSpecification(task.targetStatisticsFile)
		
		val configSpecification = scriptExecutor.getConfiguration(task.config)
		val configurationMap = scriptExecutor.transformToMap(configSpecification)
		val documentationLevel = scriptExecutor.getDocumentation(configSpecification)
		val runtieLimit = scriptExecutor.getRuntimeLimit(configSpecification)
		val memoryLimit = scriptExecutor.getMemoryLimit(configSpecification)
		
		// 2. create console
		val console = new ScriptConsole(false,true,false,
			if(messageFile!==null) URI.createURI(messageFile.path) else null,
			if(debugFolder!==null) URI.createURI('''«debugFolder.path»/errors.txt''') else null,
			if(statisticsFile!==null) URI.createURI(statisticsFile.path) else null
		)
		
		try {
			val reasonerWorkspace = if(debugFolder!== null) {
				new ProjectWorkspace(debugFolder.path,"")
			} else {
				new NullWorkspace
			}
			reasonerWorkspace.init
			val outputWorkspace = if(outputFolder !== null) {
				new ProjectWorkspace(outputFolder.path,"")
			} else {
				new NullWorkspace
			}
			outputWorkspace.init
			
			// 3. interpret all specification to a description
			val metamodelDescriptor = if(metamodelSpecification !== null) {
				metamodelLoader.loadMetamodel(metamodelSpecification)
			} else {
				console.writeError('''Error during the loading of the metamodel: No metamodel specified!''')
				throw new IllegalArgumentException('''No metamodel is specified!''')
			}
			val queryDescriptor = if(patternSpecification !== null) {
				 this.queryLoader.loadQueries(patternSpecification)
			} else {
				null
			}
			val partialModelDescriptor = if(partialmodelSpecification !== null) {
				this.modelLoader.loadModel(partialmodelSpecification,scriptExecutor)
			} else {
				null
			}
			monitor.worked(50)
			
			// 4. translate all description to a logic problem
			monitor.subTask('''Translating all resources to logic''')
			var domain2LogicTransformationTime = System.nanoTime
			val Ecore2Logic ecore2Logic = new Ecore2Logic
			val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
			val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
			val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
			
			var modelGeneration = ecore2Logic.transformMetamodel(metamodelDescriptor,new Ecore2LogicConfiguration())
			var problem = modelGeneration.output
			if(partialModelDescriptor !== null) {
				problem = instanceModel2Logic.transform(
					modelGeneration,
					partialModelDescriptor
				).output
			}
			if(queryDescriptor !== null){
				problem = viatra2Logic.transformQueries(
					queryDescriptor.key,
					modelGeneration,
					new Viatra2LogicConfiguration
				).output
			}
			domain2LogicTransformationTime = System.nanoTime-domain2LogicTransformationTime
			if(documentationLevel.atLeastNormal) {
				reasonerWorkspace.writeModel(problem,"generation.logicproblem")
			}
			
			// 5. create a solver and a configuration
			// 5.1 initialize
			val solver = solverLoader.loadSolver(task.solver,configurationMap)
			val solverConfig = solverLoader.loadSolverConfig(task.solver,configurationMap,console)
			
			
			// 5.2 set values that defined directly 
			solverConfig.solutionScope = new SolutionScope => [
				it.numberOfRequiredSolution = if(task.numberSpecified) {
					task.number
				} else {
					1
				}
			]
			solverConfig.typeScopes = scopeLoader.loadScope(
				scopeSpecification,
				problem,
				ecore2Logic,
				modelGeneration.trace
			)
			
			// 5.3 set resource limits
			documentationLevel.ifPresent[solverConfig.documentationLevel = it]
			runtieLimit.ifPresent[solverConfig.runtimeLimit = it]
			memoryLimit.ifPresent[solverConfig.memoryLimit = it]
			
			// 6. execute the solver on the problem with the configuration
			// 6.1 calculating the runs
			val runs = if(task.runSpecified) { task.runs } else { 1	}
			monitor.worked(50)
			
			console.writeMessage("Model generation started")
			for(run : 1..runs) {
				monitor.subTask('''Solving problem«IF runs>0» «run»/«runs»«ENDIF»''')
				
				// 6.2 For each run, the configuration and the workspace is adjusted
				solverLoader.setRunIndex(solverConfig,configurationMap,run,console)
				solverConfig.progressMonitor = new EclipseProgressMonitor(monitor)
				val reasonerWorkspaceForRun = if(runs > 1) {
					reasonerWorkspace.subWorkspace('''run«run»''',"") => [initAndClear]
				} else {
					reasonerWorkspace
				}
				
				// 7. Solver call
				val solution = solver.solve(problem,solverConfig,reasonerWorkspaceForRun)
				console.writeMessage(solution.soutionDescription.toString)
				
				//  8. Solution processing
				
				// 8.1 Visualisation
				var solutionVisualisationTime = System.nanoTime
				if(solution instanceof ModelResult) {
					val interpretations = solver.getInterpretations(solution)
					val outputWorkspaceForRun = if(runs > 1) {
						outputWorkspace.subWorkspace('''run«run»''',"") => [initAndClear]
					} else {
						outputWorkspace
					}
					
					for(interpretationIndex : 0..<interpretations.size) {
						monitor.subTask('''Solving problem«IF runs>0» «run»/«runs»«ENDIF»: Visualising solution «interpretationIndex+1»/«interpretations.size»''')
						val interpretation = interpretations.get(interpretationIndex)
						val model = logic2Ecore.transformInterpretation(interpretation,modelGeneration.trace)
						outputWorkspaceForRun.writeModel(model,'''model«IF runs>1»_«run»«ENDIF»_«interpretationIndex+1».xmi''')
						
						val representation = solution.representation.get(interpretationIndex)
						if(representation instanceof PartialInterpretation) {
							val vis1 = new PartialInterpretation2Gml
							val gml = vis1.transform(representation)
							outputWorkspaceForRun.writeText('''model«IF runs>1»_«run»«ENDIF»_«interpretationIndex+1».gml''',gml)
							if(false && representation.newElements.size + representation.problem.elements.size < 150) {
								val vis2 = new GraphvizVisualisation
								val dot = vis2.visualiseConcretization(representation)
								dot.writeToFile(outputWorkspaceForRun,'''model«IF runs>1»_«run»«ENDIF»_«interpretationIndex+1»''')
							}
						}
						monitor.worked(100)
					}
				} else {
					monitor.worked(solverConfig.solutionScope.numberOfRequiredSolution*100)
				}
				solutionVisualisationTime = System.nanoTime - solutionVisualisationTime
				
				// 8.2 Statistics
				val statistics = new LinkedHashMap
				statistics.put("Task",(task.eContainer as ConfigurationScript).commands.indexOf(task)+1)
				statistics.put("Run",run)
				statistics.put("Result",solution.class.simpleName)
				statistics.put("Domain to logic transformation time",domain2LogicTransformationTime/1000000)
				statistics.put("Logic to solver transformation time",solution.statistics.transformationTime)
				statistics.put("Solver time",solution.statistics.solverTime)
				statistics.put("Postprocessing time",solutionVisualisationTime)
				for(entry: solution.statistics.entries) {
					statistics.put(entry.name,statisticsUtil.readValue(entry))
				}
				console.addStatistics(statistics)
			}
			console.flushStatistics
			console.writeMessage("Model generation finished")
		} catch(Exception e) {
			console.writeError('''
			Error occured («e.class.simpleName»): «e.message»
			«FOR s : e.stackTrace SEPARATOR "\n"»    «s»«ENDFOR»''')
		}
	}
	
	private def dispatch soutionDescription(InconsistencyResult s) {
		if(s.representation.size == 0) {
			'''Problem is inconsistent, no model is created!'''
		} else {
			'''Problem is inconsistent, only «s.representation.size» model«IF s.representation.size>1»s«ENDIF» can be created!'''
		}
	}
	
	private def dispatch soutionDescription(ModelResult s) {
		if(s.representation.size == 1) {
			'''Problem is consistent, a model is generated'''
		} else {
			'''Problem is consistent, «s.representation.size» models are generated!'''
		}
	}
	
	private def dispatch soutionDescription(UnknownResult s) {
		if(s.representation.size == 1) {
			'''Unable to solve problem!'''
		} else {
			'''Unable to solve problem, but «s.representation.size» model generated!'''
		}
	}
	
	private def atLeastNormal(Optional<DocumentationLevel> level) {
		if(level.isPresent) {
			return (level.get !== DocumentationLevel.NONE)
		} else {
			return false
		}
	}
}