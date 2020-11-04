/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsCost;
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
 *         // Total cost
 *         
 *         pattern costMetric(Cost : java Integer) {
 *         	Cost == sum find cpsCost(_, #_);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CostMetric extends BaseGeneratedEMFQuerySpecification<CostMetric.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.costMetric pattern,
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
    private Integer fCost;
    
    private static List<String> parameterNames = makeImmutableList("Cost");
    
    private Match(final Integer pCost) {
      this.fCost = pCost;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Cost": return this.fCost;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fCost;
          default: return null;
      }
    }
    
    public Integer getCost() {
      return this.fCost;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Cost".equals(parameterName) ) {
          this.fCost = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setCost(final Integer pCost) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCost = pCost;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.costMetric";
    }
    
    @Override
    public List<String> parameterNames() {
      return CostMetric.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fCost};
    }
    
    @Override
    public CostMetric.Match toImmutable() {
      return isMutable() ? newMatch(fCost) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Cost\"=" + prettyPrintValue(fCost));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fCost);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CostMetric.Match)) {
          CostMetric.Match other = (CostMetric.Match) obj;
          return Objects.equals(fCost, other.fCost);
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
    public CostMetric specification() {
      return CostMetric.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CostMetric.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CostMetric.Match newMutableMatch(final Integer pCost) {
      return new Mutable(pCost);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CostMetric.Match newMatch(final Integer pCost) {
      return new Immutable(pCost);
    }
    
    private static final class Mutable extends CostMetric.Match {
      Mutable(final Integer pCost) {
        super(pCost);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CostMetric.Match {
      Immutable(final Integer pCost) {
        super(pCost);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.costMetric pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Total cost
   * 
   * pattern costMetric(Cost : java Integer) {
   * 	Cost == sum find cpsCost(_, #_);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CostMetric
   * 
   */
  public static class Matcher extends BaseMatcher<CostMetric.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CostMetric.Matcher on(final ViatraQueryEngine engine) {
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
    public static CostMetric.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_COST = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CostMetric.Matcher.class);
    
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
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CostMetric.Match> getAllMatches(final Integer pCost) {
      return rawStreamAllMatches(new Object[]{pCost}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CostMetric.Match> streamAllMatches(final Integer pCost) {
      return rawStreamAllMatches(new Object[]{pCost});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CostMetric.Match> getOneArbitraryMatch(final Integer pCost) {
      return rawGetOneArbitraryMatch(new Object[]{pCost});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Integer pCost) {
      return rawHasMatch(new Object[]{pCost});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Integer pCost) {
      return rawCountMatches(new Object[]{pCost});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Integer pCost, final Consumer<? super CostMetric.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCost}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CostMetric.Match newMatch(final Integer pCost) {
      return CostMetric.Match.newMatch(pCost);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cost.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOfCost(final Object[] parameters) {
      return rawStreamAllValues(POSITION_COST, parameters).map(Integer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cost.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfCost() {
      return rawStreamAllValuesOfCost(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cost.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfCost() {
      return rawStreamAllValuesOfCost(emptyArray());
    }
    
    @Override
    protected CostMetric.Match tupleToMatch(final Tuple t) {
      try {
          return CostMetric.Match.newMatch((Integer) t.get(POSITION_COST));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CostMetric.Match arrayToMatch(final Object[] match) {
      try {
          return CostMetric.Match.newMatch((Integer) match[POSITION_COST]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CostMetric.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CostMetric.Match.newMutableMatch((Integer) match[POSITION_COST]);
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
    public static IQuerySpecification<CostMetric.Matcher> querySpecification() {
      return CostMetric.instance();
    }
  }
  
  private CostMetric() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CostMetric instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CostMetric.Matcher instantiate(final ViatraQueryEngine engine) {
    return CostMetric.Matcher.on(engine);
  }
  
  @Override
  public CostMetric.Matcher instantiate() {
    return CostMetric.Matcher.create();
  }
  
  @Override
  public CostMetric.Match newEmptyMatch() {
    return CostMetric.Match.newEmptyMatch();
  }
  
  @Override
  public CostMetric.Match newMatch(final Object... parameters) {
    return CostMetric.Match.newMatch((java.lang.Integer) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link CostMetric} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link CostMetric#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CostMetric INSTANCE = new CostMetric();
    
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
    private static final CostMetric.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Cost = new PParameter("Cost", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Cost);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.costMetric";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Cost");
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
          PVariable var_Cost = body.getOrCreateVariableByName("Cost");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Cost), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Cost, parameter_Cost)
          ));
          // 	Cost == sum find cpsCost(_, #_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Integer.class), body, Tuples.flatTupleOf(var___0_, var___1_), CpsCost.instance().getInternalQueryRepresentation(), var__virtual_0_, 1);
          new Equality(body, var_Cost, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
