/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Entry;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Region;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         /////////
 *         // Entry
 *         /////////
 *         
 *         pattern entryInRegion(r1 : Region, e1 : Entry) {
 *         	Region.vertices(r1, e1);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EntryInRegion extends BaseGeneratedEMFQuerySpecification<EntryInRegion.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.entryInRegion pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Region fR1;
    
    private Entry fE1;
    
    private static List<String> parameterNames = makeImmutableList("r1", "e1");
    
    private Match(final Region pR1, final Entry pE1) {
      this.fR1 = pR1;
      this.fE1 = pE1;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("r1".equals(parameterName)) return this.fR1;
      if ("e1".equals(parameterName)) return this.fE1;
      return null;
    }
    
    public Region getR1() {
      return this.fR1;
    }
    
    public Entry getE1() {
      return this.fE1;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("r1".equals(parameterName) ) {
          this.fR1 = (Region) newValue;
          return true;
      }
      if ("e1".equals(parameterName) ) {
          this.fE1 = (Entry) newValue;
          return true;
      }
      return false;
    }
    
    public void setR1(final Region pR1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fR1 = pR1;
    }
    
    public void setE1(final Entry pE1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fE1 = pE1;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.entryInRegion";
    }
    
    @Override
    public List<String> parameterNames() {
      return EntryInRegion.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fR1, fE1};
    }
    
    @Override
    public EntryInRegion.Match toImmutable() {
      return isMutable() ? newMatch(fR1, fE1) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"r1\"=" + prettyPrintValue(fR1) + ", ");
      result.append("\"e1\"=" + prettyPrintValue(fE1));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fR1, fE1);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EntryInRegion.Match)) {
          EntryInRegion.Match other = (EntryInRegion.Match) obj;
          return Objects.equals(fR1, other.fR1) && Objects.equals(fE1, other.fE1);
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
    public EntryInRegion specification() {
      return EntryInRegion.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EntryInRegion.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EntryInRegion.Match newMutableMatch(final Region pR1, final Entry pE1) {
      return new Mutable(pR1, pE1);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EntryInRegion.Match newMatch(final Region pR1, final Entry pE1) {
      return new Immutable(pR1, pE1);
    }
    
    private static final class Mutable extends EntryInRegion.Match {
      Mutable(final Region pR1, final Entry pE1) {
        super(pR1, pE1);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EntryInRegion.Match {
      Immutable(final Region pR1, final Entry pE1) {
        super(pR1, pE1);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.entryInRegion pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * /////////
   * // Entry
   * /////////
   * 
   * pattern entryInRegion(r1 : Region, e1 : Entry) {
   * 	Region.vertices(r1, e1);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EntryInRegion
   * 
   */
  public static class Matcher extends BaseMatcher<EntryInRegion.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EntryInRegion.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static EntryInRegion.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_R1 = 0;
    
    private final static int POSITION_E1 = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EntryInRegion.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EntryInRegion.Match> getAllMatches(final Region pR1, final Entry pE1) {
      return rawStreamAllMatches(new Object[]{pR1, pE1}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EntryInRegion.Match> streamAllMatches(final Region pR1, final Entry pE1) {
      return rawStreamAllMatches(new Object[]{pR1, pE1});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EntryInRegion.Match> getOneArbitraryMatch(final Region pR1, final Entry pE1) {
      return rawGetOneArbitraryMatch(new Object[]{pR1, pE1});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Region pR1, final Entry pE1) {
      return rawHasMatch(new Object[]{pR1, pE1});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Region pR1, final Entry pE1) {
      return rawCountMatches(new Object[]{pR1, pE1});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Region pR1, final Entry pE1, final Consumer<? super EntryInRegion.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pR1, pE1}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pR1 the fixed value of pattern parameter r1, or null if not bound.
     * @param pE1 the fixed value of pattern parameter e1, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EntryInRegion.Match newMatch(final Region pR1, final Entry pE1) {
      return EntryInRegion.Match.newMatch(pR1, pE1);
    }
    
    /**
     * Retrieve the set of values that occur in matches for r1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Region> rawStreamAllValuesOfr1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_R1, parameters).map(Region.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for r1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Region> getAllValuesOfr1() {
      return rawStreamAllValuesOfr1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for r1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Region> streamAllValuesOfr1() {
      return rawStreamAllValuesOfr1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for r1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Region> streamAllValuesOfr1(final EntryInRegion.Match partialMatch) {
      return rawStreamAllValuesOfr1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for r1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Region> streamAllValuesOfr1(final Entry pE1) {
      return rawStreamAllValuesOfr1(new Object[]{null, pE1});
    }
    
    /**
     * Retrieve the set of values that occur in matches for r1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Region> getAllValuesOfr1(final EntryInRegion.Match partialMatch) {
      return rawStreamAllValuesOfr1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for r1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Region> getAllValuesOfr1(final Entry pE1) {
      return rawStreamAllValuesOfr1(new Object[]{null, pE1}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Entry> rawStreamAllValuesOfe1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_E1, parameters).map(Entry.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for e1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entry> getAllValuesOfe1() {
      return rawStreamAllValuesOfe1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Entry> streamAllValuesOfe1() {
      return rawStreamAllValuesOfe1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entry> streamAllValuesOfe1(final EntryInRegion.Match partialMatch) {
      return rawStreamAllValuesOfe1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entry> streamAllValuesOfe1(final Region pR1) {
      return rawStreamAllValuesOfe1(new Object[]{pR1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for e1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entry> getAllValuesOfe1(final EntryInRegion.Match partialMatch) {
      return rawStreamAllValuesOfe1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entry> getAllValuesOfe1(final Region pR1) {
      return rawStreamAllValuesOfe1(new Object[]{pR1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EntryInRegion.Match tupleToMatch(final Tuple t) {
      try {
          return EntryInRegion.Match.newMatch((Region) t.get(POSITION_R1), (Entry) t.get(POSITION_E1));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EntryInRegion.Match arrayToMatch(final Object[] match) {
      try {
          return EntryInRegion.Match.newMatch((Region) match[POSITION_R1], (Entry) match[POSITION_E1]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EntryInRegion.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EntryInRegion.Match.newMutableMatch((Region) match[POSITION_R1], (Entry) match[POSITION_E1]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<EntryInRegion.Matcher> querySpecification() {
      return EntryInRegion.instance();
    }
  }
  
  private EntryInRegion() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EntryInRegion instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntryInRegion.Matcher instantiate(final ViatraQueryEngine engine) {
    return EntryInRegion.Matcher.on(engine);
  }
  
  @Override
  public EntryInRegion.Matcher instantiate() {
    return EntryInRegion.Matcher.create();
  }
  
  @Override
  public EntryInRegion.Match newEmptyMatch() {
    return EntryInRegion.Match.newEmptyMatch();
  }
  
  @Override
  public EntryInRegion.Match newMatch(final Object... parameters) {
    return EntryInRegion.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Region) parameters[0], (ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Entry) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.EntryInRegion (visibility: PUBLIC, simpleName: EntryInRegion, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.EntryInRegion, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.EntryInRegion (visibility: PUBLIC, simpleName: EntryInRegion, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.EntryInRegion, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EntryInRegion INSTANCE = new EntryInRegion();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static EntryInRegion.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_r1 = new PParameter("r1", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Region", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Region")), PParameterDirection.INOUT);
    
    private final PParameter parameter_e1 = new PParameter("e1", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Entry", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Entry")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_r1, parameter_e1);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.entryInRegion";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("r1","e1");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_r1 = body.getOrCreateVariableByName("r1");
          PVariable var_e1 = body.getOrCreateVariableByName("e1");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_e1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Entry")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_r1, parameter_r1),
             new ExportedParameter(body, var_e1, parameter_e1)
          ));
          // 	Region.vertices(r1, e1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_r1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Region", "vertices")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_0_, var_e1);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
