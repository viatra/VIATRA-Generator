/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal;

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
 *         private pattern cpsApplications(Cps : CyberPhysicalSystem, AppInstance : ApplicationInstance) {
 *         	CyberPhysicalSystem.applicationTypes.instances(Cps, AppInstance);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class CpsApplications extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private CpsApplications() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static CpsApplications instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.CpsApplications (visibility: PUBLIC, simpleName: CpsApplications, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.CpsApplications, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.CpsApplications (visibility: PUBLIC, simpleName: CpsApplications, identifier: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.CpsApplications, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final CpsApplications INSTANCE = new CpsApplications();
    
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
    private static final CpsApplications.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Cps = new PParameter("Cps", "hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "CyberPhysicalSystem")), PParameterDirection.INOUT);
    
    private final PParameter parameter_AppInstance = new PParameter("AppInstance", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Cps, parameter_AppInstance);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.cpsApplications";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Cps","AppInstance");
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
          PVariable var_Cps = body.getOrCreateVariableByName("Cps");
          PVariable var_AppInstance = body.getOrCreateVariableByName("AppInstance");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "CyberPhysicalSystem")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_AppInstance), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Cps, parameter_Cps),
             new ExportedParameter(body, var_AppInstance, parameter_AppInstance)
          ));
          // 	CyberPhysicalSystem.applicationTypes.instances(Cps, AppInstance)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "CyberPhysicalSystem")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cps, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "CyberPhysicalSystem", "applicationTypes")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationType")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/cps", "ApplicationType", "instances")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          new Equality(body, var__virtual_1_, var_AppInstance);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
