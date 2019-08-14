package hu.bme.mit.inf.dslreasoner.domains.cps.dse

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsFactory
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.Allocate
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeMemoryMetric
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CostMetric
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CreateHostInstance
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.GuidanceObjective
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.RequirementNotSatisfied
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CompositeDirectionalThresholdObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveKind
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.QueryBasedObjective
import org.eclipse.viatra.dse.api.DesignSpaceExplorer
import org.eclipse.viatra.dse.evolutionary.EvolutionaryStrategyBuilder
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory

class RuleBasedCpsSolver {
	extension val BatchTransformationRuleFactory = new BatchTransformationRuleFactory
	extension val CpsFactory = CpsFactory.eINSTANCE

	def solve(CyberPhysicalSystem problem) {
//		for (request : problem.requests) {
//			for (req : request.requirements) {
//				for (i : 0 ..< req.count) {
//					val app = createApplicationInstance
//					req.type.instances += app
//					req.instances += app
//				}
//			}
//		}
		val dse = new DesignSpaceExplorer
		dse.addMetaModelPackage(CpsPackage.eINSTANCE)
		dse.initialModel = problem.eResource.resourceSet
		dse.addTransformationRule(createRule.precondition(RequirementNotSatisfied.instance).action [
			val app = createApplicationInstance
			req.type.instances += app
			req.instances += app
		].build)
		dse.addTransformationRule(createRule.precondition(Allocate.instance).action [
			app.allocatedTo = host
		].build)
//		dse.addTransformationRule(createRule(UnallocateAppInstance.instance).action [
//			app.allocatedTo = null
//		].build)
		dse.addTransformationRule(createRule.precondition(CreateHostInstance.instance).action [
			hostType.instances += createHostInstance
		].build)
//		dse.addTransformationRule(createRule(RemoveHostInstance.instance).action [
//			hostInstance.type.instances -= hostInstance
//		].build)
		dse.addObjective(
			new CompositeDirectionalThresholdObjective("Composite",
				new QueryBasedObjective(GuidanceObjective.instance, ObjectiveKind.LOWER_IS_BETTER,
					new ObjectiveThreshold.Inclusive(0), 0),
				new QueryBasedObjective(AverageFreeMemoryMetric.instance, ObjectiveKind.LOWER_IS_BETTER,
					new ObjectiveThreshold.Inclusive(0.75), 0),
				new QueryBasedObjective(AverageFreeHddMetric.instance, ObjectiveKind.LOWER_IS_BETTER,
					new ObjectiveThreshold.Inclusive(0.75), 0)))
		dse.addObjective(
			new QueryBasedObjective(CostMetric.instance, ObjectiveKind.LOWER_IS_BETTER,
				ObjectiveThreshold.NO_THRESHOLD, 0))
		dse.maxNumberOfThreads = 1
		dse.stateCoderFactory = new CpsStateCoder.Factory
		val strategy = EvolutionaryStrategyBuilder.createNsga2Strategy(25)
		dse.startExplorationWithTimeout(strategy, 2 * 60 * 1000)
		for (solution : dse.solutions) {
			println("Found solution: " + solution.stateCode + " " + solution.arbitraryTrajectory.fitness)
		}
	}
}
