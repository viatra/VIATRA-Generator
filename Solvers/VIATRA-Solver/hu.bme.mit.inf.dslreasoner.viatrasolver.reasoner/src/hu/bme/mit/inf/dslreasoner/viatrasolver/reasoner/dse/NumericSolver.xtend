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
import java.util.LinkedHashSet
import java.util.LinkedHashMap

class NumericSolver {
	val ThreadContext threadContext;
	val constraint2UnitPropagationPrecondition = new HashMap<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>>
	NumericTranslator t = new NumericTranslator
	
	val boolean caching;
	Map<LinkedHashMap<PConstraint, Iterable<List<Integer>>>,Boolean> satisfiabilityCache = new HashMap
	
	var long runtime = 0
	var long cachingTime = 0 
	var int numberOfSolverCalls = 0
	var int numberOfCachedSolverCalls = 0
	
	new(ThreadContext threadContext, ModelGenerationMethod method, boolean caching) {
		this.threadContext = threadContext
		val engine = threadContext.queryEngine
		for(entry : method.unitPropagationPreconditions.entrySet) {
			val constraint = entry.key
			val querySpec = entry.value
			val matcher = querySpec.getMatcher(engine);
			constraint2UnitPropagationPrecondition.put(constraint,matcher)
		}
		this.caching = caching
	}
	
	def getRuntime(){runtime}
	def getCachingTime(){cachingTime}
	def getNumberOfSolverCalls(){numberOfSolverCalls}
	def getNumberOfCachedSolverCalls(){numberOfCachedSolverCalls}
	
	def boolean isSatisfiable() {
		val start = System.nanoTime
		var boolean finalResult 
		if(constraint2UnitPropagationPrecondition.empty){
			finalResult=true
		} else {
			val propagatedConstraints = new HashMap
			for(entry : constraint2UnitPropagationPrecondition.entrySet) {
				val constraint = entry.key
				//println(constraint)
				val allMatches = entry.value.allMatches.map[it.toArray]
				//println(allMatches.toList)
				propagatedConstraints.put(constraint,allMatches)
			}
			if(propagatedConstraints.values.forall[empty]) {
				finalResult=true
			} else {
				if(caching) {
					val code = getCode(propagatedConstraints)
					val cachedResult = satisfiabilityCache.get(code)
					if(cachedResult === null) {
	//					println('''new problem, call solver''')
	//					for(entry : code.entrySet) {
	//						println('''«entry.key» -> «entry.value»''')
	//					}
						//println(code.hashCode)
						this.numberOfSolverCalls++
						val res = t.delegateIsSatisfiable(propagatedConstraints)
						satisfiabilityCache.put(code,res)
						finalResult=res
					} else {
						//println('''similar problem, answer from cache''')
						finalResult=cachedResult
						this.numberOfCachedSolverCalls++
					}
				} else {
					finalResult= t.delegateIsSatisfiable(propagatedConstraints)
					this.numberOfSolverCalls++
				}
			}
		}
		this.runtime+=System.nanoTime-start
		return finalResult
	}
	
	def getCode(HashMap<PConstraint, Iterable<Object[]>> propagatedConstraints) {
		val start = System.nanoTime
		val involvedObjects = new LinkedHashSet(propagatedConstraints.values.flatten.map[toList].flatten.toList).toList
		val res = new LinkedHashMap(propagatedConstraints.mapValues[matches | matches.map[objects | objects.map[object | involvedObjects.indexOf(object)].toList]])
		this.cachingTime += System.nanoTime-start
		return res
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