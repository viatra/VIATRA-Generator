/**
 * Generated from platform:/resource/hu.bme.mit.inf.smartgridgenerator/src/patterns/pattern.vql
 */
package patterns;

import hu.bme.mit.inf.smartgrid.Concentrator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import patterns.ConcentratorHasParentMatch;
import patterns.util.ConcentratorHasParentQuerySpecification;

/**
 * Generated pattern matcher API of the patterns.concentratorHasParent pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ConcentratorHasParentMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //pattern childIsSmartMeter(meter : SmartMeter){
 * //	SmartMeter(child);
 * //	SmartMeter.communicationChild(meter, child);
 * //}
 * //
 * //{@literal @}Constraint(message="childIsNotSmartMeter", severity="error", key={meter})
 * //pattern childIsNotSmartMeter(meter : Meter){
 * //	neg find childIsSmartMeter(meter);
 * //}
 * 
 * {@literal @}Constraint(message="concentratorHasParent", severity="error", key={concentrator})
 * pattern concentratorHasParent(concentrator : Concentrator){
 * 	Entity.communicationParent(concentrator, _);
 * }
 * </pre></code>
 * 
 * @see ConcentratorHasParentMatch
 *  @see ConcentratorHasParentProcessor
 * @see ConcentratorHasParentQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ConcentratorHasParentMatcher extends BaseMatcher<ConcentratorHasParentMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ConcentratorHasParentMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ConcentratorHasParentMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ConcentratorHasParentMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ConcentratorHasParentMatcher create() throws ViatraQueryException {
    return new ConcentratorHasParentMatcher();
  }
  
  private final static int POSITION_CONCENTRATOR = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConcentratorHasParentMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ConcentratorHasParentMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @return matches represented as a ConcentratorHasParentMatch object.
   * 
   */
  public Collection<ConcentratorHasParentMatch> getAllMatches(final Concentrator pConcentrator) {
    return rawGetAllMatches(new Object[]{pConcentrator});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @return a match represented as a ConcentratorHasParentMatch object, or null if no match is found.
   * 
   */
  public ConcentratorHasParentMatch getOneArbitraryMatch(final Concentrator pConcentrator) {
    return rawGetOneArbitraryMatch(new Object[]{pConcentrator});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Concentrator pConcentrator) {
    return rawHasMatch(new Object[]{pConcentrator});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Concentrator pConcentrator) {
    return rawCountMatches(new Object[]{pConcentrator});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Concentrator pConcentrator, final IMatchProcessor<? super ConcentratorHasParentMatch> processor) {
    rawForEachMatch(new Object[]{pConcentrator}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Concentrator pConcentrator, final IMatchProcessor<? super ConcentratorHasParentMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pConcentrator}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConcentrator the fixed value of pattern parameter concentrator, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ConcentratorHasParentMatch newMatch(final Concentrator pConcentrator) {
    return ConcentratorHasParentMatch.newMatch(pConcentrator);
  }
  
  /**
   * Retrieve the set of values that occur in matches for concentrator.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<Concentrator> rawAccumulateAllValuesOfconcentrator(final Object[] parameters) {
    Set<Concentrator> results = new HashSet<Concentrator>();
    rawAccumulateAllValues(POSITION_CONCENTRATOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for concentrator.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<Concentrator> getAllValuesOfconcentrator() {
    return rawAccumulateAllValuesOfconcentrator(emptyArray());
  }
  
  @Override
  protected ConcentratorHasParentMatch tupleToMatch(final Tuple t) {
    try {
        return ConcentratorHasParentMatch.newMatch((Concentrator) t.get(POSITION_CONCENTRATOR));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ConcentratorHasParentMatch arrayToMatch(final Object[] match) {
    try {
        return ConcentratorHasParentMatch.newMatch((Concentrator) match[POSITION_CONCENTRATOR]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ConcentratorHasParentMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ConcentratorHasParentMatch.newMutableMatch((Concentrator) match[POSITION_CONCENTRATOR]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ConcentratorHasParentMatcher> querySpecification() throws ViatraQueryException {
    return ConcentratorHasParentQuerySpecification.instance();
  }
}
