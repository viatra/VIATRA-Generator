package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel
import java.util.Map

interface Logic2VampireLanguageMapper_TypeMapperTrace {}

class Logic2VampireLanguageMapperTrace {
//	public var ViatraQueryEngine incQueryEngine;

	//list of needed VLS components
	public var VampireModel specification
	public var VLSFofFormula logicLanguageBody
	public var VLSTerm formula
//NOT NEEDED	//public var VLSFunction constantDec
	
	public var Logic2VampireLanguageMapper_TypeMapperTrace typeMapperTrace
	
	
//NOT NEEDED  	//public val Map<ConstantDeclaration, VLSFunctionDeclaration> constantDeclaration2LanguageField = new HashMap
	//public val Map<ConstantDefinition, ALSFunctionDefinition> constantDefinition2Function = new HashMap
	
	public var Map<ConstantDeclaration, ConstantDefinition> constantDefinitions
	
	public var Map<RelationDeclaration, RelationDefinition> relationDefinitions
		
}