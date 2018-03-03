package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunction
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel
import java.util.HashMap
import java.util.Map
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunctionDeclaration

interface Logic2VampireLanguageMapper_TypeMapperTrace {}

class Logic2VampireLanguageMapperTrace {
//	public var ViatraQueryEngine incQueryEngine;

	//list of needed VLS components
	public var VampireModel specification
	public var VLSFofFormula logicLanguageBody
	public var VLSTerm formula
//NOT NEEDED	//public var VLSFunction constantDec
	
	
//NOT NEEDED  	//public val Map<ConstantDeclaration, VLSFunctionDeclaration> constantDeclaration2LanguageField = new HashMap
	//public val Map<ConstantDefinition, ALSFunctionDefinition> constantDefinition2Function = new HashMap
	
	public var Map<ConstantDeclaration, ConstantDefinition> constantDefinitions
		
}