package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval;

import java.util.function.BinaryOperator;

public enum IntervalAggregationMode implements BinaryOperator<Interval> {
	SUM("intervalSum", "Sum a set of intervals") {
		@Override
		public IntervalRedBlackNode createNode(Interval interval) {
			return new IntervalRedBlackNode(interval) {
				public boolean isMultiplicitySensitive() {
					return true;
				}

				public Interval multiply(Interval interval, int count) {
					return interval.operator_multiply(count);
				};

				@Override
				public Interval op(Interval left, Interval right) {
					return left.operator_plus(right);
				}
			};
		}
		
		@Override
		public Interval getNeutral() {
			return Interval.ZERO;
		}
	},
	
	MIN("intervalMin", "Find the minimum a set of intervals") {
		@Override
		public IntervalRedBlackNode createNode(Interval interval) {
			return new IntervalRedBlackNode(interval) {
				@Override
				public Interval op(Interval left, Interval right) {
					return left.min(right);
				}
			};
		}
	},
	
	MAX("intervalMax", "Find the maximum a set of intervals") {
		@Override
		public IntervalRedBlackNode createNode(Interval interval) {
			return new IntervalRedBlackNode(interval) {
				@Override
				public Interval op(Interval left, Interval right) {
					return left.max(right);
				}
			};
		}
	},

	JOIN("intervalJoin", "Calculate the smallest interval containing all the intervals in a set") {
		@Override
		public IntervalRedBlackNode createNode(Interval interval) {
			return new IntervalRedBlackNode(interval) {
				@Override
				public Interval op(Interval left, Interval right) {
					return left.join(right);
				}
			};
		}
	};

	private final String modeName;
	private final String description;
	private final IntervalRedBlackNode empty;

	IntervalAggregationMode(String modeName, String description) {
		this.modeName = modeName;
		this.description = description;
		empty = createNode(null);
	}

	public String getModeName() {
		return modeName;
	}

	public String getDescription() {
		return description;
	}

	public IntervalRedBlackNode getEmpty() {
		return empty;
	}

	@Override
	public Interval apply(Interval left, Interval right) {
		return empty.op(left, right);
	}

	public abstract IntervalRedBlackNode createNode(Interval interval);
	
	public Interval getNeutral() {
		return Interval.EMPTY;
	}
}
