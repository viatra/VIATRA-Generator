/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.vampire.test/src/ca/mcgill/ecse/dslreasoner/vampire/queries/FamPatterns.vql
 */
package ca.mcgill.ecse.dslreasoner.vampire.queries;

import functionalarchitecture.FAMTerminator;
import functionalarchitecture.InformationLink;
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
 *         {@literal @}Constraint(message="terminatorAndInformation", severity="error", key={T})
 *         pattern terminatorAndInformation(T : FAMTerminator, I : InformationLink) = {
 *         	FunctionalOutput.outgoingLinks(Out,I);
 *         	FunctionalOutput.terminator(Out,T); 
 *         } or {
 *         	InformationLink.to(I,In);
 *         	FunctionalInput.terminator(In,T);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class TerminatorAndInformation extends BaseGeneratedEMFQuerySpecification<TerminatorAndInformation.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.vampire.queries.terminatorAndInformation pattern,
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
    private FAMTerminator fT;
    
    private InformationLink fI;
    
    private static List<String> parameterNames = makeImmutableList("T", "I");
    
    private Match(final FAMTerminator pT, final InformationLink pI) {
      this.fT = pT;
      this.fI = pI;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("T".equals(parameterName)) return this.fT;
      if ("I".equals(parameterName)) return this.fI;
      return null;
    }
    
    public FAMTerminator getT() {
      return this.fT;
    }
    
    public InformationLink getI() {
      return this.fI;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("T".equals(parameterName) ) {
          this.fT = (FAMTerminator) newValue;
          return true;
      }
      if ("I".equals(parameterName) ) {
          this.fI = (InformationLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setT(final FAMTerminator pT) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fT = pT;
    }
    
    public void setI(final InformationLink pI) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fI = pI;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.vampire.queries.terminatorAndInformation";
    }
    
    @Override
    public List<String> parameterNames() {
      return TerminatorAndInformation.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fT, fI};
    }
    
    @Override
    public TerminatorAndInformation.Match toImmutable() {
      return isMutable() ? newMatch(fT, fI) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"T\"=" + prettyPrintValue(fT) + ", ");
      result.append("\"I\"=" + prettyPrintValue(fI));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fT, fI);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof TerminatorAndInformation.Match)) {
          TerminatorAndInformation.Match other = (TerminatorAndInformation.Match) obj;
          return Objects.equals(fT, other.fT) && Objects.equals(fI, other.fI);
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
    public TerminatorAndInformation specification() {
      return TerminatorAndInformation.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static TerminatorAndInformation.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static TerminatorAndInformation.Match newMutableMatch(final FAMTerminator pT, final InformationLink pI) {
      return new Mutable(pT, pI);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static TerminatorAndInformation.Match newMatch(final FAMTerminator pT, final InformationLink pI) {
      return new Immutable(pT, pI);
    }
    
    private static final class Mutable extends TerminatorAndInformation.Match {
      Mutable(final FAMTerminator pT, final InformationLink pI) {
        super(pT, pI);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends TerminatorAndInformation.Match {
      Immutable(final FAMTerminator pT, final InformationLink pI) {
        super(pT, pI);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.vampire.queries.terminatorAndInformation pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(message="terminatorAndInformation", severity="error", key={T})
   * pattern terminatorAndInformation(T : FAMTerminator, I : InformationLink) = {
   * 	FunctionalOutput.outgoingLinks(Out,I);
   * 	FunctionalOutput.terminator(Out,T); 
   * } or {
   * 	InformationLink.to(I,In);
   * 	FunctionalInput.terminator(In,T);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see TerminatorAndInformation
   * 
   */
  public static class Matcher extends BaseMatcher<TerminatorAndInformation.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static TerminatorAndInformation.Matcher on(final ViatraQueryEngine engine) {
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
    public static TerminatorAndInformation.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_T = 0;
    
    private final static int POSITION_I = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TerminatorAndInformation.Matcher.class);
    
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
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<TerminatorAndInformation.Match> getAllMatches(final FAMTerminator pT, final InformationLink pI) {
      return rawStreamAllMatches(new Object[]{pT, pI}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<TerminatorAndInformation.Match> streamAllMatches(final FAMTerminator pT, final InformationLink pI) {
      return rawStreamAllMatches(new Object[]{pT, pI});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<TerminatorAndInformation.Match> getOneArbitraryMatch(final FAMTerminator pT, final InformationLink pI) {
      return rawGetOneArbitraryMatch(new Object[]{pT, pI});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final FAMTerminator pT, final InformationLink pI) {
      return rawHasMatch(new Object[]{pT, pI});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final FAMTerminator pT, final InformationLink pI) {
      return rawCountMatches(new Object[]{pT, pI});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final FAMTerminator pT, final InformationLink pI, final Consumer<? super TerminatorAndInformation.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pT, pI}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pT the fixed value of pattern parameter T, or null if not bound.
     * @param pI the fixed value of pattern parameter I, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public TerminatorAndInformation.Match newMatch(final FAMTerminator pT, final InformationLink pI) {
      return TerminatorAndInformation.Match.newMatch(pT, pI);
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FAMTerminator> rawStreamAllValuesOfT(final Object[] parameters) {
      return rawStreamAllValues(POSITION_T, parameters).map(FAMTerminator.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FAMTerminator> getAllValuesOfT() {
      return rawStreamAllValuesOfT(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FAMTerminator> streamAllValuesOfT() {
      return rawStreamAllValuesOfT(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FAMTerminator> streamAllValuesOfT(final TerminatorAndInformation.Match partialMatch) {
      return rawStreamAllValuesOfT(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FAMTerminator> streamAllValuesOfT(final InformationLink pI) {
      return rawStreamAllValuesOfT(new Object[]{null, pI});
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FAMTerminator> getAllValuesOfT(final TerminatorAndInformation.Match partialMatch) {
      return rawStreamAllValuesOfT(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for T.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FAMTerminator> getAllValuesOfT(final InformationLink pI) {
      return rawStreamAllValuesOfT(new Object[]{null, pI}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for I.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<InformationLink> rawStreamAllValuesOfI(final Object[] parameters) {
      return rawStreamAllValues(POSITION_I, parameters).map(InformationLink.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for I.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InformationLink> getAllValuesOfI() {
      return rawStreamAllValuesOfI(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for I.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<InformationLink> streamAllValuesOfI() {
      return rawStreamAllValuesOfI(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for I.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<InformationLink> streamAllValuesOfI(final TerminatorAndInformation.Match partialMatch) {
      return rawStreamAllValuesOfI(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for I.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<InformationLink> streamAllValuesOfI(final FAMTerminator pT) {
      return rawStreamAllValuesOfI(new Object[]{pT, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for I.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InformationLink> getAllValuesOfI(final TerminatorAndInformation.Match partialMatch) {
      return rawStreamAllValuesOfI(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for I.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<InformationLink> getAllValuesOfI(final FAMTerminator pT) {
      return rawStreamAllValuesOfI(new Object[]{pT, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected TerminatorAndInformation.Match tupleToMatch(final Tuple t) {
      try {
          return TerminatorAndInformation.Match.newMatch((FAMTerminator) t.get(POSITION_T), (InformationLink) t.get(POSITION_I));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TerminatorAndInformation.Match arrayToMatch(final Object[] match) {
      try {
          return TerminatorAndInformation.Match.newMatch((FAMTerminator) match[POSITION_T], (InformationLink) match[POSITION_I]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected TerminatorAndInformation.Match arrayToMatchMutable(final Object[] match) {
      try {
          return TerminatorAndInformation.Match.newMutableMatch((FAMTerminator) match[POSITION_T], (InformationLink) match[POSITION_I]);
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
    public static IQuerySpecification<TerminatorAndInformation.Matcher> querySpecification() {
      return TerminatorAndInformation.instance();
    }
  }
  
  private TerminatorAndInformation() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TerminatorAndInformation instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TerminatorAndInformation.Matcher instantiate(final ViatraQueryEngine engine) {
    return TerminatorAndInformation.Matcher.on(engine);
  }
  
  @Override
  public TerminatorAndInformation.Matcher instantiate() {
    return TerminatorAndInformation.Matcher.create();
  }
  
  @Override
  public TerminatorAndInformation.Match newEmptyMatch() {
    return TerminatorAndInformation.Match.newEmptyMatch();
  }
  
  @Override
  public TerminatorAndInformation.Match newMatch(final Object... parameters) {
    return TerminatorAndInformation.Match.newMatch((functionalarchitecture.FAMTerminator) parameters[0], (functionalarchitecture.InformationLink) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.vampire.queries.TerminatorAndInformation (visibility: PUBLIC, simpleName: TerminatorAndInformation, identifier: ca.mcgill.ecse.dslreasoner.vampire.queries.TerminatorAndInformation, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.vampire.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ca.mcgill.ecse.dslreasoner.vampire.queries.TerminatorAndInformation (visibility: PUBLIC, simpleName: TerminatorAndInformation, identifier: ca.mcgill.ecse.dslreasoner.vampire.queries.TerminatorAndInformation, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ca.mcgill.ecse.dslreasoner.vampire.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TerminatorAndInformation INSTANCE = new TerminatorAndInformation();
    
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
    private final static TerminatorAndInformation.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_T = new PParameter("T", "functionalarchitecture.FAMTerminator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FAMTerminator")), PParameterDirection.INOUT);
    
    private final PParameter parameter_I = new PParameter("I", "functionalarchitecture.InformationLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "InformationLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_T, parameter_I);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.vampire.queries.terminatorAndInformation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("T","I");
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
          PVariable var_I = body.getOrCreateVariableByName("I");
          PVariable var_Out = body.getOrCreateVariableByName("Out");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FAMTerminator")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_I), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "InformationLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_T, parameter_T),
             new ExportedParameter(body, var_I, parameter_I)
          ));
          // 	FunctionalOutput.outgoingLinks(Out,I)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Out), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FunctionalOutput")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Out, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FunctionalOutput", "outgoingLinks")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "InformationLink")));
          new Equality(body, var__virtual_0_, var_I);
          // 	FunctionalOutput.terminator(Out,T)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Out), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FunctionalOutput")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Out, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FunctionalData", "terminator")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FAMTerminator")));
          new Equality(body, var__virtual_1_, var_T);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_T = body.getOrCreateVariableByName("T");
          PVariable var_I = body.getOrCreateVariableByName("I");
          PVariable var_In = body.getOrCreateVariableByName("In");
          new TypeConstraint(body, Tuples.flatTupleOf(var_T), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FAMTerminator")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_I), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "InformationLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_T, parameter_T),
             new ExportedParameter(body, var_I, parameter_I)
          ));
          // 	InformationLink.to(I,In)
          new TypeConstraint(body, Tuples.flatTupleOf(var_I), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "InformationLink")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_I, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "InformationLink", "to")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FunctionalInput")));
          new Equality(body, var__virtual_0_, var_In);
          // 	FunctionalInput.terminator(In,T)
          new TypeConstraint(body, Tuples.flatTupleOf(var_In), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FunctionalInput")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_In, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FunctionalData", "terminator")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.inf.mit.bme.hu/viatrasolver/example/fam", "FAMTerminator")));
          new Equality(body, var__virtual_1_, var_T);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "terminatorAndInformation");
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
