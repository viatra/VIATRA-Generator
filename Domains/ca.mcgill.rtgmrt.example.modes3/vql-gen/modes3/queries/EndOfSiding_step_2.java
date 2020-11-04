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
 *         //
 *         // endOfSiding
 *         //
 *         
 *         pattern endOfSiding_step_2(in train : Train) {
 *         //   frame-{@literal >}train = model-{@literal >}trains[i0];
 *         //   frame-{@literal >}location = frame-{@literal >}train-{@literal >}location;
 *         //   if (frame-{@literal >}location != NULL) {
 *         //     ...
 *         //   }
 *         
 *         	Train(train);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EndOfSiding_step_2 extends BaseGeneratedEMFQuerySpecification<EndOfSiding_step_2.Matcher> {
  /**
   * Pattern-specific match representation of the modes3.queries.endOfSiding_step_2 pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("train");
    
    private Match(final Train pTrain) {
      this.fTrain = pTrain;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "train": return this.fTrain;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTrain;
          default: return null;
      }
    }
    
    public Train getTrain() {
      return this.fTrain;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("train".equals(parameterName) ) {
          this.fTrain = (Train) newValue;
          return true;
      }
      return false;
    }
    
    public void setTrain(final Train pTrain) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrain = pTrain;
    }
    
    @Override
    public String patternName() {
      return "modes3.queries.endOfSiding_step_2";
    }
    
    @Override
    public List<String> parameterNames() {
      return EndOfSiding_step_2.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTrain};
    }
    
    @Override
    public EndOfSiding_step_2.Match toImmutable() {
      return isMutable() ? newMatch(fTrain) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"train\"=" + prettyPrintValue(fTrain));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTrain);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EndOfSiding_step_2.Match)) {
          EndOfSiding_step_2.Match other = (EndOfSiding_step_2.Match) obj;
          return Objects.equals(fTrain, other.fTrain);
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
    public EndOfSiding_step_2 specification() {
      return EndOfSiding_step_2.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EndOfSiding_step_2.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EndOfSiding_step_2.Match newMutableMatch(final Train pTrain) {
      return new Mutable(pTrain);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EndOfSiding_step_2.Match newMatch(final Train pTrain) {
      return new Immutable(pTrain);
    }
    
    private static final class Mutable extends EndOfSiding_step_2.Match {
      Mutable(final Train pTrain) {
        super(pTrain);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EndOfSiding_step_2.Match {
      Immutable(final Train pTrain) {
        super(pTrain);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the modes3.queries.endOfSiding_step_2 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //
   * // endOfSiding
   * //
   * 
   * pattern endOfSiding_step_2(in train : Train) {
   * //   frame-{@literal >}train = model-{@literal >}trains[i0];
   * //   frame-{@literal >}location = frame-{@literal >}train-{@literal >}location;
   * //   if (frame-{@literal >}location != NULL) {
   * //     ...
   * //   }
   * 
   * 	Train(train);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EndOfSiding_step_2
   * 
   */
  public static class Matcher extends BaseMatcher<EndOfSiding_step_2.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EndOfSiding_step_2.Matcher on(final ViatraQueryEngine engine) {
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
    public static EndOfSiding_step_2.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TRAIN = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EndOfSiding_step_2.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EndOfSiding_step_2.Match> getAllMatches(final Train pTrain) {
      return rawStreamAllMatches(new Object[]{pTrain}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EndOfSiding_step_2.Match> streamAllMatches(final Train pTrain) {
      return rawStreamAllMatches(new Object[]{pTrain});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EndOfSiding_step_2.Match> getOneArbitraryMatch(final Train pTrain) {
      return rawGetOneArbitraryMatch(new Object[]{pTrain});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Train pTrain) {
      return rawHasMatch(new Object[]{pTrain});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Train pTrain) {
      return rawCountMatches(new Object[]{pTrain});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Train pTrain, final Consumer<? super EndOfSiding_step_2.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTrain}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTrain the fixed value of pattern parameter train, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EndOfSiding_step_2.Match newMatch(final Train pTrain) {
      return EndOfSiding_step_2.Match.newMatch(pTrain);
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
    
    @Override
    protected EndOfSiding_step_2.Match tupleToMatch(final Tuple t) {
      try {
          return EndOfSiding_step_2.Match.newMatch((Train) t.get(POSITION_TRAIN));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndOfSiding_step_2.Match arrayToMatch(final Object[] match) {
      try {
          return EndOfSiding_step_2.Match.newMatch((Train) match[POSITION_TRAIN]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EndOfSiding_step_2.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EndOfSiding_step_2.Match.newMutableMatch((Train) match[POSITION_TRAIN]);
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
    public static IQuerySpecification<EndOfSiding_step_2.Matcher> querySpecification() {
      return EndOfSiding_step_2.instance();
    }
  }
  
  private EndOfSiding_step_2() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EndOfSiding_step_2 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EndOfSiding_step_2.Matcher instantiate(final ViatraQueryEngine engine) {
    return EndOfSiding_step_2.Matcher.on(engine);
  }
  
  @Override
  public EndOfSiding_step_2.Matcher instantiate() {
    return EndOfSiding_step_2.Matcher.create();
  }
  
  @Override
  public EndOfSiding_step_2.Match newEmptyMatch() {
    return EndOfSiding_step_2.Match.newEmptyMatch();
  }
  
  @Override
  public EndOfSiding_step_2.Match newMatch(final Object... parameters) {
    return EndOfSiding_step_2.Match.newMatch((modes3.Train) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link EndOfSiding_step_2} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link EndOfSiding_step_2#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final EndOfSiding_step_2 INSTANCE = new EndOfSiding_step_2();
    
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
    private static final EndOfSiding_step_2.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_train = new PParameter("train", "modes3.Train", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.ece.mcgill.ca/wcet/modes3", "Train")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_train);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "modes3.queries.endOfSiding_step_2";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("train");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_train), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Train")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_train, parameter_train)
          ));
          // //   frame->train = model->trains[i0];//   frame->location = frame->train->location;//   if (frame->location != NULL) {//     ...//   }	Train(train)
          new TypeConstraint(body, Tuples.flatTupleOf(var_train), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.ece.mcgill.ca/wcet/modes3", "Train")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
