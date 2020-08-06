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
import modes3.queries.TurnoutOutput;
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
 *         pattern output(S1 : Segment, S2 : Segment) {
 *         	Segment.connectedTo(S1, S2);
 *         } or {
 *         	find turnoutOutput(S1, S2);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Output extends BaseGeneratedEMFQuerySpecification<Output.Matcher> {
  /**
   * Pattern-specific match representation of the modes3.queries.output pattern,
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
    private Segment fS1;
    
    private Segment fS2;
    
    private static List<String> parameterNames = makeImmutableList("S1", "S2");
    
    private Match(final Segment pS1, final Segment pS2) {
      this.fS1 = pS1;
      this.fS2 = pS2;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "S1": return this.fS1;
          case "S2": return this.fS2;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fS1;
          case 1: return this.fS2;
          default: return null;
      }
    }
    
    public Segment getS1() {
      return this.fS1;
    }
    
    public Segment getS2() {
      return this.fS2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("S1".equals(parameterName) ) {
          this.fS1 = (Segment) newValue;
          return true;
      }
      if ("S2".equals(parameterName) ) {
          this.fS2 = (Segment) newValue;
          return true;
      }
      return false;
    }
    
    public void setS1(final Segment pS1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS1 = pS1;
    }
    
    public void setS2(final Segment pS2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS2 = pS2;
    }
    
    @Override
    public String patternName() {
      return "modes3.queries.output";
    }
    
    @Override
    public List<String> parameterNames() {
      return Output.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fS1, fS2};
    }
    
    @Override
    public Output.Match toImmutable() {
      return isMutable() ? newMatch(fS1, fS2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"S1\"=" + prettyPrintValue(fS1) + ", ");
      result.append("\"S2\"=" + prettyPrintValue(fS2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fS1, fS2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Output.Match)) {
          Output.Match other = (Output.Match) obj;
          return Objects.equals(fS1, other.fS1) && Objects.equals(fS2, other.fS2);
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
    public Output specification() {
      return Output.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Output.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Output.Match newMutableMatch(final Segment pS1, final Segment pS2) {
      return new Mutable(pS1, pS2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Output.Match newMatch(final Segment pS1, final Segment pS2) {
      return new Immutable(pS1, pS2);
    }
    
    private static final class Mutable extends Output.Match {
      Mutable(final Segment pS1, final Segment pS2) {
        super(pS1, pS2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Output.Match {
      Immutable(final Segment pS1, final Segment pS2) {
        super(pS1, pS2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the modes3.queries.output pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern output(S1 : Segment, S2 : Segment) {
   * 	Segment.connectedTo(S1, S2);
   * } or {
   * 	find turnoutOutput(S1, S2);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Output
   * 
   */
  public static class Matcher extends BaseMatcher<Output.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Output.Matcher on(final ViatraQueryEngine engine) {
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
    public static Output.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_S1 = 0;
    
    private static final int POSITION_S2 = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Output.Matcher.class);
    
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
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Output.Match> getAllMatches(final Segment pS1, final Segment pS2) {
      return rawStreamAllMatches(new Object[]{pS1, pS2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Output.Match> streamAllMatches(final Segment pS1, final Segment pS2) {
      return rawStreamAllMatches(new Object[]{pS1, pS2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Output.Match> getOneArbitraryMatch(final Segment pS1, final Segment pS2) {
      return rawGetOneArbitraryMatch(new Object[]{pS1, pS2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Segment pS1, final Segment pS2) {
      return rawHasMatch(new Object[]{pS1, pS2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Segment pS1, final Segment pS2) {
      return rawCountMatches(new Object[]{pS1, pS2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Segment pS1, final Segment pS2, final Consumer<? super Output.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pS1, pS2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS1 the fixed value of pattern parameter S1, or null if not bound.
     * @param pS2 the fixed value of pattern parameter S2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Output.Match newMatch(final Segment pS1, final Segment pS2) {
      return Output.Match.newMatch(pS1, pS2);
    }
    
    /**
     * Retrieve the set of values that occur in matches for S1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Segment> rawStreamAllValuesOfS1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S1, parameters).map(Segment.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for S1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS1() {
      return rawStreamAllValuesOfS1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS1() {
      return rawStreamAllValuesOfS1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS1(final Output.Match partialMatch) {
      return rawStreamAllValuesOfS1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS1(final Segment pS2) {
      return rawStreamAllValuesOfS1(new Object[]{null, pS2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for S1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS1(final Output.Match partialMatch) {
      return rawStreamAllValuesOfS1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS1(final Segment pS2) {
      return rawStreamAllValuesOfS1(new Object[]{null, pS2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Segment> rawStreamAllValuesOfS2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S2, parameters).map(Segment.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for S2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS2() {
      return rawStreamAllValuesOfS2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS2() {
      return rawStreamAllValuesOfS2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS2(final Output.Match partialMatch) {
      return rawStreamAllValuesOfS2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOfS2(final Segment pS1) {
      return rawStreamAllValuesOfS2(new Object[]{pS1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for S2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS2(final Output.Match partialMatch) {
      return rawStreamAllValuesOfS2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for S2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOfS2(final Segment pS1) {
      return rawStreamAllValuesOfS2(new Object[]{pS1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Output.Match tupleToMatch(final Tuple t) {
      try {
          return Output.Match.newMatch((Segment) t.get(POSITION_S1), (Segment) t.get(POSITION_S2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Output.Match arrayToMatch(final Object[] match) {
      try {
          return Output.Match.newMatch((Segment) match[POSITION_S1], (Segment) match[POSITION_S2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Output.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Output.Match.newMutableMatch((Segment) match[POSITION_S1], (Segment) match[POSITION_S2]);
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
    public static IQuerySpecification<Output.Matcher> querySpecification() {
      return Output.instance();
    }
  }
  
  private Output() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Output instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Output.Matcher instantiate(final ViatraQueryEngine engine) {
    return Output.Matcher.on(engine);
  }
  
  @Override
  public Output.Matcher instantiate() {
    return Output.Matcher.create();
  }
  
  @Override
  public Output.Match newEmptyMatch() {
    return Output.Match.newEmptyMatch();
  }
  
  @Override
  public Output.Match newMatch(final Object... parameters) {
    return Output.Match.newMatch((modes3.Segment) parameters[0], (modes3.Segment) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Output} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Output#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Output INSTANCE = new Output();
    
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
    private static final Output.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_S1 = new PParameter("S1", "modes3.Segment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Segment")), PParameterDirection.INOUT);
    
    private final PParameter parameter_S2 = new PParameter("S2", "modes3.Segment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Segment")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_S1, parameter_S2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "modes3.queries.output";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("S1","S2");
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
          PVariable var_S1 = body.getOrCreateVariableByName("S1");
          PVariable var_S2 = body.getOrCreateVariableByName("S2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_S1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_S2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_S1, parameter_S1),
             new ExportedParameter(body, var_S2, parameter_S2)
          ));
          // 	Segment.connectedTo(S1, S2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_S1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_S1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment", "connectedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_0_, var_S2);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_S1 = body.getOrCreateVariableByName("S1");
          PVariable var_S2 = body.getOrCreateVariableByName("S2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_S1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_S2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_S1, parameter_S1),
             new ExportedParameter(body, var_S2, parameter_S2)
          ));
          // 	find turnoutOutput(S1, S2)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_S1, var_S2), TurnoutOutput.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
