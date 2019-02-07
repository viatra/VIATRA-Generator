package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import com.google.common.collect.Maps;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentNameGenerator;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.InputTrace;
import java.util.Map;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ComponentInstanceTrace {
  private final Component componentInstance = CftFactory.eINSTANCE.createComponent();
  
  private final Map<InputEvent, InputTrace> inputEventsMap;
  
  private final Map<EventDeclaration, Output> outputEventsMap;
  
  protected ComponentInstanceTrace(final ComponentFaultTree faultTree, final ComponentDefinition componentDefinition, final ComponentNameGenerator nameGenerator) {
    this.componentInstance.setComponentDefinition(componentDefinition);
    this.componentInstance.setName(nameGenerator.nextName(componentDefinition));
    this.inputEventsMap = Maps.<InputEvent, InputTrace>newHashMapWithExpectedSize(componentDefinition.getInputEvents().size());
    EList<InputEvent> _inputEvents = componentDefinition.getInputEvents();
    for (final InputEvent inputEvent : _inputEvents) {
      {
        final InputTrace inputTrace = new InputTrace(this.componentInstance, inputEvent);
        this.inputEventsMap.put(inputEvent, inputTrace);
      }
    }
    this.outputEventsMap = Maps.<EventDeclaration, Output>newHashMapWithExpectedSize(componentDefinition.getOutputEvents().size());
    EList<EventDeclaration> _outputEvents = componentDefinition.getOutputEvents();
    for (final EventDeclaration outputEvent : _outputEvents) {
      {
        final Output output = CftFactory.eINSTANCE.createOutput();
        output.setEventDeclaration(outputEvent);
        EList<Output> _outputs = this.componentInstance.getOutputs();
        _outputs.add(output);
        this.outputEventsMap.put(outputEvent, output);
      }
    }
    EList<Component> _components = faultTree.getComponents();
    _components.add(this.componentInstance);
  }
  
  public void assign(final EventDeclaration inputEvent, final ComponentInstanceTrace sourceComponent, final EventDeclaration outputEvent) {
    final InputTrace inputTrace = this.inputEventsMap.get(inputEvent);
    if ((inputTrace == null)) {
      throw new IllegalArgumentException(("Unknown input: " + inputEvent));
    }
    final Output output = sourceComponent.outputEventsMap.get(outputEvent);
    if ((output == null)) {
      throw new IllegalArgumentException(("Unknown output: " + outputEvent));
    }
    inputTrace.assign(output);
  }
  
  protected EList<Output> getOutputs() {
    return this.componentInstance.getOutputs();
  }
}
