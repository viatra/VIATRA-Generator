package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class ConstraintCollection {
  private final /* ArrayList<IConstraintSpecification> */Object constraints /* Skipped initializer because of errors */;
  
  private /* BaseGeneratedPatternGroup */Object patterns;
  
  private List<Notifier> resources = new ArrayList<Notifier>();
  
  public ConstraintCollection(final /* List<IConstraintSpecification> */Object constraints, final List<String> uris, final /* BaseGeneratedPatternGroup */Object patterns) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConstraintCollection.constraints refers to the missing type IConstraintSpecification"
      + "\nThe field ConstraintCollection.patterns refers to the missing type BaseGeneratedPatternGroup");
  }
  
  public ConstraintCollection(final /* List<IConstraintSpecification> */Object constraints, final /* BaseGeneratedPatternGroup */Object patterns) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field ConstraintCollection.constraints refers to the missing type IConstraintSpecification"
      + "\nThe field ConstraintCollection.patterns refers to the missing type BaseGeneratedPatternGroup");
  }
  
  public boolean addModel(final Notifier n) {
    return this.resources.add(n);
  }
  
  public String setURIs(final List<String> uris) {
    String _xblockexpression = null;
    {
      final ResourceSetImpl resSet = new ResourceSetImpl();
      for (final String uri : uris) {
        {
          Resource resource = resSet.getResource(URI.createURI(uri), true);
          this.resources.add(resource);
        }
      }
      _xblockexpression = InputOutput.<String>println("reading model finished");
    }
    return _xblockexpression;
  }
  
  public List<Integer> calculateViolations() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field querySpecification is undefined for the type Object"
      + "\nThe method initEngine(Notifier) from the type ConstraintCollection refers to the missing type Object"
      + "\nThe field ConstraintCollection.constraints refers to the missing type IConstraintSpecification"
      + "\ngetMatcher cannot be resolved"
      + "\ncountMatches cannot be resolved");
  }
  
  public ArrayList<Map<String, Integer>> calculateViolationMaps() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field querySpecification is undefined for the type Object"
      + "\nThe method or field querySpecification is undefined for the type Object"
      + "\nThe method initEngine(Notifier) from the type ConstraintCollection refers to the missing type Object"
      + "\nThe field ConstraintCollection.constraints refers to the missing type IConstraintSpecification"
      + "\ngetMatcher cannot be resolved"
      + "\ncountMatches cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  private Object initEngine(final Notifier r) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ViatraQueryEngine is undefined"
      + "\nEMFScope cannot be resolved."
      + "\nThe field ConstraintCollection.patterns refers to the missing type BaseGeneratedPatternGroup"
      + "\non cannot be resolved"
      + "\nprepare cannot be resolved");
  }
}
