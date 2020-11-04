package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Bounds
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.DirectionalThresholdObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.IObjectiveBoundsProvider
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold
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
 * 
 * Will also automatically fill any missing numerical values in the saved solutions
 * using the supplied {@link NumericSolver}.
 */
class ViatraReasonerSolutionSaver implements ISolutionSaver, IObjectiveBoundsProvider {
	static val TOLERANCE = 1e-10

	@Accessors val SolutionCopier solutionCopier
	@Accessors val DiversityChecker diversityChecker
	val IObjective[][] leveledExtremalObjectives
	val boolean hasExtremalObjectives
	val int numberOfRequiredSolutions
	val ObjectiveComparatorHelper comparatorHelper
	val Map<SolutionTrajectory, Fitness> trajectories = new HashMap

	@Accessors var NumericSolver numericSolver
	@Accessors var Map<Object, Solution> solutionsCollection

	new(IObjective[][] leveledExtremalObjectives, int numberOfRequiredSolutions, DiversityChecker diversityChecker) {
		this.diversityChecker = diversityChecker
		comparatorHelper = new ObjectiveComparatorHelper(leveledExtremalObjectives)
		this.leveledExtremalObjectives = leveledExtremalObjectives
		hasExtremalObjectives = leveledExtremalObjectives.exists[!empty]
		this.numberOfRequiredSolutions = numberOfRequiredSolutions
		this.solutionCopier = new SolutionCopier
	}
	
	def setNumericSolver(NumericSolver numericSolver) {
		this.numericSolver = numericSolver
		solutionCopier.numericSolver = numericSolver
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
		println("Found: " + fitness)
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
		fitness.satisifiesHardObjectives && (numericSolver === null || numericSolver.currentSatisfiable)
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

	def getTotalCopierRuntime() {
		solutionCopier.totalCopierRuntime
	}

	override computeRequiredBounds(IObjective objective, Bounds bounds) {
		if (!hasExtremalObjectives) {
			return
		}
		if (objective instanceof DirectionalThresholdObjective) {
			switch (threshold : objective.threshold) {
				case ObjectiveThreshold.NO_THRESHOLD: {
					// No threshold to set.
				}
				ObjectiveThreshold.Exclusive: {
					switch (kind : objective.kind) {
						case HIGHER_IS_BETTER:
							bounds.tightenLowerBound(Math.floor(threshold.threshold + 1) as int)
						case LOWER_IS_BETTER:
							bounds.tightenUpperBound(Math.ceil(threshold.threshold - 1) as int)
						default:
							throw new IllegalArgumentException("Unknown objective kind" + kind)
					}
					if (threshold.clampToThreshold) {
						return
					}
				}
				ObjectiveThreshold.Inclusive: {
					switch (kind : objective.kind) {
						case HIGHER_IS_BETTER:
							bounds.tightenLowerBound(Math.ceil(threshold.threshold) as int)
						case LOWER_IS_BETTER:
							bounds.tightenUpperBound(Math.floor(threshold.threshold) as int)
						default:
							throw new IllegalArgumentException("Unknown objective kind" + kind)
					}
					if (threshold.clampToThreshold) {
						return
					}
				}
				default:
					throw new IllegalArgumentException("Unknown threshold: " + threshold)
			}
			for (level : leveledExtremalObjectives) {
				switch (level.size) {
					case 0: {
						// Nothing to do, wait for the next level.
					}
					case 1: {
						val primaryObjective = level.get(0)
						if (primaryObjective != objective) {
							// There are no worst-case bounds for secondary objectives.
							return
						}
					}
					default:
						// There are no worst-case bounds for Pareto front calculation.
						return
				}
			}
			val fitnessIterator = trajectories.values.iterator
			if (!fitnessIterator.hasNext) {
				return
			}
			val fitness = fitnessIterator.next.get(objective.name)
			while (fitnessIterator.hasNext) {
				val otherFitness = fitnessIterator.next.get(objective.name)
				if (Math.abs(fitness - otherFitness) > TOLERANCE) {
					throw new IllegalStateException("Inconsistent fitness: " + objective.name)
				}
			}
			switch (kind : objective.kind) {
				case HIGHER_IS_BETTER:
					if (needsMoreSolutionsWithSameFitness) {
						bounds.tightenLowerBound(Math.floor(fitness) as int)
					} else {
						bounds.tightenLowerBound(Math.floor(fitness + 1) as int)
					}
				case LOWER_IS_BETTER:
					if (needsMoreSolutionsWithSameFitness) {
						bounds.tightenUpperBound(Math.ceil(fitness) as int)
					} else {
						bounds.tightenUpperBound(Math.ceil(fitness - 1) as int)
					}
				default:
					throw new IllegalArgumentException("Unknown objective kind" + kind)
			}
		}
	}
}
