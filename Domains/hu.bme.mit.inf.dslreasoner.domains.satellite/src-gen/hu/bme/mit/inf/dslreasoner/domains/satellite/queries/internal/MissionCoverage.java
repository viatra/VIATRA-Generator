/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
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
 *         private pattern missionCoverage(Mission : InterferometryMission, Coverage : java Double) {
 *         	InterferometryMission.observationTime(Mission, ObservationTime);
 *         	ObserverCount == count find spacecraftWithInterferometryPayload(Mission, _);
 *         	Coverage == eval(Math.pow(1 - 2.0 / ObserverCount, 1 + 9  (1.0 / ObservationTime)) + 0.05  ObservationTime / 3);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class MissionCoverage extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private MissionCoverage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MissionCoverage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionCoverage (visibility: PUBLIC, simpleName: MissionCoverage, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionCoverage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionCoverage (visibility: PUBLIC, simpleName: MissionCoverage, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionCoverage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final MissionCoverage INSTANCE = new MissionCoverage();
    
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
    private static final MissionCoverage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Mission = new PParameter("Mission", "hu.bme.mit.inf.dslreasoner.domains.satellite.InterferometryMission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "InterferometryMission")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Coverage = new PParameter("Coverage", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Mission, parameter_Coverage);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.missionCoverage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Mission","Coverage");
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
          PVariable var_Coverage = body.getOrCreateVariableByName("Coverage");
          PVariable var_ObservationTime = body.getOrCreateVariableByName("ObservationTime");
          PVariable var_ObserverCount = body.getOrCreateVariableByName("ObserverCount");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Coverage), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Mission, parameter_Mission),
             new ExportedParameter(body, var_Coverage, parameter_Coverage)
          ));
          // 	InterferometryMission.observationTime(Mission, ObservationTime)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "InterferometryMission", "observationTime")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EFloat")));
          new Equality(body, var__virtual_0_, var_ObservationTime);
          // 	ObserverCount == count find spacecraftWithInterferometryPayload(Mission, _)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_Mission, var___0_), SpacecraftWithInterferometryPayload.instance().getInternalQueryRepresentation(), var__virtual_1_);
          new Equality(body, var_ObserverCount, var__virtual_1_);
          // 	Coverage == eval(Math.pow(1 - 2.0 / ObserverCount, 1 + 9 * (1.0 / ObservationTime)) + 0.05 * ObservationTime / 3)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern missionCoverage";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("ObservationTime", "ObserverCount");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Float ObservationTime = (Float) provider.getValue("ObservationTime");
                  Integer ObserverCount = (Integer) provider.getValue("ObserverCount");
                  return evaluateExpression_1_1(ObservationTime, ObserverCount);
              }
          },  var__virtual_2_ ); 
          new Equality(body, var_Coverage, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static double evaluateExpression_1_1(final Float ObservationTime, final Integer ObserverCount) {
    double _pow = Math.pow((1 - (2.0 / (ObserverCount).intValue())), (1 + (9 * (1.0 / (ObservationTime).floatValue()))));
    double _plus = (_pow + ((0.05 * (ObservationTime).floatValue()) / 3));
    return _plus;
  }
}
