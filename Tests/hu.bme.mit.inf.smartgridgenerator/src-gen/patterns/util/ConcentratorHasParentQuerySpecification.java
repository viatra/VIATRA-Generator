/**
 * Generated from platform:/resource/hu.bme.mit.inf.smartgridgenerator/src/patterns/pattern.vql
 */
package patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import patterns.ConcentratorHasParentMatch;
import patterns.ConcentratorHasParentMatcher;

/**
 * A pattern-specific query specification that can instantiate ConcentratorHasParentMatcher in a type-safe way.
 * 
 * @see ConcentratorHasParentMatcher
 * @see ConcentratorHasParentMatch
 * 
 */
@SuppressWarnings("all")
public final class ConcentratorHasParentQuerySpecification extends BaseGeneratedEMFQuerySpecification<ConcentratorHasParentMatcher> {
  private ConcentratorHasParentQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ConcentratorHasParentQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ConcentratorHasParentMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ConcentratorHasParentMatcher.on(engine);
  }
  
  @Override
  public ConcentratorHasParentMatcher instantiate() throws ViatraQueryException {
    return ConcentratorHasParentMatcher.create();
  }
  
  @Override
  public ConcentratorHasParentMatch newEmptyMatch() {
    return ConcentratorHasParentMatch.newEmptyMatch();
  }
  
  @Override
  public ConcentratorHasParentMatch newMatch(final Object... parameters) {
    return ConcentratorHasParentMatch.newMatch((hu.bme.mit.inf.smartgrid.Concentrator) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterns.util.ConcentratorHasParentQuerySpecification (visibility: PUBLIC, simpleName: ConcentratorHasParentQuerySpecification, identifier: patterns.util.ConcentratorHasParentQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterns.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterns.util.ConcentratorHasParentQuerySpecification (visibility: PUBLIC, simpleName: ConcentratorHasParentQuerySpecification, identifier: patterns.util.ConcentratorHasParentQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterns.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ConcentratorHasParentQuerySpecification INSTANCE = new ConcentratorHasParentQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ConcentratorHasParentQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pConcentrator = new PParameter("concentrator", "hu.bme.mit.inf.smartgrid.Concentrator", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.smartgrid/smartgrid", "Concentrator")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pConcentrator);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterns.concentratorHasParent";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("concentrator");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      {
          PBody body = new PBody(this);
          PVariable var_concentrator = body.getOrCreateVariableByName("concentrator");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_concentrator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Concentrator")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_concentrator, parameter_pConcentrator)
          ));
          // 	Entity.communicationParent(concentrator, _)
          new TypeConstraint(body, Tuples.flatTupleOf(var_concentrator), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_concentrator, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity", "communicationParent")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity")));
          new Equality(body, var__virtual_0_, var___0_);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "concentratorHasParent");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("concentrator")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
