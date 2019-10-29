/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.NoHostToAllocateTo;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.RequiredAppInstances;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.UnallocatedAppInstance;
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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.matchers.aggregators.sum;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         pattern guidanceObjective(Value : java Integer) {
 *         	UnallocatedInstances == count find unallocatedAppInstance(_);
 *         	RequiredInstances == sum find requiredAppInstances(_, #_);
 *         	NoHostToAllocate == count find noHostToAllocateTo(_);
 *         	Value == eval(2  UnallocatedInstances + 4  RequiredInstances + NoHostToAllocate);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class GuidanceObjective extends BaseGeneratedEMFQuerySpecification<GuidanceObjective.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.guidanceObjective pattern,
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
    private Integer fValue;
    
    private static List<String> parameterNames = makeImmutableList("Value");
    
    private Match(final Integer pValue) {
      this.fValue = pValue;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "Value": return this.fValue;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fValue;
          default: return null;
      }
    }
    
    public Integer getValue() {
      return this.fValue;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Value".equals(parameterName) ) {
          this.fValue = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setValue(final Integer pValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fValue = pValue;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.guidanceObjective";
    }
    
    @Override
    public List<String> parameterNames() {
      return GuidanceObjective.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fValue};
    }
    
    @Override
    public GuidanceObjective.Match toImmutable() {
      return isMutable() ? newMatch(fValue) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Value\"=" + prettyPrintValue(fValue));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fValue);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof GuidanceObjective.Match)) {
          GuidanceObjective.Match other = (GuidanceObjective.Match) obj;
          return Objects.equals(fValue, other.fValue);
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
    public GuidanceObjective specification() {
      return GuidanceObjective.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static GuidanceObjective.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static GuidanceObjective.Match newMutableMatch(final Integer pValue) {
      return new Mutable(pValue);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static GuidanceObjective.Match newMatch(final Integer pValue) {
      return new Immutable(pValue);
    }
    
    private static final class Mutable extends GuidanceObjective.Match {
      Mutable(final Integer pValue) {
        super(pValue);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends GuidanceObjective.Match {
      Immutable(final Integer pValue) {
        super(pValue);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.guidanceObjective pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern guidanceObjective(Value : java Integer) {
   * 	UnallocatedInstances == count find unallocatedAppInstance(_);
   * 	RequiredInstances == sum find requiredAppInstances(_, #_);
   * 	NoHostToAllocate == count find noHostToAllocateTo(_);
   * 	Value == eval(2  UnallocatedInstances + 4  RequiredInstances + NoHostToAllocate);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see GuidanceObjective
   * 
   */
  public static class Matcher extends BaseMatcher<GuidanceObjective.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static GuidanceObjective.Matcher on(final ViatraQueryEngine engine) {
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
    public static GuidanceObjective.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_VALUE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(GuidanceObjective.Matcher.class);
    
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
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<GuidanceObjective.Match> getAllMatches(final Integer pValue) {
      return rawStreamAllMatches(new Object[]{pValue}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<GuidanceObjective.Match> streamAllMatches(final Integer pValue) {
      return rawStreamAllMatches(new Object[]{pValue});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<GuidanceObjective.Match> getOneArbitraryMatch(final Integer pValue) {
      return rawGetOneArbitraryMatch(new Object[]{pValue});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Integer pValue) {
      return rawHasMatch(new Object[]{pValue});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Integer pValue) {
      return rawCountMatches(new Object[]{pValue});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Integer pValue, final Consumer<? super GuidanceObjective.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pValue}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pValue the fixed value of pattern parameter Value, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public GuidanceObjective.Match newMatch(final Integer pValue) {
      return GuidanceObjective.Match.newMatch(pValue);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Integer> rawStreamAllValuesOfValue(final Object[] parameters) {
      return rawStreamAllValues(POSITION_VALUE, parameters).map(Integer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfValue() {
      return rawStreamAllValuesOfValue(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Value.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Integer> streamAllValuesOfValue() {
      return rawStreamAllValuesOfValue(emptyArray());
    }
    
    @Override
    protected GuidanceObjective.Match tupleToMatch(final Tuple t) {
      try {
          return GuidanceObjective.Match.newMatch((Integer) t.get(POSITION_VALUE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GuidanceObjective.Match arrayToMatch(final Object[] match) {
      try {
          return GuidanceObjective.Match.newMatch((Integer) match[POSITION_VALUE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected GuidanceObjective.Match arrayToMatchMutable(final Object[] match) {
      try {
          return GuidanceObjective.Match.newMutableMatch((Integer) match[POSITION_VALUE]);
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
    public static IQuerySpecification<GuidanceObjective.Matcher> querySpecification() {
      return GuidanceObjective.instance();
    }
  }
  
  private GuidanceObjective() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static GuidanceObjective instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected GuidanceObjective.Matcher instantiate(final ViatraQueryEngine engine) {
    return GuidanceObjective.Matcher.on(engine);
  }
  
  @Override
  public GuidanceObjective.Matcher instantiate() {
    return GuidanceObjective.Matcher.create();
  }
  
  @Override
  public GuidanceObjective.Match newEmptyMatch() {
    return GuidanceObjective.Match.newEmptyMatch();
  }
  
  @Override
  public GuidanceObjective.Match newMatch(final Object... parameters) {
    return GuidanceObjective.Match.newMatch((java.lang.Integer) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link GuidanceObjective} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link GuidanceObjective#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final GuidanceObjective INSTANCE = new GuidanceObjective();
    
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
    private static final GuidanceObjective.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Value = new PParameter("Value", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Value);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.guidanceObjective";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Value");
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
          PVariable var_Value = body.getOrCreateVariableByName("Value");
          PVariable var_UnallocatedInstances = body.getOrCreateVariableByName("UnallocatedInstances");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_RequiredInstances = body.getOrCreateVariableByName("RequiredInstances");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          PVariable var_NoHostToAllocate = body.getOrCreateVariableByName("NoHostToAllocate");
          PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Value), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Value, parameter_Value)
          ));
          // 	UnallocatedInstances == count find unallocatedAppInstance(_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___0_), UnallocatedAppInstance.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_UnallocatedInstances, var__virtual_0_);
          // 	RequiredInstances == sum find requiredAppInstances(_, #_)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Integer.class), body, Tuples.flatTupleOf(var___1_, var___2_), RequiredAppInstances.instance().getInternalQueryRepresentation(), var__virtual_1_, 1);
          new Equality(body, var_RequiredInstances, var__virtual_1_);
          // 	NoHostToAllocate == count find noHostToAllocateTo(_)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___3_), NoHostToAllocateTo.instance().getInternalQueryRepresentation(), var__virtual_2_);
          new Equality(body, var_NoHostToAllocate, var__virtual_2_);
          // 	Value == eval(2 * UnallocatedInstances + 4 * RequiredInstances + NoHostToAllocate)
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern guidanceObjective";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("NoHostToAllocate", "RequiredInstances", "UnallocatedInstances");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer NoHostToAllocate = (Integer) provider.getValue("NoHostToAllocate");
                  Integer RequiredInstances = (Integer) provider.getValue("RequiredInstances");
                  Integer UnallocatedInstances = (Integer) provider.getValue("UnallocatedInstances");
                  return evaluateExpression_1_1(NoHostToAllocate, RequiredInstances, UnallocatedInstances);
              }
          },  var__virtual_3_ ); 
          new Equality(body, var_Value, var__virtual_3_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1(final Integer NoHostToAllocate, final Integer RequiredInstances, final Integer UnallocatedInstances) {
    return (((2 * (UnallocatedInstances).intValue()) + (4 * (RequiredInstances).intValue())) + (NoHostToAllocate).intValue());
  }
}
