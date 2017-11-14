package hu.bme.mit.inf.dslreasoner.vampire.reasoner;

@SuppressWarnings("all")
public enum VampireBackendSolver {
  BerkMinPIPE,
  
  SpearPIPE,
  
  MiniSatJNI,
  
  MiniSatProverJNI,
  
  LingelingJNI,
  
  PLingelingJNI,
  
  GlucoseJNI,
  
  CryptoMiniSatJNI,
  
  SAT4J,
  
  CNF,
  
  KodKod;
}
