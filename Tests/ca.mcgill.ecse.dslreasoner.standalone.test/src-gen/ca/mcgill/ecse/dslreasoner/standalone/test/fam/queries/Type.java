/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/fam/queries/famPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionType;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.Parent;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.RootElements;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         {@literal @}QueryBasedFeature 
 *         pattern type(This : Function, Target : FunctionType) = {
 *         	find rootElements(_Model, This);
 *         	Target == FunctionType::Root;
 *         } or {
 *         	neg find parent(_Child, This);
 *         	neg find rootElements(_Model, This);
 *         	Target == FunctionType::Leaf;
 *         } or  {
 *         	find parent(This, _Par);
 *         	find parent(_Child, This);
 *         	Target == FunctionType::Intermediate;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Type extends BaseGeneratedEMFQuerySpecification<Type.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.type pattern,
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
    private Function fThis;
    
    private FunctionType fTarget;
    
    private static List<String> parameterNames = makeImmutableList("This", "Target");
    
    private Match(final Function pThis, final FunctionType pTarget) {
      this.fThis = pThis;
      this.fTarget = pTarget;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("This".equals(parameterName)) return this.fThis;
      if ("Target".equals(parameterName)) return this.fTarget;
      return null;
    }
    
    public Function getThis() {
      return this.fThis;
    }
    
    public FunctionType getTarget() {
      return this.fTarget;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("This".equals(parameterName) ) {
          this.fThis = (Function) newValue;
          return true;
      }
      if ("Target".equals(parameterName) ) {
          this.fTarget = (FunctionType) newValue;
          return true;
      }
      return false;
    }
    
    public void setThis(final Function pThis) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fThis = pThis;
    }
    
    public void setTarget(final FunctionType pTarget) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTarget = pTarget;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.type";
    }
    
    @Override
    public List<String> parameterNames() {
      return Type.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fThis, fTarget};
    }
    
    @Override
    public Type.Match toImmutable() {
      return isMutable() ? newMatch(fThis, fTarget) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"This\"=" + prettyPrintValue(fThis) + ", ");
      result.append("\"Target\"=" + prettyPrintValue(fTarget));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fThis, fTarget);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Type.Match)) {
          Type.Match other = (Type.Match) obj;
          return Objects.equals(fThis, other.fThis) && Objects.equals(fTarget, other.fTarget);
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
    public Type specification() {
      return Type.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Type.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Type.Match newMutableMatch(final Function pThis, final FunctionType pTarget) {
      return new Mutable(pThis, pTarget);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Type.Match newMatch(final Function pThis, final FunctionType pTarget) {
      return new Immutable(pThis, pTarget);
    }
    
    private static final class Mutable extends Type.Match {
      Mutable(final Function pThis, final FunctionType pTarget) {
        super(pThis, pTarget);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Type.Match {
      Immutable(final Function pThis, final FunctionType pTarget) {
        super(pThis, pTarget);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.type pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}QueryBasedFeature 
   * pattern type(This : Function, Target : FunctionType) = {
   * 	find rootElements(_Model, This);
   * 	Target == FunctionType::Root;
   * } or {
   * 	neg find parent(_Child, This);
   * 	neg find rootElements(_Model, This);
   * 	Target == FunctionType::Leaf;
   * } or  {
   * 	find parent(This, _Par);
   * 	find parent(_Child, This);
   * 	Target == FunctionType::Intermediate;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Type
   * 
   */
  public static class Matcher extends BaseMatcher<Type.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Type.Matcher on(final ViatraQueryEngine engine) {
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
    public static Type.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_THIS = 0;
    
    private final static int POSITION_TARGET = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Type.Matcher.class);
    
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
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Type.Match> getAllMatches(final Function pThis, final FunctionType pTarget) {
      return rawStreamAllMatches(new Object[]{pThis, pTarget}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Type.Match> streamAllMatches(final Function pThis, final FunctionType pTarget) {
      return rawStreamAllMatches(new Object[]{pThis, pTarget});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Type.Match> getOneArbitraryMatch(final Function pThis, final FunctionType pTarget) {
      return rawGetOneArbitraryMatch(new Object[]{pThis, pTarget});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Function pThis, final FunctionType pTarget) {
      return rawHasMatch(new Object[]{pThis, pTarget});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Function pThis, final FunctionType pTarget) {
      return rawCountMatches(new Object[]{pThis, pTarget});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Function pThis, final FunctionType pTarget, final Consumer<? super Type.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pThis, pTarget}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pThis the fixed value of pattern parameter This, or null if not bound.
     * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Type.Match newMatch(final Function pThis, final FunctionType pTarget) {
      return Type.Match.newMatch(pThis, pTarget);
    }
    
    /**
     * Retrieve the set of values that occur in matches for This.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Function> rawStreamAllValuesOfThis(final Object[] parameters) {
      return rawStreamAllValues(POSITION_THIS, parameters).map(Function.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for This.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Function> getAllValuesOfThis() {
      return rawStreamAllValuesOfThis(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for This.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Function> streamAllValuesOfThis() {
      return rawStreamAllValuesOfThis(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for This.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Function> streamAllValuesOfThis(final Type.Match partialMatch) {
      return rawStreamAllValuesOfThis(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for This.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Function> streamAllValuesOfThis(final FunctionType pTarget) {
      return rawStreamAllValuesOfThis(new Object[]{null, pTarget});
    }
    
    /**
     * Retrieve the set of values that occur in matches for This.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Function> getAllValuesOfThis(final Type.Match partialMatch) {
      return rawStreamAllValuesOfThis(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for This.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Function> getAllValuesOfThis(final FunctionType pTarget) {
      return rawStreamAllValuesOfThis(new Object[]{null, pTarget}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FunctionType> rawStreamAllValuesOfTarget(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TARGET, parameters).map(FunctionType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionType> getAllValuesOfTarget() {
      return rawStreamAllValuesOfTarget(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionType> streamAllValuesOfTarget() {
      return rawStreamAllValuesOfTarget(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionType> streamAllValuesOfTarget(final Type.Match partialMatch) {
      return rawStreamAllValuesOfTarget(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Target.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FunctionType> streamAllValuesOfTarget(final Function pThis) {
      return rawStreamAllValuesOfTarget(new Object[]{pThis, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for Target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionType> getAllValuesOfTarget(final Type.Match partialMatch) {
      return rawStreamAllValuesOfTarget(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Target.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FunctionType> getAllValuesOfTarget(final Function pThis) {
      return rawStreamAllValuesOfTarget(new Object[]{pThis, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Type.Match tupleToMatch(final Tuple t) {
      try {
          return Type.Match.newMatch((Function) t.get(POSITION_THIS), (FunctionType) t.get(POSITION_TARGET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Type.Match arrayToMatch(final Object[] match) {
      try {
          return Type.Match.newMatch((Function) match[POSITION_THIS], (FunctionType) match[POSITION_TARGET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Type.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Type.Match.newMutableMatch((Function) match[POSITION_THIS], (FunctionType) match[POSITION_TARGET]);
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
    public static IQuerySpecification<Type.Matcher> querySpecification() {
      return Type.instance();
    }
  }
  
  private Type() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Type instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Type.Matcher instantiate(final ViatraQueryEngine engine) {
    return Type.Matcher.on(engine);
  }
  
  @Override
  public Type.Matcher instantiate() {
    return Type.Matcher.create();
  }
  
  @Override
  public Type.Match newEmptyMatch() {
    return Type.Match.newEmptyMatch();
  }
  
  @Override
  public Type.Match newMatch(final Object... parameters) {
    return Type.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function) parameters[0], (ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionType) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.Type (visibility: PUBLIC, simpleName: Type, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.Type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.Type (visibility: PUBLIC, simpleName: Type, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.Type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Type INSTANCE = new Type();
    
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
    private final static Type.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_This = new PParameter("This", "ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FamMetamodel", "Function")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Target = new PParameter("Target", "ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionType", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("FamMetamodel", "FunctionType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_This, parameter_Target);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.type";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("This","Target");
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
          PVariable var_This = body.getOrCreateVariableByName("This");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          PVariable var__Model = body.getOrCreateVariableByName("_Model");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FamMetamodel", "Function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("FamMetamodel", "FunctionType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_This, parameter_This),
             new ExportedParameter(body, var_Target, parameter_Target)
          ));
          // 	find rootElements(_Model, This)
          new PositivePatternCall(body, Tuples.flatTupleOf(var__Model, var_This), RootElements.instance().getInternalQueryRepresentation());
          // 	Target == FunctionType::Root
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("FamMetamodel", "FunctionType", "Root").getInstance());
          new Equality(body, var_Target, var__virtual_0_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_This = body.getOrCreateVariableByName("This");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          PVariable var__Child = body.getOrCreateVariableByName("_Child");
          PVariable var__Model = body.getOrCreateVariableByName("_Model");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FamMetamodel", "Function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("FamMetamodel", "FunctionType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_This, parameter_This),
             new ExportedParameter(body, var_Target, parameter_Target)
          ));
          // 	neg find parent(_Child, This)
          new NegativePatternCall(body, Tuples.flatTupleOf(var__Child, var_This), Parent.instance().getInternalQueryRepresentation());
          // 	neg find rootElements(_Model, This)
          new NegativePatternCall(body, Tuples.flatTupleOf(var__Model, var_This), RootElements.instance().getInternalQueryRepresentation());
          // 	Target == FunctionType::Leaf
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("FamMetamodel", "FunctionType", "Leaf").getInstance());
          new Equality(body, var_Target, var__virtual_0_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_This = body.getOrCreateVariableByName("This");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          PVariable var__Par = body.getOrCreateVariableByName("_Par");
          PVariable var__Child = body.getOrCreateVariableByName("_Child");
          new TypeConstraint(body, Tuples.flatTupleOf(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FamMetamodel", "Function")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("FamMetamodel", "FunctionType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_This, parameter_This),
             new ExportedParameter(body, var_Target, parameter_Target)
          ));
          // 	find parent(This, _Par)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_This, var__Par), Parent.instance().getInternalQueryRepresentation());
          // 	find parent(_Child, This)
          new PositivePatternCall(body, Tuples.flatTupleOf(var__Child, var_This), Parent.instance().getInternalQueryRepresentation());
          // 	Target == FunctionType::Intermediate
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("FamMetamodel", "FunctionType", "Intermediate").getInstance());
          new Equality(body, var_Target, var__virtual_0_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("QueryBasedFeature");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
