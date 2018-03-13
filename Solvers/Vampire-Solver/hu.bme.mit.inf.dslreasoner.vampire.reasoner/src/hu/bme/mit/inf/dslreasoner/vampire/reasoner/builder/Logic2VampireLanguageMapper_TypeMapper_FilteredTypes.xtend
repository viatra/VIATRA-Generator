package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import java.util.Collection
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage

class Logic2VampireLanguageMapper_TypeMapper_FilteredTypes implements Logic2VampireLanguageMapper_TypeMapper {
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	
	new() {
		LogicproblemPackage.eINSTANCE.class
	}
	
	
	override transformTypes(Collection<Type> types, Collection<DefinedElement> elements, Logic2VampireLanguageMapper mapper, Logic2VampireLanguageMapperTrace trace) {
		val typeTrace = new Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes
		trace.typeMapperTrace = typeTrace
	
		//0. Create base of fof
		
		
		//1. Map each type to fof formula
		for(type : types) {
			val res = createVLSFofFormula => [
			it.name = support.toIDMultiple("type", type.name)
			//below is temporary solution
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				it.variables += createVLSVariable => [ it.name = "A" ]
				it.operand = createVLSImplies => [
					it.left = createVLSFunction => [it.constant = support.toIDMultiple("type", type.name)]
					it.right = 
				]
			]
			
			}
			//it.annotation = nothing			
		]
			
		}
		
		trace.specification.formulas += res
		//2. Map elements of a defined type to a fof formula
		
		//val elementMatcher = TypeQueries.instance
		
		
	}
	
	
	
	
	
	
	override transformTypeReference(Type referred, Logic2VampireLanguageMapper mapper, Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getUndefinedSupertype(Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getUndefinedSupertypeScope(int undefinedScope, Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override transformReference(DefinedElement referred, Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getTypeInterpreter() {
		return new VampireModel
	}
	
}