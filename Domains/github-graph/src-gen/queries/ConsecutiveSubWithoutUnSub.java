/**
 * Generated from platform:/resource/github-graph/queries/queries/github.vql
 */
package queries;

import github.Issue;
import github.User;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.CheckUserAction;
import queries.IsUnSubscribe;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(key={i, u}, severity="error", message="error")
 *         pattern consecutiveSubWithoutUnSub(i: Issue, u: User) {
 *         	find checkUserAction(i, u, a1, Action::SUBSCRIBED);
 *         	find checkUserAction(i, u, a2, Action::SUBSCRIBED);
 *         	a1 != a2;
 *         	neg find isUnSubscribe(i, u, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConsecutiveSubWithoutUnSub extends BaseGeneratedEMFQuerySpecification<ConsecutiveSubWithoutUnSub.Matcher> {
  /**
   * Pattern-specific match representation of the queries.consecutiveSubWithoutUnSub pattern,
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
    private Issue fI;
    
    private User fU;
    
    private static List<String> parameterNames = makeImmutableList("i", "u");
    
    private Match(final Issue pI, final User pU) {
      this.fI = pI;
      this.fU = pU;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "i": return this.fI;
          case "u": return this.fU;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fI;
          case 1: return this.fU;
          default: return null;
      }
    }
    
    public Issue getI() {
      return this.fI;
    }
    
    public User getU() {
      return this.fU;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("i".equals(parameterName) ) {
          this.fI = (Issue) newValue;
          return true;
      }
      if ("u".equals(parameterName) ) {
          this.fU = (User) newValue;
          return true;
      }
      return false;
    }
    
    public void setI(final Issue pI) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fI = pI;
    }
    
    public void setU(final User pU) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fU = pU;
    }
    
    @Override
    public String patternName() {
      return "queries.consecutiveSubWithoutUnSub";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConsecutiveSubWithoutUnSub.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fI, fU};
    }
    
    @Override
    public ConsecutiveSubWithoutUnSub.Match toImmutable() {
      return isMutable() ? newMatch(fI, fU) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"i\"=" + prettyPrintValue(fI) + ", ");
      result.append("\"u\"=" + prettyPrintValue(fU));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fI, fU);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ConsecutiveSubWithoutUnSub.Match)) {
          ConsecutiveSubWithoutUnSub.Match other = (ConsecutiveSubWithoutUnSub.Match) obj;
          return Objects.equals(fI, other.fI) && Objects.equals(fU, other.fU);
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
    public ConsecutiveSubWithoutUnSub specification() {
      return ConsecutiveSubWithoutUnSub.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConsecutiveSubWithoutUnSub.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ConsecutiveSubWithoutUnSub.Match newMutableMatch(final Issue pI, final User pU) {
      return new Mutable(pI, pU);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ConsecutiveSubWithoutUnSub.Match newMatch(final Issue pI, final User pU) {
      return new Immutable(pI, pU);
    }
    
    private static final class Mutable extends ConsecutiveSubWithoutUnSub.Match {
      Mutable(final Issue pI, final User pU) {
        super(pI, pU);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConsecutiveSubWithoutUnSub.Match {
      Immutable(final Issue pI, final User pU) {
        super(pI, pU);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.consecutiveSubWithoutUnSub pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(key={i, u}, severity="error", message="error")
   * pattern consecutiveSubWithoutUnSub(i: Issue, u: User) {
   * 	find checkUserAction(i, u, a1, Action::SUBSCRIBED);
   * 	find checkUserAction(i, u, a2, Action::SUBSCRIBED);
   * 	a1 != a2;
   * 	neg find isUnSubscribe(i, u, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConsecutiveSubWithoutUnSub
   * 
   */
  public static class Matcher extends BaseMatcher<ConsecutiveSubWithoutUnSub.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConsecutiveSubWithoutUnSub.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConsecutiveSubWithoutUnSub.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_I = 0;
    
    private static final int POSITION_U = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConsecutiveSubWithoutUnSub.Matcher.class);
    
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
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ConsecutiveSubWithoutUnSub.Match> getAllMatches(final Issue pI, final User pU) {
      return rawStreamAllMatches(new Object[]{pI, pU}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ConsecutiveSubWithoutUnSub.Match> streamAllMatches(final Issue pI, final User pU) {
      return rawStreamAllMatches(new Object[]{pI, pU});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConsecutiveSubWithoutUnSub.Match> getOneArbitraryMatch(final Issue pI, final User pU) {
      return rawGetOneArbitraryMatch(new Object[]{pI, pU});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Issue pI, final User pU) {
      return rawHasMatch(new Object[]{pI, pU});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Issue pI, final User pU) {
      return rawCountMatches(new Object[]{pI, pU});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Issue pI, final User pU, final Consumer<? super ConsecutiveSubWithoutUnSub.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pI, pU}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ConsecutiveSubWithoutUnSub.Match newMatch(final Issue pI, final User pU) {
      return ConsecutiveSubWithoutUnSub.Match.newMatch(pI, pU);
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Issue> rawStreamAllValuesOfi(final Object[] parameters) {
      return rawStreamAllValues(POSITION_I, parameters).map(Issue.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Issue> getAllValuesOfi() {
      return rawStreamAllValuesOfi(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Issue> streamAllValuesOfi() {
      return rawStreamAllValuesOfi(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Issue> streamAllValuesOfi(final ConsecutiveSubWithoutUnSub.Match partialMatch) {
      return rawStreamAllValuesOfi(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Issue> streamAllValuesOfi(final User pU) {
      return rawStreamAllValuesOfi(new Object[]{null, pU});
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Issue> getAllValuesOfi(final ConsecutiveSubWithoutUnSub.Match partialMatch) {
      return rawStreamAllValuesOfi(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Issue> getAllValuesOfi(final User pU) {
      return rawStreamAllValuesOfi(new Object[]{null, pU}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<User> rawStreamAllValuesOfu(final Object[] parameters) {
      return rawStreamAllValues(POSITION_U, parameters).map(User.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfu() {
      return rawStreamAllValuesOfu(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfu() {
      return rawStreamAllValuesOfu(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfu(final ConsecutiveSubWithoutUnSub.Match partialMatch) {
      return rawStreamAllValuesOfu(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<User> streamAllValuesOfu(final Issue pI) {
      return rawStreamAllValuesOfu(new Object[]{pI, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfu(final ConsecutiveSubWithoutUnSub.Match partialMatch) {
      return rawStreamAllValuesOfu(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfu(final Issue pI) {
      return rawStreamAllValuesOfu(new Object[]{pI, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ConsecutiveSubWithoutUnSub.Match tupleToMatch(final Tuple t) {
      try {
          return ConsecutiveSubWithoutUnSub.Match.newMatch((Issue) t.get(POSITION_I), (User) t.get(POSITION_U));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConsecutiveSubWithoutUnSub.Match arrayToMatch(final Object[] match) {
      try {
          return ConsecutiveSubWithoutUnSub.Match.newMatch((Issue) match[POSITION_I], (User) match[POSITION_U]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConsecutiveSubWithoutUnSub.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConsecutiveSubWithoutUnSub.Match.newMutableMatch((Issue) match[POSITION_I], (User) match[POSITION_U]);
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
    public static IQuerySpecification<ConsecutiveSubWithoutUnSub.Matcher> querySpecification() {
      return ConsecutiveSubWithoutUnSub.instance();
    }
  }
  
  private ConsecutiveSubWithoutUnSub() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConsecutiveSubWithoutUnSub instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConsecutiveSubWithoutUnSub.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConsecutiveSubWithoutUnSub.Matcher.on(engine);
  }
  
  @Override
  public ConsecutiveSubWithoutUnSub.Matcher instantiate() {
    return ConsecutiveSubWithoutUnSub.Matcher.create();
  }
  
  @Override
  public ConsecutiveSubWithoutUnSub.Match newEmptyMatch() {
    return ConsecutiveSubWithoutUnSub.Match.newEmptyMatch();
  }
  
  @Override
  public ConsecutiveSubWithoutUnSub.Match newMatch(final Object... parameters) {
    return ConsecutiveSubWithoutUnSub.Match.newMatch((github.Issue) parameters[0], (github.User) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ConsecutiveSubWithoutUnSub} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ConsecutiveSubWithoutUnSub#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConsecutiveSubWithoutUnSub INSTANCE = new ConsecutiveSubWithoutUnSub();
    
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
    private static final ConsecutiveSubWithoutUnSub.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_i = new PParameter("i", "github.Issue", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "Issue")), PParameterDirection.INOUT);
    
    private final PParameter parameter_u = new PParameter("u", "github.User", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "User")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_i, parameter_u);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.consecutiveSubWithoutUnSub";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("i","u");
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
          PVariable var_i = body.getOrCreateVariableByName("i");
          PVariable var_u = body.getOrCreateVariableByName("u");
          PVariable var_a1 = body.getOrCreateVariableByName("a1");
          PVariable var_a2 = body.getOrCreateVariableByName("a2");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_i), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "Issue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_u), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "User")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_i, parameter_i),
             new ExportedParameter(body, var_u, parameter_u)
          ));
          // 	find checkUserAction(i, u, a1, Action::SUBSCRIBED)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("sure.ghtorrent.github", "Action", "SUBSCRIBED").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_i, var_u, var_a1, var__virtual_0_), CheckUserAction.instance().getInternalQueryRepresentation());
          // 	find checkUserAction(i, u, a2, Action::SUBSCRIBED)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("sure.ghtorrent.github", "Action", "SUBSCRIBED").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_i, var_u, var_a2, var__virtual_1_), CheckUserAction.instance().getInternalQueryRepresentation());
          // 	a1 != a2
          new Inequality(body, var_a1, var_a2);
          // 	neg find isUnSubscribe(i, u, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_i, var_u, var___0_), IsUnSubscribe.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("i"), 
                              new ParameterReference("u")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
