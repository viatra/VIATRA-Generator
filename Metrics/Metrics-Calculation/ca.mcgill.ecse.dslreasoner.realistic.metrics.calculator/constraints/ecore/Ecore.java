/**
 * Generated from platform:/resource/SocialNetwork_plugin/queries/ecore/Ecore.vql
 */
package ecore;

import ecore.DirectSupertype;
import ecore.LoopInInheritence;
import ecore.NonSymmetricOpposite;
import ecore.Opposite;
import ecore.OppositeDifferentClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in Ecore.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Ecore.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package ecore, the group contains the definition of the following patterns: <ul>
 * <li>directSupertype</li>
 * <li>loopInInheritence</li>
 * <li>opposite</li>
 * <li>oppositeDifferentClass</li>
 * <li>nonSymmetricOpposite</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Ecore extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Ecore instance() {
    if (INSTANCE == null) {
        INSTANCE = new Ecore();
    }
    return INSTANCE;
  }
  
  private static Ecore INSTANCE;
  
  private Ecore() {
    querySpecifications.add(DirectSupertype.instance());
    querySpecifications.add(LoopInInheritence.instance());
    querySpecifications.add(Opposite.instance());
    querySpecifications.add(OppositeDifferentClass.instance());
    querySpecifications.add(NonSymmetricOpposite.instance());
  }
  
  public DirectSupertype getDirectSupertype() {
    return DirectSupertype.instance();
  }
  
  public DirectSupertype.Matcher getDirectSupertype(final ViatraQueryEngine engine) {
    return DirectSupertype.Matcher.on(engine);
  }
  
  public LoopInInheritence getLoopInInheritence() {
    return LoopInInheritence.instance();
  }
  
  public LoopInInheritence.Matcher getLoopInInheritence(final ViatraQueryEngine engine) {
    return LoopInInheritence.Matcher.on(engine);
  }
  
  public Opposite getOpposite() {
    return Opposite.instance();
  }
  
  public Opposite.Matcher getOpposite(final ViatraQueryEngine engine) {
    return Opposite.Matcher.on(engine);
  }
  
  public OppositeDifferentClass getOppositeDifferentClass() {
    return OppositeDifferentClass.instance();
  }
  
  public OppositeDifferentClass.Matcher getOppositeDifferentClass(final ViatraQueryEngine engine) {
    return OppositeDifferentClass.Matcher.on(engine);
  }
  
  public NonSymmetricOpposite getNonSymmetricOpposite() {
    return NonSymmetricOpposite.instance();
  }
  
  public NonSymmetricOpposite.Matcher getNonSymmetricOpposite(final ViatraQueryEngine engine) {
    return NonSymmetricOpposite.Matcher.on(engine);
  }
}
