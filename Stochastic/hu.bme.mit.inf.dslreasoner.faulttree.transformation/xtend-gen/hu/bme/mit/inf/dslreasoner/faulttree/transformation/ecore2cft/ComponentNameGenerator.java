package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ComponentNameGenerator {
  private static final String DEFAULT_NAME = "__unnamed";
  
  private final Map<ComponentDefinition, Integer> instanceCounts = CollectionLiterals.<ComponentDefinition, Integer>newHashMap();
  
  public String nextName(final ComponentDefinition componentDefinition) {
    String _xblockexpression = null;
    {
      final Integer instanceCount = this.instanceCounts.getOrDefault(componentDefinition, Integer.valueOf(0));
      this.instanceCounts.put(componentDefinition, Integer.valueOf(((instanceCount).intValue() + 1)));
      String _elvis = null;
      String _name = componentDefinition.getName();
      if (_name != null) {
        _elvis = _name;
      } else {
        _elvis = ComponentNameGenerator.DEFAULT_NAME;
      }
      _xblockexpression = (_elvis + instanceCount);
    }
    return _xblockexpression;
  }
}
