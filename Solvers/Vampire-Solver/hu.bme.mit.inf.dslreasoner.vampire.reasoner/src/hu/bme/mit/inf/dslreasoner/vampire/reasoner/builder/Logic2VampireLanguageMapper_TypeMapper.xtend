package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import java.util.Collection
import java.util.List
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm

interface Logic2VampireLanguageMapper_TypeMapper {
	def void transformTypes(Collection<Type> types, Collection<DefinedElement> elements, Logic2VampireLanguageMapper mapper, Logic2VampireLanguageMapperTrace trace);
	//samples below 2 lines
	def List<VLSTerm> transformTypeReference(Type referred, Logic2VampireLanguageMapper mapper, Logic2VampireLanguageMapperTrace trace)
	def VLSTerm getUndefinedSupertype(Logic2VampireLanguageMapperTrace trace)
	
	def int getUndefinedSupertypeScope(int undefinedScope,Logic2VampireLanguageMapperTrace trace)
	def VLSTerm transformReference(DefinedElement referred,Logic2VampireLanguageMapperTrace trace)
	
	def VampireModelInterpretation_TypeInterpretation getTypeInterpreter()
}