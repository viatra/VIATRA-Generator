package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import org.eclipse.emf.common.notify.Notifier
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.emf.EMFScope

class MultiplicityGoalConstraintCalculator {
	val String targetRelationName
	val IQuerySpecification<?> querySpecification
	var ViatraQueryMatcher<?> matcher
	val boolean containment
	val int cost
		
	public new(String targetRelationName, IQuerySpecification<?> querySpecification, boolean containment, int cost) {
		this.targetRelationName = targetRelationName
		this.querySpecification = querySpecification
		this.matcher = null
		this.containment = containment
		this.cost = cost
	}
	
	new(MultiplicityGoalConstraintCalculator other) {
		this.targetRelationName = other.targetRelationName
		this.querySpecification = other.querySpecification
		this.matcher = null
		this.containment = other.containment
		this.cost = other.cost
	}
	
	def getName() {
		targetRelationName
	}
	
	def isContainment() {
		return containment
	}

	def init(Notifier notifier) {
		val engine = ViatraQueryEngine.on(new EMFScope(notifier))
		matcher = querySpecification.getMatcher(engine)
	}
	
	def calculateValue() {
		var res = 0
		val allMatches = this.matcher.allMatches
		for(match : allMatches) {
			val missingMultiplicity = match.get(2) as Integer
			res += missingMultiplicity
		}
//		if(res>0)
//		println(targetRelationName+ " all missing multiplicities: "+res + "*"+cost+"="+res*cost)
		return res*cost
	}
}
