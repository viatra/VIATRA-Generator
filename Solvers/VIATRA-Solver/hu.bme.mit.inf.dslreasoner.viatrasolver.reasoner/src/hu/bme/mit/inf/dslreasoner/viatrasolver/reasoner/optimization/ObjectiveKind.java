package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization;

import java.util.Comparator;

import org.eclipse.viatra.dse.objectives.Comparators;

public enum ObjectiveKind {
	LOWER_IS_BETTER {

		@Override
		public Comparator<Double> getComparator() {
			return Comparators.LOWER_IS_BETTER;
		}

		@Override
		public double getInvalidValue() {
			return Double.POSITIVE_INFINITY;
		}

		@Override
		public double getSatisfiedValue() {
			return Double.NEGATIVE_INFINITY;
		}

	},
	HIGHER_IS_BETTER {

		@Override
		public Comparator<Double> getComparator() {
			return Comparators.HIGHER_IS_BETTER;
		}

		@Override
		public double getInvalidValue() {
			return Double.NEGATIVE_INFINITY;
		}

		@Override
		public double getSatisfiedValue() {
			return Double.POSITIVE_INFINITY;
		}

	};

	public abstract Comparator<Double> getComparator();

	public abstract double getInvalidValue();

	public abstract double getSatisfiedValue();

	public static ObjectiveKind fromComparator(Comparator<Double> comparator) {
		if (Comparators.LOWER_IS_BETTER.equals(comparator)) {
			return ObjectiveKind.LOWER_IS_BETTER;
		} else if (Comparators.HIGHER_IS_BETTER.equals(comparator)) {
			return ObjectiveKind.HIGHER_IS_BETTER;
		} else {
			throw new IllegalStateException("Only LOWER_IS_BETTER and HIGHER_IS_BETTER comparators are supported.");
		}
	}
}
