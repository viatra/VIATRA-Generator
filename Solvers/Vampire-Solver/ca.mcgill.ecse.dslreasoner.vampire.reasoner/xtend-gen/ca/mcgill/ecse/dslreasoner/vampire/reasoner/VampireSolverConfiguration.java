package ca.mcgill.ecse.dslreasoner.vampire.reasoner;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.BackendSolver;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;

@SuppressWarnings("all")
public class VampireSolverConfiguration extends LogicSolverConfiguration {
  public int contCycleLevel = 0;
  
  public boolean uniquenessDuplicates = false;
  
  public int iteration = (-1);
  
  public BackendSolver solver = BackendSolver.VAMP;
}
