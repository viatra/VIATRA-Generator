package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.MultiplicityGoalConstraintCalculator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.GeneratedPatterns
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map

class GoalConstraintProvider {

	def getUnfinishedMultiplicityQueries(LogicProblem p, GeneratedPatterns patterns, boolean calculateObjectCost) {
		val objectCosts = if (calculateObjectCost) {
				calculateMissingObjectCost(p)
			} else {
				emptyMap
			}
		val res = new ArrayList()
		for (entry : patterns.multiplicityConstraintQueries.entrySet) {
			val constraint = entry.key
			if (constraint.constrainsUnfinished) {
				val queries = entry.value
				val targetRelationName = constraint.relation.name
				val query = queries.existingMultiplicityQuery
				val containment = constraint.containment
				val lowerBound = constraint.lowerBound
				val cost = objectCosts.getOrDefault(constraint.relation, 1)
				res += new MultiplicityGoalConstraintCalculator(
					targetRelationName,
					query,
					containment,
					lowerBound,
					cost
				)
			}
		}
		return res
	}

	private def calculateMissingObjectCost(LogicProblem p) {
		val containments = p.containmentHierarchies.head.containmentRelations
		val containment2Lower = containments.toInvertedMap [ containment |
			val lower = p.annotations.filter(LowerMultiplicityAssertion).filter[it.relation === containment].head
			if (lower !== null) {
				lower.lower
			} else {
				0
			}
		]
		val types = p.types
		val Map<Type, List<? extends Pair<Type, Integer>>> type2NewCost = new HashMap
		for (type : types) {
			val allSupertypes = (#[type] + type.supertypes).toSet
			val allOutgoingContainments = containments.filter [
				allSupertypes.contains((it.parameters.get(0) as ComplexTypeReference).referred)
			]
			val list = new LinkedList
			for (outgoingContainment : allOutgoingContainments) {
				val value = containment2Lower.get(outgoingContainment)
				if (value > 0) {
					list.add((outgoingContainment.parameters.get(1) as ComplexTypeReference).referred -> value)
				}
			}
			type2NewCost.put(type, list)
		}
		val res = new HashMap
		for (containment : containments) {
			val key = containment
			val value = (containment.parameters.get(1) as ComplexTypeReference).referred.count(type2NewCost)
//			println('''«key.name» --> «value» new''')
			res.put(key, value)
		}
		return res
	}

	private def int count(Type t, Map<Type, List<? extends Pair<Type, Integer>>> containments) {
		val list = containments.get(t)
		var r = 1
		for (element : list) {
			r += element.value * element.key.count(containments)
		}
		return r
	}
}
