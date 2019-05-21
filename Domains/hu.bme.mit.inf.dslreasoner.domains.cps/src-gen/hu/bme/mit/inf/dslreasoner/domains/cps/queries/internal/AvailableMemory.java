/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.MemoryRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.TotalMemory;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
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

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern availableMemory(Host : HostInstance, Memory : java Integer) {
 *         	find totalMemory(Host, TotalMemory);
 *         	RequiredMemory == sum find memoryRequirement(Host, _, #_);
 *         	Memory == eval(TotalMemory - RequiredMemory);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class AvailableMemory extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private AvailableMemory() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AvailableMemory instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableMemory (visibility: PUBLIC, simpleName: AvailableMemory, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableMemory, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableMemory (visibility: PUBLIC, simpleName: AvailableMemory, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableMemory, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AvailableMemory INSTANCE = new AvailableMemory();
    
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
    private static final AvailableMemory.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Host = new PParameter("Host", "hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "HostInstance")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Memory = new PParameter("Memory", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Host, parameter_Memory);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.availableMemory";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Host","Memory");
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
          PVariable var_Host = body.getOrCreateVariableByName("Host");
          PVariable var_Memory = body.getOrCreateVariableByName("Memory");
          PVariable var_TotalMemory = body.getOrCreateVariableByName("TotalMemory");
          PVariable var_RequiredMemory = body.getOrCreateVariableByName("RequiredMemory");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Host), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "HostInstance")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Memory), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Host, parameter_Host),
             new ExportedParameter(body, var_Memory, parameter_Memory)
          ));
          // 	find totalMemory(Host, TotalMemory)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_Host, var_TotalMemory), TotalMemory.instance().getInternalQueryRepresentation());
          // 	RequiredMemory == sum find memoryRequirement(Host, _, #_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new AggregatorConstraint(new sum().getAggregatorLogic(Integer.class), body, Tuples.flatTupleOf(var_Host, var___0_, var___1_), MemoryRequirement.instance().getInternalQueryRepresentation(), var__virtual_0_, 2);
          new Equality(body, var_RequiredMemory, var__virtual_0_);
          // 	Memory == eval(TotalMemory - RequiredMemory)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern availableMemory";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("RequiredMemory", "TotalMemory");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer RequiredMemory = (Integer) provider.getValue("RequiredMemory");
                  Integer TotalMemory = (Integer) provider.getValue("TotalMemory");
                  return evaluateExpression_1_1(RequiredMemory, TotalMemory);
              }
          },  var__virtual_1_ ); 
          new Equality(body, var_Memory, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static int evaluateExpression_1_1(final Integer RequiredMemory, final Integer TotalMemory) {
    return ((TotalMemory).intValue() - (RequiredMemory).intValue());
  }
}
