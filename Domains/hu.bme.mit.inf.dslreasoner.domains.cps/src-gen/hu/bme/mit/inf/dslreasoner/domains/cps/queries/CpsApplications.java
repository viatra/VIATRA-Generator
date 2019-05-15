/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
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
 *         {@literal @}QueryBasedFeature(feature = "applications")
 *         pattern cpsApplications(Cps : CyberPhysicalSystem, AppInstance : ApplicationInstance) {
 *         	CyberPhysicalSystem.applicationTypes.instances(Cps, AppInstance);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CpsApplications extends BaseGeneratedEMFQuerySpecification<CpsApplications.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsApplications pattern,
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
    
    private ApplicationInstance fAppInstance;
    
    private static List<String> parameterNames = makeImmutableList("Cps", "AppInstance");
    
    private Match(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      this.fCps = pCps;
      this.fAppInstance = pAppInstance;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Cps".equals(parameterName)) return this.fCps;
      if ("AppInstance".equals(parameterName)) return this.fAppInstance;
      return null;
    }
    
    public CyberPhysicalSystem getCps() {
      return this.fCps;
    }
    
    public ApplicationInstance getAppInstance() {
      return this.fAppInstance;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Cps".equals(parameterName) ) {
          this.fCps = (CyberPhysicalSystem) newValue;
          return true;
      }
      if ("AppInstance".equals(parameterName) ) {
          this.fAppInstance = (ApplicationInstance) newValue;
          return true;
      }
      return false;
    }
    
    public void setCps(final CyberPhysicalSystem pCps) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCps = pCps;
    }
    
    public void setAppInstance(final ApplicationInstance pAppInstance) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAppInstance = pAppInstance;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsApplications";
    }
    
    @Override
    public List<String> parameterNames() {
      return CpsApplications.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fCps, fAppInstance};
    }
    
    @Override
    public CpsApplications.Match toImmutable() {
      return isMutable() ? newMatch(fCps, fAppInstance) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Cps\"=" + prettyPrintValue(fCps) + ", ");
      result.append("\"AppInstance\"=" + prettyPrintValue(fAppInstance));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fCps, fAppInstance);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CpsApplications.Match)) {
          CpsApplications.Match other = (CpsApplications.Match) obj;
          return Objects.equals(fCps, other.fCps) && Objects.equals(fAppInstance, other.fAppInstance);
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
    public CpsApplications specification() {
      return CpsApplications.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CpsApplications.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CpsApplications.Match newMutableMatch(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return new Mutable(pCps, pAppInstance);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CpsApplications.Match newMatch(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return new Immutable(pCps, pAppInstance);
    }
    
    private static final class Mutable extends CpsApplications.Match {
      Mutable(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
        super(pCps, pAppInstance);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CpsApplications.Match {
      Immutable(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
        super(pCps, pAppInstance);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsApplications pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}QueryBasedFeature(feature = "applications")
   * pattern cpsApplications(Cps : CyberPhysicalSystem, AppInstance : ApplicationInstance) {
   * 	CyberPhysicalSystem.applicationTypes.instances(Cps, AppInstance);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CpsApplications
   * 
   */
  public static class Matcher extends BaseMatcher<CpsApplications.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CpsApplications.Matcher on(final ViatraQueryEngine engine) {
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
    public static CpsApplications.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CPS = 0;
    
    private static final int POSITION_APPINSTANCE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CpsApplications.Matcher.class);
    
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
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CpsApplications.Match> getAllMatches(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return rawStreamAllMatches(new Object[]{pCps, pAppInstance}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CpsApplications.Match> streamAllMatches(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return rawStreamAllMatches(new Object[]{pCps, pAppInstance});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CpsApplications.Match> getOneArbitraryMatch(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return rawGetOneArbitraryMatch(new Object[]{pCps, pAppInstance});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return rawHasMatch(new Object[]{pCps, pAppInstance});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return rawCountMatches(new Object[]{pCps, pAppInstance});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance, final Consumer<? super CpsApplications.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCps, pAppInstance}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCps the fixed value of pattern parameter Cps, or null if not bound.
     * @param pAppInstance the fixed value of pattern parameter AppInstance, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CpsApplications.Match newMatch(final CyberPhysicalSystem pCps, final ApplicationInstance pAppInstance) {
      return CpsApplications.Match.newMatch(pCps, pAppInstance);
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
    public Stream<CyberPhysicalSystem> streamAllValuesOfCps(final CpsApplications.Match partialMatch) {
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
    public Stream<CyberPhysicalSystem> streamAllValuesOfCps(final ApplicationInstance pAppInstance) {
      return rawStreamAllValuesOfCps(new Object[]{null, pAppInstance});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CyberPhysicalSystem> getAllValuesOfCps(final CpsApplications.Match partialMatch) {
      return rawStreamAllValuesOfCps(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Cps.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CyberPhysicalSystem> getAllValuesOfCps(final ApplicationInstance pAppInstance) {
      return rawStreamAllValuesOfCps(new Object[]{null, pAppInstance}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for AppInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<ApplicationInstance> rawStreamAllValuesOfAppInstance(final Object[] parameters) {
      return rawStreamAllValues(POSITION_APPINSTANCE, parameters).map(ApplicationInstance.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for AppInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfAppInstance() {
      return rawStreamAllValuesOfAppInstance(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for AppInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<ApplicationInstance> streamAllValuesOfAppInstance() {
      return rawStreamAllValuesOfAppInstance(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for AppInstance.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ApplicationInstance> streamAllValuesOfAppInstance(final CpsApplications.Match partialMatch) {
      return rawStreamAllValuesOfAppInstance(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for AppInstance.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<ApplicationInstance> streamAllValuesOfAppInstance(final CyberPhysicalSystem pCps) {
      return rawStreamAllValuesOfAppInstance(new Object[]{pCps, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for AppInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfAppInstance(final CpsApplications.Match partialMatch) {
      return rawStreamAllValuesOfAppInstance(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for AppInstance.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<ApplicationInstance> getAllValuesOfAppInstance(final CyberPhysicalSystem pCps) {
      return rawStreamAllValuesOfAppInstance(new Object[]{pCps, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected CpsApplications.Match tupleToMatch(final Tuple t) {
      try {
          return CpsApplications.Match.newMatch((CyberPhysicalSystem) t.get(POSITION_CPS), (ApplicationInstance) t.get(POSITION_APPINSTANCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CpsApplications.Match arrayToMatch(final Object[] match) {
      try {
          return CpsApplications.Match.newMatch((CyberPhysicalSystem) match[POSITION_CPS], (ApplicationInstance) match[POSITION_APPINSTANCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CpsApplications.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CpsApplications.Match.newMutableMatch((CyberPhysicalSystem) match[POSITION_CPS], (ApplicationInstance) match[POSITION_APPINSTANCE]);
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
    public static IQuerySpecification<CpsApplications.Matcher> querySpecification() {
      return CpsApplications.instance();
    }
  }
  
  private CpsApplications() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CpsApplications instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CpsApplications.Matcher instantiate(final ViatraQueryEngine engine) {
    return CpsApplications.Matcher.on(engine);
  }
  
  @Override
  public CpsApplications.Matcher instantiate() {
    return CpsApplications.Matcher.create();
  }
  
  @Override
  public CpsApplications.Match newEmptyMatch() {
    return CpsApplications.Match.newEmptyMatch();
  }
  
  @Override
  public CpsApplications.Match newMatch(final Object... parameters) {
    return CpsApplications.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsApplications (visibility: PUBLIC, simpleName: CpsApplications, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsApplications, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsApplications (visibility: PUBLIC, simpleName: CpsApplications, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsApplications, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CpsApplications INSTANCE = new CpsApplications();
    
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
    private static final CpsApplications.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Cps = new PParameter("Cps", "hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "CyberPhysicalSystem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_AppInstance = new PParameter("AppInstance", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Cps, parameter_AppInstance);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsApplications";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Cps","AppInstance");
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
          PVariable var_AppInstance = body.getOrCreateVariableByName("AppInstance");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "CyberPhysicalSystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_AppInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Cps, parameter_Cps),
             new ExportedParameter(body, var_AppInstance, parameter_AppInstance)
          ));
          // 	CyberPhysicalSystem.applicationTypes.instances(Cps, AppInstance)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "CyberPhysicalSystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "CyberPhysicalSystem", "applicationTypes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationType")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationType", "instances")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          new Equality(body, var__virtual_1_, var_AppInstance);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("QueryBasedFeature");
          annotation.addAttribute("feature", "applications");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
