package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.ApproximationHeuristic;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver.FtAnalysisObjective;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolverConfiguration;

@SuppressWarnings("all")
public final class StormDftConfiguration extends SolverConfiguration {
  public static final String DEFAULT_SOLVER_PATH = "storm-dft";
  
  public double precision = 1e-6;
  
  public boolean bisimulation = true;
  
  public boolean symmetryReduction = true;
  
  public boolean modularization = true;
  
  public boolean dontCarePropagation = true;
  
  public double approximation = 0;
  
  public ApproximationHeuristic approximationHeuristic = ApproximationHeuristic.NONE;
  
  public FtAnalysisObjective objective;
  
  public boolean isApproximationInUse() {
    return (!Objects.equal(this.approximationHeuristic, ApproximationHeuristic.NONE));
  }
}
