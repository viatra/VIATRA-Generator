package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import java.util.HashMap
import java.util.List
import java.util.Map

class Logic2VampireLanguageMapper_Support {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	
	// ID Handler
	def protected String toIDMultiple(String... ids) {
		ids.map[it.split("\\s+").join("'")].join("'")
	}
	
	def protected  String toID(String ids) {
		ids.split("\\s+").join("'")
	}
	
	//Support Functions
	
	//booleans
	
	
	
	
	
	
	
	
	
	
	//AND and OR
	
	def protected VLSTerm unfoldAnd(List<? extends VLSTerm> operands) {
		if(operands.size == 1) { return operands.head }
		else if(operands.size > 1) { return createVLSAnd=>[
			left=operands.head
			right=operands.subList(1,operands.size).unfoldAnd
		]}
		else throw new UnsupportedOperationException('''Logic operator with 0 operands!''')		
	}
	
	def protected VLSTerm unfoldOr(List<? extends VLSTerm> operands, Logic2VampireLanguageMapperTrace trace) {
		
//		if(operands.size == 0) {basically return true}
		/*else*/if(operands.size == 1) { return operands.head }
		else if(operands.size > 1) { return createVLSOr=>[
			left=operands.head
			right=unfoldOr(operands.subList(1,operands.size),trace)
		]}	
		else throw new UnsupportedOperationException('''Logic operator with 0 operands!''')	//TEMP
	}
	
	//Symbolic
	
	//	def postprocessResultOfSymbolicReference(TypeReference type, VLSTerm term, Logic2VampireLanguageMapperTrace trace) {
//		if(type instanceof BoolTypeReference) {
//			return booleanToLogicValue(term ,trace)
//		}
//		else return term
//	}
	
//	def booleanToLogicValue(VLSTerm term, Logic2VampireLanguageMapperTrace trace) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
//	}
	
	/*
	def protected  String toID(List<String> ids) {
		ids.map[it.split("\\s+").join("'")].join("'")
	}
	*/
	
	
	
	
	
	//QUANTIFIERS + VARIABLES
	
	def protected VLSTerm createUniversallQuantifiedExpression(Logic2VampireLanguageMapper mapper, QuantifiedExpression expression, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		val variableMap = expression.quantifiedVariables.toInvertedMap[v | createVLSVariable => [
			it.name = toID(v.name) ]]
				
		createVLSUniversalQuantifier => [
			it.variables += variableMap.values
			it.operand = mapper.transformTerm(expression.expression, trace, variables.withAddition(variableMap))
		]		
	}
	
	
	def protected VLSTerm createExistentiallyQuantifiedExpression(Logic2VampireLanguageMapper mapper, QuantifiedExpression expression, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		val variableMap = expression.quantifiedVariables.toInvertedMap[v | createVLSVariable => [
			it.name = toID(v.name) ]]
				
		createVLSExistentialQuantifier => [
			it.variables += variableMap.values
			it.operand = mapper.transformTerm(expression.expression, trace, variables.withAddition(variableMap))
		]	
	}
	
	def protected withAddition(Map<Variable, VLSVariable> map1, Map<Variable, VLSVariable> map2) {
		new HashMap(map1) => [putAll(map2)]
	}
	
	
	

		
	
}