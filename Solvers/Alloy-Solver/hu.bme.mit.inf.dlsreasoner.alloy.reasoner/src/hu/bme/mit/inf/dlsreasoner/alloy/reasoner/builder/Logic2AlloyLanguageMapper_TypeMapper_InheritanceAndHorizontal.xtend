package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.HashMap
import java.util.Map
import java.util.Collection

class Logic2AlloyLanguageMapper_TypeMapperTrace_InheritanceAndHorizontal implements Logic2AlloyLanguageMapper_TypeMapperTrace {
	val Map<TypeDeclaration,ALSSignatureDeclaration> newElementTypes = new HashMap
	val Map<Type,ALSSignatureDeclaration> definedElementTypes = new HashMap
	var ALSSignatureDeclaration undefinedSupertype
	var ALSSignatureDeclaration definedSupertype
}

class Logic2AlloyLanguageMapper_TypeMapper_InheritanceAndHorizontal implements Logic2AlloyLanguageMapper_TypeMapper{
	
	override transformTypes(Collection<Type> types, Collection<DefinedElement> elements, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	private def boolean hasDefinedSupertype(Type type) {
		if(type instanceof TypeDefinition) {
			return true
		} else {
			if(type.supertypes.empty) return false
			else return type.supertypes.exists[it.hasDefinedSupertype]
		}
	}	
	
	override transformTypeReference(Type referred, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getUndefinedSupertype(Logic2AlloyLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override transformReference(DefinedElement referred, Logic2AlloyLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getUndefinedSupertypeScope(int undefinedScope, Logic2AlloyLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}