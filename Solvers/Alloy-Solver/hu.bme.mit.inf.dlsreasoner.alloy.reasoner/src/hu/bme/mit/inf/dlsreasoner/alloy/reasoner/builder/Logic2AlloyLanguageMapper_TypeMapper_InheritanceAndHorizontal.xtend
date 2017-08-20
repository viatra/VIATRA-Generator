package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import java.util.Collection
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map

class Logic2AlloyLanguageMapper_TypeMapperTrace_InheritanceAndHorizontal implements Logic2AlloyLanguageMapper_TypeMapperTrace {
	public var ALSSignatureDeclaration objectSupperClass;
	public val Map<Type, ALSSignatureDeclaration> type2ALSType = new HashMap;
	public val Map<DefinedElement, ALSSignatureDeclaration> definedElement2Declaration = new HashMap
	public val Map<Type, List<ALSSignatureDeclaration>> typeSelection = new HashMap 
}

class Logic2AlloyLanguageMapper_TypeMapper_InheritanceAndHorizontal implements Logic2AlloyLanguageMapper_TypeMapper{
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	
	new() {
		LogicproblemPackage.eINSTANCE.class
	}
	
	override transformTypes(Collection<Type> types, Collection<DefinedElement> elements, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		if(types.exists[hasDefinedSupertype]) {
			throw new UnsupportedOperationException('''Defined supertype is not supported by this type mapping!''')
		} else {
			
			val typeTrace = new Logic2AlloyLanguageMapper_TypeMapperTrace_InheritanceAndHorizontal
			trace.typeMapperTrace = typeTrace
			
			// 1. A global type for Objects is created
			val objectSig = createALSSignatureDeclaration => [it.name = support.toID(#["util","Object"])]
			val objectBody = createALSSignatureBody => [
				it.declarations += objectSig
				it.abstract = true
			]
			typeTrace.objectSupperClass = objectSig
			trace.specification.signatureBodies += objectBody
			
			// 2. Each type is mapped to a unique sig
			for(type : types) {
				val sig = createALSSignatureDeclaration => [it.name = support.toIDMultiple("type",type.name)]
				val body = createALSSignatureBody => [it.declarations += sig]
				body.abstract = type.isIsAbstract || (type instanceof TypeDefinition)
				
				trace.specification.signatureBodies += body
				typeTrace.type2ALSType.put(type,sig)
				
				if(type instanceof TypeDefinition) {
					val elementContainer = createALSSignatureBody => [it.multiplicity = ALSMultiplicity::ONE it.supertype = sig]
					for(element : type.elements) {
						val signature = createALSSignatureDeclaration => [it.name = support.toIDMultiple("element",element.name)]
						elementContainer.declarations += signature
						
					}
					trace.specification.signatureBodies += elementContainer
				}
				
				typeTrace.typeSelection.put(type,new LinkedList()=>[add(sig)])
			}
			
			// 6. Each inheritance is modeled by extend keyword
			for(type : types) {
				if(type.supertypes.size == 1) {
					val alsType = typeTrace.type2ALSType.get(type.supertypes.head)
					(type.eContainer as ALSSignatureBody).supertype = alsType
				} else if(type.supertypes.size > 1){
					val alsMainType = typeTrace.type2ALSType.get(type.supertypes.head)
					(type.eContainer as ALSSignatureBody).supertype = alsMainType
					for(otherType : type.supertypes.filter[it != alsMainType]) {
						typeTrace.typeSelection.get(otherType).add(typeTrace.type2ALSType.get(otherType))
					}
				}
			}
				
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
	
	def getTypeTrace(Logic2AlloyLanguageMapperTrace trace) {
		val res = trace.typeMapperTrace
		if(res instanceof Logic2AlloyLanguageMapper_TypeMapperTrace_InheritanceAndHorizontal) {
			return res
		} else {
			throw new IllegalArgumentException('''
			Expected type mapping trace: «Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes.name»,
			but found «res.class.name»''')
		}
	}
	
	override transformTypeReference(Type referred, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		trace.typeTrace.typeSelection.get(referred)
	}
	
	override getUndefinedSupertype(Logic2AlloyLanguageMapperTrace trace) {
		trace.typeTrace.objectSupperClass
	}
	
	override transformReference(DefinedElement referred, Logic2AlloyLanguageMapperTrace trace) {
		createALSReference => [it.referred = trace.typeTrace.definedElement2Declaration.get(referred)]
	}
	
	override getUndefinedSupertypeScope(int undefinedScope, Logic2AlloyLanguageMapperTrace trace) {
		return undefinedScope + trace.typeTrace.definedElement2Declaration.size
	}
}