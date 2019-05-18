/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;
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
 *         {@literal @}Constraint(severity = "error", key = {Req},
 *         	message = "Redundant instances must not be allocated to the same host.")
 *         pattern redundantInstancesOnSameHost(Req : Requirement) {
 *         	Requirement.instances(Req, App1);
 *         	Requirement.instances(Req, App2);
 *         	App1 != App2;
 *         	ApplicationInstance.allocatedTo(App1, Host);
 *         	ApplicationInstance.allocatedTo(App2, Host);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RedundantInstancesOnSameHost extends BaseGeneratedEMFQuerySpecification<RedundantInstancesOnSameHost.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.redundantInstancesOnSameHost pattern,
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
    private Requirement fReq;
    
    private static List<String> parameterNames = makeImmutableList("Req");
    
    private Match(final Requirement pReq) {
      this.fReq = pReq;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Req".equals(parameterName)) return this.fReq;
      return null;
    }
    
    public Requirement getReq() {
      return this.fReq;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Req".equals(parameterName) ) {
          this.fReq = (Requirement) newValue;
          return true;
      }
      return false;
    }
    
    public void setReq(final Requirement pReq) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReq = pReq;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.redundantInstancesOnSameHost";
    }
    
    @Override
    public List<String> parameterNames() {
      return RedundantInstancesOnSameHost.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReq};
    }
    
    @Override
    public RedundantInstancesOnSameHost.Match toImmutable() {
      return isMutable() ? newMatch(fReq) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Req\"=" + prettyPrintValue(fReq));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fReq);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RedundantInstancesOnSameHost.Match)) {
          RedundantInstancesOnSameHost.Match other = (RedundantInstancesOnSameHost.Match) obj;
          return Objects.equals(fReq, other.fReq);
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
    public RedundantInstancesOnSameHost specification() {
      return RedundantInstancesOnSameHost.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RedundantInstancesOnSameHost.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RedundantInstancesOnSameHost.Match newMutableMatch(final Requirement pReq) {
      return new Mutable(pReq);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RedundantInstancesOnSameHost.Match newMatch(final Requirement pReq) {
      return new Immutable(pReq);
    }
    
    private static final class Mutable extends RedundantInstancesOnSameHost.Match {
      Mutable(final Requirement pReq) {
        super(pReq);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RedundantInstancesOnSameHost.Match {
      Immutable(final Requirement pReq) {
        super(pReq);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.redundantInstancesOnSameHost pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity = "error", key = {Req},
   * 	message = "Redundant instances must not be allocated to the same host.")
   * pattern redundantInstancesOnSameHost(Req : Requirement) {
   * 	Requirement.instances(Req, App1);
   * 	Requirement.instances(Req, App2);
   * 	App1 != App2;
   * 	ApplicationInstance.allocatedTo(App1, Host);
   * 	ApplicationInstance.allocatedTo(App2, Host);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RedundantInstancesOnSameHost
   * 
   */
  public static class Matcher extends BaseMatcher<RedundantInstancesOnSameHost.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RedundantInstancesOnSameHost.Matcher on(final ViatraQueryEngine engine) {
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
    public static RedundantInstancesOnSameHost.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_REQ = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RedundantInstancesOnSameHost.Matcher.class);
    
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
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RedundantInstancesOnSameHost.Match> getAllMatches(final Requirement pReq) {
      return rawStreamAllMatches(new Object[]{pReq}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RedundantInstancesOnSameHost.Match> streamAllMatches(final Requirement pReq) {
      return rawStreamAllMatches(new Object[]{pReq});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RedundantInstancesOnSameHost.Match> getOneArbitraryMatch(final Requirement pReq) {
      return rawGetOneArbitraryMatch(new Object[]{pReq});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Requirement pReq) {
      return rawHasMatch(new Object[]{pReq});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Requirement pReq) {
      return rawCountMatches(new Object[]{pReq});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Requirement pReq, final Consumer<? super RedundantInstancesOnSameHost.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReq}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReq the fixed value of pattern parameter Req, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RedundantInstancesOnSameHost.Match newMatch(final Requirement pReq) {
      return RedundantInstancesOnSameHost.Match.newMatch(pReq);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Requirement> rawStreamAllValuesOfReq(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REQ, parameters).map(Requirement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Requirement> getAllValuesOfReq() {
      return rawStreamAllValuesOfReq(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Req.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Requirement> streamAllValuesOfReq() {
      return rawStreamAllValuesOfReq(emptyArray());
    }
    
    @Override
    protected RedundantInstancesOnSameHost.Match tupleToMatch(final Tuple t) {
      try {
          return RedundantInstancesOnSameHost.Match.newMatch((Requirement) t.get(POSITION_REQ));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RedundantInstancesOnSameHost.Match arrayToMatch(final Object[] match) {
      try {
          return RedundantInstancesOnSameHost.Match.newMatch((Requirement) match[POSITION_REQ]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RedundantInstancesOnSameHost.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RedundantInstancesOnSameHost.Match.newMutableMatch((Requirement) match[POSITION_REQ]);
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
    public static IQuerySpecification<RedundantInstancesOnSameHost.Matcher> querySpecification() {
      return RedundantInstancesOnSameHost.instance();
    }
  }
  
  private RedundantInstancesOnSameHost() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RedundantInstancesOnSameHost instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RedundantInstancesOnSameHost.Matcher instantiate(final ViatraQueryEngine engine) {
    return RedundantInstancesOnSameHost.Matcher.on(engine);
  }
  
  @Override
  public RedundantInstancesOnSameHost.Matcher instantiate() {
    return RedundantInstancesOnSameHost.Matcher.create();
  }
  
  @Override
  public RedundantInstancesOnSameHost.Match newEmptyMatch() {
    return RedundantInstancesOnSameHost.Match.newEmptyMatch();
  }
  
  @Override
  public RedundantInstancesOnSameHost.Match newMatch(final Object... parameters) {
    return RedundantInstancesOnSameHost.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.Requirement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.RedundantInstancesOnSameHost (visibility: PUBLIC, simpleName: RedundantInstancesOnSameHost, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.RedundantInstancesOnSameHost, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.RedundantInstancesOnSameHost (visibility: PUBLIC, simpleName: RedundantInstancesOnSameHost, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.RedundantInstancesOnSameHost, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RedundantInstancesOnSameHost INSTANCE = new RedundantInstancesOnSameHost();
    
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
    private static final RedundantInstancesOnSameHost.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Req = new PParameter("Req", "hu.bme.mit.inf.dslreasoner.domains.cps.Requirement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "Requirement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Req);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.redundantInstancesOnSameHost";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Req");
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
          PVariable var_Req = body.getOrCreateVariableByName("Req");
          PVariable var_App1 = body.getOrCreateVariableByName("App1");
          PVariable var_App2 = body.getOrCreateVariableByName("App2");
          PVariable var_Host = body.getOrCreateVariableByName("Host");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Req, parameter_Req)
          ));
          // 	Requirement.instances(Req, App1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "Requirement", "instances")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          new Equality(body, var__virtual_0_, var_App1);
          // 	Requirement.instances(Req, App2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "Requirement", "instances")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          new Equality(body, var__virtual_1_, var_App2);
          // 	App1 != App2
          new Inequality(body, var_App1, var_App2);
          // 	ApplicationInstance.allocatedTo(App1, Host)
          new TypeConstraint(body, Tuples.flatTupleOf(var_App1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "allocatedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new Equality(body, var__virtual_2_, var_Host);
          // 	ApplicationInstance.allocatedTo(App2, Host)
          new TypeConstraint(body, Tuples.flatTupleOf(var_App2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App2, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationInstance", "allocatedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new Equality(body, var__virtual_3_, var_Host);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Req")
                              }));
          annotation.addAttribute("message", "Redundant instances must not be allocated to the same host.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
