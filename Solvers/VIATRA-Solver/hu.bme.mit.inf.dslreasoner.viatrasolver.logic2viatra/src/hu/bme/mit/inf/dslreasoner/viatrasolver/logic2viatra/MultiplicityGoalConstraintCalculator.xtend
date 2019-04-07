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
		
	new(String targetRelationName, IQuerySpecification<?> querySpecification) {
		this.targetRelationName = targetRelationName
		this.querySpecification = querySpecification
		this.matcher = null
	}
	
	new(MultiplicityGoalConstraintCalculator other) {
		this.targetRelationName = other.targetRelationName
		this.querySpecification = other.querySpecification
		this.matcher = null
	}
	
	def getName() {
		targetRelationName
	}
	
	def init(Notifier notifier) {
		val engine = ViatraQueryEngine.on(new EMFScope(notifier))
		matcher = querySpecification.getMatcher(engine)
	}
	
	def calculateValue() {
		var res = 0
		val allMatches = this.matcher.allMatches
		for(match : allMatches) {
			//println(targetRelationName+ " missing multiplicity: "+match.get(3))
			val missingMultiplicity = match.get(4) as Integer
			res += missingMultiplicity
		}
		//println(targetRelationName+ " all missing multiplicities: "+res)
		return res
	}
}