package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumLiteral
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import java.util.HashMap
import java.util.Map
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

interface Logic2AlloyLanguageMapper_TypeMapperTrace {}

class Logic2AlloyLanguageMapperTrace {
	public var ViatraQueryEngine incqueryEngine;
	
	public var ALSDocument specification;
	public var ALSSignatureDeclaration logicLanguage;
	public var ALSSignatureBody logicLanguageBody;
	public var ALSEnumDeclaration boolType;
	public var ALSEnumLiteral boolTrue;
	public var ALSEnumLiteral boolFalse;
	
	public var Logic2AlloyLanguageMapper_TypeMapperTrace typeMapperTrace 
	
	public val Map<ConstantDeclaration, ALSFieldDeclaration> constantDeclaration2LanguageField = new HashMap
	public val Map<ConstantDefinition, ALSFunctionDefinition> constantDefinition2Function = new HashMap
	
	public val Map<FunctionDeclaration,ALSFieldDeclaration> functionDeclaration2HostedField = new HashMap
	public val Map<FunctionDeclaration,ALSFieldDeclaration> functionDeclaration2LanguageField = new HashMap
	public val Map<FunctionDefinition,ALSFunctionDefinition> functionDefinition2Function = new HashMap
	
	public val Map<RelationDeclaration,ALSFieldDeclaration> relationDeclaration2Global = new HashMap
	public val Map<RelationDeclaration, ALSFieldDeclaration> relationDeclaration2Field = new HashMap
	public val Map<RelationDefinition,ALSRelationDefinition> relationDefinition2Predicate = new HashMap
	
	public var Map<ConstantDeclaration, ConstantDefinition> constantDefinitions
	public var Map<FunctionDeclaration, FunctionDefinition> functionDefinitions
	public var Map<RelationDeclaration, RelationDefinition> relationDefinitions
}