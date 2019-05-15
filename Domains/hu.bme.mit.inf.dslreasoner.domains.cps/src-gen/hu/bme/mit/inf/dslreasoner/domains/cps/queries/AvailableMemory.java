/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.TotalMemory;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.MemoryRequirement;
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
import org.eclipse.viatra.query.runtime.matchers.aggregators.sum;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
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
 *         {@literal @}QueryBasedFeature(feature = "availableMemory")
 *         pattern availableMemory(Host : HostInstance, Memory : java Integer) {
 *         	find totalMemory(Host, TotalMemory);
 *         	RequiredMemory == sum find memoryRequirement(Host, _, #_);
 *         	Memory == eval(TotalMemory - RequiredMemory);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class AvailableMemory extends BaseGeneratedEMFQuerySpecification<AvailableMemory.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.availableMemory pattern,
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
    
    private Integer fMemory;
    
    private static List<String> parameterNames = makeImmutableList("Host", "Memory");
    
    private Match(final HostInstance pHost, final Integer pMemory) {
      this.fHost = pHost;
      this.fMemory = pMemory;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Host".equals(parameterName)) return this.fHost;
      if ("Memory".equals(parameterName)) return this.fMemory;
      return null;
    }
    
    public HostInstance getHost() {
      return this.fHost;
    }
    
    public Integer getMemory() {
      return this.fMemory;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Host".equals(parameterName) ) {
          this.fHost = (HostInstance) newValue;
          return true;
      }
      if ("Memory".equals(parameterName) ) {
          this.fMemory = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setHost(final HostInstance pHost) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHost = pHost;
    }
    
    public void setMemory(final Integer pMemory) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMemory = pMemory;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.availableMemory";
    }
    
    @Override
    public List<String> parameterNames() {
      return AvailableMemory.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fHost, fMemory};
    }
    
    @Override
    public AvailableMemory.Match toImmutable() {
      return isMutable() ? newMatch(fHost, fMemory) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Host\"=" + prettyPrintValue(fHost) + ", ");
      result.append("\"Memory\"=" + prettyPrintValue(fMemory));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fHost, fMemory);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AvailableMemory.Match)) {
          AvailableMemory.Match other = (AvailableMemory.Match) obj;
          return Objects.equals(fHost, other.fHost) && Objects.equals(fMemory, other.fMemory);
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
    public AvailableMemory specification() {
      return AvailableMemory.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AvailableMemory.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AvailableMemory.Match newMutableMatch(final HostInstance pHost, final Integer pMemory) {
      return new Mutable(pHost, pMemory);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AvailableMemory.Match newMatch(final HostInstance pHost, final Integer pMemory) {
      return new Immutable(pHost, pMemory);
    }
    
    private static final class Mutable extends AvailableMemory.Match {
      Mutable(final HostInstance pHost, final Integer pMemory) {
        super(pHost, pMemory);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AvailableMemory.Match {
      Immutable(final HostInstance pHost, final Integer pMemory) {
        super(pHost, pMemory);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.availableMemory pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}QueryBasedFeature(feature = "availableMemory")
   * pattern availableMemory(Host : HostInstance, Memory : java Integer) {
   * 	find totalMemory(Host, TotalMemory);
   * 	RequiredMemory == sum find memoryRequirement(Host, _, #_);
   * 	Memory == eval(TotalMemory - RequiredMemory);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see AvailableMemory
   * 
   */
  public static class Matcher extends BaseMatcher<AvailableMemory.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AvailableMemory.Matcher on(final ViatraQueryEngine engine) {
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
    public static AvailableMemory.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_HOST = 0;
    
    private static final int POSITION_MEMORY = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AvailableMemory.Matcher.class);
    
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
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AvailableMemory.Match> getAllMatches(final HostInstance pHost, final Integer pMemory) {
      return rawStreamAllMatches(new Object[]{pHost, pMemory}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AvailableMemory.Match> streamAllMatches(final HostInstance pHost, final Integer pMemory) {
      return rawStreamAllMatches(new Object[]{pHost, pMemory});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AvailableMemory.Match> getOneArbitraryMatch(final HostInstance pHost, final Integer pMemory) {
      return rawGetOneArbitraryMatch(new Object[]{pHost, pMemory});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final HostInstance pHost, final Integer pMemory) {
      return rawHasMatch(new Object[]{pHost, pMemory});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final HostInstance pHost, final Integer pMemory) {
      return rawCountMatches(new Object[]{pHost, pMemory});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final HostInstance pHost, final Integer pMemory, final Consumer<? super AvailableMemory.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pHost, pMemory}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param pMemory the fixed value of pattern parameter Memory, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AvailableMemory.Match newMatch(final HostInstance pHost, final Integer pMemory) {
      return AvailableMemory.Match.newMatch(pHost, pMemory);
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
    public Stream<HostInstance> streamAllValuesOfHost(final AvailableMemory.Match partialMatch) {
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
    public Stream<HostInstance> streamAllValuesOfHost(final Integer pMemory) {
      return rawStreamAllValuesOfHost(new Object[]{null, pMemory});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final AvailableMemory.Match partialMatch) {
      return rawStreamAllValuesOfHost(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost(final Integer pMemory) {
      return rawStreamAllValuesOfHost(new Object[]{null, pMemory}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Memory.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOfMemory(final Object[] parameters) {
      return rawStreamAllValues(POSITION_MEMORY, parameters).map(Integer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Memory.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfMemory() {
      return rawStreamAllValuesOfMemory(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Memory.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfMemory() {
      return rawStreamAllValuesOfMemory(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Memory.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfMemory(final AvailableMemory.Match partialMatch) {
      return rawStreamAllValuesOfMemory(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Memory.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfMemory(final HostInstance pHost) {
      return rawStreamAllValuesOfMemory(new Object[]{pHost, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Memory.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfMemory(final AvailableMemory.Match partialMatch) {
      return rawStreamAllValuesOfMemory(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Memory.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfMemory(final HostInstance pHost) {
      return rawStreamAllValuesOfMemory(new Object[]{pHost, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected AvailableMemory.Match tupleToMatch(final Tuple t) {
      try {
          return AvailableMemory.Match.newMatch((HostInstance) t.get(POSITION_HOST), (Integer) t.get(POSITION_MEMORY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AvailableMemory.Match arrayToMatch(final Object[] match) {
      try {
          return AvailableMemory.Match.newMatch((HostInstance) match[POSITION_HOST], (Integer) match[POSITION_MEMORY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AvailableMemory.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AvailableMemory.Match.newMutableMatch((HostInstance) match[POSITION_HOST], (Integer) match[POSITION_MEMORY]);
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
    public static IQuerySpecification<AvailableMemory.Matcher> querySpecification() {
      return AvailableMemory.instance();
    }
  }
  
  private AvailableMemory() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AvailableMemory instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AvailableMemory.Matcher instantiate(final ViatraQueryEngine engine) {
    return AvailableMemory.Matcher.on(engine);
  }
  
  @Override
  public AvailableMemory.Matcher instantiate() {
    return AvailableMemory.Matcher.create();
  }
  
  @Override
  public AvailableMemory.Match newEmptyMatch() {
    return AvailableMemory.Match.newEmptyMatch();
  }
  
  @Override
  public AvailableMemory.Match newMatch(final Object... parameters) {
    return AvailableMemory.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AvailableMemory (visibility: PUBLIC, simpleName: AvailableMemory, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AvailableMemory, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AvailableMemory (visibility: PUBLIC, simpleName: AvailableMemory, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.AvailableMemory, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AvailableMemory INSTANCE = new AvailableMemory();
    
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
    private static final AvailableMemory.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Host = new PParameter("Host", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Memory = new PParameter("Memory", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Host, parameter_Memory);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.availableMemory";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Host","Memory");
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
          PVariable var_Memory = body.getOrCreateVariableByName("Memory");
          PVariable var_TotalMemory = body.getOrCreateVariableByName("TotalMemory");
          PVariable var_RequiredMemory = body.getOrCreateVariableByName("RequiredMemory");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Memory), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Host, parameter_Host),
             new ExportedParameter(body, var_Memory, parameter_Memory)
          ));
          // 	find totalMemory(Host, TotalMemory)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Host, var_TotalMemory), TotalMemory.instance().getInternalQueryRepresentation());
          // 	RequiredMemory == sum find memoryRequirement(Host, _, #_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Integer.class), body, Tuples.flatTupleOf(var_Host, var___0_, var___1_), MemoryRequirement.instance().getInternalQueryRepresentation(), var__virtual_0_, 2);
          new Equality(body, var_RequiredMemory, var__virtual_0_);
          // 	Memory == eval(TotalMemory - RequiredMemory)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern availableMemory";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("RequiredMemory", "TotalMemory");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer RequiredMemory = (Integer) provider.getValue("RequiredMemory");
                  Integer TotalMemory = (Integer) provider.getValue("TotalMemory");
                  return evaluateExpression_1_1(RequiredMemory, TotalMemory);
              }
          },  var__virtual_1_ ); 
          new Equality(body, var_Memory, var__virtual_1_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("QueryBasedFeature");
          annotation.addAttribute("feature", "availableMemory");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1(final Integer RequiredMemory, final Integer TotalMemory) {
    return ((TotalMemory).intValue() - (RequiredMemory).intValue());
  }
}
