package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import java.util.List
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition

class Logic2Smt_TypeMapperTrace_Horizontal implements Logic2Smt_TypeMapperTrace{
	
	override copy(SMTInput newModel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}

class Logic2Smt_TypeMapper_Horizontal implements Logic2Smt_TypeMapper {
	val extension SmtLanguageFactory factory = SmtLanguageFactory.eINSTANCE
	
	private def toID(List<String> names) {names.join("!") }
	
	override transformTypes(SMTInput document, LogicProblem problem, Logic2SmtMapperTrace trace, TypeScopes scopes) {
		val typeTrace = new Logic2Smt_TypeMapperTrace_Horizontal
		trace.typeMapperTrace = typeTrace
		
		// mapping of known elements
		
	}
	
	private def Logic2Smt_TypeMapperTrace_Horizontal getTypeTrace(Logic2SmtMapperTrace trace) {
		val typeTrace = trace.typeMapperTrace
		if(typeTrace instanceof Logic2Smt_TypeMapperTrace_Horizontal) {
			return typeTrace
		} else {
			throw new IllegalArgumentException('''Unknown trace type: «typeTrace.class.name»''')
		}
	}
	
	private def boolean hasDefinedSupertype(Type type) {
		if(type instanceof TypeDefinition) {
			return true
		} else {
			if(type.supertypes.empty) return false
			else return type.supertypes.exists[it.hasDefinedSupertype]
		}
	}
	
	override transformTypeReference(Type type, Logic2SmtMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override transformSymbolicReference(DefinedElement referred, Logic2SmtMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getTypeInterpretation(LogicProblem problem, SMTDocument document, SmtModelInterpretation interpretation, Logic2SmtMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}