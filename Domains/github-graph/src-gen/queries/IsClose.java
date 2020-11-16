/**
 * Generated from platform:/resource/github-graph/queries/queries/github.vql
 */
package queries;

import github.Issue;
import github.IssueEvent;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         pattern isClose(i: Issue, e: IssueEvent) {
 *         	Issue.issueevent(i, e);
 *         	IssueEvent.action(e, a);
 *         	a == Action::CLOSED;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class IsClose extends BaseGeneratedEMFQuerySpecification<IsClose.Matcher> {
  /**
   * Pattern-specific match representation of the queries.isClose pattern,
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
    
    private IssueEvent fE;
    
    private static List<String> parameterNames = makeImmutableList("i", "e");
    
    private Match(final Issue pI, final IssueEvent pE) {
      this.fI = pI;
      this.fE = pE;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "i": return this.fI;
          case "e": return this.fE;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fI;
          case 1: return this.fE;
          default: return null;
      }
    }
    
    public Issue getI() {
      return this.fI;
    }
    
    public IssueEvent getE() {
      return this.fE;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("i".equals(parameterName) ) {
          this.fI = (Issue) newValue;
          return true;
      }
      if ("e".equals(parameterName) ) {
          this.fE = (IssueEvent) newValue;
          return true;
      }
      return false;
    }
    
    public void setI(final Issue pI) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fI = pI;
    }
    
    public void setE(final IssueEvent pE) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fE = pE;
    }
    
    @Override
    public String patternName() {
      return "queries.isClose";
    }
    
    @Override
    public List<String> parameterNames() {
      return IsClose.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fI, fE};
    }
    
    @Override
    public IsClose.Match toImmutable() {
      return isMutable() ? newMatch(fI, fE) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"i\"=" + prettyPrintValue(fI) + ", ");
      result.append("\"e\"=" + prettyPrintValue(fE));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fI, fE);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof IsClose.Match)) {
          IsClose.Match other = (IsClose.Match) obj;
          return Objects.equals(fI, other.fI) && Objects.equals(fE, other.fE);
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
    public IsClose specification() {
      return IsClose.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static IsClose.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static IsClose.Match newMutableMatch(final Issue pI, final IssueEvent pE) {
      return new Mutable(pI, pE);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static IsClose.Match newMatch(final Issue pI, final IssueEvent pE) {
      return new Immutable(pI, pE);
    }
    
    private static final class Mutable extends IsClose.Match {
      Mutable(final Issue pI, final IssueEvent pE) {
        super(pI, pE);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends IsClose.Match {
      Immutable(final Issue pI, final IssueEvent pE) {
        super(pI, pE);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.isClose pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern isClose(i: Issue, e: IssueEvent) {
   * 	Issue.issueevent(i, e);
   * 	IssueEvent.action(e, a);
   * 	a == Action::CLOSED;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see IsClose
   * 
   */
  public static class Matcher extends BaseMatcher<IsClose.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static IsClose.Matcher on(final ViatraQueryEngine engine) {
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
    public static IsClose.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_I = 0;
    
    private static final int POSITION_E = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(IsClose.Matcher.class);
    
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
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<IsClose.Match> getAllMatches(final Issue pI, final IssueEvent pE) {
      return rawStreamAllMatches(new Object[]{pI, pE}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<IsClose.Match> streamAllMatches(final Issue pI, final IssueEvent pE) {
      return rawStreamAllMatches(new Object[]{pI, pE});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<IsClose.Match> getOneArbitraryMatch(final Issue pI, final IssueEvent pE) {
      return rawGetOneArbitraryMatch(new Object[]{pI, pE});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Issue pI, final IssueEvent pE) {
      return rawHasMatch(new Object[]{pI, pE});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Issue pI, final IssueEvent pE) {
      return rawCountMatches(new Object[]{pI, pE});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Issue pI, final IssueEvent pE, final Consumer<? super IsClose.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pI, pE}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public IsClose.Match newMatch(final Issue pI, final IssueEvent pE) {
      return IsClose.Match.newMatch(pI, pE);
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
    public Stream<Issue> streamAllValuesOfi(final IsClose.Match partialMatch) {
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
    public Stream<Issue> streamAllValuesOfi(final IssueEvent pE) {
      return rawStreamAllValuesOfi(new Object[]{null, pE});
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Issue> getAllValuesOfi(final IsClose.Match partialMatch) {
      return rawStreamAllValuesOfi(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for i.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Issue> getAllValuesOfi(final IssueEvent pE) {
      return rawStreamAllValuesOfi(new Object[]{null, pE}).collect(Collectors.toSet());
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
    public Stream<IssueEvent> streamAllValuesOfe(final IsClose.Match partialMatch) {
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
    public Stream<IssueEvent> streamAllValuesOfe(final Issue pI) {
      return rawStreamAllValuesOfe(new Object[]{pI, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<IssueEvent> getAllValuesOfe(final IsClose.Match partialMatch) {
      return rawStreamAllValuesOfe(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for e.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<IssueEvent> getAllValuesOfe(final Issue pI) {
      return rawStreamAllValuesOfe(new Object[]{pI, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected IsClose.Match tupleToMatch(final Tuple t) {
      try {
          return IsClose.Match.newMatch((Issue) t.get(POSITION_I), (IssueEvent) t.get(POSITION_E));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IsClose.Match arrayToMatch(final Object[] match) {
      try {
          return IsClose.Match.newMatch((Issue) match[POSITION_I], (IssueEvent) match[POSITION_E]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IsClose.Match arrayToMatchMutable(final Object[] match) {
      try {
          return IsClose.Match.newMutableMatch((Issue) match[POSITION_I], (IssueEvent) match[POSITION_E]);
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
    public static IQuerySpecification<IsClose.Matcher> querySpecification() {
      return IsClose.instance();
    }
  }
  
  private IsClose() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static IsClose instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected IsClose.Matcher instantiate(final ViatraQueryEngine engine) {
    return IsClose.Matcher.on(engine);
  }
  
  @Override
  public IsClose.Matcher instantiate() {
    return IsClose.Matcher.create();
  }
  
  @Override
  public IsClose.Match newEmptyMatch() {
    return IsClose.Match.newEmptyMatch();
  }
  
  @Override
  public IsClose.Match newMatch(final Object... parameters) {
    return IsClose.Match.newMatch((github.Issue) parameters[0], (github.IssueEvent) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link IsClose} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link IsClose#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final IsClose INSTANCE = new IsClose();
    
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
    private static final IsClose.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_i = new PParameter("i", "github.Issue", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "Issue")), PParameterDirection.INOUT);
    
    private final PParameter parameter_e = new PParameter("e", "github.IssueEvent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "IssueEvent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_i, parameter_e);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.isClose";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("i","e");
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
          PVariable var_e = body.getOrCreateVariableByName("e");
          PVariable var_a = body.getOrCreateVariableByName("a");
          new TypeConstraint(body, Tuples.flatTupleOf(var_i), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "Issue")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "IssueEvent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_i, parameter_i),
             new ExportedParameter(body, var_e, parameter_e)
          ));
          // 	Issue.issueevent(i, e)
          new TypeConstraint(body, Tuples.flatTupleOf(var_i), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "Issue")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_i, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("sure.ghtorrent.github", "Issue", "issueevent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "IssueEvent")));
          new Equality(body, var__virtual_0_, var_e);
          // 	IssueEvent.action(e, a)
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "IssueEvent")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("sure.ghtorrent.github", "IssueEvent", "action")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("sure.ghtorrent.github", "Action")));
          new Equality(body, var__virtual_1_, var_a);
          // 	a == Action::CLOSED
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ConstantValue(body, var__virtual_2_, getEnumLiteral("sure.ghtorrent.github", "Action", "CLOSED").getInstance());
          new Equality(body, var_a, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
