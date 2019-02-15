package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver

import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

abstract class ReliabilityResult {
	public static val TIMEOUT = new Unknown("Solver timed out")
	public static val MEMOUT = new Unknown("Solver out of memory")

	abstract def Solution getOrThrow()

	@Data
	static final class Solution extends ReliabilityResult {
		val double lowerBound
		val double upperBound

		new(double value) {
			this(value, value)
		}

		new(double lowerBound, double upperBound) {
			if (lowerBound > upperBound) {
				throw new IllegalArgumentException("lowerBound must not be larger than upperBound")
			}
			this.lowerBound = lowerBound
			this.upperBound = upperBound
		}

		override getOrThrow() {
			this
		}
	}

	@Data
	static final class Unknown extends ReliabilityResult {
		val String message
		val Throwable cause

		@FinalFieldsConstructor
		new() {
		}

		new(String message) {
			this(message, null)
		}

		override getOrThrow() {
			throw new RuntimeException(message, cause)
		}
	}
}
