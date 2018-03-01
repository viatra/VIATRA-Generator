package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory

class Logic2VampireLanguageMapper_Support {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	
	// ID Handler
	def protected String toIDMultiple(String... ids) {
		ids.map[it.split("\\s+").join("'")].join("'")
	}
	
	def protected  String toID(String ids) {
		ids.split("\\s+").join("'")
	}
	/*
	def protected  String toID(List<String> ids) {
		ids.map[it.split("\\s+").join("'")].join("'")
	}
	*/
	
	// Support Functions
	
	
	
}