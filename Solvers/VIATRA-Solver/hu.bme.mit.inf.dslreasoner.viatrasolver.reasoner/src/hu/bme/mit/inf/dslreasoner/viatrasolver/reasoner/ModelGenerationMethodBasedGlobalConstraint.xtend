package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner

import org.eclipse.viatra.dse.objectives.IGlobalConstraint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod

abstract class ModelGenerationMethodBasedGlobalConstraint implements IGlobalConstraint {
	val protected ModelGenerationMethod method
	new(ModelGenerationMethod method) {
		this.method = method
	}
}
