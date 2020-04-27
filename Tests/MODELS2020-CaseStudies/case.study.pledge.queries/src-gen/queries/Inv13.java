/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/case_study_A.vql
 */
package queries;

import Taxation.Tax_Payer;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.X_inv13;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         //inv13 - Added new containment rel Phys_Pers-{@literal >}Address
 *         //exists - handled logically
 *         {@literal @}Constraint(message = "inv13", severity = "error", key = {tp})
 *         pattern inv13(tp : Tax_Payer) {
 *             Tax_Payer.addresses(tp, hab_add);
 *             Habitual_Address(hab_add);
 *             Address.country(hab_add, ::ZZ);
 *             neg find x_inv13(tp);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Inv13 extends BaseGeneratedEMFQuerySpecification<Inv13.Matcher> {
  /**
   * Pattern-specific match representation of the queries.inv13 pattern,
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
    private Tax_Payer fTp;
    
    private static List<String> parameterNames = makeImmutableList("tp");
    
    private Match(final Tax_Payer pTp) {
      this.fTp = pTp;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "tp": return this.fTp;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fTp;
          default: return null;
      }
    }
    
    public Tax_Payer getTp() {
      return this.fTp;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("tp".equals(parameterName) ) {
          this.fTp = (Tax_Payer) newValue;
          return true;
      }
      return false;
    }
    
    public void setTp(final Tax_Payer pTp) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTp = pTp;
    }
    
    @Override
    public String patternName() {
      return "queries.inv13";
    }
    
    @Override
    public List<String> parameterNames() {
      return Inv13.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTp};
    }
    
    @Override
    public Inv13.Match toImmutable() {
      return isMutable() ? newMatch(fTp) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"tp\"=" + prettyPrintValue(fTp));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTp);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Inv13.Match)) {
          Inv13.Match other = (Inv13.Match) obj;
          return Objects.equals(fTp, other.fTp);
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
    public Inv13 specification() {
      return Inv13.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Inv13.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Inv13.Match newMutableMatch(final Tax_Payer pTp) {
      return new Mutable(pTp);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Inv13.Match newMatch(final Tax_Payer pTp) {
      return new Immutable(pTp);
    }
    
    private static final class Mutable extends Inv13.Match {
      Mutable(final Tax_Payer pTp) {
        super(pTp);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Inv13.Match {
      Immutable(final Tax_Payer pTp) {
        super(pTp);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.inv13 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * //inv13 - Added new containment rel Phys_Pers-{@literal >}Address
   * //exists - handled logically
   * {@literal @}Constraint(message = "inv13", severity = "error", key = {tp})
   * pattern inv13(tp : Tax_Payer) {
   *     Tax_Payer.addresses(tp, hab_add);
   *     Habitual_Address(hab_add);
   *     Address.country(hab_add, ::ZZ);
   *     neg find x_inv13(tp);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see Inv13
   * 
   */
  public static class Matcher extends BaseMatcher<Inv13.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Inv13.Matcher on(final ViatraQueryEngine engine) {
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
    public static Inv13.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_TP = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Inv13.Matcher.class);
    
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
    public Collection<Inv13.Match> getAllMatches(final Tax_Payer pTp) {
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
    public Stream<Inv13.Match> streamAllMatches(final Tax_Payer pTp) {
      return rawStreamAllMatches(new Object[]{pTp});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTp the fixed value of pattern parameter tp, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Inv13.Match> getOneArbitraryMatch(final Tax_Payer pTp) {
      return rawGetOneArbitraryMatch(new Object[]{pTp});
    }
    
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
    public boolean forOneArbitraryMatch(final Tax_Payer pTp, final Consumer<? super Inv13.Match> processor) {
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
    public Inv13.Match newMatch(final Tax_Payer pTp) {
      return Inv13.Match.newMatch(pTp);
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
    protected Inv13.Match tupleToMatch(final Tuple t) {
      try {
          return Inv13.Match.newMatch((Tax_Payer) t.get(POSITION_TP));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv13.Match arrayToMatch(final Object[] match) {
      try {
          return Inv13.Match.newMatch((Tax_Payer) match[POSITION_TP]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Inv13.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Inv13.Match.newMutableMatch((Tax_Payer) match[POSITION_TP]);
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
    public static IQuerySpecification<Inv13.Matcher> querySpecification() {
      return Inv13.instance();
    }
  }
  
  private Inv13() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Inv13 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Inv13.Matcher instantiate(final ViatraQueryEngine engine) {
    return Inv13.Matcher.on(engine);
  }
  
  @Override
  public Inv13.Matcher instantiate() {
    return Inv13.Matcher.create();
  }
  
  @Override
  public Inv13.Match newEmptyMatch() {
    return Inv13.Match.newEmptyMatch();
  }
  
  @Override
  public Inv13.Match newMatch(final Object... parameters) {
    return Inv13.Match.newMatch((Taxation.Tax_Payer) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Inv13} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Inv13#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Inv13 INSTANCE = new Inv13();
    
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
    private static final Inv13.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_tp = new PParameter("tp", "Taxation.Tax_Payer", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Tax_Payer")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_tp);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.inv13";
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
          PVariable var_hab_add = body.getOrCreateVariableByName("hab_add");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_tp, parameter_tp)
          ));
          //     Tax_Payer.addresses(tp, hab_add)
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Tax_Payer")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_tp, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Physical_Person", "addresses")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Address")));
          new Equality(body, var__virtual_0_, var_hab_add);
          //     Habitual_Address(hab_add)
          new TypeConstraint(body, Tuples.flatTupleOf(var_hab_add), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Habitual_Address")));
          //     Address.country(hab_add, ::ZZ)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("http:///TaxCard.ecore", "Country", "ZZ").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_hab_add), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Address")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_hab_add, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Address", "country")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http:///TaxCard.ecore", "Country")));
          new Equality(body, var__virtual_2_, var__virtual_1_);
          //     neg find x_inv13(tp)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_tp), X_inv13.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "inv13");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("tp")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
