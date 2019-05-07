/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemBand;
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
 *         // Source and target communication systems must be compatible.
 *         
 *         {@literal @}Constraint(severity = "error", key = {Link},
 *         	message = "Two ends of a communication link must use the same band.")
 *         pattern incompatibleSourceAndTargetBand(Link : DirectedCommunicationLink) {
 *         	DirectedCommunicationLink.source(Link, SourceSubsystem);
 *         	DirectedCommunicationLink.target(Link, TargetSubsystem);
 *         	CommSubsystem.band(SourceSubsystem, Band);
 *         	neg find commSubsystemBand(TargetSubsystem, Band);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class IncompatibleSourceAndTargetBand extends BaseGeneratedEMFQuerySpecification<IncompatibleSourceAndTargetBand.Matcher> {
  /**
   * Pattern-specific match representation of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.incompatibleSourceAndTargetBand pattern,
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
    private DirectedCommunicationLink fLink;
    
    private static List<String> parameterNames = makeImmutableList("Link");
    
    private Match(final DirectedCommunicationLink pLink) {
      this.fLink = pLink;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Link".equals(parameterName)) return this.fLink;
      return null;
    }
    
    public DirectedCommunicationLink getLink() {
      return this.fLink;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Link".equals(parameterName) ) {
          this.fLink = (DirectedCommunicationLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setLink(final DirectedCommunicationLink pLink) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLink = pLink;
    }
    
    @Override
    public String patternName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.incompatibleSourceAndTargetBand";
    }
    
    @Override
    public List<String> parameterNames() {
      return IncompatibleSourceAndTargetBand.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fLink};
    }
    
    @Override
    public IncompatibleSourceAndTargetBand.Match toImmutable() {
      return isMutable() ? newMatch(fLink) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Link\"=" + prettyPrintValue(fLink));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fLink);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof IncompatibleSourceAndTargetBand.Match)) {
          IncompatibleSourceAndTargetBand.Match other = (IncompatibleSourceAndTargetBand.Match) obj;
          return Objects.equals(fLink, other.fLink);
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
    public IncompatibleSourceAndTargetBand specification() {
      return IncompatibleSourceAndTargetBand.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static IncompatibleSourceAndTargetBand.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static IncompatibleSourceAndTargetBand.Match newMutableMatch(final DirectedCommunicationLink pLink) {
      return new Mutable(pLink);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static IncompatibleSourceAndTargetBand.Match newMatch(final DirectedCommunicationLink pLink) {
      return new Immutable(pLink);
    }
    
    private static final class Mutable extends IncompatibleSourceAndTargetBand.Match {
      Mutable(final DirectedCommunicationLink pLink) {
        super(pLink);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends IncompatibleSourceAndTargetBand.Match {
      Immutable(final DirectedCommunicationLink pLink) {
        super(pLink);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.bme.mit.inf.dslreasoner.domains.satellite.queries.incompatibleSourceAndTargetBand pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Source and target communication systems must be compatible.
   * 
   * {@literal @}Constraint(severity = "error", key = {Link},
   * 	message = "Two ends of a communication link must use the same band.")
   * pattern incompatibleSourceAndTargetBand(Link : DirectedCommunicationLink) {
   * 	DirectedCommunicationLink.source(Link, SourceSubsystem);
   * 	DirectedCommunicationLink.target(Link, TargetSubsystem);
   * 	CommSubsystem.band(SourceSubsystem, Band);
   * 	neg find commSubsystemBand(TargetSubsystem, Band);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see IncompatibleSourceAndTargetBand
   * 
   */
  public static class Matcher extends BaseMatcher<IncompatibleSourceAndTargetBand.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static IncompatibleSourceAndTargetBand.Matcher on(final ViatraQueryEngine engine) {
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
    public static IncompatibleSourceAndTargetBand.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_LINK = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(IncompatibleSourceAndTargetBand.Matcher.class);
    
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
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<IncompatibleSourceAndTargetBand.Match> getAllMatches(final DirectedCommunicationLink pLink) {
      return rawStreamAllMatches(new Object[]{pLink}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<IncompatibleSourceAndTargetBand.Match> streamAllMatches(final DirectedCommunicationLink pLink) {
      return rawStreamAllMatches(new Object[]{pLink});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<IncompatibleSourceAndTargetBand.Match> getOneArbitraryMatch(final DirectedCommunicationLink pLink) {
      return rawGetOneArbitraryMatch(new Object[]{pLink});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DirectedCommunicationLink pLink) {
      return rawHasMatch(new Object[]{pLink});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DirectedCommunicationLink pLink) {
      return rawCountMatches(new Object[]{pLink});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DirectedCommunicationLink pLink, final Consumer<? super IncompatibleSourceAndTargetBand.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pLink}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLink the fixed value of pattern parameter Link, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public IncompatibleSourceAndTargetBand.Match newMatch(final DirectedCommunicationLink pLink) {
      return IncompatibleSourceAndTargetBand.Match.newMatch(pLink);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Link.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DirectedCommunicationLink> rawStreamAllValuesOfLink(final Object[] parameters) {
      return rawStreamAllValues(POSITION_LINK, parameters).map(DirectedCommunicationLink.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Link.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DirectedCommunicationLink> getAllValuesOfLink() {
      return rawStreamAllValuesOfLink(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Link.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DirectedCommunicationLink> streamAllValuesOfLink() {
      return rawStreamAllValuesOfLink(emptyArray());
    }
    
    @Override
    protected IncompatibleSourceAndTargetBand.Match tupleToMatch(final Tuple t) {
      try {
          return IncompatibleSourceAndTargetBand.Match.newMatch((DirectedCommunicationLink) t.get(POSITION_LINK));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IncompatibleSourceAndTargetBand.Match arrayToMatch(final Object[] match) {
      try {
          return IncompatibleSourceAndTargetBand.Match.newMatch((DirectedCommunicationLink) match[POSITION_LINK]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected IncompatibleSourceAndTargetBand.Match arrayToMatchMutable(final Object[] match) {
      try {
          return IncompatibleSourceAndTargetBand.Match.newMutableMatch((DirectedCommunicationLink) match[POSITION_LINK]);
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
    public static IQuerySpecification<IncompatibleSourceAndTargetBand.Matcher> querySpecification() {
      return IncompatibleSourceAndTargetBand.instance();
    }
  }
  
  private IncompatibleSourceAndTargetBand() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static IncompatibleSourceAndTargetBand instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected IncompatibleSourceAndTargetBand.Matcher instantiate(final ViatraQueryEngine engine) {
    return IncompatibleSourceAndTargetBand.Matcher.on(engine);
  }
  
  @Override
  public IncompatibleSourceAndTargetBand.Matcher instantiate() {
    return IncompatibleSourceAndTargetBand.Matcher.create();
  }
  
  @Override
  public IncompatibleSourceAndTargetBand.Match newEmptyMatch() {
    return IncompatibleSourceAndTargetBand.Match.newEmptyMatch();
  }
  
  @Override
  public IncompatibleSourceAndTargetBand.Match newMatch(final Object... parameters) {
    return IncompatibleSourceAndTargetBand.Match.newMatch((hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand (visibility: PUBLIC, simpleName: IncompatibleSourceAndTargetBand, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand (visibility: PUBLIC, simpleName: IncompatibleSourceAndTargetBand, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final IncompatibleSourceAndTargetBand INSTANCE = new IncompatibleSourceAndTargetBand();
    
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
    private static final IncompatibleSourceAndTargetBand.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Link = new PParameter("Link", "hu.bme.mit.inf.dslreasoner.domains.satellite.DirectedCommunicationLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "DirectedCommunicationLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Link);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.incompatibleSourceAndTargetBand";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Link");
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
          PVariable var_Link = body.getOrCreateVariableByName("Link");
          PVariable var_SourceSubsystem = body.getOrCreateVariableByName("SourceSubsystem");
          PVariable var_TargetSubsystem = body.getOrCreateVariableByName("TargetSubsystem");
          PVariable var_Band = body.getOrCreateVariableByName("Band");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Link), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "DirectedCommunicationLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Link, parameter_Link)
          ));
          // 	DirectedCommunicationLink.source(Link, SourceSubsystem)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Link), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "DirectedCommunicationLink")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Link, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "DirectedCommunicationLink", "source")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          new Equality(body, var__virtual_0_, var_SourceSubsystem);
          // 	DirectedCommunicationLink.target(Link, TargetSubsystem)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Link), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "DirectedCommunicationLink")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Link, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "DirectedCommunicationLink", "target")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          new Equality(body, var__virtual_1_, var_TargetSubsystem);
          // 	CommSubsystem.band(SourceSubsystem, Band)
          new TypeConstraint(body, Tuples.flatTupleOf(var_SourceSubsystem), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommSubsystem")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_SourceSubsystem, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "CommSubsystem", "band")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.example.org/satellite", "TransceiverBand")));
          new Equality(body, var__virtual_2_, var_Band);
          // 	neg find commSubsystemBand(TargetSubsystem, Band)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_TargetSubsystem, var_Band), CommSubsystemBand.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("Link")
                              }));
          annotation.addAttribute("message", "Two ends of a communication link must use the same band.");
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
