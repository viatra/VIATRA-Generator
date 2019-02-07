package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class InputTrace {
  private final Input input = CftFactory.eINSTANCE.createInput();
  
  private final Map<Output, Connection> connectionsMap = CollectionLiterals.<Output, Connection>newHashMap();
  
  protected InputTrace(final Component component, final InputEvent inputEvent) {
    this.input.setInputEvent(inputEvent);
    EList<Input> _inputs = component.getInputs();
    _inputs.add(this.input);
  }
  
  public void assign(final Output output) {
    final Connection connection = this.connectionsMap.get(output);
    if ((connection == null)) {
      final Connection newConnection = CftFactory.eINSTANCE.createConnection();
      newConnection.setOutput(output);
      EList<Connection> _incomingConnections = this.input.getIncomingConnections();
      _incomingConnections.add(newConnection);
      this.connectionsMap.put(output, newConnection);
    }
  }
}
