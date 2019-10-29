/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
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
 *         pattern resourceRequirement(Host : HostInstance, App : ApplicationInstance, Req : ResourceRequirement) {
 *         	ApplicationInstance.allocatedTo(App, Host);
 *         	ApplicationInstance.type.requirements(App, Req);
 *         	HostInstance.type(Host, HostType);
 *         	ResourceRequirement.hostType(Req, HostType);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ResourceRequirement extends BaseGeneratedEMFQuerySpecification<ResourceRequirement.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.resourceRequirement pattern,
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
    
    private hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement fReq;
    
    private static List<String> parameterNames = makeImmutableList("Host", "App", "Req");
    
    private Match(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      this.fHost = pHost;
      this.fApp = pApp;
      this.fReq = pReq;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Host": return this.fHost;
          case "App": return this.fApp;
          case "Req": return this.fReq;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fHost;
          case 1: return this.fApp;
          case 2: return this.fReq;
          default: return null;
      }
    }
    
    public HostInstance getHost() {
      return this.fHost;
    }
    
    public ApplicationInstance getApp() {
      return this.fApp;
    }
    
    public hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement getReq() {
      return this.fReq;
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
      if ("Req".equals(parameterName) ) {
          this.fReq = (hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement) newValue;
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
    
    public void setReq(final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReq = pReq;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.resourceRequirement";
    }
    
    @Override
    public List<String> parameterNames() {
      return ResourceRequirement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fHost, fApp, fReq};
    }
    
    @Override
    public ResourceRequirement.Match toImmutable() {
      return isMutable() ? newMatch(fHost, fApp, fReq) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Host\"=" + prettyPrintValue(fHost) + ", ");
      result.append("\"App\"=" + prettyPrintValue(fApp) + ", ");
      result.append("\"Req\"=" + prettyPrintValue(fReq));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fHost, fApp, fReq);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ResourceRequirement.Match)) {
          ResourceRequirement.Match other = (ResourceRequirement.Match) obj;
          return Objects.equals(fHost, other.fHost) && Objects.equals(fApp, other.fApp) && Objects.equals(fReq, other.fReq);
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
    public ResourceRequirement specification() {
      return ResourceRequirement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ResourceRequirement.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ResourceRequirement.Match newMutableMatch(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return new Mutable(pHost, pApp, pReq);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ResourceRequirement.Match newMatch(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return new Immutable(pHost, pApp, pReq);
    }
    
    private static final class Mutable extends ResourceRequirement.Match {
      Mutable(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
        super(pHost, pApp, pReq);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ResourceRequirement.Match {
      Immutable(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
        super(pHost, pApp, pReq);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.resourceRequirement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern resourceRequirement(Host : HostInstance, App : ApplicationInstance, Req : ResourceRequirement) {
   * 	ApplicationInstance.allocatedTo(App, Host);
   * 	ApplicationInstance.type.requirements(App, Req);
   * 	HostInstance.type(Host, HostType);
   * 	ResourceRequirement.hostType(Req, HostType);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ResourceRequirement
   * 
   */
  public static class Matcher extends BaseMatcher<ResourceRequirement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ResourceRequirement.Matcher on(final ViatraQueryEngine engine) {
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
    public static ResourceRequirement.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_HOST = 0;
    
    private static final int POSITION_APP = 1;
    
    private static final int POSITION_REQ = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ResourceRequirement.Matcher.class);
    
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
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ResourceRequirement.Match> getAllMatches(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawStreamAllMatches(new Object[]{pHost, pApp, pReq}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ResourceRequirement.Match> streamAllMatches(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawStreamAllMatches(new Object[]{pHost, pApp, pReq});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ResourceRequirement.Match> getOneArbitraryMatch(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawGetOneArbitraryMatch(new Object[]{pHost, pApp, pReq});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawHasMatch(new Object[]{pHost, pApp, pReq});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawCountMatches(new Object[]{pHost, pApp, pReq});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq, final Consumer<? super ResourceRequirement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pHost, pApp, pReq}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pApp the fixed value of pattern parameter App, or null if not bound.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ResourceRequirement.Match newMatch(final HostInstance pHost, final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return ResourceRequirement.Match.newMatch(pHost, pApp, pReq);
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
    public Stream<HostInstance> streamAllValuesOfHost(final ResourceRequirement.Match partialMatch) {
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
    public Stream<HostInstance> streamAllValuesOfHost(final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawStreamAllValuesOfHost(new Object[]{null, pApp, pReq});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final ResourceRequirement.Match partialMatch) {
      return rawStreamAllValuesOfHost(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final ApplicationInstance pApp, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawStreamAllValuesOfHost(new Object[]{null, pApp, pReq}).collect(Collectors.toSet());
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
    public Stream<ApplicationInstance> streamAllValuesOfApp(final ResourceRequirement.Match partialMatch) {
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
    public Stream<ApplicationInstance> streamAllValuesOfApp(final HostInstance pHost, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawStreamAllValuesOfApp(new Object[]{pHost, null, pReq});
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final ResourceRequirement.Match partialMatch) {
      return rawStreamAllValuesOfApp(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for App.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfApp(final HostInstance pHost, final hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement pReq) {
      return rawStreamAllValuesOfApp(new Object[]{pHost, null, pReq}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement> rawStreamAllValuesOfReq(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REQ, parameters).map(hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement> getAllValuesOfReq() {
      return rawStreamAllValuesOfReq(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement> streamAllValuesOfReq() {
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
    public Stream<hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement> streamAllValuesOfReq(final ResourceRequirement.Match partialMatch) {
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
    public Stream<hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement> streamAllValuesOfReq(final HostInstance pHost, final ApplicationInstance pApp) {
      return rawStreamAllValuesOfReq(new Object[]{pHost, pApp, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement> getAllValuesOfReq(final ResourceRequirement.Match partialMatch) {
      return rawStreamAllValuesOfReq(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement> getAllValuesOfReq(final HostInstance pHost, final ApplicationInstance pApp) {
      return rawStreamAllValuesOfReq(new Object[]{pHost, pApp, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ResourceRequirement.Match tupleToMatch(final Tuple t) {
      try {
          return ResourceRequirement.Match.newMatch((HostInstance) t.get(POSITION_HOST), (ApplicationInstance) t.get(POSITION_APP), (hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement) t.get(POSITION_REQ));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResourceRequirement.Match arrayToMatch(final Object[] match) {
      try {
          return ResourceRequirement.Match.newMatch((HostInstance) match[POSITION_HOST], (ApplicationInstance) match[POSITION_APP], (hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement) match[POSITION_REQ]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ResourceRequirement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ResourceRequirement.Match.newMutableMatch((HostInstance) match[POSITION_HOST], (ApplicationInstance) match[POSITION_APP], (hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement) match[POSITION_REQ]);
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
    public static IQuerySpecification<ResourceRequirement.Matcher> querySpecification() {
      return ResourceRequirement.instance();
    }
  }
  
  private ResourceRequirement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ResourceRequirement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ResourceRequirement.Matcher instantiate(final ViatraQueryEngine engine) {
    return ResourceRequirement.Matcher.on(engine);
  }
  
  @Override
  public ResourceRequirement.Matcher instantiate() {
    return ResourceRequirement.Matcher.create();
  }
  
  @Override
  public ResourceRequirement.Match newEmptyMatch() {
    return ResourceRequirement.Match.newEmptyMatch();
  }
  
  @Override
  public ResourceRequirement.Match newMatch(final Object... parameters) {
    return ResourceRequirement.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance) parameters[1], (hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ResourceRequirement} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ResourceRequirement#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ResourceRequirement INSTANCE = new ResourceRequirement();
    
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
    private static final ResourceRequirement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Host = new PParameter("Host", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_App = new PParameter("App", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Req = new PParameter("Req", "hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ResourceRequirement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Host, parameter_App, parameter_Req);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.resourceRequirement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Host","App","Req");
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
          PVariable var_Req = body.getOrCreateVariableByName("Req");
          PVariable var_HostType = body.getOrCreateVariableByName("HostType");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Host, parameter_Host),
             new ExportedParameter(body, var_App, parameter_App),
             new ExportedParameter(body, var_Req, parameter_Req)
          ));
          // 	ApplicationInstance.allocatedTo(App, Host)
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "allocatedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new Equality(body, var__virtual_0_, var_Host);
          // 	ApplicationInstance.type.requirements(App, Req)
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationType")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationType", "requirements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          new Equality(body, var__virtual_2_, var_Req);
          // 	HostInstance.type(Host, HostType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "HostInstance", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostType")));
          new Equality(body, var__virtual_3_, var_HostType);
          // 	ResourceRequirement.hostType(Req, HostType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ResourceRequirement", "hostType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostType")));
          new Equality(body, var__virtual_4_, var_HostType);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
