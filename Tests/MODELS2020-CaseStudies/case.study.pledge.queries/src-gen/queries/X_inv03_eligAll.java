/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/case_study_A.vql
 */
package queries;

import Taxation.Dependent;
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         pattern x_inv03_eligAll(dep : Dependent) {
 *             Dependent.birth_year(dep, by);
 *             check(2018-by {@literal <}= 21);
 *         } or {
 *         	Dependent.continued_studies(dep, true);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class X_inv03_eligAll extends BaseGeneratedEMFQuerySpecification<X_inv03_eligAll.Matcher> {
  /**
   * Pattern-specific match representation of the queries.x_inv03_eligAll pattern,
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
    private Dependent fDep;
    
    private static List<String> parameterNames = makeImmutableList("dep");
    
    private Match(final Dependent pDep) {
      this.fDep = pDep;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "dep": return this.fDep;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fDep;
          default: return null;
      }
    }
    
    public Dependent getDep() {
      return this.fDep;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("dep".equals(parameterName) ) {
          this.fDep = (Dependent) newValue;
          return true;
      }
      return false;
    }
    
    public void setDep(final Dependent pDep) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDep = pDep;
    }
    
    @Override
    public String patternName() {
      return "queries.x_inv03_eligAll";
    }
    
    @Override
    public List<String> parameterNames() {
      return X_inv03_eligAll.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDep};
    }
    
    @Override
    public X_inv03_eligAll.Match toImmutable() {
      return isMutable() ? newMatch(fDep) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"dep\"=" + prettyPrintValue(fDep));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDep);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof X_inv03_eligAll.Match)) {
          X_inv03_eligAll.Match other = (X_inv03_eligAll.Match) obj;
          return Objects.equals(fDep, other.fDep);
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
    public X_inv03_eligAll specification() {
      return X_inv03_eligAll.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static X_inv03_eligAll.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static X_inv03_eligAll.Match newMutableMatch(final Dependent pDep) {
      return new Mutable(pDep);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static X_inv03_eligAll.Match newMatch(final Dependent pDep) {
      return new Immutable(pDep);
    }
    
    private static final class Mutable extends X_inv03_eligAll.Match {
      Mutable(final Dependent pDep) {
        super(pDep);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends X_inv03_eligAll.Match {
      Immutable(final Dependent pDep) {
        super(pDep);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.x_inv03_eligAll pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern x_inv03_eligAll(dep : Dependent) {
   *     Dependent.birth_year(dep, by);
   *     check(2018-by {@literal <}= 21);
   * } or {
   * 	Dependent.continued_studies(dep, true);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see X_inv03_eligAll
   * 
   */
  public static class Matcher extends BaseMatcher<X_inv03_eligAll.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static X_inv03_eligAll.Matcher on(final ViatraQueryEngine engine) {
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
    public static X_inv03_eligAll.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DEP = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(X_inv03_eligAll.Matcher.class);
    
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
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<X_inv03_eligAll.Match> getAllMatches(final Dependent pDep) {
      return rawStreamAllMatches(new Object[]{pDep}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<X_inv03_eligAll.Match> streamAllMatches(final Dependent pDep) {
      return rawStreamAllMatches(new Object[]{pDep});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<X_inv03_eligAll.Match> getOneArbitraryMatch(final Dependent pDep) {
      return rawGetOneArbitraryMatch(new Object[]{pDep});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Dependent pDep) {
      return rawHasMatch(new Object[]{pDep});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Dependent pDep) {
      return rawCountMatches(new Object[]{pDep});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Dependent pDep, final Consumer<? super X_inv03_eligAll.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDep}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDep the fixed value of pattern parameter dep, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public X_inv03_eligAll.Match newMatch(final Dependent pDep) {
      return X_inv03_eligAll.Match.newMatch(pDep);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dep.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Dependent> rawStreamAllValuesOfdep(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DEP, parameters).map(Dependent.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dep.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Dependent> getAllValuesOfdep() {
      return rawStreamAllValuesOfdep(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dep.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Dependent> streamAllValuesOfdep() {
      return rawStreamAllValuesOfdep(emptyArray());
    }
    
    @Override
    protected X_inv03_eligAll.Match tupleToMatch(final Tuple t) {
      try {
          return X_inv03_eligAll.Match.newMatch((Dependent) t.get(POSITION_DEP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv03_eligAll.Match arrayToMatch(final Object[] match) {
      try {
          return X_inv03_eligAll.Match.newMatch((Dependent) match[POSITION_DEP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv03_eligAll.Match arrayToMatchMutable(final Object[] match) {
      try {
          return X_inv03_eligAll.Match.newMutableMatch((Dependent) match[POSITION_DEP]);
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
    public static IQuerySpecification<X_inv03_eligAll.Matcher> querySpecification() {
      return X_inv03_eligAll.instance();
    }
  }
  
  private X_inv03_eligAll() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static X_inv03_eligAll instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected X_inv03_eligAll.Matcher instantiate(final ViatraQueryEngine engine) {
    return X_inv03_eligAll.Matcher.on(engine);
  }
  
  @Override
  public X_inv03_eligAll.Matcher instantiate() {
    return X_inv03_eligAll.Matcher.create();
  }
  
  @Override
  public X_inv03_eligAll.Match newEmptyMatch() {
    return X_inv03_eligAll.Match.newEmptyMatch();
  }
  
  @Override
  public X_inv03_eligAll.Match newMatch(final Object... parameters) {
    return X_inv03_eligAll.Match.newMatch((Taxation.Dependent) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link X_inv03_eligAll} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link X_inv03_eligAll#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final X_inv03_eligAll INSTANCE = new X_inv03_eligAll();
    
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
    private static final X_inv03_eligAll.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_dep = new PParameter("dep", "Taxation.Dependent", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Dependent")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_dep);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.x_inv03_eligAll";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("dep");
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
          PVariable var_dep = body.getOrCreateVariableByName("dep");
          PVariable var_by = body.getOrCreateVariableByName("by");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_dep, parameter_dep)
          ));
          //     Dependent.birth_year(dep, by)
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Physical_Person", "birth_year")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_0_, var_by);
          //     check(2018-by <= 21)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern x_inv03_eligAll";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("by");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer by = (Integer) provider.getValue("by");
                  return evaluateExpression_1_1(by);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_dep = body.getOrCreateVariableByName("dep");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_dep, parameter_dep)
          ));
          // 	Dependent.continued_studies(dep, true)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, true);
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Dependent", "continued_studies")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer by) {
    return ((2018 - (by).intValue()) <= 21);
  }
  
  private static boolean evaluateExpression_2_1() {
    return true;
  }
}
