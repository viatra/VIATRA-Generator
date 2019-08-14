package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import java.util.HashMap
import java.util.Map
import org.eclipse.viatra.dse.api.DSEException
import org.eclipse.viatra.dse.api.Solution
import org.eclipse.viatra.dse.api.SolutionTrajectory
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Fitness
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.viatra.dse.objectives.ObjectiveComparatorHelper
import org.eclipse.viatra.dse.solutionstore.SolutionStore.ISolutionSaver
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * Based on {@link SolutionStore.BestSolutionSaver}.
 */
class ViatraReasonerSolutionSaver implements ISolutionSaver {
	@Accessors val solutionCopier = new SolutionCopier
	@Accessors val DiversityChecker diversityChecker
	val boolean hasExtremalObjectives
	val int numberOfRequiredSolutions
	val ObjectiveComparatorHelper comparatorHelper
	val Map<SolutionTrajectory, Fitness> trajectories = new HashMap

	@Accessors(PUBLIC_SETTER) var Map<Object, Solution> solutionsCollection

	new(IObjective[][] leveledExtremalObjectives, int numberOfRequiredSolutions, DiversityChecker diversityChecker) {
		this.diversityChecker = diversityChecker
		comparatorHelper = new ObjectiveComparatorHelper(leveledExtremalObjectives)
		hasExtremalObjectives = leveledExtremalObjectives.exists[!empty]
		this.numberOfRequiredSolutions = numberOfRequiredSolutions
	}

	override saveSolution(ThreadContext context, Object id, SolutionTrajectory solutionTrajectory) {
		if (hasExtremalObjectives) {
			saveBestSolutionOnly(context, id, solutionTrajectory)
		} else {
			saveAnyDiverseSolution(context, id, solutionTrajectory)
		}
	}

	private def saveBestSolutionOnly(ThreadContext context, Object id, SolutionTrajectory solutionTrajectory) {
		val fitness = context.lastFitness
		if (!shouldSaveSolution(fitness, context)) {
			return false
		}
		val dominatedTrajectories = newArrayList
		for (entry : trajectories.entrySet) {
			val isLastFitnessBetter = comparatorHelper.compare(fitness, entry.value)
			if (isLastFitnessBetter < 0) {
				// Found a trajectory that dominates the current one, no need to save
				return false
			}
			if (isLastFitnessBetter > 0) {
				dominatedTrajectories += entry.key
			}
		}
		if (dominatedTrajectories.size == 0 && !needsMoreSolutionsWithSameFitness) {
			return false
		}
		if (!diversityChecker.newSolution(context, id, dominatedTrajectories.map[solution.stateCode])) {
			return false
		}
		// We must save the new trajectory before removing dominated trajectories
		// to avoid removing the current solution when it is reachable only via dominated trajectories.
		val solutionSaved = basicSaveSolution(context, id, solutionTrajectory, fitness)
		for (dominatedTrajectory : dominatedTrajectories) {
			trajectories -= dominatedTrajectory
			val dominatedSolution = dominatedTrajectory.solution
			if (!dominatedSolution.trajectories.remove(dominatedTrajectory)) {
				throw new DSEException(
					"Dominated solution is not reachable from dominated trajectory. This should never happen!")
			}
			if (dominatedSolution.trajectories.empty) {
				val dominatedSolutionId = dominatedSolution.stateCode
				solutionCopier.markAsObsolete(dominatedSolutionId)
				solutionsCollection -= dominatedSolutionId
			}
		}
		solutionSaved
	}

	private def saveAnyDiverseSolution(ThreadContext context, Object id, SolutionTrajectory solutionTrajectory) {
		val fitness = context.lastFitness
		if (!shouldSaveSolution(fitness, context)) {
			return false
		}
		if (!diversityChecker.newSolution(context, id, emptyList)) {
			return false
		}
		basicSaveSolution(context, id, solutionTrajectory, fitness)
	}

	private def shouldSaveSolution(Fitness fitness, ThreadContext context) {
		return fitness.satisifiesHardObjectives
	}

	private def basicSaveSolution(ThreadContext context, Object id, SolutionTrajectory solutionTrajectory,
		Fitness fitness) {
		var boolean solutionSaved = false
		var dseSolution = solutionsCollection.get(id)
		if (dseSolution === null) {
			solutionCopier.copySolution(context, id)
			dseSolution = new Solution(id, solutionTrajectory)
			solutionsCollection.put(id, dseSolution)
			solutionSaved = true
		} else {
			solutionSaved = dseSolution.trajectories.add(solutionTrajectory)
		}
		if (solutionSaved) {
			solutionTrajectory.solution = dseSolution
			trajectories.put(solutionTrajectory, fitness)
		}
		solutionSaved
	}

	def fitnessMayBeSaved(Fitness fitness) {
		if (!hasExtremalObjectives) {
			return true
		}
		var boolean mayDominate
		for (existingFitness : trajectories.values) {
			val isNewFitnessBetter = comparatorHelper.compare(fitness, existingFitness)
			if (isNewFitnessBetter < 0) {
				return false
			}
			if (isNewFitnessBetter > 0) {
				mayDominate = true
			}
		}
		mayDominate || needsMoreSolutionsWithSameFitness
	}

	private def boolean needsMoreSolutionsWithSameFitness() {
		if (solutionsCollection === null) {
			// The solutions collection will only be initialized upon saving the first solution.
			return true
		}
		solutionsCollection.size < numberOfRequiredSolutions
	}
}
