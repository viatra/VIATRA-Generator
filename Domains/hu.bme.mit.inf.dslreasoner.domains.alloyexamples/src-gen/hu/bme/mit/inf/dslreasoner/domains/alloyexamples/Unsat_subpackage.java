/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.alloyexamples/patterns/hu/bme/mit/inf/dslreasoner/domains/alloyexamples/Ecore.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples;

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
import org.eclipse.emf.ecore.EPackage;
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
 *         pattern unsat_subpackage(a: EPackage, b: EPackage) {
 *         	EPackage.eSubpackages(a, b);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Unsat_subpackage extends BaseGeneratedEMFQuerySpecification<Unsat_subpackage.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.unsat_subpackage pattern,
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
    private EPackage fA;
    
    private EPackage fB;
    
    private static List<String> parameterNames = makeImmutableList("a", "b");
    
    private Match(final EPackage pA, final EPackage pB) {
      this.fA = pA;
      this.fB = pB;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "a": return this.fA;
          case "b": return this.fB;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fA;
          case 1: return this.fB;
          default: return null;
      }
    }
    
    public EPackage getA() {
      return this.fA;
    }
    
    public EPackage getB() {
      return this.fB;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (EPackage) newValue;
          return true;
      }
      if ("b".equals(parameterName) ) {
          this.fB = (EPackage) newValue;
          return true;
      }
      return false;
    }
    
    public void setA(final EPackage pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }
    
    public void setB(final EPackage pB) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fB = pB;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.unsat_subpackage";
    }
    
    @Override
    public List<String> parameterNames() {
      return Unsat_subpackage.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fA, fB};
    }
    
    @Override
    public Unsat_subpackage.Match toImmutable() {
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
      if ((obj instanceof Unsat_subpackage.Match)) {
          Unsat_subpackage.Match other = (Unsat_subpackage.Match) obj;
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
    public Unsat_subpackage specification() {
      return Unsat_subpackage.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Unsat_subpackage.Match newEmptyMatch() {
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
    public static Unsat_subpackage.Match newMutableMatch(final EPackage pA, final EPackage pB) {
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
    public static Unsat_subpackage.Match newMatch(final EPackage pA, final EPackage pB) {
      return new Immutable(pA, pB);
    }
    
    private static final class Mutable extends Unsat_subpackage.Match {
      Mutable(final EPackage pA, final EPackage pB) {
        super(pA, pB);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Unsat_subpackage.Match {
      Immutable(final EPackage pA, final EPackage pB) {
        super(pA, pB);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.unsat_subpackage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern unsat_subpackage(a: EPackage, b: EPackage) {
   * 	EPackage.eSubpackages(a, b);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Unsat_subpackage
   * 
   */
  public static class Matcher extends BaseMatcher<Unsat_subpackage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Unsat_subpackage.Matcher on(final ViatraQueryEngine engine) {
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
    public static Unsat_subpackage.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_A = 0;
    
    private static final int POSITION_B = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Unsat_subpackage.Matcher.class);
    
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
    public Collection<Unsat_subpackage.Match> getAllMatches(final EPackage pA, final EPackage pB) {
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
    public Stream<Unsat_subpackage.Match> streamAllMatches(final EPackage pA, final EPackage pB) {
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
    public Optional<Unsat_subpackage.Match> getOneArbitraryMatch(final EPackage pA, final EPackage pB) {
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
    public boolean hasMatch(final EPackage pA, final EPackage pB) {
      return rawHasMatch(new Object[]{pA, pB});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pB the fixed value of pattern parameter b, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EPackage pA, final EPackage pB) {
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
    public boolean forOneArbitraryMatch(final EPackage pA, final EPackage pB, final Consumer<? super Unsat_subpackage.Match> processor) {
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
    public Unsat_subpackage.Match newMatch(final EPackage pA, final EPackage pB) {
      return Unsat_subpackage.Match.newMatch(pA, pB);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EPackage> rawStreamAllValuesOfa(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A, parameters).map(EPackage.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EPackage> getAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EPackage> streamAllValuesOfa() {
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
    public Stream<EPackage> streamAllValuesOfa(final Unsat_subpackage.Match partialMatch) {
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
    public Stream<EPackage> streamAllValuesOfa(final EPackage pB) {
      return rawStreamAllValuesOfa(new Object[]{null, pB});
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EPackage> getAllValuesOfa(final Unsat_subpackage.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EPackage> getAllValuesOfa(final EPackage pB) {
      return rawStreamAllValuesOfa(new Object[]{null, pB}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EPackage> rawStreamAllValuesOfb(final Object[] parameters) {
      return rawStreamAllValues(POSITION_B, parameters).map(EPackage.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EPackage> getAllValuesOfb() {
      return rawStreamAllValuesOfb(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EPackage> streamAllValuesOfb() {
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
    public Stream<EPackage> streamAllValuesOfb(final Unsat_subpackage.Match partialMatch) {
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
    public Stream<EPackage> streamAllValuesOfb(final EPackage pA) {
      return rawStreamAllValuesOfb(new Object[]{pA, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EPackage> getAllValuesOfb(final Unsat_subpackage.Match partialMatch) {
      return rawStreamAllValuesOfb(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for b.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EPackage> getAllValuesOfb(final EPackage pA) {
      return rawStreamAllValuesOfb(new Object[]{pA, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Unsat_subpackage.Match tupleToMatch(final Tuple t) {
      try {
          return Unsat_subpackage.Match.newMatch((EPackage) t.get(POSITION_A), (EPackage) t.get(POSITION_B));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unsat_subpackage.Match arrayToMatch(final Object[] match) {
      try {
          return Unsat_subpackage.Match.newMatch((EPackage) match[POSITION_A], (EPackage) match[POSITION_B]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unsat_subpackage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Unsat_subpackage.Match.newMutableMatch((EPackage) match[POSITION_A], (EPackage) match[POSITION_B]);
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
    public static IQuerySpecification<Unsat_subpackage.Matcher> querySpecification() {
      return Unsat_subpackage.instance();
    }
  }
  
  private Unsat_subpackage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Unsat_subpackage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Unsat_subpackage.Matcher instantiate(final ViatraQueryEngine engine) {
    return Unsat_subpackage.Matcher.on(engine);
  }
  
  @Override
  public Unsat_subpackage.Matcher instantiate() {
    return Unsat_subpackage.Matcher.create();
  }
  
  @Override
  public Unsat_subpackage.Match newEmptyMatch() {
    return Unsat_subpackage.Match.newEmptyMatch();
  }
  
  @Override
  public Unsat_subpackage.Match newMatch(final Object... parameters) {
    return Unsat_subpackage.Match.newMatch((org.eclipse.emf.ecore.EPackage) parameters[0], (org.eclipse.emf.ecore.EPackage) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Unsat_subpackage} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Unsat_subpackage#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Unsat_subpackage INSTANCE = new Unsat_subpackage();
    
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
    private static final Unsat_subpackage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_a = new PParameter("a", "org.eclipse.emf.ecore.EPackage", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EPackage")), PParameterDirection.INOUT);
    
    private final PParameter parameter_b = new PParameter("b", "org.eclipse.emf.ecore.EPackage", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EPackage")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_a, parameter_b);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.unsat_subpackage";
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_b), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a),
             new ExportedParameter(body, var_b, parameter_b)
          ));
          // 	EPackage.eSubpackages(a, b)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage", "eSubpackages")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EPackage")));
          new Equality(body, var__virtual_0_, var_b);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
