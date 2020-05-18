package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.LinkedHashMap
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference

class UnfinishedIndexer {
	val PatternGenerator base
	
	new(PatternGenerator patternGenerator) {
		this.base = patternGenerator
	}
	
	def generateUnfinishedWfQueries(LogicProblem problem, Map<String,PQuery> fqn2PQuery) {
		val wfQueries = base.wfQueries(problem)
		'''
		«FOR wfQuery: wfQueries»
			pattern unfinishedBy_«base.canonizeName(wfQuery.target.name)»(problem:LogicProblem, interpretation:PartialInterpretation,
				«FOR param : wfQuery.patternFullyQualifiedName.lookup(fqn2PQuery).parameters SEPARATOR ', '»var_«param.name»«ENDFOR»)
			{
				«base.relationDefinitionIndexer.referPattern(
					wfQuery.patternFullyQualifiedName.lookup(fqn2PQuery),
					wfQuery.patternFullyQualifiedName.lookup(fqn2PQuery).parameters.map['''var_«it.name»'''],
					Modality.CURRENT,
					true,false)»
			}
		«ENDFOR»
		'''
	}
	def getUnfinishedWFQueryNames(LogicProblem problem) {
		val wfQueries = base.wfQueries(problem)
		val map = new LinkedHashMap
		for(wfQuery : wfQueries) {
			map.put(wfQuery.target,'''unfinishedBy_«base.canonizeName(wfQuery.target.name)»''')
		}
		return map
	}
	def generateUnfinishedMultiplicityQueries(LogicProblem problem, Map<String,PQuery> fqn2PQuery) {
		val lowerMultiplicities = base.lowerMultiplicities(problem)
		return '''
		«FOR lowerMultiplicity : lowerMultiplicities»
			pattern «unfinishedMultiplicityName(lowerMultiplicity)»(problem:LogicProblem, interpretation:PartialInterpretation, relationIterpretation:PartialRelationInterpretation, object:DefinedElement,numberOfExistingReferences) {
				find interpretation(problem,interpretation);
				PartialInterpretation.partialrelationinterpretation(interpretation,relationIterpretation);
				PartialRelationInterpretation.interpretationOf.name(relationIterpretation,"«lowerMultiplicity.relation.name»");
				«base.typeIndexer.referInstanceOf(lowerMultiplicity.firstParamTypeOfRelation,Modality::MUST,"object")»
				numberOfExistingReferences == count «base.referRelation(lowerMultiplicity.relation,"object","_",Modality.MUST,fqn2PQuery)»
«««				numberOfExistingReferences < «lowerMultiplicity.lower»;
«««				missingMultiplicity == eval(«lowerMultiplicity.lower»-numberOfExistingReferences);
			}
		«ENDFOR»
		'''
	}
	def String unfinishedMultiplicityName(LowerMultiplicityAssertion lowerMultiplicityAssertion) 
		'''unfinishedLowerMultiplicity_«base.canonizeName(lowerMultiplicityAssertion.relation.name)»'''
	
	//def public referUnfinishedMultiplicityQuery(LowerMultiplicityAssertion lowerMultiplicityAssertion)
	//	'''find «unfinishedMultiplicityName(lowerMultiplicityAssertion)»(problem, interpretation ,object, missingMultiplicity);'''
	
	def getFirstParamTypeOfRelation(LowerMultiplicityAssertion lowerMultiplicityAssertion) {
		val parameters = lowerMultiplicityAssertion.relation.parameters
		if(parameters.size == 2) {
			val firstParam = parameters.get(0)
			if(firstParam instanceof ComplexTypeReference) {
				return firstParam.referred
			}
		}
	}
	
	def getUnfinishedMultiplicityQueries(LogicProblem problem) {
		val lowerMultiplicities = base.lowerMultiplicities(problem)
		val map = new LinkedHashMap
		for(lowerMultiplicity : lowerMultiplicities) {
			map.put(lowerMultiplicity.relation,unfinishedMultiplicityName(lowerMultiplicity)->lowerMultiplicity.lower)
		}
		return map
	}
}
