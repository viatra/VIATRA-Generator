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
 *         pattern smallSat(Sat : SmallSat) {
 *         	SmallSat(Sat);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SmallSat extends BaseGeneratedEMFQuerySpecification<SmallSat.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.smallSat pattern,
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
    private satellite.SmallSat fSat;
    
    private static List<String> parameterNames = makeImmutableList("Sat");
    
    private Match(final satellite.SmallSat pSat) {
      this.fSat = pSat;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Sat".equals(parameterName)) return this.fSat;
      return null;
    }
    
    public satellite.SmallSat getSat() {
      return this.fSat;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Sat".equals(parameterName) ) {
          this.fSat = (satellite.SmallSat) newValue;
          return true;
      }
      return false;
    }
    
    public void setSat(final satellite.SmallSat pSat) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSat = pSat;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.smallSat";
    }
    
    @Override
    public List<String> parameterNames() {
      return SmallSat.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSat};
    }
    
    @Override
    public SmallSat.Match toImmutable() {
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
      if ((obj instanceof SmallSat.Match)) {
          SmallSat.Match other = (SmallSat.Match) obj;
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
    public SmallSat specification() {
      return SmallSat.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SmallSat.Match newEmptyMatch() {
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
    public static SmallSat.Match newMutableMatch(final satellite.SmallSat pSat) {
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
    public static SmallSat.Match newMatch(final satellite.SmallSat pSat) {
      return new Immutable(pSat);
    }
    
    private static final class Mutable extends SmallSat.Match {
      Mutable(final satellite.SmallSat pSat) {
        super(pSat);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SmallSat.Match {
      Immutable(final satellite.SmallSat pSat) {
        super(pSat);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.smallSat pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern smallSat(Sat : SmallSat) {
   * 	SmallSat(Sat);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SmallSat
   * 
   */
  public static class Matcher extends BaseMatcher<SmallSat.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SmallSat.Matcher on(final ViatraQueryEngine engine) {
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
    public static SmallSat.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_SAT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SmallSat.Matcher.class);
    
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
    public Collection<SmallSat.Match> getAllMatches(final satellite.SmallSat pSat) {
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
    public Stream<SmallSat.Match> streamAllMatches(final satellite.SmallSat pSat) {
      return rawStreamAllMatches(new Object[]{pSat});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SmallSat.Match> getOneArbitraryMatch(final satellite.SmallSat pSat) {
      return rawGetOneArbitraryMatch(new Object[]{pSat});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final satellite.SmallSat pSat) {
      return rawHasMatch(new Object[]{pSat});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSat the fixed value of pattern parameter Sat, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final satellite.SmallSat pSat) {
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
    public boolean forOneArbitraryMatch(final satellite.SmallSat pSat, final Consumer<? super SmallSat.Match> processor) {
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
    public SmallSat.Match newMatch(final satellite.SmallSat pSat) {
      return SmallSat.Match.newMatch(pSat);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Sat.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<satellite.SmallSat> rawStreamAllValuesOfSat(final Object[] parameters) {
      return rawStreamAllValues(POSITION_SAT, parameters).map(satellite.SmallSat.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Sat.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<satellite.SmallSat> getAllValuesOfSat() {
      return rawStreamAllValuesOfSat(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Sat.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<satellite.SmallSat> streamAllValuesOfSat() {
      return rawStreamAllValuesOfSat(emptyArray());
    }
    
    @Override
    protected SmallSat.Match tupleToMatch(final Tuple t) {
      try {
          return SmallSat.Match.newMatch((satellite.SmallSat) t.get(POSITION_SAT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SmallSat.Match arrayToMatch(final Object[] match) {
      try {
          return SmallSat.Match.newMatch((satellite.SmallSat) match[POSITION_SAT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SmallSat.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SmallSat.Match.newMutableMatch((satellite.SmallSat) match[POSITION_SAT]);
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
    public static IQuerySpecification<SmallSat.Matcher> querySpecification() {
      return SmallSat.instance();
    }
  }
  
  private SmallSat() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SmallSat instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SmallSat.Matcher instantiate(final ViatraQueryEngine engine) {
    return SmallSat.Matcher.on(engine);
  }
  
  @Override
  public SmallSat.Matcher instantiate() {
    return SmallSat.Matcher.create();
  }
  
  @Override
  public SmallSat.Match newEmptyMatch() {
    return SmallSat.Match.newEmptyMatch();
  }
  
  @Override
  public SmallSat.Match newMatch(final Object... parameters) {
    return SmallSat.Match.newMatch((satellite.SmallSat) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat (visibility: PUBLIC, simpleName: SmallSat, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat (visibility: PUBLIC, simpleName: SmallSat, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SmallSat INSTANCE = new SmallSat();
    
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
    private static final SmallSat.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Sat = new PParameter("Sat", "satellite.SmallSat", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "SmallSat")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Sat);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.smallSat";
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "SmallSat")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Sat, parameter_Sat)
          ));
          // 	SmallSat(Sat)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "SmallSat")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
