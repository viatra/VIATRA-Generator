package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.IObjective

interface IThreeValuedObjective extends IObjective {
	def Double getWorstPossibleFitness(ThreadContext threadContext)
	
	def Double getBestPossibleFitness(ThreadContext threadContext)
}
