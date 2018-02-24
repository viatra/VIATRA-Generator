package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.List
import java.util.TreeSet
import java.util.SortedSet
import java.math.BigDecimal
import java.util.HashMap
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import java.util.Map

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

abstract class LogicSolverConfiguration {
	public static val Unlimited = -1;
	public static val String UndefinedPath = null

	/** The URI string to the independent solver application */
	public String solverPath = UndefinedPath
	/** Max runtime limit in seconds. */
	public int runtimeLimit = Unlimited
	/** Max runtime limit in seconds. */
	public int memoryLimit = Unlimited
	/** Documentation level of the solver. */
	public DocumentationLevel documentationLevel = DocumentationLevel::NONE

	public var TypeScopes typeScopes = new TypeScopes;
	public var SolutionScope solutionScope = new SolutionScope
}

/**
 * Describes the amount of debug information required to write to the workspace.
 * 
 */
public enum DocumentationLevel {
	/**
	 * The solver writes only temporary files.
	 */
	NONE,
	/**
	 * The solver is requested to write important artifacts and documents that are constructed during the generation.
	 * This option should not affect the performance of the solver seriously. 
	 */
	NORMAL,
	/**
	 * The solver is requested create additional documents to aid troubleshooting.
	 * The documents can constructed at the cost of performance.
	 */
	FULL
}

/**
 * Defines the the size of the generated models. Constant <code>Unlimited</code> defines no upper limit to the type.
 */
public class TypeScopes {
	public static val Unlimited = -1;
	
	/**
	 * Sets the Integers that are already in the scope of the problem.
	 */
	public var SortedSet<Integer> knownIntegers = new TreeSet
	/**
	 * Sets the number of Integers that has to be used to solve the problem.
	 */
	public var minNewIntegers = 0
	public var maxNewIntegers = Unlimited
	
	public var SortedSet<BigDecimal> knownReals = new TreeSet
	/**
	 * Sets the number of Reals that has to be used to solve the problem.
	 */
	public var minNewReals = 0
	public var maxNewReals = Unlimited
	
	public var SortedSet<String> knownStrings = new TreeSet
	/**
	 * Sets the number of Strings that has to be used to solve the problem.
	 */
	public var minNewStrings = 0
	public var maxNewStrings = Unlimited
	
	/**
	 * Defines the minimal number of newly added elements. Default value is 0.
	 */
	public var minNewElements = 0
	/**
	 * Defines the maximal number of newly added elements. Default value is <code>TypeScopes.Unlimited</code>.
	 */
	public var maxNewElements = Unlimited
	/**
	 * 
	 */
	public var Map<Type,Integer> minNewElementsByType = new HashMap	
	/**
	 * 
	 */
	public var Map<Type,Integer> maxNewElementsByType = new HashMap
}

/**
 * Defines the required number of solutions for the problem.
 * Constant <code>All</code> defines that all solution for the problem is requested.
 */
public class SolutionScope {
	public static val All = -1;
	public var numberOfRequiredSolution = 1
}
