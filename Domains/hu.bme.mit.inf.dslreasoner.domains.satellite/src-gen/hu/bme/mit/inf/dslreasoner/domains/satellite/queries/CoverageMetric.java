/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionCoverage;
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
import org.eclipse.viatra.query.runtime.matchers.aggregators.sum;
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
 *         //
 *         // Metrics
 *         //
 *         
 *         // Coverage
 *         
 *         pattern coverageMetric(Coverage : java Double) {
 *         	Coverage == sum find missionCoverage(_, #_);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CoverageMetric extends BaseGeneratedEMFQuerySpecification<CoverageMetric.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.coverageMetric pattern,
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
    private Double fCoverage;
    
    private static List<String> parameterNames = makeImmutableList("Coverage");
    
    private Match(final Double pCoverage) {
      this.fCoverage = pCoverage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Coverage".equals(parameterName)) return this.fCoverage;
      return null;
    }
    
    public Double getCoverage() {
      return this.fCoverage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Coverage".equals(parameterName) ) {
          this.fCoverage = (Double) newValue;
          return true;
      }
      return false;
    }
    
    public void setCoverage(final Double pCoverage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCoverage = pCoverage;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.coverageMetric";
    }
    
    @Override
    public List<String> parameterNames() {
      return CoverageMetric.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fCoverage};
    }
    
    @Override
    public CoverageMetric.Match toImmutable() {
      return isMutable() ? newMatch(fCoverage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Coverage\"=" + prettyPrintValue(fCoverage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fCoverage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CoverageMetric.Match)) {
          CoverageMetric.Match other = (CoverageMetric.Match) obj;
          return Objects.equals(fCoverage, other.fCoverage);
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
    public CoverageMetric specification() {
      return CoverageMetric.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CoverageMetric.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CoverageMetric.Match newMutableMatch(final Double pCoverage) {
      return new Mutable(pCoverage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CoverageMetric.Match newMatch(final Double pCoverage) {
      return new Immutable(pCoverage);
    }
    
    private static final class Mutable extends CoverageMetric.Match {
      Mutable(final Double pCoverage) {
        super(pCoverage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CoverageMetric.Match {
      Immutable(final Double pCoverage) {
        super(pCoverage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.coverageMetric pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //
   * // Metrics
   * //
   * 
   * // Coverage
   * 
   * pattern coverageMetric(Coverage : java Double) {
   * 	Coverage == sum find missionCoverage(_, #_);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CoverageMetric
   * 
   */
  public static class Matcher extends BaseMatcher<CoverageMetric.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CoverageMetric.Matcher on(final ViatraQueryEngine engine) {
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
    public static CoverageMetric.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_COVERAGE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CoverageMetric.Matcher.class);
    
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
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CoverageMetric.Match> getAllMatches(final Double pCoverage) {
      return rawStreamAllMatches(new Object[]{pCoverage}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CoverageMetric.Match> streamAllMatches(final Double pCoverage) {
      return rawStreamAllMatches(new Object[]{pCoverage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CoverageMetric.Match> getOneArbitraryMatch(final Double pCoverage) {
      return rawGetOneArbitraryMatch(new Object[]{pCoverage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Double pCoverage) {
      return rawHasMatch(new Object[]{pCoverage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Double pCoverage) {
      return rawCountMatches(new Object[]{pCoverage});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Double pCoverage, final Consumer<? super CoverageMetric.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCoverage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCoverage the fixed value of pattern parameter Coverage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CoverageMetric.Match newMatch(final Double pCoverage) {
      return CoverageMetric.Match.newMatch(pCoverage);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Coverage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Double> rawStreamAllValuesOfCoverage(final Object[] parameters) {
      return rawStreamAllValues(POSITION_COVERAGE, parameters).map(Double.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Coverage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Double> getAllValuesOfCoverage() {
      return rawStreamAllValuesOfCoverage(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Coverage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Double> streamAllValuesOfCoverage() {
      return rawStreamAllValuesOfCoverage(emptyArray());
    }
    
    @Override
    protected CoverageMetric.Match tupleToMatch(final Tuple t) {
      try {
          return CoverageMetric.Match.newMatch((Double) t.get(POSITION_COVERAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CoverageMetric.Match arrayToMatch(final Object[] match) {
      try {
          return CoverageMetric.Match.newMatch((Double) match[POSITION_COVERAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CoverageMetric.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CoverageMetric.Match.newMutableMatch((Double) match[POSITION_COVERAGE]);
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
    public static IQuerySpecification<CoverageMetric.Matcher> querySpecification() {
      return CoverageMetric.instance();
    }
  }
  
  private CoverageMetric() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CoverageMetric instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CoverageMetric.Matcher instantiate(final ViatraQueryEngine engine) {
    return CoverageMetric.Matcher.on(engine);
  }
  
  @Override
  public CoverageMetric.Matcher instantiate() {
    return CoverageMetric.Matcher.create();
  }
  
  @Override
  public CoverageMetric.Match newEmptyMatch() {
    return CoverageMetric.Match.newEmptyMatch();
  }
  
  @Override
  public CoverageMetric.Match newMatch(final Object... parameters) {
    return CoverageMetric.Match.newMatch((java.lang.Double) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CoverageMetric (visibility: PUBLIC, simpleName: CoverageMetric, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CoverageMetric, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CoverageMetric (visibility: PUBLIC, simpleName: CoverageMetric, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CoverageMetric, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CoverageMetric INSTANCE = new CoverageMetric();
    
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
    private static final CoverageMetric.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Coverage = new PParameter("Coverage", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Coverage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.coverageMetric";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Coverage");
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
          PVariable var_Coverage = body.getOrCreateVariableByName("Coverage");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Coverage), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Coverage, parameter_Coverage)
          ));
          // 	Coverage == sum find missionCoverage(_, #_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Double.class), body, Tuples.flatTupleOf(var___0_, var___1_), MissionCoverage.instance().getInternalQueryRepresentation(), var__virtual_0_, 1);
          new Equality(body, var_Coverage, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
