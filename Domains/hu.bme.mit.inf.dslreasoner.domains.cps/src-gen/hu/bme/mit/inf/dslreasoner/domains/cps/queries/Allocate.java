/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableHdd;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableMemory;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.UnallocatedAppInstance;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
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
 *         //
 *         // Transformation rule preconditions for rule-based DSE
 *         //
 *         
 *         pattern allocate(App : ApplicationInstance, Host : HostInstance) {
 *         	ApplicationInstance.type.requirements(App, Req);
 *         	ResourceRequirement.hostType.instances(Req, Host);
 *         	find unallocatedAppInstance(App);
 *         	find availableMemory(Host, AvailableMem);
 *         	find availableHdd(Host, AvailableHdd);
 *         	ResourceRequirement.requiredMemory(Req, RequiredMem);
 *         	ResourceRequirement.requiredHdd(Req, RequiredHdd);
 *         	check(AvailableMem {@literal >}= RequiredMem);
 *         	check(AvailableHdd {@literal >}= RequiredHdd);
 *         	neg ApplicationInstance.requirement.instances.allocatedTo(App, Host);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Allocate extends BaseGeneratedEMFQuerySpecification<Allocate.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocate pattern,
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
    private ApplicationInstance fApp;
    
    private HostInstance fHost;
    
    private static List<String> parameterNames = makeImmutableList("App", "Host");
    
    private Match(final ApplicationInstance pApp, final HostInstance pHost) {
      this.fApp = pApp;
      this.fHost = pHost;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "App": return this.fApp;
          case "Host": return this.fHost;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fApp;
          case 1: return this.fHost;
          default: return null;
      }
    }
    
    public ApplicationInstance getApp() {
      return this.fApp;
    }
    
    public HostInstance getHost() {
      return this.fHost;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("App".equals(parameterName) ) {
          this.fApp = (ApplicationInstance) newValue;
          return true;
      }
      if ("Host".equals(parameterName) ) {
          this.fHost = (HostInstance) newValue;
          return true;
      }
      return false;
    }
    
    public void setApp(final ApplicationInstance pApp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fApp = pApp;
    }
    
    public void setHost(final HostInstance pHost) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHost = pHost;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocate";
    }
    
    @Override
    public List<String> parameterNames() {
      return Allocate.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fApp, fHost};
    }
    
    @Override
    public Allocate.Match toImmutable() {
      return isMutable() ? newMatch(fApp, fHost) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"App\"=" + prettyPrintValue(fApp) + ", ");
      result.append("\"Host\"=" + prettyPrintValue(fHost));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fApp, fHost);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Allocate.Match)) {
          Allocate.Match other = (Allocate.Match) obj;
          return Objects.equals(fApp, other.fApp) && Objects.equals(fHost, other.fHost);
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
    public Allocate specification() {
      return Allocate.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Allocate.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Allocate.Match newMutableMatch(final ApplicationInstance pApp, final HostInstance pHost) {
      return new Mutable(pApp, pHost);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Allocate.Match newMatch(final ApplicationInstance pApp, final HostInstance pHost) {
      return new Immutable(pApp, pHost);
    }
    
    private static final class Mutable extends Allocate.Match {
      Mutable(final ApplicationInstance pApp, final HostInstance pHost) {
        super(pApp, pHost);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Allocate.Match {
      Immutable(final ApplicationInstance pApp, final HostInstance pHost) {
        super(pApp, pHost);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocate pattern,
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
   * // Transformation rule preconditions for rule-based DSE
   * //
   * 
   * pattern allocate(App : ApplicationInstance, Host : HostInstance) {
   * 	ApplicationInstance.type.requirements(App, Req);
   * 	ResourceRequirement.hostType.instances(Req, Host);
   * 	find unallocatedAppInstance(App);
   * 	find availableMemory(Host, AvailableMem);
   * 	find availableHdd(Host, AvailableHdd);
   * 	ResourceRequirement.requiredMemory(Req, RequiredMem);
   * 	ResourceRequirement.requiredHdd(Req, RequiredHdd);
   * 	check(AvailableMem {@literal >}= RequiredMem);
   * 	check(AvailableHdd {@literal >}= RequiredHdd);
   * 	neg ApplicationInstance.requirement.instances.allocatedTo(App, Host);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Allocate
   * 
   */
  public static class Matcher extends BaseMatcher<Allocate.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Allocate.Matcher on(final ViatraQueryEngine engine) {
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
    public static Allocate.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_APP = 0;
    
    private static final int POSITION_HOST = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Allocate.Matcher.class);
    
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
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Allocate.Match> getAllMatches(final ApplicationInstance pApp, final HostInstance pHost) {
      return rawStreamAllMatches(new Object[]{pApp, pHost}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Allocate.Match> streamAllMatches(final ApplicationInstance pApp, final HostInstance pHost) {
      return rawStreamAllMatches(new Object[]{pApp, pHost});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Allocate.Match> getOneArbitraryMatch(final ApplicationInstance pApp, final HostInstance pHost) {
      return rawGetOneArbitraryMatch(new Object[]{pApp, pHost});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final ApplicationInstance pApp, final HostInstance pHost) {
      return rawHasMatch(new Object[]{pApp, pHost});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final ApplicationInstance pApp, final HostInstance pHost) {
      return rawCountMatches(new Object[]{pApp, pHost});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final ApplicationInstance pApp, final HostInstance pHost, final Consumer<? super Allocate.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pApp, pHost}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Allocate.Match newMatch(final ApplicationInstance pApp, final HostInstance pHost) {
      return Allocate.Match.newMatch(pApp, pHost);
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
    public Stream<ApplicationInstance> streamAllValuesOfApp(final Allocate.Match partialMatch) {
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
      return rawStreamAllValuesOfApp(new Object[]{null, pHost});
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final Allocate.Match partialMatch) {
      return rawStreamAllValuesOfApp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final HostInstance pHost) {
      return rawStreamAllValuesOfApp(new Object[]{null, pHost}).collect(Collectors.toSet());
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
    public Stream<HostInstance> streamAllValuesOfHost(final Allocate.Match partialMatch) {
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
      return rawStreamAllValuesOfHost(new Object[]{pApp, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final Allocate.Match partialMatch) {
      return rawStreamAllValuesOfHost(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final ApplicationInstance pApp) {
      return rawStreamAllValuesOfHost(new Object[]{pApp, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Allocate.Match tupleToMatch(final Tuple t) {
      try {
          return Allocate.Match.newMatch((ApplicationInstance) t.get(POSITION_APP), (HostInstance) t.get(POSITION_HOST));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Allocate.Match arrayToMatch(final Object[] match) {
      try {
          return Allocate.Match.newMatch((ApplicationInstance) match[POSITION_APP], (HostInstance) match[POSITION_HOST]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Allocate.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Allocate.Match.newMutableMatch((ApplicationInstance) match[POSITION_APP], (HostInstance) match[POSITION_HOST]);
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
    public static IQuerySpecification<Allocate.Matcher> querySpecification() {
      return Allocate.instance();
    }
  }
  
  private Allocate() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Allocate instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Allocate.Matcher instantiate(final ViatraQueryEngine engine) {
    return Allocate.Matcher.on(engine);
  }
  
  @Override
  public Allocate.Matcher instantiate() {
    return Allocate.Matcher.create();
  }
  
  @Override
  public Allocate.Match newEmptyMatch() {
    return Allocate.Match.newEmptyMatch();
  }
  
  @Override
  public Allocate.Match newMatch(final Object... parameters) {
    return Allocate.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Allocate} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Allocate#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Allocate INSTANCE = new Allocate();
    
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
    private static final Allocate.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_App = new PParameter("App", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Host = new PParameter("Host", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_App, parameter_Host);
    
    private class Embedded_1_ApplicationInstance_requirement_instances_allocatedTo extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_ApplicationInstance_requirement_instances_allocatedTo() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_ApplicationInstance_requirement_instances_allocatedTo";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  ApplicationInstance.requirement.instances.allocatedTo(App, Host)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "requirement")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
        PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "Requirement", "instances")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
        PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "allocatedTo")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
        new Equality(body, var__virtual_2_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.allocate";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("App","Host");
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
          PVariable var_App = body.getOrCreateVariableByName("App");
          PVariable var_Host = body.getOrCreateVariableByName("Host");
          PVariable var_Req = body.getOrCreateVariableByName("Req");
          PVariable var_AvailableMem = body.getOrCreateVariableByName("AvailableMem");
          PVariable var_AvailableHdd = body.getOrCreateVariableByName("AvailableHdd");
          PVariable var_RequiredMem = body.getOrCreateVariableByName("RequiredMem");
          PVariable var_RequiredHdd = body.getOrCreateVariableByName("RequiredHdd");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_App, parameter_App),
             new ExportedParameter(body, var_Host, parameter_Host)
          ));
          // 	ApplicationInstance.type.requirements(App, Req)
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationType")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationType", "requirements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          new Equality(body, var__virtual_1_, var_Req);
          // 	ResourceRequirement.hostType.instances(Req, Host)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ResourceRequirement", "hostType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostType")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "HostType", "instances")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new Equality(body, var__virtual_3_, var_Host);
          // 	find unallocatedAppInstance(App)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_App), UnallocatedAppInstance.instance().getInternalQueryRepresentation());
          // 	find availableMemory(Host, AvailableMem)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Host, var_AvailableMem), AvailableMemory.instance().getInternalQueryRepresentation());
          // 	find availableHdd(Host, AvailableHdd)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Host, var_AvailableHdd), AvailableHdd.instance().getInternalQueryRepresentation());
          // 	ResourceRequirement.requiredMemory(Req, RequiredMem)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ResourceRequirement", "requiredMemory")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_4_, var_RequiredMem);
          // 	ResourceRequirement.requiredHdd(Req, RequiredHdd)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ResourceRequirement", "requiredHdd")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_5_, var_RequiredHdd);
          // 	check(AvailableMem >= RequiredMem)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern allocate";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("AvailableMem", "RequiredMem");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer AvailableMem = (Integer) provider.getValue("AvailableMem");
                  Integer RequiredMem = (Integer) provider.getValue("RequiredMem");
                  return evaluateExpression_1_1(AvailableMem, RequiredMem);
              }
          },  null); 
          // 	check(AvailableHdd >= RequiredHdd)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern allocate";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("AvailableHdd", "RequiredHdd");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer AvailableHdd = (Integer) provider.getValue("AvailableHdd");
                  Integer RequiredHdd = (Integer) provider.getValue("RequiredHdd");
                  return evaluateExpression_1_2(AvailableHdd, RequiredHdd);
              }
          },  null); 
          // 	neg ApplicationInstance.requirement.instances.allocatedTo(App, Host)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_App, var_Host), new Allocate.GeneratedPQuery.Embedded_1_ApplicationInstance_requirement_instances_allocatedTo());
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer AvailableMem, final Integer RequiredMem) {
    boolean _greaterEqualsThan = (AvailableMem.compareTo(RequiredMem) >= 0);
    return _greaterEqualsThan;
  }
  
  private static boolean evaluateExpression_1_2(final Integer AvailableHdd, final Integer RequiredHdd) {
    boolean _greaterEqualsThan = (AvailableHdd.compareTo(RequiredHdd) >= 0);
    return _greaterEqualsThan;
  }
}
