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
import modes3.queries.Output;
import modes3.queries.Turnout;
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
 *         //{@literal @}Constraint(message = "noInputOfSegment", severity = "error", key = { S })
 *         //pattern noInputOfSegment(S : Segment) {
 *         //	neg find turnout(S);
 *         //	neg find output(_, S);
 *         //}
 *         
 *         {@literal @}Constraint(message = "tooManyInputsOfSegment", severity = "error", key = { S })
 *         pattern tooManyInputsOfSegment(S : Segment) {
 *         	neg find turnout(S);
 *         	find output(I1, S);
 *         	find output(I2, S);
 *         	find output(I3, S);
 *         	I1 != I2;
 *         	I1 != I3;
 *         	I2 != I3;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TooManyInputsOfSegment extends BaseGeneratedEMFQuerySpecification<TooManyInputsOfSegment.Matcher> {
  /**
   * Pattern-specific match representation of the modes3.queries.tooManyInputsOfSegment pattern,
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
    private Segment fS;
    
    private static List<String> parameterNames = makeImmutableList("S");
    
    private Match(final Segment pS) {
      this.fS = pS;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "S": return this.fS;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fS;
          default: return null;
      }
    }
    
    public Segment getS() {
      return this.fS;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("S".equals(parameterName) ) {
          this.fS = (Segment) newValue;
          return true;
      }
      return false;
    }
    
    public void setS(final Segment pS) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS = pS;
    }
    
    @Override
    public String patternName() {
      return "modes3.queries.tooManyInputsOfSegment";
    }
    
    @Override
    public List<String> parameterNames() {
      return TooManyInputsOfSegment.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fS};
    }
    
    @Override
    public TooManyInputsOfSegment.Match toImmutable() {
      return isMutable() ? newMatch(fS) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"S\"=" + prettyPrintValue(fS));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fS);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TooManyInputsOfSegment.Match)) {
          TooManyInputsOfSegment.Match other = (TooManyInputsOfSegment.Match) obj;
          return Objects.equals(fS, other.fS);
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
    public TooManyInputsOfSegment specification() {
      return TooManyInputsOfSegment.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TooManyInputsOfSegment.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TooManyInputsOfSegment.Match newMutableMatch(final Segment pS) {
      return new Mutable(pS);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TooManyInputsOfSegment.Match newMatch(final Segment pS) {
      return new Immutable(pS);
    }
    
    private static final class Mutable extends TooManyInputsOfSegment.Match {
      Mutable(final Segment pS) {
        super(pS);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TooManyInputsOfSegment.Match {
      Immutable(final Segment pS) {
        super(pS);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the modes3.queries.tooManyInputsOfSegment pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //{@literal @}Constraint(message = "noInputOfSegment", severity = "error", key = { S })
   * //pattern noInputOfSegment(S : Segment) {
   * //	neg find turnout(S);
   * //	neg find output(_, S);
   * //}
   * 
   * {@literal @}Constraint(message = "tooManyInputsOfSegment", severity = "error", key = { S })
   * pattern tooManyInputsOfSegment(S : Segment) {
   * 	neg find turnout(S);
   * 	find output(I1, S);
   * 	find output(I2, S);
   * 	find output(I3, S);
   * 	I1 != I2;
   * 	I1 != I3;
   * 	I2 != I3;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TooManyInputsOfSegment
   * 
   */
  public static class Matcher extends BaseMatcher<TooManyInputsOfSegment.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TooManyInputsOfSegment.Matcher on(final ViatraQueryEngine engine) {
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
    public static TooManyInputsOfSegment.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_S = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TooManyInputsOfSegment.Matcher.class);
    
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
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TooManyInputsOfSegment.Match> getAllMatches(final Segment pS) {
      return rawStreamAllMatches(new Object[]{pS}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TooManyInputsOfSegment.Match> streamAllMatches(final Segment pS) {
      return rawStreamAllMatches(new Object[]{pS});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TooManyInputsOfSegment.Match> getOneArbitraryMatch(final Segment pS) {
      return rawGetOneArbitraryMatch(new Object[]{pS});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Segment pS) {
      return rawHasMatch(new Object[]{pS});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Segment pS) {
      return rawCountMatches(new Object[]{pS});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Segment pS, final Consumer<? super TooManyInputsOfSegment.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pS}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter S, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TooManyInputsOfSegment.Match newMatch(final Segment pS) {
      return TooManyInputsOfSegment.Match.newMatch(pS);
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
    
    @Override
    protected TooManyInputsOfSegment.Match tupleToMatch(final Tuple t) {
      try {
          return TooManyInputsOfSegment.Match.newMatch((Segment) t.get(POSITION_S));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TooManyInputsOfSegment.Match arrayToMatch(final Object[] match) {
      try {
          return TooManyInputsOfSegment.Match.newMatch((Segment) match[POSITION_S]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TooManyInputsOfSegment.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TooManyInputsOfSegment.Match.newMutableMatch((Segment) match[POSITION_S]);
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
    public static IQuerySpecification<TooManyInputsOfSegment.Matcher> querySpecification() {
      return TooManyInputsOfSegment.instance();
    }
  }
  
  private TooManyInputsOfSegment() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TooManyInputsOfSegment instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TooManyInputsOfSegment.Matcher instantiate(final ViatraQueryEngine engine) {
    return TooManyInputsOfSegment.Matcher.on(engine);
  }
  
  @Override
  public TooManyInputsOfSegment.Matcher instantiate() {
    return TooManyInputsOfSegment.Matcher.create();
  }
  
  @Override
  public TooManyInputsOfSegment.Match newEmptyMatch() {
    return TooManyInputsOfSegment.Match.newEmptyMatch();
  }
  
  @Override
  public TooManyInputsOfSegment.Match newMatch(final Object... parameters) {
    return TooManyInputsOfSegment.Match.newMatch((modes3.Segment) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TooManyInputsOfSegment} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TooManyInputsOfSegment#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TooManyInputsOfSegment INSTANCE = new TooManyInputsOfSegment();
    
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
    private static final TooManyInputsOfSegment.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_S = new PParameter("S", "modes3.Segment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Segment")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_S);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "modes3.queries.tooManyInputsOfSegment";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("S");
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
          PVariable var_S = body.getOrCreateVariableByName("S");
          PVariable var_I1 = body.getOrCreateVariableByName("I1");
          PVariable var_I2 = body.getOrCreateVariableByName("I2");
          PVariable var_I3 = body.getOrCreateVariableByName("I3");
          new TypeConstraint(body, Tuples.flatTupleOf(var_S), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_S, parameter_S)
          ));
          // 	neg find turnout(S)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_S), Turnout.instance().getInternalQueryRepresentation());
          // 	find output(I1, S)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_I1, var_S), Output.instance().getInternalQueryRepresentation());
          // 	find output(I2, S)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_I2, var_S), Output.instance().getInternalQueryRepresentation());
          // 	find output(I3, S)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_I3, var_S), Output.instance().getInternalQueryRepresentation());
          // 	I1 != I2
          new Inequality(body, var_I1, var_I2);
          // 	I1 != I3
          new Inequality(body, var_I1, var_I3);
          // 	I2 != I3
          new Inequality(body, var_I2, var_I3);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "tooManyInputsOfSegment");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("S")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
