/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.IncomingData;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.ScienceData;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitRate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern transmitTime(Mission : InterferometryMission, Spacecraft : Spacecraft, TransmitTime : java Double) {
 *         	ConstellationMission.spacecraft(Mission, Spacecraft);
 *         	find scienceData(Spacecraft, ScienceData);
 *         	IncomingData == sum find incomingData(Spacecraft, _, #_);
 *         	find transmitRate(Spacecraft, TransmitRate);
 *         	TransmitTime == eval((ScienceData + IncomingData) / (7.5  TransmitRate));
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class TransmitTime extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private TransmitTime() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static TransmitTime instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitTime (visibility: PUBLIC, simpleName: TransmitTime, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitTime, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitTime (visibility: PUBLIC, simpleName: TransmitTime, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitTime, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final TransmitTime INSTANCE = new TransmitTime();
    
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
    private static final TransmitTime.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Mission = new PParameter("Mission", "satellite.InterferometryMission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "InterferometryMission")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Spacecraft = new PParameter("Spacecraft", "satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final PParameter parameter_TransmitTime = new PParameter("TransmitTime", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Mission, parameter_Spacecraft, parameter_TransmitTime);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.transmitTime";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Mission","Spacecraft","TransmitTime");
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
          PVariable var_TransmitTime = body.getOrCreateVariableByName("TransmitTime");
          PVariable var_ScienceData = body.getOrCreateVariableByName("ScienceData");
          PVariable var_IncomingData = body.getOrCreateVariableByName("IncomingData");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var_TransmitRate = body.getOrCreateVariableByName("TransmitRate");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_TransmitTime), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Mission, parameter_Mission),
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_TransmitTime, parameter_TransmitTime)
          ));
          // 	ConstellationMission.spacecraft(Mission, Spacecraft)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "ConstellationMission")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "ConstellationMission", "spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new Equality(body, var__virtual_0_, var_Spacecraft);
          // 	find scienceData(Spacecraft, ScienceData)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var_ScienceData), ScienceData.instance().getInternalQueryRepresentation());
          // 	IncomingData == sum find incomingData(Spacecraft, _, #_)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Double.class), body, Tuples.flatTupleOf(var_Spacecraft, var___0_, var___1_), IncomingData.instance().getInternalQueryRepresentation(), var__virtual_1_, 2);
          new Equality(body, var_IncomingData, var__virtual_1_);
          // 	find transmitRate(Spacecraft, TransmitRate)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var_TransmitRate), TransmitRate.instance().getInternalQueryRepresentation());
          // 	TransmitTime == eval((ScienceData + IncomingData) / (7.5 * TransmitRate))
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern transmitTime";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("IncomingData", "ScienceData", "TransmitRate");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Double IncomingData = (Double) provider.getValue("IncomingData");
                  Double ScienceData = (Double) provider.getValue("ScienceData");
                  Double TransmitRate = (Double) provider.getValue("TransmitRate");
                  return evaluateExpression_1_1(IncomingData, ScienceData, TransmitRate);
              }
          },  var__virtual_2_ ); 
          new Equality(body, var_TransmitTime, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static double evaluateExpression_1_1(final Double IncomingData, final Double ScienceData, final Double TransmitRate) {
    double _plus = DoubleExtensions.operator_plus(ScienceData, IncomingData);
    double _divide = (_plus / (7.5 * (TransmitRate).doubleValue()));
    return _divide;
  }
}
