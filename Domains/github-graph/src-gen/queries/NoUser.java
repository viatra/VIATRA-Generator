/**
 * Generated from platform:/resource/github-graph/queries/queries/github.vql
 */
package queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.EventUser;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(key={e}, severity="error", message="error")
 *         pattern noUser(e: IssueEvent) {
 *         	neg find eventUser(e, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NoUser extends BaseGeneratedEMFQuerySpecification<NoUser.Matcher> {
  /**
   * Pattern-specific match representation of the queries.noUser pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("e");
    
    private Match(final IssueEvent pE) {
      this.fE = pE;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "e": return this.fE;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fE;
          default: return null;
      }
    }
    
    public IssueEvent getE() {
      return this.fE;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("e".equals(parameterName) ) {
          this.fE = (IssueEvent) newValue;
          return true;
      }
      return false;
    }
    
    public void setE(final IssueEvent pE) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fE = pE;
    }
    
    @Override
    public String patternName() {
      return "queries.noUser";
    }
    
    @Override
    public List<String> parameterNames() {
      return NoUser.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fE};
    }
    
    @Override
    public NoUser.Match toImmutable() {
      return isMutable() ? newMatch(fE) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"e\"=" + prettyPrintValue(fE));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fE);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NoUser.Match)) {
          NoUser.Match other = (NoUser.Match) obj;
          return Objects.equals(fE, other.fE);
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
    public NoUser specification() {
      return NoUser.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NoUser.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NoUser.Match newMutableMatch(final IssueEvent pE) {
      return new Mutable(pE);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NoUser.Match newMatch(final IssueEvent pE) {
      return new Immutable(pE);
    }
    
    private static final class Mutable extends NoUser.Match {
      Mutable(final IssueEvent pE) {
        super(pE);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NoUser.Match {
      Immutable(final IssueEvent pE) {
        super(pE);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.noUser pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(key={e}, severity="error", message="error")
   * pattern noUser(e: IssueEvent) {
   * 	neg find eventUser(e, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NoUser
   * 
   */
  public static class Matcher extends BaseMatcher<NoUser.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NoUser.Matcher on(final ViatraQueryEngine engine) {
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
    public static NoUser.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_E = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NoUser.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NoUser.Match> getAllMatches(final IssueEvent pE) {
      return rawStreamAllMatches(new Object[]{pE}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NoUser.Match> streamAllMatches(final IssueEvent pE) {
      return rawStreamAllMatches(new Object[]{pE});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NoUser.Match> getOneArbitraryMatch(final IssueEvent pE) {
      return rawGetOneArbitraryMatch(new Object[]{pE});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final IssueEvent pE) {
      return rawHasMatch(new Object[]{pE});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final IssueEvent pE) {
      return rawCountMatches(new Object[]{pE});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final IssueEvent pE, final Consumer<? super NoUser.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pE}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pE the fixed value of pattern parameter e, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NoUser.Match newMatch(final IssueEvent pE) {
      return NoUser.Match.newMatch(pE);
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
    
    @Override
    protected NoUser.Match tupleToMatch(final Tuple t) {
      try {
          return NoUser.Match.newMatch((IssueEvent) t.get(POSITION_E));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NoUser.Match arrayToMatch(final Object[] match) {
      try {
          return NoUser.Match.newMatch((IssueEvent) match[POSITION_E]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NoUser.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NoUser.Match.newMutableMatch((IssueEvent) match[POSITION_E]);
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
    public static IQuerySpecification<NoUser.Matcher> querySpecification() {
      return NoUser.instance();
    }
  }
  
  private NoUser() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NoUser instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NoUser.Matcher instantiate(final ViatraQueryEngine engine) {
    return NoUser.Matcher.on(engine);
  }
  
  @Override
  public NoUser.Matcher instantiate() {
    return NoUser.Matcher.create();
  }
  
  @Override
  public NoUser.Match newEmptyMatch() {
    return NoUser.Match.newEmptyMatch();
  }
  
  @Override
  public NoUser.Match newMatch(final Object... parameters) {
    return NoUser.Match.newMatch((github.IssueEvent) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NoUser} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NoUser#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NoUser INSTANCE = new NoUser();
    
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
    private static final NoUser.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_e = new PParameter("e", "github.IssueEvent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("sure.ghtorrent.github", "IssueEvent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_e);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.noUser";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("e");
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
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_e), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("sure.ghtorrent.github", "IssueEvent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_e, parameter_e)
          ));
          // 	neg find eventUser(e, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_e, var___0_), EventUser.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("e")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
