package hu.bme.mit.inf.dslreasoner.vampire.reasoner;

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;

@SuppressWarnings("all")
public class VampireSolverConfiguration extends LogicSolverConfiguration {
  public int symmetry = 0;
  
  public boolean writeToFile = false;
}
