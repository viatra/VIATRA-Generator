package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.Assignment;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.ComponentInstance;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.EventReference;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.Variable;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentFaultTreeTrace;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentInstanceTrace;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.LookupHandler;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.MappingQueries;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MappingHandler {
  private final ViatraQueryMatcher<? extends IPatternMatch> matcher;
  
  private final MappingDefinition mappingDefinition;
  
  private final Map<LookupDefinition, LookupHandler> lookupHandlers;
  
  public MappingHandler(final MappingDefinition mappingDefinition, final MappingQueries mappingQueries) {
    this.matcher = mappingQueries.getMatcher(mappingDefinition);
    this.mappingDefinition = mappingDefinition;
    final HashSet<Variable> variables = CollectionLiterals.<Variable>newHashSet();
    EList<Assignment> _assignments = mappingDefinition.getAssignments();
    for (final Assignment assignment : _assignments) {
      {
        Variable _component = assignment.getInput().getComponent();
        variables.add(_component);
        Variable _component_1 = assignment.getOutput().getComponent();
        variables.add(_component_1);
      }
    }
    final Function1<LookupDefinition, LookupDefinition> _function = (LookupDefinition it) -> {
      return it;
    };
    final Function1<LookupDefinition, LookupHandler> _function_1 = (LookupDefinition lookupDefinition) -> {
      return mappingQueries.createLookupHandler(mappingDefinition, lookupDefinition);
    };
    this.lookupHandlers = ImmutableMap.<LookupDefinition, LookupHandler>copyOf(IterableExtensions.<LookupDefinition, LookupDefinition, LookupHandler>toMap(Iterables.<LookupDefinition>filter(variables, LookupDefinition.class), _function, _function_1));
  }
  
  public void instantiateComponents(final ComponentFaultTreeTrace faultTreeTrace) {
    boolean _hasComponentInstace = this.hasComponentInstace();
    boolean _not = (!_hasComponentInstace);
    if (_not) {
      return;
    }
    final Consumer<IPatternMatch> _function = (IPatternMatch match) -> {
      final ComponentInstanceTrace componentTrace = faultTreeTrace.instantiateComponent(match, this.getComponentDefinition());
      boolean _isTopLevel = this.isTopLevel();
      if (_isTopLevel) {
        faultTreeTrace.setTopLevel(componentTrace);
      }
    };
    this.matcher.forEachMatch(_function);
  }
  
  public void instantiateConnections(final ComponentFaultTreeTrace faultTreeTrace) {
    boolean _hasConnections = this.hasConnections();
    boolean _not = (!_hasConnections);
    if (_not) {
      return;
    }
    final Consumer<IPatternMatch> _function = (IPatternMatch match) -> {
      final Map<Variable, ComponentInstanceTrace> lookedUpComponents = this.lookupComponents(faultTreeTrace, match);
      EList<Assignment> _assignments = this.mappingDefinition.getAssignments();
      for (final Assignment assignment : _assignments) {
        {
          final EventReference input = assignment.getInput();
          final ComponentInstanceTrace inputComponent = lookedUpComponents.get(input.getComponent());
          final EventReference output = assignment.getOutput();
          final ComponentInstanceTrace outputComponent = lookedUpComponents.get(output.getComponent());
          if (((inputComponent != null) && (outputComponent != null))) {
            inputComponent.assign(input.getEvent(), outputComponent, output.getEvent());
          }
        }
      }
    };
    this.matcher.forEachMatch(_function);
  }
  
  private Map<Variable, ComponentInstanceTrace> lookupComponents(final ComponentFaultTreeTrace faultTreeTrace, final IPatternMatch match) {
    HashMap<Variable, ComponentInstanceTrace> _xblockexpression = null;
    {
      int _size = this.lookupHandlers.size();
      int _plus = (_size + 1);
      final HashMap<Variable, ComponentInstanceTrace> lookedUpComponents = Maps.<Variable, ComponentInstanceTrace>newHashMapWithExpectedSize(_plus);
      boolean _hasComponentInstace = this.hasComponentInstace();
      if (_hasComponentInstace) {
        final ComponentInstanceTrace componentInstance = faultTreeTrace.lookup(match);
        lookedUpComponents.put(this.mappingDefinition.getComponentInstance(), componentInstance);
      }
      Set<Map.Entry<LookupDefinition, LookupHandler>> _entrySet = this.lookupHandlers.entrySet();
      for (final Map.Entry<LookupDefinition, LookupHandler> pair : _entrySet) {
        {
          final ComponentInstanceTrace componentInstance_1 = pair.getValue().lookupForMatch(faultTreeTrace, match);
          if ((componentInstance_1 != null)) {
            lookedUpComponents.put(pair.getKey(), componentInstance_1);
          }
        }
      }
      _xblockexpression = lookedUpComponents;
    }
    return _xblockexpression;
  }
  
  private ComponentDefinition getComponentDefinition() {
    ComponentInstance _componentInstance = this.mappingDefinition.getComponentInstance();
    ComponentDefinition _componentType = null;
    if (_componentInstance!=null) {
      _componentType=_componentInstance.getComponentType();
    }
    return _componentType;
  }
  
  private boolean hasComponentInstace() {
    ComponentDefinition _componentDefinition = this.getComponentDefinition();
    return (_componentDefinition != null);
  }
  
  private boolean isTopLevel() {
    return this.mappingDefinition.isTopLevel();
  }
  
  private boolean hasConnections() {
    boolean _isEmpty = this.mappingDefinition.getAssignments().isEmpty();
    return (!_isEmpty);
  }
}
