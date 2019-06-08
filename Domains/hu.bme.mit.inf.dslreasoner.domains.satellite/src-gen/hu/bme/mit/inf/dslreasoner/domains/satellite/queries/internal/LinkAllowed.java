/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CubeSat3U;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MatchingAntenna;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern linkAllowed(From : Spacecraft, To : CommunicatingElement) {
 *         	find matchingAntenna(From, To);
 *         	neg find cubeSat3U(From);
 *         } or {
 *         	find matchingAntenna(From, To);
 *         	CubeSat3U(From);
 *         } or {
 *         	find matchingAntenna(From, To);
 *         	CubeSat3U(From);
 *         	GroundStationNetwork(To);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class LinkAllowed extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private LinkAllowed() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static LinkAllowed instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.LinkAllowed (visibility: PUBLIC, simpleName: LinkAllowed, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.LinkAllowed, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.LinkAllowed (visibility: PUBLIC, simpleName: LinkAllowed, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.LinkAllowed, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final LinkAllowed INSTANCE = new LinkAllowed();
    
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
    private static final LinkAllowed.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_From = new PParameter("From", "satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final PParameter parameter_To = new PParameter("To", "satellite.CommunicatingElement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "CommunicatingElement")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_From, parameter_To);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.linkAllowed";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("From","To");
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
          PVariable var_From = body.getOrCreateVariableByName("From");
          PVariable var_To = body.getOrCreateVariableByName("To");
          new TypeConstraint(body, Tuples.flatTupleOf(var_From), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_To), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_From, parameter_From),
             new ExportedParameter(body, var_To, parameter_To)
          ));
          // 	find matchingAntenna(From, To)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_From, var_To), MatchingAntenna.instance().getInternalQueryRepresentation());
          // 	neg find cubeSat3U(From)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_From), CubeSat3U.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_From = body.getOrCreateVariableByName("From");
          PVariable var_To = body.getOrCreateVariableByName("To");
          new TypeConstraint(body, Tuples.flatTupleOf(var_From), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_To), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_From, parameter_From),
             new ExportedParameter(body, var_To, parameter_To)
          ));
          // 	find matchingAntenna(From, To)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_From, var_To), MatchingAntenna.instance().getInternalQueryRepresentation());
          // 	CubeSat3U(From)
          new TypeConstraint(body, Tuples.flatTupleOf(var_From), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CubeSat3U")));
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_From = body.getOrCreateVariableByName("From");
          PVariable var_To = body.getOrCreateVariableByName("To");
          new TypeConstraint(body, Tuples.flatTupleOf(var_From), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_To), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CommunicatingElement")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_From, parameter_From),
             new ExportedParameter(body, var_To, parameter_To)
          ));
          // 	find matchingAntenna(From, To)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_From, var_To), MatchingAntenna.instance().getInternalQueryRepresentation());
          // 	CubeSat3U(From)
          new TypeConstraint(body, Tuples.flatTupleOf(var_From), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CubeSat3U")));
          // 	GroundStationNetwork(To)
          new TypeConstraint(body, Tuples.flatTupleOf(var_To), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "GroundStationNetwork")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
