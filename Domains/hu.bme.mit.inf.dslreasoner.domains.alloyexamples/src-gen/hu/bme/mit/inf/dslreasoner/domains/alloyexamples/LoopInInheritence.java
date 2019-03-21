/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.alloyexamples/patterns/hu/bme/mit/inf/dslreasoner/domains/alloyexamples/Ecore.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples;

import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.DirectSupertype;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
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
 *         pattern loopInInheritence(a: EClass) {
 *         	find directSupertype+(a,a);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class LoopInInheritence extends BaseGeneratedEMFQuerySpecification<LoopInInheritence.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.loopInInheritence pattern,
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
    private EClass fA;
    
    private static List<String> parameterNames = makeImmutableList("a");
    
    private Match(final EClass pA) {
      this.fA = pA;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("a".equals(parameterName)) return this.fA;
      return null;
    }
    
    public EClass getA() {
      return this.fA;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (EClass) newValue;
          return true;
      }
      return false;
    }
    
    public void setA(final EClass pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.loopInInheritence";
    }
    
    @Override
    public List<String> parameterNames() {
      return LoopInInheritence.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fA};
    }
    
    @Override
    public LoopInInheritence.Match toImmutable() {
      return isMutable() ? newMatch(fA) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a\"=" + prettyPrintValue(fA));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fA);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof LoopInInheritence.Match)) {
          LoopInInheritence.Match other = (LoopInInheritence.Match) obj;
          return Objects.equals(fA, other.fA);
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
    public LoopInInheritence specification() {
      return LoopInInheritence.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static LoopInInheritence.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static LoopInInheritence.Match newMutableMatch(final EClass pA) {
      return new Mutable(pA);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static LoopInInheritence.Match newMatch(final EClass pA) {
      return new Immutable(pA);
    }
    
    private static final class Mutable extends LoopInInheritence.Match {
      Mutable(final EClass pA) {
        super(pA);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends LoopInInheritence.Match {
      Immutable(final EClass pA) {
        super(pA);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.loopInInheritence pattern,
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
   * pattern loopInInheritence(a: EClass) {
   * 	find directSupertype+(a,a);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see LoopInInheritence
   * 
   */
  public static class Matcher extends BaseMatcher<LoopInInheritence.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static LoopInInheritence.Matcher on(final ViatraQueryEngine engine) {
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
    public static LoopInInheritence.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_A = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(LoopInInheritence.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<LoopInInheritence.Match> getAllMatches(final EClass pA) {
      return rawStreamAllMatches(new Object[]{pA}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<LoopInInheritence.Match> streamAllMatches(final EClass pA) {
      return rawStreamAllMatches(new Object[]{pA});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<LoopInInheritence.Match> getOneArbitraryMatch(final EClass pA) {
      return rawGetOneArbitraryMatch(new Object[]{pA});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EClass pA) {
      return rawHasMatch(new Object[]{pA});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EClass pA) {
      return rawCountMatches(new Object[]{pA});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EClass pA, final Consumer<? super LoopInInheritence.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public LoopInInheritence.Match newMatch(final EClass pA) {
      return LoopInInheritence.Match.newMatch(pA);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EClass> rawStreamAllValuesOfa(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A, parameters).map(EClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray());
    }
    
    @Override
    protected LoopInInheritence.Match tupleToMatch(final Tuple t) {
      try {
          return LoopInInheritence.Match.newMatch((EClass) t.get(POSITION_A));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected LoopInInheritence.Match arrayToMatch(final Object[] match) {
      try {
          return LoopInInheritence.Match.newMatch((EClass) match[POSITION_A]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected LoopInInheritence.Match arrayToMatchMutable(final Object[] match) {
      try {
          return LoopInInheritence.Match.newMutableMatch((EClass) match[POSITION_A]);
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
    public static IQuerySpecification<LoopInInheritence.Matcher> querySpecification() {
      return LoopInInheritence.instance();
    }
  }
  
  private LoopInInheritence() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static LoopInInheritence instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected LoopInInheritence.Matcher instantiate(final ViatraQueryEngine engine) {
    return LoopInInheritence.Matcher.on(engine);
  }
  
  @Override
  public LoopInInheritence.Matcher instantiate() {
    return LoopInInheritence.Matcher.create();
  }
  
  @Override
  public LoopInInheritence.Match newEmptyMatch() {
    return LoopInInheritence.Match.newEmptyMatch();
  }
  
  @Override
  public LoopInInheritence.Match newMatch(final Object... parameters) {
    return LoopInInheritence.Match.newMatch((org.eclipse.emf.ecore.EClass) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.LoopInInheritence (visibility: PUBLIC, simpleName: LoopInInheritence, identifier: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.LoopInInheritence, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.alloyexamples) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.LoopInInheritence (visibility: PUBLIC, simpleName: LoopInInheritence, identifier: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.LoopInInheritence, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.alloyexamples) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static LoopInInheritence INSTANCE = new LoopInInheritence();
    
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
    private final static LoopInInheritence.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_a = new PParameter("a", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_a);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.loopInInheritence";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a)
          ));
          // 	find directSupertype+(a,a)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_a, var_a), DirectSupertype.instance().getInternalQueryRepresentation());
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
