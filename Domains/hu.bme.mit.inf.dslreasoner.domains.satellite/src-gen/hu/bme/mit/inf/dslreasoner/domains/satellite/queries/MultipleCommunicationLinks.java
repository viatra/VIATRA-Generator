/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import satellite.CommunicatingElement;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         {@literal @}Constraint(severity = "error", key = {Element},
 *         	message = "Only one communication link is allowed per element.")
 *         pattern multipleCommunicationLinks(Element : CommunicatingElement) {
 *         	CommunicatingElement.commSubsystem.communicationLink(Element, Link1);
 *         	CommunicatingElement.commSubsystem.communicationLink(Element, Link2);
 *         	Link1 != Link2;
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class MultipleCommunicationLinks extends BaseGeneratedEMFQuerySpecification<MultipleCommunicationLinks.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.multipleCommunicationLinks pattern,
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
    private CommunicatingElement fElement;
    
    private static List<String> parameterNames = makeImmutableList("Element");
    
    private Match(final CommunicatingElement pElement) {
      this.fElement = pElement;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Element".equals(parameterName)) return this.fElement;
      return null;
    }
    
    public CommunicatingElement getElement() {
      return this.fElement;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Element".equals(parameterName) ) {
          this.fElement = (CommunicatingElement) newValue;
          return true;
      }
      return false;
    }
    
    public void setElement(final CommunicatingElement pElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fElement = pElement;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.multipleCommunicationLinks";
    }
    
    @Override
    public List<String> parameterNames() {
      return MultipleCommunicationLinks.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fElement};
    }
    
    @Override
    public MultipleCommunicationLinks.Match toImmutable() {
      return isMutable() ? newMatch(fElement) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Element\"=" + prettyPrintValue(fElement));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fElement);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MultipleCommunicationLinks.Match)) {
          MultipleCommunicationLinks.Match other = (MultipleCommunicationLinks.Match) obj;
          return Objects.equals(fElement, other.fElement);
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
    public MultipleCommunicationLinks specification() {
      return MultipleCommunicationLinks.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MultipleCommunicationLinks.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MultipleCommunicationLinks.Match newMutableMatch(final CommunicatingElement pElement) {
      return new Mutable(pElement);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MultipleCommunicationLinks.Match newMatch(final CommunicatingElement pElement) {
      return new Immutable(pElement);
    }
    
    private static final class Mutable extends MultipleCommunicationLinks.Match {
      Mutable(final CommunicatingElement pElement) {
        super(pElement);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MultipleCommunicationLinks.Match {
      Immutable(final CommunicatingElement pElement) {
        super(pElement);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.multipleCommunicationLinks pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * {@literal @}Constraint(severity = "error", key = {Element},
   * 	message = "Only one communication link is allowed per element.")
   * pattern multipleCommunicationLinks(Element : CommunicatingElement) {
   * 	CommunicatingElement.commSubsystem.communicationLink(Element, Link1);
   * 	CommunicatingElement.commSubsystem.communicationLink(Element, Link2);
   * 	Link1 != Link2;
   * }
   * </pre></code>
   * 
   * @see Match
   * @see MultipleCommunicationLinks
   * 
   */
  public static class Matcher extends BaseMatcher<MultipleCommunicationLinks.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MultipleCommunicationLinks.Matcher on(final ViatraQueryEngine engine) {
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
    public static MultipleCommunicationLinks.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ELEMENT = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MultipleCommunicationLinks.Matcher.class);
    
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
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MultipleCommunicationLinks.Match> getAllMatches(final CommunicatingElement pElement) {
      return rawStreamAllMatches(new Object[]{pElement}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<MultipleCommunicationLinks.Match> streamAllMatches(final CommunicatingElement pElement) {
      return rawStreamAllMatches(new Object[]{pElement});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<MultipleCommunicationLinks.Match> getOneArbitraryMatch(final CommunicatingElement pElement) {
      return rawGetOneArbitraryMatch(new Object[]{pElement});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final CommunicatingElement pElement) {
      return rawHasMatch(new Object[]{pElement});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final CommunicatingElement pElement) {
      return rawCountMatches(new Object[]{pElement});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final CommunicatingElement pElement, final Consumer<? super MultipleCommunicationLinks.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pElement}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pElement the fixed value of pattern parameter Element, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MultipleCommunicationLinks.Match newMatch(final CommunicatingElement pElement) {
      return MultipleCommunicationLinks.Match.newMatch(pElement);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<CommunicatingElement> rawStreamAllValuesOfElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ELEMENT, parameters).map(CommunicatingElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<CommunicatingElement> getAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Element.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<CommunicatingElement> streamAllValuesOfElement() {
      return rawStreamAllValuesOfElement(emptyArray());
    }
    
    @Override
    protected MultipleCommunicationLinks.Match tupleToMatch(final Tuple t) {
      try {
          return MultipleCommunicationLinks.Match.newMatch((CommunicatingElement) t.get(POSITION_ELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MultipleCommunicationLinks.Match arrayToMatch(final Object[] match) {
      try {
          return MultipleCommunicationLinks.Match.newMatch((CommunicatingElement) match[POSITION_ELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MultipleCommunicationLinks.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MultipleCommunicationLinks.Match.newMutableMatch((CommunicatingElement) match[POSITION_ELEMENT]);
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
    public static IQuerySpecification<MultipleCommunicationLinks.Matcher> querySpecification() {
      return MultipleCommunicationLinks.instance();
    }
  }
  
  private MultipleCommunicationLinks() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MultipleCommunicationLinks instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MultipleCommunicationLinks.Matcher instantiate(final ViatraQueryEngine engine) {
    return MultipleCommunicationLinks.Matcher.on(engine);
  }
  
  @Override
  public MultipleCommunicationLinks.Matcher instantiate() {
    return MultipleCommunicationLinks.Matcher.create();
  }
  
  @Override
  public MultipleCommunicationLinks.Match newEmptyMatch() {
    return MultipleCommunicationLinks.Match.newEmptyMatch();
  }
  
  @Override
  public MultipleCommunicationLinks.Match newMatch(final Object... parameters) {
    return MultipleCommunicationLinks.Match.newMatch((satellite.CommunicatingElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.MultipleCommunicationLinks (visibility: PUBLIC, simpleName: MultipleCommunicationLinks, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.MultipleCommunicationLinks, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.MultipleCommunicationLinks (visibility: PUBLIC, simpleName: MultipleCommunicationLinks, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.MultipleCommunicationLinks, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MultipleCommunicationLinks INSTANCE = new MultipleCommunicationLinks();
    
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
    private static final MultipleCommunicationLinks.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Element = new PParameter("Element", "satellite.CommunicatingElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "CommunicatingElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Element);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.multipleCommunicationLinks";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Element");
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
          PVariable var_Element = body.getOrCreateVariableByName("Element");
          PVariable var_Link1 = body.getOrCreateVariableByName("Link1");
          PVariable var_Link2 = body.getOrCreateVariableByName("Link2");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Element, parameter_Element)
          ));
          // 	CommunicatingElement.commSubsystem.communicationLink(Element, Link1)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommunicatingElement", "commSubsystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommSubsystem", "communicationLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "DirectedCommunicationLink")));
          new Equality(body, var__virtual_1_, var_Link1);
          // 	CommunicatingElement.commSubsystem.communicationLink(Element, Link2)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Element, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommunicatingElement", "commSubsystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommSubsystem", "communicationLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "DirectedCommunicationLink")));
          new Equality(body, var__virtual_3_, var_Link2);
          // 	Link1 != Link2
          new Inequality(body, var_Link1, var_Link2);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Element")
                              }));
          annotation.addAttribute("message", "Only one communication link is allowed per element.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
