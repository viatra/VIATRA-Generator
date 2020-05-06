/**
 * Generated from platform:/resource/case.study.familyTree.run/src/queries/familyTreeConstraints.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import queries.MemberHasParent;
import queries.MemberIsItsOwnParent;
import queries.ParentTooYoung;
import queries.TwoMembersHaveNoParent;

/**
 * A pattern group formed of all public patterns defined in familyTreeConstraints.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file familyTreeConstraints.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>memberIsItsOwnParent</li>
 * <li>twoMembersHaveNoParent</li>
 * <li>memberHasParent</li>
 * <li>parentTooYoung</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class FamilyTreeConstraints extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static FamilyTreeConstraints instance() {
    if (INSTANCE == null) {
        INSTANCE = new FamilyTreeConstraints();
    }
    return INSTANCE;
  }
  
  private static FamilyTreeConstraints INSTANCE;
  
  private FamilyTreeConstraints() {
    querySpecifications.add(MemberIsItsOwnParent.instance());
    querySpecifications.add(TwoMembersHaveNoParent.instance());
    querySpecifications.add(MemberHasParent.instance());
    querySpecifications.add(ParentTooYoung.instance());
  }
  
  public MemberIsItsOwnParent getMemberIsItsOwnParent() {
    return MemberIsItsOwnParent.instance();
  }
  
  public MemberIsItsOwnParent.Matcher getMemberIsItsOwnParent(final ViatraQueryEngine engine) {
    return MemberIsItsOwnParent.Matcher.on(engine);
  }
  
  public TwoMembersHaveNoParent getTwoMembersHaveNoParent() {
    return TwoMembersHaveNoParent.instance();
  }
  
  public TwoMembersHaveNoParent.Matcher getTwoMembersHaveNoParent(final ViatraQueryEngine engine) {
    return TwoMembersHaveNoParent.Matcher.on(engine);
  }
  
  public MemberHasParent getMemberHasParent() {
    return MemberHasParent.instance();
  }
  
  public MemberHasParent.Matcher getMemberHasParent(final ViatraQueryEngine engine) {
    return MemberHasParent.Matcher.on(engine);
  }
  
  public ParentTooYoung getParentTooYoung() {
    return ParentTooYoung.instance();
  }
  
  public ParentTooYoung.Matcher getParentTooYoung(final ViatraQueryEngine engine) {
    return ParentTooYoung.Matcher.on(engine);
  }
}
