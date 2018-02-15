package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.application.validation.MetamodelValidator
import hu.bme.mit.inf.dslreasoner.application.validation.QueryAndMetamodelValidator
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolutionScope
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InconsistencyResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UnknownResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.ProjectWorkspace
import org.eclipse.emf.common.util.URI

class GenerationTaskExecutor {
	val metamodelLoader = new MetamodelLoader
	val modelLoader = new ModelLoader
	val queryLoader = new QueryLoader
	val solverLoader = new SolverLoader
	val scopeLoader = new ScopeLoader
	
	val metamodelValidator = new MetamodelValidator
	val queryAndMetamodelValidator = new QueryAndMetamodelValidator
	
	def executeGenerationTask(
		GenerationTask task,
		ScriptExecutor scriptExecutor)
	{
		// 1. Load all resources
		
		val metamodelSpecification = scriptExecutor.getMetamodelSpecification(task.metamodel)
		val patternSpecification = scriptExecutor.getPatternSpecification(task.patterns)
		val partialmodelSpecification = scriptExecutor.getPartialModelSpecification(task.partialModel)
		val scopeSpecification = scriptExecutor.getScopeSpecification(task.scope)
		val configurationMap = scriptExecutor.transformToMap( 
			scriptExecutor.getConfiguration(task.config))
		val messageFile = scriptExecutor.getFileSpecification(task.targetLogFile)
		val debugFolder = scriptExecutor.getFileSpecification(task.debugFolder)
		val outputFolder = scriptExecutor.getFileSpecification(task.getTagetFolder)
		val statisticsFile = scriptExecutor.getFileSpecification(task.targetStatisticsFile)
		
		// 2. create console
		
		val console = new ScriptConsole(true,true,
			if(messageFile!==null) URI.createURI(messageFile.path) else null,
			if(debugFolder!==null) URI.createURI('''«debugFolder.path»/errors.txt''') else null,
			if(statisticsFile!==null) URI.createURI(statisticsFile.path) else null
		)
		
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
		
		// 4. translate all description to a logic problem
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
		
		// 5. create a solver and a configuration
		// 5.1 initialize
		val solver = solverLoader.loadSolver(task.solver,configurationMap)
		val solverConfig = solverLoader.loadSolverConfig(task.solver,configurationMap)
		val reasonerWorkspace = if(debugFolder!== null) {
			new ProjectWorkspace(debugFolder.path,"")
		} else {
			new NullWorkspace
		}
		
		// 5.2 set values that defined directly 
		solverConfig.solutionScope = new SolutionScope => [
			it.numberOfRequiredSolution = if(task.numberSpecified) {
				1
			} else {
				task.number
			}
		]
		solverConfig.typeScopes = scopeLoader.loadScope(
			scopeSpecification,
			problem,
			ecore2Logic,
			modelGeneration.trace
		)
		
		// 6. execute the solver on the problem with the configuration
		val runs = if(task.runSpecified) {
			task.runs
		} else {
			1
		}
		console.writeMessage("Start model generation")
		
		for(run : 1..runs) {
			val solution = solver.solve(problem,solverConfig,reasonerWorkspace)
			console.writeMessage(solution.soutionDescription.toString)
		}
	}
	
	private def dispatch soutionDescription(InconsistencyResult s) {
		if(s.representation.size == 1) {
			'''Problem is inconsistent!'''
		} else {
			'''Problem is inconsistent, only «s.representation.size» model can be created!'''
		}
	}
	
	private def dispatch soutionDescription(ModelResult s) {
		if(s.representation.size == 1) {
			'''Problem is consistent!'''
		} else {
			'''Problem is consistent, «s.representation.size» model generated!'''
		}
	}
	
	private def dispatch soutionDescription(UnknownResult s) {
		if(s.representation.size == 1) {
			'''Unable to solve problem!'''
		} else {
			'''Unable to solve problem, but «s.representation.size» model generated!'''
		}
	}
}