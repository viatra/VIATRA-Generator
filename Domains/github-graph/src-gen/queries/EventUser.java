/**
 * Generated from platform:/resource/github-graph/queries/queries/github.vql
 */
package queries;

import github.IssueEvent;
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
 *         pattern eventUser(e: IssueEvent, u:User){
 *         	IssueEvent.user(e, u);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EventUser extends BaseGeneratedEMFQuerySpecification<EventUser.Matcher> {
  /**
   * Pattern-specific match representation of the queries.eventUser pattern,
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
    private IssueEvent fE;
    
    private User fU;
    
    private static List<String> parameterNames = makeImmutableList("e", "u");
    
    private Match(final IssueEvent pE, final User pU) {
      this.fE = pE;
      this.fU = pU;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "e": return this.fE;
          case "u": return this.fU;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fE;
          case 1: return this.fU;
          default: return null;
      }
    }
    
    public IssueEvent getE() {
      return this.fE;
    }
    
    public User getU() {
      return this.fU;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("e".equals(parameterName) ) {
          this.fE = (IssueEvent) newValue;
          return true;
      }
      if ("u".equals(parameterName) ) {
          this.fU = (User) newValue;
          return true;
      }
      return false;
    }
    
    public void setE(final IssueEvent pE) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fE = pE;
    }
    
    public void setU(final User pU) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fU = pU;
    }
    
    @Override
    public String patternName() {
      return "queries.eventUser";
    }
    
    @Override
    public List<String> parameterNames() {
      return EventUser.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fE, fU};
    }
    
    @Override
    public EventUser.Match toImmutable() {
      return isMutable() ? newMatch(fE, fU) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"e\"=" + prettyPrintValue(fE) + ", ");
      result.append("\"u\"=" + prettyPrintValue(fU));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fE, fU);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EventUser.Match)) {
          EventUser.Match other = (EventUser.Match) obj;
          return Objects.equals(fE, other.fE) && Objects.equals(fU, other.fU);
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
    public EventUser specification() {
      return EventUser.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EventUser.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EventUser.Match newMutableMatch(final IssueEvent pE, final User pU) {
      return new Mutable(pE, pU);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EventUser.Match newMatch(final IssueEvent pE, final User pU) {
      return new Immutable(pE, pU);
    }
    
    private static final class Mutable extends EventUser.Match {
      Mutable(final IssueEvent pE, final User pU) {
        super(pE, pU);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EventUser.Match {
      Immutable(final IssueEvent pE, final User pU) {
        super(pE, pU);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.eventUser pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern eventUser(e: IssueEvent, u:User){
   * 	IssueEvent.user(e, u);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EventUser
   * 
   */
  public static class Matcher extends BaseMatcher<EventUser.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EventUser.Matcher on(final ViatraQueryEngine engine) {
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
    public static EventUser.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_E = 0;
    
    private static final int POSITION_U = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EventUser.Matcher.class);
    
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
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EventUser.Match> getAllMatches(final IssueEvent pE, final User pU) {
      return rawStreamAllMatches(new Object[]{pE, pU}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EventUser.Match> streamAllMatches(final IssueEvent pE, final User pU) {
      return rawStreamAllMatches(new Object[]{pE, pU});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EventUser.Match> getOneArbitraryMatch(final IssueEvent pE, final User pU) {
      return rawGetOneArbitraryMatch(new Object[]{pE, pU});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final IssueEvent pE, final User pU) {
      return rawHasMatch(new Object[]{pE, pU});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final IssueEvent pE, final User pU) {
      return rawCountMatches(new Object[]{pE, pU});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final IssueEvent pE, final User pU, final Consumer<? super EventUser.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pE, pU}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param pU the fixed value of pattern parameter u, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EventUser.Match newMatch(final IssueEvent pE, final User pU) {
      return EventUser.Match.newMatch(pE, pU);
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<IssueEvent> rawStreamAllValuesOfe(final Object[] parameters) {
      return rawStreamAllValues(POSITION_E, parameters).map(IssueEvent.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<IssueEvent> getAllValuesOfe() {
      return rawStreamAllValuesOfe(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<IssueEvent> streamAllValuesOfe() {
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
    public Stream<IssueEvent> streamAllValuesOfe(final EventUser.Match partialMatch) {
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
    public Stream<IssueEvent> streamAllValuesOfe(final User pU) {
      return rawStreamAllValuesOfe(new Object[]{null, pU});
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<IssueEvent> getAllValuesOfe(final EventUser.Match partialMatch) {
      return rawStreamAllValuesOfe(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<IssueEvent> getAllValuesOfe(final User pU) {
      return rawStreamAllValuesOfe(new Object[]{null, pU}).collect(Collectors.toSet());
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
    public Stream<User> streamAllValuesOfu(final EventUser.Match partialMatch) {
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
    public Stream<User> streamAllValuesOfu(final IssueEvent pE) {
      return rawStreamAllValuesOfu(new Object[]{pE, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfu(final EventUser.Match partialMatch) {
      return rawStreamAllValuesOfu(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for u.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<User> getAllValuesOfu(final IssueEvent pE) {
      return rawStreamAllValuesOfu(new Object[]{pE, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EventUser.Match tupleToMatch(final Tuple t) {
      try {
          return EventUser.Match.newMatch((IssueEvent) t.get(POSITION_E), (User) t.get(POSITION_U));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EventUser.Match arrayToMatch(final Object[] match) {
      try {
          return EventUser.Match.newMatch((IssueEvent) match[POSITION_E], (User) match[POSITION_U]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EventUser.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EventUser.Match.newMutableMatch((IssueEvent) match[POSITION_E], (User) match[POSITION_U]);
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
    public static IQuerySpecification<EventUser.Matcher> querySpecification() {
      return EventUser.instance();
    }
  }
  
  private EventUser() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EventUser instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EventUser.Matcher instantiate(final ViatraQueryEngine engine) {
    return EventUser.Matcher.on(engine);
  }
  
  @Override
  public EventUser.Matcher instantiate() {
    return EventUser.Matcher.create();
  }
  
  @Override
  public EventUser.Match newEmptyMatch() {
    return EventUser.Match.newEmptyMatch();
  }
  
  @Override
  public EventUser.Match newMatch(final Object... parameters) {
    return EventUser.Match.newMatch((github.IssueEvent) parameters[0], (github.User) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EventUser} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EventUser#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EventUser INSTANCE = new EventUser();
    
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
    private static final EventUser.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_e = new PParameter("e", "github.IssueEvent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "IssueEvent")), PParameterDirection.INOUT);
    
    private final PParameter parameter_u = new PParameter("u", "github.User", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "User")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_e, parameter_u);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.eventUser";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e","u");
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
          PVariable var_u = body.getOrCreateVariableByName("u");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "IssueEvent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_u), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "User")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_e, parameter_e),
             new ExportedParameter(body, var_u, parameter_u)
          ));
          // 	IssueEvent.user(e, u)
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "IssueEvent")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("sure.ghtorrent.github", "IssueEvent", "user")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "User")));
          new Equality(body, var__virtual_0_, var_u);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
