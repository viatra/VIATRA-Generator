package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory

class Logic2VampireLanguageMapper_ConstantMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val Logic2VampireLanguageMapper base
	
	public new(Logic2VampireLanguageMapper base) {
		this.base = base
	}
	
//NOT NEEDED
//	def protected dispatch transformConstant(ConstantDeclaration constant, Logic2VampireLanguageMapperTrace trace) {
//		val c = createVLSFunctionDeclaration=> [
//			it.name = support.toID(constant.name)
//		]
//		trace.constantDec.constant = c
//		trace.constantDeclaration2LanguageField.put(constant, c);
//		
//	}
	
//NOT Used In Sample	
	def protected dispatch transformConstant(ConstantDefinition constant, Logic2VampireLanguageMapperTrace trace) {
		error
		//TODO
//		val c = createVLSFofFormula=> [
//			name = support.toID(constant.name)
//			fofRole = "axiom"
//			fofFormula = base.transformTypeReference()
//		]
	}
	
	def protected transformConstantDefinitionSpecification(ConstantDefinition constant, Logic2VampireLanguageMapperTrace trace) {
		//TODO
	}
	
	
}