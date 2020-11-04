/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.CpsApplications;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.HostInstanceCost;
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
import org.eclipse.viatra.query.runtime.matchers.aggregators.sum;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         pattern cpsCost(Cps : CyberPhysicalSystem, Cost : java Integer) {
 *         	AppCount == count find cpsApplications(Cps, _);
 *         	HostCost == sum find hostInstanceCost(Cps, _, #_);
 *         	Cost == eval(5  AppCount + HostCost);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CpsCost extends BaseGeneratedEMFQuerySpecification<CpsCost.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsCost pattern,
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
    private CyberPhysicalSystem fCps;
    
    private Integer fCost;
    
    private static List<String> parameterNames = makeImmutableList("Cps", "Cost");
    
    private Match(final CyberPhysicalSystem pCps, final Integer pCost) {
      this.fCps = pCps;
      this.fCost = pCost;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Cps": return this.fCps;
          case "Cost": return this.fCost;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fCps;
          case 1: return this.fCost;
          default: return null;
      }
    }
    
    public CyberPhysicalSystem getCps() {
      return this.fCps;
    }
    
    public Integer getCost() {
      return this.fCost;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Cps".equals(parameterName) ) {
          this.fCps = (CyberPhysicalSystem) newValue;
          return true;
      }
      if ("Cost".equals(parameterName) ) {
          this.fCost = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setCps(final CyberPhysicalSystem pCps) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCps = pCps;
    }
    
    public void setCost(final Integer pCost) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCost = pCost;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsCost";
    }
    
    @Override
    public List<String> parameterNames() {
      return CpsCost.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fCps, fCost};
    }
    
    @Override
    public CpsCost.Match toImmutable() {
      return isMutable() ? newMatch(fCps, fCost) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Cps\"=" + prettyPrintValue(fCps) + ", ");
      result.append("\"Cost\"=" + prettyPrintValue(fCost));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fCps, fCost);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CpsCost.Match)) {
          CpsCost.Match other = (CpsCost.Match) obj;
          return Objects.equals(fCps, other.fCps) && Objects.equals(fCost, other.fCost);
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
    public CpsCost specification() {
      return CpsCost.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CpsCost.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CpsCost.Match newMutableMatch(final CyberPhysicalSystem pCps, final Integer pCost) {
      return new Mutable(pCps, pCost);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CpsCost.Match newMatch(final CyberPhysicalSystem pCps, final Integer pCost) {
      return new Immutable(pCps, pCost);
    }
    
    private static final class Mutable extends CpsCost.Match {
      Mutable(final CyberPhysicalSystem pCps, final Integer pCost) {
        super(pCps, pCost);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CpsCost.Match {
      Immutable(final CyberPhysicalSystem pCps, final Integer pCost) {
        super(pCps, pCost);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsCost pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern cpsCost(Cps : CyberPhysicalSystem, Cost : java Integer) {
   * 	AppCount == count find cpsApplications(Cps, _);
   * 	HostCost == sum find hostInstanceCost(Cps, _, #_);
   * 	Cost == eval(5  AppCount + HostCost);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CpsCost
   * 
   */
  public static class Matcher extends BaseMatcher<CpsCost.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CpsCost.Matcher on(final ViatraQueryEngine engine) {
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
    public static CpsCost.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CPS = 0;
    
    private static final int POSITION_COST = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CpsCost.Matcher.class);
    
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
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CpsCost.Match> getAllMatches(final CyberPhysicalSystem pCps, final Integer pCost) {
      return rawStreamAllMatches(new Object[]{pCps, pCost}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CpsCost.Match> streamAllMatches(final CyberPhysicalSystem pCps, final Integer pCost) {
      return rawStreamAllMatches(new Object[]{pCps, pCost});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CpsCost.Match> getOneArbitraryMatch(final CyberPhysicalSystem pCps, final Integer pCost) {
      return rawGetOneArbitraryMatch(new Object[]{pCps, pCost});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final CyberPhysicalSystem pCps, final Integer pCost) {
      return rawHasMatch(new Object[]{pCps, pCost});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final CyberPhysicalSystem pCps, final Integer pCost) {
      return rawCountMatches(new Object[]{pCps, pCost});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final CyberPhysicalSystem pCps, final Integer pCost, final Consumer<? super CpsCost.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCps, pCost}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pCost the fixed value of pattern parameter Cost, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CpsCost.Match newMatch(final CyberPhysicalSystem pCps, final Integer pCost) {
      return CpsCost.Match.newMatch(pCps, pCost);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<CyberPhysicalSystem> rawStreamAllValuesOfCps(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CPS, parameters).map(CyberPhysicalSystem.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CyberPhysicalSystem> getAllValuesOfCps() {
      return rawStreamAllValuesOfCps(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<CyberPhysicalSystem> streamAllValuesOfCps() {
      return rawStreamAllValuesOfCps(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<CyberPhysicalSystem> streamAllValuesOfCps(final CpsCost.Match partialMatch) {
      return rawStreamAllValuesOfCps(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<CyberPhysicalSystem> streamAllValuesOfCps(final Integer pCost) {
      return rawStreamAllValuesOfCps(new Object[]{null, pCost});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CyberPhysicalSystem> getAllValuesOfCps(final CpsCost.Match partialMatch) {
      return rawStreamAllValuesOfCps(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CyberPhysicalSystem> getAllValuesOfCps(final Integer pCost) {
      return rawStreamAllValuesOfCps(new Object[]{null, pCost}).collect(Collectors.toSet());
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
    
    /**
     * Retrieve the set of values that occur in matches for Cost.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfCost(final CpsCost.Match partialMatch) {
      return rawStreamAllValuesOfCost(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cost.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfCost(final CyberPhysicalSystem pCps) {
      return rawStreamAllValuesOfCost(new Object[]{pCps, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cost.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfCost(final CpsCost.Match partialMatch) {
      return rawStreamAllValuesOfCost(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cost.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfCost(final CyberPhysicalSystem pCps) {
      return rawStreamAllValuesOfCost(new Object[]{pCps, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected CpsCost.Match tupleToMatch(final Tuple t) {
      try {
          return CpsCost.Match.newMatch((CyberPhysicalSystem) t.get(POSITION_CPS), (Integer) t.get(POSITION_COST));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CpsCost.Match arrayToMatch(final Object[] match) {
      try {
          return CpsCost.Match.newMatch((CyberPhysicalSystem) match[POSITION_CPS], (Integer) match[POSITION_COST]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CpsCost.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CpsCost.Match.newMutableMatch((CyberPhysicalSystem) match[POSITION_CPS], (Integer) match[POSITION_COST]);
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
    public static IQuerySpecification<CpsCost.Matcher> querySpecification() {
      return CpsCost.instance();
    }
  }
  
  private CpsCost() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CpsCost instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CpsCost.Matcher instantiate(final ViatraQueryEngine engine) {
    return CpsCost.Matcher.on(engine);
  }
  
  @Override
  public CpsCost.Matcher instantiate() {
    return CpsCost.Matcher.create();
  }
  
  @Override
  public CpsCost.Match newEmptyMatch() {
    return CpsCost.Match.newEmptyMatch();
  }
  
  @Override
  public CpsCost.Match newMatch(final Object... parameters) {
    return CpsCost.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link CpsCost} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link CpsCost#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CpsCost INSTANCE = new CpsCost();
    
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
    private static final CpsCost.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Cps = new PParameter("Cps", "hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "CyberPhysicalSystem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Cost = new PParameter("Cost", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Cps, parameter_Cost);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsCost";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Cps","Cost");
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
          PVariable var_Cps = body.getOrCreateVariableByName("Cps");
          PVariable var_Cost = body.getOrCreateVariableByName("Cost");
          PVariable var_AppCount = body.getOrCreateVariableByName("AppCount");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_HostCost = body.getOrCreateVariableByName("HostCost");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "CyberPhysicalSystem")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Cost), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Cps, parameter_Cps),
             new ExportedParameter(body, var_Cost, parameter_Cost)
          ));
          // 	AppCount == count find cpsApplications(Cps, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_Cps, var___0_), CpsApplications.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_AppCount, var__virtual_0_);
          // 	HostCost == sum find hostInstanceCost(Cps, _, #_)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Integer.class), body, Tuples.flatTupleOf(var_Cps, var___1_, var___2_), HostInstanceCost.instance().getInternalQueryRepresentation(), var__virtual_1_, 2);
          new Equality(body, var_HostCost, var__virtual_1_);
          // 	Cost == eval(5 * AppCount + HostCost)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern cpsCost";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("AppCount", "HostCost");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer AppCount = (Integer) provider.getValue("AppCount");
                  Integer HostCost = (Integer) provider.getValue("HostCost");
                  return evaluateExpression_1_1(AppCount, HostCost);
              }
          },  var__virtual_2_ ); 
          new Equality(body, var_Cost, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1(final Integer AppCount, final Integer HostCost) {
    return ((5 * (AppCount).intValue()) + (HostCost).intValue());
  }
}
