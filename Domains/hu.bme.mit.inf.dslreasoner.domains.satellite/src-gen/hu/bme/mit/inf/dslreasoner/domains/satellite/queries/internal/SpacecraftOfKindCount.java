/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CubeSat3U;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CubeSat6U;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
 *         private pattern spacecraftOfKindCount(Sat : Spacecraft, Count : java Integer) {
 *         	CubeSat3U(Sat);
 *         	Count == count find cubeSat3U(_);
 *         } or {
 *         	CubeSat6U(Sat);
 *         	Count == count find cubeSat6U(_);
 *         } or {
 *         	SmallSat(Sat);
 *         	Count == count find smallSat(_);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class SpacecraftOfKindCount extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private SpacecraftOfKindCount() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SpacecraftOfKindCount instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftOfKindCount (visibility: PUBLIC, simpleName: SpacecraftOfKindCount, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftOfKindCount, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftOfKindCount (visibility: PUBLIC, simpleName: SpacecraftOfKindCount, identifier: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftOfKindCount, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SpacecraftOfKindCount INSTANCE = new SpacecraftOfKindCount();
    
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
    private static final SpacecraftOfKindCount.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Sat = new PParameter("Sat", "satellite.Spacecraft", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/satellite", "Spacecraft")), PParameterDirection.INOUT);
    
    private final PParameter parameter_Count = new PParameter("Count", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Sat, parameter_Count);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.satellite.queries.spacecraftOfKindCount";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Sat","Count");
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
          PVariable var_Sat = body.getOrCreateVariableByName("Sat");
          PVariable var_Count = body.getOrCreateVariableByName("Count");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Count), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Sat, parameter_Sat),
             new ExportedParameter(body, var_Count, parameter_Count)
          ));
          // 	CubeSat3U(Sat)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CubeSat3U")));
          // 	Count == count find cubeSat3U(_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___0_), CubeSat3U.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_Count, var__virtual_0_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Sat = body.getOrCreateVariableByName("Sat");
          PVariable var_Count = body.getOrCreateVariableByName("Count");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Count), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Sat, parameter_Sat),
             new ExportedParameter(body, var_Count, parameter_Count)
          ));
          // 	CubeSat6U(Sat)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "CubeSat6U")));
          // 	Count == count find cubeSat6U(_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___0_), CubeSat6U.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_Count, var__virtual_0_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Sat = body.getOrCreateVariableByName("Sat");
          PVariable var_Count = body.getOrCreateVariableByName("Count");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "Spacecraft")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_Count), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Sat, parameter_Sat),
             new ExportedParameter(body, var_Count, parameter_Count)
          ));
          // 	SmallSat(Sat)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Sat), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/satellite", "SmallSat")));
          // 	Count == count find smallSat(_)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___0_), SmallSat.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_Count, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
