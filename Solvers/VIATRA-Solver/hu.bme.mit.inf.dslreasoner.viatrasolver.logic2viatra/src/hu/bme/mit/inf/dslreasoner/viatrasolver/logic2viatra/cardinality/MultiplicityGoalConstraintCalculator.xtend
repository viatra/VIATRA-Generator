package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import org.eclipse.emf.common.notify.Notifier
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

class MultiplicityGoalConstraintCalculator {
	val String targetRelationName
	val IQuerySpecification<?> querySpecification
	var MultiplicityCalculator<?> calculator
	val boolean containment
	val int lowerBound
	val int cost
		
	new(String targetRelationName, IQuerySpecification<?> querySpecification, boolean containment, int lowerBound, int cost) {
		this.targetRelationName = targetRelationName
		this.querySpecification = querySpecification
		this.calculator = null
		this.containment = containment
		this.lowerBound = lowerBound
		this.cost = cost
	}
	
	new(MultiplicityGoalConstraintCalculator other) {
		this.targetRelationName = other.targetRelationName
		this.querySpecification = other.querySpecification
		this.calculator = null
		this.containment = other.containment
		this.lowerBound = other.lowerBound
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
		val matcher = querySpecification.getMatcher(engine)
		calculator = RemainingMultiplicityCalculator.of(matcher, lowerBound)
	}
	
	def calculateValue() {
		val res = calculator.multiplicity
//		if(res>0)
//		println(targetRelationName+ " all missing multiplicities: "+res + "*"+cost+"="+res*cost)
		return res*cost
	}
}
