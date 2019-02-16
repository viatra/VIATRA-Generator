/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.Transition;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
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
 *         pattern hasMultipleOutgoingTrainsition(v : Synchronization) {
 *         	find transition(_, v, trg1);
 *         	find transition(_, v, trg2);
 *         	trg1 != trg2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class HasMultipleOutgoingTrainsition extends BaseGeneratedEMFQuerySpecification<HasMultipleOutgoingTrainsition.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleOutgoingTrainsition pattern,
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
    private Synchronization fV;
    
    private static List<String> parameterNames = makeImmutableList("v");
    
    private Match(final Synchronization pV) {
      this.fV = pV;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("v".equals(parameterName)) return this.fV;
      return null;
    }
    
    public Synchronization getV() {
      return this.fV;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("v".equals(parameterName) ) {
          this.fV = (Synchronization) newValue;
          return true;
      }
      return false;
    }
    
    public void setV(final Synchronization pV) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fV = pV;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleOutgoingTrainsition";
    }
    
    @Override
    public List<String> parameterNames() {
      return HasMultipleOutgoingTrainsition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fV};
    }
    
    @Override
    public HasMultipleOutgoingTrainsition.Match toImmutable() {
      return isMutable() ? newMatch(fV) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"v\"=" + prettyPrintValue(fV));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fV);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof HasMultipleOutgoingTrainsition.Match)) {
          HasMultipleOutgoingTrainsition.Match other = (HasMultipleOutgoingTrainsition.Match) obj;
          return Objects.equals(fV, other.fV);
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
    public HasMultipleOutgoingTrainsition specification() {
      return HasMultipleOutgoingTrainsition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static HasMultipleOutgoingTrainsition.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static HasMultipleOutgoingTrainsition.Match newMutableMatch(final Synchronization pV) {
      return new Mutable(pV);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static HasMultipleOutgoingTrainsition.Match newMatch(final Synchronization pV) {
      return new Immutable(pV);
    }
    
    private static final class Mutable extends HasMultipleOutgoingTrainsition.Match {
      Mutable(final Synchronization pV) {
        super(pV);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends HasMultipleOutgoingTrainsition.Match {
      Immutable(final Synchronization pV) {
        super(pV);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleOutgoingTrainsition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern hasMultipleOutgoingTrainsition(v : Synchronization) {
   * 	find transition(_, v, trg1);
   * 	find transition(_, v, trg2);
   * 	trg1 != trg2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see HasMultipleOutgoingTrainsition
   * 
   */
  public static class Matcher extends BaseMatcher<HasMultipleOutgoingTrainsition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static HasMultipleOutgoingTrainsition.Matcher on(final ViatraQueryEngine engine) {
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
    public static HasMultipleOutgoingTrainsition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_V = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(HasMultipleOutgoingTrainsition.Matcher.class);
    
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
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<HasMultipleOutgoingTrainsition.Match> getAllMatches(final Synchronization pV) {
      return rawStreamAllMatches(new Object[]{pV}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<HasMultipleOutgoingTrainsition.Match> streamAllMatches(final Synchronization pV) {
      return rawStreamAllMatches(new Object[]{pV});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<HasMultipleOutgoingTrainsition.Match> getOneArbitraryMatch(final Synchronization pV) {
      return rawGetOneArbitraryMatch(new Object[]{pV});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Synchronization pV) {
      return rawHasMatch(new Object[]{pV});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Synchronization pV) {
      return rawCountMatches(new Object[]{pV});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Synchronization pV, final Consumer<? super HasMultipleOutgoingTrainsition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pV}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pV the fixed value of pattern parameter v, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public HasMultipleOutgoingTrainsition.Match newMatch(final Synchronization pV) {
      return HasMultipleOutgoingTrainsition.Match.newMatch(pV);
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Synchronization> rawStreamAllValuesOfv(final Object[] parameters) {
      return rawStreamAllValues(POSITION_V, parameters).map(Synchronization.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synchronization> getAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for v.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Synchronization> streamAllValuesOfv() {
      return rawStreamAllValuesOfv(emptyArray());
    }
    
    @Override
    protected HasMultipleOutgoingTrainsition.Match tupleToMatch(final Tuple t) {
      try {
          return HasMultipleOutgoingTrainsition.Match.newMatch((Synchronization) t.get(POSITION_V));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected HasMultipleOutgoingTrainsition.Match arrayToMatch(final Object[] match) {
      try {
          return HasMultipleOutgoingTrainsition.Match.newMatch((Synchronization) match[POSITION_V]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected HasMultipleOutgoingTrainsition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return HasMultipleOutgoingTrainsition.Match.newMutableMatch((Synchronization) match[POSITION_V]);
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
    public static IQuerySpecification<HasMultipleOutgoingTrainsition.Matcher> querySpecification() {
      return HasMultipleOutgoingTrainsition.instance();
    }
  }
  
  private HasMultipleOutgoingTrainsition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static HasMultipleOutgoingTrainsition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected HasMultipleOutgoingTrainsition.Matcher instantiate(final ViatraQueryEngine engine) {
    return HasMultipleOutgoingTrainsition.Matcher.on(engine);
  }
  
  @Override
  public HasMultipleOutgoingTrainsition.Matcher instantiate() {
    return HasMultipleOutgoingTrainsition.Matcher.create();
  }
  
  @Override
  public HasMultipleOutgoingTrainsition.Match newEmptyMatch() {
    return HasMultipleOutgoingTrainsition.Match.newEmptyMatch();
  }
  
  @Override
  public HasMultipleOutgoingTrainsition.Match newMatch(final Object... parameters) {
    return HasMultipleOutgoingTrainsition.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleOutgoingTrainsition (visibility: PUBLIC, simpleName: HasMultipleOutgoingTrainsition, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleOutgoingTrainsition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleOutgoingTrainsition (visibility: PUBLIC, simpleName: HasMultipleOutgoingTrainsition, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleOutgoingTrainsition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static HasMultipleOutgoingTrainsition INSTANCE = new HasMultipleOutgoingTrainsition();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static HasMultipleOutgoingTrainsition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_v = new PParameter("v", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Synchronization")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_v);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleOutgoingTrainsition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("v");
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
          PVariable var_v = body.getOrCreateVariableByName("v");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_trg1 = body.getOrCreateVariableByName("trg1");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var_trg2 = body.getOrCreateVariableByName("trg2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_v), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Synchronization")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_v, parameter_v)
          ));
          // 	find transition(_, v, trg1)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___0_, var_v, var_trg1), Transition.instance().getInternalQueryRepresentation());
          // 	find transition(_, v, trg2)
          new PositivePatternCall(body, Tuples.flatTupleOf(var___1_, var_v, var_trg2), Transition.instance().getInternalQueryRepresentation());
          // 	trg1 != trg2
          new Inequality(body, var_trg1, var_trg2);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
