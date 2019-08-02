/**
 * Generated from platform:/resource/SocialNetwork_plugin/src/ca/mcgill/ecse/socialnetwork/plugin/Queries.vql
 */
package ca.mcgill.ecse.socialnetwork.plugin;

import ca.mcgill.ecse.socialnetwork.plugin.Friendship;
import ca.mcgill.ecse.socialnetwork.plugin.NoFriend;
import ca.mcgill.ecse.socialnetwork.plugin.SelfFriend;
import ca.mcgill.ecse.socialnetwork.plugin.SingleFriendship;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in Queries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package ca.mcgill.ecse.socialnetwork.plugin, the group contains the definition of the following patterns: <ul>
 * <li>singleFriendship</li>
 * <li>noFriend</li>
 * <li>selfFriend</li>
 * <li>friendship</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() {
    querySpecifications.add(SingleFriendship.instance());
    querySpecifications.add(NoFriend.instance());
    querySpecifications.add(SelfFriend.instance());
    querySpecifications.add(Friendship.instance());
  }
  
  public SingleFriendship getSingleFriendship() {
    return SingleFriendship.instance();
  }
  
  public SingleFriendship.Matcher getSingleFriendship(final ViatraQueryEngine engine) {
    return SingleFriendship.Matcher.on(engine);
  }
  
  public NoFriend getNoFriend() {
    return NoFriend.instance();
  }
  
  public NoFriend.Matcher getNoFriend(final ViatraQueryEngine engine) {
    return NoFriend.Matcher.on(engine);
  }
  
  public SelfFriend getSelfFriend() {
    return SelfFriend.instance();
  }
  
  public SelfFriend.Matcher getSelfFriend(final ViatraQueryEngine engine) {
    return SelfFriend.Matcher.on(engine);
  }
  
  public Friendship getFriendship() {
    return Friendship.instance();
  }
  
  public Friendship.Matcher getFriendship(final ViatraQueryEngine engine) {
    return Friendship.Matcher.on(engine);
  }
}
