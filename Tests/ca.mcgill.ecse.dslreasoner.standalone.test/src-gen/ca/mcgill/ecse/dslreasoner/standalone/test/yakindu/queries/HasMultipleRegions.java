/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.CompositeElement;
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
 *         pattern hasMultipleRegions(composite: CompositeElement) {
 *         	CompositeElement.regions(composite,region1);
 *         	CompositeElement.regions(composite,region2);
 *         	region1 != region2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class HasMultipleRegions extends BaseGeneratedEMFQuerySpecification<HasMultipleRegions.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleRegions pattern,
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
    private CompositeElement fComposite;
    
    private static List<String> parameterNames = makeImmutableList("composite");
    
    private Match(final CompositeElement pComposite) {
      this.fComposite = pComposite;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("composite".equals(parameterName)) return this.fComposite;
      return null;
    }
    
    public CompositeElement getComposite() {
      return this.fComposite;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("composite".equals(parameterName) ) {
          this.fComposite = (CompositeElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setComposite(final CompositeElement pComposite) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fComposite = pComposite;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleRegions";
    }
    
    @Override
    public List<String> parameterNames() {
      return HasMultipleRegions.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fComposite};
    }
    
    @Override
    public HasMultipleRegions.Match toImmutable() {
      return isMutable() ? newMatch(fComposite) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"composite\"=" + prettyPrintValue(fComposite));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fComposite);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof HasMultipleRegions.Match)) {
          HasMultipleRegions.Match other = (HasMultipleRegions.Match) obj;
          return Objects.equals(fComposite, other.fComposite);
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
    public HasMultipleRegions specification() {
      return HasMultipleRegions.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static HasMultipleRegions.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static HasMultipleRegions.Match newMutableMatch(final CompositeElement pComposite) {
      return new Mutable(pComposite);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static HasMultipleRegions.Match newMatch(final CompositeElement pComposite) {
      return new Immutable(pComposite);
    }
    
    private static final class Mutable extends HasMultipleRegions.Match {
      Mutable(final CompositeElement pComposite) {
        super(pComposite);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends HasMultipleRegions.Match {
      Immutable(final CompositeElement pComposite) {
        super(pComposite);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleRegions pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern hasMultipleRegions(composite: CompositeElement) {
   * 	CompositeElement.regions(composite,region1);
   * 	CompositeElement.regions(composite,region2);
   * 	region1 != region2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see HasMultipleRegions
   * 
   */
  public static class Matcher extends BaseMatcher<HasMultipleRegions.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static HasMultipleRegions.Matcher on(final ViatraQueryEngine engine) {
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
    public static HasMultipleRegions.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_COMPOSITE = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(HasMultipleRegions.Matcher.class);
    
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
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<HasMultipleRegions.Match> getAllMatches(final CompositeElement pComposite) {
      return rawStreamAllMatches(new Object[]{pComposite}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<HasMultipleRegions.Match> streamAllMatches(final CompositeElement pComposite) {
      return rawStreamAllMatches(new Object[]{pComposite});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<HasMultipleRegions.Match> getOneArbitraryMatch(final CompositeElement pComposite) {
      return rawGetOneArbitraryMatch(new Object[]{pComposite});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final CompositeElement pComposite) {
      return rawHasMatch(new Object[]{pComposite});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final CompositeElement pComposite) {
      return rawCountMatches(new Object[]{pComposite});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final CompositeElement pComposite, final Consumer<? super HasMultipleRegions.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pComposite}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pComposite the fixed value of pattern parameter composite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public HasMultipleRegions.Match newMatch(final CompositeElement pComposite) {
      return HasMultipleRegions.Match.newMatch(pComposite);
    }
    
    /**
     * Retrieve the set of values that occur in matches for composite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<CompositeElement> rawStreamAllValuesOfcomposite(final Object[] parameters) {
      return rawStreamAllValues(POSITION_COMPOSITE, parameters).map(CompositeElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for composite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CompositeElement> getAllValuesOfcomposite() {
      return rawStreamAllValuesOfcomposite(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for composite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<CompositeElement> streamAllValuesOfcomposite() {
      return rawStreamAllValuesOfcomposite(emptyArray());
    }
    
    @Override
    protected HasMultipleRegions.Match tupleToMatch(final Tuple t) {
      try {
          return HasMultipleRegions.Match.newMatch((CompositeElement) t.get(POSITION_COMPOSITE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected HasMultipleRegions.Match arrayToMatch(final Object[] match) {
      try {
          return HasMultipleRegions.Match.newMatch((CompositeElement) match[POSITION_COMPOSITE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected HasMultipleRegions.Match arrayToMatchMutable(final Object[] match) {
      try {
          return HasMultipleRegions.Match.newMutableMatch((CompositeElement) match[POSITION_COMPOSITE]);
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
    public static IQuerySpecification<HasMultipleRegions.Matcher> querySpecification() {
      return HasMultipleRegions.instance();
    }
  }
  
  private HasMultipleRegions() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static HasMultipleRegions instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected HasMultipleRegions.Matcher instantiate(final ViatraQueryEngine engine) {
    return HasMultipleRegions.Matcher.on(engine);
  }
  
  @Override
  public HasMultipleRegions.Matcher instantiate() {
    return HasMultipleRegions.Matcher.create();
  }
  
  @Override
  public HasMultipleRegions.Match newEmptyMatch() {
    return HasMultipleRegions.Match.newEmptyMatch();
  }
  
  @Override
  public HasMultipleRegions.Match newMatch(final Object... parameters) {
    return HasMultipleRegions.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.CompositeElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleRegions (visibility: PUBLIC, simpleName: HasMultipleRegions, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleRegions, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleRegions (visibility: PUBLIC, simpleName: HasMultipleRegions, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.HasMultipleRegions, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static HasMultipleRegions INSTANCE = new HasMultipleRegions();
    
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
    private final static HasMultipleRegions.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_composite = new PParameter("composite", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.CompositeElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "CompositeElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_composite);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.hasMultipleRegions";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("composite");
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
          PVariable var_composite = body.getOrCreateVariableByName("composite");
          PVariable var_region1 = body.getOrCreateVariableByName("region1");
          PVariable var_region2 = body.getOrCreateVariableByName("region2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_composite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "CompositeElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_composite, parameter_composite)
          ));
          // 	CompositeElement.regions(composite,region1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_composite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "CompositeElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_composite, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "CompositeElement", "regions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          new Equality(body, var__virtual_0_, var_region1);
          // 	CompositeElement.regions(composite,region2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_composite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "CompositeElement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_composite, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "CompositeElement", "regions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Region")));
          new Equality(body, var__virtual_1_, var_region2);
          // 	region1 != region2
          new Inequality(body, var_region1, var_region2);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
