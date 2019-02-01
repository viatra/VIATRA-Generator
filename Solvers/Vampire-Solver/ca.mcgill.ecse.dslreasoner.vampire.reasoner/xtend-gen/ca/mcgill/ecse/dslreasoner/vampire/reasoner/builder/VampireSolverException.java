package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class VampireSolverException extends Exception {
  public VampireSolverException(final String s) {
    super(s);
  }
  
  public VampireSolverException(final String s, final Exception e) {
    super(s, e);
  }
  
  public VampireSolverException(final String s, final List<String> errors, final Exception e) {
    super(((s + "\n") + IterableExtensions.join(errors, "\n")), e);
  }
}
