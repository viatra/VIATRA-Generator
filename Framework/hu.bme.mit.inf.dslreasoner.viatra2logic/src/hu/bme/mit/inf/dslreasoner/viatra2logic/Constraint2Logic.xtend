package hu.bme.mit.inf.dslreasoner.viatra2logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.LinkedList
import java.util.Map
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey
import org.eclipse.viatra.query.runtime.matchers.aggregators.DoubleSumOperator
import org.eclipse.viatra.query.runtime.matchers.aggregators.ExtremumOperator
import org.eclipse.viatra.query.runtime.matchers.aggregators.ExtremumOperator.Extreme
import org.eclipse.viatra.query.runtime.matchers.aggregators.IntegerSumOperator
import org.eclipse.viatra.query.runtime.matchers.aggregators.LongSumOperator
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Constraint2Logic {
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	val Ecore2Logic ecore2Logic
	val ExpressionEvaluation2Logic expressionEvaliation2Logic = new ExpressionEvaluation2Logic
	val expressionExtractor = new XExpressionExtractor
	
	new(Ecore2Logic ecore2Logic) {
		this.ecore2Logic = ecore2Logic
	}
	
	def dispatch Term transformConstraint(Equality constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		constraint.who.lookup(variable2Variable)
		== 
		constraint.withWhom.lookup(variable2Variable)
	}
	
	def dispatch Term transformConstraint(ExportedParameter constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		return null
	}
	
	def dispatch Term transformConstraint(Inequality constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		constraint.who.lookup(variable2Variable)
		!= 
		constraint.withWhom.lookup(variable2Variable)
	}
	
	def dispatch Term transformConstraint(NegativePatternCall constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		val parameterSubstitution = new LinkedList
		for(index : 0..<constraint.actualParametersTuple.size) {
			val variable = constraint.actualParametersTuple.get(index) as PVariable
			parameterSubstitution += variable.lookup(variable2Variable).toTerm
		}
		
		val res = constraint.referredQuery.lookup(viatra2LogicTrace.query2Relation).call(parameterSubstitution)
		return res.Not
	}
	
	def dispatch Term transformConstraint(BinaryTransitiveClosure constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,		
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		transitiveClosure(
			constraint.referredQuery.lookup(viatra2LogicTrace.query2Relation),
			(constraint.variablesTuple.get(0) as PVariable).lookup(variable2Variable).toTerm,
			(constraint.variablesTuple.get(1) as PVariable).lookup(variable2Variable).toTerm
		)
	}
	
	def dispatch Term transformConstraint(ConstantValue constant,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		val tuple = constant.variablesTuple
		if(tuple.size == 1) {
			val variable = tuple.get(0) as PVariable
			//println(variable.name + " == " + constant.supplierKey + "["+constant.supplierKey.class.name+"]")
			val translatedConstant = transformConstantValue(constant.supplierKey,ecore2LogicTrace,viatra2LogicTrace,config);
			return variable.lookup(variable2Variable) == translatedConstant
		} else throw new AssertionError
	}
	
	private def dispatch transformConstantValue(
		Enumerator enumerator,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		ecore2Logic.Literal(ecore2LogicTrace.trace,enumerator)
	}
	private def dispatch transformConstantValue(
		Integer value,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		return value.asTerm
	}
	private def dispatch transformConstantValue(
		Boolean value,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		return value.asTerm
	}
	private def dispatch transformConstantValue(
		String value,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		return value.asTerm
	}
	private def dispatch transformConstantValue(
		Double value,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		return value.asTerm
	}
	private def dispatch transformConstantValue(
		Float value,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		return value.asTerm
	}
	private def dispatch transformConstantValue(Object other,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		throw new UnsupportedOperationException('''Unknown constant «other»:«other.class.name»''')
	}
	
	def dispatch Term transformConstraint(PositivePatternCall constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		
		val parameterSubstitution = new LinkedList
		for(index : 0..<constraint.variablesTuple.size) {
			val variable = constraint.variablesTuple.get(index) as PVariable
			parameterSubstitution += variable.lookup(variable2Variable).toTerm
		}
		val res = constraint.referredQuery.lookup(viatra2LogicTrace.query2Relation).call(parameterSubstitution)
		return res
	}
	
	def dispatch Term transformConstraint(TypeConstraint constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		val tuple = constraint.variablesTuple
		if(tuple.size == 1) {
			val typeConstraint = constraint.equivalentJudgement.inputKey
			if(typeConstraint instanceof EClassTransitiveInstancesKey) {
				val type = typeConstraint.emfKey
				val variable = tuple.get(0) as PVariable
				return transformTypeConstraint(type,variable,ecore2LogicTrace,variable2Variable,viatra2LogicTrace)
			} else if(typeConstraint instanceof EDataTypeInSlotsKey) {
				// If the type is a primitive type or EEnum, then instanceof is an unnecessary constraint
				return null
			}
		} else if(tuple.size == 2) {
			val type = (constraint.equivalentJudgement.inputKey as EStructuralFeatureInstancesKey).emfKey
			val src = tuple.get(0) as PVariable
			val trg = tuple.get(1) as PVariable
			return transformPathConstraint(type,src,trg,ecore2LogicTrace,variable2Variable,viatra2LogicTrace)
		} else throw new IllegalArgumentException('''unknown tuple: «tuple»''')
	}
	
	def Term transformTypeConstraint(
		EClass type,
		PVariable variable,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicTrace viatra2LogicTrace)
	{
		InstanceOf(
			variable.lookup(variable2Variable),
			ecore2Logic.TypeofEClass(ecore2LogicTrace.trace,type))
	}
	def Term transformPathConstraint(
		EStructuralFeature feature,
		PVariable src, PVariable trg,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicTrace viatra2LogicTrace)
	{
		if(feature instanceof EReference) {
			return ecore2Logic.IsInReference(ecore2LogicTrace.trace,
				src.lookup(variable2Variable),
				trg.lookup(variable2Variable),
				feature)
		} else if(feature instanceof EAttribute) {
			return ecore2Logic.IsAttributeValue(ecore2LogicTrace.trace,
				src.lookup(variable2Variable),
				trg.lookup(variable2Variable),
				feature)
		} else {
			throw new IllegalArgumentException('''Unsupported path expression: «feature.class.name»''')
		}
	}
	
	def dispatch Term transformConstraint(TypeFilterConstraint constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		val tuple = constraint.variablesTuple
		if(tuple.size == 1) {
			val typeConstraint = constraint.equivalentJudgement.inputKey
			if(typeConstraint instanceof EClassTransitiveInstancesKey) {
				val type = typeConstraint.emfKey
				val variable = tuple.get(0) as PVariable
				return transformTypeConstraint(type,variable,ecore2LogicTrace,variable2Variable,viatra2LogicTrace)
			} else if(typeConstraint instanceof EDataTypeInSlotsKey) {
				// If the type is a primitive type or EEnum, then instanceof is an unnecessary constraint
				return null
			}
		} else if(tuple.size == 2) {
			val type = (constraint.equivalentJudgement.inputKey as EStructuralFeatureInstancesKey).emfKey
			val src = tuple.get(0) as PVariable
			val trg = tuple.get(1) as PVariable
			return transformPathConstraint(type,src,trg,ecore2LogicTrace,variable2Variable,viatra2LogicTrace)
		} else throw new IllegalArgumentException('''unknown tuple: «tuple»''')
	}
	
	def dispatch Term transformConstraint(AggregatorConstraint constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,		
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		val logicReferred = constraint.referredQuery.lookup(viatra2LogicTrace.query2Relation)
		val parameterSubstitution = new LinkedList
		for(index : 0..<constraint.actualParametersTuple.size) {
			val term = (constraint.actualParametersTuple.get(index) as PVariable).lookup(variable2Variable)
			parameterSubstitution += term
		}
		val aggregatorIndex = constraint.aggregatedColumn
		val logicResultVariable = constraint.resultVariable.lookup(variable2Variable)
		val type = constraint.aggregator.operator
		if(type === null) {
			return Count(logicReferred,parameterSubstitution,logicResultVariable)
		} else if(type instanceof IntegerSumOperator || type instanceof DoubleSumOperator || type instanceof LongSumOperator){
			return Sum(logicReferred,parameterSubstitution,aggregatorIndex,logicResultVariable)
		} else if(type instanceof ExtremumOperator) {
			if(type.name == Extreme.MIN.name.toLowerCase) {
				return Min(logicReferred,parameterSubstitution,aggregatorIndex,logicResultVariable)
			} else if(type.name == Extreme.MAX.name.toLowerCase){
				return Max(logicReferred,parameterSubstitution,aggregatorIndex,logicResultVariable)
			} else {
				throw new UnsupportedOperationException('''Unkown Extremum aggregator type: «type.name»''')
			}
		} else {
			throw new UnsupportedOperationException('''Unkown aggregator type: «type.name»''')
		}
	}
	
	def dispatch Term transformConstraint(PatternMatchCounter constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,		
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		val logicReferred = constraint.referredQuery.lookup(viatra2LogicTrace.query2Relation)
		val parameterSubstitution = new LinkedList
		for(index : 0..<constraint.actualParametersTuple.size) {
			val term = (constraint.actualParametersTuple.get(index) as PVariable).lookup(variable2Variable)
			parameterSubstitution += term
		}
		val logicResultVariable = constraint.resultVariable.lookup(variable2Variable)
		return Count(logicReferred,parameterSubstitution,logicResultVariable)
	}
	
	def dispatch Term transformConstraint(ExpressionEvaluation constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,		
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		val outputVariable = constraint.outputVariable
		val expression = expressionExtractor.extractExpression(constraint.evaluator)
		if(outputVariable === null) {
			return expressionEvaliation2Logic.transformCheck(expression,variable2Variable)
		} else {
			return expressionEvaliation2Logic.transformEval(outputVariable,expression,variable2Variable)
		}	
	}
	
	def dispatch Term transformConstraint(PConstraint constraint,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,		
		Map<PVariable, Variable> variable2Variable,
		Viatra2LogicConfiguration config)
	{
		throw new UnsupportedOperationException('''Unkown constraint type: «constraint.class.name»''')
	}
}