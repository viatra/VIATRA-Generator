/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.SatisfyingInstance;
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
 *         {@literal @}Constraint(severity = "error", key = {Req, App},
 *         	message = "Requirement must be satisfied by the required application type.")
 *         pattern instanceDoesNotSatisfyRequirement(Req : Requirement, App : ApplicationInstance) {
 *         	Requirement.instances(Req, App);
 *         	neg find satisfyingInstance(Req, App);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class InstanceDoesNotSatisfyRequirement extends BaseGeneratedEMFQuerySpecification<InstanceDoesNotSatisfyRequirement.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.instanceDoesNotSatisfyRequirement pattern,
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
    private Requirement fReq;
    
    private ApplicationInstance fApp;
    
    private static List<String> parameterNames = makeImmutableList("Req", "App");
    
    private Match(final Requirement pReq, final ApplicationInstance pApp) {
      this.fReq = pReq;
      this.fApp = pApp;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Req".equals(parameterName)) return this.fReq;
      if ("App".equals(parameterName)) return this.fApp;
      return null;
    }
    
    public Requirement getReq() {
      return this.fReq;
    }
    
    public ApplicationInstance getApp() {
      return this.fApp;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Req".equals(parameterName) ) {
          this.fReq = (Requirement) newValue;
          return true;
      }
      if ("App".equals(parameterName) ) {
          this.fApp = (ApplicationInstance) newValue;
          return true;
      }
      return false;
    }
    
    public void setReq(final Requirement pReq) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReq = pReq;
    }
    
    public void setApp(final ApplicationInstance pApp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fApp = pApp;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.instanceDoesNotSatisfyRequirement";
    }
    
    @Override
    public List<String> parameterNames() {
      return InstanceDoesNotSatisfyRequirement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReq, fApp};
    }
    
    @Override
    public InstanceDoesNotSatisfyRequirement.Match toImmutable() {
      return isMutable() ? newMatch(fReq, fApp) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Req\"=" + prettyPrintValue(fReq) + ", ");
      result.append("\"App\"=" + prettyPrintValue(fApp));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fReq, fApp);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof InstanceDoesNotSatisfyRequirement.Match)) {
          InstanceDoesNotSatisfyRequirement.Match other = (InstanceDoesNotSatisfyRequirement.Match) obj;
          return Objects.equals(fReq, other.fReq) && Objects.equals(fApp, other.fApp);
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
    public InstanceDoesNotSatisfyRequirement specification() {
      return InstanceDoesNotSatisfyRequirement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static InstanceDoesNotSatisfyRequirement.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static InstanceDoesNotSatisfyRequirement.Match newMutableMatch(final Requirement pReq, final ApplicationInstance pApp) {
      return new Mutable(pReq, pApp);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static InstanceDoesNotSatisfyRequirement.Match newMatch(final Requirement pReq, final ApplicationInstance pApp) {
      return new Immutable(pReq, pApp);
    }
    
    private static final class Mutable extends InstanceDoesNotSatisfyRequirement.Match {
      Mutable(final Requirement pReq, final ApplicationInstance pApp) {
        super(pReq, pApp);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends InstanceDoesNotSatisfyRequirement.Match {
      Immutable(final Requirement pReq, final ApplicationInstance pApp) {
        super(pReq, pApp);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.instanceDoesNotSatisfyRequirement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity = "error", key = {Req, App},
   * 	message = "Requirement must be satisfied by the required application type.")
   * pattern instanceDoesNotSatisfyRequirement(Req : Requirement, App : ApplicationInstance) {
   * 	Requirement.instances(Req, App);
   * 	neg find satisfyingInstance(Req, App);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see InstanceDoesNotSatisfyRequirement
   * 
   */
  public static class Matcher extends BaseMatcher<InstanceDoesNotSatisfyRequirement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static InstanceDoesNotSatisfyRequirement.Matcher on(final ViatraQueryEngine engine) {
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
    public static InstanceDoesNotSatisfyRequirement.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_REQ = 0;
    
    private static final int POSITION_APP = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InstanceDoesNotSatisfyRequirement.Matcher.class);
    
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
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<InstanceDoesNotSatisfyRequirement.Match> getAllMatches(final Requirement pReq, final ApplicationInstance pApp) {
      return rawStreamAllMatches(new Object[]{pReq, pApp}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<InstanceDoesNotSatisfyRequirement.Match> streamAllMatches(final Requirement pReq, final ApplicationInstance pApp) {
      return rawStreamAllMatches(new Object[]{pReq, pApp});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<InstanceDoesNotSatisfyRequirement.Match> getOneArbitraryMatch(final Requirement pReq, final ApplicationInstance pApp) {
      return rawGetOneArbitraryMatch(new Object[]{pReq, pApp});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Requirement pReq, final ApplicationInstance pApp) {
      return rawHasMatch(new Object[]{pReq, pApp});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Requirement pReq, final ApplicationInstance pApp) {
      return rawCountMatches(new Object[]{pReq, pApp});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Requirement pReq, final ApplicationInstance pApp, final Consumer<? super InstanceDoesNotSatisfyRequirement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReq, pApp}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public InstanceDoesNotSatisfyRequirement.Match newMatch(final Requirement pReq, final ApplicationInstance pApp) {
      return InstanceDoesNotSatisfyRequirement.Match.newMatch(pReq, pApp);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Requirement> rawStreamAllValuesOfReq(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REQ, parameters).map(Requirement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Requirement> getAllValuesOfReq() {
      return rawStreamAllValuesOfReq(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Requirement> streamAllValuesOfReq() {
      return rawStreamAllValuesOfReq(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Requirement> streamAllValuesOfReq(final InstanceDoesNotSatisfyRequirement.Match partialMatch) {
      return rawStreamAllValuesOfReq(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Requirement> streamAllValuesOfReq(final ApplicationInstance pApp) {
      return rawStreamAllValuesOfReq(new Object[]{null, pApp});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Requirement> getAllValuesOfReq(final InstanceDoesNotSatisfyRequirement.Match partialMatch) {
      return rawStreamAllValuesOfReq(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Requirement> getAllValuesOfReq(final ApplicationInstance pApp) {
      return rawStreamAllValuesOfReq(new Object[]{null, pApp}).collect(Collectors.toSet());
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
    public Stream<ApplicationInstance> streamAllValuesOfApp(final InstanceDoesNotSatisfyRequirement.Match partialMatch) {
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
    public Stream<ApplicationInstance> streamAllValuesOfApp(final Requirement pReq) {
      return rawStreamAllValuesOfApp(new Object[]{pReq, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final InstanceDoesNotSatisfyRequirement.Match partialMatch) {
      return rawStreamAllValuesOfApp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final Requirement pReq) {
      return rawStreamAllValuesOfApp(new Object[]{pReq, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected InstanceDoesNotSatisfyRequirement.Match tupleToMatch(final Tuple t) {
      try {
          return InstanceDoesNotSatisfyRequirement.Match.newMatch((Requirement) t.get(POSITION_REQ), (ApplicationInstance) t.get(POSITION_APP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InstanceDoesNotSatisfyRequirement.Match arrayToMatch(final Object[] match) {
      try {
          return InstanceDoesNotSatisfyRequirement.Match.newMatch((Requirement) match[POSITION_REQ], (ApplicationInstance) match[POSITION_APP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InstanceDoesNotSatisfyRequirement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return InstanceDoesNotSatisfyRequirement.Match.newMutableMatch((Requirement) match[POSITION_REQ], (ApplicationInstance) match[POSITION_APP]);
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
    public static IQuerySpecification<InstanceDoesNotSatisfyRequirement.Matcher> querySpecification() {
      return InstanceDoesNotSatisfyRequirement.instance();
    }
  }
  
  private InstanceDoesNotSatisfyRequirement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static InstanceDoesNotSatisfyRequirement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected InstanceDoesNotSatisfyRequirement.Matcher instantiate(final ViatraQueryEngine engine) {
    return InstanceDoesNotSatisfyRequirement.Matcher.on(engine);
  }
  
  @Override
  public InstanceDoesNotSatisfyRequirement.Matcher instantiate() {
    return InstanceDoesNotSatisfyRequirement.Matcher.create();
  }
  
  @Override
  public InstanceDoesNotSatisfyRequirement.Match newEmptyMatch() {
    return InstanceDoesNotSatisfyRequirement.Match.newEmptyMatch();
  }
  
  @Override
  public InstanceDoesNotSatisfyRequirement.Match newMatch(final Object... parameters) {
    return InstanceDoesNotSatisfyRequirement.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.Requirement) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.InstanceDoesNotSatisfyRequirement (visibility: PUBLIC, simpleName: InstanceDoesNotSatisfyRequirement, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.InstanceDoesNotSatisfyRequirement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.InstanceDoesNotSatisfyRequirement (visibility: PUBLIC, simpleName: InstanceDoesNotSatisfyRequirement, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.InstanceDoesNotSatisfyRequirement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final InstanceDoesNotSatisfyRequirement INSTANCE = new InstanceDoesNotSatisfyRequirement();
    
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
    private static final InstanceDoesNotSatisfyRequirement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Req = new PParameter("Req", "hu.bme.mit.inf.dslreasoner.domains.cps.Requirement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "Requirement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_App = new PParameter("App", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Req, parameter_App);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.instanceDoesNotSatisfyRequirement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Req","App");
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
          PVariable var_Req = body.getOrCreateVariableByName("Req");
          PVariable var_App = body.getOrCreateVariableByName("App");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Req, parameter_Req),
             new ExportedParameter(body, var_App, parameter_App)
          ));
          // 	Requirement.instances(Req, App)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "Requirement", "instances")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          new Equality(body, var__virtual_0_, var_App);
          // 	neg find satisfyingInstance(Req, App)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_Req, var_App), SatisfyingInstance.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Req"), 
                              new ParameterReference("App")
                              }));
          annotation.addAttribute("message", "Requirement must be satisfied by the required application type.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
