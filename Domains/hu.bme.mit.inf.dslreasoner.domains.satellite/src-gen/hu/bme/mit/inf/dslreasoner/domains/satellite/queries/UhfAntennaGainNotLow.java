/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemGainLow;
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
import satellite.CommSubsystem;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // UHF-band transmitters may only be combined with a low gain antenna
 *         
 *         {@literal @}Constraint(severity = "error", key = {Comm},
 *         	message = "UHF transceiver must be combined with a low gain antenna.")
 *         pattern uhfAntennaGainNotLow(Comm : CommSubsystem) {
 *         	CommSubsystem.band(Comm, TransceiverBand::UHF);
 *         	// VIATRA will fail to infer a type constraint for the virtual variable introduced
 *         	// when an enum literal appears in a negative pattern call, so we use a helper pattern
 *         	// instead of neg find commSubsystemGain(Comm, AntennaGain::LOW);
 *         	neg find commSubsystemGainLow(Comm);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class UhfAntennaGainNotLow extends BaseGeneratedEMFQuerySpecification<UhfAntennaGainNotLow.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.uhfAntennaGainNotLow pattern,
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
    private CommSubsystem fComm;
    
    private static List<String> parameterNames = makeImmutableList("Comm");
    
    private Match(final CommSubsystem pComm) {
      this.fComm = pComm;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Comm".equals(parameterName)) return this.fComm;
      return null;
    }
    
    public CommSubsystem getComm() {
      return this.fComm;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Comm".equals(parameterName) ) {
          this.fComm = (CommSubsystem) newValue;
          return true;
      }
      return false;
    }
    
    public void setComm(final CommSubsystem pComm) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fComm = pComm;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.uhfAntennaGainNotLow";
    }
    
    @Override
    public List<String> parameterNames() {
      return UhfAntennaGainNotLow.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fComm};
    }
    
    @Override
    public UhfAntennaGainNotLow.Match toImmutable() {
      return isMutable() ? newMatch(fComm) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Comm\"=" + prettyPrintValue(fComm));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fComm);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof UhfAntennaGainNotLow.Match)) {
          UhfAntennaGainNotLow.Match other = (UhfAntennaGainNotLow.Match) obj;
          return Objects.equals(fComm, other.fComm);
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
    public UhfAntennaGainNotLow specification() {
      return UhfAntennaGainNotLow.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static UhfAntennaGainNotLow.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static UhfAntennaGainNotLow.Match newMutableMatch(final CommSubsystem pComm) {
      return new Mutable(pComm);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static UhfAntennaGainNotLow.Match newMatch(final CommSubsystem pComm) {
      return new Immutable(pComm);
    }
    
    private static final class Mutable extends UhfAntennaGainNotLow.Match {
      Mutable(final CommSubsystem pComm) {
        super(pComm);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends UhfAntennaGainNotLow.Match {
      Immutable(final CommSubsystem pComm) {
        super(pComm);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.uhfAntennaGainNotLow pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // UHF-band transmitters may only be combined with a low gain antenna
   * 
   * {@literal @}Constraint(severity = "error", key = {Comm},
   * 	message = "UHF transceiver must be combined with a low gain antenna.")
   * pattern uhfAntennaGainNotLow(Comm : CommSubsystem) {
   * 	CommSubsystem.band(Comm, TransceiverBand::UHF);
   * 	// VIATRA will fail to infer a type constraint for the virtual variable introduced
   * 	// when an enum literal appears in a negative pattern call, so we use a helper pattern
   * 	// instead of neg find commSubsystemGain(Comm, AntennaGain::LOW);
   * 	neg find commSubsystemGainLow(Comm);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see UhfAntennaGainNotLow
   * 
   */
  public static class Matcher extends BaseMatcher<UhfAntennaGainNotLow.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static UhfAntennaGainNotLow.Matcher on(final ViatraQueryEngine engine) {
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
    public static UhfAntennaGainNotLow.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_COMM = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(UhfAntennaGainNotLow.Matcher.class);
    
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
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<UhfAntennaGainNotLow.Match> getAllMatches(final CommSubsystem pComm) {
      return rawStreamAllMatches(new Object[]{pComm}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<UhfAntennaGainNotLow.Match> streamAllMatches(final CommSubsystem pComm) {
      return rawStreamAllMatches(new Object[]{pComm});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<UhfAntennaGainNotLow.Match> getOneArbitraryMatch(final CommSubsystem pComm) {
      return rawGetOneArbitraryMatch(new Object[]{pComm});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final CommSubsystem pComm) {
      return rawHasMatch(new Object[]{pComm});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final CommSubsystem pComm) {
      return rawCountMatches(new Object[]{pComm});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final CommSubsystem pComm, final Consumer<? super UhfAntennaGainNotLow.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pComm}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pComm the fixed value of pattern parameter Comm, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public UhfAntennaGainNotLow.Match newMatch(final CommSubsystem pComm) {
      return UhfAntennaGainNotLow.Match.newMatch(pComm);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Comm.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<CommSubsystem> rawStreamAllValuesOfComm(final Object[] parameters) {
      return rawStreamAllValues(POSITION_COMM, parameters).map(CommSubsystem.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Comm.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CommSubsystem> getAllValuesOfComm() {
      return rawStreamAllValuesOfComm(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Comm.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<CommSubsystem> streamAllValuesOfComm() {
      return rawStreamAllValuesOfComm(emptyArray());
    }
    
    @Override
    protected UhfAntennaGainNotLow.Match tupleToMatch(final Tuple t) {
      try {
          return UhfAntennaGainNotLow.Match.newMatch((CommSubsystem) t.get(POSITION_COMM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UhfAntennaGainNotLow.Match arrayToMatch(final Object[] match) {
      try {
          return UhfAntennaGainNotLow.Match.newMatch((CommSubsystem) match[POSITION_COMM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected UhfAntennaGainNotLow.Match arrayToMatchMutable(final Object[] match) {
      try {
          return UhfAntennaGainNotLow.Match.newMutableMatch((CommSubsystem) match[POSITION_COMM]);
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
    public static IQuerySpecification<UhfAntennaGainNotLow.Matcher> querySpecification() {
      return UhfAntennaGainNotLow.instance();
    }
  }
  
  private UhfAntennaGainNotLow() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static UhfAntennaGainNotLow instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected UhfAntennaGainNotLow.Matcher instantiate(final ViatraQueryEngine engine) {
    return UhfAntennaGainNotLow.Matcher.on(engine);
  }
  
  @Override
  public UhfAntennaGainNotLow.Matcher instantiate() {
    return UhfAntennaGainNotLow.Matcher.create();
  }
  
  @Override
  public UhfAntennaGainNotLow.Match newEmptyMatch() {
    return UhfAntennaGainNotLow.Match.newEmptyMatch();
  }
  
  @Override
  public UhfAntennaGainNotLow.Match newMatch(final Object... parameters) {
    return UhfAntennaGainNotLow.Match.newMatch((satellite.CommSubsystem) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.UhfAntennaGainNotLow (visibility: PUBLIC, simpleName: UhfAntennaGainNotLow, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.UhfAntennaGainNotLow, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.UhfAntennaGainNotLow (visibility: PUBLIC, simpleName: UhfAntennaGainNotLow, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.UhfAntennaGainNotLow, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final UhfAntennaGainNotLow INSTANCE = new UhfAntennaGainNotLow();
    
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
    private static final UhfAntennaGainNotLow.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Comm = new PParameter("Comm", "satellite.CommSubsystem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "CommSubsystem")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Comm);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.uhfAntennaGainNotLow";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Comm");
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
          PVariable var_Comm = body.getOrCreateVariableByName("Comm");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Comm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Comm, parameter_Comm)
          ));
          // 	CommSubsystem.band(Comm, TransceiverBand::UHF)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "TransceiverBand", "UHF").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_Comm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Comm, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommSubsystem", "band")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/satellite", "TransceiverBand")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          // 	// VIATRA will fail to infer a type constraint for the virtual variable introduced	// when an enum literal appears in a negative pattern call, so we use a helper pattern	// instead of neg find commSubsystemGain(Comm, AntennaGain::LOW);	neg find commSubsystemGainLow(Comm)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_Comm), CommSubsystemGainLow.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Comm")
                              }));
          annotation.addAttribute("message", "UHF transceiver must be combined with a low gain antenna.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
