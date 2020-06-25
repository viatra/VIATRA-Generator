package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.IThreeValuedObjective
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.viatra.dse.objectives.Fitness
import org.eclipse.viatra.dse.objectives.IObjective

final class DseUtils {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def calculateFitness(ThreadContext it, (IObjective)=>Double getFitness) {
		val result = new Fitness
		var boolean satisifiesHardObjectives = true
		for (objective : objectives) {
			val fitness = getFitness.apply(objective)
			result.put(objective.name, fitness)
			if (objective.isHardObjective() && !objective.satisifiesHardObjective(fitness)) {
				satisifiesHardObjectives = false
			}
		}
		result.satisifiesHardObjectives = satisifiesHardObjectives
		result
	}

	static def caclulateBestPossibleFitness(ThreadContext threadContext) {
		threadContext.calculateFitness [ objective |
			if (objective instanceof IThreeValuedObjective) {
				objective.getBestPossibleFitness(threadContext)
			} else {
				switch (objective.comparator) {
					case Comparators.LOWER_IS_BETTER:
						Double.NEGATIVE_INFINITY
					case Comparators.HIGHER_IS_BETTER:
						Double.POSITIVE_INFINITY
					case Comparators.DIFFERENCE_TO_ZERO_IS_BETTER:
						0.0
					default:
						throw new IllegalArgumentException("Unknown comparator for non-three-valued objective: " +
							objective.name)
				}
			}
		]
	}

	static def caclulateWorstPossibleFitness(ThreadContext threadContext) {
		threadContext.calculateFitness [ objective |
			if (objective instanceof IThreeValuedObjective) {
				objective.getWorstPossibleFitness(threadContext)
			} else {
				switch (objective.comparator) {
					case Comparators.LOWER_IS_BETTER,
					case Comparators.DIFFERENCE_TO_ZERO_IS_BETTER:
						Double.POSITIVE_INFINITY
					case Comparators.HIGHER_IS_BETTER:
						Double.NEGATIVE_INFINITY
					default:
						throw new IllegalArgumentException("Unknown comparator for non-three-valued objective: " +
							objective.name)
				}
			}
		]
	}
}
