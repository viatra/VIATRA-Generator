package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.formulacanonization

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import java.util.List

/**
 * Translates a set of assertions and definitions to viatra patterns.
 */
class FormulaCanoniser {
	def canonise(
		List<Assertion> assertions,
		List<RelationDefinition> relations,
		List<ConstantDefinition> constants,
		List<FunctionDefinition> functions)
	{
		
	}
}