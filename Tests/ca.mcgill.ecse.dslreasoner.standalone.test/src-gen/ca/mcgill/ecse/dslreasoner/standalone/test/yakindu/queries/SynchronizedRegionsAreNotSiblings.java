/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex;
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
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
 *         pattern SynchronizedRegionsAreNotSiblings(s : Synchronization, v1 : Vertex, v2 : Vertex) {
 *         	find transition(_, v1, s);
 *         	find transition(_, v2, s);
 *         	CompositeElement.regions.vertices(r1, v1);
 *         	CompositeElement.regions.vertices(r2, v2);
 *         	r1 != r2;
 *         } or {
 *         	find transition(_, s, v1);
 *         	find transition(_, s, v2);
 *         	CompositeElement.regions.vertices(r1, v1);
 *         	CompositeElement.regions.vertices(r2, v2);
 *         	r1 != r2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SynchronizedRegionsAreNotSiblings extends BaseGeneratedEMFQuerySpecification<SynchronizedRegionsAreNotSiblings.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings pattern,
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
    
    private Vertex fV1;
    
    private Vertex fV2;
    
    private static List<String> parameterNames = makeImmutableList("s", "v1", "v2");
    
    private Match(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      this.fS = pS;
      this.fV1 = pV1;
      this.fV2 = pV2;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("s".equals(parameterName)) return this.fS;
      if ("v1".equals(parameterName)) return this.fV1;
      if ("v2".equals(parameterName)) return this.fV2;
      return null;
    }
    
    public Synchronization getS() {
      return this.fS;
    }
    
    public Vertex getV1() {
      return this.fV1;
    }
    
    public Vertex getV2() {
      return this.fV2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("s".equals(parameterName) ) {
          this.fS = (Synchronization) newValue;
          return true;
      }
      if ("v1".equals(parameterName) ) {
          this.fV1 = (Vertex) newValue;
          return true;
      }
      if ("v2".equals(parameterName) ) {
          this.fV2 = (Vertex) newValue;
          return true;
      }
      return false;
    }
    
    public void setS(final Synchronization pS) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS = pS;
    }
    
    public void setV1(final Vertex pV1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fV1 = pV1;
    }
    
    public void setV2(final Vertex pV2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fV2 = pV2;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings";
    }
    
    @Override
    public List<String> parameterNames() {
      return SynchronizedRegionsAreNotSiblings.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fS, fV1, fV2};
    }
    
    @Override
    public SynchronizedRegionsAreNotSiblings.Match toImmutable() {
      return isMutable() ? newMatch(fS, fV1, fV2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"s\"=" + prettyPrintValue(fS) + ", ");
      result.append("\"v1\"=" + prettyPrintValue(fV1) + ", ");
      result.append("\"v2\"=" + prettyPrintValue(fV2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fS, fV1, fV2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SynchronizedRegionsAreNotSiblings.Match)) {
          SynchronizedRegionsAreNotSiblings.Match other = (SynchronizedRegionsAreNotSiblings.Match) obj;
          return Objects.equals(fS, other.fS) && Objects.equals(fV1, other.fV1) && Objects.equals(fV2, other.fV2);
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
    public SynchronizedRegionsAreNotSiblings specification() {
      return SynchronizedRegionsAreNotSiblings.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SynchronizedRegionsAreNotSiblings.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SynchronizedRegionsAreNotSiblings.Match newMutableMatch(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return new Mutable(pS, pV1, pV2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SynchronizedRegionsAreNotSiblings.Match newMatch(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return new Immutable(pS, pV1, pV2);
    }
    
    private static final class Mutable extends SynchronizedRegionsAreNotSiblings.Match {
      Mutable(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
        super(pS, pV1, pV2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SynchronizedRegionsAreNotSiblings.Match {
      Immutable(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
        super(pS, pV1, pV2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings pattern,
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
   * pattern SynchronizedRegionsAreNotSiblings(s : Synchronization, v1 : Vertex, v2 : Vertex) {
   * 	find transition(_, v1, s);
   * 	find transition(_, v2, s);
   * 	CompositeElement.regions.vertices(r1, v1);
   * 	CompositeElement.regions.vertices(r2, v2);
   * 	r1 != r2;
   * } or {
   * 	find transition(_, s, v1);
   * 	find transition(_, s, v2);
   * 	CompositeElement.regions.vertices(r1, v1);
   * 	CompositeElement.regions.vertices(r2, v2);
   * 	r1 != r2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SynchronizedRegionsAreNotSiblings
   * 
   */
  public static class Matcher extends BaseMatcher<SynchronizedRegionsAreNotSiblings.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SynchronizedRegionsAreNotSiblings.Matcher on(final ViatraQueryEngine engine) {
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
    public static SynchronizedRegionsAreNotSiblings.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_S = 0;
    
    private final static int POSITION_V1 = 1;
    
    private final static int POSITION_V2 = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SynchronizedRegionsAreNotSiblings.Matcher.class);
    
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
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SynchronizedRegionsAreNotSiblings.Match> getAllMatches(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return rawStreamAllMatches(new Object[]{pS, pV1, pV2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SynchronizedRegionsAreNotSiblings.Match> streamAllMatches(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return rawStreamAllMatches(new Object[]{pS, pV1, pV2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SynchronizedRegionsAreNotSiblings.Match> getOneArbitraryMatch(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return rawGetOneArbitraryMatch(new Object[]{pS, pV1, pV2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return rawHasMatch(new Object[]{pS, pV1, pV2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return rawCountMatches(new Object[]{pS, pV1, pV2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Synchronization pS, final Vertex pV1, final Vertex pV2, final Consumer<? super SynchronizedRegionsAreNotSiblings.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pS, pV1, pV2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param pV1 the fixed value of pattern parameter v1, or null if not bound.
     * @param pV2 the fixed value of pattern parameter v2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SynchronizedRegionsAreNotSiblings.Match newMatch(final Synchronization pS, final Vertex pV1, final Vertex pV2) {
      return SynchronizedRegionsAreNotSiblings.Match.newMatch(pS, pV1, pV2);
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
    public Stream<Synchronization> streamAllValuesOfs(final SynchronizedRegionsAreNotSiblings.Match partialMatch) {
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
    public Stream<Synchronization> streamAllValuesOfs(final Vertex pV1, final Vertex pV2) {
      return rawStreamAllValuesOfs(new Object[]{null, pV1, pV2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synchronization> getAllValuesOfs(final SynchronizedRegionsAreNotSiblings.Match partialMatch) {
      return rawStreamAllValuesOfs(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synchronization> getAllValuesOfs(final Vertex pV1, final Vertex pV2) {
      return rawStreamAllValuesOfs(new Object[]{null, pV1, pV2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Vertex> rawStreamAllValuesOfv1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_V1, parameters).map(Vertex.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for v1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv1() {
      return rawStreamAllValuesOfv1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv1() {
      return rawStreamAllValuesOfv1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv1(final SynchronizedRegionsAreNotSiblings.Match partialMatch) {
      return rawStreamAllValuesOfv1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv1(final Synchronization pS, final Vertex pV2) {
      return rawStreamAllValuesOfv1(new Object[]{pS, null, pV2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for v1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv1(final SynchronizedRegionsAreNotSiblings.Match partialMatch) {
      return rawStreamAllValuesOfv1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv1(final Synchronization pS, final Vertex pV2) {
      return rawStreamAllValuesOfv1(new Object[]{pS, null, pV2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Vertex> rawStreamAllValuesOfv2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_V2, parameters).map(Vertex.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for v2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv2() {
      return rawStreamAllValuesOfv2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv2() {
      return rawStreamAllValuesOfv2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv2(final SynchronizedRegionsAreNotSiblings.Match partialMatch) {
      return rawStreamAllValuesOfv2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Vertex> streamAllValuesOfv2(final Synchronization pS, final Vertex pV1) {
      return rawStreamAllValuesOfv2(new Object[]{pS, pV1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for v2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv2(final SynchronizedRegionsAreNotSiblings.Match partialMatch) {
      return rawStreamAllValuesOfv2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Vertex> getAllValuesOfv2(final Synchronization pS, final Vertex pV1) {
      return rawStreamAllValuesOfv2(new Object[]{pS, pV1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SynchronizedRegionsAreNotSiblings.Match tupleToMatch(final Tuple t) {
      try {
          return SynchronizedRegionsAreNotSiblings.Match.newMatch((Synchronization) t.get(POSITION_S), (Vertex) t.get(POSITION_V1), (Vertex) t.get(POSITION_V2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SynchronizedRegionsAreNotSiblings.Match arrayToMatch(final Object[] match) {
      try {
          return SynchronizedRegionsAreNotSiblings.Match.newMatch((Synchronization) match[POSITION_S], (Vertex) match[POSITION_V1], (Vertex) match[POSITION_V2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SynchronizedRegionsAreNotSiblings.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SynchronizedRegionsAreNotSiblings.Match.newMutableMatch((Synchronization) match[POSITION_S], (Vertex) match[POSITION_V1], (Vertex) match[POSITION_V2]);
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
    public static IQuerySpecification<SynchronizedRegionsAreNotSiblings.Matcher> querySpecification() {
      return SynchronizedRegionsAreNotSiblings.instance();
    }
  }
  
  private SynchronizedRegionsAreNotSiblings() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SynchronizedRegionsAreNotSiblings instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SynchronizedRegionsAreNotSiblings.Matcher instantiate(final ViatraQueryEngine engine) {
    return SynchronizedRegionsAreNotSiblings.Matcher.on(engine);
  }
  
  @Override
  public SynchronizedRegionsAreNotSiblings.Matcher instantiate() {
    return SynchronizedRegionsAreNotSiblings.Matcher.create();
  }
  
  @Override
  public SynchronizedRegionsAreNotSiblings.Match newEmptyMatch() {
    return SynchronizedRegionsAreNotSiblings.Match.newEmptyMatch();
  }
  
  @Override
  public SynchronizedRegionsAreNotSiblings.Match newMatch(final Object... parameters) {
    return SynchronizedRegionsAreNotSiblings.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization) parameters[0], (ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex) parameters[1], (ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings (visibility: PUBLIC, simpleName: SynchronizedRegionsAreNotSiblings, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings (visibility: PUBLIC, simpleName: SynchronizedRegionsAreNotSiblings, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static SynchronizedRegionsAreNotSiblings INSTANCE = new SynchronizedRegionsAreNotSiblings();
    
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
    private final static SynchronizedRegionsAreNotSiblings.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_s = new PParameter("s", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Synchronization")), PParameterDirection.INOUT);
    
    private final PParameter parameter_v1 = new PParameter("v1", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Vertex")), PParameterDirection.INOUT);
    
    private final PParameter parameter_v2 = new PParameter("v2", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Vertex")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_s, parameter_v1, parameter_v2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchronizedRegionsAreNotSiblings";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s","v1","v2");
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
          PVariable var_v1 = body.getOrCreateVariableByName("v1");
          PVariable var_v2 = body.getOrCreateVariableByName("v2");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var_r1 = body.getOrCreateVariableByName("r1");
          PVariable var_r2 = body.getOrCreateVariableByName("r2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Synchronization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_s, parameter_s),
             new ExportedParameter(body, var_v1, parameter_v1),
             new ExportedParameter(body, var_v2, parameter_v2)
          ));
          // 	find transition(_, v1, s)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___0_, var_v1, var_s), Transition.instance().getInternalQueryRepresentation());
          // 	find transition(_, v2, s)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___1_, var_v2, var_s), Transition.instance().getInternalQueryRepresentation());
          // 	CompositeElement.regions.vertices(r1, v1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_r1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "CompositeElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "CompositeElement", "regions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Region", "vertices")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_1_, var_v1);
          // 	CompositeElement.regions.vertices(r2, v2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_r2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "CompositeElement")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r2, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "CompositeElement", "regions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Region", "vertices")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_3_, var_v2);
          // 	r1 != r2
          new Inequality(body, var_r1, var_r2);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_s = body.getOrCreateVariableByName("s");
          PVariable var_v1 = body.getOrCreateVariableByName("v1");
          PVariable var_v2 = body.getOrCreateVariableByName("v2");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var_r1 = body.getOrCreateVariableByName("r1");
          PVariable var_r2 = body.getOrCreateVariableByName("r2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Synchronization")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_v2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_s, parameter_s),
             new ExportedParameter(body, var_v1, parameter_v1),
             new ExportedParameter(body, var_v2, parameter_v2)
          ));
          // 	find transition(_, s, v1)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___0_, var_s, var_v1), Transition.instance().getInternalQueryRepresentation());
          // 	find transition(_, s, v2)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___1_, var_s, var_v2), Transition.instance().getInternalQueryRepresentation());
          // 	CompositeElement.regions.vertices(r1, v1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_r1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "CompositeElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "CompositeElement", "regions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Region", "vertices")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_1_, var_v1);
          // 	CompositeElement.regions.vertices(r2, v2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_r2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "CompositeElement")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_r2, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "CompositeElement", "regions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Region", "vertices")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_3_, var_v2);
          // 	r1 != r2
          new Inequality(body, var_r1, var_r2);
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
