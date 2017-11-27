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
import patterns.EntityIsItsOwnParentMatch;
import patterns.EntityIsItsOwnParentMatcher;

/**
 * A pattern-specific query specification that can instantiate EntityIsItsOwnParentMatcher in a type-safe way.
 * 
 * @see EntityIsItsOwnParentMatcher
 * @see EntityIsItsOwnParentMatch
 * 
 */
@SuppressWarnings("all")
public final class EntityIsItsOwnParentQuerySpecification extends BaseGeneratedEMFQuerySpecification<EntityIsItsOwnParentMatcher> {
  private EntityIsItsOwnParentQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static EntityIsItsOwnParentQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EntityIsItsOwnParentMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EntityIsItsOwnParentMatcher.on(engine);
  }
  
  @Override
  public EntityIsItsOwnParentMatcher instantiate() throws ViatraQueryException {
    return EntityIsItsOwnParentMatcher.create();
  }
  
  @Override
  public EntityIsItsOwnParentMatch newEmptyMatch() {
    return EntityIsItsOwnParentMatch.newEmptyMatch();
  }
  
  @Override
  public EntityIsItsOwnParentMatch newMatch(final Object... parameters) {
    return EntityIsItsOwnParentMatch.newMatch((hu.bme.mit.inf.smartgrid.Entity) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: patterns.util.EntityIsItsOwnParentQuerySpecification (visibility: PUBLIC, simpleName: EntityIsItsOwnParentQuerySpecification, identifier: patterns.util.EntityIsItsOwnParentQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterns.util) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: patterns.util.EntityIsItsOwnParentQuerySpecification (visibility: PUBLIC, simpleName: EntityIsItsOwnParentQuerySpecification, identifier: patterns.util.EntityIsItsOwnParentQuerySpecification, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: patterns.util) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EntityIsItsOwnParentQuerySpecification INSTANCE = new EntityIsItsOwnParentQuerySpecification();
    
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
    private final static EntityIsItsOwnParentQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEntity = new PParameter("entity", "hu.bme.mit.inf.smartgrid.Entity", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEntity);
    
    @Override
    public String getFullyQualifiedName() {
      return "patterns.entityIsItsOwnParent";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("entity");
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
          PVariable var_entity = body.getOrCreateVariableByName("entity");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_entity, parameter_pEntity)
          ));
          // 	Entity.communicationChild(entity, entity)
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_entity, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity", "communicationChild")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://hu.bme.mit.inf.smartgrid/smartgrid", "Entity")));
          new Equality(body, var__virtual_0_, var_entity);
          bodies.add(body);
      }
      {
          PAnnotation annotation = new PAnnotation("Constraint");
          annotation.addAttribute("message", "entityIsItsOwnParent");
          annotation.addAttribute("severity", "error");
          annotation.addAttribute("key", Arrays.asList(new Object[] {
                              new ParameterReference("entity")
                              }));
          addAnnotation(annotation);
      }
      return bodies;
    }
  }
}
