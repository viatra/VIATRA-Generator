package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationMultiplicityConstraint
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data
class UnifinishedMultiplicityQueryNames {
	val String existingMultiplicityQueryName
	val String existingInverseMultiplicityQueryName
}

class UnfinishedIndexer {
	val PatternGenerator base
	val boolean indexUpperMultiplicities

	new(PatternGenerator patternGenerator, boolean indexUpperMultiplicities) {
		this.base = patternGenerator
		this.indexUpperMultiplicities = indexUpperMultiplicities
	}

	def generateUnfinishedWfQueries(LogicProblem problem, Map<String, PQuery> fqn2PQuery) {
		val wfQueries = base.wfQueries(problem)
		'''
			«FOR wfQuery : wfQueries»
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
		for (wfQuery : wfQueries) {
			map.put(wfQuery.target, '''unfinishedBy_«base.canonizeName(wfQuery.target.name)»''')
		}
		return map
	}

	def generateUnfinishedMultiplicityQueries(List<RelationMultiplicityConstraint> constraints,
		Map<String, PQuery> fqn2PQuery) '''
		«FOR constraint : constraints»
			«IF constraint.shouldIndexExistingMultiplicites(indexUpperMultiplicities)»
				private pattern «existingMultiplicityName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement, numberOfExistingReferences:java Integer«IF constraint.shouldIndexRepairMultiplcities(indexUpperMultiplicities)», numberOfRepairMatches: java Integer«ENDIF») {
					find interpretation(problem,interpretation);
					find mustExist(problem,interpretation,object);
					«base.typeIndexer.referInstanceOf(constraint.sourceType,Modality::MUST,"object")»
					numberOfExistingReferences == count «base.referRelation(constraint.relation,"object","_",Modality.MUST,fqn2PQuery)»
					«IF constraint.shouldIndexRepairMultiplcities(indexUpperMultiplicities)»
						numberOfRepairMatches == count find «repairMatchName(constraint)»(problem, interpretation, object, _);
					«ENDIF»
				}
			«ENDIF»
			
			«IF constraint.shouldIndexRepairMatches(indexUpperMultiplicities)»
				private pattern «repairMatchName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, source:DefinedElement, target:DefinedElement) {
					«IF constraint.containment || constraint.container»
						«repairMatchFallback(constraint, fqn2PQuery)»
					«ELSEIF base.isRepresentative(constraint.relation, constraint.inverseRelation) && constraint.relation instanceof RelationDeclaration»
						«base.relationRefinementGenerator.referRefinementQuery(constraint.relation as RelationDeclaration, constraint.inverseRelation, "_", "_", "source", "target")»
					«ELSEIF base.isRepresentative(constraint.inverseRelation, constraint.relation) && constraint.inverseRelation instanceof RelationDeclaration»
						«base.relationRefinementGenerator.referRefinementQuery(constraint.inverseRelation as RelationDeclaration, constraint.relation, "_", "_", "target", "source")»
					«ELSE»
						«repairMatchFallback(constraint, fqn2PQuery)»
					«ENDIF»
				}
			«ENDIF»
			
			«IF constraint.shouldIndexInverseMultiplicites(indexUpperMultiplicities)»
				private pattern «existingInverseMultiplicityName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement, numberOfExistingReferences:java Integer, numberOfRepairMatches: java Integer) {
					find interpretation(problem,interpretation);
					find mustExist(problem,interpretation,object);
					«base.typeIndexer.referInstanceOf(constraint.targetType,Modality::MUST,"object")»
					numberOfExistingReferences == count «base.referRelation(constraint.relation,"_","object",Modality.MUST,fqn2PQuery)»
					numberOfRepairMatches == count find «repairMatchName(constraint)»(problem, interpretation, _, object);
				}
			«ENDIF»
		«ENDFOR»
	'''

	private def repairMatchFallback(RelationMultiplicityConstraint constraint, Map<String, PQuery> fqn2PQuery) '''
		find interpretation(problem,interpretation);
		find mustExist(problem,interpretation,source);
		«base.typeIndexer.referInstanceOf(constraint.sourceType,Modality::MUST,"source")»
		find mustExist(problem,interpretation,target);
		«base.typeIndexer.referInstanceOf(constraint.targetType,Modality::MUST,"target")»
		neg «base.referRelation(constraint.relation,"source","target",Modality.MUST,fqn2PQuery)»
		«base.referRelation(constraint.relation,"source","target",Modality.MAY,fqn2PQuery)»
	'''

	def String existingMultiplicityName(
		RelationMultiplicityConstraint constraint) '''existingMultiplicity_«base.canonizeName(constraint.relation.name)»'''

	def String existingInverseMultiplicityName(
		RelationMultiplicityConstraint constraint) '''existingInverseMultiplicity_«base.canonizeName(constraint.relation.name)»'''

	private def String repairMatchName(
		RelationMultiplicityConstraint constraint) '''repair_«base.canonizeName(constraint.relation.name)»'''

	def getUnfinishedMultiplicityQueries(List<RelationMultiplicityConstraint> constraints) {
		constraints.toInvertedMap [ constraint |
			new UnifinishedMultiplicityQueryNames(
				if (constraint.shouldIndexExistingMultiplicites(indexUpperMultiplicities)) {
					existingMultiplicityName(constraint)
				} else {
					null
				},
				if (constraint.shouldIndexInverseMultiplicites(indexUpperMultiplicities)) {
					existingInverseMultiplicityName(constraint)
				} else {
					null
				}
			)
		]
	}

	static def shouldIndexExistingMultiplicites(RelationMultiplicityConstraint it, boolean indexUpperMultiplicities) {
		constrainsUnfinished || (indexUpperMultiplicities && constrainsRemainingContents)
	}

	static def shouldIndexRepairMultiplcities(RelationMultiplicityConstraint it, boolean indexUpperMultiplicities) {
		shouldIndexExistingMultiplicites(indexUpperMultiplicities) && constrainsUnrepairable
	}

	static def shouldIndexInverseMultiplicites(RelationMultiplicityConstraint it, boolean indexUpperMultiplicities) {
		indexUpperMultiplicities && constrainsRemainingInverse
	}

	static def shouldIndexRepairMatches(RelationMultiplicityConstraint it, boolean indexUpperMultiplicities) {
		shouldIndexRepairMultiplcities(indexUpperMultiplicities) ||
			shouldIndexInverseMultiplicites(indexUpperMultiplicities)
	}
}
