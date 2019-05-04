/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
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
 *         private pattern scienceData(Spacecraft : Spacecraft, Data : java Double) {
 *         	ConstellationMission.spacecraft(Mission, Spacecraft);
 *         	InterferometryMission.observationTime(Mission, ObservationTime);
 *         	Data == eval(12.0  ObservationTime);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class ScienceData extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private ScienceData() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ScienceData instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.ScienceData (visibility: PUBLIC, simpleName: ScienceData, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.ScienceData, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.ScienceData (visibility: PUBLIC, simpleName: ScienceData, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.ScienceData, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final ScienceData INSTANCE = new ScienceData();
    
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
    private static final ScienceData.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Spacecraft = new PParameter("Spacecraft", "hu.bme.mit.inf.dslreasoner.domains.satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Data = new PParameter("Data", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Spacecraft, parameter_Data);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.scienceData";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Spacecraft","Data");
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
          PVariable var_Data = body.getOrCreateVariableByName("Data");
          PVariable var_Mission = body.getOrCreateVariableByName("Mission");
          PVariable var_ObservationTime = body.getOrCreateVariableByName("ObservationTime");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Data), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_Data, parameter_Data)
          ));
          // 	ConstellationMission.spacecraft(Mission, Spacecraft)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "ConstellationMission")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "ConstellationMission", "spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new Equality(body, var__virtual_0_, var_Spacecraft);
          // 	InterferometryMission.observationTime(Mission, ObservationTime)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "InterferometryMission", "observationTime")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EFloat")));
          new Equality(body, var__virtual_1_, var_ObservationTime);
          // 	Data == eval(12.0 * ObservationTime)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern scienceData";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("ObservationTime");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Float ObservationTime = (Float) provider.getValue("ObservationTime");
                  return evaluateExpression_1_1(ObservationTime);
              }
          },  var__virtual_2_ ); 
          new Equality(body, var_Data, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static double evaluateExpression_1_1(final Float ObservationTime) {
    return (12.0 * (ObservationTime).floatValue());
  }
}
