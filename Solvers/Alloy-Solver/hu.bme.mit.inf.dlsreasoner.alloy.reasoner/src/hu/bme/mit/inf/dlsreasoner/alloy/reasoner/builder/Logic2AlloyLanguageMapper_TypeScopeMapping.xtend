<<<<<<< HEAD
package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory

interface Logic2AlloyLanguageMapper_TypeScopeMapping {
	def void addLowerMultiplicity(ALSDocument document, Type type, int lowerMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace)
	def void addUpperMultiplicity(ALSDocument document, Type type, int upperMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace)
}

class Logic2AlloyLanguageMapper_AsConstraint implements Logic2AlloyLanguageMapper_TypeScopeMapping {
	val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper_TypeMapper typeMapper
	
	new(Logic2AlloyLanguageMapper_TypeMapper mapper) {
		this.typeMapper = mapper
	}
	
	override addLowerMultiplicity(ALSDocument document, Type type, int lowerMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		document.factDeclarations += createALSFactDeclaration => [
			it.name = support.toID(#["LowerMultiplicity",support.toID(type.name),lowerMultiplicty.toString])
			it.term = createALSLeq => [
				it.leftOperand = createALSCardinality => [
					it.operand =  support.unfoldPlus(typeMapper.transformTypeReference(type,mapper,trace).map[t|createALSReference => [it.referred = t]].toList)
				]
				it.rightOperand = createALSNumberLiteral => [it.value = lowerMultiplicty]
			]
		]
	}
	
	override addUpperMultiplicity(ALSDocument document, Type type, int upperMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		document.factDeclarations += createALSFactDeclaration => [
			it.name = support.toID(#["UpperMultiplicity",support.toID(type.name),upperMultiplicty.toString])
			it.term = createALSMeq => [
				it.leftOperand = createALSCardinality => [
					it.operand =  support.unfoldPlus(typeMapper.transformTypeReference(type,mapper,trace).map[t|createALSReference => [it.referred = t]].toList)
				]
				it.rightOperand = createALSNumberLiteral => [it.value = upperMultiplicty]
			]
		]
	}
=======
package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory

interface Logic2AlloyLanguageMapper_TypeScopeMapping {
	def void addLowerMultiplicity(ALSDocument document, Type type, int lowerMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace)
	def void addUpperMultiplicity(ALSDocument document, Type type, int upperMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace)
}

class Logic2AlloyLanguageMapper_AsConstraint implements Logic2AlloyLanguageMapper_TypeScopeMapping {
	val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper_TypeMapper typeMapper
	
	new(Logic2AlloyLanguageMapper_TypeMapper mapper) {
		this.typeMapper = mapper
	}
	
	override addLowerMultiplicity(ALSDocument document, Type type, int lowerMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		document.factDeclarations += createALSFactDeclaration => [
			it.name = support.toID(#["LowerMultiplicity",support.toID(type.name),lowerMultiplicty.toString])
			it.term = createALSLeq => [
				it.leftOperand = createALSCardinality => [
					it.operand =  support.unfoldPlus(typeMapper.transformTypeReference(type,mapper,trace).map[t|createALSReference => [it.referred = t]].toList)
				]
				it.rightOperand = createALSNumberLiteral => [it.value = lowerMultiplicty]
			]
		]
	}
	
	override addUpperMultiplicity(ALSDocument document, Type type, int upperMultiplicty, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		document.factDeclarations += createALSFactDeclaration => [
			it.name = support.toID(#["UpperMultiplicity",support.toID(type.name),upperMultiplicty.toString])
			it.term = createALSMeq => [
				it.leftOperand = createALSCardinality => [
					it.operand =  support.unfoldPlus(typeMapper.transformTypeReference(type,mapper,trace).map[t|createALSReference => [it.referred = t]].toList)
				]
				it.rightOperand = createALSNumberLiteral => [it.value = upperMultiplicty]
			]
		]
	}
>>>>>>> 25a4b1b5... VAMPIRE: post-submission push
}