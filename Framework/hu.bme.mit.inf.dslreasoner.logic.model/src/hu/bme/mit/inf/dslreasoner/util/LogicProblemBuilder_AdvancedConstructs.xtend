package hu.bme.mit.inf.dslreasoner.util

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import java.util.ArrayList
import java.util.Collection
import java.util.List
import java.util.Map

class LogicProblemBuilder_AdvancedConstructs {
	val extension LogicProblemBuilder builder;
	public new(LogicProblemBuilder builder) {
		this.builder = builder
	}
	
	def public FunctionDefinitionBody(Iterable<Variable> variables, Map<List<Term>,Term> parametersToValue, Term other) {
		val variableList = variables.toList
		val entryList = parametersToValue.entrySet.toList
		
		// Size = 0
		if(entryList.empty && other === null) {
			throw new IllegalArgumentException('''No possible value is specified!''')
		// Size = 1
		} else if(entryList.size == 1 && other === null) {
			return entryList.head.value
		// Size = 1
		} else if(entryList.empty && !(other === null)) {
			return other
		// Size > 1
		}else {
			// Transforming values to IF-Then-Else structures
			/**The number of IF-THEN-ELSE structures needed*/
			var int iteNumber
			if(other === null) iteNumber = entryList.size-1
			else iteNumber = entryList.size
			
			val ites = new ArrayList<IfThenElse>(iteNumber)
			for (element : 0 ..< iteNumber) {
				ites += ITE(
					entryList.get(element).key.substitutionIsEqual(variableList),
					entryList.get(element).value,
					null)
			}
			
			// Linking the IF-Then-Else structures to a chain
			for (optionIndex : 1 ..< ites.size) {
				val prev = ites.get(optionIndex - 1)
				val next = ites.get(optionIndex)
				prev.ifFalse = next
			}
			
			if(other === null) ites.last.ifFalse = entryList.last.value
			else ites.last.ifFalse = other
			
			// return the head of the chain
			return ites.head
		}
	}
	
	def public RelationDefinitionBody(Iterable<Variable> variables, Collection<List<Term>> elements) {
		val variableList = variables.toList
		return elements.map[row | row.substitutionIsEqual(variableList)].Or
	}
	
	def private substitutionIsEqual(List<Term> substitution, List<Variable> variables) {
		val parameterIndexes = 0..<variables.size
		return And(parameterIndexes.map[index | substitution.get(index) == variables.get(index)])
	}
}