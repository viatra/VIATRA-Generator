package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import java.util.Comparator
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

abstract class ObjectiveThreshold {
	public static val NO_THRESHOLD = new hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold {
		override isHard() {
			false
		}

		override satisfiesThreshold(double cost, Comparator<Double> comparator) {
			true
		}
	}

	private new() {
	}

	def boolean isHard() {
		true
	}

	def boolean satisfiesThreshold(double cost, Comparator<Double> comparator)

	@Data
	static class Exclusive extends ObjectiveThreshold {
		val double threshold

		override satisfiesThreshold(double cost, Comparator<Double> comparator) {
			comparator.compare(threshold, cost) > 0
		}
	}

	@Data
	static class Inclusive extends ObjectiveThreshold {
		val double threshold

		override satisfiesThreshold(double cost, Comparator<Double> comparator) {
			comparator.compare(threshold, cost) >= 0
		}
	}
}

abstract class AbstractThreeValuedObjective implements IThreeValuedObjective {
	@Accessors val String name
	@Accessors ObjectiveKind kind
	@Accessors ObjectiveThreshold threshold
	@Accessors int level

	protected new(String name, ObjectiveKind kind, ObjectiveThreshold threshold, int level) {
		this.name = name
		this.kind = kind
		this.threshold = threshold
		this.level = level
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

	override isHardObjective() {
		threshold.hard
	}

	override satisifiesHardObjective(Double fitness) {
		threshold.satisfiesThreshold(fitness, comparator)
	}

	override getComparator() {
		kind.comparator
	}

	override setComparator(Comparator<Double> comparator) {
		kind = ObjectiveKind.fromComparator(comparator)
	}

}
