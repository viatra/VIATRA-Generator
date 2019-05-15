/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SpacecraftOfKind;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.AdditionalCommSubsystemCost;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.BasePrice;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.InterferometryPayloadCost;
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
 *         private pattern spacecraftCost(Mission : InterferometryMission, Spacecraft : Spacecraft, Cost : java Double) {
 *         	ConstellationMission.spacecraft(Mission, Spacecraft);
 *         	find spacecraftOfKind(Spacecraft, Kind);
 *         	KindCount == count find spacecraftOfKind(_, Kind);
 *         	find basePrice(Spacecraft, BasePrice);
 *         	find interferometryPayloadCost(Spacecraft, InterferometryPayloadCost);
 *         	find additionalCommSubsystemCost(Spacecraft, AdditionalCommSubsystemCost);
 *         	Cost == eval(BasePrice  Math.pow(KindCount, -0.25) + InterferometryPayloadCost + AdditionalCommSubsystemCost);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class SpacecraftCost extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private SpacecraftCost() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SpacecraftCost instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftCost (visibility: PUBLIC, simpleName: SpacecraftCost, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftCost, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftCost (visibility: PUBLIC, simpleName: SpacecraftCost, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftCost, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SpacecraftCost INSTANCE = new SpacecraftCost();
    
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
    private static final SpacecraftCost.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Mission = new PParameter("Mission", "satellite.InterferometryMission", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "InterferometryMission")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Spacecraft = new PParameter("Spacecraft", "satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Cost = new PParameter("Cost", "java.lang.Double", new JavaTransitiveInstancesKey(java.lang.Double.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Mission, parameter_Spacecraft, parameter_Cost);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.spacecraftCost";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Mission","Spacecraft","Cost");
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
          PVariable var_Cost = body.getOrCreateVariableByName("Cost");
          PVariable var_Kind = body.getOrCreateVariableByName("Kind");
          PVariable var_KindCount = body.getOrCreateVariableByName("KindCount");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_BasePrice = body.getOrCreateVariableByName("BasePrice");
          PVariable var_InterferometryPayloadCost = body.getOrCreateVariableByName("InterferometryPayloadCost");
          PVariable var_AdditionalCommSubsystemCost = body.getOrCreateVariableByName("AdditionalCommSubsystemCost");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "InterferometryMission")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_Spacecraft), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Cost), new JavaTransitiveInstancesKey(java.lang.Double.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Mission, parameter_Mission),
             new ExportedParameter(body, var_Spacecraft, parameter_Spacecraft),
             new ExportedParameter(body, var_Cost, parameter_Cost)
          ));
          // 	ConstellationMission.spacecraft(Mission, Spacecraft)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "ConstellationMission")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mission, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/satellite", "ConstellationMission", "spacecraft")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new Equality(body, var__virtual_0_, var_Spacecraft);
          // 	find spacecraftOfKind(Spacecraft, Kind)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var_Kind), SpacecraftOfKind.instance().getInternalQueryRepresentation());
          // 	KindCount == count find spacecraftOfKind(_, Kind)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___0_, var_Kind), SpacecraftOfKind.instance().getInternalQueryRepresentation(), var__virtual_1_);
          new Equality(body, var_KindCount, var__virtual_1_);
          // 	find basePrice(Spacecraft, BasePrice)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var_BasePrice), BasePrice.instance().getInternalQueryRepresentation());
          // 	find interferometryPayloadCost(Spacecraft, InterferometryPayloadCost)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var_InterferometryPayloadCost), InterferometryPayloadCost.instance().getInternalQueryRepresentation());
          // 	find additionalCommSubsystemCost(Spacecraft, AdditionalCommSubsystemCost)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Spacecraft, var_AdditionalCommSubsystemCost), AdditionalCommSubsystemCost.instance().getInternalQueryRepresentation());
          // 	Cost == eval(BasePrice * Math.pow(KindCount, -0.25) + InterferometryPayloadCost + AdditionalCommSubsystemCost)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern spacecraftCost";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("AdditionalCommSubsystemCost", "BasePrice", "InterferometryPayloadCost", "KindCount");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Double AdditionalCommSubsystemCost = (Double) provider.getValue("AdditionalCommSubsystemCost");
                  Double BasePrice = (Double) provider.getValue("BasePrice");
                  Double InterferometryPayloadCost = (Double) provider.getValue("InterferometryPayloadCost");
                  Integer KindCount = (Integer) provider.getValue("KindCount");
                  return evaluateExpression_1_1(AdditionalCommSubsystemCost, BasePrice, InterferometryPayloadCost, KindCount);
              }
          },  var__virtual_2_ ); 
          new Equality(body, var_Cost, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static double evaluateExpression_1_1(final Double AdditionalCommSubsystemCost, final Double BasePrice, final Double InterferometryPayloadCost, final Integer KindCount) {
    double _pow = Math.pow((KindCount).intValue(), (-0.25));
    double _multiply = ((BasePrice).doubleValue() * _pow);
    double _plus = (_multiply + (InterferometryPayloadCost).doubleValue());
    double _plus_1 = (_plus + (AdditionalCommSubsystemCost).doubleValue());
    return _plus_1;
  }
}
