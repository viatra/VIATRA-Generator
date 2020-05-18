package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.MultiplicityGoalConstraintCalculator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.GeneratedPatterns
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class GoalConstraintProvider {
	val calculateObjectCost = false
	
	def public getUnfinishedMultiplicityQueries(LogicProblem p, GeneratedPatterns patterns) {
		val res = new ArrayList()
		
		res.addAll(patterns.unfinishedNonContainmentMulticiplicityQueries,false)
		if(calculateObjectCost) {
			val missingObjectCost = calculateMissingObjectCost(p)
			res.addAll(patterns.unfinishedContainmentMulticiplicityQueries,true,missingObjectCost)
		} else {
			res.addAll(patterns.unfinishedContainmentMulticiplicityQueries,true)
		}
		return res
	}
	
	def addAll(ArrayList<MultiplicityGoalConstraintCalculator> res, Map<Relation, Pair<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>,Integer>> queries, boolean containment) {
		for(multiplicityQuery : queries.entrySet) {
			val targetRelationName = multiplicityQuery.key.name
			val query = multiplicityQuery.value.key
			val minValue = multiplicityQuery.value.value
			res += new MultiplicityGoalConstraintCalculator(targetRelationName,query,minValue,containment,1);
		}
	}
	def addAll(
		ArrayList<MultiplicityGoalConstraintCalculator> res,
		Map<Relation, Pair<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>,Integer>> queries,
		boolean containment,
		Map<Relation, Integer> cost
	) {
		for(multiplicityQuery : queries.entrySet) {
			val targetRelationName = multiplicityQuery.key.name
			val query = multiplicityQuery.value.key
			val minValue = multiplicityQuery.value.value
			res += new MultiplicityGoalConstraintCalculator(targetRelationName,query,minValue,containment,multiplicityQuery.key.lookup(cost))
		}
	}
	
	def calculateMissingObjectCost(LogicProblem p) {
		val containments = p.containmentHierarchies.head.containmentRelations
		val containment2Lower = containments.toInvertedMap[containment | 
			val lower = p.annotations.filter(LowerMultiplicityAssertion).filter[it.relation === containment].head
			if(lower !== null) { lower.lower }
			else { 0 }
		]
		val types = p.types
		val Map<Type,List<? extends Pair<Type,Integer>>> type2NewCost = new HashMap
		for(type:types) {
			val allSupertypes = (#[type] + type.supertypes).toSet
			val allOutgoingContainments = containments.filter[allSupertypes.contains((it.parameters.get(0) as ComplexTypeReference).referred)]
			val list = new LinkedList
			for(outgoingContainment : allOutgoingContainments) {
				val value = containment2Lower.get(outgoingContainment)
				if(value>0) {
					list.add((outgoingContainment.parameters.get(1) as ComplexTypeReference).referred
							-> 	value)
				}
			}
			type2NewCost.put(type, list)
		}
		val res = new HashMap
		for(containment : containments) {
			val key = containment
			val value = (containment.parameters.get(1) as ComplexTypeReference).referred.count(type2NewCost)
//			println('''«key.name» --> «value» new''')
			res.put(key,value)
		}
		return res
	}
	
	private def int count(Type t, Map<Type,List<? extends Pair<Type,Integer>>> containments) {
		val list = containments.get(t)
		var r = 1
		for(element : list) {
			r += element.value * element.key.count(containments)
		}
		return r
	}
}