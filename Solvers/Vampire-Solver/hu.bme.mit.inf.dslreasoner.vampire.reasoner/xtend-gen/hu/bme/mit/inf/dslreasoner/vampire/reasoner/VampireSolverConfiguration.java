package hu.bme.mit.inf.dslreasoner.vampire.reasoner;

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.VampireBackendSolver;

@SuppressWarnings("all")
public class VampireSolverConfiguration extends LogicSolverConfiguration {
  public int symmetry = 0;
  
  public VampireBackendSolver solver = VampireBackendSolver.SAT4J;
  
  public boolean writeToFile = false;
}
