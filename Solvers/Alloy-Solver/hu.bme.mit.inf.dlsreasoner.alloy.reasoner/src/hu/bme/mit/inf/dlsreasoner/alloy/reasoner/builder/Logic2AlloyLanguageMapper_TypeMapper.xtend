package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import java.util.Collection
import java.util.List

interface Logic2AlloyLanguageMapper_TypeMapper {
	def void transformTypes(Collection<Type> types, Collection<DefinedElement> elements, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace);
	def List<ALSSignatureDeclaration> transformTypeReference(Type referred, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace)
	def ALSSignatureDeclaration getUndefinedSupertype(Logic2AlloyLanguageMapperTrace trace)
	def int getUndefinedSupertypeScope(int undefinedScope,Logic2AlloyLanguageMapperTrace trace)
	def ALSTerm transformReference(DefinedElement referred,Logic2AlloyLanguageMapperTrace trace)
	
	def AlloyModelInterpretation_TypeInterpretation getTypeInterpreter()
}
