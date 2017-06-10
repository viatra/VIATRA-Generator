package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTypeReference
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.xbase.lib.Functions.Function1

interface Logic2Smt_TypeMapper {
	def void transformTypes(
		SMTInput document, LogicProblem problem, Logic2SmtMapperTrace trace, TypeScopes scopes)
		
	def List<TypeConstraint> transformTypeReference(Type type, Logic2SmtMapperTrace trace)
	def TransformedSubterm transformSymbolicReference(DefinedElement referred, Logic2SmtMapperTrace trace)
	def Logic2SMT_TypeMapperInterpretation getTypeInterpretation(LogicProblem problem,SMTDocument document,SmtModelInterpretation interpretation, Logic2SmtMapperTrace trace)
}

@Data
class TypeConstraint {
	SMTTypeReference type
	Function1<SMTSortedVariable,SMTTerm> constraint
	
	def public copy() {
		return new TypeConstraint(EcoreUtil.copy(this.type),this.constraint)
	}
}

interface Logic2Smt_TypeMapperTrace{
	def Logic2Smt_TypeMapperTrace copy(SMTInput newModel)
}