/**
 * Generated from platform:/resource/hu.bme.mit.inf.smartgridgenerator/src/patterns/pattern.vql
 */
package patterns;

import hu.bme.mit.inf.smartgrid.Concentrator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import patterns.util.ConcentratorHasParentQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.concentratorHasParent pattern,
 * to be used in conjunction with {@link ConcentratorHasParentMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ConcentratorHasParentMatcher
 *  @see ConcentratorHasParentProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ConcentratorHasParentMatch extends BasePatternMatch {
  private Concentrator fConcentrator;
  
  private static List<String> parameterNames = makeImmutableList("concentrator");
  
  private ConcentratorHasParentMatch(final Concentrator pConcentrator) {
    this.fConcentrator = pConcentrator;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("concentrator".equals(parameterName)) return this.fConcentrator;
    return null;
  }
  
  public Concentrator getConcentrator() {
    return this.fConcentrator;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("concentrator".equals(parameterName) ) {
        this.fConcentrator = (Concentrator) newValue;
        return true;
    }
    return false;
  }
  
  public void setConcentrator(final Concentrator pConcentrator) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fConcentrator = pConcentrator;
  }
  
  @Override
  public String patternName() {
    return "patterns.concentratorHasParent";
  }
  
  @Override
  public List<String> parameterNames() {
    return ConcentratorHasParentMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fConcentrator};
  }
  
  @Override
  public ConcentratorHasParentMatch toImmutable() {
    return isMutable() ? newMatch(fConcentrator) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"concentrator\"=" + prettyPrintValue(fConcentrator));
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash (fConcentrator);
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (obj == null) {
        return false;
    }
    if ((obj instanceof ConcentratorHasParentMatch)) {
        ConcentratorHasParentMatch other = (ConcentratorHasParentMatch) obj;
        return Objects.equals(fConcentrator, other.fConcentrator);
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
  public ConcentratorHasParentQuerySpecification specification() {
    try {
        return ConcentratorHasParentQuerySpecification.instance();
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
  public static ConcentratorHasParentMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ConcentratorHasParentMatch newMutableMatch(final Concentrator pConcentrator) {
    return new Mutable(pConcentrator);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ConcentratorHasParentMatch newMatch(final Concentrator pConcentrator) {
    return new Immutable(pConcentrator);
  }
  
  private static final class Mutable extends ConcentratorHasParentMatch {
    Mutable(final Concentrator pConcentrator) {
      super(pConcentrator);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ConcentratorHasParentMatch {
    Immutable(final Concentrator pConcentrator) {
      super(pConcentrator);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
