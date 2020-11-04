package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.AbstractThreeValuedObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveKind
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold
import org.eclipse.viatra.dse.base.ThreadContext

class PunishSizeObjective extends AbstractThreeValuedObjective {
	static val NAME = typeof(PunishSizeObjective).name
	
	new(ObjectiveKind kind, int level) {
		super(NAME, kind, ObjectiveThreshold.NO_THRESHOLD, level)
	}
	
	override createNew() {
		new PunishSizeObjective(kind, level)
	}
	
	override init(ThreadContext context) {
		// Nothing to initialize.
	}
	
	override getRawFitness(ThreadContext threadContext) {
		val model = threadContext.model
		if (model instanceof PartialInterpretation) {
			val size = model.newObjectCount
//			println('''size=«size»''')
			size as double
		} else {
			throw new IllegalArgumentException("notifier must be a PartialInterpretation")
		}
	}
	
	override getLowestPossibleFitness(ThreadContext threadContext) {
		getRawFitness(threadContext)
	}
	
	override getHighestPossibleFitness(ThreadContext threadContext) {
		val model = threadContext.model
		if (model instanceof PartialInterpretation) {
			(model.newObjectCount + model.maxNewElements) as double
		} else {
			throw new IllegalArgumentException("notifier must be a PartialInterpretation")
		}
	}
	
	private def getNewObjectCount(PartialInterpretation interpretation) {
		interpretation.newElements.reject[it instanceof PrimitiveElement].size
	}
}