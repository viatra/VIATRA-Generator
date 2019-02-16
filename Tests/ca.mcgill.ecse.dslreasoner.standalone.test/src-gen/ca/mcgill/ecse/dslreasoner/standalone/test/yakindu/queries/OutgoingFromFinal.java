/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.standalone.test/queries/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/queries/yakinduPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries;

import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.FinalState;
import ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition;
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
 *         /////////
 *         // Final
 *         /////////
 *         
 *         {@literal @}Constraint(severity="error", message="error", key = {f})
 *         pattern outgoingFromFinal(t : Transition, f : FinalState) {
 *         	FinalState.outgoingTransitions(f,t);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class OutgoingFromFinal extends BaseGeneratedEMFQuerySpecification<OutgoingFromFinal.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.outgoingFromFinal pattern,
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
    private Transition fT;
    
    private FinalState fF;
    
    private static List<String> parameterNames = makeImmutableList("t", "f");
    
    private Match(final Transition pT, final FinalState pF) {
      this.fT = pT;
      this.fF = pF;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("t".equals(parameterName)) return this.fT;
      if ("f".equals(parameterName)) return this.fF;
      return null;
    }
    
    public Transition getT() {
      return this.fT;
    }
    
    public FinalState getF() {
      return this.fF;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("t".equals(parameterName) ) {
          this.fT = (Transition) newValue;
          return true;
      }
      if ("f".equals(parameterName) ) {
          this.fF = (FinalState) newValue;
          return true;
      }
      return false;
    }
    
    public void setT(final Transition pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    public void setF(final FinalState pF) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fF = pF;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.outgoingFromFinal";
    }
    
    @Override
    public List<String> parameterNames() {
      return OutgoingFromFinal.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fT, fF};
    }
    
    @Override
    public OutgoingFromFinal.Match toImmutable() {
      return isMutable() ? newMatch(fT, fF) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"t\"=" + prettyPrintValue(fT) + ", ");
      result.append("\"f\"=" + prettyPrintValue(fF));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fT, fF);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof OutgoingFromFinal.Match)) {
          OutgoingFromFinal.Match other = (OutgoingFromFinal.Match) obj;
          return Objects.equals(fT, other.fT) && Objects.equals(fF, other.fF);
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
    public OutgoingFromFinal specification() {
      return OutgoingFromFinal.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static OutgoingFromFinal.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static OutgoingFromFinal.Match newMutableMatch(final Transition pT, final FinalState pF) {
      return new Mutable(pT, pF);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static OutgoingFromFinal.Match newMatch(final Transition pT, final FinalState pF) {
      return new Immutable(pT, pF);
    }
    
    private static final class Mutable extends OutgoingFromFinal.Match {
      Mutable(final Transition pT, final FinalState pF) {
        super(pT, pF);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends OutgoingFromFinal.Match {
      Immutable(final Transition pT, final FinalState pF) {
        super(pT, pF);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.outgoingFromFinal pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * /////////
   * // Final
   * /////////
   * 
   * {@literal @}Constraint(severity="error", message="error", key = {f})
   * pattern outgoingFromFinal(t : Transition, f : FinalState) {
   * 	FinalState.outgoingTransitions(f,t);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see OutgoingFromFinal
   * 
   */
  public static class Matcher extends BaseMatcher<OutgoingFromFinal.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static OutgoingFromFinal.Matcher on(final ViatraQueryEngine engine) {
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
    public static OutgoingFromFinal.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_T = 0;
    
    private final static int POSITION_F = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OutgoingFromFinal.Matcher.class);
    
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
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<OutgoingFromFinal.Match> getAllMatches(final Transition pT, final FinalState pF) {
      return rawStreamAllMatches(new Object[]{pT, pF}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<OutgoingFromFinal.Match> streamAllMatches(final Transition pT, final FinalState pF) {
      return rawStreamAllMatches(new Object[]{pT, pF});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<OutgoingFromFinal.Match> getOneArbitraryMatch(final Transition pT, final FinalState pF) {
      return rawGetOneArbitraryMatch(new Object[]{pT, pF});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Transition pT, final FinalState pF) {
      return rawHasMatch(new Object[]{pT, pF});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Transition pT, final FinalState pF) {
      return rawCountMatches(new Object[]{pT, pF});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Transition pT, final FinalState pF, final Consumer<? super OutgoingFromFinal.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT, pF}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter t, or null if not bound.
     * @param pF the fixed value of pattern parameter f, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public OutgoingFromFinal.Match newMatch(final Transition pT, final FinalState pF) {
      return OutgoingFromFinal.Match.newMatch(pT, pF);
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Transition> rawStreamAllValuesOft(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(Transition.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft() {
      return rawStreamAllValuesOft(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft(final OutgoingFromFinal.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Transition> streamAllValuesOft(final FinalState pF) {
      return rawStreamAllValuesOft(new Object[]{null, pF});
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft(final OutgoingFromFinal.Match partialMatch) {
      return rawStreamAllValuesOft(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for t.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Transition> getAllValuesOft(final FinalState pF) {
      return rawStreamAllValuesOft(new Object[]{null, pF}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FinalState> rawStreamAllValuesOff(final Object[] parameters) {
      return rawStreamAllValues(POSITION_F, parameters).map(FinalState.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FinalState> getAllValuesOff() {
      return rawStreamAllValuesOff(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FinalState> streamAllValuesOff() {
      return rawStreamAllValuesOff(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FinalState> streamAllValuesOff(final OutgoingFromFinal.Match partialMatch) {
      return rawStreamAllValuesOff(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FinalState> streamAllValuesOff(final Transition pT) {
      return rawStreamAllValuesOff(new Object[]{pT, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FinalState> getAllValuesOff(final OutgoingFromFinal.Match partialMatch) {
      return rawStreamAllValuesOff(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for f.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FinalState> getAllValuesOff(final Transition pT) {
      return rawStreamAllValuesOff(new Object[]{pT, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected OutgoingFromFinal.Match tupleToMatch(final Tuple t) {
      try {
          return OutgoingFromFinal.Match.newMatch((Transition) t.get(POSITION_T), (FinalState) t.get(POSITION_F));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected OutgoingFromFinal.Match arrayToMatch(final Object[] match) {
      try {
          return OutgoingFromFinal.Match.newMatch((Transition) match[POSITION_T], (FinalState) match[POSITION_F]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected OutgoingFromFinal.Match arrayToMatchMutable(final Object[] match) {
      try {
          return OutgoingFromFinal.Match.newMutableMatch((Transition) match[POSITION_T], (FinalState) match[POSITION_F]);
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
    public static IQuerySpecification<OutgoingFromFinal.Matcher> querySpecification() {
      return OutgoingFromFinal.instance();
    }
  }
  
  private OutgoingFromFinal() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static OutgoingFromFinal instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected OutgoingFromFinal.Matcher instantiate(final ViatraQueryEngine engine) {
    return OutgoingFromFinal.Matcher.on(engine);
  }
  
  @Override
  public OutgoingFromFinal.Matcher instantiate() {
    return OutgoingFromFinal.Matcher.create();
  }
  
  @Override
  public OutgoingFromFinal.Match newEmptyMatch() {
    return OutgoingFromFinal.Match.newEmptyMatch();
  }
  
  @Override
  public OutgoingFromFinal.Match newMatch(final Object... parameters) {
    return OutgoingFromFinal.Match.newMatch((ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition) parameters[0], (ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.FinalState) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.OutgoingFromFinal (visibility: PUBLIC, simpleName: OutgoingFromFinal, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.OutgoingFromFinal, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.OutgoingFromFinal (visibility: PUBLIC, simpleName: OutgoingFromFinal, identifier: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.OutgoingFromFinal, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static OutgoingFromFinal INSTANCE = new OutgoingFromFinal();
    
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
    private final static OutgoingFromFinal.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_t = new PParameter("t", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "Transition")), PParameterDirection.INOUT);
    
    private final PParameter parameter_f = new PParameter("f", "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.FinalState", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("YakinduMetamodel", "FinalState")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_t, parameter_f);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.queries.outgoingFromFinal";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t","f");
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
          PVariable var_t = body.getOrCreateVariableByName("t");
          PVariable var_f = body.getOrCreateVariableByName("f");
          new TypeConstraint(body, Tuples.flatTupleOf(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "FinalState")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_t, parameter_t),
             new ExportedParameter(body, var_f, parameter_f)
          ));
          // 	FinalState.outgoingTransitions(f,t)
          new TypeConstraint(body, Tuples.flatTupleOf(var_f), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "FinalState")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_f, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("YakinduMetamodel", "Vertex", "outgoingTransitions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("YakinduMetamodel", "Transition")));
          new Equality(body, var__virtual_0_, var_t);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("f")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
