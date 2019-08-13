/**
 * Generated from platform:/resource/SocialNetwork_plugin/queries/ecore/ecore_pattern.vql
 */
package ecore;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
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
 *         {@literal @}Constraint(severity="error", message="error", key = {c})
 *         pattern moreThenFiveSuperTypes(c: EClass){
 *         	m == count EClass.eSuperTypes(c,_);
 *         	check(m {@literal >}= 5);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MoreThenFiveSuperTypes extends BaseGeneratedEMFQuerySpecification<MoreThenFiveSuperTypes.Matcher> {
  /**
   * Pattern-specific match representation of the ecore.moreThenFiveSuperTypes pattern,
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
    private EClass fC;
    
    private static List<String> parameterNames = makeImmutableList("c");
    
    private Match(final EClass pC) {
      this.fC = pC;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("c".equals(parameterName)) return this.fC;
      return null;
    }
    
    public EClass getC() {
      return this.fC;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("c".equals(parameterName) ) {
          this.fC = (EClass) newValue;
          return true;
      }
      return false;
    }
    
    public void setC(final EClass pC) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fC = pC;
    }
    
    @Override
    public String patternName() {
      return "ecore.moreThenFiveSuperTypes";
    }
    
    @Override
    public List<String> parameterNames() {
      return MoreThenFiveSuperTypes.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fC};
    }
    
    @Override
    public MoreThenFiveSuperTypes.Match toImmutable() {
      return isMutable() ? newMatch(fC) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"c\"=" + prettyPrintValue(fC));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fC);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MoreThenFiveSuperTypes.Match)) {
          MoreThenFiveSuperTypes.Match other = (MoreThenFiveSuperTypes.Match) obj;
          return Objects.equals(fC, other.fC);
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
    public MoreThenFiveSuperTypes specification() {
      return MoreThenFiveSuperTypes.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MoreThenFiveSuperTypes.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MoreThenFiveSuperTypes.Match newMutableMatch(final EClass pC) {
      return new Mutable(pC);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MoreThenFiveSuperTypes.Match newMatch(final EClass pC) {
      return new Immutable(pC);
    }
    
    private static final class Mutable extends MoreThenFiveSuperTypes.Match {
      Mutable(final EClass pC) {
        super(pC);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MoreThenFiveSuperTypes.Match {
      Immutable(final EClass pC) {
        super(pC);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the ecore.moreThenFiveSuperTypes pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity="error", message="error", key = {c})
   * pattern moreThenFiveSuperTypes(c: EClass){
   * 	m == count EClass.eSuperTypes(c,_);
   * 	check(m {@literal >}= 5);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MoreThenFiveSuperTypes
   * 
   */
  public static class Matcher extends BaseMatcher<MoreThenFiveSuperTypes.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MoreThenFiveSuperTypes.Matcher on(final ViatraQueryEngine engine) {
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
    public static MoreThenFiveSuperTypes.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_C = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MoreThenFiveSuperTypes.Matcher.class);
    
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
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MoreThenFiveSuperTypes.Match> getAllMatches(final EClass pC) {
      return rawStreamAllMatches(new Object[]{pC}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MoreThenFiveSuperTypes.Match> streamAllMatches(final EClass pC) {
      return rawStreamAllMatches(new Object[]{pC});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MoreThenFiveSuperTypes.Match> getOneArbitraryMatch(final EClass pC) {
      return rawGetOneArbitraryMatch(new Object[]{pC});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EClass pC) {
      return rawHasMatch(new Object[]{pC});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EClass pC) {
      return rawCountMatches(new Object[]{pC});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EClass pC, final Consumer<? super MoreThenFiveSuperTypes.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pC}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pC the fixed value of pattern parameter c, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MoreThenFiveSuperTypes.Match newMatch(final EClass pC) {
      return MoreThenFiveSuperTypes.Match.newMatch(pC);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EClass> rawStreamAllValuesOfc(final Object[] parameters) {
      return rawStreamAllValues(POSITION_C, parameters).map(EClass.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EClass> getAllValuesOfc() {
      return rawStreamAllValuesOfc(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for c.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EClass> streamAllValuesOfc() {
      return rawStreamAllValuesOfc(emptyArray());
    }
    
    @Override
    protected MoreThenFiveSuperTypes.Match tupleToMatch(final Tuple t) {
      try {
          return MoreThenFiveSuperTypes.Match.newMatch((EClass) t.get(POSITION_C));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoreThenFiveSuperTypes.Match arrayToMatch(final Object[] match) {
      try {
          return MoreThenFiveSuperTypes.Match.newMatch((EClass) match[POSITION_C]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MoreThenFiveSuperTypes.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MoreThenFiveSuperTypes.Match.newMutableMatch((EClass) match[POSITION_C]);
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
    public static IQuerySpecification<MoreThenFiveSuperTypes.Matcher> querySpecification() {
      return MoreThenFiveSuperTypes.instance();
    }
  }
  
  private MoreThenFiveSuperTypes() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MoreThenFiveSuperTypes instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoreThenFiveSuperTypes.Matcher instantiate(final ViatraQueryEngine engine) {
    return MoreThenFiveSuperTypes.Matcher.on(engine);
  }
  
  @Override
  public MoreThenFiveSuperTypes.Matcher instantiate() {
    return MoreThenFiveSuperTypes.Matcher.create();
  }
  
  @Override
  public MoreThenFiveSuperTypes.Match newEmptyMatch() {
    return MoreThenFiveSuperTypes.Match.newEmptyMatch();
  }
  
  @Override
  public MoreThenFiveSuperTypes.Match newMatch(final Object... parameters) {
    return MoreThenFiveSuperTypes.Match.newMatch((org.eclipse.emf.ecore.EClass) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: ecore.MoreThenFiveSuperTypes (visibility: PUBLIC, simpleName: MoreThenFiveSuperTypes, identifier: ecore.MoreThenFiveSuperTypes, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ecore) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: ecore.MoreThenFiveSuperTypes (visibility: PUBLIC, simpleName: MoreThenFiveSuperTypes, identifier: ecore.MoreThenFiveSuperTypes, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: ecore) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MoreThenFiveSuperTypes INSTANCE = new MoreThenFiveSuperTypes();
    
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
    private static final MoreThenFiveSuperTypes.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_c = new PParameter("c", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_c);
    
    private class Embedded_1_EClass_eSuperTypes extends BaseGeneratedEMFPQuery {
      private final PParameter parameter_p0 = new PParameter("p0", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
      
      private final PParameter parameter_p1 = new PParameter("p1", "org.eclipse.emf.ecore.EClass", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.eclipse.org/emf/2002/Ecore", "EClass")), PParameterDirection.INOUT);
      
      private final List<PParameter> embeddedParameters = Arrays.asList(parameter_p0, parameter_p1);
      
      public Embedded_1_EClass_eSuperTypes() {
        super(PVisibility.EMBEDDED);
      }
      
      @Override
      public String getFullyQualifiedName() {
        return GeneratedPQuery.this.getFullyQualifiedName() + "$Embedded_1_EClass_eSuperTypes";
      }
      
      @Override
      public List<PParameter> getParameters() {
        return embeddedParameters;
      }
      
      @Override
      public Set<PBody> doGetContainedBodies() {
        PBody body = new PBody(this);
        PVariable var_p0 = body.getOrCreateVariableByName("p0");
        PVariable var_p1 = body.getOrCreateVariableByName("p1");
        body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
           new ExportedParameter(body, var_p0, parameter_p0),
           new ExportedParameter(body, var_p1, parameter_p1)
        ));
        //  EClass.eSuperTypes(c,_)
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
        PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
        new TypeConstraint(body, Tuples.flatTupleOf(var_p0, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass", "eSuperTypes")));
        new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
        new Equality(body, var__virtual_0_, var_p1);
        return Collections.singleton(body);
      }
    }
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "ecore.moreThenFiveSuperTypes";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("c");
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
          PVariable var_c = body.getOrCreateVariableByName("c");
          PVariable var_m = body.getOrCreateVariableByName("m");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_c), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EClass")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_c, parameter_c)
          ));
          // 	m == count EClass.eSuperTypes(c,_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_c, var___0_), new MoreThenFiveSuperTypes.GeneratedPQuery.Embedded_1_EClass_eSuperTypes(), var__virtual_0_);
          new Equality(body, var_m, var__virtual_0_);
          // 	check(m >= 5)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern moreThenFiveSuperTypes";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("m");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer m = (Integer) provider.getValue("m");
                  return evaluateExpression_1_1(m);
              }
          },  null); 
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("message", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("c")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer m) {
    return ((m).intValue() >= 5);
  }
}
