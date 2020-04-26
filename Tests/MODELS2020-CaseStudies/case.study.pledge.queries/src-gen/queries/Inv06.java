/**
 * Generated from platform:/resource/case.study.a.queries/src/queries/case_study_A.vql
 */
package queries;

import Taxation.Tax_Payer;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 *         //inv6-Does not make sens, but directly from OCL
 *         //first part of or from definition of getAge()
 *         {@literal @}Constraint(message = "inv06", severity = "error", key = {tp})
 *         pattern inv06(tp : Tax_Payer) {
 *             Tax_Payer.dependents(tp, _);
 *         	Tax_Payer.birth_year(tp, TPBy);
 *         	check(2018 - TPBy {@literal >} 2018-16);
 *         } or {
 *         	Tax_Payer.birth_year(tp, TPBy);
 *             Tax_Payer.dependents(tp, dep);
 *             Dependent.birth_year(dep, DepBy);
 *             check(2018-DepBy {@literal <}= 2018-TPBy-16);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Inv06 extends BaseGeneratedEMFQuerySpecification<Inv06.Matcher> {
  /**
   * Pattern-specific match representation of the queries.inv06 pattern,
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
  }
  
  /**
   * Generated pattern matcher API of the queries.inv06 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //inv6-Does not make sens, but directly from OCL
   * //first part of or from definition of getAge()
   * {@literal @}Constraint(message = "inv06", severity = "error", key = {tp})
   * pattern inv06(tp : Tax_Payer) {
   *     Tax_Payer.dependents(tp, _);
   * 	Tax_Payer.birth_year(tp, TPBy);
   * 	check(2018 - TPBy {@literal >} 2018-16);
   * } or {
   * 	Tax_Payer.birth_year(tp, TPBy);
   *     Tax_Payer.dependents(tp, dep);
   *     Dependent.birth_year(dep, DepBy);
   *     check(2018-DepBy {@literal <}= 2018-TPBy-16);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Inv06
   * 
   */
  public static class Matcher extends BaseMatcher<Inv06.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Inv06.Matcher on(final ViatraQueryEngine engine) {
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
    public static Inv06.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TP = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Inv06.Matcher.class);
    
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
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Inv06.Match> getAllMatches(final Tax_Payer pTp) {
      return rawStreamAllMatches(new Object[]{pTp}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Inv06.Match> streamAllMatches(final Tax_Payer pTp) {
      return rawStreamAllMatches(new Object[]{pTp});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Inv06.Match> getOneArbitraryMatch();
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Tax_Payer pTp) {
      return rawHasMatch(new Object[]{pTp});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Tax_Payer pTp) {
      return rawCountMatches(new Object[]{pTp});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Tax_Payer pTp, final Consumer<? super Inv06.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pTp}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Inv06.Match newMatch(final Tax_Payer pTp) {
      return Inv06.Match.newMatch(pTp);
    }
    
    /**
     * Retrieve the set of values that occur in matches for tp.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Tax_Payer> rawStreamAllValuesOftp(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TP, parameters).map(Tax_Payer.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for tp.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Tax_Payer> getAllValuesOftp() {
      return rawStreamAllValuesOftp(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for tp.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Tax_Payer> streamAllValuesOftp() {
      return rawStreamAllValuesOftp(emptyArray());
    }
    
    @Override
    protected Inv06.Match tupleToMatch(final Tuple t) {
      try {
          return Inv06.Match.newMatch((Tax_Payer) t.get(POSITION_TP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv06.Match arrayToMatch(final Object[] match) {
      try {
          return Inv06.Match.newMatch((Tax_Payer) match[POSITION_TP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv06.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Inv06.Match.newMutableMatch((Tax_Payer) match[POSITION_TP]);
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
    public static IQuerySpecification<Inv06.Matcher> querySpecification() {
      return Inv06.instance();
    }
  }
  
  private Inv06() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Inv06 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Inv06.Matcher instantiate(final ViatraQueryEngine engine) {
    return Inv06.Matcher.on(engine);
  }
  
  @Override
  public Inv06.Matcher instantiate() {
    return Inv06.Matcher.create();
  }
  
  @Override
  public Inv06.Match newEmptyMatch() {
    return Inv06.Match.newEmptyMatch();
  }
  
  @Override
  public Inv06.Match newMatch(final Object... parameters) {
    return Inv06.Match.newMatch((Taxation.Tax_Payer) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Inv06} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Inv06#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Inv06 INSTANCE = new Inv06();
    
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
    private static final Inv06.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_tp = new PParameter("tp", "Taxation.Tax_Payer", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Tax_Payer")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_tp);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.inv06";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("tp");
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
          PVariable var_tp = body.getOrCreateVariableByName("tp");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_TPBy = body.getOrCreateVariableByName("TPBy");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_tp, parameter_tp)
          ));
          //     Tax_Payer.dependents(tp, _)
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Tax_Payer", "dependents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          new Equality(body, var__virtual_0_, var___0_);
          // 	Tax_Payer.birth_year(tp, TPBy)
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Physical_Person", "birth_year")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_1_, var_TPBy);
          // 	check(2018 - TPBy > 2018-16)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern inv06";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("TPBy");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer TPBy = (Integer) provider.getValue("TPBy");
                  return evaluateExpression_1_1(TPBy);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_tp = body.getOrCreateVariableByName("tp");
          PVariable var_TPBy = body.getOrCreateVariableByName("TPBy");
          PVariable var_dep = body.getOrCreateVariableByName("dep");
          PVariable var_DepBy = body.getOrCreateVariableByName("DepBy");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_tp, parameter_tp)
          ));
          // 	Tax_Payer.birth_year(tp, TPBy)
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Physical_Person", "birth_year")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_0_, var_TPBy);
          //     Tax_Payer.dependents(tp, dep)
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Tax_Payer", "dependents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          new Equality(body, var__virtual_1_, var_dep);
          //     Dependent.birth_year(dep, DepBy)
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dep, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Physical_Person", "birth_year")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_2_, var_DepBy);
          //     check(2018-DepBy <= 2018-TPBy-16)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern inv06";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("DepBy", "TPBy");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer DepBy = (Integer) provider.getValue("DepBy");
                  Integer TPBy = (Integer) provider.getValue("TPBy");
                  return evaluateExpression_2_1(DepBy, TPBy);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "inv06");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("tp")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer TPBy) {
    return ((2018 - (TPBy).intValue()) > (2018 - 16));
  }
  
  private static boolean evaluateExpression_2_1(final Integer DepBy, final Integer TPBy) {
    return ((2018 - (DepBy).intValue()) <= ((2018 - (TPBy).intValue()) - 16));
  }
}
