package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.IThreeValuedObjective
import java.util.Comparator
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.xtend.lib.annotations.Accessors

class PunishSizeObjective implements IThreeValuedObjective {
	@Accessors int level = 3
	
	override createNew() {
		this
	}
	
	override init(ThreadContext context) {
		// Nothing to initialize.
	}
	
	override getComparator() {
		Comparators.LOWER_IS_BETTER
	}
	
	override getFitness(ThreadContext threadContext) {
		val model = threadContext.model
		if (model instanceof PartialInterpretation) {
			val size = model.newObjectCount
//			println('''size=«size»''')
			size as double
		} else {
			throw new IllegalArgumentException("notifier must be a PartialInterpretation")
		}
	}
	
	override getBestPossibleFitness(ThreadContext threadContext) {
		getFitness(threadContext)
	}
	
	override getWorstPossibleFitness(ThreadContext threadContext) {
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
	
	override getName() {
		typeof(PunishSizeObjective).name
	}
	
	override isHardObjective() {
		false
	}
	
	override satisifiesHardObjective(Double fitness) {
		true
	}
	
	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("Model generation objective comparator cannot be set.")
	}
	
}