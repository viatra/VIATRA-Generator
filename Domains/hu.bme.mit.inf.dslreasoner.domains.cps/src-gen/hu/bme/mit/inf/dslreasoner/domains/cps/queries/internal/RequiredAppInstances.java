/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.SatisfyingInstance;
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
 *         private pattern requiredAppInstances(Req : Requirement, Remaining : java Integer) {
 *         	Instances == count find satisfyingInstance(Req, _);
 *         	Requirement.count(Req, RequiredCount);
 *         	Remaining == eval(RequiredCount - Instances);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class RequiredAppInstances extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private RequiredAppInstances() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RequiredAppInstances instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link RequiredAppInstances} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link RequiredAppInstances#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final RequiredAppInstances INSTANCE = new RequiredAppInstances();
    
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
    private static final RequiredAppInstances.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Req = new PParameter("Req", "hu.bme.mit.inf.dslreasoner.domains.cps.Requirement", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "Requirement")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Remaining = new PParameter("Remaining", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Req, parameter_Remaining);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.requiredAppInstances";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Req","Remaining");
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
          PVariable var_Req = body.getOrCreateVariableByName("Req");
          PVariable var_Remaining = body.getOrCreateVariableByName("Remaining");
          PVariable var_Instances = body.getOrCreateVariableByName("Instances");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_RequiredCount = body.getOrCreateVariableByName("RequiredCount");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Remaining), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Req, parameter_Req),
             new ExportedParameter(body, var_Remaining, parameter_Remaining)
          ));
          // 	Instances == count find satisfyingInstance(Req, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_Req, var___0_), SatisfyingInstance.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_Instances, var__virtual_0_);
          // 	Requirement.count(Req, RequiredCount)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "Requirement")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Req, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "Requirement", "count")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EInt")));
          new Equality(body, var__virtual_1_, var_RequiredCount);
          // 	Remaining == eval(RequiredCount - Instances)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern requiredAppInstances";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("Instances", "RequiredCount");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer Instances = (Integer) provider.getValue("Instances");
                  Integer RequiredCount = (Integer) provider.getValue("RequiredCount");
                  return evaluateExpression_1_1(Instances, RequiredCount);
              }
          },  var__virtual_2_ ); 
          new Equality(body, var_Remaining, var__virtual_2_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1(final Integer Instances, final Integer RequiredCount) {
    return ((RequiredCount).intValue() - (Instances).intValue());
  }
}
