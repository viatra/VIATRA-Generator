/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.Child;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleRegions;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.Transition;
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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
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
 *         {@literal @}Constraint(severity="error", message="error", key = {s})
 *         pattern SynchronizedRegionDoesNotHaveMultipleRegions(s : Synchronization, v : Vertex) {
 *         	find transition(_, v, s);
 *         	find child(c,v);
 *         	neg find hasMultipleRegions(c);
 *         } or {
 *         	find transition(_, s, v);
 *         	find child(c,v);
 *         	neg find hasMultipleRegions(c);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SynchronizedRegionDoesNotHaveMultipleRegions extends BaseGeneratedEMFQuerySpecification<SynchronizedRegionDoesNotHaveMultipleRegions.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions pattern,
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
    private Synchronization fS;
    
    private Vertex fV;
    
    private static List<String> parameterNames = makeImmutableList("s", "v");
    
    private Match(final Synchronization pS, final Vertex pV) {
      this.fS = pS;
      this.fV = pV;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("s".equals(parameterName)) return this.fS;
      if ("v".equals(parameterName)) return this.fV;
      return null;
    }
    
    public Synchronization getS() {
      return this.fS;
    }
    
    public Vertex getV() {
      return this.fV;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("s".equals(parameterName) ) {
          this.fS = (Synchronization) newValue;
          return true;
      }
      if ("v".equals(parameterName) ) {
          this.fV = (Vertex) newValue;
          return true;
      }
      return false;
    }
    
    public void setS(final Synchronization pS) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS = pS;
    }
    
    public void setV(final Vertex pV) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fV = pV;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions";
    }
    
    @Override
    public List<String> parameterNames() {
      return SynchronizedRegionDoesNotHaveMultipleRegions.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fS, fV};
    }
    
    @Override
    public SynchronizedRegionDoesNotHaveMultipleRegions.Match toImmutable() {
      return isMutable() ? newMatch(fS, fV) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"s\"=" + prettyPrintValue(fS) + ", ");
      result.append("\"v\"=" + prettyPrintValue(fV));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fS, fV);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SynchronizedRegionDoesNotHaveMultipleRegions.Match)) {
          SynchronizedRegionDoesNotHaveMultipleRegions.Match other = (SynchronizedRegionDoesNotHaveMultipleRegions.Match) obj;
          return Objects.equals(fS, other.fS) && Objects.equals(fV, other.fV);
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
    public SynchronizedRegionDoesNotHaveMultipleRegions specification() {
      return SynchronizedRegionDoesNotHaveMultipleRegions.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SynchronizedRegionDoesNotHaveMultipleRegions.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SynchronizedRegionDoesNotHaveMultipleRegions.Match newMutableMatch(final Synchronization pS, final Vertex pV) {
      return new Mutable(pS, pV);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SynchronizedRegionDoesNotHaveMultipleRegions.Match newMatch(final Synchronization pS, final Vertex pV) {
      return new Immutable(pS, pV);
    }
    
    private static final class Mutable extends SynchronizedRegionDoesNotHaveMultipleRegions.Match {
      Mutable(final Synchronization pS, final Vertex pV) {
        super(pS, pV);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SynchronizedRegionDoesNotHaveMultipleRegions.Match {
      Immutable(final Synchronization pS, final Vertex pV) {
        super(pS, pV);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity="error", message="error", key = {s})
   * pattern SynchronizedRegionDoesNotHaveMultipleRegions(s : Synchronization, v : Vertex) {
   * 	find transition(_, v, s);
   * 	find child(c,v);
   * 	neg find hasMultipleRegions(c);
   * } or {
   * 	find transition(_, s, v);
   * 	find child(c,v);
   * 	neg find hasMultipleRegions(c);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SynchronizedRegionDoesNotHaveMultipleRegions
   * 
   */
  public static class Matcher extends BaseMatcher<SynchronizedRegionDoesNotHaveMultipleRegions.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SynchronizedRegionDoesNotHaveMultipleRegions.Matcher on(final ViatraQueryEngine engine) {
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
    public static SynchronizedRegionDoesNotHaveMultipleRegions.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_S = 0;
    
    private final static int POSITION_V = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SynchronizedRegionDoesNotHaveMultipleRegions.Matcher.class);
    
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
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SynchronizedRegionDoesNotHaveMultipleRegions.Match> getAllMatches(final Synchronization pS, final Vertex pV) {
      return rawStreamAllMatches(new Object[]{pS, pV}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SynchronizedRegionDoesNotHaveMultipleRegions.Match> streamAllMatches(final Synchronization pS, final Vertex pV) {
      return rawStreamAllMatches(new Object[]{pS, pV});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SynchronizedRegionDoesNotHaveMultipleRegions.Match> getOneArbitraryMatch(final Synchronization pS, final Vertex pV) {
      return rawGetOneArbitraryMatch(new Object[]{pS, pV});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Synchronization pS, final Vertex pV) {
      return rawHasMatch(new Object[]{pS, pV});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Synchronization pS, final Vertex pV) {
      return rawCountMatches(new Object[]{pS, pV});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Synchronization pS, final Vertex pV, final Consumer<? super SynchronizedRegionDoesNotHaveMultipleRegions.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pS, pV}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SynchronizedRegionDoesNotHaveMultipleRegions.Match newMatch(final Synchronization pS, final Vertex pV) {
      return SynchronizedRegionDoesNotHaveMultipleRegions.Match.newMatch(pS, pV);
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Synchronization> rawStreamAllValuesOfs(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S, parameters).map(Synchronization.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synchronization> getAllValuesOfs() {
      return rawStreamAllValuesOfs(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Synchronization> streamAllValuesOfs() {
      return rawStreamAllValuesOfs(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Synchronization> streamAllValuesOfs(final SynchronizedRegionDoesNotHaveMultipleRegions.Match partialMatch) {
      return rawStreamAllValuesOfs(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Synchronization> streamAllValuesOfs(final Vertex pV) {
      return rawStreamAllValuesOfs(new Object[]{null, pV});
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synchronization> getAllValuesOfs(final SynchronizedRegionDoesNotHaveMultipleRegions.Match partialMatch) {
      return rawStreamAllValuesOfs(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synchronization> getAllValuesOfs(final Vertex pV) {
      return rawStreamAllValuesOfs(new Object[]{null, pV}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Vertex> rawStreamAllValuesOfv(final Object[] parameters) {
      return rawStreamAllValues(POSITION_V, parameters).map(Vertex.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv(final SynchronizedRegionDoesNotHaveMultipleRegions.Match partialMatch) {
      return rawStreamAllValuesOfv(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv(final Synchronization pS) {
      return rawStreamAllValuesOfv(new Object[]{pS, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv(final SynchronizedRegionDoesNotHaveMultipleRegions.Match partialMatch) {
      return rawStreamAllValuesOfv(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv(final Synchronization pS) {
      return rawStreamAllValuesOfv(new Object[]{pS, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SynchronizedRegionDoesNotHaveMultipleRegions.Match tupleToMatch(final Tuple t) {
      try {
          return SynchronizedRegionDoesNotHaveMultipleRegions.Match.newMatch((Synchronization) t.get(POSITION_S), (Vertex) t.get(POSITION_V));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SynchronizedRegionDoesNotHaveMultipleRegions.Match arrayToMatch(final Object[] match) {
      try {
          return SynchronizedRegionDoesNotHaveMultipleRegions.Match.newMatch((Synchronization) match[POSITION_S], (Vertex) match[POSITION_V]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SynchronizedRegionDoesNotHaveMultipleRegions.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SynchronizedRegionDoesNotHaveMultipleRegions.Match.newMutableMatch((Synchronization) match[POSITION_S], (Vertex) match[POSITION_V]);
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
    public static IQuerySpecification<SynchronizedRegionDoesNotHaveMultipleRegions.Matcher> querySpecification() {
      return SynchronizedRegionDoesNotHaveMultipleRegions.instance();
    }
  }
  
  private SynchronizedRegionDoesNotHaveMultipleRegions() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SynchronizedRegionDoesNotHaveMultipleRegions instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SynchronizedRegionDoesNotHaveMultipleRegions.Matcher instantiate(final ViatraQueryEngine engine) {
    return SynchronizedRegionDoesNotHaveMultipleRegions.Matcher.on(engine);
  }
  
  @Override
  public SynchronizedRegionDoesNotHaveMultipleRegions.Matcher instantiate() {
    return SynchronizedRegionDoesNotHaveMultipleRegions.Matcher.create();
  }
  
  @Override
  public SynchronizedRegionDoesNotHaveMultipleRegions.Match newEmptyMatch() {
    return SynchronizedRegionDoesNotHaveMultipleRegions.Match.newEmptyMatch();
  }
  
  @Override
  public SynchronizedRegionDoesNotHaveMultipleRegions.Match newMatch(final Object... parameters) {
    return SynchronizedRegionDoesNotHaveMultipleRegions.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization) parameters[0], (ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions (visibility: PUBLIC, simpleName: SynchronizedRegionDoesNotHaveMultipleRegions, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions (visibility: PUBLIC, simpleName: SynchronizedRegionDoesNotHaveMultipleRegions, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static SynchronizedRegionDoesNotHaveMultipleRegions INSTANCE = new SynchronizedRegionDoesNotHaveMultipleRegions();
    
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
    private final static SynchronizedRegionDoesNotHaveMultipleRegions.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_s = new PParameter("s", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Synchronization")), PParameterDirection.INOUT);
    
    private final PParameter parameter_v = new PParameter("v", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Vertex")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_s, parameter_v);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionDoesNotHaveMultipleRegions";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s","v");
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
          PVariable var_s = body.getOrCreateVariableByName("s");
          PVariable var_v = body.getOrCreateVariableByName("v");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_c = body.getOrCreateVariableByName("c");
          new TypeConstraint(body, Tuples.flatTupleOf(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Synchronization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_s, parameter_s),
             new ExportedParameter(body, var_v, parameter_v)
          ));
          // 	find transition(_, v, s)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___0_, var_v, var_s), Transition.instance().getInternalQueryRepresentation());
          // 	find child(c,v)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_c, var_v), Child.instance().getInternalQueryRepresentation());
          // 	neg find hasMultipleRegions(c)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_c), HasMultipleRegions.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_s = body.getOrCreateVariableByName("s");
          PVariable var_v = body.getOrCreateVariableByName("v");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_c = body.getOrCreateVariableByName("c");
          new TypeConstraint(body, Tuples.flatTupleOf(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Synchronization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_s, parameter_s),
             new ExportedParameter(body, var_v, parameter_v)
          ));
          // 	find transition(_, s, v)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___0_, var_s, var_v), Transition.instance().getInternalQueryRepresentation());
          // 	find child(c,v)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_c, var_v), Child.instance().getInternalQueryRepresentation());
          // 	neg find hasMultipleRegions(c)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_c), HasMultipleRegions.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("s")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
