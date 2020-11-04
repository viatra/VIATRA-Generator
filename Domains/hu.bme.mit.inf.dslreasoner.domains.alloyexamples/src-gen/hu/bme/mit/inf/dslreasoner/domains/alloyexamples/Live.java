/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.alloyexamples/patterns/hu/bme/mit/inf/dslreasoner/domains/alloyexamples/FileSystem.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples;

import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject;
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem;
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.PatternContent;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
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
 *         {@literal @}QueryBasedFeature
 *         pattern live(this: FileSystem, l: FSObject) {
 *         	FileSystem.root(this,l);
 *         } or {
 *         	FileSystem.root(this,root);
 *         	find patternContent+(root,l);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Live extends BaseGeneratedEMFQuerySpecification<Live.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.live pattern,
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
    private FileSystem fThis;
    
    private FSObject fL;
    
    private static List<String> parameterNames = makeImmutableList("this", "l");
    
    private Match(final FileSystem pThis, final FSObject pL) {
      this.fThis = pThis;
      this.fL = pL;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "this": return this.fThis;
          case "l": return this.fL;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fThis;
          case 1: return this.fL;
          default: return null;
      }
    }
    
    public FileSystem getThis() {
      return this.fThis;
    }
    
    public FSObject getL() {
      return this.fL;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("this".equals(parameterName) ) {
          this.fThis = (FileSystem) newValue;
          return true;
      }
      if ("l".equals(parameterName) ) {
          this.fL = (FSObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setThis(final FileSystem pThis) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fThis = pThis;
    }
    
    public void setL(final FSObject pL) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fL = pL;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.live";
    }
    
    @Override
    public List<String> parameterNames() {
      return Live.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fThis, fL};
    }
    
    @Override
    public Live.Match toImmutable() {
      return isMutable() ? newMatch(fThis, fL) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"this\"=" + prettyPrintValue(fThis) + ", ");
      result.append("\"l\"=" + prettyPrintValue(fL));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fThis, fL);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Live.Match)) {
          Live.Match other = (Live.Match) obj;
          return Objects.equals(fThis, other.fThis) && Objects.equals(fL, other.fL);
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
    public Live specification() {
      return Live.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Live.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Live.Match newMutableMatch(final FileSystem pThis, final FSObject pL) {
      return new Mutable(pThis, pL);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Live.Match newMatch(final FileSystem pThis, final FSObject pL) {
      return new Immutable(pThis, pL);
    }
    
    private static final class Mutable extends Live.Match {
      Mutable(final FileSystem pThis, final FSObject pL) {
        super(pThis, pL);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Live.Match {
      Immutable(final FileSystem pThis, final FSObject pL) {
        super(pThis, pL);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.live pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}QueryBasedFeature
   * pattern live(this: FileSystem, l: FSObject) {
   * 	FileSystem.root(this,l);
   * } or {
   * 	FileSystem.root(this,root);
   * 	find patternContent+(root,l);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Live
   * 
   */
  public static class Matcher extends BaseMatcher<Live.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Live.Matcher on(final ViatraQueryEngine engine) {
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
    public static Live.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_THIS = 0;
    
    private static final int POSITION_L = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Live.Matcher.class);
    
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
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Live.Match> getAllMatches(final FileSystem pThis, final FSObject pL) {
      return rawStreamAllMatches(new Object[]{pThis, pL}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Live.Match> streamAllMatches(final FileSystem pThis, final FSObject pL) {
      return rawStreamAllMatches(new Object[]{pThis, pL});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Live.Match> getOneArbitraryMatch(final FileSystem pThis, final FSObject pL) {
      return rawGetOneArbitraryMatch(new Object[]{pThis, pL});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final FileSystem pThis, final FSObject pL) {
      return rawHasMatch(new Object[]{pThis, pL});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final FileSystem pThis, final FSObject pL) {
      return rawCountMatches(new Object[]{pThis, pL});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final FileSystem pThis, final FSObject pL, final Consumer<? super Live.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pThis, pL}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pThis the fixed value of pattern parameter this, or null if not bound.
     * @param pL the fixed value of pattern parameter l, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Live.Match newMatch(final FileSystem pThis, final FSObject pL) {
      return Live.Match.newMatch(pThis, pL);
    }
    
    /**
     * Retrieve the set of values that occur in matches for this.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FileSystem> rawStreamAllValuesOfthis(final Object[] parameters) {
      return rawStreamAllValues(POSITION_THIS, parameters).map(FileSystem.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for this.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FileSystem> getAllValuesOfthis() {
      return rawStreamAllValuesOfthis(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for this.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FileSystem> streamAllValuesOfthis() {
      return rawStreamAllValuesOfthis(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for this.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FileSystem> streamAllValuesOfthis(final Live.Match partialMatch) {
      return rawStreamAllValuesOfthis(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for this.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FileSystem> streamAllValuesOfthis(final FSObject pL) {
      return rawStreamAllValuesOfthis(new Object[]{null, pL});
    }
    
    /**
     * Retrieve the set of values that occur in matches for this.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FileSystem> getAllValuesOfthis(final Live.Match partialMatch) {
      return rawStreamAllValuesOfthis(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for this.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FileSystem> getAllValuesOfthis(final FSObject pL) {
      return rawStreamAllValuesOfthis(new Object[]{null, pL}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FSObject> rawStreamAllValuesOfl(final Object[] parameters) {
      return rawStreamAllValues(POSITION_L, parameters).map(FSObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfl() {
      return rawStreamAllValuesOfl(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfl() {
      return rawStreamAllValuesOfl(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for l.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfl(final Live.Match partialMatch) {
      return rawStreamAllValuesOfl(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for l.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfl(final FileSystem pThis) {
      return rawStreamAllValuesOfl(new Object[]{pThis, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfl(final Live.Match partialMatch) {
      return rawStreamAllValuesOfl(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for l.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfl(final FileSystem pThis) {
      return rawStreamAllValuesOfl(new Object[]{pThis, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Live.Match tupleToMatch(final Tuple t) {
      try {
          return Live.Match.newMatch((FileSystem) t.get(POSITION_THIS), (FSObject) t.get(POSITION_L));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Live.Match arrayToMatch(final Object[] match) {
      try {
          return Live.Match.newMatch((FileSystem) match[POSITION_THIS], (FSObject) match[POSITION_L]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Live.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Live.Match.newMutableMatch((FileSystem) match[POSITION_THIS], (FSObject) match[POSITION_L]);
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
    public static IQuerySpecification<Live.Matcher> querySpecification() {
      return Live.instance();
    }
  }
  
  private Live() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Live instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Live.Matcher instantiate(final ViatraQueryEngine engine) {
    return Live.Matcher.on(engine);
  }
  
  @Override
  public Live.Matcher instantiate() {
    return Live.Matcher.create();
  }
  
  @Override
  public Live.Match newEmptyMatch() {
    return Live.Match.newEmptyMatch();
  }
  
  @Override
  public Live.Match newMatch(final Object... parameters) {
    return Live.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Live} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Live#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Live INSTANCE = new Live();
    
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
    private static final Live.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_this = new PParameter("this", "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FS", "FileSystem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_l = new PParameter("l", "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FS", "FSObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_this, parameter_l);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.live";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("this","l");
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
          PVariable var_this = body.getOrCreateVariableByName("this");
          PVariable var_l = body.getOrCreateVariableByName("l");
          new TypeConstraint(body, Tuples.flatTupleOf(var_this), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FileSystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_l), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_this, parameter_this),
             new ExportedParameter(body, var_l, parameter_l)
          ));
          // 	FileSystem.root(this,l)
          new TypeConstraint(body, Tuples.flatTupleOf(var_this), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FileSystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_this, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("FS", "FileSystem", "root")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "Dir")));
          new Equality(body, var__virtual_0_, var_l);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_this = body.getOrCreateVariableByName("this");
          PVariable var_l = body.getOrCreateVariableByName("l");
          PVariable var_root = body.getOrCreateVariableByName("root");
          new TypeConstraint(body, Tuples.flatTupleOf(var_this), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FileSystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_l), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_this, parameter_this),
             new ExportedParameter(body, var_l, parameter_l)
          ));
          // 	FileSystem.root(this,root)
          new TypeConstraint(body, Tuples.flatTupleOf(var_this), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FileSystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_this, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("FS", "FileSystem", "root")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "Dir")));
          new Equality(body, var__virtual_0_, var_root);
          // 	find patternContent+(root,l)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_root, var_l), PatternContent.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("QueryBasedFeature");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
