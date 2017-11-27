package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import org.eclipse.viatra.dse.base.ThreadContext
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import org.eclipse.viatra.dse.objectives.IObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.ralismcalculator.RealismCalculator
import java.util.Comparator
import org.eclipse.viatra.dse.objectives.Comparators

class SmartGridScopeObjective implements IObjective {
	public static final double desiredPercentageOfRepeaters = 30.2	
	public static final double maxDeviation = 5
	//static double percentageOfRepeaters = 30.2
	
	override getFitness(ThreadContext context) {
		val interpretation = context.model as PartialInterpretation
		val r = RealismCalculator.calculatePercentageOfRepeatersInSmartGrid(interpretation)
		var deviation = desiredPercentageOfRepeaters - r
		deviation = Math.abs(deviation)
//		System.out.println(deviation)
		return deviation.doubleValue
//return 1.0
	}
	
	override isHardObjective() { true }
	override satisifiesHardObjective(Double fitness) { return Math.abs(fitness) <= maxDeviation}
	
	override createNew() {
		return new ScopeObjective
	}
	
	override getComparator() {
		Comparators.LOWER_IS_BETTER
	}
	
	override getLevel() { 2	}
	
	override getName() {
		'''SmartGridScopeObjective'''
	}
	
	override init(ThreadContext context) { }
	
	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override setLevel(int level) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}