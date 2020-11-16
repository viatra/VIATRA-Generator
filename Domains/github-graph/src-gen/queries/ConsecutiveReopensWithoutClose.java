/**
 * Generated from platform:/resource/github-graph/queries/queries/github.vql
 */
package queries;

import github.Issue;
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
import queries.CheckAction;
import queries.IsClose;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(key={i}, severity="error", message="error")
 *         pattern consecutiveReopensWithoutClose(i: Issue) {
 *         	find checkAction(i, a1, Action::REOPENED);
 *         	find checkAction(i, a2, Action::REOPENED);
 *         	a1 != a2;
 *         	neg find isClose(i, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ConsecutiveReopensWithoutClose extends BaseGeneratedEMFQuerySpecification<ConsecutiveReopensWithoutClose.Matcher> {
  /**
   * Pattern-specific match representation of the queries.consecutiveReopensWithoutClose pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("i");
    
    private Match(final Issue pI) {
      this.fI = pI;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "i": return this.fI;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fI;
          default: return null;
      }
    }
    
    public Issue getI() {
      return this.fI;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("i".equals(parameterName) ) {
          this.fI = (Issue) newValue;
          return true;
      }
      return false;
    }
    
    public void setI(final Issue pI) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fI = pI;
    }
    
    @Override
    public String patternName() {
      return "queries.consecutiveReopensWithoutClose";
    }
    
    @Override
    public List<String> parameterNames() {
      return ConsecutiveReopensWithoutClose.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fI};
    }
    
    @Override
    public ConsecutiveReopensWithoutClose.Match toImmutable() {
      return isMutable() ? newMatch(fI) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"i\"=" + prettyPrintValue(fI));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fI);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ConsecutiveReopensWithoutClose.Match)) {
          ConsecutiveReopensWithoutClose.Match other = (ConsecutiveReopensWithoutClose.Match) obj;
          return Objects.equals(fI, other.fI);
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
    public ConsecutiveReopensWithoutClose specification() {
      return ConsecutiveReopensWithoutClose.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ConsecutiveReopensWithoutClose.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ConsecutiveReopensWithoutClose.Match newMutableMatch(final Issue pI) {
      return new Mutable(pI);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ConsecutiveReopensWithoutClose.Match newMatch(final Issue pI) {
      return new Immutable(pI);
    }
    
    private static final class Mutable extends ConsecutiveReopensWithoutClose.Match {
      Mutable(final Issue pI) {
        super(pI);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ConsecutiveReopensWithoutClose.Match {
      Immutable(final Issue pI) {
        super(pI);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.consecutiveReopensWithoutClose pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(key={i}, severity="error", message="error")
   * pattern consecutiveReopensWithoutClose(i: Issue) {
   * 	find checkAction(i, a1, Action::REOPENED);
   * 	find checkAction(i, a2, Action::REOPENED);
   * 	a1 != a2;
   * 	neg find isClose(i, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ConsecutiveReopensWithoutClose
   * 
   */
  public static class Matcher extends BaseMatcher<ConsecutiveReopensWithoutClose.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ConsecutiveReopensWithoutClose.Matcher on(final ViatraQueryEngine engine) {
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
    public static ConsecutiveReopensWithoutClose.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_I = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ConsecutiveReopensWithoutClose.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ConsecutiveReopensWithoutClose.Match> getAllMatches(final Issue pI) {
      return rawStreamAllMatches(new Object[]{pI}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ConsecutiveReopensWithoutClose.Match> streamAllMatches(final Issue pI) {
      return rawStreamAllMatches(new Object[]{pI});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ConsecutiveReopensWithoutClose.Match> getOneArbitraryMatch(final Issue pI) {
      return rawGetOneArbitraryMatch(new Object[]{pI});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Issue pI) {
      return rawHasMatch(new Object[]{pI});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Issue pI) {
      return rawCountMatches(new Object[]{pI});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Issue pI, final Consumer<? super ConsecutiveReopensWithoutClose.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pI}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pI the fixed value of pattern parameter i, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ConsecutiveReopensWithoutClose.Match newMatch(final Issue pI) {
      return ConsecutiveReopensWithoutClose.Match.newMatch(pI);
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
    
    @Override
    protected ConsecutiveReopensWithoutClose.Match tupleToMatch(final Tuple t) {
      try {
          return ConsecutiveReopensWithoutClose.Match.newMatch((Issue) t.get(POSITION_I));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConsecutiveReopensWithoutClose.Match arrayToMatch(final Object[] match) {
      try {
          return ConsecutiveReopensWithoutClose.Match.newMatch((Issue) match[POSITION_I]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ConsecutiveReopensWithoutClose.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ConsecutiveReopensWithoutClose.Match.newMutableMatch((Issue) match[POSITION_I]);
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
    public static IQuerySpecification<ConsecutiveReopensWithoutClose.Matcher> querySpecification() {
      return ConsecutiveReopensWithoutClose.instance();
    }
  }
  
  private ConsecutiveReopensWithoutClose() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ConsecutiveReopensWithoutClose instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConsecutiveReopensWithoutClose.Matcher instantiate(final ViatraQueryEngine engine) {
    return ConsecutiveReopensWithoutClose.Matcher.on(engine);
  }
  
  @Override
  public ConsecutiveReopensWithoutClose.Matcher instantiate() {
    return ConsecutiveReopensWithoutClose.Matcher.create();
  }
  
  @Override
  public ConsecutiveReopensWithoutClose.Match newEmptyMatch() {
    return ConsecutiveReopensWithoutClose.Match.newEmptyMatch();
  }
  
  @Override
  public ConsecutiveReopensWithoutClose.Match newMatch(final Object... parameters) {
    return ConsecutiveReopensWithoutClose.Match.newMatch((github.Issue) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ConsecutiveReopensWithoutClose} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ConsecutiveReopensWithoutClose#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ConsecutiveReopensWithoutClose INSTANCE = new ConsecutiveReopensWithoutClose();
    
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
    private static final ConsecutiveReopensWithoutClose.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_i = new PParameter("i", "github.Issue", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "Issue")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_i);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.consecutiveReopensWithoutClose";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("i");
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
          PVariable var_a1 = body.getOrCreateVariableByName("a1");
          PVariable var_a2 = body.getOrCreateVariableByName("a2");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_i), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "Issue")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_i, parameter_i)
          ));
          // 	find checkAction(i, a1, Action::REOPENED)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("sure.ghtorrent.github", "Action", "REOPENED").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_i, var_a1, var__virtual_0_), CheckAction.instance().getInternalQueryRepresentation());
          // 	find checkAction(i, a2, Action::REOPENED)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("sure.ghtorrent.github", "Action", "REOPENED").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_i, var_a2, var__virtual_1_), CheckAction.instance().getInternalQueryRepresentation());
          // 	a1 != a2
          new Inequality(body, var_a1, var_a2);
          // 	neg find isClose(i, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_i, var___0_), IsClose.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("i")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
