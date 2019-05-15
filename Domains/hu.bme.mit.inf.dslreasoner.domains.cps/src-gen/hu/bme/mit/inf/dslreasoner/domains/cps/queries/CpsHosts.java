/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
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
 *         {@literal @}QueryBasedFeature(feature = "hosts")
 *         pattern cpsHosts(Cps : CyberPhysicalSystem, HostInstance : HostInstance) {
 *         	CyberPhysicalSystem.hostTypes.instances(Cps, HostInstance);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CpsHosts extends BaseGeneratedEMFQuerySpecification<CpsHosts.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsHosts pattern,
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
    
    private HostInstance fHostInstance;
    
    private static List<String> parameterNames = makeImmutableList("Cps", "HostInstance");
    
    private Match(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      this.fCps = pCps;
      this.fHostInstance = pHostInstance;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Cps".equals(parameterName)) return this.fCps;
      if ("HostInstance".equals(parameterName)) return this.fHostInstance;
      return null;
    }
    
    public CyberPhysicalSystem getCps() {
      return this.fCps;
    }
    
    public HostInstance getHostInstance() {
      return this.fHostInstance;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Cps".equals(parameterName) ) {
          this.fCps = (CyberPhysicalSystem) newValue;
          return true;
      }
      if ("HostInstance".equals(parameterName) ) {
          this.fHostInstance = (HostInstance) newValue;
          return true;
      }
      return false;
    }
    
    public void setCps(final CyberPhysicalSystem pCps) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCps = pCps;
    }
    
    public void setHostInstance(final HostInstance pHostInstance) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHostInstance = pHostInstance;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsHosts";
    }
    
    @Override
    public List<String> parameterNames() {
      return CpsHosts.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fCps, fHostInstance};
    }
    
    @Override
    public CpsHosts.Match toImmutable() {
      return isMutable() ? newMatch(fCps, fHostInstance) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Cps\"=" + prettyPrintValue(fCps) + ", ");
      result.append("\"HostInstance\"=" + prettyPrintValue(fHostInstance));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fCps, fHostInstance);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CpsHosts.Match)) {
          CpsHosts.Match other = (CpsHosts.Match) obj;
          return Objects.equals(fCps, other.fCps) && Objects.equals(fHostInstance, other.fHostInstance);
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
    public CpsHosts specification() {
      return CpsHosts.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CpsHosts.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CpsHosts.Match newMutableMatch(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return new Mutable(pCps, pHostInstance);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CpsHosts.Match newMatch(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return new Immutable(pCps, pHostInstance);
    }
    
    private static final class Mutable extends CpsHosts.Match {
      Mutable(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
        super(pCps, pHostInstance);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CpsHosts.Match {
      Immutable(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
        super(pCps, pHostInstance);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsHosts pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}QueryBasedFeature(feature = "hosts")
   * pattern cpsHosts(Cps : CyberPhysicalSystem, HostInstance : HostInstance) {
   * 	CyberPhysicalSystem.hostTypes.instances(Cps, HostInstance);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CpsHosts
   * 
   */
  public static class Matcher extends BaseMatcher<CpsHosts.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CpsHosts.Matcher on(final ViatraQueryEngine engine) {
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
    public static CpsHosts.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CPS = 0;
    
    private static final int POSITION_HOSTINSTANCE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CpsHosts.Matcher.class);
    
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
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CpsHosts.Match> getAllMatches(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return rawStreamAllMatches(new Object[]{pCps, pHostInstance}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CpsHosts.Match> streamAllMatches(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return rawStreamAllMatches(new Object[]{pCps, pHostInstance});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CpsHosts.Match> getOneArbitraryMatch(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return rawGetOneArbitraryMatch(new Object[]{pCps, pHostInstance});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return rawHasMatch(new Object[]{pCps, pHostInstance});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return rawCountMatches(new Object[]{pCps, pHostInstance});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final CyberPhysicalSystem pCps, final HostInstance pHostInstance, final Consumer<? super CpsHosts.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCps, pHostInstance}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pHostInstance the fixed value of pattern parameter HostInstance, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CpsHosts.Match newMatch(final CyberPhysicalSystem pCps, final HostInstance pHostInstance) {
      return CpsHosts.Match.newMatch(pCps, pHostInstance);
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
    public Stream<CyberPhysicalSystem> streamAllValuesOfCps(final CpsHosts.Match partialMatch) {
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
    public Stream<CyberPhysicalSystem> streamAllValuesOfCps(final HostInstance pHostInstance) {
      return rawStreamAllValuesOfCps(new Object[]{null, pHostInstance});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CyberPhysicalSystem> getAllValuesOfCps(final CpsHosts.Match partialMatch) {
      return rawStreamAllValuesOfCps(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CyberPhysicalSystem> getAllValuesOfCps(final HostInstance pHostInstance) {
      return rawStreamAllValuesOfCps(new Object[]{null, pHostInstance}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<HostInstance> rawStreamAllValuesOfHostInstance(final Object[] parameters) {
      return rawStreamAllValues(POSITION_HOSTINSTANCE, parameters).map(HostInstance.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHostInstance() {
      return rawStreamAllValuesOfHostInstance(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<HostInstance> streamAllValuesOfHostInstance() {
      return rawStreamAllValuesOfHostInstance(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostInstance.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<HostInstance> streamAllValuesOfHostInstance(final CpsHosts.Match partialMatch) {
      return rawStreamAllValuesOfHostInstance(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostInstance.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<HostInstance> streamAllValuesOfHostInstance(final CyberPhysicalSystem pCps) {
      return rawStreamAllValuesOfHostInstance(new Object[]{pCps, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHostInstance(final CpsHosts.Match partialMatch) {
      return rawStreamAllValuesOfHostInstance(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHostInstance(final CyberPhysicalSystem pCps) {
      return rawStreamAllValuesOfHostInstance(new Object[]{pCps, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected CpsHosts.Match tupleToMatch(final Tuple t) {
      try {
          return CpsHosts.Match.newMatch((CyberPhysicalSystem) t.get(POSITION_CPS), (HostInstance) t.get(POSITION_HOSTINSTANCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CpsHosts.Match arrayToMatch(final Object[] match) {
      try {
          return CpsHosts.Match.newMatch((CyberPhysicalSystem) match[POSITION_CPS], (HostInstance) match[POSITION_HOSTINSTANCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CpsHosts.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CpsHosts.Match.newMutableMatch((CyberPhysicalSystem) match[POSITION_CPS], (HostInstance) match[POSITION_HOSTINSTANCE]);
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
    public static IQuerySpecification<CpsHosts.Matcher> querySpecification() {
      return CpsHosts.instance();
    }
  }
  
  private CpsHosts() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CpsHosts instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CpsHosts.Matcher instantiate(final ViatraQueryEngine engine) {
    return CpsHosts.Matcher.on(engine);
  }
  
  @Override
  public CpsHosts.Matcher instantiate() {
    return CpsHosts.Matcher.create();
  }
  
  @Override
  public CpsHosts.Match newEmptyMatch() {
    return CpsHosts.Match.newEmptyMatch();
  }
  
  @Override
  public CpsHosts.Match newMatch(final Object... parameters) {
    return CpsHosts.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsHosts (visibility: PUBLIC, simpleName: CpsHosts, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsHosts, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsHosts (visibility: PUBLIC, simpleName: CpsHosts, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsHosts, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CpsHosts INSTANCE = new CpsHosts();
    
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
    private static final CpsHosts.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Cps = new PParameter("Cps", "hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "CyberPhysicalSystem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_HostInstance = new PParameter("HostInstance", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Cps, parameter_HostInstance);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsHosts";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Cps","HostInstance");
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
          PVariable var_HostInstance = body.getOrCreateVariableByName("HostInstance");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "CyberPhysicalSystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_HostInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Cps, parameter_Cps),
             new ExportedParameter(body, var_HostInstance, parameter_HostInstance)
          ));
          // 	CyberPhysicalSystem.hostTypes.instances(Cps, HostInstance)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "CyberPhysicalSystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "CyberPhysicalSystem", "hostTypes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostType")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "HostType", "instances")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new Equality(body, var__virtual_1_, var_HostInstance);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("QueryBasedFeature");
          annotation.addAttribute("feature", "hosts");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
