/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.FreeHddPercentage;
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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.matchers.aggregators.avg;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         // Free HDD
 *         
 *         pattern averageFreeHddMetric(Average : java Double) {
 *         	Average == avg find freeHddPercentage(_, #_);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AverageFreeHddMetric extends BaseGeneratedEMFQuerySpecification<AverageFreeHddMetric.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.averageFreeHddMetric pattern,
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
    private Double fAverage;
    
    private static List<String> parameterNames = makeImmutableList("Average");
    
    private Match(final Double pAverage) {
      this.fAverage = pAverage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Average".equals(parameterName)) return this.fAverage;
      return null;
    }
    
    public Double getAverage() {
      return this.fAverage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Average".equals(parameterName) ) {
          this.fAverage = (Double) newValue;
          return true;
      }
      return false;
    }
    
    public void setAverage(final Double pAverage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAverage = pAverage;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.averageFreeHddMetric";
    }
    
    @Override
    public List<String> parameterNames() {
      return AverageFreeHddMetric.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAverage};
    }
    
    @Override
    public AverageFreeHddMetric.Match toImmutable() {
      return isMutable() ? newMatch(fAverage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Average\"=" + prettyPrintValue(fAverage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAverage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AverageFreeHddMetric.Match)) {
          AverageFreeHddMetric.Match other = (AverageFreeHddMetric.Match) obj;
          return Objects.equals(fAverage, other.fAverage);
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
    public AverageFreeHddMetric specification() {
      return AverageFreeHddMetric.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AverageFreeHddMetric.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AverageFreeHddMetric.Match newMutableMatch(final Double pAverage) {
      return new Mutable(pAverage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AverageFreeHddMetric.Match newMatch(final Double pAverage) {
      return new Immutable(pAverage);
    }
    
    private static final class Mutable extends AverageFreeHddMetric.Match {
      Mutable(final Double pAverage) {
        super(pAverage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AverageFreeHddMetric.Match {
      Immutable(final Double pAverage) {
        super(pAverage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.averageFreeHddMetric pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Free HDD
   * 
   * pattern averageFreeHddMetric(Average : java Double) {
   * 	Average == avg find freeHddPercentage(_, #_);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AverageFreeHddMetric
   * 
   */
  public static class Matcher extends BaseMatcher<AverageFreeHddMetric.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AverageFreeHddMetric.Matcher on(final ViatraQueryEngine engine) {
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
    public static AverageFreeHddMetric.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_AVERAGE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AverageFreeHddMetric.Matcher.class);
    
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
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AverageFreeHddMetric.Match> getAllMatches(final Double pAverage) {
      return rawStreamAllMatches(new Object[]{pAverage}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AverageFreeHddMetric.Match> streamAllMatches(final Double pAverage) {
      return rawStreamAllMatches(new Object[]{pAverage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AverageFreeHddMetric.Match> getOneArbitraryMatch(final Double pAverage) {
      return rawGetOneArbitraryMatch(new Object[]{pAverage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Double pAverage) {
      return rawHasMatch(new Object[]{pAverage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Double pAverage) {
      return rawCountMatches(new Object[]{pAverage});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Double pAverage, final Consumer<? super AverageFreeHddMetric.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAverage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAverage the fixed value of pattern parameter Average, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AverageFreeHddMetric.Match newMatch(final Double pAverage) {
      return AverageFreeHddMetric.Match.newMatch(pAverage);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Average.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Double> rawStreamAllValuesOfAverage(final Object[] parameters) {
      return rawStreamAllValues(POSITION_AVERAGE, parameters).map(Double.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Average.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Double> getAllValuesOfAverage() {
      return rawStreamAllValuesOfAverage(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Average.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Double> streamAllValuesOfAverage() {
      return rawStreamAllValuesOfAverage(emptyArray());
    }
    
    @Override
    protected AverageFreeHddMetric.Match tupleToMatch(final Tuple t) {
      try {
          return AverageFreeHddMetric.Match.newMatch((Double) t.get(POSITION_AVERAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AverageFreeHddMetric.Match arrayToMatch(final Object[] match) {
      try {
          return AverageFreeHddMetric.Match.newMatch((Double) match[POSITION_AVERAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AverageFreeHddMetric.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AverageFreeHddMetric.Match.newMutableMatch((Double) match[POSITION_AVERAGE]);
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
    public static IQuerySpecification<AverageFreeHddMetric.Matcher> querySpecification() {
      return AverageFreeHddMetric.instance();
    }
  }
  
  private AverageFreeHddMetric() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AverageFreeHddMetric instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AverageFreeHddMetric.Matcher instantiate(final ViatraQueryEngine engine) {
    return AverageFreeHddMetric.Matcher.on(engine);
  }
  
  @Override
  public AverageFreeHddMetric.Matcher instantiate() {
    return AverageFreeHddMetric.Matcher.create();
  }
  
  @Override
  public AverageFreeHddMetric.Match newEmptyMatch() {
    return AverageFreeHddMetric.Match.newEmptyMatch();
  }
  
  @Override
  public AverageFreeHddMetric.Match newMatch(final Object... parameters) {
    return AverageFreeHddMetric.Match.newMatch((java.lang.Double) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric (visibility: PUBLIC, simpleName: AverageFreeHddMetric, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric (visibility: PUBLIC, simpleName: AverageFreeHddMetric, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AverageFreeHddMetric INSTANCE = new AverageFreeHddMetric();
    
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
    private static final AverageFreeHddMetric.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Average = new PParameter("Average", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Average);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.averageFreeHddMetric";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Average");
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
          PVariable var_Average = body.getOrCreateVariableByName("Average");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Average), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Average, parameter_Average)
          ));
          // 	Average == avg find freeHddPercentage(_, #_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new AggregatorConstraint(new avg().getAggregatorLogic(Double.class), body, Tuples.flatTupleOf(var___0_, var___1_), FreeHddPercentage.instance().getInternalQueryRepresentation(), var__virtual_0_, 1);
          new Equality(body, var_Average, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
