package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver;

@SuppressWarnings("all")
public class StormDftException extends RuntimeException {
  public StormDftException(final String s) {
    super(s);
  }
  
  public StormDftException(final String s, final Exception e) {
    super(s, e);
  }
}
