/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.alloyexamples/patterns/hu/bme/mit/inf/dslreasoner/domains/alloyexamples/FileSystem.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples;

import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Dir;
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
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
 *         {@literal @}Constraint(key={fs}, severity="error", message="error")
 *         pattern rootIsNotDir(fs: FileSystem) {
 *         	FileSystem.root(fs, root);
 *         	neg find dir(root);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class RootIsNotDir extends BaseGeneratedEMFQuerySpecification<RootIsNotDir.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.rootIsNotDir pattern,
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
    private FileSystem fFs;
    
    private static List<String> parameterNames = makeImmutableList("fs");
    
    private Match(final FileSystem pFs) {
      this.fFs = pFs;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "fs": return this.fFs;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fFs;
          default: return null;
      }
    }
    
    public FileSystem getFs() {
      return this.fFs;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("fs".equals(parameterName) ) {
          this.fFs = (FileSystem) newValue;
          return true;
      }
      return false;
    }
    
    public void setFs(final FileSystem pFs) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fFs = pFs;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.rootIsNotDir";
    }
    
    @Override
    public List<String> parameterNames() {
      return RootIsNotDir.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fFs};
    }
    
    @Override
    public RootIsNotDir.Match toImmutable() {
      return isMutable() ? newMatch(fFs) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"fs\"=" + prettyPrintValue(fFs));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fFs);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RootIsNotDir.Match)) {
          RootIsNotDir.Match other = (RootIsNotDir.Match) obj;
          return Objects.equals(fFs, other.fFs);
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
    public RootIsNotDir specification() {
      return RootIsNotDir.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RootIsNotDir.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RootIsNotDir.Match newMutableMatch(final FileSystem pFs) {
      return new Mutable(pFs);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RootIsNotDir.Match newMatch(final FileSystem pFs) {
      return new Immutable(pFs);
    }
    
    private static final class Mutable extends RootIsNotDir.Match {
      Mutable(final FileSystem pFs) {
        super(pFs);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RootIsNotDir.Match {
      Immutable(final FileSystem pFs) {
        super(pFs);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.rootIsNotDir pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(key={fs}, severity="error", message="error")
   * pattern rootIsNotDir(fs: FileSystem) {
   * 	FileSystem.root(fs, root);
   * 	neg find dir(root);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see RootIsNotDir
   * 
   */
  public static class Matcher extends BaseMatcher<RootIsNotDir.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RootIsNotDir.Matcher on(final ViatraQueryEngine engine) {
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
    public static RootIsNotDir.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_FS = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RootIsNotDir.Matcher.class);
    
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
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RootIsNotDir.Match> getAllMatches(final FileSystem pFs) {
      return rawStreamAllMatches(new Object[]{pFs}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<RootIsNotDir.Match> streamAllMatches(final FileSystem pFs) {
      return rawStreamAllMatches(new Object[]{pFs});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<RootIsNotDir.Match> getOneArbitraryMatch(final FileSystem pFs) {
      return rawGetOneArbitraryMatch(new Object[]{pFs});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final FileSystem pFs) {
      return rawHasMatch(new Object[]{pFs});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final FileSystem pFs) {
      return rawCountMatches(new Object[]{pFs});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final FileSystem pFs, final Consumer<? super RootIsNotDir.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pFs}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pFs the fixed value of pattern parameter fs, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RootIsNotDir.Match newMatch(final FileSystem pFs) {
      return RootIsNotDir.Match.newMatch(pFs);
    }
    
    /**
     * Retrieve the set of values that occur in matches for fs.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FileSystem> rawStreamAllValuesOffs(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FS, parameters).map(FileSystem.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for fs.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FileSystem> getAllValuesOffs() {
      return rawStreamAllValuesOffs(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for fs.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FileSystem> streamAllValuesOffs() {
      return rawStreamAllValuesOffs(emptyArray());
    }
    
    @Override
    protected RootIsNotDir.Match tupleToMatch(final Tuple t) {
      try {
          return RootIsNotDir.Match.newMatch((FileSystem) t.get(POSITION_FS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RootIsNotDir.Match arrayToMatch(final Object[] match) {
      try {
          return RootIsNotDir.Match.newMatch((FileSystem) match[POSITION_FS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RootIsNotDir.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RootIsNotDir.Match.newMutableMatch((FileSystem) match[POSITION_FS]);
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
    public static IQuerySpecification<RootIsNotDir.Matcher> querySpecification() {
      return RootIsNotDir.instance();
    }
  }
  
  private RootIsNotDir() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RootIsNotDir instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RootIsNotDir.Matcher instantiate(final ViatraQueryEngine engine) {
    return RootIsNotDir.Matcher.on(engine);
  }
  
  @Override
  public RootIsNotDir.Matcher instantiate() {
    return RootIsNotDir.Matcher.create();
  }
  
  @Override
  public RootIsNotDir.Match newEmptyMatch() {
    return RootIsNotDir.Match.newEmptyMatch();
  }
  
  @Override
  public RootIsNotDir.Match newMatch(final Object... parameters) {
    return RootIsNotDir.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RootIsNotDir} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RootIsNotDir#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RootIsNotDir INSTANCE = new RootIsNotDir();
    
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
    private static final RootIsNotDir.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_fs = new PParameter("fs", "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FileSystem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FS", "FileSystem")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_fs);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.rootIsNotDir";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("fs");
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
          PVariable var_fs = body.getOrCreateVariableByName("fs");
          PVariable var_root = body.getOrCreateVariableByName("root");
          new TypeConstraint(body, Tuples.flatTupleOf(var_fs), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FileSystem")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_fs, parameter_fs)
          ));
          // 	FileSystem.root(fs, root)
          new TypeConstraint(body, Tuples.flatTupleOf(var_fs), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FileSystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_fs, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("FS", "FileSystem", "root")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          new Equality(body, var__virtual_0_, var_root);
          // 	neg find dir(root)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_root), Dir.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("fs")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
