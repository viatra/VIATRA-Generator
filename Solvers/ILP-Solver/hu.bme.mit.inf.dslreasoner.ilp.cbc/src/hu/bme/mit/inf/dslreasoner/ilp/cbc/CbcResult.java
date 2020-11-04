package hu.bme.mit.inf.dslreasoner.ilp.cbc;

public abstract class CbcResult {
	public static final CbcResult SOLUTION_UNBOUNDED = new CbcResult() {
	};

	public static final CbcResult UNSAT = new CbcResult() {
	};
	
	public static final CbcResult ABANDONED = new CbcResult() {
	};

	public static final CbcResult TIMEOUT = new CbcResult() {
	};

	private CbcResult() {
	}

	public static class SolutionBounded extends CbcResult {
		public final double value;

		public SolutionBounded(double value) {
			this.value = value;
		}

		public double getValue() {
			return value;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(value);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SolutionBounded other = (SolutionBounded) obj;
			if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
				return false;
			return true;
		}
	}
}
