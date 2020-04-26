/**
 * Generated from platform:/resource/case.study.a.queries/src/queries/case_study_A.vql
 */
package queries;

import Taxation.External_Allowance;
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
 *         pattern x_inv15(ea : External_Allowance) {
 *             External_Allowance.person(ea, child);
 *             Household.children(h, child);//only one due to multiplicity
 *             Household.parents.individual_A(h, iA);
 *             Tax_Payer(iA);
 *             External_Allowance.reciver(ea, iA);
 *         } or {
 *             External_Allowance.person(ea, child);
 *             Household.children(h, child);//only one due to multiplicity
 *             Household.parents.individual_B(h, iB);
 *             Tax_Payer(iB);
 *             External_Allowance.reciver(ea, iB);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class X_inv15 extends BaseGeneratedEMFQuerySpecification<X_inv15.Matcher> {
  /**
   * Pattern-specific match representation of the queries.x_inv15 pattern,
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
    private External_Allowance fEa;
    
    private static List<String> parameterNames = makeImmutableList("ea");
    
    private Match(final External_Allowance pEa) {
      this.fEa = pEa;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "ea": return this.fEa;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fEa;
          default: return null;
      }
    }
    
    public External_Allowance getEa() {
      return this.fEa;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("ea".equals(parameterName) ) {
          this.fEa = (External_Allowance) newValue;
          return true;
      }
      return false;
    }
    
    public void setEa(final External_Allowance pEa) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEa = pEa;
    }
    
    @Override
    public String patternName() {
      return "queries.x_inv15";
    }
    
    @Override
    public List<String> parameterNames() {
      return X_inv15.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEa};
    }
    
    @Override
    public X_inv15.Match toImmutable() {
      return isMutable() ? newMatch(fEa) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"ea\"=" + prettyPrintValue(fEa));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEa);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof X_inv15.Match)) {
          X_inv15.Match other = (X_inv15.Match) obj;
          return Objects.equals(fEa, other.fEa);
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
    public X_inv15 specification() {
      return X_inv15.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static X_inv15.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static X_inv15.Match newMutableMatch(final External_Allowance pEa) {
      return new Mutable(pEa);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static X_inv15.Match newMatch(final External_Allowance pEa) {
      return new Immutable(pEa);
    }
    
    private static final class Mutable extends X_inv15.Match {
      Mutable(final External_Allowance pEa) {
        super(pEa);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends X_inv15.Match {
      Immutable(final External_Allowance pEa) {
        super(pEa);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.x_inv15 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern x_inv15(ea : External_Allowance) {
   *     External_Allowance.person(ea, child);
   *     Household.children(h, child);//only one due to multiplicity
   *     Household.parents.individual_A(h, iA);
   *     Tax_Payer(iA);
   *     External_Allowance.reciver(ea, iA);
   * } or {
   *     External_Allowance.person(ea, child);
   *     Household.children(h, child);//only one due to multiplicity
   *     Household.parents.individual_B(h, iB);
   *     Tax_Payer(iB);
   *     External_Allowance.reciver(ea, iB);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see X_inv15
   * 
   */
  public static class Matcher extends BaseMatcher<X_inv15.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static X_inv15.Matcher on(final ViatraQueryEngine engine) {
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
    public static X_inv15.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_EA = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(X_inv15.Matcher.class);
    
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
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<X_inv15.Match> getAllMatches(final External_Allowance pEa) {
      return rawStreamAllMatches(new Object[]{pEa}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<X_inv15.Match> streamAllMatches(final External_Allowance pEa) {
      return rawStreamAllMatches(new Object[]{pEa});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<X_inv15.Match> getOneArbitraryMatch(final External_Allowance pEa) {
      return rawGetOneArbitraryMatch(new Object[]{pEa});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final External_Allowance pEa) {
      return rawHasMatch(new Object[]{pEa});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final External_Allowance pEa) {
      return rawCountMatches(new Object[]{pEa});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final External_Allowance pEa, final Consumer<? super X_inv15.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEa}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEa the fixed value of pattern parameter ea, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public X_inv15.Match newMatch(final External_Allowance pEa) {
      return X_inv15.Match.newMatch(pEa);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ea.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<External_Allowance> rawStreamAllValuesOfea(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EA, parameters).map(External_Allowance.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for ea.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<External_Allowance> getAllValuesOfea() {
      return rawStreamAllValuesOfea(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for ea.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<External_Allowance> streamAllValuesOfea() {
      return rawStreamAllValuesOfea(emptyArray());
    }
    
    @Override
    protected X_inv15.Match tupleToMatch(final Tuple t) {
      try {
          return X_inv15.Match.newMatch((External_Allowance) t.get(POSITION_EA));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv15.Match arrayToMatch(final Object[] match) {
      try {
          return X_inv15.Match.newMatch((External_Allowance) match[POSITION_EA]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv15.Match arrayToMatchMutable(final Object[] match) {
      try {
          return X_inv15.Match.newMutableMatch((External_Allowance) match[POSITION_EA]);
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
    public static IQuerySpecification<X_inv15.Matcher> querySpecification() {
      return X_inv15.instance();
    }
  }
  
  private X_inv15() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static X_inv15 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected X_inv15.Matcher instantiate(final ViatraQueryEngine engine) {
    return X_inv15.Matcher.on(engine);
  }
  
  @Override
  public X_inv15.Matcher instantiate() {
    return X_inv15.Matcher.create();
  }
  
  @Override
  public X_inv15.Match newEmptyMatch() {
    return X_inv15.Match.newEmptyMatch();
  }
  
  @Override
  public X_inv15.Match newMatch(final Object... parameters) {
    return X_inv15.Match.newMatch((Taxation.External_Allowance) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link X_inv15} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link X_inv15#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final X_inv15 INSTANCE = new X_inv15();
    
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
    private static final X_inv15.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_ea = new PParameter("ea", "Taxation.External_Allowance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "External_Allowance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_ea);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.x_inv15";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ea");
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
          PVariable var_ea = body.getOrCreateVariableByName("ea");
          PVariable var_child = body.getOrCreateVariableByName("child");
          PVariable var_h = body.getOrCreateVariableByName("h");
          PVariable var_iA = body.getOrCreateVariableByName("iA");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "External_Allowance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ea, parameter_ea)
          ));
          //     External_Allowance.person(ea, child)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "External_Allowance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "External_Allowance", "person")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          new Equality(body, var__virtual_0_, var_child);
          //     Household.children(h, child)
          new TypeConstraint(body, Tuples.flatTupleOf(var_h), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Household")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_h, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Household", "children")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          new Equality(body, var__virtual_1_, var_child);
          // //only one due to multiplicity    Household.parents.individual_A(h, iA)
          new TypeConstraint(body, Tuples.flatTupleOf(var_h), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Household")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_h, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Household", "parents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Legal_Union_Record")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Legal_Union_Record", "individual_A")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Physical_Person")));
          new Equality(body, var__virtual_3_, var_iA);
          //     Tax_Payer(iA)
          new TypeConstraint(body, Tuples.flatTupleOf(var_iA), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          //     External_Allowance.reciver(ea, iA)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "External_Allowance")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "External_Allowance", "reciver")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Physical_Person")));
          new Equality(body, var__virtual_4_, var_iA);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_ea = body.getOrCreateVariableByName("ea");
          PVariable var_child = body.getOrCreateVariableByName("child");
          PVariable var_h = body.getOrCreateVariableByName("h");
          PVariable var_iB = body.getOrCreateVariableByName("iB");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "External_Allowance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_ea, parameter_ea)
          ));
          //     External_Allowance.person(ea, child)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "External_Allowance")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "External_Allowance", "person")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          new Equality(body, var__virtual_0_, var_child);
          //     Household.children(h, child)
          new TypeConstraint(body, Tuples.flatTupleOf(var_h), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Household")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_h, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Household", "children")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Dependent")));
          new Equality(body, var__virtual_1_, var_child);
          // //only one due to multiplicity    Household.parents.individual_B(h, iB)
          new TypeConstraint(body, Tuples.flatTupleOf(var_h), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Household")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_h, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Household", "parents")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Legal_Union_Record")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Legal_Union_Record", "individual_B")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Physical_Person")));
          new Equality(body, var__virtual_3_, var_iB);
          //     Tax_Payer(iB)
          new TypeConstraint(body, Tuples.flatTupleOf(var_iB), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          //     External_Allowance.reciver(ea, iB)
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "External_Allowance")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_ea, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "External_Allowance", "reciver")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Physical_Person")));
          new Equality(body, var__virtual_4_, var_iB);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
