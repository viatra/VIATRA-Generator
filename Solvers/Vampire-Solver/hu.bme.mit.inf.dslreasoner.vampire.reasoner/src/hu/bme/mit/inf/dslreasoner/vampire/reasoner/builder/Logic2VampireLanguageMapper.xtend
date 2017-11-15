package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference

class Logic2VampireLanguageMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support;
	
	
	
	
	
	//////////
	//Type Reference
	/////////
	def dispatch protected VLSTerm transformTypeReference(BoolTypeReference boolTypeReference, Logic2VampireLanguageMapperTrace trace) {
		return
	}
	
	
}