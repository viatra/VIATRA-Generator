package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableSet
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import java.util.Collection
import java.util.LinkedList
import java.util.Map
import java.util.Set
import org.eclipse.xtend2.lib.StringConcatenationClient

class RelationRefinementGenerator {
	PatternGenerator base;

	new(PatternGenerator base) {
		this.base = base
	}

	def CharSequence generateRefineReference(LogicProblem p,
		Collection<UnitPropagationPatternGenerator> unitPropagationPatternGenerators) {
		val mustRelations = getMustRelations(unitPropagationPatternGenerators)

		'''
			«FOR relationRefinement : this.getRelationRefinements(p)»
				pattern «relationRefinementQueryName(relationRefinement.key,relationRefinement.value)»(
					problem:LogicProblem, interpretation:PartialInterpretation,
					relationIterpretation:PartialRelationInterpretation«IF relationRefinement.value !== null», oppositeInterpretation:PartialRelationInterpretation«ENDIF»,
					from: DefinedElement, to: DefinedElement)
				{
					find interpretation(problem,interpretation);
					PartialInterpretation.partialrelationinterpretation(interpretation,relationIterpretation);
					PartialRelationInterpretation.interpretationOf.name(relationIterpretation,"«relationRefinement.key.name»");
					«IF relationRefinement.value !== null»
						PartialInterpretation.partialrelationinterpretation(interpretation,oppositeInterpretation);
						PartialRelationInterpretation.interpretationOf.name(oppositeInterpretation,"«relationRefinement.value.name»");
					«ENDIF»
					find mustExist(problem, interpretation, from);
					find mustExist(problem, interpretation, to);
					«base.typeIndexer.referInstanceOfByReference(relationRefinement.key.parameters.get(0), Modality::MUST,"from")»
					«base.typeIndexer.referInstanceOfByReference(relationRefinement.key.parameters.get(1), Modality::MUST,"to")»
					«base.relationDeclarationIndexer.referRelation(relationRefinement.key,"from","to",Modality.MAY)»
					neg «base.relationDeclarationIndexer.referRelation(relationRefinement.key,"from","to",Modality.MUST)»
				}
				
				«IF isMustPropagationQueryNeeded(relationRefinement.key, relationRefinement.value, mustRelations)»
					pattern «mustPropagationQueryName(relationRefinement.key)»(
						problem:LogicProblem, interpretation:PartialInterpretation,
						relationIterpretation:PartialRelationInterpretation«IF relationRefinement.value !== null», oppositeInterpretation:PartialRelationInterpretation«ENDIF»,
						from: DefinedElement, to: DefinedElement)
					«FOR body : getMustPropagationBodies(relationRefinement.key, relationRefinement.value, mustRelations) SEPARATOR " or "»
						{
							«referRefinementQuery(relationRefinement.key, relationRefinement.value, "relationIterpretation", "oppositeInterpretation", "from", "to")»
							«body»
						}
					«ENDFOR»
				«ENDIF»
			«ENDFOR»
		'''
	}

	def String relationRefinementQueryName(RelationDeclaration relation, Relation inverseRelation) {
		'''«IF inverseRelation !== null»refineRelation_«base.canonizeName(relation.name)»_and_«base.canonizeName(inverseRelation.name)»«ELSE»refineRelation_«base.canonizeName(relation.name)»«ENDIF»'''
	}

	def String mustPropagationQueryName(RelationDeclaration relation) {
		'''mustPropagation_«base.canonizeName(relation.name)»'''
	}

	def referRefinementQuery(RelationDeclaration relation, Relation inverseRelation, String relInterpretationName,
		String inverseInterpretationName, String sourceName,
		String targetName) '''find «this.relationRefinementQueryName(relation,inverseRelation)»(problem, interpretation, «relInterpretationName», «IF inverseRelation !== null»«inverseInterpretationName», «ENDIF»«sourceName», «targetName»);'''

	def getRefineRelationQueries(LogicProblem p) {
		getRelationRefinements(p).toInvertedMap[relationRefinementQueryName(it.key, it.value)]
	}

	def getRelationRefinements(LogicProblem p) {
		val inverses = base.getInverseRelations(p)
		val containments = base.getContainments(p)
		val list = new LinkedList
		for (relation : p.relations.filter(RelationDeclaration)) {
			if (!containments.contains(relation)) {
				if (inverses.containsKey(relation)) {
					val inverse = inverses.get(relation)
					if (!containments.contains(inverse)) {
						if (base.isRepresentative(relation, inverse)) {
							list += (relation -> inverse)
						}
					}
				} else {
					list += (relation -> null)
				}
			}
		}
		return list
	}

	def getMustPropagationQueries(LogicProblem p,
		Collection<UnitPropagationPatternGenerator> unitPropagationPatternGenerators) {
		val refinements = getRelationRefinements(p)
		val mustRelations = getMustRelations(unitPropagationPatternGenerators)
		refinements.filter[isMustPropagationQueryNeeded(key, value, mustRelations)].toInvertedMap [
			mustPropagationQueryName(key)
		]
	}

	private def getMustRelations(Collection<UnitPropagationPatternGenerator> unitPropagationPatternGenerators) {
		ImmutableMap.copyOf(unitPropagationPatternGenerators.flatMap[mustPatterns.entrySet].groupBy[key].mapValues [
			ImmutableSet.copyOf(map[value])
		])
	}

	private def isMustPropagationQueryNeeded(Relation relation, Relation inverseRelation,
		Map<Relation, ? extends Set<String>> mustRelations) {
		val mustSet = mustRelations.get(relation)
		if (mustSet !== null && !mustSet.empty) {
			return true
		}
		if (inverseRelation !== null) {
			val inverseMustSet = mustRelations.get(inverseRelation)
			if (inverseMustSet !== null && !inverseMustSet.empty) {
				return true
			}
		}
		false
	}

	private def getMustPropagationBodies(Relation relation, Relation inverseRelation,
		Map<Relation, ? extends Set<String>> mustRelations) {
		val builder = ImmutableList.<StringConcatenationClient>builder()
		val mustSet = mustRelations.get(relation)
		if (mustSet !== null) {
			for (refinementQuery : mustSet) {
				builder.add('''find «refinementQuery»(problem, interpretation, from, to);''')
			}
		}
		if (inverseRelation !== null && inverseRelation != relation) {
			val inverseMustSet = mustRelations.get(inverseRelation)
			if (inverseMustSet !== null) {
				for (refinementQuery : inverseMustSet) {
					builder.add('''find «refinementQuery»(problem, interpretation, to, from);''')
				}
			}
		}
		builder.build
	}
}
