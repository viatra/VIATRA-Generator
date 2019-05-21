/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableHdd;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
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
 *         {@literal @}Constraint(severity = "error", key = {Host},
 *         	message = "Insufficient HDD available on host.")
 *         pattern notEnoughAvailableHdd(Host : HostInstance) {
 *         	find availableHdd(Host, Hdd);
 *         	check(Hdd {@literal <} 0);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class NotEnoughAvailableHdd extends BaseGeneratedEMFQuerySpecification<NotEnoughAvailableHdd.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.notEnoughAvailableHdd pattern,
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
    private HostInstance fHost;
    
    private static List<String> parameterNames = makeImmutableList("Host");
    
    private Match(final HostInstance pHost) {
      this.fHost = pHost;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Host".equals(parameterName)) return this.fHost;
      return null;
    }
    
    public HostInstance getHost() {
      return this.fHost;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Host".equals(parameterName) ) {
          this.fHost = (HostInstance) newValue;
          return true;
      }
      return false;
    }
    
    public void setHost(final HostInstance pHost) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHost = pHost;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.notEnoughAvailableHdd";
    }
    
    @Override
    public List<String> parameterNames() {
      return NotEnoughAvailableHdd.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fHost};
    }
    
    @Override
    public NotEnoughAvailableHdd.Match toImmutable() {
      return isMutable() ? newMatch(fHost) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Host\"=" + prettyPrintValue(fHost));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fHost);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof NotEnoughAvailableHdd.Match)) {
          NotEnoughAvailableHdd.Match other = (NotEnoughAvailableHdd.Match) obj;
          return Objects.equals(fHost, other.fHost);
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
    public NotEnoughAvailableHdd specification() {
      return NotEnoughAvailableHdd.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static NotEnoughAvailableHdd.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static NotEnoughAvailableHdd.Match newMutableMatch(final HostInstance pHost) {
      return new Mutable(pHost);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static NotEnoughAvailableHdd.Match newMatch(final HostInstance pHost) {
      return new Immutable(pHost);
    }
    
    private static final class Mutable extends NotEnoughAvailableHdd.Match {
      Mutable(final HostInstance pHost) {
        super(pHost);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends NotEnoughAvailableHdd.Match {
      Immutable(final HostInstance pHost) {
        super(pHost);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.cps.queries.notEnoughAvailableHdd pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity = "error", key = {Host},
   * 	message = "Insufficient HDD available on host.")
   * pattern notEnoughAvailableHdd(Host : HostInstance) {
   * 	find availableHdd(Host, Hdd);
   * 	check(Hdd {@literal <} 0);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see NotEnoughAvailableHdd
   * 
   */
  public static class Matcher extends BaseMatcher<NotEnoughAvailableHdd.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static NotEnoughAvailableHdd.Matcher on(final ViatraQueryEngine engine) {
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
    public static NotEnoughAvailableHdd.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_HOST = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(NotEnoughAvailableHdd.Matcher.class);
    
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
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<NotEnoughAvailableHdd.Match> getAllMatches(final HostInstance pHost) {
      return rawStreamAllMatches(new Object[]{pHost}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<NotEnoughAvailableHdd.Match> streamAllMatches(final HostInstance pHost) {
      return rawStreamAllMatches(new Object[]{pHost});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<NotEnoughAvailableHdd.Match> getOneArbitraryMatch(final HostInstance pHost) {
      return rawGetOneArbitraryMatch(new Object[]{pHost});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final HostInstance pHost) {
      return rawHasMatch(new Object[]{pHost});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final HostInstance pHost) {
      return rawCountMatches(new Object[]{pHost});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final HostInstance pHost, final Consumer<? super NotEnoughAvailableHdd.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pHost}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHost the fixed value of pattern parameter Host, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public NotEnoughAvailableHdd.Match newMatch(final HostInstance pHost) {
      return NotEnoughAvailableHdd.Match.newMatch(pHost);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<HostInstance> rawStreamAllValuesOfHost(final Object[] parameters) {
      return rawStreamAllValues(POSITION_HOST, parameters).map(HostInstance.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<HostInstance> getAllValuesOfHost() {
      return rawStreamAllValuesOfHost(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Host.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<HostInstance> streamAllValuesOfHost() {
      return rawStreamAllValuesOfHost(emptyArray());
    }
    
    @Override
    protected NotEnoughAvailableHdd.Match tupleToMatch(final Tuple t) {
      try {
          return NotEnoughAvailableHdd.Match.newMatch((HostInstance) t.get(POSITION_HOST));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NotEnoughAvailableHdd.Match arrayToMatch(final Object[] match) {
      try {
          return NotEnoughAvailableHdd.Match.newMatch((HostInstance) match[POSITION_HOST]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected NotEnoughAvailableHdd.Match arrayToMatchMutable(final Object[] match) {
      try {
          return NotEnoughAvailableHdd.Match.newMutableMatch((HostInstance) match[POSITION_HOST]);
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
    public static IQuerySpecification<NotEnoughAvailableHdd.Matcher> querySpecification() {
      return NotEnoughAvailableHdd.instance();
    }
  }
  
  private NotEnoughAvailableHdd() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NotEnoughAvailableHdd instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotEnoughAvailableHdd.Matcher instantiate(final ViatraQueryEngine engine) {
    return NotEnoughAvailableHdd.Matcher.on(engine);
  }
  
  @Override
  public NotEnoughAvailableHdd.Matcher instantiate() {
    return NotEnoughAvailableHdd.Matcher.create();
  }
  
  @Override
  public NotEnoughAvailableHdd.Match newEmptyMatch() {
    return NotEnoughAvailableHdd.Match.newEmptyMatch();
  }
  
  @Override
  public NotEnoughAvailableHdd.Match newMatch(final Object... parameters) {
    return NotEnoughAvailableHdd.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableHdd (visibility: PUBLIC, simpleName: NotEnoughAvailableHdd, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableHdd, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableHdd (visibility: PUBLIC, simpleName: NotEnoughAvailableHdd, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableHdd, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NotEnoughAvailableHdd INSTANCE = new NotEnoughAvailableHdd();
    
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
    private static final NotEnoughAvailableHdd.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Host = new PParameter("Host", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Host);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.notEnoughAvailableHdd";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Host");
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
          PVariable var_Host = body.getOrCreateVariableByName("Host");
          PVariable var_Hdd = body.getOrCreateVariableByName("Hdd");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Host, parameter_Host)
          ));
          // 	find availableHdd(Host, Hdd)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Host, var_Hdd), AvailableHdd.instance().getInternalQueryRepresentation());
          // 	check(Hdd < 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern notEnoughAvailableHdd";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("Hdd");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer Hdd = (Integer) provider.getValue("Hdd");
                  return evaluateExpression_1_1(Hdd);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Host")
                              }));
          annotation.addAttribute("message", "Insufficient HDD available on host.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer Hdd) {
    return ((Hdd).intValue() < 0);
  }
}
