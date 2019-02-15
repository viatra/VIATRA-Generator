package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver

import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolverConfiguration

final class StormDftConfiguration extends SolverConfiguration {
	public static val DEFAULT_SOLVER_PATH = "storm-dft"

	public double precision = 1e-6

	public boolean bisimulation = true

	public boolean symmetryReduction = true

	public boolean modularization = true

	public boolean dontCarePropagation = true

	public double approximation = 0

	public var approximationHeuristic = ApproximationHeuristic.NONE

	public FtAnalysisObjective objective

	def isApproximationInUse() {
		approximationHeuristic != ApproximationHeuristic.NONE
	}
}

abstract class FtAnalysisObjective {
	public static val MTTF = new FtAnalysisObjective {
	}

	private new() {
	}

	static final class TimeBound extends FtAnalysisObjective {
		public double timeBound = 0
	}
}

enum ApproximationHeuristic {
	NONE,
	DEPTH
// See https://github.com/moves-rwth/storm/issues/35 for additional approximation heuristics.
}
