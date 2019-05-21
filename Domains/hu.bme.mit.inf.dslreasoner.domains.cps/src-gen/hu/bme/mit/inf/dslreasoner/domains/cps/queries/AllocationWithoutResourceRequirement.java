/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.ResourceRequirement;
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         {@literal @}Constraint(severity = "error", key = {Host, App},
 *         	message = "Application instance must be allocated to a supported host type.")
 *         pattern allocationWithoutResourceRequirement(Host : HostInstance, App : ApplicationInstance) {
 *         	ApplicationInstance.allocatedTo(App, Host);
 *         	neg find resourceRequirement(Host, App, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AllocationWithoutResourceRequirement extends BaseGeneratedEMFQuerySpecification<AllocationWithoutResourceRequirement.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocationWithoutResourceRequirement pattern,
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
    private HostInstance fHost;
    
    private ApplicationInstance fApp;
    
    private static List<String> parameterNames = makeImmutableList("Host", "App");
    
    private Match(final HostInstance pHost, final ApplicationInstance pApp) {
      this.fHost = pHost;
      this.fApp = pApp;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Host".equals(parameterName)) return this.fHost;
      if ("App".equals(parameterName)) return this.fApp;
      return null;
    }
    
    public HostInstance getHost() {
      return this.fHost;
    }
    
    public ApplicationInstance getApp() {
      return this.fApp;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Host".equals(parameterName) ) {
          this.fHost = (HostInstance) newValue;
          return true;
      }
      if ("App".equals(parameterName) ) {
          this.fApp = (ApplicationInstance) newValue;
          return true;
      }
      return false;
    }
    
    public void setHost(final HostInstance pHost) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHost = pHost;
    }
    
    public void setApp(final ApplicationInstance pApp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fApp = pApp;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocationWithoutResourceRequirement";
    }
    
    @Override
    public List<String> parameterNames() {
      return AllocationWithoutResourceRequirement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fHost, fApp};
    }
    
    @Override
    public AllocationWithoutResourceRequirement.Match toImmutable() {
      return isMutable() ? newMatch(fHost, fApp) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Host\"=" + prettyPrintValue(fHost) + ", ");
      result.append("\"App\"=" + prettyPrintValue(fApp));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fHost, fApp);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AllocationWithoutResourceRequirement.Match)) {
          AllocationWithoutResourceRequirement.Match other = (AllocationWithoutResourceRequirement.Match) obj;
          return Objects.equals(fHost, other.fHost) && Objects.equals(fApp, other.fApp);
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
    public AllocationWithoutResourceRequirement specification() {
      return AllocationWithoutResourceRequirement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AllocationWithoutResourceRequirement.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AllocationWithoutResourceRequirement.Match newMutableMatch(final HostInstance pHost, final ApplicationInstance pApp) {
      return new Mutable(pHost, pApp);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AllocationWithoutResourceRequirement.Match newMatch(final HostInstance pHost, final ApplicationInstance pApp) {
      return new Immutable(pHost, pApp);
    }
    
    private static final class Mutable extends AllocationWithoutResourceRequirement.Match {
      Mutable(final HostInstance pHost, final ApplicationInstance pApp) {
        super(pHost, pApp);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AllocationWithoutResourceRequirement.Match {
      Immutable(final HostInstance pHost, final ApplicationInstance pApp) {
        super(pHost, pApp);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocationWithoutResourceRequirement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity = "error", key = {Host, App},
   * 	message = "Application instance must be allocated to a supported host type.")
   * pattern allocationWithoutResourceRequirement(Host : HostInstance, App : ApplicationInstance) {
   * 	ApplicationInstance.allocatedTo(App, Host);
   * 	neg find resourceRequirement(Host, App, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AllocationWithoutResourceRequirement
   * 
   */
  public static class Matcher extends BaseMatcher<AllocationWithoutResourceRequirement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AllocationWithoutResourceRequirement.Matcher on(final ViatraQueryEngine engine) {
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
    public static AllocationWithoutResourceRequirement.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_HOST = 0;
    
    private static final int POSITION_APP = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AllocationWithoutResourceRequirement.Matcher.class);
    
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
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AllocationWithoutResourceRequirement.Match> getAllMatches(final HostInstance pHost, final ApplicationInstance pApp) {
      return rawStreamAllMatches(new Object[]{pHost, pApp}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AllocationWithoutResourceRequirement.Match> streamAllMatches(final HostInstance pHost, final ApplicationInstance pApp) {
      return rawStreamAllMatches(new Object[]{pHost, pApp});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AllocationWithoutResourceRequirement.Match> getOneArbitraryMatch(final HostInstance pHost, final ApplicationInstance pApp) {
      return rawGetOneArbitraryMatch(new Object[]{pHost, pApp});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final HostInstance pHost, final ApplicationInstance pApp) {
      return rawHasMatch(new Object[]{pHost, pApp});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final HostInstance pHost, final ApplicationInstance pApp) {
      return rawCountMatches(new Object[]{pHost, pApp});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final HostInstance pHost, final ApplicationInstance pApp, final Consumer<? super AllocationWithoutResourceRequirement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pHost, pApp}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AllocationWithoutResourceRequirement.Match newMatch(final HostInstance pHost, final ApplicationInstance pApp) {
      return AllocationWithoutResourceRequirement.Match.newMatch(pHost, pApp);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<HostInstance> rawStreamAllValuesOfHost(final Object[] parameters) {
      return rawStreamAllValues(POSITION_HOST, parameters).map(HostInstance.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost() {
      return rawStreamAllValuesOfHost(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<HostInstance> streamAllValuesOfHost() {
      return rawStreamAllValuesOfHost(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<HostInstance> streamAllValuesOfHost(final AllocationWithoutResourceRequirement.Match partialMatch) {
      return rawStreamAllValuesOfHost(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<HostInstance> streamAllValuesOfHost(final ApplicationInstance pApp) {
      return rawStreamAllValuesOfHost(new Object[]{null, pApp});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final AllocationWithoutResourceRequirement.Match partialMatch) {
      return rawStreamAllValuesOfHost(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final ApplicationInstance pApp) {
      return rawStreamAllValuesOfHost(new Object[]{null, pApp}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ApplicationInstance> rawStreamAllValuesOfApp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_APP, parameters).map(ApplicationInstance.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp() {
      return rawStreamAllValuesOfApp(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ApplicationInstance> streamAllValuesOfApp() {
      return rawStreamAllValuesOfApp(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ApplicationInstance> streamAllValuesOfApp(final AllocationWithoutResourceRequirement.Match partialMatch) {
      return rawStreamAllValuesOfApp(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ApplicationInstance> streamAllValuesOfApp(final HostInstance pHost) {
      return rawStreamAllValuesOfApp(new Object[]{pHost, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final AllocationWithoutResourceRequirement.Match partialMatch) {
      return rawStreamAllValuesOfApp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final HostInstance pHost) {
      return rawStreamAllValuesOfApp(new Object[]{pHost, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected AllocationWithoutResourceRequirement.Match tupleToMatch(final Tuple t) {
      try {
          return AllocationWithoutResourceRequirement.Match.newMatch((HostInstance) t.get(POSITION_HOST), (ApplicationInstance) t.get(POSITION_APP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllocationWithoutResourceRequirement.Match arrayToMatch(final Object[] match) {
      try {
          return AllocationWithoutResourceRequirement.Match.newMatch((HostInstance) match[POSITION_HOST], (ApplicationInstance) match[POSITION_APP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AllocationWithoutResourceRequirement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AllocationWithoutResourceRequirement.Match.newMutableMatch((HostInstance) match[POSITION_HOST], (ApplicationInstance) match[POSITION_APP]);
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
    public static IQuerySpecification<AllocationWithoutResourceRequirement.Matcher> querySpecification() {
      return AllocationWithoutResourceRequirement.instance();
    }
  }
  
  private AllocationWithoutResourceRequirement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AllocationWithoutResourceRequirement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllocationWithoutResourceRequirement.Matcher instantiate(final ViatraQueryEngine engine) {
    return AllocationWithoutResourceRequirement.Matcher.on(engine);
  }
  
  @Override
  public AllocationWithoutResourceRequirement.Matcher instantiate() {
    return AllocationWithoutResourceRequirement.Matcher.create();
  }
  
  @Override
  public AllocationWithoutResourceRequirement.Match newEmptyMatch() {
    return AllocationWithoutResourceRequirement.Match.newEmptyMatch();
  }
  
  @Override
  public AllocationWithoutResourceRequirement.Match newMatch(final Object... parameters) {
    return AllocationWithoutResourceRequirement.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AllocationWithoutResourceRequirement (visibility: PUBLIC, simpleName: AllocationWithoutResourceRequirement, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AllocationWithoutResourceRequirement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AllocationWithoutResourceRequirement (visibility: PUBLIC, simpleName: AllocationWithoutResourceRequirement, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AllocationWithoutResourceRequirement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AllocationWithoutResourceRequirement INSTANCE = new AllocationWithoutResourceRequirement();
    
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
    private static final AllocationWithoutResourceRequirement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Host = new PParameter("Host", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_App = new PParameter("App", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Host, parameter_App);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocationWithoutResourceRequirement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Host","App");
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
          PVariable var_Host = body.getOrCreateVariableByName("Host");
          PVariable var_App = body.getOrCreateVariableByName("App");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Host, parameter_Host),
             new ExportedParameter(body, var_App, parameter_App)
          ));
          // 	ApplicationInstance.allocatedTo(App, Host)
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "allocatedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new Equality(body, var__virtual_0_, var_Host);
          // 	neg find resourceRequirement(Host, App, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_Host, var_App, var___0_), ResourceRequirement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Host"), 
                              new ParameterReference("App")
                              }));
          annotation.addAttribute("message", "Application instance must be allocated to a supported host type.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
