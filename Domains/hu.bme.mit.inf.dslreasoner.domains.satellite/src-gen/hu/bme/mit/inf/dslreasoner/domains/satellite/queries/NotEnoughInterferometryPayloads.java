/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.AtLeastTwoInterferometryPayloads;
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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import satellite.InterferometryMission;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // At least two spacecraft must have the interferometry payload configured
 *         
 *         {@literal @}Constraint(severity = "error", key = {Mission},
 *         	message = "Interferometry mission needs at least two spacecraft configured with the interferometry payload.")
 *         pattern notEnoughInterferometryPayloads(Mission : InterferometryMission) {
 *         	InterferometryMission(Mission);
 *         	neg find atLeastTwoInterferometryPayloads(Mission);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NotEnoughInterferometryPayloads extends BaseGeneratedEMFQuerySpecification<NotEnoughInterferometryPayloads.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.notEnoughInterferometryPayloads pattern,
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
    private InterferometryMission fMission;
    
    private static List<String> parameterNames = makeImmutableList("Mission");
    
    private Match(final InterferometryMission pMission) {
      this.fMission = pMission;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Mission".equals(parameterName)) return this.fMission;
      return null;
    }
    
    public InterferometryMission getMission() {
      return this.fMission;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Mission".equals(parameterName) ) {
          this.fMission = (InterferometryMission) newValue;
          return true;
      }
      return false;
    }
    
    public void setMission(final InterferometryMission pMission) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMission = pMission;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.notEnoughInterferometryPayloads";
    }
    
    @Override
    public List<String> parameterNames() {
      return NotEnoughInterferometryPayloads.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fMission};
    }
    
    @Override
    public NotEnoughInterferometryPayloads.Match toImmutable() {
      return isMutable() ? newMatch(fMission) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Mission\"=" + prettyPrintValue(fMission));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fMission);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NotEnoughInterferometryPayloads.Match)) {
          NotEnoughInterferometryPayloads.Match other = (NotEnoughInterferometryPayloads.Match) obj;
          return Objects.equals(fMission, other.fMission);
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
    public NotEnoughInterferometryPayloads specification() {
      return NotEnoughInterferometryPayloads.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NotEnoughInterferometryPayloads.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NotEnoughInterferometryPayloads.Match newMutableMatch(final InterferometryMission pMission) {
      return new Mutable(pMission);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NotEnoughInterferometryPayloads.Match newMatch(final InterferometryMission pMission) {
      return new Immutable(pMission);
    }
    
    private static final class Mutable extends NotEnoughInterferometryPayloads.Match {
      Mutable(final InterferometryMission pMission) {
        super(pMission);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NotEnoughInterferometryPayloads.Match {
      Immutable(final InterferometryMission pMission) {
        super(pMission);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.notEnoughInterferometryPayloads pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // At least two spacecraft must have the interferometry payload configured
   * 
   * {@literal @}Constraint(severity = "error", key = {Mission},
   * 	message = "Interferometry mission needs at least two spacecraft configured with the interferometry payload.")
   * pattern notEnoughInterferometryPayloads(Mission : InterferometryMission) {
   * 	InterferometryMission(Mission);
   * 	neg find atLeastTwoInterferometryPayloads(Mission);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NotEnoughInterferometryPayloads
   * 
   */
  public static class Matcher extends BaseMatcher<NotEnoughInterferometryPayloads.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NotEnoughInterferometryPayloads.Matcher on(final ViatraQueryEngine engine) {
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
    public static NotEnoughInterferometryPayloads.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_MISSION = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NotEnoughInterferometryPayloads.Matcher.class);
    
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
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NotEnoughInterferometryPayloads.Match> getAllMatches(final InterferometryMission pMission) {
      return rawStreamAllMatches(new Object[]{pMission}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NotEnoughInterferometryPayloads.Match> streamAllMatches(final InterferometryMission pMission) {
      return rawStreamAllMatches(new Object[]{pMission});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NotEnoughInterferometryPayloads.Match> getOneArbitraryMatch(final InterferometryMission pMission) {
      return rawGetOneArbitraryMatch(new Object[]{pMission});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final InterferometryMission pMission) {
      return rawHasMatch(new Object[]{pMission});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final InterferometryMission pMission) {
      return rawCountMatches(new Object[]{pMission});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final InterferometryMission pMission, final Consumer<? super NotEnoughInterferometryPayloads.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pMission}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pMission the fixed value of pattern parameter Mission, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NotEnoughInterferometryPayloads.Match newMatch(final InterferometryMission pMission) {
      return NotEnoughInterferometryPayloads.Match.newMatch(pMission);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Mission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<InterferometryMission> rawStreamAllValuesOfMission(final Object[] parameters) {
      return rawStreamAllValues(POSITION_MISSION, parameters).map(InterferometryMission.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Mission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InterferometryMission> getAllValuesOfMission() {
      return rawStreamAllValuesOfMission(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Mission.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<InterferometryMission> streamAllValuesOfMission() {
      return rawStreamAllValuesOfMission(emptyArray());
    }
    
    @Override
    protected NotEnoughInterferometryPayloads.Match tupleToMatch(final Tuple t) {
      try {
          return NotEnoughInterferometryPayloads.Match.newMatch((InterferometryMission) t.get(POSITION_MISSION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NotEnoughInterferometryPayloads.Match arrayToMatch(final Object[] match) {
      try {
          return NotEnoughInterferometryPayloads.Match.newMatch((InterferometryMission) match[POSITION_MISSION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NotEnoughInterferometryPayloads.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NotEnoughInterferometryPayloads.Match.newMutableMatch((InterferometryMission) match[POSITION_MISSION]);
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
    public static IQuerySpecification<NotEnoughInterferometryPayloads.Matcher> querySpecification() {
      return NotEnoughInterferometryPayloads.instance();
    }
  }
  
  private NotEnoughInterferometryPayloads() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NotEnoughInterferometryPayloads instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotEnoughInterferometryPayloads.Matcher instantiate(final ViatraQueryEngine engine) {
    return NotEnoughInterferometryPayloads.Matcher.on(engine);
  }
  
  @Override
  public NotEnoughInterferometryPayloads.Matcher instantiate() {
    return NotEnoughInterferometryPayloads.Matcher.create();
  }
  
  @Override
  public NotEnoughInterferometryPayloads.Match newEmptyMatch() {
    return NotEnoughInterferometryPayloads.Match.newEmptyMatch();
  }
  
  @Override
  public NotEnoughInterferometryPayloads.Match newMatch(final Object... parameters) {
    return NotEnoughInterferometryPayloads.Match.newMatch((satellite.InterferometryMission) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads (visibility: PUBLIC, simpleName: NotEnoughInterferometryPayloads, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads (visibility: PUBLIC, simpleName: NotEnoughInterferometryPayloads, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NotEnoughInterferometryPayloads INSTANCE = new NotEnoughInterferometryPayloads();
    
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
    private static final NotEnoughInterferometryPayloads.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Mission = new PParameter("Mission", "satellite.InterferometryMission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "InterferometryMission")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Mission);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.notEnoughInterferometryPayloads";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Mission");
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
          PVariable var_Mission = body.getOrCreateVariableByName("Mission");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Mission, parameter_Mission)
          ));
          // 	InterferometryMission(Mission)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          // 	neg find atLeastTwoInterferometryPayloads(Mission)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_Mission), AtLeastTwoInterferometryPayloads.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Mission")
                              }));
          annotation.addAttribute("message", "Interferometry mission needs at least two spacecraft configured with the interferometry payload.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
