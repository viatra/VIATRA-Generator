package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import java.util.LinkedList
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference

class RelationRefinementGenerator {
	PatternGenerator base;

	public new(PatternGenerator base) {
		this.base = base
	}

	def CharSequence generateRefineReference(LogicProblem p) '''
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
		«ENDFOR»
	'''

	def String relationRefinementQueryName(RelationDeclaration relation, Relation inverseRelation) {
		'''«IF inverseRelation !== null»refineRelation_«base.canonizeName(relation.name)»_and_«base.canonizeName(inverseRelation.name)»«ELSE»refineRelation_«base.canonizeName(relation.name)»«ENDIF»'''
	}

	def referRefinementQuery(RelationDeclaration relation, Relation inverseRelation, String relInterpretationName,
		String inverseInterpretationName, String sourceName,
		String targetName) '''find «this.relationRefinementQueryName(relation,inverseRelation)»(problem, interpretation, «relInterpretationName», «IF inverseRelation !== null»inverseInterpretationName, «ENDIF»«sourceName», «targetName»);'''

	def getRefineRelationQueries(LogicProblem p) {
//		val containmentRelations = p.containmentHierarchies.map[containmentRelations].flatten.toSet
//		p.relations.filter(RelationDeclaration).filter[!containmentRelations.contains(it)].toInvertedMap['''refineRelation_«base.canonizeName(it.name)»''']
		/*
		 * val res = new LinkedHashMap
		 * for(relation: getRelationRefinements(p)) {
		 * 	if(inverseRelations.containsKey(relation)) {
		 * 		val name = '''refineRelation_«base.canonizeName(relation.name)»_and_«base.canonizeName(inverseRelations.get(relation).name)»'''
		 * 		res.put(relation -> inverseRelations.get(relation),name)
		 * 	} else {
		 * 		val name = '''refineRelation_«base.canonizeName(relation.name)»'''
		 * 		res.put(relation -> null,name)
		 * 	}
		 * }
		 return res*/
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
}
