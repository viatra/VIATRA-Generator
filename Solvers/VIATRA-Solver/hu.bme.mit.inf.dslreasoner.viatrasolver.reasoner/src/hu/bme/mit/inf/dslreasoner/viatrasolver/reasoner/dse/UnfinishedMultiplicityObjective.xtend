package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.MultiplicityGoalConstraintCalculator
import java.util.Comparator
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.viatra.dse.objectives.Comparators

class UnfinishedMultiplicityObjective implements IObjective {
	val MultiplicityGoalConstraintCalculator unfinishedMultiplicity;
	
	public new(MultiplicityGoalConstraintCalculator unfinishedMultiplicity) {
		this.unfinishedMultiplicity = unfinishedMultiplicity
	}
	
	override getName() '''unfinishedMultiplicity «unfinishedMultiplicity.name»'''
	override createNew() {
		return new UnfinishedMultiplicityObjective(new MultiplicityGoalConstraintCalculator(this.unfinishedMultiplicity))
	}
	
	override getComparator() { Comparators.LOWER_IS_BETTER }
	override getFitness(ThreadContext context) {
		val unfinishedMultiplicity = unfinishedMultiplicity.calculateValue
		return unfinishedMultiplicity.doubleValue
	}
	override getLevel() { 2 }
	override init(ThreadContext context) { unfinishedMultiplicity.init(context.model) }
	override isHardObjective() { true }
	override satisifiesHardObjective(Double fitness) { return fitness <=0.01 }
	
	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	override setLevel(int level) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}