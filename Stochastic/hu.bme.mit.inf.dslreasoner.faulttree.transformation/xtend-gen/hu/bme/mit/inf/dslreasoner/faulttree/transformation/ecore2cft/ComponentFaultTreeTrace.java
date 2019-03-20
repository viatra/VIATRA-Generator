package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentInstanceTrace;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentNameGenerator;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ComponentFaultTreeTrace {
  @Accessors
  private final ComponentFaultTree componentFaultTree = CftFactory.eINSTANCE.createComponentFaultTree();
  
  private final ComponentNameGenerator nameGenerator = new ComponentNameGenerator();
  
  private final Map<IPatternMatch, ComponentInstanceTrace> componentInstancesMap = CollectionLiterals.<IPatternMatch, ComponentInstanceTrace>newHashMap();
  
  public ComponentInstanceTrace instantiateComponent(final IPatternMatch patternMatch, final ComponentDefinition componenDefinition) {
    return this.instantiateComponent(patternMatch, componenDefinition, Modality.MUST, false);
  }
  
  public ComponentInstanceTrace instantiateComponent(final IPatternMatch patternMatch, final ComponentDefinition componenDefinition, final Modality exists, final boolean allowMultiple) {
    ComponentInstanceTrace _xblockexpression = null;
    {
      boolean _containsKey = this.componentInstancesMap.containsKey(patternMatch);
      if (_containsKey) {
        throw new IllegalArgumentException(("Already instantiated component for match: " + patternMatch));
      }
      final ComponentInstanceTrace componentTrace = new ComponentInstanceTrace(this.componentFaultTree, componenDefinition, this.nameGenerator, exists, allowMultiple);
      this.componentInstancesMap.put(patternMatch, componentTrace);
      _xblockexpression = componentTrace;
    }
    return _xblockexpression;
  }
  
  public void setTopLevel(final ComponentInstanceTrace trace) {
    Output _topEvent = this.componentFaultTree.getTopEvent();
    boolean _tripleNotEquals = (_topEvent != null);
    if (_tripleNotEquals) {
      throw new IllegalArgumentException("Top level component already set");
    }
    final EList<Output> outputs = trace.getOutputs();
    int _size = outputs.size();
    boolean _tripleNotEquals_1 = (_size != 1);
    if (_tripleNotEquals_1) {
      int _size_1 = outputs.size();
      String _plus = ("Top level component must have 1 output, got " + Integer.valueOf(_size_1));
      String _plus_1 = (_plus + 
        " instead");
      throw new IllegalArgumentException(_plus_1);
    }
    boolean _appearsExactlyOnce = trace.appearsExactlyOnce();
    boolean _not = (!_appearsExactlyOnce);
    if (_not) {
      throw new IllegalArgumentException("Top level must appear in the fault tree exactly once");
    }
    this.componentFaultTree.setTopEvent(IterableExtensions.<Output>head(outputs));
  }
  
  public ComponentInstanceTrace lookup(final IPatternMatch patternMatch) {
    return this.componentInstancesMap.get(patternMatch);
  }
  
  @Pure
  public ComponentFaultTree getComponentFaultTree() {
    return this.componentFaultTree;
  }
}
