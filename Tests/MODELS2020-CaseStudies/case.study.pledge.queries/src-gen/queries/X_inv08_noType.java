/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/case_study_A.vql
 */
package queries;

import Taxation.Income;
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
 *         pattern x_inv08_noType(inc : Income) {
 *             Income.income_type(inc, _);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class X_inv08_noType extends BaseGeneratedEMFQuerySpecification<X_inv08_noType.Matcher> {
  /**
   * Pattern-specific match representation of the queries.x_inv08_noType pattern,
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
    private Income fInc;
    
    private static List<String> parameterNames = makeImmutableList("inc");
    
    private Match(final Income pInc) {
      this.fInc = pInc;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "inc": return this.fInc;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fInc;
          default: return null;
      }
    }
    
    public Income getInc() {
      return this.fInc;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("inc".equals(parameterName) ) {
          this.fInc = (Income) newValue;
          return true;
      }
      return false;
    }
    
    public void setInc(final Income pInc) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInc = pInc;
    }
    
    @Override
    public String patternName() {
      return "queries.x_inv08_noType";
    }
    
    @Override
    public List<String> parameterNames() {
      return X_inv08_noType.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInc};
    }
    
    @Override
    public X_inv08_noType.Match toImmutable() {
      return isMutable() ? newMatch(fInc) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"inc\"=" + prettyPrintValue(fInc));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fInc);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof X_inv08_noType.Match)) {
          X_inv08_noType.Match other = (X_inv08_noType.Match) obj;
          return Objects.equals(fInc, other.fInc);
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
    public X_inv08_noType specification() {
      return X_inv08_noType.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static X_inv08_noType.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static X_inv08_noType.Match newMutableMatch(final Income pInc) {
      return new Mutable(pInc);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static X_inv08_noType.Match newMatch(final Income pInc) {
      return new Immutable(pInc);
    }
    
    private static final class Mutable extends X_inv08_noType.Match {
      Mutable(final Income pInc) {
        super(pInc);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends X_inv08_noType.Match {
      Immutable(final Income pInc) {
        super(pInc);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.x_inv08_noType pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern x_inv08_noType(inc : Income) {
   *     Income.income_type(inc, _);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see X_inv08_noType
   * 
   */
  public static class Matcher extends BaseMatcher<X_inv08_noType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static X_inv08_noType.Matcher on(final ViatraQueryEngine engine) {
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
    public static X_inv08_noType.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_INC = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(X_inv08_noType.Matcher.class);
    
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
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<X_inv08_noType.Match> getAllMatches(final Income pInc) {
      return rawStreamAllMatches(new Object[]{pInc}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<X_inv08_noType.Match> streamAllMatches(final Income pInc) {
      return rawStreamAllMatches(new Object[]{pInc});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<X_inv08_noType.Match> getOneArbitraryMatch(final Income pInc) {
      return rawGetOneArbitraryMatch(new Object[]{pInc});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Income pInc) {
      return rawHasMatch(new Object[]{pInc});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Income pInc) {
      return rawCountMatches(new Object[]{pInc});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Income pInc, final Consumer<? super X_inv08_noType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInc}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public X_inv08_noType.Match newMatch(final Income pInc) {
      return X_inv08_noType.Match.newMatch(pInc);
    }
    
    /**
     * Retrieve the set of values that occur in matches for inc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Income> rawStreamAllValuesOfinc(final Object[] parameters) {
      return rawStreamAllValues(POSITION_INC, parameters).map(Income.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for inc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Income> getAllValuesOfinc() {
      return rawStreamAllValuesOfinc(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for inc.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Income> streamAllValuesOfinc() {
      return rawStreamAllValuesOfinc(emptyArray());
    }
    
    @Override
    protected X_inv08_noType.Match tupleToMatch(final Tuple t) {
      try {
          return X_inv08_noType.Match.newMatch((Income) t.get(POSITION_INC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv08_noType.Match arrayToMatch(final Object[] match) {
      try {
          return X_inv08_noType.Match.newMatch((Income) match[POSITION_INC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv08_noType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return X_inv08_noType.Match.newMutableMatch((Income) match[POSITION_INC]);
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
    public static IQuerySpecification<X_inv08_noType.Matcher> querySpecification() {
      return X_inv08_noType.instance();
    }
  }
  
  private X_inv08_noType() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static X_inv08_noType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected X_inv08_noType.Matcher instantiate(final ViatraQueryEngine engine) {
    return X_inv08_noType.Matcher.on(engine);
  }
  
  @Override
  public X_inv08_noType.Matcher instantiate() {
    return X_inv08_noType.Matcher.create();
  }
  
  @Override
  public X_inv08_noType.Match newEmptyMatch() {
    return X_inv08_noType.Match.newEmptyMatch();
  }
  
  @Override
  public X_inv08_noType.Match newMatch(final Object... parameters) {
    return X_inv08_noType.Match.newMatch((Taxation.Income) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link X_inv08_noType} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link X_inv08_noType#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final X_inv08_noType INSTANCE = new X_inv08_noType();
    
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
    private static final X_inv08_noType.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_inc = new PParameter("inc", "Taxation.Income", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Income")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_inc);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.x_inv08_noType";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("inc");
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
          PVariable var_inc = body.getOrCreateVariableByName("inc");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_inc, parameter_inc)
          ));
          //     Income.income_type(inc, _)
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income", "income_type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income_Type")));
          new Equality(body, var__virtual_0_, var___0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
