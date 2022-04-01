package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericDrealProblemSolver
import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericTranslator
import hu.bme.mit.inf.dslreasoner.viatra2logic.NumericZ3ProblemSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ExplorationStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ModelGenerationMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.NumericSolverSelection
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Fitness
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.viatra.dse.objectives.IObjective

class NumericRefinementUnit {
	val ModelGenerationMethod method
	var ThreadContext threadContext
	val constraint2MustUnitPropagationPrecondition = new HashMap<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>>
	val constraint2CurrentUnitPropagationPrecondition = new HashMap<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>>
	var NumericTranslator _translator = null;
	val ViatraReasonerConfiguration config
	
	val boolean intermediateConsistencyCheck
	val boolean caching;
	Map<LinkedHashMap<PConstraint, Iterable<List<Integer>>>,Boolean> satisfiabilityCache = new HashMap
	val ExplorationStrategy strategy;
	
	var long runtime = 0
	var long cachingTime = 0 
	var int numberOfSolverCalls = 0
	var int numberOfCachedSolverCalls = 0
	
	new(ModelGenerationMethod method, ViatraReasonerConfiguration config, boolean caching) {
		this.method = method
		this.intermediateConsistencyCheck = config.runIntermediateNumericalConsistencyChecks
		this.caching = caching
		this.strategy = config.strategy
		this._translator = null
		this.config = config
	}
	
	def private getTranslator() {
		if(_translator === null) {
			_translator =   new NumericTranslator(createNumericTranslator(config),config.numericSolverTimeout)
		}
		return _translator
	}
	
	def createNumericTranslator(ViatraReasonerConfiguration config) {
		val solverSelection = config.numericSolverSelection
		val strategy = config.strategy
//		if (strategy == ExplorationStrategy.None) {
		// initialise the specified
		if (solverSelection == NumericSolverSelection.DREAL_DOCKER)
			return new NumericDrealProblemSolver(true, null, config.numericSolverTimeout)
		if (solverSelection == NumericSolverSelection.DREAL_LOCAL)
			return new NumericDrealProblemSolver(false, config.drealLocalPath, config.numericSolverTimeout)
		if (solverSelection == NumericSolverSelection.Z3) {
			// TODO THIS IS HARD-CODED for now
//			val root = "/data/viatra/VIATRA-Generator";
//			val root = "/home/models/VIATRA-Generator";
			// END HARD-CODED
			// String root = (new File(System.getProperty("user.dir"))).getParentFile().getParent();
//		        System.load(root + "/Solvers/SMT-Solver/com.microsoft.z3/lib/libz3.so");
//		        System.load(root + "/Solvers/SMT-Solver/com.microsoft.z3/lib/libz3java.so");
			// System.load("libz3.so");
			// System.load("libz3java.so");
			return new NumericZ3ProblemSolver(config.numericSolverTimeout)
//			}
		}
//		else {
//			//initialise both dreal-local and z3
//			
//			//TODO THIS IS HARD-CODED for now
////			val root = "/data/viatra/VIATRA-Generator";
//			val root = "/home/models/VIATRA-Generator";
//			//END HARD-CODED
////			String root = (new File(System.getProperty("user.dir"))).getParentFile().getParent();
//	        System.load(root + "/Solvers/SMT-Solver/com.microsoft.z3/lib/libz3.so");
//	        System.load(root + "/Solvers/SMT-Solver/com.microsoft.z3/lib/libz3java.so");
//			return new NumericDynamicProblemSolver(drealLocalPath, config.drealTimeout)
//		}
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
	def getSolverFormingProblem(){
		if(this._translator === null) { return 0; }
		else return this.translator.formingProblemTime
	}
	def getSolverSolvingProblem(){
		if(this._translator === null) { return 0; }
		else this.translator.solvingProblemTime
	}
	def getSolverSolution(){
		if(this._translator === null) { return 0; }
		else this.translator.formingSolutionTime
	}
	def getNumericSolverSelection(){this.translator.numericSolver}
	
	def boolean maySatisfiable() {
		val int phase = determinePhase()
		
		if(intermediateConsistencyCheck) {
			return isSatisfiable(this.constraint2MustUnitPropagationPrecondition, phase)
		} else {
			return true
		}
	}
	def boolean currentSatisfiable() {
		val int phase = determinePhase()
		isSatisfiable(this.constraint2CurrentUnitPropagationPrecondition, phase)
	}
	
	private def boolean isSatisfiable(Map<PConstraint,ViatraQueryMatcher<? extends IPatternMatch>> matches, int phase) {
		val start = System.nanoTime
		var boolean finalResult 
		val boolean needsFilling = needsFilling
		val model = threadContext.getModel as PartialInterpretation
		val dataObjects = model.newElements.filter(PrimitiveElement).filter[!model.openWorldElements.contains(it)].toList
	
		if(matches.empty){
			finalResult=true
		} else {
			val propagatedConstraints = new HashMap
			//Filter constraints if there are phase-related restricutions
			//null whitelist means accept everything
			
//			println("<<<<START-STEP>>>> (" + phase + ")")
			if (phase == -2) {
//				println("Skipping numeric check")
				//TODO Big assumption
				return true
			}
			val whitelist = getConstraintWhitelist(phase)
			for(entry : matches.entrySet) {
				if (entry.value !== null){
					val name = (entry.key as ExpressionEvaluation).body.pattern.simpleName
					if (whitelist === null || whitelist.contains(name)) {
//						println(name)
						val constraint = entry.key
//						println("--match?-- " + constraint)
						val allMatches = entry.value.allMatches.map[it.toArray]
		//				println("---------- " + entry.value.allMatches)
						propagatedConstraints.put(constraint,allMatches)
					}
				}
			}
			//check numeric problem
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
						var boolean res = false
						if (needsFilling){
							//TODO ASSUME Always True
							//GET LIST OF VARS TO FILL
							val fillMap = translator.delegateGetSolution(dataObjects, propagatedConstraints, selectSolver(phase))
							if (fillMap === null) res = false
							else {
								fillWithPartialSolutionsDirectly(dataObjects, fillMap)
								res = true
							}
						} else {
							res = translator.delegateIsSatisfiable(propagatedConstraints, selectSolver(phase))
						}
						//TODO FIX CACHING
						satisfiabilityCache.put(code,res)
						finalResult=res
					} else {
						//println('''similar problem, answer from cache''')
						println('''potential issue, answer from cache''')
						finalResult=cachedResult
						this.numberOfCachedSolverCalls++
					}
				} else {
					if (needsFilling){
						//GET LIST OF VARS TO FILL
						val fillMap = translator.delegateGetSolution(dataObjects, propagatedConstraints, selectSolver(phase))
						if (fillMap === null) finalResult = false
						else {
							fillWithPartialSolutionsDirectly(dataObjects, fillMap)
							finalResult = true
						}
					} else {
						finalResult = translator.delegateIsSatisfiable(propagatedConstraints, selectSolver(phase))
					}
					this.numberOfSolverCalls++
				}
			}
		}	
		this.runtime+=System.nanoTime-start
		//STRATEGY
		if (phase == 2) {
			if (!finalResult) return finalResult
			else {
				finalResult = isSatisfiable(matches, 3)
			}
		}
		return finalResult
	}
	
	def selectSolver(int phase) {
		if (strategy === ExplorationStrategy.CrossingScenario){
			if (phase == 1) return "z3"
			else return "dreal"
		}
		return "irrelevant"
	}
	
	def int determinePhase() {
		// >= 0 : an actual phase
		// -1 : take all numeric constraints
		// -2 : SKIP (take no numeric constraints)
		if (strategy == ExplorationStrategy.CrossingScenario) {
//			//if has structural (non-WF) fitness issues, skip numeric handling
//			val IObjective ob = threadContext.objectives.filter[it instanceof ModelGenerationCompositeObjective].get(0)
//			val compo = ob as ModelGenerationCompositeObjective
//			if (compo.getNonWFFitness(threadContext) > 0) {
//				println("bootleg numeric-skip")
//				return -2;
//			}
			
			//assumikng standard input, w/ visinBlocked and CollisionExists between pre-included actors
			val PartialInterpretation head = threadContext.getModel() as PartialInterpretation;
			val List<PartialRelationInterpretation> relations = head.getPartialrelationinterpretation();
			var boolean foundBlockedBy = false;
			
			var int numActors;
			var int numPlacedOn;
			var int numPlacements = 0;
			
			for (PartialRelationInterpretation rel : relations) {
				if(rel.getInterpretationOf().getName().equals("actors reference CrossingScenario")) {
					numActors = rel.relationlinks.size
				}
				
				if(rel.getInterpretationOf().getName().equals("placedOn reference Actor")) {
					numPlacedOn = rel.relationlinks.size
				}
				
				if(rel.getInterpretationOf().getName().equals("xPos attribute Actor")) {
					for (RelationLink link : rel.getRelationlinks()) {
						val PrimitiveElement param2 = (link as BinaryElementRelationLink).getParam2() as PrimitiveElement;
						if (param2.isValueSet()) {
							numPlacements++
						}
					}
				}
				
				if(rel.getInterpretationOf().getName().equals("blockedBy reference VisionBlocked")) {
					if (!rel.getRelationlinks().isEmpty()) {
						foundBlockedBy = true
					}
				}
			}
			val boolean unplacedActorExists = numPlacements < numActors
			//it means that there is no blockedBy
			//so we are at most at phase 2
			if (numPlacedOn == 1 && numPlacements == 0) return 1
			if (foundBlockedBy && unplacedActorExists) return 2
			if (numPlacements == numActors) return 3;
			return -2;			
		}
		return -1;
	}
	
	def getConstraintWhitelist(int phase) {
		val List<String> wl = newArrayList
		//null return means accept everything
		if (strategy === ExplorationStrategy.None){
			return null
		} else if (strategy === ExplorationStrategy.CrossingScenario){
			/*
						"define_placedOn_actorOnVerticalLane",
						"define_placedOn_actorOnHorizLane",
						
						"define_actor_maxXp",
						"define_actor_minXp",
						"define_actor_maxYp",
						"define_actor_minYp",
						
						"define_actor_wrtLane",
							
						"define_actor_minimumDistance",
						
						"define_actor_actorOnVertLaneHasxSpeed0",
						"define_actor_actorOnVertLaneMinYs",
						"define_actor_actorOnVertLaneMaxYs",
						"define_actor_actorOnHorizLaneHasySpeed0",
						"define_actor_actorOnHorizLaneMinXs",
						"define_actor_actorOnHorizLaneMaxXs",
						
						"define_actor_pedestrianWidth",
						"define_actor_pedestrianLength",
						"define_actor_vehicleWidth",
						"define_actor_vehicleWidth",
						"define_actor_vehicleLength",
						"define_actor_vehicleLength",
						
						"collisionExists_timeWithinBound",
						"collisionExists_timeNotNegative",
						"collisionExists_defineCollision_y1",
						"collisionExists_defineCollision_y2",
						"collisionExists_defineCollision_x1",
						"collisionExists_defineCollision_x2",
						
						"visionBlocked_ites_notOnSameVertLine",
						"visionBlocked_ites_top",
						"visionBlocked_ites_bottom",
						"visionBlocked_xdistBSlargerThanxdistTS",
						"visionBlocked_xdistBTlargerThanxdistST",
						"visionBlocked_ydistBSlargerThanydistTS",
						"visionBlocked_ydistBTlargerThanydistST"
			 */
			
			//HINTS:
			//define_actor_wrtLane
			//28.5 is structural hint
			switch (phase) {
				case 1: {					
					wl.addAll(#[
						"define_placedOn_actorOnVerticalLane",
						"define_placedOn_actorOnHorizLane",
						
						"define_actor_maxXp",
						"define_actor_minXp",
						"define_actor_maxYp",
						"define_actor_minYp",
						
						"define_actor_pedestrianWidth",
						"define_actor_pedestrianLength",
						"define_actor_vehicleWidth",
						"define_actor_vehicleWidth",
						"define_actor_vehicleLength",
						"define_actor_vehicleLength"

					])
				}
				case 2: {
					wl.addAll(#[
						
						"define_placedOn_actorOnVerticalLane",
						"define_placedOn_actorOnHorizLane",
						
						"define_actor_maxXp",
						"define_actor_minXp",
						"define_actor_maxYp",
						"define_actor_minYp",
							
						"define_actor_minimumDistance",
						
						"define_actor_pedestrianWidth",
						"define_actor_pedestrianLength",
						"define_actor_vehicleWidth",
						"define_actor_vehicleWidth",
						"define_actor_vehicleLength",
						"define_actor_vehicleLength",
						
						"visionBlocked_ites_notOnSameVertLine",
						"visionBlocked_ites_top",
						"visionBlocked_ites_bottom",
						"visionBlocked_xdistBSlargerThanxdistTS",
						"visionBlocked_xdistBTlargerThanxdistST",
						"visionBlocked_ydistBSlargerThanydistTS",
						"visionBlocked_ydistBTlargerThanydistST"
					])				
				}
				case 3: {
					wl.addAll(#[
						
						"define_placedOn_actorOnVerticalLane",
						"define_placedOn_actorOnHorizLane",
						
						"define_actor_maxXp",
						"define_actor_minXp",
						"define_actor_maxYp",
						"define_actor_minYp",
							
						"define_actor_minimumDistance",
						
						"define_actor_actorOnVertLaneHasxSpeed0",
						"define_actor_actorOnVertLaneMinYs",
						"define_actor_actorOnVertLaneMaxYs",
						"define_actor_actorOnHorizLaneHasySpeed0",
						"define_actor_actorOnHorizLaneMinXs",
						"define_actor_actorOnHorizLaneMaxXs",
						
						"define_actor_pedestrianWidth",
						"define_actor_pedestrianLength",
						"define_actor_vehicleWidth",
						"define_actor_vehicleWidth",
						"define_actor_vehicleLength",
						"define_actor_vehicleLength",
						
						"collisionExists_timeWithinBound",
						"collisionExists_timeNotNegative",
						"collisionExists_defineCollision_y1",
						"collisionExists_defineCollision_y2",
						"collisionExists_defineCollision_x1",
						"collisionExists_defineCollision_x2"
					])
				}
				default: {
					//this is for 3 if we implement 4
//					bl.addAll(#[0, 1, 2, 3, 4, 5, 6, 7])
					
					//this is for 4 if we do it
					wl.addAll(#[])
					return null
				}
			}
		}		
		return wl
	}
	
	def getNeedsFilling(){
		if (strategy == ExplorationStrategy.CrossingScenario) return true
		return false
	}
	
	def getCode(HashMap<PConstraint, Iterable<Object[]>> propagatedConstraints) {
		val start = System.nanoTime
		val involvedObjects = new LinkedHashSet(propagatedConstraints.values.flatten.map[toList].flatten.toList).toList
		val res = new LinkedHashMap(propagatedConstraints.mapValues[matches | matches.map[objects | objects.map[object | involvedObjects.indexOf(object)].toList]])
		this.cachingTime += System.nanoTime-start
		return res
	}
	
	def fillSolutionCopy(Map<EObject, EObject> trace) {
		//No need to do a final check to fill if we are using a strategy
		if (strategy === ExplorationStrategy.CrossingScenario) return
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
				val solution = translator.delegateGetSolution(dataObjects,propagatedConstraints, "dreal")
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
	def protected dispatch fillWithValue(RealElement e, Object value) {e.valueSet=true e.value=value as Double }
	def protected dispatch fillWithValue(StringElement e, Object value) {e.valueSet=true e.value=value as String}
	
	def protected fillWithPartialSolutionsDirectly(List<PrimitiveElement> elements, Map<PrimitiveElement, Number> solution) {
		for(element : elements) {
			//we allow overwriting of already set variables
			if(solution.containsKey(element)) {
				val value = solution.get(element)
				if (value !== null){
					element.fillWithValue(value)
				}
			}
		}
	}
}