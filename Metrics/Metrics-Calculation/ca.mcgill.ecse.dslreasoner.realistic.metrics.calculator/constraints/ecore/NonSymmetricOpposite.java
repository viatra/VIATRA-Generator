/**
 * Generated from platform:/resource/SocialNetwork_plugin/queries/ecore/Ecore.vql
 */
package ecore;

import ecore.Opposite;
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
import org.eclipse.emf.ecore.EReference;
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
 *         {@literal @}Constraint(key={a}, severity="error", message="error")
 *         pattern nonSymmetricOpposite(a:EReference, b:EReference) {
 *         	find opposite(a,b);
 *         	neg find opposite(b,a);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NonSymmetricOpposite extends BaseGeneratedEMFQuerySpecification<NonSymmetricOpposite.Matcher> {
  /**
   * Pattern-specific match representation of the ecore.nonSymmetricOpposite pattern,
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
    private EReference fA;
    
    private EReference fB;
    
    private static List<String> parameterNames = makeImmutableList("a", "b");
    
    private Match(final EReference pA, final EReference pB) {
      this.fA = pA;
      this.fB = pB;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("a".equals(parameterName)) return this.fA;
      if ("b".equals(parameterName)) return this.fB;
      return null;
    }
    
    public EReference getA() {
      return this.fA;
    }
    
    public EReference getB() {
      return this.fB;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (EReference) newValue;
          return true;
      }
      if ("b".equals(parameterName) ) {
          this.fB = (EReference) newValue;
          return true;
      }
      return false;
    }
    
    public void setA(final EReference pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }
    
    public void setB(final EReference pB) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fB = pB;
    }
    
    @Override
    public String patternName() {
      return "ecore.nonSymmetricOpposite";
    }
    
    @Override
    public List<String> parameterNames() {
      return NonSymmetricOpposite.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fA, fB};
    }
    
    @Override
    public NonSymmetricOpposite.Match toImmutable() {
      return isMutable() ? newMatch(fA, fB) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
      result.append("\"b\"=" + prettyPrintValue(fB));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fA, fB);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NonSymmetricOpposite.Match)) {
          NonSymmetricOpposite.Match other = (NonSymmetricOpposite.Match) obj;
          return Objects.equals(fA, other.fA) && Objects.equals(fB, other.fB);
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
    public NonSymmetricOpposite specification() {
      return NonSymmetricOpposite.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NonSymmetricOpposite.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NonSymmetricOpposite.Match newMutableMatch(final EReference pA, final EReference pB) {
      return new Mutable(pA, pB);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NonSymmetricOpposite.Match newMatch(final EReference pA, final EReference pB) {
      return new Immutable(pA, pB);
    }
    
    private static final class Mutable extends NonSymmetricOpposite.Match {
      Mutable(final EReference pA, final EReference pB) {
        super(pA, pB);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NonSymmetricOpposite.Match {
      Immutable(final EReference pA, final EReference pB) {
        super(pA, pB);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ecore.nonSymmetricOpposite pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(key={a}, severity="error", message="error")
   * pattern nonSymmetricOpposite(a:EReference, b:EReference) {
   * 	find opposite(a,b);
   * 	neg find opposite(b,a);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NonSymmetricOpposite
   * 
   */
  public static class Matcher extends BaseMatcher<NonSymmetricOpposite.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NonSymmetricOpposite.Matcher on(final ViatraQueryEngine engine) {
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
    public static NonSymmetricOpposite.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_A = 0;
    
    private static final int POSITION_B = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NonSymmetricOpposite.Matcher.class);
    
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
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NonSymmetricOpposite.Match> getAllMatches(final EReference pA, final EReference pB) {
      return rawStreamAllMatches(new Object[]{pA, pB}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NonSymmetricOpposite.Match> streamAllMatches(final EReference pA, final EReference pB) {
      return rawStreamAllMatches(new Object[]{pA, pB});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NonSymmetricOpposite.Match> getOneArbitraryMatch(final EReference pA, final EReference pB) {
      return rawGetOneArbitraryMatch(new Object[]{pA, pB});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EReference pA, final EReference pB) {
      return rawHasMatch(new Object[]{pA, pB});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EReference pA, final EReference pB) {
      return rawCountMatches(new Object[]{pA, pB});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EReference pA, final EReference pB, final Consumer<? super NonSymmetricOpposite.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA, pB}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NonSymmetricOpposite.Match newMatch(final EReference pA, final EReference pB) {
      return NonSymmetricOpposite.Match.newMatch(pA, pB);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EReference> rawStreamAllValuesOfa(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A, parameters).map(EReference.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EReference> getAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EReference> streamAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EReference> streamAllValuesOfa(final NonSymmetricOpposite.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EReference> streamAllValuesOfa(final EReference pB) {
      return rawStreamAllValuesOfa(new Object[]{null, pB});
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EReference> getAllValuesOfa(final NonSymmetricOpposite.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EReference> getAllValuesOfa(final EReference pB) {
      return rawStreamAllValuesOfa(new Object[]{null, pB}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EReference> rawStreamAllValuesOfb(final Object[] parameters) {
      return rawStreamAllValues(POSITION_B, parameters).map(EReference.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EReference> getAllValuesOfb() {
      return rawStreamAllValuesOfb(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EReference> streamAllValuesOfb() {
      return rawStreamAllValuesOfb(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EReference> streamAllValuesOfb(final NonSymmetricOpposite.Match partialMatch) {
      return rawStreamAllValuesOfb(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EReference> streamAllValuesOfb(final EReference pA) {
      return rawStreamAllValuesOfb(new Object[]{pA, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EReference> getAllValuesOfb(final NonSymmetricOpposite.Match partialMatch) {
      return rawStreamAllValuesOfb(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EReference> getAllValuesOfb(final EReference pA) {
      return rawStreamAllValuesOfb(new Object[]{pA, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected NonSymmetricOpposite.Match tupleToMatch(final Tuple t) {
      try {
          return NonSymmetricOpposite.Match.newMatch((EReference) t.get(POSITION_A), (EReference) t.get(POSITION_B));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NonSymmetricOpposite.Match arrayToMatch(final Object[] match) {
      try {
          return NonSymmetricOpposite.Match.newMatch((EReference) match[POSITION_A], (EReference) match[POSITION_B]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NonSymmetricOpposite.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NonSymmetricOpposite.Match.newMutableMatch((EReference) match[POSITION_A], (EReference) match[POSITION_B]);
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
    public static IQuerySpecification<NonSymmetricOpposite.Matcher> querySpecification() {
      return NonSymmetricOpposite.instance();
    }
  }
  
  private NonSymmetricOpposite() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NonSymmetricOpposite instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NonSymmetricOpposite.Matcher instantiate(final ViatraQueryEngine engine) {
    return NonSymmetricOpposite.Matcher.on(engine);
  }
  
  @Override
  public NonSymmetricOpposite.Matcher instantiate() {
    return NonSymmetricOpposite.Matcher.create();
  }
  
  @Override
  public NonSymmetricOpposite.Match newEmptyMatch() {
    return NonSymmetricOpposite.Match.newEmptyMatch();
  }
  
  @Override
  public NonSymmetricOpposite.Match newMatch(final Object... parameters) {
    return NonSymmetricOpposite.Match.newMatch((org.eclipse.emf.ecore.EReference) parameters[0], (org.eclipse.emf.ecore.EReference) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ecore.NonSymmetricOpposite (visibility: PUBLIC, simpleName: NonSymmetricOpposite, identifier: ecore.NonSymmetricOpposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ecore) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ecore.NonSymmetricOpposite (visibility: PUBLIC, simpleName: NonSymmetricOpposite, identifier: ecore.NonSymmetricOpposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ecore) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NonSymmetricOpposite INSTANCE = new NonSymmetricOpposite();
    
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
    private static final NonSymmetricOpposite.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_a = new PParameter("a", "org.eclipse.emf.ecore.EReference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EReference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_b = new PParameter("b", "org.eclipse.emf.ecore.EReference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EReference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_a, parameter_b);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ecore.nonSymmetricOpposite";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","b");
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
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_b = body.getOrCreateVariableByName("b");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EReference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a),
             new ExportedParameter(body, var_b, parameter_b)
          ));
          // 	find opposite(a,b)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_a, var_b), Opposite.instance().getInternalQueryRepresentation());
          // 	neg find opposite(b,a)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_b, var_a), Opposite.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("a")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
