/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/case_study_A.vql
 */
package queries;

import Taxation.Legal_Union_Record;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.X_inv49_1;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //inv49-OclKindOf-handled by multiplicity
 *         {@literal @}Constraint(message = "inv49", severity = "error", key = {lur})
 *         pattern inv49(lur : Legal_Union_Record) {
 *             neg find x_inv49_1(lur);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Inv49 extends BaseGeneratedEMFQuerySpecification<Inv49.Matcher> {
  /**
   * Pattern-specific match representation of the queries.inv49 pattern,
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
    private Legal_Union_Record fLur;
    
    private static List<String> parameterNames = makeImmutableList("lur");
    
    private Match(final Legal_Union_Record pLur) {
      this.fLur = pLur;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "lur": return this.fLur;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fLur;
          default: return null;
      }
    }
    
    public Legal_Union_Record getLur() {
      return this.fLur;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("lur".equals(parameterName) ) {
          this.fLur = (Legal_Union_Record) newValue;
          return true;
      }
      return false;
    }
    
    public void setLur(final Legal_Union_Record pLur) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLur = pLur;
    }
    
    @Override
    public String patternName() {
      return "queries.inv49";
    }
    
    @Override
    public List<String> parameterNames() {
      return Inv49.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fLur};
    }
    
    @Override
    public Inv49.Match toImmutable() {
      return isMutable() ? newMatch(fLur) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"lur\"=" + prettyPrintValue(fLur));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fLur);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Inv49.Match)) {
          Inv49.Match other = (Inv49.Match) obj;
          return Objects.equals(fLur, other.fLur);
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
    public Inv49 specification() {
      return Inv49.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Inv49.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Inv49.Match newMutableMatch(final Legal_Union_Record pLur) {
      return new Mutable(pLur);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Inv49.Match newMatch(final Legal_Union_Record pLur) {
      return new Immutable(pLur);
    }
    
    private static final class Mutable extends Inv49.Match {
      Mutable(final Legal_Union_Record pLur) {
        super(pLur);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Inv49.Match {
      Immutable(final Legal_Union_Record pLur) {
        super(pLur);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.inv49 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //inv49-OclKindOf-handled by multiplicity
   * {@literal @}Constraint(message = "inv49", severity = "error", key = {lur})
   * pattern inv49(lur : Legal_Union_Record) {
   *     neg find x_inv49_1(lur);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Inv49
   * 
   */
  public static class Matcher extends BaseMatcher<Inv49.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Inv49.Matcher on(final ViatraQueryEngine engine) {
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
    public static Inv49.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_LUR = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Inv49.Matcher.class);
    
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
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Inv49.Match> getAllMatches(final Legal_Union_Record pLur) {
      return rawStreamAllMatches(new Object[]{pLur}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Inv49.Match> streamAllMatches(final Legal_Union_Record pLur) {
      return rawStreamAllMatches(new Object[]{pLur});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Inv49.Match> getOneArbitraryMatch(final Legal_Union_Record pLur) {
      return rawGetOneArbitraryMatch(new Object[]{pLur});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Legal_Union_Record pLur) {
      return rawHasMatch(new Object[]{pLur});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Legal_Union_Record pLur) {
      return rawCountMatches(new Object[]{pLur});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Legal_Union_Record pLur, final Consumer<? super Inv49.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pLur}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLur the fixed value of pattern parameter lur, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Inv49.Match newMatch(final Legal_Union_Record pLur) {
      return Inv49.Match.newMatch(pLur);
    }
    
    /**
     * Retrieve the set of values that occur in matches for lur.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Legal_Union_Record> rawStreamAllValuesOflur(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LUR, parameters).map(Legal_Union_Record.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for lur.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Legal_Union_Record> getAllValuesOflur() {
      return rawStreamAllValuesOflur(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for lur.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Legal_Union_Record> streamAllValuesOflur() {
      return rawStreamAllValuesOflur(emptyArray());
    }
    
    @Override
    protected Inv49.Match tupleToMatch(final Tuple t) {
      try {
          return Inv49.Match.newMatch((Legal_Union_Record) t.get(POSITION_LUR));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv49.Match arrayToMatch(final Object[] match) {
      try {
          return Inv49.Match.newMatch((Legal_Union_Record) match[POSITION_LUR]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv49.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Inv49.Match.newMutableMatch((Legal_Union_Record) match[POSITION_LUR]);
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
    public static IQuerySpecification<Inv49.Matcher> querySpecification() {
      return Inv49.instance();
    }
  }
  
  private Inv49() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Inv49 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Inv49.Matcher instantiate(final ViatraQueryEngine engine) {
    return Inv49.Matcher.on(engine);
  }
  
  @Override
  public Inv49.Matcher instantiate() {
    return Inv49.Matcher.create();
  }
  
  @Override
  public Inv49.Match newEmptyMatch() {
    return Inv49.Match.newEmptyMatch();
  }
  
  @Override
  public Inv49.Match newMatch(final Object... parameters) {
    return Inv49.Match.newMatch((Taxation.Legal_Union_Record) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Inv49} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Inv49#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Inv49 INSTANCE = new Inv49();
    
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
    private static final Inv49.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_lur = new PParameter("lur", "Taxation.Legal_Union_Record", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Legal_Union_Record")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_lur);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.inv49";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("lur");
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
          PVariable var_lur = body.getOrCreateVariableByName("lur");
          new TypeConstraint(body, Tuples.flatTupleOf(var_lur), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Legal_Union_Record")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_lur, parameter_lur)
          ));
          //     neg find x_inv49_1(lur)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_lur), X_inv49_1.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "inv49");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("lur")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
