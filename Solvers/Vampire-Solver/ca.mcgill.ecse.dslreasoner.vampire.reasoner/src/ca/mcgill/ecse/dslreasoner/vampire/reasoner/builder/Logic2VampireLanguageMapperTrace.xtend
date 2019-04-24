package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import java.util.HashMap
import java.util.List
import java.util.Map

interface Logic2VampireLanguageMapper_TypeMapperTrace {}

class Logic2VampireLanguageMapperTrace {
//	public var ViatraQueryEngine incQueryEngine;

	//list of needed VLS components
	public var VampireModel specification
	public var VLSFofFormula logicLanguageBody
	public var VLSTerm formula
	
	//Necessary containers
	public var Logic2VampireLanguageMapper_TypeMapperTrace typeMapperTrace
	
	public var Map<DefinedElement, String> definedElement2String = new HashMap
	public var topLvlElementIsInInitialModel = null
	
	public val Map<Type, VLSFunction> type2Predicate = new HashMap;
	public val Map<DefinedElement, VLSFunction> element2Predicate = new HashMap
	public val Map<Type, VLSTerm> type2PossibleNot = new HashMap
	public val Map<Type, VLSTerm> type2And = new HashMap
	//Uniqueness
	public val List<VLSConstant> uniqueInstances = newArrayList
	
	
	public var Map<ConstantDeclaration, ConstantDefinition> constantDefinitions
	public var Map<RelationDeclaration, RelationDefinition> relationDefinitions
	public var Map<RelationDeclaration, VLSFunction> rel2Predicate = new HashMap
	
	
//NOT NEEDED	//public var VLSFunction constantDec
	
	
	
	
//NOT NEEDED  	//public val Map<ConstantDeclaration, VLSFunctionDeclaration> constantDeclaration2LanguageField = new HashMap
	//public val Map<ConstantDefinition, ALSFunctionDefinition> constantDefinition2Function = new HashMap
	
	
	public val Map<Variable, VLSVariable> relationVar2VLS = new HashMap
	public val Map<Variable, VLSFunction> relationVar2TypeDec = new HashMap
		
}