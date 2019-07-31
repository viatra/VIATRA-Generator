/**
 * Generated from platform:/resource/SocialNetwork_plugin/queries/queries/ecore_pattern.vql
 */
package queries;

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
 *         {@literal @}Constraint(severity="error", message="error", key = {c})
 *         pattern sameSuperClass(c : EClass, s1 : EClass, s2: EClass) {
 *         	EClass.eSuperTypes(c, s1);
 *         	EClass.eSuperTypes(c, s2);
 *         	s1 == s2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SameSuperClass extends BaseGeneratedEMFQuerySpecification<SameSuperClass.Matcher> {
  /**
   * Pattern-specific match representation of the queries.sameSuperClass pattern,
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
    private EClass fC;
    
    private EClass fS1;
    
    private EClass fS2;
    
    private static List<String> parameterNames = makeImmutableList("c", "s1", "s2");
    
    private Match(final EClass pC, final EClass pS1, final EClass pS2) {
      this.fC = pC;
      this.fS1 = pS1;
      this.fS2 = pS2;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("c".equals(parameterName)) return this.fC;
      if ("s1".equals(parameterName)) return this.fS1;
      if ("s2".equals(parameterName)) return this.fS2;
      return null;
    }
    
    public EClass getC() {
      return this.fC;
    }
    
    public EClass getS1() {
      return this.fS1;
    }
    
    public EClass getS2() {
      return this.fS2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("c".equals(parameterName) ) {
          this.fC = (EClass) newValue;
          return true;
      }
      if ("s1".equals(parameterName) ) {
          this.fS1 = (EClass) newValue;
          return true;
      }
      if ("s2".equals(parameterName) ) {
          this.fS2 = (EClass) newValue;
          return true;
      }
      return false;
    }
    
    public void setC(final EClass pC) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fC = pC;
    }
    
    public void setS1(final EClass pS1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS1 = pS1;
    }
    
    public void setS2(final EClass pS2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS2 = pS2;
    }
    
    @Override
    public String patternName() {
      return "queries.sameSuperClass";
    }
    
    @Override
    public List<String> parameterNames() {
      return SameSuperClass.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fC, fS1, fS2};
    }
    
    @Override
    public SameSuperClass.Match toImmutable() {
      return isMutable() ? newMatch(fC, fS1, fS2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"c\"=" + prettyPrintValue(fC) + ", ");
      result.append("\"s1\"=" + prettyPrintValue(fS1) + ", ");
      result.append("\"s2\"=" + prettyPrintValue(fS2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fC, fS1, fS2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SameSuperClass.Match)) {
          SameSuperClass.Match other = (SameSuperClass.Match) obj;
          return Objects.equals(fC, other.fC) && Objects.equals(fS1, other.fS1) && Objects.equals(fS2, other.fS2);
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
    public SameSuperClass specification() {
      return SameSuperClass.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SameSuperClass.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SameSuperClass.Match newMutableMatch(final EClass pC, final EClass pS1, final EClass pS2) {
      return new Mutable(pC, pS1, pS2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SameSuperClass.Match newMatch(final EClass pC, final EClass pS1, final EClass pS2) {
      return new Immutable(pC, pS1, pS2);
    }
    
    private static final class Mutable extends SameSuperClass.Match {
      Mutable(final EClass pC, final EClass pS1, final EClass pS2) {
        super(pC, pS1, pS2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SameSuperClass.Match {
      Immutable(final EClass pC, final EClass pS1, final EClass pS2) {
        super(pC, pS1, pS2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.sameSuperClass pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity="error", message="error", key = {c})
   * pattern sameSuperClass(c : EClass, s1 : EClass, s2: EClass) {
   * 	EClass.eSuperTypes(c, s1);
   * 	EClass.eSuperTypes(c, s2);
   * 	s1 == s2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SameSuperClass
   * 
   */
  public static class Matcher extends BaseMatcher<SameSuperClass.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SameSuperClass.Matcher on(final ViatraQueryEngine engine) {
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
    public static SameSuperClass.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_C = 0;
    
    private static final int POSITION_S1 = 1;
    
    private static final int POSITION_S2 = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SameSuperClass.Matcher.class);
    
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
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SameSuperClass.Match> getAllMatches(final EClass pC, final EClass pS1, final EClass pS2) {
      return rawStreamAllMatches(new Object[]{pC, pS1, pS2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SameSuperClass.Match> streamAllMatches(final EClass pC, final EClass pS1, final EClass pS2) {
      return rawStreamAllMatches(new Object[]{pC, pS1, pS2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SameSuperClass.Match> getOneArbitraryMatch(final EClass pC, final EClass pS1, final EClass pS2) {
      return rawGetOneArbitraryMatch(new Object[]{pC, pS1, pS2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EClass pC, final EClass pS1, final EClass pS2) {
      return rawHasMatch(new Object[]{pC, pS1, pS2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EClass pC, final EClass pS1, final EClass pS2) {
      return rawCountMatches(new Object[]{pC, pS1, pS2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EClass pC, final EClass pS1, final EClass pS2, final Consumer<? super SameSuperClass.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pC, pS1, pS2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SameSuperClass.Match newMatch(final EClass pC, final EClass pS1, final EClass pS2) {
      return SameSuperClass.Match.newMatch(pC, pS1, pS2);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EClass> rawStreamAllValuesOfc(final Object[] parameters) {
      return rawStreamAllValues(POSITION_C, parameters).map(EClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc() {
      return rawStreamAllValuesOfc(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc() {
      return rawStreamAllValuesOfc(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc(final SameSuperClass.Match partialMatch) {
      return rawStreamAllValuesOfc(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc(final EClass pS1, final EClass pS2) {
      return rawStreamAllValuesOfc(new Object[]{null, pS1, pS2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc(final SameSuperClass.Match partialMatch) {
      return rawStreamAllValuesOfc(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc(final EClass pS1, final EClass pS2) {
      return rawStreamAllValuesOfc(new Object[]{null, pS1, pS2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EClass> rawStreamAllValuesOfs1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S1, parameters).map(EClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for s1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfs1() {
      return rawStreamAllValuesOfs1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfs1() {
      return rawStreamAllValuesOfs1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfs1(final SameSuperClass.Match partialMatch) {
      return rawStreamAllValuesOfs1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfs1(final EClass pC, final EClass pS2) {
      return rawStreamAllValuesOfs1(new Object[]{pC, null, pS2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for s1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfs1(final SameSuperClass.Match partialMatch) {
      return rawStreamAllValuesOfs1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfs1(final EClass pC, final EClass pS2) {
      return rawStreamAllValuesOfs1(new Object[]{pC, null, pS2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EClass> rawStreamAllValuesOfs2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S2, parameters).map(EClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for s2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfs2() {
      return rawStreamAllValuesOfs2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfs2() {
      return rawStreamAllValuesOfs2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfs2(final SameSuperClass.Match partialMatch) {
      return rawStreamAllValuesOfs2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfs2(final EClass pC, final EClass pS1) {
      return rawStreamAllValuesOfs2(new Object[]{pC, pS1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for s2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfs2(final SameSuperClass.Match partialMatch) {
      return rawStreamAllValuesOfs2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfs2(final EClass pC, final EClass pS1) {
      return rawStreamAllValuesOfs2(new Object[]{pC, pS1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SameSuperClass.Match tupleToMatch(final Tuple t) {
      try {
          return SameSuperClass.Match.newMatch((EClass) t.get(POSITION_C), (EClass) t.get(POSITION_S1), (EClass) t.get(POSITION_S2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SameSuperClass.Match arrayToMatch(final Object[] match) {
      try {
          return SameSuperClass.Match.newMatch((EClass) match[POSITION_C], (EClass) match[POSITION_S1], (EClass) match[POSITION_S2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SameSuperClass.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SameSuperClass.Match.newMutableMatch((EClass) match[POSITION_C], (EClass) match[POSITION_S1], (EClass) match[POSITION_S2]);
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
    public static IQuerySpecification<SameSuperClass.Matcher> querySpecification() {
      return SameSuperClass.instance();
    }
  }
  
  private SameSuperClass() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SameSuperClass instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SameSuperClass.Matcher instantiate(final ViatraQueryEngine engine) {
    return SameSuperClass.Matcher.on(engine);
  }
  
  @Override
  public SameSuperClass.Matcher instantiate() {
    return SameSuperClass.Matcher.create();
  }
  
  @Override
  public SameSuperClass.Match newEmptyMatch() {
    return SameSuperClass.Match.newEmptyMatch();
  }
  
  @Override
  public SameSuperClass.Match newMatch(final Object... parameters) {
    return SameSuperClass.Match.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EClass) parameters[1], (org.eclipse.emf.ecore.EClass) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: queries.SameSuperClass (visibility: PUBLIC, simpleName: SameSuperClass, identifier: queries.SameSuperClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: queries.SameSuperClass (visibility: PUBLIC, simpleName: SameSuperClass, identifier: queries.SameSuperClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SameSuperClass INSTANCE = new SameSuperClass();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final SameSuperClass.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_c = new PParameter("c", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_s1 = new PParameter("s1", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_s2 = new PParameter("s2", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_c, parameter_s1, parameter_s2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.sameSuperClass";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("c","s1","s2");
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
          PVariable var_c = body.getOrCreateVariableByName("c");
          PVariable var_s1 = body.getOrCreateVariableByName("s1");
          PVariable var_s2 = body.getOrCreateVariableByName("s2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_s1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_s2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_c, parameter_c),
             new ExportedParameter(body, var_s1, parameter_s1),
             new ExportedParameter(body, var_s2, parameter_s2)
          ));
          // 	EClass.eSuperTypes(c, s1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          new Equality(body, var__virtual_0_, var_s1);
          // 	EClass.eSuperTypes(c, s2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          new Equality(body, var__virtual_1_, var_s2);
          // 	s1 == s2
          new Equality(body, var_s1, var_s2);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("c")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
