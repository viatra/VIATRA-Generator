package hu.bme.mit.inf.dslreasoner.smt.reasoner.builder

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMinus
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm
import java.util.HashMap
import java.util.List
import java.util.Map

class SmtModelQueryEngine {
	private Map<SMTFunctionDeclaration, SMTFunctionDefinition> functionDeclarationToDefinitions =
		new HashMap<SMTFunctionDeclaration, SMTFunctionDefinition>
	
	private val SMTInput input;
	private val SMTOutput output
	
	new(SMTDocument model) {
		val nameToFunctionDefiniton = new HashMap<String, SMTFunctionDefinition>
		input = model.input
		var SMTModelResult modelResult = null
		
		output = model.output
		if(output!=null) {
			val result = output.getModelResult
			if(result instanceof SMTModelResult) {
				modelResult = result as SMTModelResult
			}
		}
		
		input.functionDefinition.
			forEach[x|nameToFunctionDefiniton.put(x.name,x)]
		if(modelResult!=null)
			modelResult.newFunctionDefinitions.
				forEach[x|nameToFunctionDefiniton.put(x.name,x)]
		
		input.functionDeclarations.
			forEach[x|functionDeclarationToDefinitions.put(x,x.name.lookup(nameToFunctionDefiniton))]
		if(modelResult!=null)
			modelResult.newFunctionDeclarations.
				forEach[x|functionDeclarationToDefinitions.put(x,x.name.lookup(nameToFunctionDefiniton))]
	}
	
	def protected <KEY_TYPE,VALUE_TYPE> VALUE_TYPE lookup(KEY_TYPE key, Map<? extends KEY_TYPE,? extends VALUE_TYPE> map) {
		return map.get(key)
	}
	
	def protected dispatch getDefaultValue(SMTIntTypeReference reference) { 0 }
	def protected dispatch getDefaultValue(SMTBoolTypeReference reference) { false }
	def protected dispatch getDefaultValue(SMTComplexTypeReference reference) {
		val type = reference.referred
		if(type instanceof SMTEnumeratedTypeDeclaration) return type.elements.head
		else {
			val definition = (output.getModelResult as SMTModelResult).typeDefinitions.filter[it.type == type].head
			return definition.elements.head
		}
	}
	    
	def protected isTerminal(
		SMTTerm term,
		Map<SMTSortedVariable,Object> substitution)
	{
		/*
		 * An undefined function is a terminal.
		 */
		if(term instanceof SMTSymbolicValue) {
			val symbolicValue = term as SMTSymbolicValue
			
			if(symbolicValue.symbolicReference instanceof SMTFunctionDeclaration)
			{
				val function = symbolicValue.symbolicReference as SMTFunctionDeclaration;
				val hasDefinition = functionDeclarationToDefinitions.get(function) != null
				return ! hasDefinition
			}
			else return false
		}
		/*
		 * A finite element is a terminal.
		 */
		else if(term instanceof SMTEnumLiteral)
			return true
		else return false
	}
	def protected resolveTerminal(
		SMTTerm terminal,
		Map<SMTSortedVariable,Object> substitution)
	{
		if(terminal instanceof SMTEnumLiteral) {
			return terminal;
		}
		else if(terminal instanceof SMTSymbolicValue) {
			val symbolicValue = terminal as SMTSymbolicValue
			if(symbolicValue.symbolicReference instanceof SMTFunctionDeclaration)
			{
				val function = symbolicValue.symbolicReference as SMTFunctionDeclaration;
				return function
			}
		}
	}
	
	def public Object resolveFunctionDeclaration(
		SMTFunctionDeclaration declaration,
		List<Object> params)
	{
		
		val definition = declaration.lookup(functionDeclarationToDefinitions)
		if(definition == null) return declaration.range.defaultValue
		else return definition.resolveFunctionDefinition(params)
	}
	def public Object resolveFunctionDefinition(
		SMTFunctionDefinition definition,
		List<Object> params)
	{
		if(params.nullOrEmpty && definition.parameters.nullOrEmpty) {
			return definition.resolveFunctionDefinition(emptyMap)
		}
		else if(params.size!=definition.parameters.size)
			throw new IllegalArgumentException(
				"Incorrect number of parameters!")
		else {
			val substitution = new HashMap<SMTSortedVariable,Object>
			if(! definition.parameters.nullOrEmpty) {
				for(i : 0..definition.parameters.size-1) {
					substitution.put(
						definition.parameters.get(i),
						params.get(i))
				}
			}
			val result=definition.resolveFunctionDefinition(substitution)
			//System::out.println(definition.name+"("+params.map[toString] + ") = " + result)
			return result
		}
	}
	def protected Object resolveFunctionDefinition(
		SMTFunctionDefinition definition,
		Map<SMTSortedVariable,Object> substitution)
	{
		definition.value.resolveValue(substitution)
	}
	
	def protected isBoolLiteral(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		term instanceof SMTBoolLiteral
	}
	def protected resolveBoolLiteral(SMTTerm boolValue, Map<SMTSortedVariable,Object> substitution) {
		return (boolValue as SMTBoolLiteral).^value
	}
	
	def protected isIntLiteral(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		term instanceof SMTIntLiteral ||
		(term instanceof SMTMinus && (term as SMTMinus).rightOperand==null)
	}
	def protected resolveIntLiteral(SMTTerm intValue, Map<SMTSortedVariable,Object> substitution) {
		if(intValue instanceof SMTIntLiteral) return (intValue as SMTIntLiteral).^value
		else return -((intValue as SMTMinus).leftOperand as SMTIntLiteral).value
	}
	
	def protected isParameterValue(
		SMTTerm term,
		Map<SMTSortedVariable,Object> substitution)
	{
		if(term instanceof SMTSymbolicValue) {
			return substitution.containsKey((term as SMTSymbolicValue).symbolicReference)
		}
		else return false
	}
	def protected Object resolveParameterValue(
		SMTTerm term,
		Map<SMTSortedVariable,Object> substitution)
	{
		return substitution.get((term as SMTSymbolicValue).symbolicReference);
	}
	
	def protected isITE(
		SMTTerm term,
		Map<SMTSortedVariable,Object> substitution)
	{
		return term instanceof SMTITE;
	}
	def protected resolveITE(
		SMTTerm term,
		Map<SMTSortedVariable,Object> substitution)
	{
		val ite = term as SMTITE
		val condition = ite.condition.resolveValue(substitution) as Boolean
		
		if(condition){
			return resolveValue(ite.^if,substitution)
		}else{
			return resolveValue(ite.^else,substitution)
		}
	}
	
	def protected isAnd(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		term instanceof SMTAnd
	}
	def protected resolveAnd(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		val and = term as SMTAnd
		for(operand : and.operands) {
			val operandValue = operand.resolveValue(substitution) as Boolean
			if(!operandValue) return false
		}
		return true
	}
	
	def protected isEquals(
		SMTTerm operand, 
		Map<SMTSortedVariable,Object> substitution)
	{
		return operand instanceof SMTEquals
	}
	def protected resolveEquals(SMTTerm term, Map<SMTSortedVariable,Object> substitution){
		val equals = term as SMTEquals
		val left = equals.leftOperand.resolveValue(substitution)
		val right = equals.rightOperand.resolveValue(substitution)
		val res = left.equals(right)
		return res
	}
	
	def protected isFiniteElementReference(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		if(term instanceof SMTSymbolicValue) {
			if((term as SMTSymbolicValue).symbolicReference instanceof SMTEnumLiteral) {
				return true
			}
		}
		return false;
	}
	def protected resolveFiniteElementReference(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		(term as SMTSymbolicValue).symbolicReference
	}
	
	def protected isFunctionCall(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		if(term instanceof SMTSymbolicValue) {
			val functionCall = (term as SMTSymbolicValue).symbolicReference
			return functionCall instanceof SMTFunctionDeclaration || functionCall instanceof SMTFunctionDefinition
		}
		return false;
	}
	def protected resolveFunctionCall(SMTTerm term, Map<SMTSortedVariable,Object> substitution) {
		if(term.isTerminal(substitution))
		{
			return term.resolveTerminal(substitution);
		}
		else{
			val functionCall = term as SMTSymbolicValue
			var SMTFunctionDefinition calledFunction;
			var SMTFunctionDeclaration calledDeclaration;
			if(functionCall.symbolicReference instanceof SMTFunctionDeclaration) {
				calledDeclaration = functionCall.symbolicReference as SMTFunctionDeclaration
				calledFunction = functionCall.symbolicReference.lookup(functionDeclarationToDefinitions)}
			else {
				calledDeclaration = null;
				calledFunction = functionCall.symbolicReference as SMTFunctionDefinition
			}
			
			val newSubstitution = new HashMap<SMTSortedVariable,Object>
			if(! calledFunction.parameters.nullOrEmpty) {
				for(i : 0..calledFunction.parameters.size-1) {
					newSubstitution.put(
						calledFunction.parameters.get(i),
						functionCall.parameterSubstitutions.get(i).resolveValue(substitution)
					)
				}
			}
			return calledFunction.resolveFunctionDefinition(newSubstitution)
		}
	}
	
	def protected Object resolveValue(
		SMTTerm value,
		Map<SMTSortedVariable,Object> substitution)
	{
		if(value instanceof SMTSymbolicValue){
			(value as SMTSymbolicValue).symbolicReference
		}
		
		if(value.isTerminal(substitution)) {
			return value.resolveTerminal(substitution)
		}else if(value.isBoolLiteral(substitution)){
			return resolveBoolLiteral(value, substitution)
		}else if(value.isIntLiteral(substitution)){
			return resolveIntLiteral(value, substitution)
		}else if(value.isParameterValue(substitution)) {
			return resolveParameterValue(value,substitution)
		}else if(value.isITE(substitution)){
			return resolveITE(value, substitution)
		}else if(value.isAnd(substitution)) {
			return resolveAnd(value,substitution)
		}else if(value.isEquals(substitution)) {
			return resolveEquals(value,substitution)
		}else if(value.isFiniteElementReference(substitution)) {
			return resolveFiniteElementReference(value,substitution)
		}else if(value.isFunctionCall(substitution)) {
			return resolveFunctionCall(value,substitution)
		}else{
			throw new IllegalArgumentException("Can not resolve this term: " + value)
		}
	}
}