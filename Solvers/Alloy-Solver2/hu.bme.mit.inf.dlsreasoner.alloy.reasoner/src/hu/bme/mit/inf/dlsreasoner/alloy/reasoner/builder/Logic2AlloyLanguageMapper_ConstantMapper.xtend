package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2AlloyLanguageMapper_ConstantMapper {
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper base;
	public new(Logic2AlloyLanguageMapper base) {
		this.base = base
	}
	
	def protected dispatch transformConstant(ConstantDeclaration constant, Logic2AlloyLanguageMapperTrace trace) {
		if(!trace.constantDefinitions.containsKey(constant)) {
			val c = createALSFieldDeclaration=> [
				name = support.toID(constant.name)
				it.type = base.transformTypeReference(constant.type,trace)
				it.multiplicity = ALSMultiplicity.ONE
			]
			trace.logicLanguageBody.fields+= c
			trace.constantDeclaration2LanguageField.put(constant,c)
		}
	}
	
	def protected dispatch transformConstant(ConstantDefinition constant, Logic2AlloyLanguageMapperTrace trace) {
		val c = createALSFunctionDefinition=> [
			name = support.toID(constant.name)
			it.type = base.transformTypeReference(constant.type,trace)
			// the value is set later
		]
		trace.specification.functionDefinitions += c
		trace.constantDefinition2Function.put(constant,c)
	}
	
	def protected transformConstantDefinitionSpecification(ConstantDefinition constant, Logic2AlloyLanguageMapperTrace trace) {
		val definition = constant.lookup(trace.constantDefinition2Function)
		definition.value = base.transformTerm(constant.value, trace,emptyMap)
	}
}