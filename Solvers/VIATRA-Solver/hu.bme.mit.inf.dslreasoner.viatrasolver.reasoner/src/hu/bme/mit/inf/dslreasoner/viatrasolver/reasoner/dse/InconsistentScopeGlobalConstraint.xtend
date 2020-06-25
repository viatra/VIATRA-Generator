package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import org.eclipse.viatra.dse.objectives.IGlobalConstraint
import org.eclipse.viatra.dse.base.ThreadContext
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation

class InconsistentScopeGlobalConstraint implements IGlobalConstraint {

	override init(ThreadContext context) {
		// Nothing to initialize.
	}

	override createNew() {
		this
	}

	override getName() {
		class.name
	}

	override checkGlobalConstraint(ThreadContext context) {
		val partialModel = context.model as PartialInterpretation
		partialModel.minNewElements <= partialModel.maxNewElements || partialModel.maxNewElements < 0
	}
}
