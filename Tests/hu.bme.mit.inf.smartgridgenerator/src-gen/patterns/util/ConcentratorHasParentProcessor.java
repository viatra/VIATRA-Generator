/**
 * Generated from platform:/resource/hu.bme.mit.inf.smartgridgenerator/src/patterns/pattern.vql
 */
package patterns.util;

import hu.bme.mit.inf.smartgrid.Concentrator;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterns.ConcentratorHasParentMatch;

/**
 * A match processor tailored for the patterns.concentratorHasParent pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ConcentratorHasParentProcessor implements IMatchProcessor<ConcentratorHasParentMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pConcentrator the value of pattern parameter concentrator in the currently processed match
   * 
   */
  public abstract void process(final Concentrator pConcentrator);
  
  @Override
  public void process(final ConcentratorHasParentMatch match) {
    process(match.getConcentrator());
  }
}
