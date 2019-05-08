package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.interval

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode
import org.eclipse.xtend.lib.annotations.Data

abstract class Interval {
	static val PRECISION = 32
	static val ROUND_DOWN = new MathContext(PRECISION, RoundingMode.FLOOR)
	static val ROUND_UP = new MathContext(PRECISION, RoundingMode.CEILING)

	private new() {
	}

	def abstract boolean isEmpty()

	def abstract boolean hasPositivePart()

	def abstract boolean hasNegativePart()

	def operator_plus() {
		this
	}

	abstract def Interval operator_minus()

	abstract def Interval operator_plus(Interval other)
	
	def operator_minus(Interval other) {
		this + (-other)
	}

	abstract def Interval operator_multiply(Interval other)

	abstract def Interval operator_divide(Interval other)

	static val EMPTY = new Interval {
		override boolean isEmpty() {
			true
		}

		override boolean hasPositivePart() {
			false
		}

		override boolean hasNegativePart() {
			false
		}

		override operator_minus() {
			EMPTY
		}

		override operator_plus(Interval other) {
			EMPTY
		}

		override operator_multiply(Interval other) {
			EMPTY
		}

		override operator_divide(Interval other) {
			EMPTY
		}
	}
	
	static val ZERO = new Bounded(BigDecimal.ZERO, BigDecimal.ZERO)

	static val UNBOUNDED = new Interval {
		override boolean isEmpty() {
			true
		}

		override boolean hasPositivePart() {
			true
		}

		override boolean hasNegativePart() {
			true
		}

		override operator_minus() {
			UNBOUNDED
		}

		override operator_plus(Interval other) {
			if (other.empty) {
				EMPTY
			} else {
				UNBOUNDED
			}
		}

		override operator_multiply(Interval other) {
			if (other.empty) {
				EMPTY
			} else if (other.hasPositivePart || other.hasNegativePart) {
				UNBOUNDED
			} else {
				ZERO
			}
		}

		override operator_divide(Interval other) {
			if (other.hasPositivePart || other.hasNegativePart) {
				UNBOUNDED
			} else {
				EMPTY
			}
		}
	}
	
	@Data
	static class BoundedFromBelow extends Interval {
		val BigDecimal lower
		
		override isEmpty() {
			false
		}
		
		override hasPositivePart() {
			true
		}
		
		override hasNegativePart() {
			lower < BigDecimal.ZERO
		}
		
		override operator_minus() {
			new BoundedFromAbove(lower.negate(ROUND_UP))
		}
		
		override operator_plus(Interval other) {
			switch (other) {
				BoundedFromBelow:
					new BoundedFromBelow(lower.add(other.lower, ROUND_DOWN))
				BoundedFromAbove:
					UNBOUNDED
				Bounded:
					new BoundedFromBelow(lower.add(other.lower, ROUND_DOWN))
				default:
					other + this
			}
		}
		
		override operator_multiply(Interval other) {
			switch (other) {
				BoundedFromBelow:
					if (hasNegativePart || other.hasNegativePart) {
						UNBOUNDED
					} else {
						new BoundedFromBelow(lower.multiply(other.lower, ROUND_DOWN))
					}
				BoundedFromAbove:
					if (hasNegativePart || other.hasPositivePart) {
						UNBOUNDED
					} else {
						new BoundedFromAbove(lower.multiply(other.upper, ROUND_UP))
					}
				Bounded:
					if (other.hasNegativePart) {
						if (other.hasPositivePart) {
							UNBOUNDED
						} else {
							if (lower < BigDecimal.ZERO) {
								new BoundedFromAbove(lower.multiply(other.lower, ROUND_UP))
							} else {
								new BoundedFromAbove(lower.multiply(other.upper, ROUND_UP))
							}
						}
					} else {
						if (other.hasPositivePart) {
							if (lower < BigDecimal.ZERO) {
								new BoundedFromBelow(lower.multiply(other.lower, ROUND_DOWN))
							} else {
								new BoundedFromBelow(lower.multiply(other.upper, ROUND_DOWN))
							}
						} else {
							ZERO
						}
					}
				default:
					other * this
			}
		}
		
		override operator_divide(Interval other) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
	}
	
	@Data
	static class BoundedFromAbove extends Interval {
		val BigDecimal upper
		
		override isEmpty() {
			false
		}
		
		override hasPositivePart() {
			upper > BigDecimal.ZERO
		}
		
		override hasNegativePart() {
			true
		}
		
		override operator_minus() {
			new BoundedFromBelow(upper.negate(ROUND_DOWN))
		}
		
		override operator_plus(Interval other) {
			switch (other) {
				BoundedFromAbove:
					UNBOUNDED
				Bounded:
					new BoundedFromAbove(upper.add(other.upper, ROUND_UP))
				default:
					other + this
			}
		}
		
		override operator_multiply(Interval other) {
			switch (other) {
				BoundedFromAbove:
					if (hasPositivePart || other.hasPositivePart) {
						UNBOUNDED
					} else {
						new BoundedFromBelow(upper.multiply(other.upper, ROUND_DOWN))
					}
				Bounded:
					if (other.hasPositivePart) {
						if (other.hasNegativePart) {
							UNBOUNDED
						} else {
							if (upper < BigDecimal.ZERO) {
								new BoundedFromAbove(upper.multiply(other.lower, ROUND_UP))
							} else {
								new BoundedFromAbove(upper.multiply(other.upper, ROUND_UP))
							}
						}
					} else {
						if (other.hasNegativePart) {
							if (upper < BigDecimal.ZERO) {
								new BoundedFromBelow(upper.multiply(other.lower, ROUND_DOWN))
							} else {
								new BoundedFromBelow(upper.multiply(other.upper, ROUND_DOWN))
							}
						} else {
							ZERO
						}
					}
				default:
					other * this
			}
		}
		
		override operator_divide(Interval other) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
	}

	@Data
	static class Bounded extends Interval {
		val BigDecimal lower
		val BigDecimal upper

		new(BigDecimal lower, BigDecimal upper) {
			if (lower === null) {
				throw new IllegalArgumentException("Lower bound must be a number")
			}
			if (upper === null) {
				throw new IllegalArgumentException("Upper bound must be a number")
			}
			if (lower > upper) {
				throw new IllegalArgumentException("Lower bound of interval must not be larger than upper bound")
			}
			this.lower = lower
			this.upper = upper
		}

		override boolean isEmpty() {
			false
		}

		override boolean hasPositivePart() {
			upper > BigDecimal.ZERO
		}

		override boolean hasNegativePart() {
			lower < BigDecimal.ZERO
		}

		override operator_minus() {
			new Bounded(upper.negate(ROUND_DOWN), lower.negate(ROUND_UP))
		}

		override operator_plus(Interval other) {
			if (other instanceof Bounded) {
				new Bounded(lower.add(other.lower, ROUND_DOWN), upper.add(other.upper, ROUND_UP))
			} else {
				other + this
			}
		}

		override operator_multiply(Interval other) {
			if (other instanceof Bounded) {
				// TODO
			} else {
				other * this
			}
		}

		override operator_divide(Interval other) {
			switch (other) {
				case EMPTY:
					EMPTY
				Interval.Bounded:
					throw new UnsupportedOperationException("TODO")
				default:
					throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}
	}
}
