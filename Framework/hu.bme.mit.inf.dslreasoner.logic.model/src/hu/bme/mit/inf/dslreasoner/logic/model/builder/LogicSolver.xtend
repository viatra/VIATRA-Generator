package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace

abstract class LogicReasoner {
	def abstract LogicResult solve(
		LogicProblem problem,
		LogicSolverConfiguration configuration,
		ReasonerWorkspace workspace) throws LogicReasonerException
	def abstract LogicModelInterpretation getInterpretation(ModelResult modelResult)
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

public class TypeScopes{
	public static val Unlimited = -1;
	public var maxIntScope = Unlimited
	public var minNewElements = 0
	public var maxNewElements = Unlimited
}

public class SolutionScope{
	public static val Unlimited = -1;
	public var numberOfRequiredSolution = 1
}