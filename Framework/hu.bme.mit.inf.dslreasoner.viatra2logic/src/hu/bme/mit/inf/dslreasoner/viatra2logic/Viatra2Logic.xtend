package hu.bme.mit.inf.dslreasoner.viatra2logic

import com.google.inject.Injector
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.emf.EMFQueryMetaContext
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PDisjunction
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.viatra.query.runtime.matchers.psystem.rewriters.PBodyNormalizer
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data class ViatraQuerySetDescriptor {
	val List<? extends IQuerySpecification<?>> patterns
	val Set<? extends IQuerySpecification<?>> validationPatterns
	val Map<IQuerySpecification<?>,EStructuralFeature> derivedFeatures
}
class Viatra2LogicTrace {
	public val Map<PQuery, PDisjunction> query2Disjunction = new HashMap
	public val Map<PQuery, RelationDefinition> query2Relation = new HashMap
	public val Map<PQuery, TransfomedViatraQuery> query2Annotation = new HashMap
	public val Map<Pair<PQuery,PParameter>, Variable> parameter2Variable = new HashMap
}
class Viatra2LogicConfiguration {
	public var normalize = true
}

class Viatra2Logic {
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	val extension Viatra2LogicAnnotationsFactory factory = Viatra2LogicAnnotationsFactory.eINSTANCE
	val normalizer = new PBodyNormalizer(EMFQueryMetaContext.DEFAULT)
	val Viatra2LogicTypeInferer typeInferer
	
	val Ecore2Logic ecore2Logic
	Constraint2Logic constraint2Logic
	
	new(Ecore2Logic ecore2Logic, Injector injector) {
		this.ecore2Logic = ecore2Logic
		this.typeInferer = new Viatra2LogicTypeInferer(ecore2Logic, injector)
		this.constraint2Logic = new Constraint2Logic(ecore2Logic)
	}
	
	new(Ecore2Logic ecore2Logic) {
		this(ecore2Logic, null)
	}
	
	def TracedOutput<LogicProblem,Viatra2LogicTrace> transformQueries(
		ViatraQuerySetDescriptor queries,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		// Create trace
		val viatra2LogicTrace = new Viatra2LogicTrace
		
		// Translation works on PQueries. QuerySpecification -> PQuery.
		val pQueries = queries.patterns.map[it.internalQueryRepresentation]
		
		// If requested, the queries are normalized
		for(query: pQueries) {
			val disjunction =  normalizer.rewrite(query)
			viatra2LogicTrace.query2Disjunction.put(query,disjunction)
		}
		
		// The types are calculated
		val types = typeInferer.inferTypes(pQueries,ecore2LogicTrace,viatra2LogicTrace)
		
		// First, the signature of the queries are translated, ...
		for(query: pQueries) {
			try {
				this.transformQueryHeader(query,types,ecore2LogicTrace,viatra2LogicTrace,config)
			} catch(IllegalArgumentException e) {
				throw new IllegalArgumentException('''
					Unable to translate query "«query.fullyQualifiedName»".
					Reason: «e.class.simpleName», «e.message»''',e)
			}
		}
		
		// ...then the bodies, ...
		for(query: pQueries) {
			try {
				this.transformQuerySpecification(query,types,ecore2LogicTrace,viatra2LogicTrace,config)
			} catch (IllegalArgumentException e){
				throw new IllegalArgumentException('''
					Unable to translate query "«query.fullyQualifiedName»".
					Reason: «e.class.simpleName», «e.message»''',e)
			}
		}
		
		// ... and finally, the annotations.
		transformQueryConstraints(
			queries.validationPatterns.map[internalQueryRepresentation],
			queries.derivedFeatures,
			ecore2LogicTrace,viatra2LogicTrace)
		
		return new TracedOutput(ecore2LogicTrace.output,viatra2LogicTrace)
	}
	
	def protected transformQueryHeader(
		PQuery pquery,
		Viatra2LogicTypeResult types,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val relationName = '''pattern «pquery.fullyQualifiedName.replace('.',' ')»'''		
		val parameters = new ArrayList<Variable>(pquery.parameters.size)
		for(vParam: pquery.parameters) {
			val parameterName = '''parameter «vParam.name»'''
			val parameterType = types.getType(pquery,vParam)
			if(parameterType === null) {
				throw new AssertionError('''null type for parameter «vParam.name» in pattern «pquery.fullyQualifiedName»''')
			}
			val lParam = createVar(parameterName,parameterType)
			viatra2LogicTrace.parameter2Variable.put(pquery->vParam,lParam)
			parameters+=lParam
		}
		val lRelation = RelationDefinition(relationName,parameters,null)
		
		viatra2LogicTrace.query2Relation.put(pquery,lRelation);
		ecore2LogicTrace.output.relations += lRelation
		
		val annotation = createTransfomedViatraQuery => [
			it.target = lRelation
			it.patternFullyQualifiedName = pquery.fullyQualifiedName
			it.patternPQuery = pquery
			it.optimizedDisjunction = viatra2LogicTrace.query2Disjunction.get(pquery)
		]
		viatra2LogicTrace.query2Annotation.put(pquery,annotation)
		ecore2LogicTrace.output.annotations += annotation
		
		return lRelation
	}
	
	def protected transformQuerySpecification(
		PQuery pquery,
		Viatra2LogicTypeResult types,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val disjunction = pquery.lookup(viatra2LogicTrace.query2Disjunction)
	
		val translatedBodies = new ArrayList(disjunction.bodies.size)
		for(body : disjunction.bodies) {
			translatedBodies+=body.transformBody(types,ecore2LogicTrace,viatra2LogicTrace,config)
		}
		val relation = pquery.lookup(viatra2LogicTrace.query2Relation)
		relation.value = Or(translatedBodies)
	}
	
	def transformQueryConstraints(
		Iterable<PQuery> validationPatterns,
		Map<IQuerySpecification<?>,EStructuralFeature> derivedFeatures,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace)
	{
		for(pquery : validationPatterns) {
			val targetRelation = pquery.lookup(viatra2LogicTrace.query2Relation)
			val constraint = Assertion('''errorpattern «pquery.fullyQualifiedName.replace('.',' ')»''',
				Forall[
					for(param: targetRelation.parameters) {
						addVar('''p«targetRelation.parameters.indexOf(param)»''',
							EcoreUtil::copy(param))
					}
					Not(targetRelation.call(it.variables))
				]
			)
			val annotation = createTransformedViatraWellformednessConstraint => [
				it.query = pquery.lookup(viatra2LogicTrace.query2Annotation)
				it.target = constraint
			]
			ecore2LogicTrace.output.add(constraint)
			ecore2LogicTrace.output.annotations.add(annotation)
		}
		for(derivedFeature : derivedFeatures.entrySet) {
			val relationDefinition = derivedFeature.key.internalQueryRepresentation.lookup(viatra2LogicTrace.query2Relation)
			val feature = derivedFeature.value
			if(feature instanceof EAttribute) {
				val declaration = ecore2Logic.relationOfAttribute(ecore2LogicTrace.trace,feature)
				relationDefinition.defines = declaration
			} else if(feature instanceof EReference) {
				val declaration = ecore2Logic.relationOfReference(ecore2LogicTrace.trace,feature)
				relationDefinition.defines = declaration
			} else throw new IllegalArgumentException('''Unknown feature: «feature»''')
			val annotation = createDefinedByDerivedFeature => [
				it.target = relationDefinition.defines
				it.query = derivedFeature.key.internalQueryRepresentation.lookup(viatra2LogicTrace.query2Annotation)
			]
			ecore2LogicTrace.output.annotations+=annotation
		}
	}
	
	def transformBody(PBody body,
		Viatra2LogicTypeResult types,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val variable2Variable = new HashMap
		// Parameter variables
		for(parameter : body.symbolicParameters) {
			val param = parameter.patternParameter
			val variable = parameter.parameterVariable
			variable2Variable.put(variable,(body.pattern->param).lookup(viatra2LogicTrace.parameter2Variable))
		}
		// Inner Variables
		val innerPositiveVariables = new LinkedList
		val innerNegativeVariables = new LinkedList
		val innerAggreatedVariables = new LinkedList
		//println(body.uniqueVariables)
		for(innerVariable : body.uniqueVariables) {
			
			if(!variable2Variable.containsKey(innerVariable)) {
				if(innerVariable.aggregateOnly) {
					// do not create variable
					innerAggreatedVariables.add(innerVariable)
					variable2Variable.put(innerVariable,null)
				} else {
					val name = '''variable «innerVariable.name.normalizeName»'''
					val logicType = types.getType(body,innerVariable)
					if(logicType === null) {
						throw new IllegalArgumentException('''Variable «innerVariable.name.normalizeName» has no type!''')
					}
					val logicVariable = createVar(name,logicType)
					if(innerVariable.negativeOnly) {
						innerNegativeVariables += logicVariable
					} else {
						innerPositiveVariables += logicVariable
					}
					variable2Variable.put(innerVariable,logicVariable)
					body.pattern.lookup(viatra2LogicTrace.query2Annotation).variableTrace += createVariableMapping=>[
						it.sourcePVariable = innerVariable
						it.targetLogicVariable = logicVariable
					]
				}
			}
		}
		
		val translatedConstraints = body.constraints.map[
			constraint2Logic.transformConstraint(it,
				ecore2LogicTrace,viatra2LogicTrace,variable2Variable,config)
		].filterNull
		val allConstraintIsSatisfied = And(translatedConstraints)
		val allNegativeVariablesAreSatisfied = if(innerNegativeVariables.empty) {
			allConstraintIsSatisfied
		} else {
			Forall(innerNegativeVariables,allConstraintIsSatisfied);
		}
		val allVariablesAreExisting = if(innerPositiveVariables.empty) {
			allNegativeVariablesAreSatisfied
		} else {
			Exists(innerPositiveVariables,allNegativeVariablesAreSatisfied);
		}
	
		return allVariablesAreExisting
	}
	
	def private normalizeName(String variableName) {
		return variableName.replaceAll("[\\W]|_", "")
	}

	def isNegativeOnly(PVariable variable) {
		if(variable.referringConstraints.size == 1) {
			val PConstraint onlyConstraint = variable.referringConstraints.head
			if(onlyConstraint instanceof NegativePatternCall) {
				return true
			} else {
				return false
			}
		} else {
			return false
		}
	}
	
	def isAggregateOnly(PVariable variable) {
		if(variable.referringConstraints.size == 1) {
			val PConstraint onlyConstraint = variable.referringConstraints.head
			if(onlyConstraint instanceof AggregatorConstraint) {
				return true
			} else if(onlyConstraint instanceof PatternMatchCounter) {
				return true
			} else {
				return false
			}
		} else {
			return false
		}
	}
}