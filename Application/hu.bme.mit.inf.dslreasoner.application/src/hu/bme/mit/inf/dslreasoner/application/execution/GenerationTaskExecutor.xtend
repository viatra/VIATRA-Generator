package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolutionScope
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UnknownResult
import hu.bme.mit.inf.dslreasoner.logic.model.statistics.StatisticSections2CSV
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.URIBasedWorkspace
import java.io.File
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.Optional
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI

class GenerationTaskExecutor {
	val metamodelLoader = new MetamodelLoader
	val modelLoader = new ModelLoader
	val queryLoader = new QueryLoader
	val solverLoader = new SolverLoader
	val scopeLoader = new ScopeLoader
	val statisticsUtil = new StatisticSections2CSV
	
	def executeGenerationTask(
		GenerationTask task,
		ScriptExecutor scriptExecutor,
		ScriptConsole.Factory scriptConsoleFactory,
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
		val console = scriptConsoleFactory.createScriptConsole(false,
			if(messageFile!==null) URI.createURI(messageFile.path) else null,
			if(debugFolder!==null) URI.createURI('''«debugFolder.path»/errors.txt''') else null,
			if(statisticsFile!==null) URI.createURI(statisticsFile.path) else null
		)
		
		try {
			val reasonerWorkspace = if(debugFolder!== null) {
				new URIBasedWorkspace(debugFolder.path,"")
			} else {
				new NullWorkspace
			}
			reasonerWorkspace.init
			val outputWorkspace = if(outputFolder !== null) {
				new URIBasedWorkspace(outputFolder.path,"")
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
			val objectiveSpecification = scriptExecutor.getObjectiveSpecification(task.objectives)
			val objectiveEntries = objectiveSpecification?.entries ?: emptyList
			val solverConfig = solverLoader.loadSolverConfig(task.solver,configurationMap,objectiveEntries,console)
			// 5.2 set values that defined directly 
			solverConfig.solutionScope = new SolutionScope => [
				it.numberOfRequiredSolutions = if(task.numberSpecified) {
					task.number
				} else {
					1
				}
			]
			
			val typeScopes = scopeLoader.loadScope(
				scopeSpecification,
				problem,
				ecore2Logic,
				modelGeneration.trace
			)
			// If the type scope contains errors, then the problem is inconsistent
			if(!typeScopes.value.empty) {
				monitor.worked(50)
				console.writeMessage("Model generation started")
				typeScopes.value.forEach[console.writeMessage(it)]
				
				val runs = if(task.runSpecified) { task.runs } else { 1	}
				for(run : 1..runs) {
					console.writeMessage('''Problem is inconsistent, no model is created!''')
					val statistics = new LinkedHashMap
					statistics.put("Task",(task.eContainer as ConfigurationScript).commands.indexOf(task)+1)
					statistics.put("Run",run)
					statistics.put("Result","InconsistencyResult")
					statistics.put("Domain to logic transformation time",domain2LogicTransformationTime/1000000)
					statistics.put("Logic to solver transformation time",0)
					statistics.put("Solver time",0)
					statistics.put("Postprocessing time",0)
					console.addStatistics(statistics)
				}
				
			} else {
				solverConfig.typeScopes = typeScopes.key
			
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
					if(run > 1) {
						ScriptExecutor::restForMeasurements(console)
					}
					monitor.subTask('''Solving problem«IF runs>0» «run»/«runs»«ENDIF»''')
					val visualisationProgressMonitor= new EclipseBasedProgressMonitor(monitor)
					
					// 6.2 For each run, the configuration and the workspace is adjusted
					solverLoader.setRunIndex(solverConfig,configurationMap,run,console)
					solverConfig.progressMonitor = new EclipseBasedProgressMonitor(monitor)
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
						
						val emfRepresentations = new LinkedList
						val gmlRepresentations = new LinkedList
						val dotRepresentations = new LinkedList
						
						for(interpretationIndex : 0..<interpretations.size) {
							monitor.subTask('''Solving problem«IF runs>0» «run»/«runs»«ENDIF»: Visualising solution «interpretationIndex+1»/«interpretations.size»''')
							val interpretation = interpretations.get(interpretationIndex)
							val model = logic2Ecore.transformInterpretation(interpretation,modelGeneration.trace)
							val emfFileName = '''«IF runs>1»«run»_«ENDIF»«interpretationIndex+1».xmi'''
							outputWorkspaceForRun.writeModel(model,emfFileName)
							emfRepresentations += outputWorkspaceForRun.getFile(emfFileName)
							
							val representation = solution.representation.get(interpretationIndex)
							if(documentationLevel.atLeastNormal) {
								if(representation instanceof PartialInterpretation) {
									val vis1 = new PartialInterpretation2Gml
									val gml = vis1.transform(representation)
									val glmFilename = '''«IF runs>1»«run»_«ENDIF»«interpretationIndex+1».gml'''
									outputWorkspaceForRun.writeText(glmFilename,gml)
									gmlRepresentations += outputWorkspaceForRun.getFile(glmFilename)
									if(representation.newElements.size + representation.problem.elements.size < 150) {
										val vis2 = new GraphvizVisualiser
										val dot = vis2.visualiseConcretization(representation)
										val dotFileName = '''«IF runs>1»«run»_«ENDIF»«interpretationIndex+1».png'''
										dot.writeToFile(outputWorkspaceForRun,dotFileName)
										dotRepresentations += outputWorkspaceForRun.getFile(dotFileName)
									}
									else {
										dotRepresentations.add(null)
									}
								} else {
									gmlRepresentations.add(null)
									dotRepresentations.add(null)
								}
							}
							visualisationProgressMonitor.worked(1.0/interpretations.size)
						}
						if(!emfRepresentations.empty) {
							console.writeMessage(
								'''Models:         «FOR f : emfRepresentations.filterNull»#«ENDFOR»''',
								"#",
								emfRepresentations.filterNull.map[
									new ScriptConsoleDecorator('''«it.fileRepresentationInConsole»''',it)
								]
							)
						}
						if(!gmlRepresentations.empty) {
							console.writeMessage(
								'''Visualisations: «FOR f : gmlRepresentations.filterNull»#«ENDFOR»''',
								"#",
								gmlRepresentations.filterNull.map[
									new ScriptConsoleDecorator('''«it.fileRepresentationInConsole»''',it)
								]
							)
						}
						if(!dotRepresentations.empty) {
							console.writeMessage(
								'''Visualisations: «FOR f : dotRepresentations.filterNull»#«ENDFOR»''',
								"#",
								dotRepresentations.filterNull.map[
									new ScriptConsoleDecorator('''«it.fileRepresentationInConsole»''',it)
								]
							)
						}					
					} else {
						visualisationProgressMonitor.worked(1.0)
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
					statistics.put("Postprocessing time",solutionVisualisationTime/1000000)
					for(entry: solution.statistics.entries) {
						statistics.put(entry.name,statisticsUtil.readValue(entry))
					}
					console.addStatistics(statistics)
				}
				
			}
			console.flushStatistics
			console.writeMessage("Model generation finished")
		} catch(Exception e) {
			console.writeError('''
			Error occured («e.class.simpleName»): «e.message»
			«FOR s : e.stackTrace SEPARATOR "\n"»    «s»«ENDFOR»''')
		}
	}
	
	private def fileRepresentationInConsole(File file) {
//		if(file.name.contains('.')) {
//			return file.name.substring(0,file.name.lastIndexOf('.'))
//		} else {
//			file.name
//		}
		file.name
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
