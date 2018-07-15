package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.math.BigDecimal
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.SortedSet
import java.util.TreeSet
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0
import java.util.LinkedList

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
	/** Progress monitor for the solver to
	 * <li>(optionally) report progress via {@link progressMonitor.worked}</li>
 	 * <li>(optionally) inform about cancellation request via {@link progressMonitor.isCancelled}
 	 *     or via a listener registered by {@link progressMonitor.addCancelListener}</li>
	 */
	public SolverProgressMonitor progressMonitor = new NullSolverProgressMonitor

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
	public static val Unlimited = Integer.MAX_VALUE;
	
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
	
	/**
	 * Checks if the scope contains negative elements
	 */
	def public validateTypeScopes(TypeScopes scopes) {
		val res = new LinkedList<String>
		if(scopes.maxNewElements < 0) {
			res += '''Inconsistent scope: Maximal number of new elements is negative.'''
		}
		if(scopes.maxNewIntegers < 0) {
			res += '''Inconsistent scope: Maximal number of new integer values is negative.'''
		}
		if(scopes.maxNewReals < 0) {
			res += '''Inconsistent scope: Maximal number of new real values is negative.'''
		}
		if(scopes.maxNewStrings < 0) {
			res += '''Inconsistent scope: Maximal number of new string values is negative.'''
		}
		for(x : scopes.minNewElementsByType.entrySet) {
			if(x.value < 0) {
				res += '''Inconsistent scope: Maximal number of new "«x.key.name»" elements is negative.'''
			}
		}
		return res
	}
}

/**
 * Defines the required number of solutions for the problem.
 * Constant <code>All</code> defines that all solution for the problem is requested.
 */
public class SolutionScope {
	public static val All = Integer.MAX_VALUE;
	public var numberOfRequiredSolution = 1
}
/** Progress monitor class for a solver to
 * <li>(optionally) report progress via {@link worked}</li>
 * <li>(optionally) inform about cancellation request via {@link isCancelled}
 *     or via a listener registered by {@link addCancelListener}</li>
 */
public abstract class SolverProgressMonitor {
	protected var volatile cancelled = false
	protected var progress = 0.0
	
	/**
	 * Method to report progress, e.g. finishing translation or founding one of the model.
	 * The sum of all {@link amount} should be 1.0, which is reached when all model is generated.
	 * By default,
	 * forward transformation should take 0.1 work unit (implemented in {@link#workedForwardTransformation}),
	 * founding all solution 0.8 (implemented in {@link#workedModelFound})
	 * and backward transformation 0.1 again (implemented in {@link#workedBackwardTransformation}).
	 */
	def public void worked(double amount) {
		progress+=amount
		processWorked(amount)
	}
	def public void workedForwardTransformation() {worked(0.1)}
	def public void workedModelFound(int numberOfRequestedModels) {
		if(numberOfRequestedModels > 0) {
			worked(0.8/numberOfRequestedModels)
		}
	}
	def public void workedSearchFinished() { worked(0.1+0.8-progress) }
	def public void workedBackwardTransformation(int numberOfFoundModels) {worked(0.1/numberOfFoundModels)}
	def public void workedBackwardTransformationFinished() { worked(1.0-progress) }
	protected def void processWorked(double amount)
	
	/**
	 * Requesting the solver to stop with the solutions already found.
	 * It is not guaranteed however that the solver finishes.
	 */
	def public void cancel() {
		cancelled = true
	}
	def public boolean isCancelled() {
		cancelled
	}
}
public class NullSolverProgressMonitor extends SolverProgressMonitor {
	override protected processWorked(double amount) { throw new UnsupportedOperationException("TODO: auto-generated method stub") }
}
