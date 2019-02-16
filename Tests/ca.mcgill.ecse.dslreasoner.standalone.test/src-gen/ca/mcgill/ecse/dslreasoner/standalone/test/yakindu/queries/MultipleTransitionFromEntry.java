/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Entry;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition;
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
 *         {@literal @}Constraint(severity="error", message="error", key = {e})
 *         pattern multipleTransitionFromEntry(e : Entry, t1 : Transition, t2: Transition) {
 *         	Entry.outgoingTransitions(e,t1);
 *         	Entry.outgoingTransitions(e,t2);
 *         	t1!=t2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MultipleTransitionFromEntry extends BaseGeneratedEMFQuerySpecification<MultipleTransitionFromEntry.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.multipleTransitionFromEntry pattern,
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
    private Entry fE;
    
    private Transition fT1;
    
    private Transition fT2;
    
    private static List<String> parameterNames = makeImmutableList("e", "t1", "t2");
    
    private Match(final Entry pE, final Transition pT1, final Transition pT2) {
      this.fE = pE;
      this.fT1 = pT1;
      this.fT2 = pT2;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("e".equals(parameterName)) return this.fE;
      if ("t1".equals(parameterName)) return this.fT1;
      if ("t2".equals(parameterName)) return this.fT2;
      return null;
    }
    
    public Entry getE() {
      return this.fE;
    }
    
    public Transition getT1() {
      return this.fT1;
    }
    
    public Transition getT2() {
      return this.fT2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("e".equals(parameterName) ) {
          this.fE = (Entry) newValue;
          return true;
      }
      if ("t1".equals(parameterName) ) {
          this.fT1 = (Transition) newValue;
          return true;
      }
      if ("t2".equals(parameterName) ) {
          this.fT2 = (Transition) newValue;
          return true;
      }
      return false;
    }
    
    public void setE(final Entry pE) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fE = pE;
    }
    
    public void setT1(final Transition pT1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT1 = pT1;
    }
    
    public void setT2(final Transition pT2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT2 = pT2;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.multipleTransitionFromEntry";
    }
    
    @Override
    public List<String> parameterNames() {
      return MultipleTransitionFromEntry.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fE, fT1, fT2};
    }
    
    @Override
    public MultipleTransitionFromEntry.Match toImmutable() {
      return isMutable() ? newMatch(fE, fT1, fT2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"e\"=" + prettyPrintValue(fE) + ", ");
      result.append("\"t1\"=" + prettyPrintValue(fT1) + ", ");
      result.append("\"t2\"=" + prettyPrintValue(fT2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fE, fT1, fT2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MultipleTransitionFromEntry.Match)) {
          MultipleTransitionFromEntry.Match other = (MultipleTransitionFromEntry.Match) obj;
          return Objects.equals(fE, other.fE) && Objects.equals(fT1, other.fT1) && Objects.equals(fT2, other.fT2);
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
    public MultipleTransitionFromEntry specification() {
      return MultipleTransitionFromEntry.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MultipleTransitionFromEntry.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MultipleTransitionFromEntry.Match newMutableMatch(final Entry pE, final Transition pT1, final Transition pT2) {
      return new Mutable(pE, pT1, pT2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MultipleTransitionFromEntry.Match newMatch(final Entry pE, final Transition pT1, final Transition pT2) {
      return new Immutable(pE, pT1, pT2);
    }
    
    private static final class Mutable extends MultipleTransitionFromEntry.Match {
      Mutable(final Entry pE, final Transition pT1, final Transition pT2) {
        super(pE, pT1, pT2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MultipleTransitionFromEntry.Match {
      Immutable(final Entry pE, final Transition pT1, final Transition pT2) {
        super(pE, pT1, pT2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.multipleTransitionFromEntry pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity="error", message="error", key = {e})
   * pattern multipleTransitionFromEntry(e : Entry, t1 : Transition, t2: Transition) {
   * 	Entry.outgoingTransitions(e,t1);
   * 	Entry.outgoingTransitions(e,t2);
   * 	t1!=t2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MultipleTransitionFromEntry
   * 
   */
  public static class Matcher extends BaseMatcher<MultipleTransitionFromEntry.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MultipleTransitionFromEntry.Matcher on(final ViatraQueryEngine engine) {
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
    public static MultipleTransitionFromEntry.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_E = 0;
    
    private final static int POSITION_T1 = 1;
    
    private final static int POSITION_T2 = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MultipleTransitionFromEntry.Matcher.class);
    
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
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MultipleTransitionFromEntry.Match> getAllMatches(final Entry pE, final Transition pT1, final Transition pT2) {
      return rawStreamAllMatches(new Object[]{pE, pT1, pT2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MultipleTransitionFromEntry.Match> streamAllMatches(final Entry pE, final Transition pT1, final Transition pT2) {
      return rawStreamAllMatches(new Object[]{pE, pT1, pT2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MultipleTransitionFromEntry.Match> getOneArbitraryMatch(final Entry pE, final Transition pT1, final Transition pT2) {
      return rawGetOneArbitraryMatch(new Object[]{pE, pT1, pT2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Entry pE, final Transition pT1, final Transition pT2) {
      return rawHasMatch(new Object[]{pE, pT1, pT2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Entry pE, final Transition pT1, final Transition pT2) {
      return rawCountMatches(new Object[]{pE, pT1, pT2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Entry pE, final Transition pT1, final Transition pT2, final Consumer<? super MultipleTransitionFromEntry.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pE, pT1, pT2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pT1 the fixed value of pattern parameter t1, or null if not bound.
     * @param pT2 the fixed value of pattern parameter t2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MultipleTransitionFromEntry.Match newMatch(final Entry pE, final Transition pT1, final Transition pT2) {
      return MultipleTransitionFromEntry.Match.newMatch(pE, pT1, pT2);
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Entry> rawStreamAllValuesOfe(final Object[] parameters) {
      return rawStreamAllValues(POSITION_E, parameters).map(Entry.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entry> getAllValuesOfe() {
      return rawStreamAllValuesOfe(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Entry> streamAllValuesOfe() {
      return rawStreamAllValuesOfe(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entry> streamAllValuesOfe(final MultipleTransitionFromEntry.Match partialMatch) {
      return rawStreamAllValuesOfe(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Entry> streamAllValuesOfe(final Transition pT1, final Transition pT2) {
      return rawStreamAllValuesOfe(new Object[]{null, pT1, pT2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entry> getAllValuesOfe(final MultipleTransitionFromEntry.Match partialMatch) {
      return rawStreamAllValuesOfe(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Entry> getAllValuesOfe(final Transition pT1, final Transition pT2) {
      return rawStreamAllValuesOfe(new Object[]{null, pT1, pT2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Transition> rawStreamAllValuesOft1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T1, parameters).map(Transition.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft1() {
      return rawStreamAllValuesOft1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft1() {
      return rawStreamAllValuesOft1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft1(final MultipleTransitionFromEntry.Match partialMatch) {
      return rawStreamAllValuesOft1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft1(final Entry pE, final Transition pT2) {
      return rawStreamAllValuesOft1(new Object[]{pE, null, pT2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft1(final MultipleTransitionFromEntry.Match partialMatch) {
      return rawStreamAllValuesOft1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft1(final Entry pE, final Transition pT2) {
      return rawStreamAllValuesOft1(new Object[]{pE, null, pT2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Transition> rawStreamAllValuesOft2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T2, parameters).map(Transition.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft2() {
      return rawStreamAllValuesOft2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft2() {
      return rawStreamAllValuesOft2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft2(final MultipleTransitionFromEntry.Match partialMatch) {
      return rawStreamAllValuesOft2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft2(final Entry pE, final Transition pT1) {
      return rawStreamAllValuesOft2(new Object[]{pE, pT1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft2(final MultipleTransitionFromEntry.Match partialMatch) {
      return rawStreamAllValuesOft2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft2(final Entry pE, final Transition pT1) {
      return rawStreamAllValuesOft2(new Object[]{pE, pT1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected MultipleTransitionFromEntry.Match tupleToMatch(final Tuple t) {
      try {
          return MultipleTransitionFromEntry.Match.newMatch((Entry) t.get(POSITION_E), (Transition) t.get(POSITION_T1), (Transition) t.get(POSITION_T2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MultipleTransitionFromEntry.Match arrayToMatch(final Object[] match) {
      try {
          return MultipleTransitionFromEntry.Match.newMatch((Entry) match[POSITION_E], (Transition) match[POSITION_T1], (Transition) match[POSITION_T2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MultipleTransitionFromEntry.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MultipleTransitionFromEntry.Match.newMutableMatch((Entry) match[POSITION_E], (Transition) match[POSITION_T1], (Transition) match[POSITION_T2]);
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
    public static IQuerySpecification<MultipleTransitionFromEntry.Matcher> querySpecification() {
      return MultipleTransitionFromEntry.instance();
    }
  }
  
  private MultipleTransitionFromEntry() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MultipleTransitionFromEntry instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MultipleTransitionFromEntry.Matcher instantiate(final ViatraQueryEngine engine) {
    return MultipleTransitionFromEntry.Matcher.on(engine);
  }
  
  @Override
  public MultipleTransitionFromEntry.Matcher instantiate() {
    return MultipleTransitionFromEntry.Matcher.create();
  }
  
  @Override
  public MultipleTransitionFromEntry.Match newEmptyMatch() {
    return MultipleTransitionFromEntry.Match.newEmptyMatch();
  }
  
  @Override
  public MultipleTransitionFromEntry.Match newMatch(final Object... parameters) {
    return MultipleTransitionFromEntry.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Entry) parameters[0], (ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition) parameters[1], (ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.MultipleTransitionFromEntry (visibility: PUBLIC, simpleName: MultipleTransitionFromEntry, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.MultipleTransitionFromEntry, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.MultipleTransitionFromEntry (visibility: PUBLIC, simpleName: MultipleTransitionFromEntry, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.MultipleTransitionFromEntry, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MultipleTransitionFromEntry INSTANCE = new MultipleTransitionFromEntry();
    
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
    private final static MultipleTransitionFromEntry.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_e = new PParameter("e", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Entry", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Entry")), PParameterDirection.INOUT);
    
    private final PParameter parameter_t1 = new PParameter("t1", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Transition")), PParameterDirection.INOUT);
    
    private final PParameter parameter_t2 = new PParameter("t2", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Transition")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_e, parameter_t1, parameter_t2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.multipleTransitionFromEntry";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e","t1","t2");
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
          PVariable var_e = body.getOrCreateVariableByName("e");
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Entry")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_e, parameter_e),
             new ExportedParameter(body, var_t1, parameter_t1),
             new ExportedParameter(body, var_t2, parameter_t2)
          ));
          // 	Entry.outgoingTransitions(e,t1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Entry")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Vertex", "outgoingTransitions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          new Equality(body, var__virtual_0_, var_t1);
          // 	Entry.outgoingTransitions(e,t2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Entry")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Vertex", "outgoingTransitions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          new Equality(body, var__virtual_1_, var_t2);
          // 	t1!=t2
          new Inequality(body, var_t1, var_t2);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("e")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
