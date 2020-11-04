package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Bounds
import org.eclipse.viatra.dse.objectives.IObjective

interface IObjectiveBoundsProvider {
	def void computeRequiredBounds(IObjective objective, Bounds bounds)
}
