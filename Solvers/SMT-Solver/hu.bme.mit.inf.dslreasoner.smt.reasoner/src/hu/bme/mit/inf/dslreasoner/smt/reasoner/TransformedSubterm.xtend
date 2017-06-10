package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguageFactory
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Data
import java.util.HashMap
import java.util.LinkedList

abstract class TransformedSubterm {
	val static extension SmtLanguageFactory factory = SmtLanguageFactory.eINSTANCE
	def LogicSubterm expectLogic() 
	def NumericSubterm expectNumber()
	
	def List<SubtermOption> getPossibleValues()
	
	public static def List<List<SubtermOption>> allCombinations(List<SubtermOption>... possibleValues) {
		return allCombinations(possibleValues.toList)
	}
	public static def List<List<SubtermOption>> allCombinations(Iterable<List<SubtermOption>> possibleValues) {
		if(possibleValues.size == 1) {
			return possibleValues.head.map[x|#[x.copy]]
		} else {
			val head = possibleValues.head
			val tails = possibleValues.tail.allCombinations
			val res = new ArrayList(tails.size * head.size)
			for(headElement : head) {
				for(tail : tails) {
					val combination = new ArrayList(tail.size+1)
					combination.add(headElement)
					combination.addAll(tail.map[copy])
					res.add(combination)
				}
			}
			return res
		}
	}
	
	public static def resolveToLogic(List<SubtermOption> subterms, SMTTerm value) {
		val allDefinitions = subterms.map[it.variables].flatten
		val allPreconditions = subterms.map[it.preconditions].flatten
		val preconditionedExpression = if(allPreconditions.empty) {
			value
		} else {
			createSMTAnd => [it.operands += allPreconditions it.operands += value]
		}
		val quantifiedExpression = if(allDefinitions.empty) {
			preconditionedExpression
		} else {
			createSMTForall => [
				it.quantifiedVariables += allDefinitions
				it.expression = preconditionedExpression]
		}
		return quantifiedExpression
	}
}

@Data class SubtermOption {
	List<SMTSortedVariable> variables
	List<SMTTerm> preconditions
	SMTTerm expression
	TypeDescriptor type
	
	public new(
		List<SMTSortedVariable> variables,
		List<SMTTerm> preconditions,
		SMTTerm expression,
		TypeDescriptor type)
	{
		this.variables = variables
		this.preconditions = preconditions
		this.expression = expression
		this.type = type
	}
	
	public new(
		List<SubtermOption> previousSubterms,
		List<SMTSortedVariable> newVariables,
		List<SMTTerm> newPreconditions,
		SMTTerm newExpression,
		TypeDescriptor newType)
	{
		val old2New = new HashMap
		variables = new LinkedList
		for(variable : previousSubterms.map[getVariables].flatten) {
			val newVariable = EcoreUtil.copy(variable)
			old2New.put(variable,newVariable)
			variables+=newVariable
		}
		
		preconditions = new LinkedList
		preconditions += previousSubterms.map[getPreconditions].flatten.map[x|EcoreUtil.copy(x)]
		preconditions += newPreconditions.map[x|EcoreUtil.copy(x)]
		preconditions.forEach[relinkAllVariableReference(old2New)]
		
		expression = EcoreUtil.copy(newExpression)
		relinkAllVariableReference(expression,old2New)
		
		type = newType
	}
	
	public def copy() {
		val old2New = variables.toInvertedMap[EcoreUtil.copy(it)]
		val newPreconditions = preconditions.map[EcoreUtil.copy(it)]
		newPreconditions.forEach[it.relinkAllVariableReference(old2New)]
		val newExpression = EcoreUtil.copy(expression)
		return new SubtermOption(variables.map[old2New.get(it)],newPreconditions,newExpression,type)
	}
	
	def private relinkAllVariableReference(EObject root,Map<SMTSortedVariable, SMTSortedVariable> map) {
		if(root instanceof SMTSymbolicValue) root.relinkVariableReference(map)
		root.eAllContents().filter(SMTSymbolicValue).forEach[relinkVariableReference(map)]
	}
	def private relinkVariableReference(SMTSymbolicValue target,Map<SMTSortedVariable, SMTSortedVariable> map) {
		if(map.containsKey(target.symbolicReference)) {
			target.symbolicReference = map.get(target.symbolicReference)
		}
	}
}

@Data
class LogicSubterm extends TransformedSubterm{
	
	SMTTerm value
	override expectLogic() {return this}
	override expectNumber() { throw new AssertionError("A term is not a number") }
	
	public new(SMTTerm expression)
	{
		this.value = expression
	}
	override getPossibleValues() {
		#[new SubtermOption(#[],#[],value,TypeDescriptor::logicTypeDescriptor_Instance)]
	}
}

@Data
class NumericSubterm extends TransformedSubterm {
	List<SubtermOption> values
	
	public new(
		List<SMTSortedVariable> variables,
		List<SMTTerm> preconditions,
		SMTTerm expression) {
		this.values = #[new SubtermOption(variables,preconditions,expression,TypeDescriptor.numericTypeDescriptor_Instance)]
	}
	public new(List<SubtermOption> values) {
		this.values = values
	}
	
	override expectLogic() { throw new AssertionError("A term is not a logic value") }
	override expectNumber() { return this }
	
	override getPossibleValues() {
		values
	}
}

@Data
class ComplexSubterm extends TransformedSubterm {
	List<SubtermOption> options
	override expectLogic() { throw new AssertionError("A term is not a logic value") }
	override expectNumber() { throw new AssertionError("A term is not a number") }
	public new(List<SMTSortedVariable> variables,
		List<SMTTerm> preconditions,
		SMTTerm expression,
		TypeDescriptor type)
	{
		this.options = #[new SubtermOption(variables,preconditions,expression,type)]
	}
	public new(List<SubtermOption> subterms) {
		this.options = subterms
	}
	override getPossibleValues() {
		this.options
	}
}
