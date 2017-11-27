/**
 * Generated from platform:/resource/hu.bme.mit.inf.smartgridgenerator/src/patterns/pattern.vql
 */
package patterns;

import hu.bme.mit.inf.smartgrid.Entity;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterns.util.HasParentQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.hasParent pattern,
 * to be used in conjunction with {@link HasParentMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see HasParentMatcher
 *  @see HasParentProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class HasParentMatch extends BasePatternMatch {
  private Entity fEntity;
  
  private static List<String> parameterNames = makeImmutableList("entity");
  
  private HasParentMatch(final Entity pEntity) {
    this.fEntity = pEntity;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("entity".equals(parameterName)) return this.fEntity;
    return null;
  }
  
  public Entity getEntity() {
    return this.fEntity;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("entity".equals(parameterName) ) {
        this.fEntity = (Entity) newValue;
        return true;
    }
    return false;
  }
  
  public void setEntity(final Entity pEntity) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEntity = pEntity;
  }
  
  @Override
  public String patternName() {
    return "patterns.hasParent";
  }
  
  @Override
  public List<String> parameterNames() {
    return HasParentMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fEntity};
  }
  
  @Override
  public HasParentMatch toImmutable() {
    return isMutable() ? newMatch(fEntity) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"entity\"=" + prettyPrintValue(fEntity));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fEntity);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof HasParentMatch)) {
        HasParentMatch other = (HasParentMatch) obj;
        return Objects.equals(fEntity, other.fEntity);
    } else {
        // this should be infrequent
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
    }
  }
  
  @Override
  public HasParentQuerySpecification specification() {
    try {
        return HasParentQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static HasParentMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static HasParentMatch newMutableMatch(final Entity pEntity) {
    return new Mutable(pEntity);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEntity the fixed value of pattern parameter entity, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static HasParentMatch newMatch(final Entity pEntity) {
    return new Immutable(pEntity);
  }
  
  private static final class Mutable extends HasParentMatch {
    Mutable(final Entity pEntity) {
      super(pEntity);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends HasParentMatch {
    Immutable(final Entity pEntity) {
      super(pEntity);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
