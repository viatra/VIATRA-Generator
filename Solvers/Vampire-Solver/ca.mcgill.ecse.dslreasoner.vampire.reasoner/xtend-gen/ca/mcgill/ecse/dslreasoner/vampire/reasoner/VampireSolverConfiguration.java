package ca.mcgill.ecse.dslreasoner.vampire.reasoner;

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;

@SuppressWarnings("all")
public class VampireSolverConfiguration extends LogicSolverConfiguration {
  public int contCycleLevel = 0;
  
  public boolean uniquenessDuplicates = false;
}
