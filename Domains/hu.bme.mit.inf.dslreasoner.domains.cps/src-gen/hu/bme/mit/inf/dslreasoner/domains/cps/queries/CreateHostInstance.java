/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
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
 *         pattern createHostInstance(HostType : HostType) {
 *         	find unallocatedAppInstance(App);
 *         	ApplicationInstance.type.requirements.hostType(App, HostType);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class CreateHostInstance extends BaseGeneratedEMFQuerySpecification<CreateHostInstance.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.createHostInstance pattern,
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
    private HostType fHostType;
    
    private static List<String> parameterNames = makeImmutableList("HostType");
    
    private Match(final HostType pHostType) {
      this.fHostType = pHostType;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "HostType": return this.fHostType;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fHostType;
          default: return null;
      }
    }
    
    public HostType getHostType() {
      return this.fHostType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("HostType".equals(parameterName) ) {
          this.fHostType = (HostType) newValue;
          return true;
      }
      return false;
    }
    
    public void setHostType(final HostType pHostType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHostType = pHostType;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.createHostInstance";
    }
    
    @Override
    public List<String> parameterNames() {
      return CreateHostInstance.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fHostType};
    }
    
    @Override
    public CreateHostInstance.Match toImmutable() {
      return isMutable() ? newMatch(fHostType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"HostType\"=" + prettyPrintValue(fHostType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fHostType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof CreateHostInstance.Match)) {
          CreateHostInstance.Match other = (CreateHostInstance.Match) obj;
          return Objects.equals(fHostType, other.fHostType);
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
    public CreateHostInstance specification() {
      return CreateHostInstance.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static CreateHostInstance.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static CreateHostInstance.Match newMutableMatch(final HostType pHostType) {
      return new Mutable(pHostType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static CreateHostInstance.Match newMatch(final HostType pHostType) {
      return new Immutable(pHostType);
    }
    
    private static final class Mutable extends CreateHostInstance.Match {
      Mutable(final HostType pHostType) {
        super(pHostType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends CreateHostInstance.Match {
      Immutable(final HostType pHostType) {
        super(pHostType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.createHostInstance pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern createHostInstance(HostType : HostType) {
   * 	find unallocatedAppInstance(App);
   * 	ApplicationInstance.type.requirements.hostType(App, HostType);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see CreateHostInstance
   * 
   */
  public static class Matcher extends BaseMatcher<CreateHostInstance.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static CreateHostInstance.Matcher on(final ViatraQueryEngine engine) {
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
    public static CreateHostInstance.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_HOSTTYPE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(CreateHostInstance.Matcher.class);
    
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
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<CreateHostInstance.Match> getAllMatches(final HostType pHostType) {
      return rawStreamAllMatches(new Object[]{pHostType}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<CreateHostInstance.Match> streamAllMatches(final HostType pHostType) {
      return rawStreamAllMatches(new Object[]{pHostType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<CreateHostInstance.Match> getOneArbitraryMatch(final HostType pHostType) {
      return rawGetOneArbitraryMatch(new Object[]{pHostType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final HostType pHostType) {
      return rawHasMatch(new Object[]{pHostType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final HostType pHostType) {
      return rawCountMatches(new Object[]{pHostType});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final HostType pHostType, final Consumer<? super CreateHostInstance.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pHostType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHostType the fixed value of pattern parameter HostType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public CreateHostInstance.Match newMatch(final HostType pHostType) {
      return CreateHostInstance.Match.newMatch(pHostType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<HostType> rawStreamAllValuesOfHostType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_HOSTTYPE, parameters).map(HostType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostType> getAllValuesOfHostType() {
      return rawStreamAllValuesOfHostType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for HostType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<HostType> streamAllValuesOfHostType() {
      return rawStreamAllValuesOfHostType(emptyArray());
    }
    
    @Override
    protected CreateHostInstance.Match tupleToMatch(final Tuple t) {
      try {
          return CreateHostInstance.Match.newMatch((HostType) t.get(POSITION_HOSTTYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CreateHostInstance.Match arrayToMatch(final Object[] match) {
      try {
          return CreateHostInstance.Match.newMatch((HostType) match[POSITION_HOSTTYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected CreateHostInstance.Match arrayToMatchMutable(final Object[] match) {
      try {
          return CreateHostInstance.Match.newMutableMatch((HostType) match[POSITION_HOSTTYPE]);
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
    public static IQuerySpecification<CreateHostInstance.Matcher> querySpecification() {
      return CreateHostInstance.instance();
    }
  }
  
  private CreateHostInstance() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CreateHostInstance instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected CreateHostInstance.Matcher instantiate(final ViatraQueryEngine engine) {
    return CreateHostInstance.Matcher.on(engine);
  }
  
  @Override
  public CreateHostInstance.Matcher instantiate() {
    return CreateHostInstance.Matcher.create();
  }
  
  @Override
  public CreateHostInstance.Match newEmptyMatch() {
    return CreateHostInstance.Match.newEmptyMatch();
  }
  
  @Override
  public CreateHostInstance.Match newMatch(final Object... parameters) {
    return CreateHostInstance.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.HostType) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link CreateHostInstance} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link CreateHostInstance#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CreateHostInstance INSTANCE = new CreateHostInstance();
    
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
    private static final CreateHostInstance.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_HostType = new PParameter("HostType", "hu.bme.mit.inf.dslreasoner.domains.cps.HostType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_HostType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.createHostInstance";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("HostType");
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
          PVariable var_HostType = body.getOrCreateVariableByName("HostType");
          PVariable var_App = body.getOrCreateVariableByName("App");
          new TypeConstraint(body, Tuples.flatTupleOf(var_HostType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_HostType, parameter_HostType)
          ));
          // 	find unallocatedAppInstance(App)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_App), UnallocatedAppInstance.instance().getInternalQueryRepresentation());
          // 	ApplicationInstance.type.requirements.hostType(App, HostType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationType")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationType", "requirements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ResourceRequirement")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ResourceRequirement", "hostType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostType")));
          new Equality(body, var__virtual_2_, var_HostType);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
