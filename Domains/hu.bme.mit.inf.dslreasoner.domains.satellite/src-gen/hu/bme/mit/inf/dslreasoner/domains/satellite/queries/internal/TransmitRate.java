/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftUplink;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         private pattern transmitRate(Spacecraft : Spacecraft, TransmitRate : java Double) {
 *         	find spacecraftUplink(Spacecraft, TransceiverBand::UHF, Target);
 *         	Spacecraft(Target);
 *         	TransmitRate == 5.0;
 *         } or {
 *         	find spacecraftUplink(Spacecraft, TransceiverBand::X, Target);
 *         	Spacecraft(Target);
 *         	TransmitRate == 1.6;
 *         } or {
 *         	find spacecraftUplink(Spacecraft, TransceiverBand::X, Target);
 *         	GroundStationNetwork(Target);
 *         	TransmitRate == 0.7;
 *         } or {
 *         	find spacecraftUplink(Spacecraft, TransceiverBand::Ka, Target);
 *         	Spacecraft(Target);
 *         	TransmitRate == 220.0;
 *         } or {
 *         	find spacecraftUplink(Spacecraft, TransceiverBand::Ka, Target);
 *         	GroundStationNetwork(Target);
 *         	TransmitRate == 80.0;
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class TransmitRate extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private TransmitRate() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TransmitRate instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitRate (visibility: PUBLIC, simpleName: TransmitRate, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitRate, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitRate (visibility: PUBLIC, simpleName: TransmitRate, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitRate, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TransmitRate INSTANCE = new TransmitRate();
    
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
    private static final TransmitRate.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Spacecraft = new PParameter("Spacecraft", "hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final PParameter parameter_TransmitRate = new PParameter("TransmitRate", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Spacecraft, parameter_TransmitRate);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.transmitRate";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Spacecraft","TransmitRate");
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
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_TransmitRate = body.getOrCreateVariableByName("TransmitRate");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_TransmitRate), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_TransmitRate, parameter_TransmitRate)
          ));
          // 	find spacecraftUplink(Spacecraft, TransceiverBand::UHF, Target)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "TransceiverBand", "UHF").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var__virtual_0_, var_Target), SpacecraftUplink.instance().getInternalQueryRepresentation());
          // 	Spacecraft(Target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          // 	TransmitRate == 5.0
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, 5.0);
          new Equality(body, var_TransmitRate, var__virtual_1_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_TransmitRate = body.getOrCreateVariableByName("TransmitRate");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_TransmitRate), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_TransmitRate, parameter_TransmitRate)
          ));
          // 	find spacecraftUplink(Spacecraft, TransceiverBand::X, Target)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "TransceiverBand", "X").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var__virtual_0_, var_Target), SpacecraftUplink.instance().getInternalQueryRepresentation());
          // 	Spacecraft(Target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          // 	TransmitRate == 1.6
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, 1.6);
          new Equality(body, var_TransmitRate, var__virtual_1_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_TransmitRate = body.getOrCreateVariableByName("TransmitRate");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_TransmitRate), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_TransmitRate, parameter_TransmitRate)
          ));
          // 	find spacecraftUplink(Spacecraft, TransceiverBand::X, Target)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "TransceiverBand", "X").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var__virtual_0_, var_Target), SpacecraftUplink.instance().getInternalQueryRepresentation());
          // 	GroundStationNetwork(Target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "GroundStationNetwork")));
          // 	TransmitRate == 0.7
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, 0.7);
          new Equality(body, var_TransmitRate, var__virtual_1_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_TransmitRate = body.getOrCreateVariableByName("TransmitRate");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_TransmitRate), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_TransmitRate, parameter_TransmitRate)
          ));
          // 	find spacecraftUplink(Spacecraft, TransceiverBand::Ka, Target)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "TransceiverBand", "Ka").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var__virtual_0_, var_Target), SpacecraftUplink.instance().getInternalQueryRepresentation());
          // 	Spacecraft(Target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          // 	TransmitRate == 220.0
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, 220.0);
          new Equality(body, var_TransmitRate, var__virtual_1_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Spacecraft = body.getOrCreateVariableByName("Spacecraft");
          PVariable var_TransmitRate = body.getOrCreateVariableByName("TransmitRate");
          PVariable var_Target = body.getOrCreateVariableByName("Target");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_TransmitRate), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_TransmitRate, parameter_TransmitRate)
          ));
          // 	find spacecraftUplink(Spacecraft, TransceiverBand::Ka, Target)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://www.example.org/satellite", "TransceiverBand", "Ka").getInstance());
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var__virtual_0_, var_Target), SpacecraftUplink.instance().getInternalQueryRepresentation());
          // 	GroundStationNetwork(Target)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "GroundStationNetwork")));
          // 	TransmitRate == 80.0
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, 80.0);
          new Equality(body, var_TransmitRate, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static double evaluateExpression_1_1() {
    return 5.0;
  }
  
  private static double evaluateExpression_2_1() {
    return 1.6;
  }
  
  private static double evaluateExpression_3_1() {
    return 0.7;
  }
  
  private static double evaluateExpression_4_1() {
    return 220.0;
  }
  
  private static double evaluateExpression_5_1() {
    return 80.0;
  }
}
