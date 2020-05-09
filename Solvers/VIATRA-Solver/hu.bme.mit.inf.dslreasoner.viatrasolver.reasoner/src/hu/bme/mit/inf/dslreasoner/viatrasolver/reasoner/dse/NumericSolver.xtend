package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericProblemSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod
import java.util.HashMap
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericTranslator
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.emf.ecore.EObject
import java.util.Map
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
import java.util.List
import java.math.BigDecimal

class NumericSolver {
	val ThreadContext threadContext;
	val constraint2UnitPropagationPrecondition = new HashMap<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>>
	NumericTranslator t = new NumericTranslator
	
	new(ThreadContext threadContext, ModelGenerationMethod method) {
		this.threadContext = threadContext
		val engine = threadContext.queryEngine
		for(entry : method.unitPropagationPreconditions.entrySet) {
			val constraint = entry.key
			val querySpec = entry.value
			val matcher = querySpec.getMatcher(engine);
			constraint2UnitPropagationPrecondition.put(constraint,matcher)
		}
	}
	
	def boolean isSatisfiable() {
		if(constraint2UnitPropagationPrecondition.empty) return true
		else {
			val propagatedConstraints = new HashMap
			for(entry : constraint2UnitPropagationPrecondition.entrySet) {
				val constraint = entry.key
				//println(constraint)
				val allMatches = entry.value.allMatches.map[it.toArray]
				//println(allMatches.toList)
				propagatedConstraints.put(constraint,allMatches)
			}
			
			if(propagatedConstraints.values.forall[empty]) {
				return true
			} else {
				val res = t.delegateIsSatisfiable(propagatedConstraints)
				//println(res)
				return res
			}
		}
	}
	
	def fillSolutionCopy(Map<EObject, EObject> trace) {
		val model = threadContext.getModel as PartialInterpretation
		val dataObjects = model.newElements.filter(PrimitiveElement).filter[!model.openWorldElements.contains(it)].toList
		if(constraint2UnitPropagationPrecondition.empty) {
			fillWithDefaultValues(dataObjects,trace)
		} else {
			val propagatedConstraints = new HashMap
			for(entry : constraint2UnitPropagationPrecondition.entrySet) {
				val constraint = entry.key
				val allMatches = entry.value.allMatches.map[it.toArray]
				propagatedConstraints.put(constraint,allMatches)
			}
			
			if(propagatedConstraints.values.forall[empty]) {
				fillWithDefaultValues(dataObjects,trace)
			} else {
				val solution = t.delegateGetSolution(dataObjects,propagatedConstraints)
				fillWithSolutions(dataObjects,solution,trace)
			}
		}
	}
	
	def protected fillWithDefaultValues(List<PrimitiveElement> elements, Map<EObject, EObject> trace) {
		for(element : elements) {
			if(element.valueSet==false) {
				val value = getDefaultValue(element)
				val target = trace.get(element) as PrimitiveElement
				target.fillWithValue(value)
			}
		}
	}
	
	def protected dispatch getDefaultValue(BooleanElement e) {false}
	def protected dispatch getDefaultValue(IntegerElement e) {0}
	def protected dispatch getDefaultValue(RealElement e) {0.0}
	def protected dispatch getDefaultValue(StringElement e) {""}
	
	def protected fillWithSolutions(List<PrimitiveElement> elements, Map<PrimitiveElement, Integer> solution, Map<EObject, EObject> trace) {
		for(element : elements) {
			if(element.valueSet==false) {
				if(solution.containsKey(element)) {
					val value = solution.get(element)
					val target = trace.get(element) as PrimitiveElement
					target.fillWithValue(value)
				} else {
					val target = trace.get(element) as PrimitiveElement
					target.fillWithValue(target.defaultValue)
				}
			}
		}
	}
	
	def protected dispatch fillWithValue(BooleanElement e, Object value) {e.valueSet=true e.value=value as Boolean}
	def protected dispatch fillWithValue(IntegerElement e, Object value) {e.valueSet=true e.value=value as Integer}
	def protected dispatch fillWithValue(RealElement e, Object value) {e.valueSet=true e.value=BigDecimal.valueOf(value as Double) }
	def protected dispatch fillWithValue(StringElement e, Object value) {e.valueSet=true e.value=value as String}
}