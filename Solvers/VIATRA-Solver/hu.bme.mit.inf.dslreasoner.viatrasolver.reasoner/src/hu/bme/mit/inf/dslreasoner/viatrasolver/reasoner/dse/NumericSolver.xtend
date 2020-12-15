package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericDrealProblemSolver
import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericTranslator
import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericZ3ProblemSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ModelGenerationMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.NumericSolverSelection
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import java.math.BigDecimal
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint

class NumericSolver {
	val ModelGenerationMethod method
	var ThreadContext threadContext
	val constraint2MustUnitPropagationPrecondition = new HashMap<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>>
	val constraint2CurrentUnitPropagationPrecondition = new HashMap<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>>
	NumericTranslator t
	
	val boolean intermediateConsistencyCheck
	val boolean caching;
	Map<LinkedHashMap<PConstraint, Iterable<List<Integer>>>,Boolean> satisfiabilityCache = new HashMap
	
	var long runtime = 0
	var long cachingTime = 0 
	var int numberOfSolverCalls = 0
	var int numberOfCachedSolverCalls = 0
	
	new(ModelGenerationMethod method, ViatraReasonerConfiguration config, boolean caching) {
		this.method = method
		this.intermediateConsistencyCheck = config.runIntermediateNumericalConsistencyChecks
		this.t = new NumericTranslator(createNumericTranslator(config.numericSolverSelection))
		this.caching = caching
	}
	
	def createNumericTranslator(NumericSolverSelection solverSelection) {
		if (solverSelection == NumericSolverSelection.DREAL) return new NumericDrealProblemSolver
		if (solverSelection == NumericSolverSelection.Z3) return new NumericZ3ProblemSolver
	}
	
	def init(ThreadContext context) {
		// This makes the NumericSolver single-threaded,
		// but that's not a problem, because we only use the solver on a single thread anyways.
		this.threadContext = context
		val engine = threadContext.queryEngine
		for(entry : method.mustUnitPropagationPreconditions.entrySet) {
			val constraint = entry.key
			val querySpec = entry.value
			val matcher = querySpec.getMatcher(engine);
			constraint2MustUnitPropagationPrecondition.put(constraint,matcher)
		}
		for(entry : method.currentUnitPropagationPreconditions.entrySet) {
			val constraint = entry.key
			val querySpec = entry.value
			val matcher = querySpec.getMatcher(engine);
			constraint2CurrentUnitPropagationPrecondition.put(constraint,matcher)
		}
	}
	
	def getRuntime(){runtime}
	def getCachingTime(){cachingTime}
	def getNumberOfSolverCalls(){numberOfSolverCalls}
	def getNumberOfCachedSolverCalls(){numberOfCachedSolverCalls}
	def getSolverFormingProblem(){this.t.formingProblemTime}
	def getSolverSolvingProblem(){this.t.solvingProblemTime}
	def getSolverSolution(){this.t.formingSolutionTime}
	def getNumericSolverSelection(){this.t.numericSolver}
	
	def boolean maySatisfiable() {
		if(intermediateConsistencyCheck) {
			return isSatisfiable(this.constraint2MustUnitPropagationPrecondition)
		} else {
			return true
		}
	}
	def boolean currentSatisfiable() {
		isSatisfiable(this.constraint2CurrentUnitPropagationPrecondition)
	}
	
	private def boolean isSatisfiable(Map<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>> matches) {
		val start = System.nanoTime
		var boolean finalResult 
		if(matches.empty){
			finalResult=true
		} else {
			val propagatedConstraints = new HashMap
			for(entry : matches.entrySet) {
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
		if(constraint2CurrentUnitPropagationPrecondition.empty) {
			fillWithDefaultValues(dataObjects,trace)
		} else {
			val propagatedConstraints = new HashMap
			for(entry : constraint2CurrentUnitPropagationPrecondition.entrySet) {
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
	
	def protected fillWithSolutions(List<PrimitiveElement> elements, Map<PrimitiveElement, Number> solution, Map<EObject, EObject> trace) {
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