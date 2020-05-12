package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.PropagationModality
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.LinkedList
import java.util.List
import org.eclipse.xtend.lib.annotations.Data
import java.util.HashMap
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import java.util.Comparator
import java.util.ArrayList
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PDisjunction
import java.util.LinkedHashSet

@Data class UnitPropagation {
	val PQuery q
	val PConstraint c
	val PropagationModality pm
	val Modality m3
}
@Data
class UnitPropagationPreconditionGenerationResult {
	List<CharSequence> definitions= new LinkedList
	Map<UnitPropagation,String> unitPropagation2PatternName = new HashMap
	Map<PConstraint,String> constraintOccurence2Name = new HashMap
	
	def registerQuery(PQuery q, PConstraint c, PropagationModality pm, Modality m3, String patternName, CharSequence definition) {
		val key = new UnitPropagation(q,c,pm,m3)
		definitions += definition
		unitPropagation2PatternName.put(key,patternName)
	}
	def registerUnsatQuery(PQuery q, PConstraint c, PropagationModality pm, Modality m3) {
		val key = new UnitPropagation(q,c,pm,m3)
		unitPropagation2PatternName.put(key,null)
	}
	def contains(PQuery q, PConstraint c, PropagationModality pm, Modality m3) {
		val key = new UnitPropagation(q,c,pm,m3)
		return unitPropagation2PatternName.containsKey(key)
	}
	def getName(PQuery q, PConstraint c, PropagationModality pm, Modality m3) {
		val key = new UnitPropagation(q,c,pm,m3)
		return key.lookup(unitPropagation2PatternName)
	}
	def isDefined(PQuery q, PConstraint c, PropagationModality pm, Modality m3) {
		val key = new UnitPropagation(q,c,pm,m3)
		return unitPropagation2PatternName.get(key) !== null
	}
}
@Data
class UnitPropagationPreconditionFinalResult {
	CharSequence definitions
	HashMap<PConstraint,String> constraint2MustPreconditionName
	HashMap<PConstraint,String> constraint2CurrentPreconditionName
}

class UnitPropagationPreconditionGenerator {
	val PatternGenerator base
	val PConstraintTransformer constraintTransformer;
	
	new(PatternGenerator patternGenerator) {
		this.base = patternGenerator
		this.constraintTransformer = new PConstraintTransformer(base.relationDefinitionIndexer)
	}
	
	def generateUnitPropagationRules(
		LogicProblem problem,
		Iterable<RelationDefinition> relations,
		Map<String,PQuery> fqn2PQuery)
	{
		// Create an empty result
		val res = new UnitPropagationPreconditionGenerationResult		
		val wfs = base.wfQueries(problem)//.map[it.patternPQuery]
		val Map<PConstraint,List<Pair<String,Integer>>> mainMustPropagationNames = new HashMap
		val Map<PConstraint,List<Pair<String,Integer>>> mainCurrentPropagationNames = new HashMap
		for(wf : wfs) {
			val query = wf.patternPQuery as PQuery
			val relation = wf.target
			val allReferredChecks = allReferredConstraints(relation,query).filter(ExpressionEvaluation)
			
			for(referredCheck : allReferredChecks) {
				val mustPropagationPrecondition = getOrGeneratePropagationRule(res,relation,query,referredCheck,PropagationModality::UP, Modality::MUST)
				val currentPropagationPrecondition = getOrGeneratePropagationRule(res,relation,query,referredCheck,PropagationModality::UP, Modality::CURRENT)
				if(!mainMustPropagationNames.containsKey(referredCheck)) {
					mainMustPropagationNames.put(referredCheck,new LinkedList)
				}
				if(!mainCurrentPropagationNames.containsKey(referredCheck)) {
					mainCurrentPropagationNames.put(referredCheck,new LinkedList)
				}
				if(mustPropagationPrecondition !== null) {
					mainMustPropagationNames.get(referredCheck).add(mustPropagationPrecondition->query.parameterNames.size)
				}
				if(currentPropagationPrecondition !== null) {
					mainCurrentPropagationNames.get(referredCheck).add(currentPropagationPrecondition->query.parameterNames.size)
				}
			}
		}
		val preconditions = new LinkedList
		val constraint2MustPrecondition = new HashMap
		val constraint2CurrentPrecondition = new HashMap
		for(entry : mainMustPropagationNames.entrySet) {
			val name = '''UPMUSTPropagate_«res.getOrGenerateConstraintName(entry.key)»''';
			val def = '''
			pattern «name»(«FOR index : 1..entry.key.arity SEPARATOR ", "»«canonizeName(index,PropagationModality::UP)»«ENDFOR»)
				«FOR propagation : entry.value SEPARATOR " or "»
					{ find «propagation.key»(problem,interpretation,«FOR index : 0..<propagation.value SEPARATOR ','»_«ENDFOR»,«FOR index : 1..entry.key.arity SEPARATOR ", "»«canonizeName(index,PropagationModality::UP)»«ENDFOR»); }
				«ENDFOR»'''
			preconditions+=def
			constraint2MustPrecondition.put(entry.key,name)
		}
		for(entry : mainCurrentPropagationNames.entrySet) {
			val name = '''UPCurrentPropagate_«res.getOrGenerateConstraintName(entry.key)»''';
			val def = '''
			pattern «name»(«FOR index : 1..entry.key.arity SEPARATOR ", "»«canonizeName(index,PropagationModality::UP)»«ENDFOR»)
				«FOR propagation : entry.value SEPARATOR " or "»
					{ find «propagation.key»(problem,interpretation,«FOR index : 0..<propagation.value SEPARATOR ','»_«ENDFOR»,«FOR index : 1..entry.key.arity SEPARATOR ", "»«canonizeName(index,PropagationModality::UP)»«ENDFOR»); }
				«ENDFOR»'''
			preconditions+=def
			constraint2CurrentPrecondition.put(entry.key,name)
		}
		
		val definitions = '''
			«FOR def : res.definitions»
				«def»
			«ENDFOR»
			
			// Collected propagation preconditions:
			
			«FOR predondition : preconditions»
				«predondition»
			«ENDFOR»
		'''
		return new UnitPropagationPreconditionFinalResult(definitions,constraint2MustPrecondition,constraint2CurrentPrecondition)
	}
	def allReferredConstraints(Relation relation, PQuery query) {
		val allReferredQueries = query.allReferredQueries
		val problem = relation.eContainer as LogicProblem
		val constraints = new LinkedHashSet
		for(referredQuery: #[query]+allReferredQueries) {
			val referredRelation = problem.annotations.filter(TransfomedViatraQuery).filter[it.patternPQuery === referredQuery].head.target
			val bodies = (referredRelation.annotations.filter(TransfomedViatraQuery).head.optimizedDisjunction as PDisjunction).bodies
			constraints.addAll(bodies.map[getConstraints].flatten)
		}
		
		return constraints
	}
	
	def getOrGeneratePropagationRule(UnitPropagationPreconditionGenerationResult res, Relation relation, PQuery q, PConstraint c, PropagationModality pm, Modality m3) {
		if(res.contains(q,c,pm,m3)) {
			return res.getName(q,c,pm,m3)
		} else {
			res.generatePropagationRule(relation,q,c,pm,m3)
			return res.getName(q,c,pm,m3)
		}
	}
	def getOrGenerateConstraintName(UnitPropagationPreconditionGenerationResult res, PConstraint c){
		if(res.constraintOccurence2Name.containsKey(c)) {
			return res.constraintOccurence2Name.get(c)
		} else {
			val constraintName = '''Constraint«res.constraintOccurence2Name.size»'''
			res.constraintOccurence2Name.put(c,constraintName)
			return constraintName
		}
	}
	
	def void generatePropagationRule(UnitPropagationPreconditionGenerationResult res, Relation relation, PQuery q, PConstraint c, PropagationModality pm, Modality m3) {
		val name = relationDefinitionName(res,relation,q,c,pm,m3)
		val constraintArity = c.arity
		val bodies = (relation.annotations.filter(TransfomedViatraQuery).head.optimizedDisjunction as PDisjunction).bodies
		val generatedBodies = new LinkedList
		for(body : bodies) {
			if(body.constraints.contains(c)) {
				if(pm === PropagationModality::UP) {
					generatedBodies += '''
						// Original Constraints
						«FOR constraint : body.constraints.filter[it !== c]»
							«this.constraintTransformer.transformConstraint(constraint,m3,relation.annotations.filter(TransfomedViatraQuery).head.variableTrace)»
						«ENDFOR»
						// Propagation for constraint
						«this.constraintTransformer.transformConstraintUnset(c as ExpressionEvaluation,relation.annotations.filter(TransfomedViatraQuery).head.variableTrace)»
						// Matching variables
						«this.propagateVariables(c,pm)»
					'''
				}
				// Otherwise, for PropagationModality::DOWN, the body cannot be satisfied
			} else {
				val positives = body.constraints.filter(PositivePatternCall)
				for(positive: positives) {
					val referredPQuery = positive.referredQuery
					val referredRelation = (relation.eContainer as LogicProblem)
						.annotations.filter(TransfomedViatraQuery).filter[it.patternPQuery === referredPQuery].head.target
					if(allReferredConstraints(referredRelation,referredPQuery).toSet.contains(c)) {
						val referredName = getOrGeneratePropagationRule(res,referredRelation,referredPQuery,c,pm,m3)
						if(referredName !== null) {
							generatedBodies += '''
								// Original Constraints
								«FOR constraint : body.constraints.filter[it !== positive]»
									«this.constraintTransformer.transformConstraint(constraint,m3,relation.annotations.filter(TransfomedViatraQuery).head.variableTrace)»
								«ENDFOR»
								// Propagation for constraint referred indirectly from this pattern through «referredName»
								find «referredName»(problem, interpretation,
									«FOR index : 0..<referredPQuery.parameters.size SEPARATOR ", "»«positive.getVariableInTuple(index).canonizeName»«ENDFOR»,
									«FOR index : 1..c.arity SEPARATOR ", "»«canonizeName(index,pm)»«ENDFOR»);
							'''
						}
						// Otherwise, if the referred pattern is not satisfiable, this pattern is not satisfiable either
					}
				}
				
				val negatives = body.constraints.filter(NegativePatternCall)
				for(negative : negatives) {
					val referredPQuery = negative.referredQuery
					val referredRelation = (relation.eContainer as LogicProblem)
						.annotations.filter(TransfomedViatraQuery).filter[it.patternPQuery === referredPQuery].head.target
					if(allReferredConstraints(referredRelation,referredPQuery).toSet.contains(c)) {
						val referredName = getOrGeneratePropagationRule(res,referredRelation,referredPQuery,c,pm,m3.dual)
						if(referredName !== null) {
							generatedBodies += '''
								// Original Constraints
								«FOR constraint : body.constraints.filter[it !== negative]»
									«this.constraintTransformer.transformConstraint(constraint,m3,relation.annotations.filter(TransfomedViatraQuery).head.variableTrace)»
								«ENDFOR»
								// Propagation for constraint referred indirectly from this pattern through «referredName»
								find «referredName»(problem, interpretation,
									«FOR index : 0..<referredPQuery.parameters.size SEPARATOR ", "»«(negative.actualParametersTuple.get(index) as PVariable).canonizeName»«ENDFOR»,
									«FOR index : 1..c.arity SEPARATOR ", "»«canonizeName(index,pm)»«ENDFOR»);
							'''
						} else {
							generatedBodies += '''
								// Original Constraints
								«FOR constraint : body.constraints.filter[it !== negative]»
									«this.constraintTransformer.transformConstraint(constraint,m3,relation.annotations.filter(TransfomedViatraQuery).head.variableTrace)»
								«ENDFOR»
								// Propagation for constraint referred indirectly from this pattern through «referredName»,
								// which was unsatisfiable
							'''
						}
					}
				}
			}
		}
		
		// Register the result
		if(generatedBodies.empty) {
			res.registerUnsatQuery(q,c,pm,m3)
		} else {
			val definition = '''
				private pattern «name»(
					problem:LogicProblem, interpretation:PartialInterpretation,
					«FOR param :  q.parameters SEPARATOR ', '»var_«param.name»«ENDFOR»,
					«FOR arity : 1..constraintArity SEPARATOR ', '»«canonizeName(arity,pm)»«ENDFOR»)
				«FOR generatedBody: generatedBodies SEPARATOR " or "»{
				«generatedBody»
				}«ENDFOR»
			'''
			res.registerQuery(q,c,pm,m3,name,definition)
		}
	}

	private def String relationDefinitionName(UnitPropagationPreconditionGenerationResult res, Relation relation, PQuery q, PConstraint c, PropagationModality pm, Modality m3)
		'''«pm.name»«m3.name»Propagate«res.getOrGenerateConstraintName(c)»_«base.canonizeName(relation.name)»'''
	
	def canonizeName(PVariable v) {
		return '''«IF v.referringConstraints.size == 1»_«ENDIF»var_«v.name.replaceAll("\\W","")»'''
	}
	
	def canonizeName(int index, PropagationModality m) {
		return '''«m.name.toLowerCase»_«index»'''
	}
	
	def dispatch propagateVariables(ExpressionEvaluation c, PropagationModality m) {
		val comparator = new Comparator<PVariable>(){
			override compare(PVariable o1, PVariable o2) {
				o1.name.compareTo(o2.name)
			}
		}
		val variablesInOrder = new ArrayList(c.affectedVariables)
		variablesInOrder.toList.sort(comparator)
		return '''«FOR variableIndex : 1..variablesInOrder.size»«variablesInOrder.get(variableIndex-1).canonizeName»==«canonizeName(variableIndex,m)»;«ENDFOR»'''
	}
	def dispatch propagateVariables(PConstraint c, PropagationModality m) {
		throw new UnsupportedOperationException('''Constraint not supported: «c.class.simpleName»''')
	}
	
	def dispatch arity(ExpressionEvaluation c) {
		c.affectedVariables.size
	}
	def dispatch arity(PConstraint c) {
		throw new UnsupportedOperationException('''Constraint not supported: «c.class.simpleName»''')
	}
}