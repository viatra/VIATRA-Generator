package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import org.apache.log4j.Logger
import org.eclipse.viatra.dse.api.SolutionTrajectory
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.solutionstore.ISolutionFoundHandler
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class LoggerSolutionFoundHandler implements ISolutionFoundHandler {
	val ViatraReasonerConfiguration configuration

	val logger = Logger.getLogger(SolutionCopier)

	override solutionFound(ThreadContext context, SolutionTrajectory trajectory) {
		configuration.progressMonitor.workedModelFound(configuration.solutionScope.numberOfRequiredSolutions)
		logger.debug("Found a solution.")
	}

	override solutionTriedToSave(ThreadContext context, SolutionTrajectory trajectory) {
		// We are not interested in invalid solutions, ignore.
	}
}
