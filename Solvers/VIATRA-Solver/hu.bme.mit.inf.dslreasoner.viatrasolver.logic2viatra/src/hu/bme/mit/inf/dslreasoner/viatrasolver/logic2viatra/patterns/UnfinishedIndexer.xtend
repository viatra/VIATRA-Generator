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
	val String unfinishedMultiplicityQueryName
	val String unrepairableMultiplicityQueryName
	val String remainingInverseMultiplicityQueryName
	val String remainingContentsQueryName
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
			«IF constraint.constrainsUnfinished»
				private pattern «unfinishedMultiplicityName(constraint)»_helper(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement, missingMultiplicity:java Integer) {
					find interpretation(problem,interpretation);
					find mustExist(problem,interpretation,object);
					«base.typeIndexer.referInstanceOf(constraint.sourceType,Modality::MUST,"object")»
					numberOfExistingReferences == count «base.referRelation(constraint.relation,"object","_",Modality.MUST,fqn2PQuery)»
					check(numberOfExistingReferences < «constraint.lowerBound»);
					missingMultiplicity == eval(«constraint.lowerBound»-numberOfExistingReferences);
				}
				
				pattern «unfinishedMultiplicityName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, missingMultiplicity:java Integer) {
					find interpretation(problem,interpretation);
					missingMultiplicity == sum find «unfinishedMultiplicityName(constraint)»_helper(problem, interpretation, _, #_);
				}
			«ENDIF»
			
			«IF indexUpperMultiplicities»
				«IF constraint.constrainsUnrepairable || constraint.constrainsRemainingInverse»
					private pattern «repairMatchName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, source:DefinedElement, target:DefinedElement) {
						«IF base.isRepresentative(constraint.relation, constraint.inverseRelation) && constraint.relation instanceof RelationDeclaration»
							«base.relationRefinementGenerator.referRefinementQuery(constraint.relation as RelationDeclaration, constraint.inverseRelation, "_", "_", "source", "target")»
						«ELSE»
							«IF base.isRepresentative(constraint.inverseRelation, constraint.relation) && constraint.inverseRelation instanceof RelationDeclaration»
								«base.relationRefinementGenerator.referRefinementQuery(constraint.inverseRelation as RelationDeclaration, constraint.relation, "_", "_", "target", "source")»
							«ELSE»
								find interpretation(problem,interpretation);
								find mustExist(problem,interpretation,source);
								«base.typeIndexer.referInstanceOf(constraint.sourceType,Modality::MUST,"source")»
								find mustExist(problem,interpretation,target);
								«base.typeIndexer.referInstanceOf(constraint.targetType,Modality::MUST,"target")»
								neg «base.referRelation(constraint.relation,"source","target",Modality.MUST,fqn2PQuery)»
								«base.referRelation(constraint.relation,"source","target",Modality.MAY,fqn2PQuery)»
							«ENDIF»
						«ENDIF»
					}
				«ENDIF»
				
				«IF constraint.constrainsUnrepairable»
					private pattern «unrepairableMultiplicityName(constraint)»_helper(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement, unrepairableMultiplicity:java Integer) {
						find «unfinishedMultiplicityName(constraint)»_helper(problem, interpretation, object, missingMultiplicity);
						numberOfRepairMatches == count find «repairMatchName(constraint)»(problem, interpretation, object, _);
						check(numberOfRepairMatches < missingMultiplicity);
						unrepairableMultiplicity == eval(missingMultiplicity-numberOfRepairMatches);
					}
					
					private pattern «unrepairableMultiplicityName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, unrepairableMultiplicity:java Integer) {
						find interpretation(problem,interpretation);
						unrepairableMultiplicity == max find «unrepairableMultiplicityName(constraint)»_helper(problem, interpretation, _, #_);
					} or {
						find interpretation(problem,interpretation);
						neg find «unrepairableMultiplicityName(constraint)»_helper(problem, interpretation, _, _);
						unrepairableMultiplicity == 0;
					}
				«ENDIF»
				
				«IF constraint.constrainsRemainingInverse»
					private pattern «remainingMultiplicityName(constraint)»_helper(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement, remainingMultiplicity:java Integer) {
						find interpretation(problem,interpretation);
						find mustExist(problem,interpretation,object);
						«base.typeIndexer.referInstanceOf(constraint.targetType,Modality::MUST,"object")»
						numberOfExistingReferences == count «base.referRelation(constraint.relation,"_","object",Modality.MUST,fqn2PQuery)»
						check(numberOfExistingReferences < «constraint.inverseUpperBound»);
						numberOfRepairMatches == count find «repairMatchName(constraint)»(problem, interpretation, _, object);
						remainingMultiplicity == eval(Math.min(«constraint.inverseUpperBound»-numberOfExistingReferences, numberOfRepairMatches));
					}
					
					pattern «remainingMultiplicityName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, remainingMultiplicity:java Integer) {
						find interpretation(problem,interpretation);
						remainingMultiplicity == sum find «remainingMultiplicityName(constraint)»_helper(problem, interpretation, _, #_);
					}
				«ENDIF»
				
				«IF constraint.constrainsRemainingContents»
					«IF constraint.upperBoundFinite»
						private pattern «remainingContentsName(constraint)»_helper(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement, remainingMultiplicity:java Integer) {
							find interpretation(problem,interpretation);
							find mustExist(problem,interpretation,object);
							«base.typeIndexer.referInstanceOf(constraint.sourceType,Modality::MUST,"object")»
							numberOfExistingReferences == count «base.referRelation(constraint.relation,"object","_",Modality.MUST,fqn2PQuery)»
							check(numberOfExistingReferences < «constraint.upperBound»);
							remainingMultiplicity == eval(«constraint.upperBound»-numberOfExistingReferences);
						}
						
						pattern «remainingContentsName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, remainingMultiplicity:java Integer) {
							find interpretation(problem,interpretation);
							remainingMultiplicity == sum find «remainingContentsName(constraint)»_helper(problem, interpretation, _, #_);
						}
					«ELSE»
						pattern «remainingContentsName(constraint)»_helper(problem:LogicProblem, interpretation:PartialInterpretation) {
							find interpretation(problem,interpretation);
							find mustExist(problem,interpretation,object);
							«base.typeIndexer.referInstanceOf(constraint.sourceType,Modality::MUST,"object")»
						}
						
						pattern «remainingContentsName(constraint)»(problem:LogicProblem, interpretation:PartialInterpretation, remainingMultiplicity:java Integer) {
							find interpretation(problem,interpretation);
							find «remainingContentsName(constraint)»_helper(problem, interpretation);
							remainingMultiplicity == -1;
						} or {
							find interpretation(problem,interpretation);
							neg find «remainingContentsName(constraint)»_helper(problem, interpretation);
							remainingMultiplicity == 0;
						}
					«ENDIF»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
	'''

	def String unfinishedMultiplicityName(
		RelationMultiplicityConstraint constraint) '''unfinishedLowerMultiplicity_«base.canonizeName(constraint.relation.name)»'''

	def String unrepairableMultiplicityName(
		RelationMultiplicityConstraint constraint) '''unrepairableLowerMultiplicity_«base.canonizeName(constraint.relation.name)»'''

	private def String repairMatchName(
		RelationMultiplicityConstraint constraint) '''repair_«base.canonizeName(constraint.relation.name)»'''

	def String remainingMultiplicityName(
		RelationMultiplicityConstraint constraint) '''remainingInverseUpperMultiplicity_«base.canonizeName(constraint.relation.name)»'''

	def String remainingContentsName(
		RelationMultiplicityConstraint constraint) '''remainingContents_«base.canonizeName(constraint.relation.name)»'''

	def getUnfinishedMultiplicityQueries(List<RelationMultiplicityConstraint> constraints) {
		constraints.toInvertedMap [ constraint |
			new UnifinishedMultiplicityQueryNames(
				if(constraint.constrainsUnfinished) unfinishedMultiplicityName(constraint) else null,
				if (indexUpperMultiplicities && constraint.constrainsUnrepairable)
					unrepairableMultiplicityName(constraint)
				else
					null,
				if (indexUpperMultiplicities && constraint.constrainsRemainingInverse)
					remainingMultiplicityName(constraint)
				else
					null,
				if (indexUpperMultiplicities && constraint.constrainsRemainingContents)
					remainingContentsName(constraint)
				else
					null
			)
		]
	}
}
