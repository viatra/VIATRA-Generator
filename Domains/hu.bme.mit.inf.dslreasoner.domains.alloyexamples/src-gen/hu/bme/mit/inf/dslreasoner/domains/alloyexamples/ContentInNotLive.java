/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.alloyexamples/patterns/hu/bme/mit/inf/dslreasoner/domains/alloyexamples/FileSystem.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.alloyexamples;

import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir;
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject;
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Live;
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
 *         {@literal @}Constraint(key={child}, severity="error", message="error")
 *         pattern contentInNotLive(parent : Dir, child: FSObject) {
 *         	Dir.contents(parent,child);
 *         	neg find live(_,parent);
 *         } or {
 *         	Dir.contents(parent,child);
 *         	neg find live(_,child);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ContentInNotLive extends BaseGeneratedEMFQuerySpecification<ContentInNotLive.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.contentInNotLive pattern,
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
    private Dir fParent;
    
    private FSObject fChild;
    
    private static List<String> parameterNames = makeImmutableList("parent", "child");
    
    private Match(final Dir pParent, final FSObject pChild) {
      this.fParent = pParent;
      this.fChild = pChild;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("parent".equals(parameterName)) return this.fParent;
      if ("child".equals(parameterName)) return this.fChild;
      return null;
    }
    
    public Dir getParent() {
      return this.fParent;
    }
    
    public FSObject getChild() {
      return this.fChild;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("parent".equals(parameterName) ) {
          this.fParent = (Dir) newValue;
          return true;
      }
      if ("child".equals(parameterName) ) {
          this.fChild = (FSObject) newValue;
          return true;
      }
      return false;
    }
    
    public void setParent(final Dir pParent) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fParent = pParent;
    }
    
    public void setChild(final FSObject pChild) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fChild = pChild;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.contentInNotLive";
    }
    
    @Override
    public List<String> parameterNames() {
      return ContentInNotLive.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fParent, fChild};
    }
    
    @Override
    public ContentInNotLive.Match toImmutable() {
      return isMutable() ? newMatch(fParent, fChild) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"parent\"=" + prettyPrintValue(fParent) + ", ");
      result.append("\"child\"=" + prettyPrintValue(fChild));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fParent, fChild);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ContentInNotLive.Match)) {
          ContentInNotLive.Match other = (ContentInNotLive.Match) obj;
          return Objects.equals(fParent, other.fParent) && Objects.equals(fChild, other.fChild);
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
    public ContentInNotLive specification() {
      return ContentInNotLive.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ContentInNotLive.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ContentInNotLive.Match newMutableMatch(final Dir pParent, final FSObject pChild) {
      return new Mutable(pParent, pChild);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ContentInNotLive.Match newMatch(final Dir pParent, final FSObject pChild) {
      return new Immutable(pParent, pChild);
    }
    
    private static final class Mutable extends ContentInNotLive.Match {
      Mutable(final Dir pParent, final FSObject pChild) {
        super(pParent, pChild);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ContentInNotLive.Match {
      Immutable(final Dir pParent, final FSObject pChild) {
        super(pParent, pChild);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.alloyexamples.contentInNotLive pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(key={child}, severity="error", message="error")
   * pattern contentInNotLive(parent : Dir, child: FSObject) {
   * 	Dir.contents(parent,child);
   * 	neg find live(_,parent);
   * } or {
   * 	Dir.contents(parent,child);
   * 	neg find live(_,child);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ContentInNotLive
   * 
   */
  public static class Matcher extends BaseMatcher<ContentInNotLive.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ContentInNotLive.Matcher on(final ViatraQueryEngine engine) {
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
    public static ContentInNotLive.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_PARENT = 0;
    
    private final static int POSITION_CHILD = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ContentInNotLive.Matcher.class);
    
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
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ContentInNotLive.Match> getAllMatches(final Dir pParent, final FSObject pChild) {
      return rawStreamAllMatches(new Object[]{pParent, pChild}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ContentInNotLive.Match> streamAllMatches(final Dir pParent, final FSObject pChild) {
      return rawStreamAllMatches(new Object[]{pParent, pChild});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ContentInNotLive.Match> getOneArbitraryMatch(final Dir pParent, final FSObject pChild) {
      return rawGetOneArbitraryMatch(new Object[]{pParent, pChild});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Dir pParent, final FSObject pChild) {
      return rawHasMatch(new Object[]{pParent, pChild});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Dir pParent, final FSObject pChild) {
      return rawCountMatches(new Object[]{pParent, pChild});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Dir pParent, final FSObject pChild, final Consumer<? super ContentInNotLive.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pParent, pChild}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pParent the fixed value of pattern parameter parent, or null if not bound.
     * @param pChild the fixed value of pattern parameter child, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ContentInNotLive.Match newMatch(final Dir pParent, final FSObject pChild) {
      return ContentInNotLive.Match.newMatch(pParent, pChild);
    }
    
    /**
     * Retrieve the set of values that occur in matches for parent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Dir> rawStreamAllValuesOfparent(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PARENT, parameters).map(Dir.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for parent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Dir> getAllValuesOfparent() {
      return rawStreamAllValuesOfparent(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Dir> streamAllValuesOfparent() {
      return rawStreamAllValuesOfparent(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Dir> streamAllValuesOfparent(final ContentInNotLive.Match partialMatch) {
      return rawStreamAllValuesOfparent(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parent.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Dir> streamAllValuesOfparent(final FSObject pChild) {
      return rawStreamAllValuesOfparent(new Object[]{null, pChild});
    }
    
    /**
     * Retrieve the set of values that occur in matches for parent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Dir> getAllValuesOfparent(final ContentInNotLive.Match partialMatch) {
      return rawStreamAllValuesOfparent(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for parent.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Dir> getAllValuesOfparent(final FSObject pChild) {
      return rawStreamAllValuesOfparent(new Object[]{null, pChild}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for child.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<FSObject> rawStreamAllValuesOfchild(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CHILD, parameters).map(FSObject.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for child.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfchild() {
      return rawStreamAllValuesOfchild(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for child.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfchild() {
      return rawStreamAllValuesOfchild(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for child.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfchild(final ContentInNotLive.Match partialMatch) {
      return rawStreamAllValuesOfchild(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for child.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<FSObject> streamAllValuesOfchild(final Dir pParent) {
      return rawStreamAllValuesOfchild(new Object[]{pParent, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for child.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfchild(final ContentInNotLive.Match partialMatch) {
      return rawStreamAllValuesOfchild(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for child.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<FSObject> getAllValuesOfchild(final Dir pParent) {
      return rawStreamAllValuesOfchild(new Object[]{pParent, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ContentInNotLive.Match tupleToMatch(final Tuple t) {
      try {
          return ContentInNotLive.Match.newMatch((Dir) t.get(POSITION_PARENT), (FSObject) t.get(POSITION_CHILD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ContentInNotLive.Match arrayToMatch(final Object[] match) {
      try {
          return ContentInNotLive.Match.newMatch((Dir) match[POSITION_PARENT], (FSObject) match[POSITION_CHILD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ContentInNotLive.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ContentInNotLive.Match.newMutableMatch((Dir) match[POSITION_PARENT], (FSObject) match[POSITION_CHILD]);
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
    public static IQuerySpecification<ContentInNotLive.Matcher> querySpecification() {
      return ContentInNotLive.instance();
    }
  }
  
  private ContentInNotLive() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ContentInNotLive instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ContentInNotLive.Matcher instantiate(final ViatraQueryEngine engine) {
    return ContentInNotLive.Matcher.on(engine);
  }
  
  @Override
  public ContentInNotLive.Matcher instantiate() {
    return ContentInNotLive.Matcher.create();
  }
  
  @Override
  public ContentInNotLive.Match newEmptyMatch() {
    return ContentInNotLive.Match.newEmptyMatch();
  }
  
  @Override
  public ContentInNotLive.Match newMatch(final Object... parameters) {
    return ContentInNotLive.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir) parameters[0], (hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.ContentInNotLive (visibility: PUBLIC, simpleName: ContentInNotLive, identifier: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.ContentInNotLive, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.alloyexamples) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.ContentInNotLive (visibility: PUBLIC, simpleName: ContentInNotLive, identifier: hu.bme.mit.inf.dslreasoner.domains.alloyexamples.ContentInNotLive, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.alloyexamples) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ContentInNotLive INSTANCE = new ContentInNotLive();
    
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
    private final static ContentInNotLive.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_parent = new PParameter("parent", "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Dir", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FS", "Dir")), PParameterDirection.INOUT);
    
    private final PParameter parameter_child = new PParameter("child", "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.FSObject", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("FS", "FSObject")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_parent, parameter_child);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.alloyexamples.contentInNotLive";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parent","child");
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
          PVariable var_parent = body.getOrCreateVariableByName("parent");
          PVariable var_child = body.getOrCreateVariableByName("child");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "Dir")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parent, parameter_parent),
             new ExportedParameter(body, var_child, parameter_child)
          ));
          // 	Dir.contents(parent,child)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "Dir")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("FS", "Dir", "contents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          new Equality(body, var__virtual_0_, var_child);
          // 	neg find live(_,parent)
          new NegativePatternCall(body, Tuples.flatTupleOf(var___0_, var_parent), Live.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_parent = body.getOrCreateVariableByName("parent");
          PVariable var_child = body.getOrCreateVariableByName("child");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "Dir")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_child), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_parent, parameter_parent),
             new ExportedParameter(body, var_child, parameter_child)
          ));
          // 	Dir.contents(parent,child)
          new TypeConstraint(body, Tuples.flatTupleOf(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "Dir")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("FS", "Dir", "contents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("FS", "FSObject")));
          new Equality(body, var__virtual_0_, var_child);
          // 	neg find live(_,child)
          new NegativePatternCall(body, Tuples.flatTupleOf(var___0_, var_child), Live.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("child")
                              }));
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
