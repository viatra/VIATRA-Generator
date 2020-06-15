/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.vampire.reasoner/queries/ca/mcgill/ecse/dslreasoner/vampire/reasoner/queries/vampireQueries.vql
 */
package ca.mcgill.ecse.dslreasoner.vampire.reasoner.queries;

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunctionAsTerm;
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
 *         pattern VLSFunctionFof(term: VLSFunctionAsTerm){
 *         	VLSFunctionAsTerm(term);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class VLSFunctionFof extends BaseGeneratedEMFQuerySpecification<VLSFunctionFof.Matcher> {
  /**
   * Pattern-specific match representation of the ca.mcgill.ecse.dslreasoner.vampire.reasoner.queries.VLSFunctionFof pattern,
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
    private VLSFunctionAsTerm fTerm;
    
    private static List<String> parameterNames = makeImmutableList("term");
    
    private Match(final VLSFunctionAsTerm pTerm) {
      this.fTerm = pTerm;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "term": return this.fTerm;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTerm;
          default: return null;
      }
    }
    
    public VLSFunctionAsTerm getTerm() {
      return this.fTerm;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("term".equals(parameterName) ) {
          this.fTerm = (VLSFunctionAsTerm) newValue;
          return true;
      }
      return false;
    }
    
    public void setTerm(final VLSFunctionAsTerm pTerm) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTerm = pTerm;
    }
    
    @Override
    public String patternName() {
      return "ca.mcgill.ecse.dslreasoner.vampire.reasoner.queries.VLSFunctionFof";
    }
    
    @Override
    public List<String> parameterNames() {
      return VLSFunctionFof.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTerm};
    }
    
    @Override
    public VLSFunctionFof.Match toImmutable() {
      return isMutable() ? newMatch(fTerm) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"term\"=" + prettyPrintValue(fTerm));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTerm);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof VLSFunctionFof.Match)) {
          VLSFunctionFof.Match other = (VLSFunctionFof.Match) obj;
          return Objects.equals(fTerm, other.fTerm);
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
    public VLSFunctionFof specification() {
      return VLSFunctionFof.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static VLSFunctionFof.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static VLSFunctionFof.Match newMutableMatch(final VLSFunctionAsTerm pTerm) {
      return new Mutable(pTerm);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static VLSFunctionFof.Match newMatch(final VLSFunctionAsTerm pTerm) {
      return new Immutable(pTerm);
    }
    
    private static final class Mutable extends VLSFunctionFof.Match {
      Mutable(final VLSFunctionAsTerm pTerm) {
        super(pTerm);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends VLSFunctionFof.Match {
      Immutable(final VLSFunctionAsTerm pTerm) {
        super(pTerm);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ca.mcgill.ecse.dslreasoner.vampire.reasoner.queries.VLSFunctionFof pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern VLSFunctionFof(term: VLSFunctionAsTerm){
   * 	VLSFunctionAsTerm(term);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see VLSFunctionFof
   * 
   */
  public static class Matcher extends BaseMatcher<VLSFunctionFof.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static VLSFunctionFof.Matcher on(final ViatraQueryEngine engine) {
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
    public static VLSFunctionFof.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TERM = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(VLSFunctionFof.Matcher.class);
    
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
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<VLSFunctionFof.Match> getAllMatches(final VLSFunctionAsTerm pTerm) {
      return rawStreamAllMatches(new Object[]{pTerm}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<VLSFunctionFof.Match> streamAllMatches(final VLSFunctionAsTerm pTerm) {
      return rawStreamAllMatches(new Object[]{pTerm});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<VLSFunctionFof.Match> getOneArbitraryMatch(final VLSFunctionAsTerm pTerm) {
      return rawGetOneArbitraryMatch(new Object[]{pTerm});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final VLSFunctionAsTerm pTerm) {
      return rawHasMatch(new Object[]{pTerm});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final VLSFunctionAsTerm pTerm) {
      return rawCountMatches(new Object[]{pTerm});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final VLSFunctionAsTerm pTerm, final Consumer<? super VLSFunctionFof.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTerm}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTerm the fixed value of pattern parameter term, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public VLSFunctionFof.Match newMatch(final VLSFunctionAsTerm pTerm) {
      return VLSFunctionFof.Match.newMatch(pTerm);
    }
    
    /**
     * Retrieve the set of values that occur in matches for term.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<VLSFunctionAsTerm> rawStreamAllValuesOfterm(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TERM, parameters).map(VLSFunctionAsTerm.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for term.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<VLSFunctionAsTerm> getAllValuesOfterm() {
      return rawStreamAllValuesOfterm(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for term.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<VLSFunctionAsTerm> streamAllValuesOfterm() {
      return rawStreamAllValuesOfterm(emptyArray());
    }
    
    @Override
    protected VLSFunctionFof.Match tupleToMatch(final Tuple t) {
      try {
          return VLSFunctionFof.Match.newMatch((VLSFunctionAsTerm) t.get(POSITION_TERM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VLSFunctionFof.Match arrayToMatch(final Object[] match) {
      try {
          return VLSFunctionFof.Match.newMatch((VLSFunctionAsTerm) match[POSITION_TERM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected VLSFunctionFof.Match arrayToMatchMutable(final Object[] match) {
      try {
          return VLSFunctionFof.Match.newMutableMatch((VLSFunctionAsTerm) match[POSITION_TERM]);
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
    public static IQuerySpecification<VLSFunctionFof.Matcher> querySpecification() {
      return VLSFunctionFof.instance();
    }
  }
  
  private VLSFunctionFof() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static VLSFunctionFof instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected VLSFunctionFof.Matcher instantiate(final ViatraQueryEngine engine) {
    return VLSFunctionFof.Matcher.on(engine);
  }
  
  @Override
  public VLSFunctionFof.Matcher instantiate() {
    return VLSFunctionFof.Matcher.create();
  }
  
  @Override
  public VLSFunctionFof.Match newEmptyMatch() {
    return VLSFunctionFof.Match.newEmptyMatch();
  }
  
  @Override
  public VLSFunctionFof.Match newMatch(final Object... parameters) {
    return VLSFunctionFof.Match.newMatch((ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunctionAsTerm) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link VLSFunctionFof} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link VLSFunctionFof#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final VLSFunctionFof INSTANCE = new VLSFunctionFof();
    
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
    private static final VLSFunctionFof.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_term = new PParameter("term", "ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunctionAsTerm", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mcgill.ca/ecse/dslreasoner/VampireLanguage", "VLSFunctionAsTerm")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_term);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ca.mcgill.ecse.dslreasoner.vampire.reasoner.queries.VLSFunctionFof";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("term");
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
          PVariable var_term = body.getOrCreateVariableByName("term");
          new TypeConstraint(body, Tuples.flatTupleOf(var_term), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mcgill.ca/ecse/dslreasoner/VampireLanguage", "VLSFunctionAsTerm")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_term, parameter_term)
          ));
          // 	VLSFunctionAsTerm(term)
          new TypeConstraint(body, Tuples.flatTupleOf(var_term), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mcgill.ca/ecse/dslreasoner/VampireLanguage", "VLSFunctionAsTerm")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
