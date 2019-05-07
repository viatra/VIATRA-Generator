/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
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
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern spacecraftWithInterferometryPayload(Mission : ConstellationMission, Spacecraft : Spacecraft) {
 *         	ConstellationMission.spacecraft(Mission, Spacecraft);
 *         	Spacecraft.payload(Spacecraft, Payload);
 *         	InterferometryPayload(Payload);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class SpacecraftWithInterferometryPayload extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private SpacecraftWithInterferometryPayload() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SpacecraftWithInterferometryPayload instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload (visibility: PUBLIC, simpleName: SpacecraftWithInterferometryPayload, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload (visibility: PUBLIC, simpleName: SpacecraftWithInterferometryPayload, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SpacecraftWithInterferometryPayload INSTANCE = new SpacecraftWithInterferometryPayload();
    
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
    private static final SpacecraftWithInterferometryPayload.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Mission = new PParameter("Mission", "hu.bme.mit.inf.dslreasoner.domains.satellite.ConstellationMission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "ConstellationMission")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Spacecraft = new PParameter("Spacecraft", "hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Mission, parameter_Spacecraft);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.spacecraftWithInterferometryPayload";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Mission","Spacecraft");
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
          PVariable var_Mission = body.getOrCreateVariableByName("Mission");
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_Payload = body.getOrCreateVariableByName("Payload");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "ConstellationMission")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Mission, parameter_Mission),
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft)
          ));
          // 	ConstellationMission.spacecraft(Mission, Spacecraft)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "ConstellationMission")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "ConstellationMission", "spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new Equality(body, var__virtual_0_, var_Spacecraft);
          // 	Spacecraft.payload(Spacecraft, Payload)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "Spacecraft", "payload")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Payload")));
          new Equality(body, var__virtual_1_, var_Payload);
          // 	InterferometryPayload(Payload)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Payload), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryPayload")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
