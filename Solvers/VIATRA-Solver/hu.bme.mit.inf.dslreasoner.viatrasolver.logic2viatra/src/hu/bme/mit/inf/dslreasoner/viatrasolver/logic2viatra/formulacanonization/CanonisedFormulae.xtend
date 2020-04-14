package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.formulacanonization

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import java.util.Map
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import org.eclipse.xtend.lib.annotations.Data

@Data
class CanonisedFormulae {
	CharSequence viatraCode
	Map<Assertion,String> assertion2ConstraintPattern
	Map<RelationDefinition,String> relation2ValuePattern
}