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
import modes3.Segment;
import modes3.Train;
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
 *         pattern endOfSiding_step_3(in train : Train, in location : Segment) {
 *         //     int loop_bound1 = frame-{@literal >}location-{@literal >}connected_to_count;
 *         //     for (int i1 = 0; i1 {@literal <} loop_bound1; i1++) {
 *         //       ...
 *         //     }
 *         	Train(train);
 *             Train.location(train, location);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EndOfSiding_step_3 extends BaseGeneratedEMFQuerySpecification<EndOfSiding_step_3.Matcher> {
  /**
   * Pattern-specific match representation of the modes3.queries.endOfSiding_step_3 pattern,
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
    private Train fTrain;
    
    private Segment fLocation;
    
    private static List<String> parameterNames = makeImmutableList("train", "location");
    
    private Match(final Train pTrain, final Segment pLocation) {
      this.fTrain = pTrain;
      this.fLocation = pLocation;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "train": return this.fTrain;
          case "location": return this.fLocation;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTrain;
          case 1: return this.fLocation;
          default: return null;
      }
    }
    
    public Train getTrain() {
      return this.fTrain;
    }
    
    public Segment getLocation() {
      return this.fLocation;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("train".equals(parameterName) ) {
          this.fTrain = (Train) newValue;
          return true;
      }
      if ("location".equals(parameterName) ) {
          this.fLocation = (Segment) newValue;
          return true;
      }
      return false;
    }
    
    public void setTrain(final Train pTrain) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrain = pTrain;
    }
    
    public void setLocation(final Segment pLocation) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLocation = pLocation;
    }
    
    @Override
    public String patternName() {
      return "modes3.queries.endOfSiding_step_3";
    }
    
    @Override
    public List<String> parameterNames() {
      return EndOfSiding_step_3.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTrain, fLocation};
    }
    
    @Override
    public EndOfSiding_step_3.Match toImmutable() {
      return isMutable() ? newMatch(fTrain, fLocation) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"train\"=" + prettyPrintValue(fTrain) + ", ");
      result.append("\"location\"=" + prettyPrintValue(fLocation));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTrain, fLocation);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EndOfSiding_step_3.Match)) {
          EndOfSiding_step_3.Match other = (EndOfSiding_step_3.Match) obj;
          return Objects.equals(fTrain, other.fTrain) && Objects.equals(fLocation, other.fLocation);
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
    public EndOfSiding_step_3 specification() {
      return EndOfSiding_step_3.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EndOfSiding_step_3.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EndOfSiding_step_3.Match newMutableMatch(final Train pTrain, final Segment pLocation) {
      return new Mutable(pTrain, pLocation);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EndOfSiding_step_3.Match newMatch(final Train pTrain, final Segment pLocation) {
      return new Immutable(pTrain, pLocation);
    }
    
    private static final class Mutable extends EndOfSiding_step_3.Match {
      Mutable(final Train pTrain, final Segment pLocation) {
        super(pTrain, pLocation);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EndOfSiding_step_3.Match {
      Immutable(final Train pTrain, final Segment pLocation) {
        super(pTrain, pLocation);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the modes3.queries.endOfSiding_step_3 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern endOfSiding_step_3(in train : Train, in location : Segment) {
   * //     int loop_bound1 = frame-{@literal >}location-{@literal >}connected_to_count;
   * //     for (int i1 = 0; i1 {@literal <} loop_bound1; i1++) {
   * //       ...
   * //     }
   * 	Train(train);
   *     Train.location(train, location);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EndOfSiding_step_3
   * 
   */
  public static class Matcher extends BaseMatcher<EndOfSiding_step_3.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EndOfSiding_step_3.Matcher on(final ViatraQueryEngine engine) {
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
    public static EndOfSiding_step_3.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TRAIN = 0;
    
    private static final int POSITION_LOCATION = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EndOfSiding_step_3.Matcher.class);
    
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
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EndOfSiding_step_3.Match> getAllMatches(final Train pTrain, final Segment pLocation) {
      return rawStreamAllMatches(new Object[]{pTrain, pLocation}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EndOfSiding_step_3.Match> streamAllMatches(final Train pTrain, final Segment pLocation) {
      return rawStreamAllMatches(new Object[]{pTrain, pLocation});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EndOfSiding_step_3.Match> getOneArbitraryMatch(final Train pTrain, final Segment pLocation) {
      return rawGetOneArbitraryMatch(new Object[]{pTrain, pLocation});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Train pTrain, final Segment pLocation) {
      return rawHasMatch(new Object[]{pTrain, pLocation});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Train pTrain, final Segment pLocation) {
      return rawCountMatches(new Object[]{pTrain, pLocation});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Train pTrain, final Segment pLocation, final Consumer<? super EndOfSiding_step_3.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTrain, pLocation}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param pLocation the fixed value of pattern parameter location, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EndOfSiding_step_3.Match newMatch(final Train pTrain, final Segment pLocation) {
      return EndOfSiding_step_3.Match.newMatch(pTrain, pLocation);
    }
    
    /**
     * Retrieve the set of values that occur in matches for train.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Train> rawStreamAllValuesOftrain(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRAIN, parameters).map(Train.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for train.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Train> getAllValuesOftrain() {
      return rawStreamAllValuesOftrain(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for train.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Train> streamAllValuesOftrain() {
      return rawStreamAllValuesOftrain(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for train.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Train> streamAllValuesOftrain(final EndOfSiding_step_3.Match partialMatch) {
      return rawStreamAllValuesOftrain(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for train.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Train> streamAllValuesOftrain(final Segment pLocation) {
      return rawStreamAllValuesOftrain(new Object[]{null, pLocation});
    }
    
    /**
     * Retrieve the set of values that occur in matches for train.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Train> getAllValuesOftrain(final EndOfSiding_step_3.Match partialMatch) {
      return rawStreamAllValuesOftrain(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for train.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Train> getAllValuesOftrain(final Segment pLocation) {
      return rawStreamAllValuesOftrain(new Object[]{null, pLocation}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for location.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Segment> rawStreamAllValuesOflocation(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LOCATION, parameters).map(Segment.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for location.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOflocation() {
      return rawStreamAllValuesOflocation(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for location.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOflocation() {
      return rawStreamAllValuesOflocation(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for location.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOflocation(final EndOfSiding_step_3.Match partialMatch) {
      return rawStreamAllValuesOflocation(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for location.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Segment> streamAllValuesOflocation(final Train pTrain) {
      return rawStreamAllValuesOflocation(new Object[]{pTrain, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for location.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOflocation(final EndOfSiding_step_3.Match partialMatch) {
      return rawStreamAllValuesOflocation(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for location.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Segment> getAllValuesOflocation(final Train pTrain) {
      return rawStreamAllValuesOflocation(new Object[]{pTrain, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected EndOfSiding_step_3.Match tupleToMatch(final Tuple t) {
      try {
          return EndOfSiding_step_3.Match.newMatch((Train) t.get(POSITION_TRAIN), (Segment) t.get(POSITION_LOCATION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndOfSiding_step_3.Match arrayToMatch(final Object[] match) {
      try {
          return EndOfSiding_step_3.Match.newMatch((Train) match[POSITION_TRAIN], (Segment) match[POSITION_LOCATION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndOfSiding_step_3.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EndOfSiding_step_3.Match.newMutableMatch((Train) match[POSITION_TRAIN], (Segment) match[POSITION_LOCATION]);
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
    public static IQuerySpecification<EndOfSiding_step_3.Matcher> querySpecification() {
      return EndOfSiding_step_3.instance();
    }
  }
  
  private EndOfSiding_step_3() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EndOfSiding_step_3 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EndOfSiding_step_3.Matcher instantiate(final ViatraQueryEngine engine) {
    return EndOfSiding_step_3.Matcher.on(engine);
  }
  
  @Override
  public EndOfSiding_step_3.Matcher instantiate() {
    return EndOfSiding_step_3.Matcher.create();
  }
  
  @Override
  public EndOfSiding_step_3.Match newEmptyMatch() {
    return EndOfSiding_step_3.Match.newEmptyMatch();
  }
  
  @Override
  public EndOfSiding_step_3.Match newMatch(final Object... parameters) {
    return EndOfSiding_step_3.Match.newMatch((modes3.Train) parameters[0], (modes3.Segment) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EndOfSiding_step_3} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EndOfSiding_step_3#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EndOfSiding_step_3 INSTANCE = new EndOfSiding_step_3();
    
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
    private static final EndOfSiding_step_3.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_train = new PParameter("train", "modes3.Train", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Train")), PParameterDirection.INOUT);
    
    private final PParameter parameter_location = new PParameter("location", "modes3.Segment", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Segment")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_train, parameter_location);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "modes3.queries.endOfSiding_step_3";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("train","location");
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
          PVariable var_train = body.getOrCreateVariableByName("train");
          PVariable var_location = body.getOrCreateVariableByName("location");
          new TypeConstraint(body, Tuples.flatTupleOf(var_train), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Train")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_location), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_train, parameter_train),
             new ExportedParameter(body, var_location, parameter_location)
          ));
          // //     int loop_bound1 = frame->location->connected_to_count;//     for (int i1 = 0; i1 < loop_bound1; i1++) {//       ...//     }	Train(train)
          new TypeConstraint(body, Tuples.flatTupleOf(var_train), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Train")));
          //     Train.location(train, location)
          new TypeConstraint(body, Tuples.flatTupleOf(var_train), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Train")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_train, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Train", "location")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Segment")));
          new Equality(body, var__virtual_0_, var_location);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
