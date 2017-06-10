package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.viatra.dse.base.ThreadContext
import java.util.Comparator
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation

class ScopeObjective implements IObjective{
	static val comparator = new Comparator<Double>() {
		override compare(Double o1, Double o2) {
			
			return o2.compareTo(o1)
		}
	}
	
	//val static scopeLevel = 3
	
	override createNew() { return new ScopeObjective }
	override getName() { '''ScopeConstraint''' }
	override init(ThreadContext context) { }
	
	override getComparator() { comparator }
	
	override getFitness(ThreadContext context) {
		val interpretation = context.model as PartialInterpretation
		val res = interpretation.minNewElements
		return res.doubleValue
	}
	
	override isHardObjective() { true }
	override satisifiesHardObjective(Double fitness) { return fitness <=0.01 }
	
	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override setLevel(int level) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	override getLevel() { 2 }
}