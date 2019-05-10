package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode
import org.eclipse.xtend.lib.annotations.Data

abstract class Interval implements Comparable<Interval> {
	static val PRECISION = 32
	static val ROUND_DOWN = new MathContext(PRECISION, RoundingMode.FLOOR)
	static val ROUND_UP = new MathContext(PRECISION, RoundingMode.CEILING)

	private new() {
	}

	abstract def boolean mustEqual(Interval other)

	abstract def boolean mayEqual(Interval other)

	def mustNotEqual(Interval other) {
		!mayEqual(other)
	}

	def mayNotEqual(Interval other) {
		!mustEqual(other)
	}

	abstract def boolean mustBeLessThan(Interval other)

	abstract def boolean mayBeLessThan(Interval other)

	def mustBeLessThanOrEqual(Interval other) {
		!mayBeGreaterThan(other)
	}

	def mayBeLessThanOrEqual(Interval other) {
		!mustBeGreaterThan(other)
	}

	def mustBeGreaterThan(Interval other) {
		other.mustBeLessThan(this)
	}

	def mayBeGreaterThan(Interval other) {
		other.mayBeLessThan(this)
	}

	def mustBeGreaterThanOrEqual(Interval other) {
		other.mustBeLessThanOrEqual(this)
	}

	def mayBeGreaterThanOrEqual(Interval other) {
		other.mayBeLessThanOrEqual(this)
	}

	abstract def Interval min(Interval other)
	
	abstract def Interval max(Interval other)

	abstract def Interval join(Interval other)

	def operator_plus() {
		this
	}

	abstract def Interval operator_minus()

	abstract def Interval operator_plus(Interval other)

	abstract def Interval operator_minus(Interval other)

	abstract def Interval operator_multiply(int count)

	abstract def Interval operator_multiply(Interval other)

	abstract def Interval operator_divide(Interval other)

	public static val EMPTY = new Interval {
		override mustEqual(Interval other) {
			true
		}

		override mayEqual(Interval other) {
			false
		}

		override mustBeLessThan(Interval other) {
			true
		}

		override mayBeLessThan(Interval other) {
			false
		}

		override min(Interval other) {
			EMPTY
		}
		
		override max(Interval other) {
			EMPTY
		}

		override join(Interval other) {
			other
		}

		override operator_minus() {
			EMPTY
		}

		override operator_plus(Interval other) {
			EMPTY
		}

		override operator_minus(Interval other) {
			EMPTY
		}

		override operator_multiply(int count) {
			EMPTY
		}

		override operator_multiply(Interval other) {
			EMPTY
		}

		override operator_divide(Interval other) {
			EMPTY
		}

		override toString() {
			"∅"
		}

		override compareTo(Interval o) {
			if (o == EMPTY) {
				0
			} else {
				-1
			}
		}

	}

	public static val Interval ZERO = new NonEmpty(BigDecimal.ZERO, BigDecimal.ZERO)

	public static val Interval UNBOUNDED = new NonEmpty(null, null)

	static def Interval of(BigDecimal lower, BigDecimal upper) {
		new NonEmpty(lower, upper)
	}

	static def between(double lower, double upper) {
		of(new BigDecimal(lower, ROUND_DOWN), new BigDecimal(upper, ROUND_UP))
	}

	static def upTo(double upper) {
		of(null, new BigDecimal(upper, ROUND_UP))
	}

	static def above(double lower) {
		of(new BigDecimal(lower, ROUND_DOWN), null)
	}

	@Data
	private static class NonEmpty extends Interval {
		val BigDecimal lower
		val BigDecimal upper

		/**
		 * Construct a new non-empty interval.
		 * 
		 * @param lower The lower bound of the interval. Use <code>null</code> for negative infinity.
		 * @param upper The upper bound of the interval. Use <code>null</code> for positive infinity.
		 */
		new(BigDecimal lower, BigDecimal upper) {
			if (lower !== null && upper !== null && lower > upper) {
				throw new IllegalArgumentException("Lower bound of interval must not be larger than upper bound")
			}
			this.lower = lower
			this.upper = upper
		}

		override mustEqual(Interval other) {
			switch (other) {
				case EMPTY: true
				NonEmpty: lower == upper && lower == other.lower && lower == other.upper
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}

		override mayEqual(Interval other) {
			if (other instanceof NonEmpty) {
				(lower === null || other.upper === null || lower <= other.upper) &&
					(other.lower === null || upper === null || other.lower <= upper)
			} else {
				false
			}
		}

		override mustBeLessThan(Interval other) {
			switch (other) {
				case EMPTY: true
				NonEmpty: upper !== null && other.lower !== null && upper < other.lower
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}

		override mayBeLessThan(Interval other) {
			if (other instanceof NonEmpty) {
				lower === null || other.upper === null || lower < other.upper
			} else {
				false
			}
		}

		override min(Interval other) {
			switch (other) {
				case EMPTY: this
				NonEmpty: min(other)
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}
		
		def min(NonEmpty other) {
			new NonEmpty(
				lower.tryMin(other.lower),
				if (other.upper === null) upper else upper?.min(other.upper)
			)
		}
		
		override max(Interval other) {
			switch (other) {
				case EMPTY: this
				NonEmpty: max(other)
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}
		
		def max(NonEmpty other) {
			new NonEmpty(
				if (other.lower === null) lower else lower?.min(other.lower),
				upper.tryMax(other.upper)
			)
		}

		override join(Interval other) {
			switch (other) {
				case EMPTY: this
				NonEmpty: new NonEmpty(lower.tryMin(other.lower), upper.tryMax(other.upper))
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}

		override operator_minus() {
			new NonEmpty(upper?.negate(ROUND_DOWN), lower?.negate(ROUND_UP))
		}

		override operator_plus(Interval other) {
			switch (other) {
				case EMPTY: EMPTY
				NonEmpty: operator_plus(other)
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}

		def operator_plus(NonEmpty other) {
			new NonEmpty(
				lower.tryAdd(other.lower, ROUND_DOWN),
				upper.tryAdd(other.upper, ROUND_UP)
			)
		}

		private static def tryAdd(BigDecimal a, BigDecimal b, MathContext mc) {
			if (b === null) {
				null
			} else {
				a?.add(b, mc)
			}
		}

		override operator_minus(Interval other) {
			switch (other) {
				case EMPTY: EMPTY
				NonEmpty: operator_minus(other)
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}

		def operator_minus(NonEmpty other) {
			new NonEmpty(
				lower.trySubtract(other.upper, ROUND_DOWN),
				upper.trySubtract(other.lower, ROUND_UP)
			)
		}

		private static def trySubtract(BigDecimal a, BigDecimal b, MathContext mc) {
			if (b === null) {
				null
			} else {
				a?.subtract(b, mc)
			}
		}

		override operator_multiply(int count) {
			val bigCount = new BigDecimal(count)
			new NonEmpty(
				lower.tryMultiply(bigCount, ROUND_DOWN),
				upper.tryMultiply(bigCount, ROUND_UP)
			)
		}

		override operator_multiply(Interval other) {
			switch (other) {
				case EMPTY: EMPTY
				NonEmpty: operator_multiply(other)
				default: throw new IllegalArgumentException("")
			}
		}

		def operator_multiply(NonEmpty other) {
			if (this == ZERO || other == ZERO) {
				ZERO
			} else if (nonpositive) {
				if (other.nonpositive) {
					new NonEmpty(
						upper.multiply(other.upper, ROUND_DOWN),
						lower.tryMultiply(other.lower, ROUND_UP)
					)
				} else if (other.nonnegative) {
					new NonEmpty(
						lower.tryMultiply(other.upper, ROUND_DOWN),
						upper.multiply(other.lower, ROUND_UP)
					)
				} else {
					new NonEmpty(
						lower.tryMultiply(other.upper, ROUND_DOWN),
						lower.tryMultiply(other.lower, ROUND_UP)
					)
				}
			} else if (nonnegative) {
				if (other.nonpositive) {
					new NonEmpty(
						upper.tryMultiply(other.lower, ROUND_DOWN),
						lower.multiply(other.upper, ROUND_UP)
					)
				} else if (other.nonnegative) {
					new NonEmpty(
						lower.multiply(other.lower, ROUND_DOWN),
						upper.tryMultiply(other.upper, ROUND_UP)
					)
				} else {
					new NonEmpty(
						upper.tryMultiply(other.lower, ROUND_DOWN),
						upper.tryMultiply(other.upper, ROUND_UP)
					)
				}
			} else {
				if (other.nonpositive) {
					new NonEmpty(
						upper.tryMultiply(other.lower, ROUND_DOWN),
						lower.tryMultiply(other.lower, ROUND_UP)
					)
				} else if (other.nonnegative) {
					new NonEmpty(
						lower.tryMultiply(other.upper, ROUND_DOWN),
						upper.tryMultiply(other.upper, ROUND_UP)
					)
				} else {
					new NonEmpty(
						lower.tryMultiply(other.upper, ROUND_DOWN).tryMin(upper.tryMultiply(other.lower, ROUND_DOWN)),
						lower.tryMultiply(other.lower, ROUND_UP).tryMax(upper.tryMultiply(other.upper, ROUND_UP))
					)
				}
			}
		}

		private def isNonpositive() {
			upper !== null && upper <= BigDecimal.ZERO
		}

		private def isNonnegative() {
			lower !== null && lower >= BigDecimal.ZERO
		}

		private static def tryMultiply(BigDecimal a, BigDecimal b, MathContext mc) {
			if (b === null) {
				null
			} else {
				a?.multiply(b, mc)
			}
		}

		private static def tryMin(BigDecimal a, BigDecimal b) {
			if (b === null) {
				null
			} else {
				a?.min(b)
			}
		}

		private static def tryMax(BigDecimal a, BigDecimal b) {
			if (b === null) {
				null
			} else {
				a?.max(b)
			}
		}

		override operator_divide(Interval other) {
			switch (other) {
				case EMPTY: EMPTY
				NonEmpty: operator_divide(other)
				default: throw new IllegalArgumentException("Unknown interval: " + other)
			}
		}

		def operator_divide(NonEmpty other) {
			if (other == ZERO) {
				EMPTY
			} else if (this == ZERO) {
				ZERO
			} else if (other.strictlyNegative) {
				if (nonpositive) {
					new NonEmpty(
						upper.tryDivide(other.lower, ROUND_DOWN),
						lower.tryDivide(other.upper, ROUND_UP)
					)
				} else if (nonnegative) {
					new NonEmpty(
						upper.tryDivide(other.upper, ROUND_DOWN),
						lower.tryDivide(other.lower, ROUND_UP)
					)
				} else { // lower < 0 < upper
					new NonEmpty(
						upper.tryDivide(other.upper, ROUND_DOWN),
						lower.tryDivide(other.upper, ROUND_UP)
					)
				}
			} else if (other.strictlyPositive) {
				if (nonpositive) {
					new NonEmpty(
						lower.tryDivide(other.lower, ROUND_DOWN),
						upper.tryDivide(other.upper, ROUND_UP)
					)
				} else if (nonnegative) {
					new NonEmpty(
						lower.tryDivide(other.upper, ROUND_DOWN),
						upper.tryDivide(other.lower, ROUND_UP)
					)
				} else { // lower < 0 < upper
					new NonEmpty(
						lower.tryDivide(other.lower, ROUND_DOWN),
						upper.tryDivide(other.lower, ROUND_UP)
					)
				}
			} else { // other contains 0
				if (other.lower == BigDecimal.ZERO) { // 0 == other.lower < other.upper, because [0, 0] was exluded earlier
					if (nonpositive) {
						new NonEmpty(null, upper.tryDivide(other.upper, ROUND_UP))
					} else if (nonnegative) {
						new NonEmpty(lower.tryDivide(other.upper, ROUND_DOWN), null)
					} else { // lower < 0 < upper
						UNBOUNDED
					}
				} else if (other.upper == BigDecimal.ZERO) { // other.lower < other.upper == 0
					if (nonpositive) {
						new NonEmpty(upper.tryDivide(other.lower, ROUND_DOWN), null)
					} else if (nonnegative) {
						new NonEmpty(null, lower.tryDivide(other.lower, ROUND_UP))
					} else { // lower < 0 < upper
						UNBOUNDED
					}
				} else { // other.lower < 0 < other.upper
					UNBOUNDED
				}
			}
		}

		private def isStrictlyNegative() {
			upper !== null && upper < BigDecimal.ZERO
		}

		private def isStrictlyPositive() {
			lower !== null && lower > BigDecimal.ZERO
		}

		private static def tryDivide(BigDecimal a, BigDecimal b, MathContext mc) {
			if (b === null) {
				BigDecimal.ZERO
			} else {
				a?.divide(b, mc)
			}
		}

		override toString() {
			'''«IF lower === null»(-∞«ELSE»[«lower»«ENDIF», «IF upper === null»∞)«ELSE»«upper»]«ENDIF»'''
		}

		override compareTo(Interval o) {
			switch (o) {
				case EMPTY: 1
				NonEmpty: compareTo(o)
				default: throw new IllegalArgumentException("")
			}
		}

		def compareTo(NonEmpty o) {
			if (lower === null) {
				if (o.lower !== null) {
					return -1
				}
			} else if (o.lower === null) { // lower !== null
				return 1
			} else { // both lower and o.lower are finite
				val lowerDifference = lower.compareTo(o.lower)
				if (lowerDifference != 0) {
					return lowerDifference
				}
			}
			if (upper === null) {
				if (o.upper === null) {
					return 0
				} else {
					return 1
				}
			} else if (o.upper === null) { // upper !== null
				return -1
			}
			upper.compareTo(o.upper)
		}
	}
}
