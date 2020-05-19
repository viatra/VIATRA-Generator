/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/familyTreeConstraints.vql
 */
package queries;

import familytree.Member;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.MemberHasParent;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(message="twoMembersHaveNoParent", severity="error", key={m1, m2})
 *         pattern twoMembersHaveNoParent(m1:Member, m2:Member) = {
 *         	neg find memberHasParent(m1);
 *         	neg find memberHasParent(m2);
 *         	m1 != m2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TwoMembersHaveNoParent extends BaseGeneratedEMFQuerySpecification<TwoMembersHaveNoParent.Matcher> {
  /**
   * Pattern-specific match representation of the queries.twoMembersHaveNoParent pattern,
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
    private Member fM1;
    
    private Member fM2;
    
    private static List<String> parameterNames = makeImmutableList("m1", "m2");
    
    private Match(final Member pM1, final Member pM2) {
      this.fM1 = pM1;
      this.fM2 = pM2;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "m1": return this.fM1;
          case "m2": return this.fM2;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fM1;
          case 1: return this.fM2;
          default: return null;
      }
    }
    
    public Member getM1() {
      return this.fM1;
    }
    
    public Member getM2() {
      return this.fM2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("m1".equals(parameterName) ) {
          this.fM1 = (Member) newValue;
          return true;
      }
      if ("m2".equals(parameterName) ) {
          this.fM2 = (Member) newValue;
          return true;
      }
      return false;
    }
    
    public void setM1(final Member pM1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fM1 = pM1;
    }
    
    public void setM2(final Member pM2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fM2 = pM2;
    }
    
    @Override
    public String patternName() {
      return "queries.twoMembersHaveNoParent";
    }
    
    @Override
    public List<String> parameterNames() {
      return TwoMembersHaveNoParent.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fM1, fM2};
    }
    
    @Override
    public TwoMembersHaveNoParent.Match toImmutable() {
      return isMutable() ? newMatch(fM1, fM2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"m1\"=" + prettyPrintValue(fM1) + ", ");
      result.append("\"m2\"=" + prettyPrintValue(fM2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fM1, fM2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TwoMembersHaveNoParent.Match)) {
          TwoMembersHaveNoParent.Match other = (TwoMembersHaveNoParent.Match) obj;
          return Objects.equals(fM1, other.fM1) && Objects.equals(fM2, other.fM2);
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
    public TwoMembersHaveNoParent specification() {
      return TwoMembersHaveNoParent.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TwoMembersHaveNoParent.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TwoMembersHaveNoParent.Match newMutableMatch(final Member pM1, final Member pM2) {
      return new Mutable(pM1, pM2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TwoMembersHaveNoParent.Match newMatch(final Member pM1, final Member pM2) {
      return new Immutable(pM1, pM2);
    }
    
    private static final class Mutable extends TwoMembersHaveNoParent.Match {
      Mutable(final Member pM1, final Member pM2) {
        super(pM1, pM2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TwoMembersHaveNoParent.Match {
      Immutable(final Member pM1, final Member pM2) {
        super(pM1, pM2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.twoMembersHaveNoParent pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(message="twoMembersHaveNoParent", severity="error", key={m1, m2})
   * pattern twoMembersHaveNoParent(m1:Member, m2:Member) = {
   * 	neg find memberHasParent(m1);
   * 	neg find memberHasParent(m2);
   * 	m1 != m2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TwoMembersHaveNoParent
   * 
   */
  public static class Matcher extends BaseMatcher<TwoMembersHaveNoParent.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TwoMembersHaveNoParent.Matcher on(final ViatraQueryEngine engine) {
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
    public static TwoMembersHaveNoParent.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_M1 = 0;
    
    private static final int POSITION_M2 = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TwoMembersHaveNoParent.Matcher.class);
    
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
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TwoMembersHaveNoParent.Match> getAllMatches(final Member pM1, final Member pM2) {
      return rawStreamAllMatches(new Object[]{pM1, pM2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TwoMembersHaveNoParent.Match> streamAllMatches(final Member pM1, final Member pM2) {
      return rawStreamAllMatches(new Object[]{pM1, pM2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TwoMembersHaveNoParent.Match> getOneArbitraryMatch(final Member pM1, final Member pM2) {
      return rawGetOneArbitraryMatch(new Object[]{pM1, pM2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Member pM1, final Member pM2) {
      return rawHasMatch(new Object[]{pM1, pM2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Member pM1, final Member pM2) {
      return rawCountMatches(new Object[]{pM1, pM2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Member pM1, final Member pM2, final Consumer<? super TwoMembersHaveNoParent.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pM1, pM2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pM1 the fixed value of pattern parameter m1, or null if not bound.
     * @param pM2 the fixed value of pattern parameter m2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TwoMembersHaveNoParent.Match newMatch(final Member pM1, final Member pM2) {
      return TwoMembersHaveNoParent.Match.newMatch(pM1, pM2);
    }
    
    /**
     * Retrieve the set of values that occur in matches for m1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Member> rawStreamAllValuesOfm1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_M1, parameters).map(Member.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for m1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm1() {
      return rawStreamAllValuesOfm1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm1() {
      return rawStreamAllValuesOfm1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm1(final TwoMembersHaveNoParent.Match partialMatch) {
      return rawStreamAllValuesOfm1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm1(final Member pM2) {
      return rawStreamAllValuesOfm1(new Object[]{null, pM2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for m1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm1(final TwoMembersHaveNoParent.Match partialMatch) {
      return rawStreamAllValuesOfm1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm1(final Member pM2) {
      return rawStreamAllValuesOfm1(new Object[]{null, pM2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Member> rawStreamAllValuesOfm2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_M2, parameters).map(Member.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for m2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm2() {
      return rawStreamAllValuesOfm2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm2() {
      return rawStreamAllValuesOfm2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm2(final TwoMembersHaveNoParent.Match partialMatch) {
      return rawStreamAllValuesOfm2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Member> streamAllValuesOfm2(final Member pM1) {
      return rawStreamAllValuesOfm2(new Object[]{pM1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for m2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm2(final TwoMembersHaveNoParent.Match partialMatch) {
      return rawStreamAllValuesOfm2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for m2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Member> getAllValuesOfm2(final Member pM1) {
      return rawStreamAllValuesOfm2(new Object[]{pM1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected TwoMembersHaveNoParent.Match tupleToMatch(final Tuple t) {
      try {
          return TwoMembersHaveNoParent.Match.newMatch((Member) t.get(POSITION_M1), (Member) t.get(POSITION_M2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TwoMembersHaveNoParent.Match arrayToMatch(final Object[] match) {
      try {
          return TwoMembersHaveNoParent.Match.newMatch((Member) match[POSITION_M1], (Member) match[POSITION_M2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TwoMembersHaveNoParent.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TwoMembersHaveNoParent.Match.newMutableMatch((Member) match[POSITION_M1], (Member) match[POSITION_M2]);
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
    public static IQuerySpecification<TwoMembersHaveNoParent.Matcher> querySpecification() {
      return TwoMembersHaveNoParent.instance();
    }
  }
  
  private TwoMembersHaveNoParent() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TwoMembersHaveNoParent instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TwoMembersHaveNoParent.Matcher instantiate(final ViatraQueryEngine engine) {
    return TwoMembersHaveNoParent.Matcher.on(engine);
  }
  
  @Override
  public TwoMembersHaveNoParent.Matcher instantiate() {
    return TwoMembersHaveNoParent.Matcher.create();
  }
  
  @Override
  public TwoMembersHaveNoParent.Match newEmptyMatch() {
    return TwoMembersHaveNoParent.Match.newEmptyMatch();
  }
  
  @Override
  public TwoMembersHaveNoParent.Match newMatch(final Object... parameters) {
    return TwoMembersHaveNoParent.Match.newMatch((familytree.Member) parameters[0], (familytree.Member) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TwoMembersHaveNoParent} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TwoMembersHaveNoParent#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TwoMembersHaveNoParent INSTANCE = new TwoMembersHaveNoParent();
    
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
    private static final TwoMembersHaveNoParent.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_m1 = new PParameter("m1", "familytree.Member", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/familytree", "Member")), PParameterDirection.INOUT);
    
    private final PParameter parameter_m2 = new PParameter("m2", "familytree.Member", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/familytree", "Member")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_m1, parameter_m2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.twoMembersHaveNoParent";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("m1","m2");
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
          PVariable var_m1 = body.getOrCreateVariableByName("m1");
          PVariable var_m2 = body.getOrCreateVariableByName("m2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_m1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_m2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/familytree", "Member")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_m1, parameter_m1),
             new ExportedParameter(body, var_m2, parameter_m2)
          ));
          // 	neg find memberHasParent(m1)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_m1), MemberHasParent.instance().getInternalQueryRepresentation());
          // 	neg find memberHasParent(m2)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_m2), MemberHasParent.instance().getInternalQueryRepresentation());
          // 	m1 != m2
          new Inequality(body, var_m1, var_m2);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "twoMembersHaveNoParent");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("m1"), 
                              new ParameterReference("m2")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
