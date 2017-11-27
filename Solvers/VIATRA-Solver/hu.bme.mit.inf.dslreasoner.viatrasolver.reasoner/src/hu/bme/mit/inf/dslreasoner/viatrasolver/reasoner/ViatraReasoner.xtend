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
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
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
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.dse.api.DesignSpaceExplorer
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel
import org.eclipse.viatra.dse.solutionstore.SolutionStore
import org.eclipse.viatra.dse.statecode.IStateCoderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse.SmartGridScopeObjective

class ViatraReasoner extends LogicReasoner{
	val PartialInterpretationInitialiser initialiser = new PartialInterpretationInitialiser()
	val ModelGenerationMethodProvider modelGenerationMethodProvider = new ModelGenerationMethodProvider
	val extension LogicresultFactory factory = LogicresultFactory.eINSTANCE	
	val WF2ObjectiveConverter wf2ObjectiveConverter = new WF2ObjectiveConverter
	
	
	override solve(LogicProblem problem, LogicSolverConfiguration configuration, ReasonerWorkspace workspace) throws LogicReasonerException {
		val viatraConfig = configuration.asConfig
		
		if(viatraConfig.debugCongiguration.logging) {
			DesignSpaceExplorer.turnOnLogging(DseLoggingLevel.VERBOSE_FULL)
		} else {
			DesignSpaceExplorer.turnOnLogging(DseLoggingLevel.WARN)
		}
		
		val DesignSpaceExplorer dse = new DesignSpaceExplorer();
		
		dse.addMetaModelPackage(LogiclanguagePackage.eINSTANCE)
		dse.addMetaModelPackage(LogicproblemPackage.eINSTANCE)
		dse.addMetaModelPackage(PartialinterpretationPackage.eINSTANCE)
		
		val transformationStartTime = System.nanoTime
		
		val emptySolution = initialiser.initialisePartialInterpretation(problem,viatraConfig.typeScopes).output
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
			new UnfinishedWFObjective(method.unfinishedWF),
			new SmartGridScopeObjective()
		))
		
//		dse.addObjective(new SmartGridScopeObjective)
		
//		dse.addObjective(new ModelGenerationCompositeObjective(
//			new ScopeObjective,
//			method.unfinishedMultiplicities.map[new UnfinishedMultiplicityObjective(it)],
//			new UnfinishedWFObjective(method.unfinishedWF)
//		))
		
		dse.addGlobalConstraint(wf2ObjectiveConverter.createInvalidationObjective(method.invalidWF))
		for(additionalConstraint : viatraConfig.searchSpaceConstraints.additionalGlobalConstraints) {
			dse.addGlobalConstraint(additionalConstraint.apply(method))
		}
		
		dse.setInitialModel(emptySolution,false)
		
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
			workspace,viatraConfig)
		
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
		//additionalMatches = strategy.solutionStoreWithCopy.additionalMatches
		val statistics = createStatistics => [
			//it.solverTime = viatraConfig.runtimeLimit
			it.solverTime = (solverTime/1000000) as int
			it.transformationTime = (transformationTime/1000000) as int
			for(x : 0..<strategy.solutionStoreWithCopy.allRuntimes.size) {
				it.entries += createIntStatisticEntry => [
					it.name = '''_Solution«x»FoundAt'''
					it.value = (strategy.solutionStoreWithCopy.allRuntimes.get(x)/1000000) as int
				]
			}
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
				it.name = "StateCoderFailCount" it.value = strategy.numberOfStatecoderFail
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
					it.trace = strategy.solutionStoreWithCopy.copyTraces
					it.representation += strategy.solutionStoreWithCopy.solutions
					it.statistics = statistics
				]
			}
		}
	}

    private def dispatch long runtime(NeighbourhoodBasedStateCoderFactory sc) {
        sc.sumStatecoderRuntime
    }

    private def dispatch long runtime(IdentifierBasedStateCoderFactory sc) {
        sc.sumStatecoderRuntime
    }

	override getInterpretations(ModelResult modelResult) {
		val indexes = 0..<modelResult.representation.size
		val traces = modelResult.trace as List<Map<EObject, EObject>>;
		val res = indexes.map[i | new PartialModelAsLogicInterpretation(modelResult.representation.get(i) as PartialInterpretation,traces.get(i))].toList
		return res
	}
	
	private def ViatraReasonerConfiguration asConfig(LogicSolverConfiguration configuration) {
		if(configuration instanceof ViatraReasonerConfiguration) {
			return configuration
		} else throw new IllegalArgumentException('''Wrong configuration. Expected: «ViatraReasonerConfiguration.name», but got: «configuration.class.name»"''')
	}
}
