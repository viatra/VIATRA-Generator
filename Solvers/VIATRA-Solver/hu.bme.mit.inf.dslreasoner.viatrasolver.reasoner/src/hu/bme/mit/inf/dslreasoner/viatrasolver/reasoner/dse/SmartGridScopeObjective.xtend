package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import org.eclipse.viatra.dse.base.ThreadContext
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import org.eclipse.viatra.dse.objectives.IObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.ralismcalculator.RealismCalculator
import java.util.Comparator
import org.eclipse.viatra.dse.objectives.Comparators


class SmartGridScopeObjective implements IObjective {
	    private enum setting {
	   original, real1, real2, real3
	}    
    val settings = setting.real2
	public static final double desiredAvgDegreeOfRepeaters = 3.75 
	public static final double desiredAvgDegreeOfConcentrators = 21.3	
	public static final double desiredAvgNumberOfHops = 2.6	
	public static final double desiredPercentageOfRepeaters = 30.2	
	public static final double maxDeviation = 5    

	override getFitness(ThreadContext context) {
		val interpretation = context.model as PartialInterpretation
		
		val repPerc = RealismCalculator.calculatePercentageOfRepeatersInSmartGrid(interpretation)				
		var repeaterPercentageDeviation = desiredPercentageOfRepeaters - repPerc
		repeaterPercentageDeviation = Math.abs(repeaterPercentageDeviation)
		
		val repDegree = RealismCalculator.calculateAverageRepeaterDegree(interpretation)	
		var repeaterDegreeDeviation = desiredAvgDegreeOfRepeaters - repDegree
		repeaterDegreeDeviation = Math.abs(repeaterDegreeDeviation)
		
		val concDegree = RealismCalculator.calculateAverageConcentratorDegree(interpretation)	
		var concentratorDegreeDeviation = desiredAvgDegreeOfConcentrators - concDegree
		concentratorDegreeDeviation = Math.abs(concentratorDegreeDeviation)
		
		val avgHop = RealismCalculator.calculateAverageNumberOfHops(interpretation)	
		var avgHopDeviation = desiredAvgNumberOfHops - avgHop
		avgHopDeviation = Math.abs(avgHopDeviation)		
		//println("____repDev: " + repeaterDegreeDeviation + " concDev: " + concentratorDegreeDeviation + " repPerc: " + repeaterPercentageDeviation + " avgHops: " + avgHopDeviation)
		
		switch (settings) {			
			case original: {
				return 0.0; //No Reality fitness
			}
			case real1: { // Only add deviation of the percentage of repeaters to reality fitness								
				return repeaterPercentageDeviation.doubleValue
			}
			case real2: { // Add all with same weight
				return (repeaterPercentageDeviation.doubleValue + repeaterDegreeDeviation + concentratorDegreeDeviation + avgHopDeviation)/4;
			}
			case real3: {
				return 0.0;
			}
			default: {
				return 0.0;
			}
		}	
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