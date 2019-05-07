/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import satellite.Spacecraft;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // Only a Small Satellite can be configured with a Ka-band communication system
 *         
 *         {@literal @}Constraint(severity = "error", key = {Spacecraft},
 *         	message = "Only a Small Satellite can be configured with a Ka-band communication system.")
 *         pattern cubeSatWithKaAntenna(Spacecraft : Spacecraft) {
 *         	CommunicatingElement.commSubsystem.band(Spacecraft, TransceiverBand::Ka);
 *         	neg find smallSat(Spacecraft);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CubeSatWithKaAntenna extends BaseGeneratedEMFQuerySpecification<CubeSatWithKaAntenna.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.cubeSatWithKaAntenna pattern,
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
    private Spacecraft fSpacecraft;
    
    private static List<String> parameterNames = makeImmutableList("Spacecraft");
    
    private Match(final Spacecraft pSpacecraft) {
      this.fSpacecraft = pSpacecraft;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Spacecraft".equals(parameterName)) return this.fSpacecraft;
      return null;
    }
    
    public Spacecraft getSpacecraft() {
      return this.fSpacecraft;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Spacecraft".equals(parameterName) ) {
          this.fSpacecraft = (Spacecraft) newValue;
          return true;
      }
      return false;
    }
    
    public void setSpacecraft(final Spacecraft pSpacecraft) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSpacecraft = pSpacecraft;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.cubeSatWithKaAntenna";
    }
    
    @Override
    public List<String> parameterNames() {
      return CubeSatWithKaAntenna.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSpacecraft};
    }
    
    @Override
    public CubeSatWithKaAntenna.Match toImmutable() {
      return isMutable() ? newMatch(fSpacecraft) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Spacecraft\"=" + prettyPrintValue(fSpacecraft));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fSpacecraft);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CubeSatWithKaAntenna.Match)) {
          CubeSatWithKaAntenna.Match other = (CubeSatWithKaAntenna.Match) obj;
          return Objects.equals(fSpacecraft, other.fSpacecraft);
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
    public CubeSatWithKaAntenna specification() {
      return CubeSatWithKaAntenna.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CubeSatWithKaAntenna.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CubeSatWithKaAntenna.Match newMutableMatch(final Spacecraft pSpacecraft) {
      return new Mutable(pSpacecraft);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CubeSatWithKaAntenna.Match newMatch(final Spacecraft pSpacecraft) {
      return new Immutable(pSpacecraft);
    }
    
    private static final class Mutable extends CubeSatWithKaAntenna.Match {
      Mutable(final Spacecraft pSpacecraft) {
        super(pSpacecraft);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CubeSatWithKaAntenna.Match {
      Immutable(final Spacecraft pSpacecraft) {
        super(pSpacecraft);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.cubeSatWithKaAntenna pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Only a Small Satellite can be configured with a Ka-band communication system
   * 
   * {@literal @}Constraint(severity = "error", key = {Spacecraft},
   * 	message = "Only a Small Satellite can be configured with a Ka-band communication system.")
   * pattern cubeSatWithKaAntenna(Spacecraft : Spacecraft) {
   * 	CommunicatingElement.commSubsystem.band(Spacecraft, TransceiverBand::Ka);
   * 	neg find smallSat(Spacecraft);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CubeSatWithKaAntenna
   * 
   */
  public static class Matcher extends BaseMatcher<CubeSatWithKaAntenna.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CubeSatWithKaAntenna.Matcher on(final ViatraQueryEngine engine) {
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
    public static CubeSatWithKaAntenna.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SPACECRAFT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CubeSatWithKaAntenna.Matcher.class);
    
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
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CubeSatWithKaAntenna.Match> getAllMatches(final Spacecraft pSpacecraft) {
      return rawStreamAllMatches(new Object[]{pSpacecraft}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CubeSatWithKaAntenna.Match> streamAllMatches(final Spacecraft pSpacecraft) {
      return rawStreamAllMatches(new Object[]{pSpacecraft});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CubeSatWithKaAntenna.Match> getOneArbitraryMatch(final Spacecraft pSpacecraft) {
      return rawGetOneArbitraryMatch(new Object[]{pSpacecraft});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Spacecraft pSpacecraft) {
      return rawHasMatch(new Object[]{pSpacecraft});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Spacecraft pSpacecraft) {
      return rawCountMatches(new Object[]{pSpacecraft});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Spacecraft pSpacecraft, final Consumer<? super CubeSatWithKaAntenna.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSpacecraft}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CubeSatWithKaAntenna.Match newMatch(final Spacecraft pSpacecraft) {
      return CubeSatWithKaAntenna.Match.newMatch(pSpacecraft);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Spacecraft.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Spacecraft> rawStreamAllValuesOfSpacecraft(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SPACECRAFT, parameters).map(Spacecraft.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Spacecraft.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Spacecraft> getAllValuesOfSpacecraft() {
      return rawStreamAllValuesOfSpacecraft(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Spacecraft.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Spacecraft> streamAllValuesOfSpacecraft() {
      return rawStreamAllValuesOfSpacecraft(emptyArray());
    }
    
    @Override
    protected CubeSatWithKaAntenna.Match tupleToMatch(final Tuple t) {
      try {
          return CubeSatWithKaAntenna.Match.newMatch((Spacecraft) t.get(POSITION_SPACECRAFT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CubeSatWithKaAntenna.Match arrayToMatch(final Object[] match) {
      try {
          return CubeSatWithKaAntenna.Match.newMatch((Spacecraft) match[POSITION_SPACECRAFT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CubeSatWithKaAntenna.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CubeSatWithKaAntenna.Match.newMutableMatch((Spacecraft) match[POSITION_SPACECRAFT]);
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
    public static IQuerySpecification<CubeSatWithKaAntenna.Matcher> querySpecification() {
      return CubeSatWithKaAntenna.instance();
    }
  }
  
  private CubeSatWithKaAntenna() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CubeSatWithKaAntenna instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CubeSatWithKaAntenna.Matcher instantiate(final ViatraQueryEngine engine) {
    return CubeSatWithKaAntenna.Matcher.on(engine);
  }
  
  @Override
  public CubeSatWithKaAntenna.Matcher instantiate() {
    return CubeSatWithKaAntenna.Matcher.create();
  }
  
  @Override
  public CubeSatWithKaAntenna.Match newEmptyMatch() {
    return CubeSatWithKaAntenna.Match.newEmptyMatch();
  }
  
  @Override
  public CubeSatWithKaAntenna.Match newMatch(final Object... parameters) {
    return CubeSatWithKaAntenna.Match.newMatch((satellite.Spacecraft) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna (visibility: PUBLIC, simpleName: CubeSatWithKaAntenna, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna (visibility: PUBLIC, simpleName: CubeSatWithKaAntenna, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CubeSatWithKaAntenna INSTANCE = new CubeSatWithKaAntenna();
    
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
    private static final CubeSatWithKaAntenna.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Spacecraft = new PParameter("Spacecraft", "satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Spacecraft);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.cubeSatWithKaAntenna";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Spacecraft");
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
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft)
          ));
          // 	CommunicatingElement.commSubsystem.band(Spacecraft, TransceiverBand::Ka)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "TransceiverBand", "Ka").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommunicatingElement", "commSubsystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommSubsystem", "band")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/satellite", "TransceiverBand")));
          new Equality(body, var__virtual_2_, var__virtual_0_);
          // 	neg find smallSat(Spacecraft)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_Spacecraft), SmallSat.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Spacecraft")
                              }));
          annotation.addAttribute("message", "Only a Small Satellite can be configured with a Ka-band communication system.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
