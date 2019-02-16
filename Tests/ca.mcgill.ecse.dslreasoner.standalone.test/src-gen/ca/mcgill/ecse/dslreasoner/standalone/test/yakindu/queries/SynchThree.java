/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
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
 *         Simplifying model generation
 *          
 *         {@literal @}Constraint(severity="error", message="error", key = {s})
 *         pattern synchThree(s: Synchronization) {
 *         	Transition.target(t1,s);
 *         	Transition.target(t2,s);
 *         	Transition.target(t3,s);
 *         	t1!=t2;
 *         	t2!=t3;
 *         	t1!=t3;
 *         } or {
 *         	Transition.source(t1,s);
 *         	Transition.source(t2,s);
 *         	Transition.source(t3,s);
 *         	t1!=t2;
 *         	t2!=t3;
 *         	t1!=t3;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SynchThree extends BaseGeneratedEMFQuerySpecification<SynchThree.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.synchThree pattern,
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
    private Synchronization fS;
    
    private static List<String> parameterNames = makeImmutableList("s");
    
    private Match(final Synchronization pS) {
      this.fS = pS;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("s".equals(parameterName)) return this.fS;
      return null;
    }
    
    public Synchronization getS() {
      return this.fS;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("s".equals(parameterName) ) {
          this.fS = (Synchronization) newValue;
          return true;
      }
      return false;
    }
    
    public void setS(final Synchronization pS) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fS = pS;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.synchThree";
    }
    
    @Override
    public List<String> parameterNames() {
      return SynchThree.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fS};
    }
    
    @Override
    public SynchThree.Match toImmutable() {
      return isMutable() ? newMatch(fS) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"s\"=" + prettyPrintValue(fS));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fS);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SynchThree.Match)) {
          SynchThree.Match other = (SynchThree.Match) obj;
          return Objects.equals(fS, other.fS);
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
    public SynchThree specification() {
      return SynchThree.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SynchThree.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SynchThree.Match newMutableMatch(final Synchronization pS) {
      return new Mutable(pS);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SynchThree.Match newMatch(final Synchronization pS) {
      return new Immutable(pS);
    }
    
    private static final class Mutable extends SynchThree.Match {
      Mutable(final Synchronization pS) {
        super(pS);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SynchThree.Match {
      Immutable(final Synchronization pS) {
        super(pS);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.synchThree pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * Simplifying model generation
   *  
   * {@literal @}Constraint(severity="error", message="error", key = {s})
   * pattern synchThree(s: Synchronization) {
   * 	Transition.target(t1,s);
   * 	Transition.target(t2,s);
   * 	Transition.target(t3,s);
   * 	t1!=t2;
   * 	t2!=t3;
   * 	t1!=t3;
   * } or {
   * 	Transition.source(t1,s);
   * 	Transition.source(t2,s);
   * 	Transition.source(t3,s);
   * 	t1!=t2;
   * 	t2!=t3;
   * 	t1!=t3;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SynchThree
   * 
   */
  public static class Matcher extends BaseMatcher<SynchThree.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SynchThree.Matcher on(final ViatraQueryEngine engine) {
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
    public static SynchThree.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_S = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SynchThree.Matcher.class);
    
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
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SynchThree.Match> getAllMatches(final Synchronization pS) {
      return rawStreamAllMatches(new Object[]{pS}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SynchThree.Match> streamAllMatches(final Synchronization pS) {
      return rawStreamAllMatches(new Object[]{pS});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SynchThree.Match> getOneArbitraryMatch(final Synchronization pS) {
      return rawGetOneArbitraryMatch(new Object[]{pS});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Synchronization pS) {
      return rawHasMatch(new Object[]{pS});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Synchronization pS) {
      return rawCountMatches(new Object[]{pS});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Synchronization pS, final Consumer<? super SynchThree.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pS}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pS the fixed value of pattern parameter s, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SynchThree.Match newMatch(final Synchronization pS) {
      return SynchThree.Match.newMatch(pS);
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Synchronization> rawStreamAllValuesOfs(final Object[] parameters) {
      return rawStreamAllValues(POSITION_S, parameters).map(Synchronization.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synchronization> getAllValuesOfs() {
      return rawStreamAllValuesOfs(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for s.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Synchronization> streamAllValuesOfs() {
      return rawStreamAllValuesOfs(emptyArray());
    }
    
    @Override
    protected SynchThree.Match tupleToMatch(final Tuple t) {
      try {
          return SynchThree.Match.newMatch((Synchronization) t.get(POSITION_S));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SynchThree.Match arrayToMatch(final Object[] match) {
      try {
          return SynchThree.Match.newMatch((Synchronization) match[POSITION_S]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SynchThree.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SynchThree.Match.newMutableMatch((Synchronization) match[POSITION_S]);
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
    public static IQuerySpecification<SynchThree.Matcher> querySpecification() {
      return SynchThree.instance();
    }
  }
  
  private SynchThree() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SynchThree instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SynchThree.Matcher instantiate(final ViatraQueryEngine engine) {
    return SynchThree.Matcher.on(engine);
  }
  
  @Override
  public SynchThree.Matcher instantiate() {
    return SynchThree.Matcher.create();
  }
  
  @Override
  public SynchThree.Match newEmptyMatch() {
    return SynchThree.Match.newEmptyMatch();
  }
  
  @Override
  public SynchThree.Match newMatch(final Object... parameters) {
    return SynchThree.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchThree (visibility: PUBLIC, simpleName: SynchThree, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchThree, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchThree (visibility: PUBLIC, simpleName: SynchThree, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.SynchThree, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static SynchThree INSTANCE = new SynchThree();
    
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
    private final static SynchThree.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_s = new PParameter("s", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Synchronization", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Synchronization")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_s);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.synchThree";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("s");
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
          PVariable var_s = body.getOrCreateVariableByName("s");
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          PVariable var_t3 = body.getOrCreateVariableByName("t3");
          new TypeConstraint(body, Tuples.flatTupleOf(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Synchronization")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_s, parameter_s)
          ));
          // 	Transition.target(t1,s)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Transition", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_0_, var_s);
          // 	Transition.target(t2,s)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Transition", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_1_, var_s);
          // 	Transition.target(t3,s)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t3), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t3, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Transition", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_2_, var_s);
          // 	t1!=t2
          new Inequality(body, var_t1, var_t2);
          // 	t2!=t3
          new Inequality(body, var_t2, var_t3);
          // 	t1!=t3
          new Inequality(body, var_t1, var_t3);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_s = body.getOrCreateVariableByName("s");
          PVariable var_t1 = body.getOrCreateVariableByName("t1");
          PVariable var_t2 = body.getOrCreateVariableByName("t2");
          PVariable var_t3 = body.getOrCreateVariableByName("t3");
          new TypeConstraint(body, Tuples.flatTupleOf(var_s), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Synchronization")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_s, parameter_s)
          ));
          // 	Transition.source(t1,s)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Transition", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_0_, var_s);
          // 	Transition.source(t2,s)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t2, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Transition", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_1_, var_s);
          // 	Transition.source(t3,s)
          new TypeConstraint(body, Tuples.flatTupleOf(var_t3), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t3, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Transition", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Vertex")));
          new Equality(body, var__virtual_2_, var_s);
          // 	t1!=t2
          new Inequality(body, var_t1, var_t2);
          // 	t2!=t3
          new Inequality(body, var_t2, var_t3);
          // 	t1!=t3
          new Inequality(body, var_t1, var_t3);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("s")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
