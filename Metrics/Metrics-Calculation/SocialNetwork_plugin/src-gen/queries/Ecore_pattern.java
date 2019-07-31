/**
 * Generated from platform:/resource/SocialNetwork_plugin/queries/queries/ecore_pattern.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import queries.SameSuperClass;

/**
 * A pattern group formed of all public patterns defined in ecore_pattern.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ecore_pattern.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>sameSuperClass</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Ecore_pattern extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Ecore_pattern instance() {
    if (INSTANCE == null) {
        INSTANCE = new Ecore_pattern();
    }
    return INSTANCE;
  }
  
  private static Ecore_pattern INSTANCE;
  
  private Ecore_pattern() {
    querySpecifications.add(SameSuperClass.instance());
  }
  
  public SameSuperClass getSameSuperClass() {
    return SameSuperClass.instance();
  }
  
  public SameSuperClass.Matcher getSameSuperClass(final ViatraQueryEngine engine) {
    return SameSuperClass.Matcher.on(engine);
  }
}
