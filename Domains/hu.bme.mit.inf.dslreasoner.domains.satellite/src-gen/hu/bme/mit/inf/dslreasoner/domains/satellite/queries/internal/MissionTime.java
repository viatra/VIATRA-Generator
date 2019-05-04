/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitTime;
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
import org.eclipse.viatra.query.runtime.matchers.aggregators.sum;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint;
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
 *         private pattern missionTime(Mission : InterferometryMission, Time : java Double) {
 *         	InterferometryMission.observationTime(Mission, ObservationTime);
 *         	TrasmitTime == sum find transmitTime(Mission, _, #_);
 *         	Time == eval(TrasmitTime + 60.0  ObservationTime);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class MissionTime extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private MissionTime() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MissionTime instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionTime (visibility: PUBLIC, simpleName: MissionTime, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionTime, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionTime (visibility: PUBLIC, simpleName: MissionTime, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionTime, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MissionTime INSTANCE = new MissionTime();
    
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
    private static final MissionTime.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Mission = new PParameter("Mission", "hu.bme.mit.inf.dslreasoner.domains.satellite.InterferometryMission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "InterferometryMission")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Time = new PParameter("Time", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Mission, parameter_Time);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.missionTime";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Mission","Time");
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
          PVariable var_Time = body.getOrCreateVariableByName("Time");
          PVariable var_ObservationTime = body.getOrCreateVariableByName("ObservationTime");
          PVariable var_TrasmitTime = body.getOrCreateVariableByName("TrasmitTime");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Time), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Mission, parameter_Mission),
             new ExportedParameter(body, var_Time, parameter_Time)
          ));
          // 	InterferometryMission.observationTime(Mission, ObservationTime)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "InterferometryMission", "observationTime")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EFloat")));
          new Equality(body, var__virtual_0_, var_ObservationTime);
          // 	TrasmitTime == sum find transmitTime(Mission, _, #_)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Double.class), body, Tuples.flatTupleOf(var_Mission, var___0_, var___1_), TransmitTime.instance().getInternalQueryRepresentation(), var__virtual_1_, 2);
          new Equality(body, var_TrasmitTime, var__virtual_1_);
          // 	Time == eval(TrasmitTime + 60.0 * ObservationTime)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern missionTime";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("ObservationTime", "TrasmitTime");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Float ObservationTime = (Float) provider.getValue("ObservationTime");
                  Double TrasmitTime = (Double) provider.getValue("TrasmitTime");
                  return evaluateExpression_1_1(ObservationTime, TrasmitTime);
              }
          },  var__virtual_2_ ); 
          new Equality(body, var_Time, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static double evaluateExpression_1_1(final Float ObservationTime, final Double TrasmitTime) {
    return ((TrasmitTime).doubleValue() + (60.0 * (ObservationTime).floatValue()));
  }
}
