/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.alloyexamples/patterns/hu/bme/mit/inf/dslreasoner/domains/alloyexamples/FileSystem.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples;

import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject;
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
 *         pattern patternContent(o1: FSObject, o2: FSObject) {
 *         	Dir.contents(o1,o2);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PatternContent extends BaseGeneratedEMFQuerySpecification<PatternContent.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.patternContent pattern,
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
    private FSObject fO1;
    
    private FSObject fO2;
    
    private static List<String> parameterNames = makeImmutableList("o1", "o2");
    
    private Match(final FSObject pO1, final FSObject pO2) {
      this.fO1 = pO1;
      this.fO2 = pO2;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "o1": return this.fO1;
          case "o2": return this.fO2;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fO1;
          case 1: return this.fO2;
          default: return null;
      }
    }
    
    public FSObject getO1() {
      return this.fO1;
    }
    
    public FSObject getO2() {
      return this.fO2;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("o1".equals(parameterName) ) {
          this.fO1 = (FSObject) newValue;
          return true;
      }
      if ("o2".equals(parameterName) ) {
          this.fO2 = (FSObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setO1(final FSObject pO1) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fO1 = pO1;
    }
    
    public void setO2(final FSObject pO2) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fO2 = pO2;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.patternContent";
    }
    
    @Override
    public List<String> parameterNames() {
      return PatternContent.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fO1, fO2};
    }
    
    @Override
    public PatternContent.Match toImmutable() {
      return isMutable() ? newMatch(fO1, fO2) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"o1\"=" + prettyPrintValue(fO1) + ", ");
      result.append("\"o2\"=" + prettyPrintValue(fO2));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fO1, fO2);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PatternContent.Match)) {
          PatternContent.Match other = (PatternContent.Match) obj;
          return Objects.equals(fO1, other.fO1) && Objects.equals(fO2, other.fO2);
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
    public PatternContent specification() {
      return PatternContent.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PatternContent.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PatternContent.Match newMutableMatch(final FSObject pO1, final FSObject pO2) {
      return new Mutable(pO1, pO2);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PatternContent.Match newMatch(final FSObject pO1, final FSObject pO2) {
      return new Immutable(pO1, pO2);
    }
    
    private static final class Mutable extends PatternContent.Match {
      Mutable(final FSObject pO1, final FSObject pO2) {
        super(pO1, pO2);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PatternContent.Match {
      Immutable(final FSObject pO1, final FSObject pO2) {
        super(pO1, pO2);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.patternContent pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern patternContent(o1: FSObject, o2: FSObject) {
   * 	Dir.contents(o1,o2);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see PatternContent
   * 
   */
  public static class Matcher extends BaseMatcher<PatternContent.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PatternContent.Matcher on(final ViatraQueryEngine engine) {
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
    public static PatternContent.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_O1 = 0;
    
    private static final int POSITION_O2 = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PatternContent.Matcher.class);
    
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
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PatternContent.Match> getAllMatches(final FSObject pO1, final FSObject pO2) {
      return rawStreamAllMatches(new Object[]{pO1, pO2}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PatternContent.Match> streamAllMatches(final FSObject pO1, final FSObject pO2) {
      return rawStreamAllMatches(new Object[]{pO1, pO2});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PatternContent.Match> getOneArbitraryMatch(final FSObject pO1, final FSObject pO2) {
      return rawGetOneArbitraryMatch(new Object[]{pO1, pO2});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final FSObject pO1, final FSObject pO2) {
      return rawHasMatch(new Object[]{pO1, pO2});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final FSObject pO1, final FSObject pO2) {
      return rawCountMatches(new Object[]{pO1, pO2});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final FSObject pO1, final FSObject pO2, final Consumer<? super PatternContent.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pO1, pO2}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pO1 the fixed value of pattern parameter o1, or null if not bound.
     * @param pO2 the fixed value of pattern parameter o2, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PatternContent.Match newMatch(final FSObject pO1, final FSObject pO2) {
      return PatternContent.Match.newMatch(pO1, pO2);
    }
    
    /**
     * Retrieve the set of values that occur in matches for o1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FSObject> rawStreamAllValuesOfo1(final Object[] parameters) {
      return rawStreamAllValues(POSITION_O1, parameters).map(FSObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for o1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfo1() {
      return rawStreamAllValuesOfo1(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfo1() {
      return rawStreamAllValuesOfo1(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfo1(final PatternContent.Match partialMatch) {
      return rawStreamAllValuesOfo1(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o1.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfo1(final FSObject pO2) {
      return rawStreamAllValuesOfo1(new Object[]{null, pO2});
    }
    
    /**
     * Retrieve the set of values that occur in matches for o1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfo1(final PatternContent.Match partialMatch) {
      return rawStreamAllValuesOfo1(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o1.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfo1(final FSObject pO2) {
      return rawStreamAllValuesOfo1(new Object[]{null, pO2}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FSObject> rawStreamAllValuesOfo2(final Object[] parameters) {
      return rawStreamAllValues(POSITION_O2, parameters).map(FSObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for o2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfo2() {
      return rawStreamAllValuesOfo2(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfo2() {
      return rawStreamAllValuesOfo2(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfo2(final PatternContent.Match partialMatch) {
      return rawStreamAllValuesOfo2(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o2.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfo2(final FSObject pO1) {
      return rawStreamAllValuesOfo2(new Object[]{pO1, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for o2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfo2(final PatternContent.Match partialMatch) {
      return rawStreamAllValuesOfo2(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for o2.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfo2(final FSObject pO1) {
      return rawStreamAllValuesOfo2(new Object[]{pO1, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected PatternContent.Match tupleToMatch(final Tuple t) {
      try {
          return PatternContent.Match.newMatch((FSObject) t.get(POSITION_O1), (FSObject) t.get(POSITION_O2));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PatternContent.Match arrayToMatch(final Object[] match) {
      try {
          return PatternContent.Match.newMatch((FSObject) match[POSITION_O1], (FSObject) match[POSITION_O2]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PatternContent.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PatternContent.Match.newMutableMatch((FSObject) match[POSITION_O1], (FSObject) match[POSITION_O2]);
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
    public static IQuerySpecification<PatternContent.Matcher> querySpecification() {
      return PatternContent.instance();
    }
  }
  
  private PatternContent() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PatternContent instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PatternContent.Matcher instantiate(final ViatraQueryEngine engine) {
    return PatternContent.Matcher.on(engine);
  }
  
  @Override
  public PatternContent.Matcher instantiate() {
    return PatternContent.Matcher.create();
  }
  
  @Override
  public PatternContent.Match newEmptyMatch() {
    return PatternContent.Match.newEmptyMatch();
  }
  
  @Override
  public PatternContent.Match newMatch(final Object... parameters) {
    return PatternContent.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link PatternContent} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link PatternContent#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PatternContent INSTANCE = new PatternContent();
    
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
    private static final PatternContent.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_o1 = new PParameter("o1", "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FS", "FSObject")), PParameterDirection.INOUT);
    
    private final PParameter parameter_o2 = new PParameter("o2", "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FS", "FSObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_o1, parameter_o2);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.patternContent";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("o1","o2");
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
          PVariable var_o1 = body.getOrCreateVariableByName("o1");
          PVariable var_o2 = body.getOrCreateVariableByName("o2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_o1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_o2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_o1, parameter_o1),
             new ExportedParameter(body, var_o2, parameter_o2)
          ));
          // 	Dir.contents(o1,o2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_o1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "Dir")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_o1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("FS", "Dir", "contents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          new Equality(body, var__virtual_0_, var_o2);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
