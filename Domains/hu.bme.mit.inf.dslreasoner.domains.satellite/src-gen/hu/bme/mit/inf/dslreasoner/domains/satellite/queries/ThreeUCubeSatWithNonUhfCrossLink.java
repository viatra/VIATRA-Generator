/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemBandUhf;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.GroundStationNetwork;
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
import satellite.CubeSat3U;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // 3U CubeSats are assumed to only be able to downlink to Earth using an X-band trasmitter,
 *         // but cross-link using UHF
 *         
 *         {@literal @}Constraint(severity = "error", key = {Sat},
 *         	message = "3U CubeSats can only cross-link using UHF.")
 *         pattern threeUCubeSatWithNonUhfCrossLink(Sat : CubeSat3U) {
 *         	CommunicatingElement.commSubsystem(Sat, SourceComm);
 *         	neg find commSubsystemBandUhf(SourceComm);
 *         	CommSubsystem.target(SourceComm, TargetComm);
 *         	CommunicatingElement.commSubsystem(Target, TargetComm);
 *         	neg find groundStationNetwork(Target);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ThreeUCubeSatWithNonUhfCrossLink extends BaseGeneratedEMFQuerySpecification<ThreeUCubeSatWithNonUhfCrossLink.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.threeUCubeSatWithNonUhfCrossLink pattern,
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
    private CubeSat3U fSat;
    
    private static List<String> parameterNames = makeImmutableList("Sat");
    
    private Match(final CubeSat3U pSat) {
      this.fSat = pSat;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Sat".equals(parameterName)) return this.fSat;
      return null;
    }
    
    public CubeSat3U getSat() {
      return this.fSat;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Sat".equals(parameterName) ) {
          this.fSat = (CubeSat3U) newValue;
          return true;
      }
      return false;
    }
    
    public void setSat(final CubeSat3U pSat) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSat = pSat;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.threeUCubeSatWithNonUhfCrossLink";
    }
    
    @Override
    public List<String> parameterNames() {
      return ThreeUCubeSatWithNonUhfCrossLink.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSat};
    }
    
    @Override
    public ThreeUCubeSatWithNonUhfCrossLink.Match toImmutable() {
      return isMutable() ? newMatch(fSat) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Sat\"=" + prettyPrintValue(fSat));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fSat);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ThreeUCubeSatWithNonUhfCrossLink.Match)) {
          ThreeUCubeSatWithNonUhfCrossLink.Match other = (ThreeUCubeSatWithNonUhfCrossLink.Match) obj;
          return Objects.equals(fSat, other.fSat);
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
    public ThreeUCubeSatWithNonUhfCrossLink specification() {
      return ThreeUCubeSatWithNonUhfCrossLink.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ThreeUCubeSatWithNonUhfCrossLink.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ThreeUCubeSatWithNonUhfCrossLink.Match newMutableMatch(final CubeSat3U pSat) {
      return new Mutable(pSat);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ThreeUCubeSatWithNonUhfCrossLink.Match newMatch(final CubeSat3U pSat) {
      return new Immutable(pSat);
    }
    
    private static final class Mutable extends ThreeUCubeSatWithNonUhfCrossLink.Match {
      Mutable(final CubeSat3U pSat) {
        super(pSat);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ThreeUCubeSatWithNonUhfCrossLink.Match {
      Immutable(final CubeSat3U pSat) {
        super(pSat);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.threeUCubeSatWithNonUhfCrossLink pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // 3U CubeSats are assumed to only be able to downlink to Earth using an X-band trasmitter,
   * // but cross-link using UHF
   * 
   * {@literal @}Constraint(severity = "error", key = {Sat},
   * 	message = "3U CubeSats can only cross-link using UHF.")
   * pattern threeUCubeSatWithNonUhfCrossLink(Sat : CubeSat3U) {
   * 	CommunicatingElement.commSubsystem(Sat, SourceComm);
   * 	neg find commSubsystemBandUhf(SourceComm);
   * 	CommSubsystem.target(SourceComm, TargetComm);
   * 	CommunicatingElement.commSubsystem(Target, TargetComm);
   * 	neg find groundStationNetwork(Target);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ThreeUCubeSatWithNonUhfCrossLink
   * 
   */
  public static class Matcher extends BaseMatcher<ThreeUCubeSatWithNonUhfCrossLink.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ThreeUCubeSatWithNonUhfCrossLink.Matcher on(final ViatraQueryEngine engine) {
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
    public static ThreeUCubeSatWithNonUhfCrossLink.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SAT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ThreeUCubeSatWithNonUhfCrossLink.Matcher.class);
    
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
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ThreeUCubeSatWithNonUhfCrossLink.Match> getAllMatches(final CubeSat3U pSat) {
      return rawStreamAllMatches(new Object[]{pSat}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ThreeUCubeSatWithNonUhfCrossLink.Match> streamAllMatches(final CubeSat3U pSat) {
      return rawStreamAllMatches(new Object[]{pSat});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ThreeUCubeSatWithNonUhfCrossLink.Match> getOneArbitraryMatch(final CubeSat3U pSat) {
      return rawGetOneArbitraryMatch(new Object[]{pSat});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final CubeSat3U pSat) {
      return rawHasMatch(new Object[]{pSat});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final CubeSat3U pSat) {
      return rawCountMatches(new Object[]{pSat});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final CubeSat3U pSat, final Consumer<? super ThreeUCubeSatWithNonUhfCrossLink.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSat}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ThreeUCubeSatWithNonUhfCrossLink.Match newMatch(final CubeSat3U pSat) {
      return ThreeUCubeSatWithNonUhfCrossLink.Match.newMatch(pSat);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Sat.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<CubeSat3U> rawStreamAllValuesOfSat(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SAT, parameters).map(CubeSat3U.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Sat.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CubeSat3U> getAllValuesOfSat() {
      return rawStreamAllValuesOfSat(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Sat.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<CubeSat3U> streamAllValuesOfSat() {
      return rawStreamAllValuesOfSat(emptyArray());
    }
    
    @Override
    protected ThreeUCubeSatWithNonUhfCrossLink.Match tupleToMatch(final Tuple t) {
      try {
          return ThreeUCubeSatWithNonUhfCrossLink.Match.newMatch((CubeSat3U) t.get(POSITION_SAT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ThreeUCubeSatWithNonUhfCrossLink.Match arrayToMatch(final Object[] match) {
      try {
          return ThreeUCubeSatWithNonUhfCrossLink.Match.newMatch((CubeSat3U) match[POSITION_SAT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ThreeUCubeSatWithNonUhfCrossLink.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ThreeUCubeSatWithNonUhfCrossLink.Match.newMutableMatch((CubeSat3U) match[POSITION_SAT]);
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
    public static IQuerySpecification<ThreeUCubeSatWithNonUhfCrossLink.Matcher> querySpecification() {
      return ThreeUCubeSatWithNonUhfCrossLink.instance();
    }
  }
  
  private ThreeUCubeSatWithNonUhfCrossLink() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ThreeUCubeSatWithNonUhfCrossLink instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ThreeUCubeSatWithNonUhfCrossLink.Matcher instantiate(final ViatraQueryEngine engine) {
    return ThreeUCubeSatWithNonUhfCrossLink.Matcher.on(engine);
  }
  
  @Override
  public ThreeUCubeSatWithNonUhfCrossLink.Matcher instantiate() {
    return ThreeUCubeSatWithNonUhfCrossLink.Matcher.create();
  }
  
  @Override
  public ThreeUCubeSatWithNonUhfCrossLink.Match newEmptyMatch() {
    return ThreeUCubeSatWithNonUhfCrossLink.Match.newEmptyMatch();
  }
  
  @Override
  public ThreeUCubeSatWithNonUhfCrossLink.Match newMatch(final Object... parameters) {
    return ThreeUCubeSatWithNonUhfCrossLink.Match.newMatch((satellite.CubeSat3U) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink (visibility: PUBLIC, simpleName: ThreeUCubeSatWithNonUhfCrossLink, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink (visibility: PUBLIC, simpleName: ThreeUCubeSatWithNonUhfCrossLink, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ThreeUCubeSatWithNonUhfCrossLink INSTANCE = new ThreeUCubeSatWithNonUhfCrossLink();
    
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
    private static final ThreeUCubeSatWithNonUhfCrossLink.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Sat = new PParameter("Sat", "satellite.CubeSat3U", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "CubeSat3U")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Sat);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.threeUCubeSatWithNonUhfCrossLink";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Sat");
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
          PVariable var_Sat = body.getOrCreateVariableByName("Sat");
          PVariable var_SourceComm = body.getOrCreateVariableByName("SourceComm");
          PVariable var_TargetComm = body.getOrCreateVariableByName("TargetComm");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CubeSat3U")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Sat, parameter_Sat)
          ));
          // 	CommunicatingElement.commSubsystem(Sat, SourceComm)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommunicatingElement", "commSubsystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          new Equality(body, var__virtual_0_, var_SourceComm);
          // 	neg find commSubsystemBandUhf(SourceComm)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_SourceComm), CommSubsystemBandUhf.instance().getInternalQueryRepresentation());
          // 	CommSubsystem.target(SourceComm, TargetComm)
          new TypeConstraint(body, Tuples.flatTupleOf(var_SourceComm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_SourceComm, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommSubsystem", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          new Equality(body, var__virtual_1_, var_TargetComm);
          // 	CommunicatingElement.commSubsystem(Target, TargetComm)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommunicatingElement", "commSubsystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          new Equality(body, var__virtual_2_, var_TargetComm);
          // 	neg find groundStationNetwork(Target)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_Target), GroundStationNetwork.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Sat")
                              }));
          annotation.addAttribute("message", "3U CubeSats can only cross-link using UHF.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
