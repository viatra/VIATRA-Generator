package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver;

@SuppressWarnings("all")
public abstract class FtAnalysisObjective {
  public static final class TimeBound extends FtAnalysisObjective {
    public double timeBound = 0;
  }
  
  public static final FtAnalysisObjective MTTF = new FtAnalysisObjective() {
  };
  
  private FtAnalysisObjective() {
  }
}
