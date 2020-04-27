/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/case_study_A.vql
 */
package queries;

import Taxation.Expense;
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
 *         pattern x_inv11_incOver100(exp : Expense) {
 *             Expense.income.income_amount(exp, incVal);
 *             check(incVal / 2 {@literal >} 50);
 *         
 *         } or {
 *         	Expense.declared_amount(exp, decl);
 *             check(decl != 50);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class X_inv11_incOver100 extends BaseGeneratedEMFQuerySpecification<X_inv11_incOver100.Matcher> {
  /**
   * Pattern-specific match representation of the queries.x_inv11_incOver100 pattern,
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
    private Expense fExp;
    
    private static List<String> parameterNames = makeImmutableList("exp");
    
    private Match(final Expense pExp) {
      this.fExp = pExp;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "exp": return this.fExp;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fExp;
          default: return null;
      }
    }
    
    public Expense getExp() {
      return this.fExp;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("exp".equals(parameterName) ) {
          this.fExp = (Expense) newValue;
          return true;
      }
      return false;
    }
    
    public void setExp(final Expense pExp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fExp = pExp;
    }
    
    @Override
    public String patternName() {
      return "queries.x_inv11_incOver100";
    }
    
    @Override
    public List<String> parameterNames() {
      return X_inv11_incOver100.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fExp};
    }
    
    @Override
    public X_inv11_incOver100.Match toImmutable() {
      return isMutable() ? newMatch(fExp) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"exp\"=" + prettyPrintValue(fExp));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fExp);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof X_inv11_incOver100.Match)) {
          X_inv11_incOver100.Match other = (X_inv11_incOver100.Match) obj;
          return Objects.equals(fExp, other.fExp);
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
    public X_inv11_incOver100 specification() {
      return X_inv11_incOver100.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static X_inv11_incOver100.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static X_inv11_incOver100.Match newMutableMatch(final Expense pExp) {
      return new Mutable(pExp);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static X_inv11_incOver100.Match newMatch(final Expense pExp) {
      return new Immutable(pExp);
    }
    
    private static final class Mutable extends X_inv11_incOver100.Match {
      Mutable(final Expense pExp) {
        super(pExp);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends X_inv11_incOver100.Match {
      Immutable(final Expense pExp) {
        super(pExp);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.x_inv11_incOver100 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern x_inv11_incOver100(exp : Expense) {
   *     Expense.income.income_amount(exp, incVal);
   *     check(incVal / 2 {@literal >} 50);
   * 
   * } or {
   * 	Expense.declared_amount(exp, decl);
   *     check(decl != 50);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see X_inv11_incOver100
   * 
   */
  public static class Matcher extends BaseMatcher<X_inv11_incOver100.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static X_inv11_incOver100.Matcher on(final ViatraQueryEngine engine) {
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
    public static X_inv11_incOver100.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EXP = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(X_inv11_incOver100.Matcher.class);
    
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
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<X_inv11_incOver100.Match> getAllMatches(final Expense pExp) {
      return rawStreamAllMatches(new Object[]{pExp}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<X_inv11_incOver100.Match> streamAllMatches(final Expense pExp) {
      return rawStreamAllMatches(new Object[]{pExp});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<X_inv11_incOver100.Match> getOneArbitraryMatch(final Expense pExp) {
      return rawGetOneArbitraryMatch(new Object[]{pExp});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Expense pExp) {
      return rawHasMatch(new Object[]{pExp});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Expense pExp) {
      return rawCountMatches(new Object[]{pExp});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Expense pExp, final Consumer<? super X_inv11_incOver100.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pExp}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pExp the fixed value of pattern parameter exp, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public X_inv11_incOver100.Match newMatch(final Expense pExp) {
      return X_inv11_incOver100.Match.newMatch(pExp);
    }
    
    /**
     * Retrieve the set of values that occur in matches for exp.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Expense> rawStreamAllValuesOfexp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EXP, parameters).map(Expense.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for exp.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Expense> getAllValuesOfexp() {
      return rawStreamAllValuesOfexp(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for exp.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Expense> streamAllValuesOfexp() {
      return rawStreamAllValuesOfexp(emptyArray());
    }
    
    @Override
    protected X_inv11_incOver100.Match tupleToMatch(final Tuple t) {
      try {
          return X_inv11_incOver100.Match.newMatch((Expense) t.get(POSITION_EXP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv11_incOver100.Match arrayToMatch(final Object[] match) {
      try {
          return X_inv11_incOver100.Match.newMatch((Expense) match[POSITION_EXP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv11_incOver100.Match arrayToMatchMutable(final Object[] match) {
      try {
          return X_inv11_incOver100.Match.newMutableMatch((Expense) match[POSITION_EXP]);
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
    public static IQuerySpecification<X_inv11_incOver100.Matcher> querySpecification() {
      return X_inv11_incOver100.instance();
    }
  }
  
  private X_inv11_incOver100() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static X_inv11_incOver100 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected X_inv11_incOver100.Matcher instantiate(final ViatraQueryEngine engine) {
    return X_inv11_incOver100.Matcher.on(engine);
  }
  
  @Override
  public X_inv11_incOver100.Matcher instantiate() {
    return X_inv11_incOver100.Matcher.create();
  }
  
  @Override
  public X_inv11_incOver100.Match newEmptyMatch() {
    return X_inv11_incOver100.Match.newEmptyMatch();
  }
  
  @Override
  public X_inv11_incOver100.Match newMatch(final Object... parameters) {
    return X_inv11_incOver100.Match.newMatch((Taxation.Expense) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link X_inv11_incOver100} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link X_inv11_incOver100#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final X_inv11_incOver100 INSTANCE = new X_inv11_incOver100();
    
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
    private static final X_inv11_incOver100.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_exp = new PParameter("exp", "Taxation.Expense", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Expense")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_exp);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.x_inv11_incOver100";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("exp");
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
          PVariable var_exp = body.getOrCreateVariableByName("exp");
          PVariable var_incVal = body.getOrCreateVariableByName("incVal");
          new TypeConstraint(body, Tuples.flatTupleOf(var_exp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Expense")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_exp, parameter_exp)
          ));
          //     Expense.income.income_amount(exp, incVal)
          new TypeConstraint(body, Tuples.flatTupleOf(var_exp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Expense")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_exp, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Expense", "income")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income", "income_amount")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EDouble")));
          new Equality(body, var__virtual_1_, var_incVal);
          //     check(incVal / 2 > 50)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern x_inv11_incOver100";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("incVal");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Double incVal = (Double) provider.getValue("incVal");
                  return evaluateExpression_1_1(incVal);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_exp = body.getOrCreateVariableByName("exp");
          PVariable var_decl = body.getOrCreateVariableByName("decl");
          new TypeConstraint(body, Tuples.flatTupleOf(var_exp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Expense")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_exp, parameter_exp)
          ));
          // 	Expense.declared_amount(exp, decl)
          new TypeConstraint(body, Tuples.flatTupleOf(var_exp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Expense")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_exp, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Expense", "declared_amount")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EDouble")));
          new Equality(body, var__virtual_0_, var_decl);
          //     check(decl != 50)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern x_inv11_incOver100";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("decl");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Double decl = (Double) provider.getValue("decl");
                  return evaluateExpression_2_1(decl);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Double incVal) {
    return (((incVal).doubleValue() / 2) > 50);
  }
  
  private static boolean evaluateExpression_2_1(final Double decl) {
    return ((decl).doubleValue() != 50);
  }
}
