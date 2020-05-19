package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra

import org.eclipse.emf.common.notify.Notifier
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.emf.EMFScope

class MultiplicityGoalConstraintCalculator {
	val String targetRelationName;
	val IQuerySpecification<?> querySpecification;
	var ViatraQueryMatcher<?> matcher;
	val int minValue
	val boolean containment
	val int cost
		
	public new(String targetRelationName, IQuerySpecification<?> querySpecification, int minValue, boolean containment, int cost) {
		this.targetRelationName = targetRelationName
		this.querySpecification = querySpecification
		this.matcher = null
		this.minValue = minValue
		this.containment = containment
		this.cost = cost
	}
	
	public new(MultiplicityGoalConstraintCalculator other) {
		this.targetRelationName = other.targetRelationName
		this.querySpecification = other.querySpecification
		this.matcher = null
		this.minValue = other.minValue
		this.containment = other.containment
		this.cost = other.cost
	}
	
	def public getName() {
		targetRelationName
	}
	
	def isContainment() {
		return containment
	}
	
	def public init(Notifier notifier) {
		val engine = ViatraQueryEngine.on(new EMFScope(notifier))
		matcher = querySpecification.getMatcher(engine)
	}
	
	def public calculateValue() {
		var res = 0
		val allMatches = this.matcher.allMatches
		for(match : allMatches) {
			
			val existingMultiplicity = match.get(4) as Integer
			if(existingMultiplicity < this.minValue) {
				val missingMultiplicity = this.minValue-existingMultiplicity
				res += missingMultiplicity
			}
//			if(missingMultiplicity!=0) {
//				println(targetRelationName+ " missing multiplicity: "+missingMultiplicity)
//			}
		}
//		if(res>0)
//		println(targetRelationName+ " all missing multiplicities: "+res + "*"+cost+"="+res*cost)
		return res*cost
	}
}