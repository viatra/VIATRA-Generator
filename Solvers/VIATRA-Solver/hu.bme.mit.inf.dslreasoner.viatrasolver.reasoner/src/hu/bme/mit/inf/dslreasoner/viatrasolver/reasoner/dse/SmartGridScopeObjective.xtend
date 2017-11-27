package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import org.eclipse.viatra.dse.base.ThreadContext
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation

class SmartGridScopeObjective extends ScopeObjective {
	
	override getFitness(ThreadContext context) {
		val interpretation = context.model as PartialInterpretation
		val res = interpretation.minNewElements
		return res.doubleValue
	}
	
	override isHardObjective() { true }
	override satisifiesHardObjective(Double fitness) { return fitness <=0.01 }
	
}