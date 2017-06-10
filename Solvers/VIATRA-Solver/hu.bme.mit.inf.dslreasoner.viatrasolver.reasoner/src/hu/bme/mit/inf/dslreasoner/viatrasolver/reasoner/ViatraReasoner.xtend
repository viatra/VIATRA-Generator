package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethodProvider
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.PartialInterpretationInitialiser
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder.IdentifierBasedStateCoderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder.NeighbourhoodBasedStateCoderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.BestFirstStrategyForModelGeneration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.ModelGenerationCompositeObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.PartialModelAsLogicInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.ScopeObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.UnfinishedMultiplicityObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.UnfinishedWFObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.WF2ObjectiveConverter
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import org.eclipse.viatra.dse.api.DesignSpaceExplorer
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel
import org.eclipse.viatra.dse.solutionstore.SolutionStore
import org.eclipse.viatra.dse.statecode.IStateCoderFactory

class ViatraReasoner extends LogicReasoner{
	val PartialInterpretationInitialiser initialiser = new PartialInterpretationInitialiser()
	val ModelGenerationMethodProvider modelGenerationMethodProvider = new ModelGenerationMethodProvider
	val extension LogicresultFactory factory = LogicresultFactory.eINSTANCE	
	val WF2ObjectiveConverter wf2ObjectiveConverter = new WF2ObjectiveConverter
	
	val LogicReasoner inconsistencyDetector
	
	public new() {
		this.inconsistencyDetector=null
	}
	
	public new(LogicReasoner inconsistencyDetector) {
		this.inconsistencyDetector = inconsistencyDetector
	}
	
	override solve(LogicProblem problem, LogicSolverConfiguration configuration, ReasonerWorkspace workspace) throws LogicReasonerException {
		val viatraConfig = configuration.asConfig
		val DesignSpaceExplorer dse = new DesignSpaceExplorer();
		
		/*
		DesignSpaceExplorer.turnOnLogging(DseLoggingLevel.VERBOSE_FULL)
		/*/
		DesignSpaceExplorer.turnOnLogging(DseLoggingLevel.WARN)
		//*/
		
		dse.addMetaModelPackage(LogiclanguagePackage.eINSTANCE)
		dse.addMetaModelPackage(LogicproblemPackage.eINSTANCE)
		dse.addMetaModelPackage(PartialinterpretationPackage.eINSTANCE)
		
		val transformationStartTime = System.nanoTime
		
		val emptySolution = initialiser.initialisePartialInterpretation(problem,
			viatraConfig.typeScopes.minNewElements,
			viatraConfig.typeScopes.maxNewElements).output
		emptySolution.problemConainer = problem
		
		val method = modelGenerationMethodProvider.createModelGenerationMethod(
			problem,
			emptySolution,
			viatraConfig.existingQueries,
			workspace,
			viatraConfig.nameNewElements,
			viatraConfig.typeInferenceMethod
		)
		
		dse.addObjective(new ModelGenerationCompositeObjective(
			new ScopeObjective,
			method.unfinishedMultiplicities.map[new UnfinishedMultiplicityObjective(it)],
			new UnfinishedWFObjective(method.unfinishedWF)
		))

		dse.addGlobalConstraint(wf2ObjectiveConverter.createInvalidationObjective(method.invalidWF))
		for(additionalConstraint : configuration.asConfig.additionalGlobalConstraints) {
			dse.addGlobalConstraint(additionalConstraint.apply(method))
		}
		
		dse.setInitialModel(emptySolution)
		
		var IStateCoderFactory statecoder = if(viatraConfig.stateCoderStrategy == StateCoderStrategy.Neighbourhood) {
			new NeighbourhoodBasedStateCoderFactory
		} else {
			new IdentifierBasedStateCoderFactory
		}
		dse.stateCoderFactory = statecoder
		
		dse.maxNumberOfThreads = 1
		
		val solutionStore =  new SolutionStore(configuration.solutionScope.numberOfRequiredSolution)
		dse.solutionStore = solutionStore
		
		for(rule : method.relationRefinementRules) {
			dse.addTransformationRule(rule)
		}
		for(rule : method.objectRefinementRules) {
			dse.addTransformationRule(rule)
		}
		
		val strategy = new BestFirstStrategyForModelGeneration(
			workspace,inconsistencyDetector,
			viatraConfig.inconsistencDetectorConfiguration,
			viatraConfig.diversityRequirement)
		
		val transformationTime = System.nanoTime - transformationStartTime
		val solverStartTime = System.nanoTime
		var boolean stoppedByTimeout
		var boolean stoppedByException
		try{
			stoppedByTimeout = dse.startExplorationWithTimeout(strategy,configuration.runtimeLimit*1000);
			stoppedByException = false
		} catch (NullPointerException npe) {
			stoppedByTimeout = false
			stoppedByException = true
		}
		
		val solverTime = System.nanoTime - solverStartTime
		
		val statecoderFinal = statecoder
		val statistics = createStatistics => [
			//it.solverTime = viatraConfig.runtimeLimit
			it.solverTime = (solverTime/1000000) as int
			it.transformationTime = (transformationTime/1000000) as int
			it.entries += createIntStatisticEntry => [
				it.name = "TransformationExecutionTime" it.value = (method.statistics.transformationExecutionTime/1000000) as int
			]
			it.entries += createIntStatisticEntry => [
				it.name = "TypeAnalysisTime" it.value = (method.statistics.PreliminaryTypeAnalisisTime/1000000) as int
			]
			it.entries += createIntStatisticEntry => [
				it.name = "StateCoderTime" it.value = (statecoderFinal.runtime/1000000) as int
			]
			it.entries += createIntStatisticEntry => [
				it.name = "StateCoderFailCount" it.value = strategy.numberOfStatecoderFaiL
			]
			it.entries += createIntStatisticEntry => [
				it.name = "SolutionCopyTime" it.value = (strategy.solutionStoreWithCopy.sumRuntime/1000000) as int
			]
			if(strategy.solutionStoreWithDiversityDescriptor.isActive) {
				it.entries += createIntStatisticEntry => [
					it.name = "SolutionDiversityCheckTime" it.value = (strategy.solutionStoreWithDiversityDescriptor.sumRuntime/1000000) as int
				]
				it.entries += createRealStatisticEntry => [
					it.name = "SolutionDiversitySuccessRate" it.value = strategy.solutionStoreWithDiversityDescriptor.successRate
				]
			}
		]
		
		if(stoppedByTimeout) {
			return createInsuficientResourcesResult=>[
				it.problem = problem
				it.resourceName="time"
				it.statistics = statistics
			]
		} else {
			if(solutionStore.solutions.empty) {
				return createInconsistencyResult => [
					it.problem = problem
					it.statistics = statistics
				]
			} else {
				
				/*solutionStore.solutions.head.trajectories.head
				solutionTrajectory.doTransformation(emptySolution)
				* 
				*/
				return factory.createModelResult => [
					it.problem = problem
					it.trace = null
					it.representation += strategy.solutionStoreWithCopy.solutions
					it.statistics = statistics
				]
			}
		}
	}
	
	/*private def simpleWeithts(List<IObjective> objectives) {
		objectives.map[1.0].toList
	}*/

    private def dispatch long runtime(NeighbourhoodBasedStateCoderFactory sc) {
        sc.sumStatecoderRuntime
    }

    private def dispatch long runtime(IdentifierBasedStateCoderFactory sc) {
        sc.sumStatecoderRuntime
    }

	override getInterpretation(ModelResult modelResult) {
		return new PartialModelAsLogicInterpretation
	}
	
	def ViatraReasonerConfiguration asConfig(LogicSolverConfiguration configuration) {
		if(configuration instanceof ViatraReasonerConfiguration) {
			return configuration
		} else throw new IllegalArgumentException('''Wrong configuration. Expected: «ViatraReasonerConfiguration.name», but got: «configuration.class.name»"''')
	}
}
