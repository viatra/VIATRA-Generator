/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/case_study_short.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import queries.Inv48;
import queries.X_inv48;

/**
 * A pattern group formed of all public patterns defined in case_study_short.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file case_study_short.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>inv48</li>
 * <li>x_inv48</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Case_study_short extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Case_study_short instance() {
    if (INSTANCE == null) {
        INSTANCE = new Case_study_short();
    }
    return INSTANCE;
  }
  
  private static Case_study_short INSTANCE;
  
  private Case_study_short() {
    querySpecifications.add(Inv48.instance());
    querySpecifications.add(X_inv48.instance());
  }
  
  public Inv48 getInv48() {
    return Inv48.instance();
  }
  
  public Inv48.Matcher getInv48(final ViatraQueryEngine engine) {
    return Inv48.Matcher.on(engine);
  }
  
  public X_inv48 getX_inv48() {
    return X_inv48.instance();
  }
  
  public X_inv48.Matcher getX_inv48(final ViatraQueryEngine engine) {
    return X_inv48.Matcher.on(engine);
  }
}
