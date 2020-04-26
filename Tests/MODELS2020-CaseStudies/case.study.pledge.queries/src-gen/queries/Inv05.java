/**
 * Generated from platform:/resource/case.study.a.queries/src/queries/case_study_A.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.X_inv05_inRange;
import queries.X_inv08_noType;
import queries.X_inv08_notEI;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //inv5 - oclIsTypeOf - handled here
 *         {@literal @}Constraint(message = "inv05", severity = "error", key = {inc})
 *         pattern inv05(inc : Income) {
 *         	//income_type: None
 *             neg find x_inv08_noType(inc);
 *             Income.details.worked_days(inc, wd);
 *             check(wd != 0);
 *         } or {
 *         	//income_type: Not Employment_Income
 *             Income.income_type(inc, type);
 *             neg find x_inv08_notEI(type);
 *             Income.details.worked_days(inc, wd);
 *             check(wd != 0);
 *         } or {
 *         	//income_type: Employment Income
 *         	Income.income_type(inc, type);
 *             Employment_Income(type);
 *             find x_inv05_inRange(inc);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Inv05 extends BaseGeneratedEMFQuerySpecification<Inv05.Matcher> {
  /**
   * Pattern-specific match representation of the queries.inv05 pattern,
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
      return "queries.inv05";
    }
    
    @Override
    public List<String> parameterNames() {
      return Inv05.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInc};
    }
    
    @Override
    public Inv05.Match toImmutable() {
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
      if ((obj instanceof Inv05.Match)) {
          Inv05.Match other = (Inv05.Match) obj;
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
    public Inv05 specification() {
      return Inv05.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Inv05.Match newEmptyMatch() {
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
    public static Inv05.Match newMutableMatch(final Income pInc) {
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
    public static Inv05.Match newMatch(final Income pInc) {
      return new Immutable(pInc);
    }
    
    private static final class Mutable extends Inv05.Match {
      Mutable(final Income pInc) {
        super(pInc);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Inv05.Match {
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
   * Generated pattern matcher API of the queries.inv05 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //inv5 - oclIsTypeOf - handled here
   * {@literal @}Constraint(message = "inv05", severity = "error", key = {inc})
   * pattern inv05(inc : Income) {
   * 	//income_type: None
   *     neg find x_inv08_noType(inc);
   *     Income.details.worked_days(inc, wd);
   *     check(wd != 0);
   * } or {
   * 	//income_type: Not Employment_Income
   *     Income.income_type(inc, type);
   *     neg find x_inv08_notEI(type);
   *     Income.details.worked_days(inc, wd);
   *     check(wd != 0);
   * } or {
   * 	//income_type: Employment Income
   * 	Income.income_type(inc, type);
   *     Employment_Income(type);
   *     find x_inv05_inRange(inc);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Inv05
   * 
   */
  public static class Matcher extends BaseMatcher<Inv05.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Inv05.Matcher on(final ViatraQueryEngine engine) {
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
    public static Inv05.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_INC = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Inv05.Matcher.class);
    
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
    public Collection<Inv05.Match> getAllMatches(final Income pInc) {
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
    public Stream<Inv05.Match> streamAllMatches(final Income pInc) {
      return rawStreamAllMatches(new Object[]{pInc});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInc the fixed value of pattern parameter inc, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Inv05.Match> getOneArbitraryMatch(final Income pInc) {
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
    public boolean forOneArbitraryMatch(final Income pInc, final Consumer<? super Inv05.Match> processor) {
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
    public Inv05.Match newMatch(final Income pInc) {
      return Inv05.Match.newMatch(pInc);
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
    protected Inv05.Match tupleToMatch(final Tuple t) {
      try {
          return Inv05.Match.newMatch((Income) t.get(POSITION_INC));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv05.Match arrayToMatch(final Object[] match) {
      try {
          return Inv05.Match.newMatch((Income) match[POSITION_INC]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv05.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Inv05.Match.newMutableMatch((Income) match[POSITION_INC]);
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
    public static IQuerySpecification<Inv05.Matcher> querySpecification() {
      return Inv05.instance();
    }
  }
  
  private Inv05() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Inv05 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Inv05.Matcher instantiate(final ViatraQueryEngine engine) {
    return Inv05.Matcher.on(engine);
  }
  
  @Override
  public Inv05.Matcher instantiate() {
    return Inv05.Matcher.create();
  }
  
  @Override
  public Inv05.Match newEmptyMatch() {
    return Inv05.Match.newEmptyMatch();
  }
  
  @Override
  public Inv05.Match newMatch(final Object... parameters) {
    return Inv05.Match.newMatch((Taxation.Income) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Inv05} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Inv05#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Inv05 INSTANCE = new Inv05();
    
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
    private static final Inv05.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_inc = new PParameter("inc", "Taxation.Income", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Income")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_inc);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.inv05";
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
          PVariable var_wd = body.getOrCreateVariableByName("wd");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_inc, parameter_inc)
          ));
          // 	//income_type: None    neg find x_inv08_noType(inc)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_inc), X_inv08_noType.instance().getInternalQueryRepresentation());
          //     Income.details.worked_days(inc, wd)
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income", "details")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income_Detail")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income_Detail", "worked_days")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_1_, var_wd);
          //     check(wd != 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern inv05";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("wd");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer wd = (Integer) provider.getValue("wd");
                  return evaluateExpression_1_1(wd);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_inc = body.getOrCreateVariableByName("inc");
          PVariable var_type = body.getOrCreateVariableByName("type");
          PVariable var_wd = body.getOrCreateVariableByName("wd");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_inc, parameter_inc)
          ));
          // 	//income_type: Not Employment_Income    Income.income_type(inc, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income", "income_type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income_Type")));
          new Equality(body, var__virtual_0_, var_type);
          //     neg find x_inv08_notEI(type)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_type), X_inv08_notEI.instance().getInternalQueryRepresentation());
          //     Income.details.worked_days(inc, wd)
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income", "details")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income_Detail")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income_Detail", "worked_days")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_2_, var_wd);
          //     check(wd != 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern inv05";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("wd");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer wd = (Integer) provider.getValue("wd");
                  return evaluateExpression_2_1(wd);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_inc = body.getOrCreateVariableByName("inc");
          PVariable var_type = body.getOrCreateVariableByName("type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_inc, parameter_inc)
          ));
          // 	//income_type: Employment Income	Income.income_type(inc, type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_inc, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Income", "income_type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Income_Type")));
          new Equality(body, var__virtual_0_, var_type);
          //     Employment_Income(type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Employment_Income")));
          //     find x_inv05_inRange(inc)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_inc), X_inv05_inRange.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "inv05");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("inc")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer wd) {
    return ((wd).intValue() != 0);
  }
  
  private static boolean evaluateExpression_2_1(final Integer wd) {
    return ((wd).intValue() != 0);
  }
}
