package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import org.eclipse.viatra.dse.base.ThreadContext

abstract class AbstractThreeValuedObjective extends DirectionalThresholdObjective implements IThreeValuedObjective {
	protected new(String name, ObjectiveKind kind, ObjectiveThreshold threshold, int level) {
		super(name, kind, threshold, level)
	}

	abstract def double getLowestPossibleFitness(ThreadContext threadContext)

	abstract def double getHighestPossibleFitness(ThreadContext threadContext)

	override getWorstPossibleFitness(ThreadContext threadContext) {
		switch (kind) {
			case LOWER_IS_BETTER:
				getHighestPossibleFitness(threadContext)
			case HIGHER_IS_BETTER:
				getLowestPossibleFitness(threadContext)
			default:
				throw new IllegalStateException("Unknown three valued objective kind: " + kind)
		}
	}

	override getBestPossibleFitness(ThreadContext threadContext) {
		switch (kind) {
			case LOWER_IS_BETTER:
				getLowestPossibleFitness(threadContext)
			case HIGHER_IS_BETTER:
				getHighestPossibleFitness(threadContext)
			default:
				throw new IllegalStateException("Unknown three valued objective kind: " + kind)
		}
	}
}
