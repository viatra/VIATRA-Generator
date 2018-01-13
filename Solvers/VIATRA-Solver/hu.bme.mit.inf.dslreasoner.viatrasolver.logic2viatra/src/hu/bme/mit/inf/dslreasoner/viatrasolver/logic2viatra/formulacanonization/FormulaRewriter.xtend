package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.formulacanonization

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import org.eclipse.emf.ecore.util.EcoreUtil
import java.util.LinkedList
import java.util.List
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import org.eclipse.xtend.lib.annotations.Data


@Data
class Clause {
	List<Term> atomicExpressions
}

/**
 * Rewrites a term to a first order CNF, where F
 * <p><table>
 * <tr><th>Symbol</th><th>-></th><th>expression</th></tr>
 * <tr><td>F</td><td>-></td><td>Quantified (∨ Quantified)*</td></tr>
 * <tr><td>Quantified</td><td>-></td><td>(∃x Quantified) | Clause</td></tr>
 * <tr><td>Clause</td><td>-></td><td> Atomic (∧ Atomic)* </td></tr>
 * <tr><td>Atomic</td><td>-></td><td> Type(x) | Path (x,y) | x==y | x!=y | F | ¬F </td></tr>
 * </table></p>
 */
class FormulaRewriter {
	public def rewriteExpression(Term expression) {
		val termToRewrite = EcoreUtil.copy(expression
		)
	}
	
	public def internalRewriteExpression(Term expression) {
		val List<Variable> quantifiedVariables = new LinkedList
		val List<Clause> clauses = new LinkedList
	}
}