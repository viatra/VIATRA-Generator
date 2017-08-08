package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.List
import java.util.SortedSet
import java.util.TreeSet
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns
import javax.xml.ws.soap.AddressingFeature.Responses
import java.util.Collection

abstract class LogicReasoner {
	def abstract LogicResult solve(LogicProblem problem, LogicSolverConfiguration configuration,
		ReasonerWorkspace workspace) throws LogicReasonerException

	def abstract List<? extends LogicModelInterpretation> getInterpretations(ModelResult modelResult)
}

public class LogicReasonerException extends Exception {
	new(String message, Exception cause) {
		super(message, cause)
	}

	new(Exception cause) {
		super("The reasoner has failed", cause)
	}

	new(String message) {
		super(message)
	}
}

/**
 * Creates an interval. If the lowerLimit is greater than the upperLimit, the values will be swapped.
 */
class IntegerInterval {
	private var int lowerLimit;
	private var int upperLimit;

	new(int lowerLimit, int upperLimit) {
		if (lowerLimit <= upperLimit) {
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
		} else {
			this.upperLimit = lowerLimit;
			this.lowerLimit = upperLimit;
		}
	}

	def boolean equals(IntegerInterval interval) {
		if (interval.lowerLimit == this.lowerLimit && interval.upperLimit == this.upperLimit)
			return true
		return false
	}

	def public int getLowerLimit() {
		return lowerLimit;
	}

	def public int getUpperLimit() {
		return upperLimit;
	}

	def public void setLimits(int lowerLimit, int upperLimit) {
		if (lowerLimit <= upperLimit) {
			this.lowerLimit = lowerLimit;
			this.upperLimit = upperLimit;
		} else {
			this.upperLimit = lowerLimit;
			this.lowerLimit = upperLimit;
		}
	}
}

/**
 * Creates a range which represents the minimum and maximum length allowed for Strings. 
 * If the input for minimumLength is lower than 0, then the minimumLength will be set to 0.
 * If the input for maximumLength is lower than 0, then the maximumLength will be set to 0.
 * If minimumLength is greater than maximumLength, the values will be swapped
 */
class StringLengthInterval {
	private var int minimumLength;
	private var int maximumLength;

	new(int minimumLength, int maximumLength) {
		if (minimumLength < 0) {
			this.minimumLength = 0
		} else if (maximumLength < 0) {
			this.maximumLength = 0
		} else if (minimumLength >= maximumLength) {
			this.maximumLength = minimumLength;
			this.minimumLength = maximumLength;
		} else {
			this.maximumLength = maximumLength;
			this.minimumLength = minimumLength;
		}
	}

	def boolean equals(StringLengthInterval interval) {
		if (interval.minimumLength == this.minimumLength && interval.maximumLength == this.maximumLength)
			return true
		return false
	}

	def public int getMinimumLength() {
		return minimumLength;
	}

	def public int getMaximumLength() {
		return maximumLength;
	}

	def public void setLimits(int minimumLength, int maximumLength) {
		if (minimumLength < 0) {
			this.minimumLength = 0
		} else if (maximumLength < 0) {
			this.maximumLength = 0
		} else if (minimumLength >= maximumLength) {
			this.maximumLength = minimumLength;
			this.minimumLength = maximumLength;
		} else {
			this.maximumLength = maximumLength;
			this.minimumLength = minimumLength;
		}
	}
}

abstract class LogicSolverConfiguration {
	public static val Unlimited = -1;
	public static val String UndefinedPath = null

	/** The URI string to the independent solver application */
	public String solverPath = UndefinedPath
	/** Max runtime limit in seconds. */
	public int runtimeLimit = Unlimited
	/** Max runtime limit in seconds. */
	public int memoryLimit = Unlimited

	public var TypeScopes typeScopes = new TypeScopes;
	public var SolutionScope solutionScope = new SolutionScope
}

/**
 * Defines the the size of the generated models. Constant <code>Unlimited</code> defines no upper limit to the type.
 */
public class TypeScopes {
	public static val Unlimited = -1;
	public var boolean ignoreIdDuringGeneration = true

	/**
	 * The domain of integers from which we can choose
	 */
	public var IntegerInterval intervalOfIntegers
	/**
	 * The maximal and minimal length of strings
	 */
	public var StringLengthInterval intervalOfStrings
	/**
	 * A set containing the integers that can be used to solve the problem.
	 */
	public TreeSet<Integer> allIntegers = new TreeSet<Integer> {
		override boolean add(Integer element) {
			if (element < intervalOfIntegers.lowerLimit || element > intervalOfIntegers.upperLimit) {
				return false
			} else {
				return super.add(element)
			}
		}

		override boolean addAll(Collection<? extends Integer> collectionToAdd) {
			var boolean hasBeenModified = false
			for (element : collectionToAdd) {
				hasBeenModified = this.add(element);
			}
			return hasBeenModified
		}

	}

	/**
	 * A set containing the strings that can be used to solve the problem.
	 */
	public TreeSet<String> allStrings = new TreeSet<String> {
		override boolean add(String string) {
			if (string.length < intervalOfStrings.minimumLength || string.length > intervalOfStrings.maximumLength) {
				return false
			} else {
				return super.add(string)
			}
		}

		override boolean addAll(Collection<? extends String> collectionToAdd) {
			var boolean hasBeenModified = false
			for (element : collectionToAdd) {
				if (!(element.length < intervalOfStrings.minimumLength ||
					element.length > intervalOfStrings.maximumLength)) {
					hasBeenModified = super.add(element);
				}
			}
			return hasBeenModified
		}
	}

	/**
	 * A set containing the doubles that can be used to solve the problem.
	 */
	public TreeSet<Double> allDoubles = new TreeSet<Double>
	/**
	 * Sets the number of Strings that has to be used to solve the problem.
	 */
	public var numberOfUseableStrings = Unlimited
	/**
	 * Sets the number of Integers that has to be used to solve the problem.
	 */
	public var numberOfUseableIntegers = Unlimited
	/**
	 * Defines a limit for integers in the logic problem.
	 */
	public var maxIntScope = Unlimited
	/**
	 * Defines the minimal number of newly added elements. Default value is 0.
	 */
	public var minNewElements = 0
	/**
	 * Defines the maximal number of newly added elements. Default value is <code>TypeScopes.Unlimited</code>.
	 */
	public var maxNewElements = Unlimited
}

/**
 * Defines the required number of solutions for the problem.
 * Constant <code>All</code> defines that all solution for the problem is requested.
 */
public class SolutionScope {
	public static val All = -1;
	public var numberOfRequiredSolution = 1
}
