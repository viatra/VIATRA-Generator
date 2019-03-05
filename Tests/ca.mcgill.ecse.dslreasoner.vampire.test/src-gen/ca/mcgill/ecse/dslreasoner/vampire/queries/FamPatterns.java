/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.vampire.test/src/ca/mcgill/ecse/dslreasoner/vampire/queries/FamPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.vampire.queries;

import ca.mcgill.ecse.dslreasoner.vampire.queries.TerminatorAndInformation;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in FamPatterns.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file FamPatterns.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package ca.mcgill.ecse.dslreasoner.vampire.queries, the group contains the definition of the following patterns: <ul>
 * <li>terminatorAndInformation</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class FamPatterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static FamPatterns instance() {
    if (INSTANCE == null) {
        INSTANCE = new FamPatterns();
    }
    return INSTANCE;
  }
  
  private static FamPatterns INSTANCE;
  
  private FamPatterns() {
    querySpecifications.add(TerminatorAndInformation.instance());
  }
  
  public TerminatorAndInformation getTerminatorAndInformation() {
    return TerminatorAndInformation.instance();
  }
  
  public TerminatorAndInformation.Matcher getTerminatorAndInformation(final ViatraQueryEngine engine) {
    return TerminatorAndInformation.Matcher.on(engine);
  }
}
