/**
 * Generated from platform:/resource/ca.mcgill.rtgmrt.example.modes3/src/modes3/queries/Modes3Queries.vql
 */
package modes3.queries;

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
import modes3.Turnout;
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
 *         {@literal @}Constraint(message = "turnoutConnectedToBothOutputs", severity = "error", key = { T })
 *         pattern turnoutConnectedToBothOutputs(T : Turnout) {
 *         	Turnout.straight(T, Straight);
 *         	Turnout.divergent(T, Divergent);
 *         	Segment.connectedTo(T, Straight);
 *         	Segment.connectedTo(T, Divergent);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TurnoutConnectedToBothOutputs extends BaseGeneratedEMFQuerySpecification<TurnoutConnectedToBothOutputs.Matcher> {
  /**
   * Pattern-specific match representation of the modes3.queries.turnoutConnectedToBothOutputs pattern,
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
    private Turnout fT;
    
    private static List<String> parameterNames = makeImmutableList("T");
    
    private Match(final Turnout pT) {
      this.fT = pT;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "T": return this.fT;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fT;
          default: return null;
      }
    }
    
    public Turnout getT() {
      return this.fT;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("T".equals(parameterName) ) {
          this.fT = (Turnout) newValue;
          return true;
      }
      return false;
    }
    
    public void setT(final Turnout pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    @Override
    public String patternName() {
      return "modes3.queries.turnoutConnectedToBothOutputs";
    }
    
    @Override
    public List<String> parameterNames() {
      return TurnoutConnectedToBothOutputs.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fT};
    }
    
    @Override
    public TurnoutConnectedToBothOutputs.Match toImmutable() {
      return isMutable() ? newMatch(fT) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"T\"=" + prettyPrintValue(fT));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fT);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TurnoutConnectedToBothOutputs.Match)) {
          TurnoutConnectedToBothOutputs.Match other = (TurnoutConnectedToBothOutputs.Match) obj;
          return Objects.equals(fT, other.fT);
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
    public TurnoutConnectedToBothOutputs specification() {
      return TurnoutConnectedToBothOutputs.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TurnoutConnectedToBothOutputs.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TurnoutConnectedToBothOutputs.Match newMutableMatch(final Turnout pT) {
      return new Mutable(pT);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TurnoutConnectedToBothOutputs.Match newMatch(final Turnout pT) {
      return new Immutable(pT);
    }
    
    private static final class Mutable extends TurnoutConnectedToBothOutputs.Match {
      Mutable(final Turnout pT) {
        super(pT);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TurnoutConnectedToBothOutputs.Match {
      Immutable(final Turnout pT) {
        super(pT);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the modes3.queries.turnoutConnectedToBothOutputs pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(message = "turnoutConnectedToBothOutputs", severity = "error", key = { T })
   * pattern turnoutConnectedToBothOutputs(T : Turnout) {
   * 	Turnout.straight(T, Straight);
   * 	Turnout.divergent(T, Divergent);
   * 	Segment.connectedTo(T, Straight);
   * 	Segment.connectedTo(T, Divergent);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TurnoutConnectedToBothOutputs
   * 
   */
  public static class Matcher extends BaseMatcher<TurnoutConnectedToBothOutputs.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TurnoutConnectedToBothOutputs.Matcher on(final ViatraQueryEngine engine) {
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
    public static TurnoutConnectedToBothOutputs.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_T = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TurnoutConnectedToBothOutputs.Matcher.class);
    
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
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TurnoutConnectedToBothOutputs.Match> getAllMatches(final Turnout pT) {
      return rawStreamAllMatches(new Object[]{pT}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TurnoutConnectedToBothOutputs.Match> streamAllMatches(final Turnout pT) {
      return rawStreamAllMatches(new Object[]{pT});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TurnoutConnectedToBothOutputs.Match> getOneArbitraryMatch(final Turnout pT) {
      return rawGetOneArbitraryMatch(new Object[]{pT});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Turnout pT) {
      return rawHasMatch(new Object[]{pT});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Turnout pT) {
      return rawCountMatches(new Object[]{pT});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Turnout pT, final Consumer<? super TurnoutConnectedToBothOutputs.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TurnoutConnectedToBothOutputs.Match newMatch(final Turnout pT) {
      return TurnoutConnectedToBothOutputs.Match.newMatch(pT);
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Turnout> rawStreamAllValuesOfT(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(Turnout.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Turnout> getAllValuesOfT() {
      return rawStreamAllValuesOfT(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Turnout> streamAllValuesOfT() {
      return rawStreamAllValuesOfT(emptyArray());
    }
    
    @Override
    protected TurnoutConnectedToBothOutputs.Match tupleToMatch(final Tuple t) {
      try {
          return TurnoutConnectedToBothOutputs.Match.newMatch((Turnout) t.get(POSITION_T));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TurnoutConnectedToBothOutputs.Match arrayToMatch(final Object[] match) {
      try {
          return TurnoutConnectedToBothOutputs.Match.newMatch((Turnout) match[POSITION_T]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TurnoutConnectedToBothOutputs.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TurnoutConnectedToBothOutputs.Match.newMutableMatch((Turnout) match[POSITION_T]);
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
    public static IQuerySpecification<TurnoutConnectedToBothOutputs.Matcher> querySpecification() {
      return TurnoutConnectedToBothOutputs.instance();
    }
  }
  
  private TurnoutConnectedToBothOutputs() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TurnoutConnectedToBothOutputs instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TurnoutConnectedToBothOutputs.Matcher instantiate(final ViatraQueryEngine engine) {
    return TurnoutConnectedToBothOutputs.Matcher.on(engine);
  }
  
  @Override
  public TurnoutConnectedToBothOutputs.Matcher instantiate() {
    return TurnoutConnectedToBothOutputs.Matcher.create();
  }
  
  @Override
  public TurnoutConnectedToBothOutputs.Match newEmptyMatch() {
    return TurnoutConnectedToBothOutputs.Match.newEmptyMatch();
  }
  
  @Override
  public TurnoutConnectedToBothOutputs.Match newMatch(final Object... parameters) {
    return TurnoutConnectedToBothOutputs.Match.newMatch((modes3.Turnout) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TurnoutConnectedToBothOutputs} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TurnoutConnectedToBothOutputs#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TurnoutConnectedToBothOutputs INSTANCE = new TurnoutConnectedToBothOutputs();
    
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
    private static final TurnoutConnectedToBothOutputs.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_T = new PParameter("T", "modes3.Turnout", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_T);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "modes3.queries.turnoutConnectedToBothOutputs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T");
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
          PVariable var_T = body.getOrCreateVariableByName("T");
          PVariable var_Straight = body.getOrCreateVariableByName("Straight");
          PVariable var_Divergent = body.getOrCreateVariableByName("Divergent");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_T, parameter_T)
          ));
          // 	Turnout.straight(T, Straight)
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout", "straight")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_0_, var_Straight);
          // 	Turnout.divergent(T, Divergent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Turnout", "divergent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_1_, var_Divergent);
          // 	Segment.connectedTo(T, Straight)
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment", "connectedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_2_, var_Straight);
          // 	Segment.connectedTo(T, Divergent)
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment", "connectedTo")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_3_, var_Divergent);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "turnoutConnectedToBothOutputs");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("T")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
