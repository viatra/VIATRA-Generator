/**
 * Generated from platform:/resource/SocialNetwork_plugin/queries/queries/Ecore.vql
 */
package queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
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
 *         pattern superTypes(c1:EClass, c2:EClass){
 *         	EClass.eSuperTypes(c1,c2);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SuperTypes extends BaseGeneratedEMFQuerySpecification<SuperTypes.Matcher> {
  /**
   * Pattern-specific match representation of the queries.superTypes pattern,
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
    private EClass fC1;
    
    private EClass fC2;
    
    private static List<String> parameterNames = makeImmutableList("c1", "c2");
    
    private Match(final EClass pC1, final EClass pC2) {
      this.fC1 = pC1;
      this.fC2 = pC2;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "c1": return this.fC1;
          case "c2": return this.fC2;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fC1;
          case 1: return this.fC2;
          default: return null;
      }
    }
    
    public EClass getC1() {
      return this.fC1;
    }
    
    public EClass getC2() {
      return this.fC2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("c1".equals(parameterName) ) {
          this.fC1 = (EClass) newValue;
          return true;
      }
      if ("c2".equals(parameterName) ) {
          this.fC2 = (EClass) newValue;
          return true;
      }
      return false;
    }
    
    public void setC1(final EClass pC1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fC1 = pC1;
    }
    
    public void setC2(final EClass pC2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fC2 = pC2;
    }
    
    @Override
    public String patternName() {
      return "queries.superTypes";
    }
    
    @Override
    public List<String> parameterNames() {
      return SuperTypes.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fC1, fC2};
    }
    
    @Override
    public SuperTypes.Match toImmutable() {
      return isMutable() ? newMatch(fC1, fC2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"c1\"=" + prettyPrintValue(fC1) + ", ");
      result.append("\"c2\"=" + prettyPrintValue(fC2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fC1, fC2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SuperTypes.Match)) {
          SuperTypes.Match other = (SuperTypes.Match) obj;
          return Objects.equals(fC1, other.fC1) && Objects.equals(fC2, other.fC2);
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
    public SuperTypes specification() {
      return SuperTypes.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SuperTypes.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SuperTypes.Match newMutableMatch(final EClass pC1, final EClass pC2) {
      return new Mutable(pC1, pC2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SuperTypes.Match newMatch(final EClass pC1, final EClass pC2) {
      return new Immutable(pC1, pC2);
    }
    
    private static final class Mutable extends SuperTypes.Match {
      Mutable(final EClass pC1, final EClass pC2) {
        super(pC1, pC2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SuperTypes.Match {
      Immutable(final EClass pC1, final EClass pC2) {
        super(pC1, pC2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.superTypes pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern superTypes(c1:EClass, c2:EClass){
   * 	EClass.eSuperTypes(c1,c2);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SuperTypes
   * 
   */
  public static class Matcher extends BaseMatcher<SuperTypes.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SuperTypes.Matcher on(final ViatraQueryEngine engine) {
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
    public static SuperTypes.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_C1 = 0;
    
    private static final int POSITION_C2 = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SuperTypes.Matcher.class);
    
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
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SuperTypes.Match> getAllMatches(final EClass pC1, final EClass pC2) {
      return rawStreamAllMatches(new Object[]{pC1, pC2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SuperTypes.Match> streamAllMatches(final EClass pC1, final EClass pC2) {
      return rawStreamAllMatches(new Object[]{pC1, pC2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SuperTypes.Match> getOneArbitraryMatch(final EClass pC1, final EClass pC2) {
      return rawGetOneArbitraryMatch(new Object[]{pC1, pC2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EClass pC1, final EClass pC2) {
      return rawHasMatch(new Object[]{pC1, pC2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EClass pC1, final EClass pC2) {
      return rawCountMatches(new Object[]{pC1, pC2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EClass pC1, final EClass pC2, final Consumer<? super SuperTypes.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pC1, pC2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pC1 the fixed value of pattern parameter c1, or null if not bound.
     * @param pC2 the fixed value of pattern parameter c2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SuperTypes.Match newMatch(final EClass pC1, final EClass pC2) {
      return SuperTypes.Match.newMatch(pC1, pC2);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EClass> rawStreamAllValuesOfc1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_C1, parameters).map(EClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc1() {
      return rawStreamAllValuesOfc1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc1() {
      return rawStreamAllValuesOfc1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc1(final SuperTypes.Match partialMatch) {
      return rawStreamAllValuesOfc1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc1(final EClass pC2) {
      return rawStreamAllValuesOfc1(new Object[]{null, pC2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc1(final SuperTypes.Match partialMatch) {
      return rawStreamAllValuesOfc1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc1(final EClass pC2) {
      return rawStreamAllValuesOfc1(new Object[]{null, pC2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EClass> rawStreamAllValuesOfc2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_C2, parameters).map(EClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc2() {
      return rawStreamAllValuesOfc2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc2() {
      return rawStreamAllValuesOfc2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc2(final SuperTypes.Match partialMatch) {
      return rawStreamAllValuesOfc2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc2(final EClass pC1) {
      return rawStreamAllValuesOfc2(new Object[]{pC1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc2(final SuperTypes.Match partialMatch) {
      return rawStreamAllValuesOfc2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc2(final EClass pC1) {
      return rawStreamAllValuesOfc2(new Object[]{pC1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected SuperTypes.Match tupleToMatch(final Tuple t) {
      try {
          return SuperTypes.Match.newMatch((EClass) t.get(POSITION_C1), (EClass) t.get(POSITION_C2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SuperTypes.Match arrayToMatch(final Object[] match) {
      try {
          return SuperTypes.Match.newMatch((EClass) match[POSITION_C1], (EClass) match[POSITION_C2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SuperTypes.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SuperTypes.Match.newMutableMatch((EClass) match[POSITION_C1], (EClass) match[POSITION_C2]);
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
    public static IQuerySpecification<SuperTypes.Matcher> querySpecification() {
      return SuperTypes.instance();
    }
  }
  
  private SuperTypes() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SuperTypes instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SuperTypes.Matcher instantiate(final ViatraQueryEngine engine) {
    return SuperTypes.Matcher.on(engine);
  }
  
  @Override
  public SuperTypes.Matcher instantiate() {
    return SuperTypes.Matcher.create();
  }
  
  @Override
  public SuperTypes.Match newEmptyMatch() {
    return SuperTypes.Match.newEmptyMatch();
  }
  
  @Override
  public SuperTypes.Match newMatch(final Object... parameters) {
    return SuperTypes.Match.newMatch((org.eclipse.emf.ecore.EClass) parameters[0], (org.eclipse.emf.ecore.EClass) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link SuperTypes} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link SuperTypes#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SuperTypes INSTANCE = new SuperTypes();
    
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
    private static final SuperTypes.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_c1 = new PParameter("c1", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final PParameter parameter_c2 = new PParameter("c2", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_c1, parameter_c2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.superTypes";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("c1","c2");
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
          PVariable var_c1 = body.getOrCreateVariableByName("c1");
          PVariable var_c2 = body.getOrCreateVariableByName("c2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_c2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_c1, parameter_c1),
             new ExportedParameter(body, var_c2, parameter_c2)
          ));
          // 	EClass.eSuperTypes(c1,c2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_c1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          new Equality(body, var__virtual_0_, var_c2);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
