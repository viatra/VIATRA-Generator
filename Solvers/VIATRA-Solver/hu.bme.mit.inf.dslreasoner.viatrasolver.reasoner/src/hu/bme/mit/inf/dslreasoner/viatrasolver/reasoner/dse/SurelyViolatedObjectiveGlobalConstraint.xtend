package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.IGlobalConstraint
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class SurelyViolatedObjectiveGlobalConstraint implements IGlobalConstraint {
	val ViatraReasonerSolutionSaver solutionSaver

	override init(ThreadContext context) {
		// Nothing to initialize.
	}

	override createNew() {
		this
	}

	override getName() {
		class.name
	}

	override checkGlobalConstraint(ThreadContext context) {
		val bestFitness = DseUtils.caclulateBestPossibleFitness(context)
		bestFitness.satisifiesHardObjectives && solutionSaver.fitnessMayBeSaved(bestFitness)
	}
}
