/**
 * Generated from platform:/resource/hu.bme.mit.inf.smartgridgenerator/src/patterns/pattern.vql
 */
package patterns.util;

import hu.bme.mit.inf.smartgrid.Entity;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import patterns.HasParentMatch;

/**
 * A match processor tailored for the patterns.hasParent pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class HasParentProcessor implements IMatchProcessor<HasParentMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pEntity the value of pattern parameter entity in the currently processed match
   * 
   */
  public abstract void process(final Entity pEntity);
  
  @Override
  public void process(final HasParentMatch match) {
    process(match.getEntity());
  }
}
