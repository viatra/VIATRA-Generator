/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import satellite.Spacecraft;
import satellite.SpacecraftKind;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}QueryBasedFeature(feature = "kind")
 *         pattern spacecraftOfKind(Spacecraft : Spacecraft, Kind : SpacecraftKind) {
 *         	CubeSat3U(Spacecraft);
 *         	Kind == SpacecraftKind::CubeSat3U;
 *         } or {
 *         	CubeSat6U(Spacecraft);
 *         	Kind == SpacecraftKind::CubeSat6U;
 *         } or {
 *         	SmallSat(Spacecraft);
 *         	Kind == SpacecraftKind::SmallSat;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SpacecraftOfKind extends BaseGeneratedEMFQuerySpecification<SpacecraftOfKind.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.spacecraftOfKind pattern,
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
    
    private SpacecraftKind fKind;
    
    private static List<String> parameterNames = makeImmutableList("Spacecraft", "Kind");
    
    private Match(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      this.fSpacecraft = pSpacecraft;
      this.fKind = pKind;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Spacecraft".equals(parameterName)) return this.fSpacecraft;
      if ("Kind".equals(parameterName)) return this.fKind;
      return null;
    }
    
    public Spacecraft getSpacecraft() {
      return this.fSpacecraft;
    }
    
    public SpacecraftKind getKind() {
      return this.fKind;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Spacecraft".equals(parameterName) ) {
          this.fSpacecraft = (Spacecraft) newValue;
          return true;
      }
      if ("Kind".equals(parameterName) ) {
          this.fKind = (SpacecraftKind) newValue;
          return true;
      }
      return false;
    }
    
    public void setSpacecraft(final Spacecraft pSpacecraft) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSpacecraft = pSpacecraft;
    }
    
    public void setKind(final SpacecraftKind pKind) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fKind = pKind;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.spacecraftOfKind";
    }
    
    @Override
    public List<String> parameterNames() {
      return SpacecraftOfKind.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSpacecraft, fKind};
    }
    
    @Override
    public SpacecraftOfKind.Match toImmutable() {
      return isMutable() ? newMatch(fSpacecraft, fKind) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Spacecraft\"=" + prettyPrintValue(fSpacecraft) + ", ");
      result.append("\"Kind\"=" + prettyPrintValue(fKind));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fSpacecraft, fKind);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SpacecraftOfKind.Match)) {
          SpacecraftOfKind.Match other = (SpacecraftOfKind.Match) obj;
          return Objects.equals(fSpacecraft, other.fSpacecraft) && Objects.equals(fKind, other.fKind);
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
    public SpacecraftOfKind specification() {
      return SpacecraftOfKind.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SpacecraftOfKind.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SpacecraftOfKind.Match newMutableMatch(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return new Mutable(pSpacecraft, pKind);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SpacecraftOfKind.Match newMatch(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return new Immutable(pSpacecraft, pKind);
    }
    
    private static final class Mutable extends SpacecraftOfKind.Match {
      Mutable(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
        super(pSpacecraft, pKind);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SpacecraftOfKind.Match {
      Immutable(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
        super(pSpacecraft, pKind);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.spacecraftOfKind pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}QueryBasedFeature(feature = "kind")
   * pattern spacecraftOfKind(Spacecraft : Spacecraft, Kind : SpacecraftKind) {
   * 	CubeSat3U(Spacecraft);
   * 	Kind == SpacecraftKind::CubeSat3U;
   * } or {
   * 	CubeSat6U(Spacecraft);
   * 	Kind == SpacecraftKind::CubeSat6U;
   * } or {
   * 	SmallSat(Spacecraft);
   * 	Kind == SpacecraftKind::SmallSat;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SpacecraftOfKind
   * 
   */
  public static class Matcher extends BaseMatcher<SpacecraftOfKind.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SpacecraftOfKind.Matcher on(final ViatraQueryEngine engine) {
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
    public static SpacecraftOfKind.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SPACECRAFT = 0;
    
    private static final int POSITION_KIND = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SpacecraftOfKind.Matcher.class);
    
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
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SpacecraftOfKind.Match> getAllMatches(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return rawStreamAllMatches(new Object[]{pSpacecraft, pKind}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SpacecraftOfKind.Match> streamAllMatches(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return rawStreamAllMatches(new Object[]{pSpacecraft, pKind});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SpacecraftOfKind.Match> getOneArbitraryMatch(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return rawGetOneArbitraryMatch(new Object[]{pSpacecraft, pKind});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return rawHasMatch(new Object[]{pSpacecraft, pKind});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return rawCountMatches(new Object[]{pSpacecraft, pKind});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Spacecraft pSpacecraft, final SpacecraftKind pKind, final Consumer<? super SpacecraftOfKind.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSpacecraft, pKind}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSpacecraft the fixed value of pattern parameter Spacecraft, or null if not bound.
     * @param pKind the fixed value of pattern parameter Kind, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SpacecraftOfKind.Match newMatch(final Spacecraft pSpacecraft, final SpacecraftKind pKind) {
      return SpacecraftOfKind.Match.newMatch(pSpacecraft, pKind);
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
    
    /**
     * Retrieve the set of values that occur in matches for Spacecraft.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Spacecraft> streamAllValuesOfSpacecraft(final SpacecraftOfKind.Match partialMatch) {
      return rawStreamAllValuesOfSpacecraft(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Spacecraft.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Spacecraft> streamAllValuesOfSpacecraft(final SpacecraftKind pKind) {
      return rawStreamAllValuesOfSpacecraft(new Object[]{null, pKind});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Spacecraft.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Spacecraft> getAllValuesOfSpacecraft(final SpacecraftOfKind.Match partialMatch) {
      return rawStreamAllValuesOfSpacecraft(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Spacecraft.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Spacecraft> getAllValuesOfSpacecraft(final SpacecraftKind pKind) {
      return rawStreamAllValuesOfSpacecraft(new Object[]{null, pKind}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Kind.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<SpacecraftKind> rawStreamAllValuesOfKind(final Object[] parameters) {
      return rawStreamAllValues(POSITION_KIND, parameters).map(SpacecraftKind.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Kind.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SpacecraftKind> getAllValuesOfKind() {
      return rawStreamAllValuesOfKind(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Kind.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<SpacecraftKind> streamAllValuesOfKind() {
      return rawStreamAllValuesOfKind(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Kind.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SpacecraftKind> streamAllValuesOfKind(final SpacecraftOfKind.Match partialMatch) {
      return rawStreamAllValuesOfKind(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Kind.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<SpacecraftKind> streamAllValuesOfKind(final Spacecraft pSpacecraft) {
      return rawStreamAllValuesOfKind(new Object[]{pSpacecraft, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Kind.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SpacecraftKind> getAllValuesOfKind(final SpacecraftOfKind.Match partialMatch) {
      return rawStreamAllValuesOfKind(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Kind.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<SpacecraftKind> getAllValuesOfKind(final Spacecraft pSpacecraft) {
      return rawStreamAllValuesOfKind(new Object[]{pSpacecraft, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SpacecraftOfKind.Match tupleToMatch(final Tuple t) {
      try {
          return SpacecraftOfKind.Match.newMatch((Spacecraft) t.get(POSITION_SPACECRAFT), (SpacecraftKind) t.get(POSITION_KIND));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SpacecraftOfKind.Match arrayToMatch(final Object[] match) {
      try {
          return SpacecraftOfKind.Match.newMatch((Spacecraft) match[POSITION_SPACECRAFT], (SpacecraftKind) match[POSITION_KIND]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SpacecraftOfKind.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SpacecraftOfKind.Match.newMutableMatch((Spacecraft) match[POSITION_SPACECRAFT], (SpacecraftKind) match[POSITION_KIND]);
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
    public static IQuerySpecification<SpacecraftOfKind.Matcher> querySpecification() {
      return SpacecraftOfKind.instance();
    }
  }
  
  private SpacecraftOfKind() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SpacecraftOfKind instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SpacecraftOfKind.Matcher instantiate(final ViatraQueryEngine engine) {
    return SpacecraftOfKind.Matcher.on(engine);
  }
  
  @Override
  public SpacecraftOfKind.Matcher instantiate() {
    return SpacecraftOfKind.Matcher.create();
  }
  
  @Override
  public SpacecraftOfKind.Match newEmptyMatch() {
    return SpacecraftOfKind.Match.newEmptyMatch();
  }
  
  @Override
  public SpacecraftOfKind.Match newMatch(final Object... parameters) {
    return SpacecraftOfKind.Match.newMatch((satellite.Spacecraft) parameters[0], (satellite.SpacecraftKind) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SpacecraftOfKind (visibility: PUBLIC, simpleName: SpacecraftOfKind, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SpacecraftOfKind, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SpacecraftOfKind (visibility: PUBLIC, simpleName: SpacecraftOfKind, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SpacecraftOfKind, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SpacecraftOfKind INSTANCE = new SpacecraftOfKind();
    
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
    private static final SpacecraftOfKind.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Spacecraft = new PParameter("Spacecraft", "satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Kind = new PParameter("Kind", "satellite.SpacecraftKind", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.example.org/satellite", "SpacecraftKind")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Spacecraft, parameter_Kind);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.spacecraftOfKind";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Spacecraft","Kind");
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
          PVariable var_Kind = body.getOrCreateVariableByName("Kind");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Kind), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/satellite", "SpacecraftKind")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_Kind, parameter_Kind)
          ));
          // 	CubeSat3U(Spacecraft)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CubeSat3U")));
          // 	Kind == SpacecraftKind::CubeSat3U
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "SpacecraftKind", "CubeSat3U").getInstance());
          new Equality(body, var_Kind, var__virtual_0_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_Kind = body.getOrCreateVariableByName("Kind");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Kind), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/satellite", "SpacecraftKind")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_Kind, parameter_Kind)
          ));
          // 	CubeSat6U(Spacecraft)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CubeSat6U")));
          // 	Kind == SpacecraftKind::CubeSat6U
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "SpacecraftKind", "CubeSat6U").getInstance());
          new Equality(body, var_Kind, var__virtual_0_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_Kind = body.getOrCreateVariableByName("Kind");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Kind), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/satellite", "SpacecraftKind")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_Kind, parameter_Kind)
          ));
          // 	SmallSat(Spacecraft)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "SmallSat")));
          // 	Kind == SpacecraftKind::SmallSat
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "SpacecraftKind", "SmallSat").getInstance());
          new Equality(body, var_Kind, var__virtual_0_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("QueryBasedFeature");
          annotation.addAttribute("feature", "kind");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
