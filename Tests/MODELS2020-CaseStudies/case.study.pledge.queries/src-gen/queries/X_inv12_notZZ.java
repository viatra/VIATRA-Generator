/**
 * Generated from platform:/resource/case.study.pledge.run/src/queries/case_study_A.vql
 */
package queries;

import Taxation.Habitual_Address;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         pattern x_inv12_notZZ(hab_add : Habitual_Address) {
 *             Address.country(hab_add, ::ZZ);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class X_inv12_notZZ extends BaseGeneratedEMFQuerySpecification<X_inv12_notZZ.Matcher> {
  /**
   * Pattern-specific match representation of the queries.x_inv12_notZZ pattern,
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
    private Habitual_Address fHab_add;
    
    private static List<String> parameterNames = makeImmutableList("hab_add");
    
    private Match(final Habitual_Address pHab_add) {
      this.fHab_add = pHab_add;
    }
    
    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "hab_add": return this.fHab_add;
          default: return null;
      }
    }
    
    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fHab_add;
          default: return null;
      }
    }
    
    public Habitual_Address getHab_add() {
      return this.fHab_add;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("hab_add".equals(parameterName) ) {
          this.fHab_add = (Habitual_Address) newValue;
          return true;
      }
      return false;
    }
    
    public void setHab_add(final Habitual_Address pHab_add) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHab_add = pHab_add;
    }
    
    @Override
    public String patternName() {
      return "queries.x_inv12_notZZ";
    }
    
    @Override
    public List<String> parameterNames() {
      return X_inv12_notZZ.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fHab_add};
    }
    
    @Override
    public X_inv12_notZZ.Match toImmutable() {
      return isMutable() ? newMatch(fHab_add) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"hab_add\"=" + prettyPrintValue(fHab_add));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fHab_add);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof X_inv12_notZZ.Match)) {
          X_inv12_notZZ.Match other = (X_inv12_notZZ.Match) obj;
          return Objects.equals(fHab_add, other.fHab_add);
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
    public X_inv12_notZZ specification() {
      return X_inv12_notZZ.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static X_inv12_notZZ.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static X_inv12_notZZ.Match newMutableMatch(final Habitual_Address pHab_add) {
      return new Mutable(pHab_add);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static X_inv12_notZZ.Match newMatch(final Habitual_Address pHab_add) {
      return new Immutable(pHab_add);
    }
    
    private static final class Mutable extends X_inv12_notZZ.Match {
      Mutable(final Habitual_Address pHab_add) {
        super(pHab_add);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends X_inv12_notZZ.Match {
      Immutable(final Habitual_Address pHab_add) {
        super(pHab_add);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the queries.x_inv12_notZZ pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern x_inv12_notZZ(hab_add : Habitual_Address) {
   *     Address.country(hab_add, ::ZZ);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see X_inv12_notZZ
   * 
   */
  public static class Matcher extends BaseMatcher<X_inv12_notZZ.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static X_inv12_notZZ.Matcher on(final ViatraQueryEngine engine) {
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
    public static X_inv12_notZZ.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_HAB_ADD = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(X_inv12_notZZ.Matcher.class);
    
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
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<X_inv12_notZZ.Match> getAllMatches(final Habitual_Address pHab_add) {
      return rawStreamAllMatches(new Object[]{pHab_add}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<X_inv12_notZZ.Match> streamAllMatches(final Habitual_Address pHab_add) {
      return rawStreamAllMatches(new Object[]{pHab_add});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<X_inv12_notZZ.Match> getOneArbitraryMatch(final Habitual_Address pHab_add) {
      return rawGetOneArbitraryMatch(new Object[]{pHab_add});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Habitual_Address pHab_add) {
      return rawHasMatch(new Object[]{pHab_add});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Habitual_Address pHab_add) {
      return rawCountMatches(new Object[]{pHab_add});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Habitual_Address pHab_add, final Consumer<? super X_inv12_notZZ.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pHab_add}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pHab_add the fixed value of pattern parameter hab_add, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public X_inv12_notZZ.Match newMatch(final Habitual_Address pHab_add) {
      return X_inv12_notZZ.Match.newMatch(pHab_add);
    }
    
    /**
     * Retrieve the set of values that occur in matches for hab_add.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Habitual_Address> rawStreamAllValuesOfhab_add(final Object[] parameters) {
      return rawStreamAllValues(POSITION_HAB_ADD, parameters).map(Habitual_Address.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for hab_add.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Habitual_Address> getAllValuesOfhab_add() {
      return rawStreamAllValuesOfhab_add(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for hab_add.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Habitual_Address> streamAllValuesOfhab_add() {
      return rawStreamAllValuesOfhab_add(emptyArray());
    }
    
    @Override
    protected X_inv12_notZZ.Match tupleToMatch(final Tuple t) {
      try {
          return X_inv12_notZZ.Match.newMatch((Habitual_Address) t.get(POSITION_HAB_ADD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv12_notZZ.Match arrayToMatch(final Object[] match) {
      try {
          return X_inv12_notZZ.Match.newMatch((Habitual_Address) match[POSITION_HAB_ADD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected X_inv12_notZZ.Match arrayToMatchMutable(final Object[] match) {
      try {
          return X_inv12_notZZ.Match.newMutableMatch((Habitual_Address) match[POSITION_HAB_ADD]);
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
    public static IQuerySpecification<X_inv12_notZZ.Matcher> querySpecification() {
      return X_inv12_notZZ.instance();
    }
  }
  
  private X_inv12_notZZ() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static X_inv12_notZZ instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected X_inv12_notZZ.Matcher instantiate(final ViatraQueryEngine engine) {
    return X_inv12_notZZ.Matcher.on(engine);
  }
  
  @Override
  public X_inv12_notZZ.Matcher instantiate() {
    return X_inv12_notZZ.Matcher.create();
  }
  
  @Override
  public X_inv12_notZZ.Match newEmptyMatch() {
    return X_inv12_notZZ.Match.newEmptyMatch();
  }
  
  @Override
  public X_inv12_notZZ.Match newMatch(final Object... parameters) {
    return X_inv12_notZZ.Match.newMatch((Taxation.Habitual_Address) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link X_inv12_notZZ} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link X_inv12_notZZ#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final X_inv12_notZZ INSTANCE = new X_inv12_notZZ();
    
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
    private static final X_inv12_notZZ.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_hab_add = new PParameter("hab_add", "Taxation.Habitual_Address", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http:///TaxCard.ecore", "Habitual_Address")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_hab_add);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.x_inv12_notZZ";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("hab_add");
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
          PVariable var_hab_add = body.getOrCreateVariableByName("hab_add");
          new TypeConstraint(body, Tuples.flatTupleOf(var_hab_add), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Habitual_Address")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_hab_add, parameter_hab_add)
          ));
          //     Address.country(hab_add, ::ZZ)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http:///TaxCard.ecore", "Country", "ZZ").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_hab_add), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http:///TaxCard.ecore", "Address")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_hab_add, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http:///TaxCard.ecore", "Address", "country")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http:///TaxCard.ecore", "Country")));
          new Equality(body, var__virtual_1_, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
