package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import java.util.Comparator
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

abstract class ObjectiveThreshold {
	public static val NO_THRESHOLD = new ObjectiveThreshold {
		override isHard() {
			false
		}

		override satisfiesThreshold(double cost, Comparator<Double> comparator) {
			true
		}

		override protected postProcessSatisfactoryCost(double cost, ObjectiveKind kind) {
			cost
		}

		override ObjectiveThreshold merge(ObjectiveThreshold other) {
			if (other == NO_THRESHOLD) {
				NO_THRESHOLD
			} else {
				throw new IllegalArgumentException("Merged thresholds must have the same type")
			}
		}
	}

	private new() {
	}

	def boolean isHard() {
		true
	}

	def boolean satisfiesThreshold(double cost, ObjectiveKind kind) {
		satisfiesThreshold(cost, kind.comparator)
	}

	def boolean satisfiesThreshold(double cost, Comparator<Double> comparator)

	def double postProcessCost(double cost, ObjectiveKind kind) {
		if (satisfiesThreshold(cost, kind)) {
			postProcessSatisfactoryCost(cost, kind)
		} else {
			cost
		}
	}

	protected def double postProcessSatisfactoryCost(double cost, ObjectiveKind kind)

	def ObjectiveThreshold merge(ObjectiveThreshold other)

	@Data
	static class Exclusive extends ObjectiveThreshold {
		static val EPSILON = 0.1

		val double threshold
		val boolean clampToThreshold

		@FinalFieldsConstructor
		new() {
		}

		new(double threshold) {
			this(threshold, true)
		}

		override satisfiesThreshold(double cost, Comparator<Double> comparator) {
			comparator.compare(threshold, cost) < 0
		}

		override protected postProcessSatisfactoryCost(double cost, ObjectiveKind kind) {
			if (clampToThreshold) {
				threshold + Math.signum(kind.satisfiedValue) * EPSILON
			} else {
				cost
			}
		}

		override ObjectiveThreshold merge(ObjectiveThreshold other) {
			if (other instanceof Exclusive) {
				new Exclusive(threshold + other.threshold)
			} else {
				throw new IllegalArgumentException("Merged thresholds must have the same type")
			}
		}
	}

	@Data
	static class Inclusive extends ObjectiveThreshold {
		val double threshold
		val boolean clampToThreshold

		@FinalFieldsConstructor
		new() {
		}

		new(double threshold) {
			this(threshold, true)
		}

		override satisfiesThreshold(double cost, Comparator<Double> comparator) {
			comparator.compare(threshold, cost) <= 0
		}

		override protected postProcessSatisfactoryCost(double cost, ObjectiveKind kind) {
			if (clampToThreshold) {
				threshold
			} else {
				cost
			}
		}
		
		override ObjectiveThreshold merge(ObjectiveThreshold other) {
			if (other instanceof Inclusive) {
				new Inclusive(threshold + other.threshold)
			} else {
				throw new IllegalArgumentException("Merged thresholds must have the same type")
			}
		}
	}
}

abstract class DirectionalThresholdObjective implements IObjective {
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

	override getFitness(ThreadContext context) {
		val fitness = getRawFitness(context)
		threshold.postProcessCost(fitness, kind)
	}

	protected def double getRawFitness(ThreadContext context)
}
