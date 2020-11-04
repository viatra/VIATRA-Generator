/**
 * Generated from platform:/resource/ca.mcgill.rtgmrt.example.modes3/src/modes3/queries/Modes3Queries.vql
 */
package modes3.queries;

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
import modes3.Segment;
import modes3.Turnout;
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
 *         pattern turnoutOutput(T : Turnout, S : Segment) {
 *         	Turnout.straight(T, S);
 *         } or {
 *         	Turnout.divergent(T, S);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TurnoutOutput extends BaseGeneratedEMFQuerySpecification<TurnoutOutput.Matcher> {
  /**
   * Pattern-specific match representation of the modes3.queries.turnoutOutput pattern,
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
    private Turnout fT;
    
    private Segment fS;
    
    private static List<String> parameterNames = makeImmutableList("T", "S");
    
    private Match(final Turnout pT, final Segment pS) {
      this.fT = pT;
      this.fS = pS;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "T": return this.fT;
          case "S": return this.fS;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fT;
          case 1: return this.fS;
          default: return null;
      }
    }
    
    public Turnout getT() {
      return this.fT;
    }
    
    public Segment getS() {
      return this.fS;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("T".equals(parameterName) ) {
          this.fT = (Turnout) newValue;
          return true;
      }
      if ("S".equals(parameterName) ) {
          this.fS = (Segment) newValue;
          return true;
      }
      return false;
    }
    
    public void setT(final Turnout pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    public void setS(final Segment pS) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS = pS;
    }
    
    @Override
    public String patternName() {
      return "modes3.queries.turnoutOutput";
    }
    
    @Override
    public List<String> parameterNames() {
      return TurnoutOutput.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fT, fS};
    }
    
    @Override
    public TurnoutOutput.Match toImmutable() {
      return isMutable() ? newMatch(fT, fS) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
      result.append("\"S\"=" + prettyPrintValue(fS));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fT, fS);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TurnoutOutput.Match)) {
          TurnoutOutput.Match other = (TurnoutOutput.Match) obj;
          return Objects.equals(fT, other.fT) && Objects.equals(fS, other.fS);
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
    public TurnoutOutput specification() {
      return TurnoutOutput.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TurnoutOutput.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TurnoutOutput.Match newMutableMatch(final Turnout pT, final Segment pS) {
      return new Mutable(pT, pS);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TurnoutOutput.Match newMatch(final Turnout pT, final Segment pS) {
      return new Immutable(pT, pS);
    }
    
    private static final class Mutable extends TurnoutOutput.Match {
      Mutable(final Turnout pT, final Segment pS) {
        super(pT, pS);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TurnoutOutput.Match {
      Immutable(final Turnout pT, final Segment pS) {
        super(pT, pS);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the modes3.queries.turnoutOutput pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern turnoutOutput(T : Turnout, S : Segment) {
   * 	Turnout.straight(T, S);
   * } or {
   * 	Turnout.divergent(T, S);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TurnoutOutput
   * 
   */
  public static class Matcher extends BaseMatcher<TurnoutOutput.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TurnoutOutput.Matcher on(final ViatraQueryEngine engine) {
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
    public static TurnoutOutput.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_T = 0;
    
    private static final int POSITION_S = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TurnoutOutput.Matcher.class);
    
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
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TurnoutOutput.Match> getAllMatches(final Turnout pT, final Segment pS) {
      return rawStreamAllMatches(new Object[]{pT, pS}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TurnoutOutput.Match> streamAllMatches(final Turnout pT, final Segment pS) {
      return rawStreamAllMatches(new Object[]{pT, pS});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TurnoutOutput.Match> getOneArbitraryMatch(final Turnout pT, final Segment pS) {
      return rawGetOneArbitraryMatch(new Object[]{pT, pS});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Turnout pT, final Segment pS) {
      return rawHasMatch(new Object[]{pT, pS});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Turnout pT, final Segment pS) {
      return rawCountMatches(new Object[]{pT, pS});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Turnout pT, final Segment pS, final Consumer<? super TurnoutOutput.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT, pS}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TurnoutOutput.Match newMatch(final Turnout pT, final Segment pS) {
      return TurnoutOutput.Match.newMatch(pT, pS);
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Turnout> rawStreamAllValuesOfT(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(Turnout.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Turnout> getAllValuesOfT() {
      return rawStreamAllValuesOfT(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Turnout> streamAllValuesOfT() {
      return rawStreamAllValuesOfT(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Turnout> streamAllValuesOfT(final TurnoutOutput.Match partialMatch) {
      return rawStreamAllValuesOfT(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Turnout> streamAllValuesOfT(final Segment pS) {
      return rawStreamAllValuesOfT(new Object[]{null, pS});
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Turnout> getAllValuesOfT(final TurnoutOutput.Match partialMatch) {
      return rawStreamAllValuesOfT(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Turnout> getAllValuesOfT(final Segment pS) {
      return rawStreamAllValuesOfT(new Object[]{null, pS}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Segment> rawStreamAllValuesOfS(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S, parameters).map(Segment.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for S.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS() {
      return rawStreamAllValuesOfS(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS() {
      return rawStreamAllValuesOfS(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS(final TurnoutOutput.Match partialMatch) {
      return rawStreamAllValuesOfS(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS(final Turnout pT) {
      return rawStreamAllValuesOfS(new Object[]{pT, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for S.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS(final TurnoutOutput.Match partialMatch) {
      return rawStreamAllValuesOfS(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS(final Turnout pT) {
      return rawStreamAllValuesOfS(new Object[]{pT, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected TurnoutOutput.Match tupleToMatch(final Tuple t) {
      try {
          return TurnoutOutput.Match.newMatch((Turnout) t.get(POSITION_T), (Segment) t.get(POSITION_S));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TurnoutOutput.Match arrayToMatch(final Object[] match) {
      try {
          return TurnoutOutput.Match.newMatch((Turnout) match[POSITION_T], (Segment) match[POSITION_S]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TurnoutOutput.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TurnoutOutput.Match.newMutableMatch((Turnout) match[POSITION_T], (Segment) match[POSITION_S]);
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
    public static IQuerySpecification<TurnoutOutput.Matcher> querySpecification() {
      return TurnoutOutput.instance();
    }
  }
  
  private TurnoutOutput() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TurnoutOutput instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TurnoutOutput.Matcher instantiate(final ViatraQueryEngine engine) {
    return TurnoutOutput.Matcher.on(engine);
  }
  
  @Override
  public TurnoutOutput.Matcher instantiate() {
    return TurnoutOutput.Matcher.create();
  }
  
  @Override
  public TurnoutOutput.Match newEmptyMatch() {
    return TurnoutOutput.Match.newEmptyMatch();
  }
  
  @Override
  public TurnoutOutput.Match newMatch(final Object... parameters) {
    return TurnoutOutput.Match.newMatch((modes3.Turnout) parameters[0], (modes3.Segment) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TurnoutOutput} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TurnoutOutput#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TurnoutOutput INSTANCE = new TurnoutOutput();
    
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
    private static final TurnoutOutput.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_T = new PParameter("T", "modes3.Turnout", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")), PParameterDirection.INOUT);
    
    private final PParameter parameter_S = new PParameter("S", "modes3.Segment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Segment")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_T, parameter_S);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "modes3.queries.turnoutOutput";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T","S");
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
          PVariable var_T = body.getOrCreateVariableByName("T");
          PVariable var_S = body.getOrCreateVariableByName("S");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_T, parameter_T),
             new ExportedParameter(body, var_S, parameter_S)
          ));
          // 	Turnout.straight(T, S)
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout", "straight")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_0_, var_S);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_T = body.getOrCreateVariableByName("T");
          PVariable var_S = body.getOrCreateVariableByName("S");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_T, parameter_T),
             new ExportedParameter(body, var_S, parameter_S)
          ));
          // 	Turnout.divergent(T, S)
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout", "divergent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_0_, var_S);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
