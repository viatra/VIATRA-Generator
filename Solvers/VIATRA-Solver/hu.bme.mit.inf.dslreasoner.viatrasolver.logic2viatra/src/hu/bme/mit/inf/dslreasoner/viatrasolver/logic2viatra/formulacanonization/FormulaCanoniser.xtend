package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.formulacanonization

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import java.util.List
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable

/**
 * Translates a Terms into format
 * <P(x1,...,xn)> := Bodies(x1,...,xn)
 * <Bodies(x1,...,xn)> := <Body(x1,...,xn)> | <Body(x1,...,xn)> or <Bodies(x1,...,xn)>
 * <Body(x1,...,xn)> := Exists y1,...,ym : <Constraints(x1,...,xn,y1,....,ym)>
 * <Constraints(x1,...,xn)> := Constraint(x1,...xn) | Constraint(x1,...,xn) and <Constraints(x1,...,xn)>   
 */
class FormulaCanoniser {
//	def canonise(
//		List<Assertion> assertions,
//		List<RelationDefinition> relations)
//	{
//		
//	}
//	
//	
//	def canoniseToConstraintBlock(Term predicate, List<Variable> variables) {
//		val 
//	}
//	
//	def freeVariables(Term t) {
//		val subterms = #[t]+t.eAllContents.toList
//		val variables = subterms.filter(Variable).toSet
//		val variableReferences = subterms.filter(SymbolicValue).filter[it.symbolicReference instanceof Variable]
//		val freeVariables = variableReferences.filter[!variables.contains(it.symbolicReference)]
//		return freeVariables.map
//	}
}