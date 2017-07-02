package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.List

abstract class LogicReasoner {
	def abstract LogicResult solve(
		LogicProblem problem,
		LogicSolverConfiguration configuration,
		ReasonerWorkspace workspace) throws LogicReasonerException
	def abstract List<? extends LogicModelInterpretation> getInterpretations(ModelResult modelResult)
}

public class LogicReasonerException extends Exception {
	new(String message, Exception cause) { super(message,cause) }
	new(Exception cause) { super("The reasoner has failed",cause)}
	new(String message) { super(message) }
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
public class TypeScopes{
	public static val Unlimited = -1;
	
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
public class SolutionScope{
	public static val All = -1;
	public var numberOfRequiredSolution = 1
}