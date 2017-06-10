package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import java.util.List
import java.util.LinkedList
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor

class VariableContext {
	val extension LogiclanguageFactory language;
	val extension LogicProblemBuilder logicProblemBuilder;
	
	new(LogicProblemBuilder logicProblemBuilder, LogiclanguageFactory language) {
		this.logicProblemBuilder = logicProblemBuilder
		this.language = language
	}
	
	private List<Variable> variables = new LinkedList;
	def public getVariables(){variables}
	
	
	//def public -(TypeDescriptor type) { Variable(type) }
	def public Variable addVar(TypeDescriptor type) {	
		return addVar(null, type);
	}
	
	def public Variable addVar(CharSequence variableName, TypeDescriptor type) {
		if(variables.exists[name.equals(variableName)]) throw new IllegalArgumentException("Variable with name " + variableName +" is already defined.")
		val variable = createVariable => [name = variableName.canonize range = type.toTypeReference]
		variables += variable
		return variable
	}
}