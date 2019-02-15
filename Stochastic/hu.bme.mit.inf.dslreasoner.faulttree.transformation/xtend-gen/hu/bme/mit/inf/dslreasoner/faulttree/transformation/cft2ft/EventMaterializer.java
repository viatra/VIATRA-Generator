package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.AndGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.GateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.OrGateDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft.EventCollection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class EventMaterializer {
  @Data
  protected static class EventKey<T extends EventDeclaration> {
    private final Component component;
    
    private final T event;
    
    @Override
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      String _name = this.component.getName();
      _builder.append(_name);
      _builder.append("_");
      String _name_1 = this.event.getName();
      _builder.append(_name_1);
      return _builder.toString();
    }
    
    public EventKey(final Component component, final T event) {
      super();
      this.component = component;
      this.event = event;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.component== null) ? 0 : this.component.hashCode());
      return prime * result + ((this.event== null) ? 0 : this.event.hashCode());
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      EventMaterializer.EventKey<?> other = (EventMaterializer.EventKey<?>) obj;
      if (this.component == null) {
        if (other.component != null)
          return false;
      } else if (!this.component.equals(other.component))
        return false;
      if (this.event == null) {
        if (other.event != null)
          return false;
      } else if (!this.event.equals(other.event))
        return false;
      return true;
    }
    
    @Pure
    public Component getComponent() {
      return this.component;
    }
    
    @Pure
    public T getEvent() {
      return this.event;
    }
  }
  
  @Extension
  private final FtFactory _ftFactory = FtFactory.eINSTANCE;
  
  private final Map<EventMaterializer.EventKey<EventDeclaration>, Event> materializationCache = CollectionLiterals.<EventMaterializer.EventKey<EventDeclaration>, Event>newHashMap();
  
  private final Map<EventMaterializer.EventKey<InputEvent>, EventCollection> multipleInputCache = CollectionLiterals.<EventMaterializer.EventKey<InputEvent>, EventCollection>newHashMap();
  
  private final ConstantEvent falseEvent;
  
  private final ConstantEvent trueEvent;
  
  private final LinkedHashSet<EventMaterializer.EventKey<? extends EventDeclaration>> path = new LinkedHashSet<EventMaterializer.EventKey<? extends EventDeclaration>>();
  
  public EventMaterializer() {
    ConstantEvent _createConstantEvent = this._ftFactory.createConstantEvent();
    final Procedure1<ConstantEvent> _function = (ConstantEvent it) -> {
      it.setFailed(false);
    };
    ConstantEvent _doubleArrow = ObjectExtensions.<ConstantEvent>operator_doubleArrow(_createConstantEvent, _function);
    this.falseEvent = _doubleArrow;
    ConstantEvent _createConstantEvent_1 = this._ftFactory.createConstantEvent();
    final Procedure1<ConstantEvent> _function_1 = (ConstantEvent it) -> {
      it.setFailed(true);
    };
    ConstantEvent _doubleArrow_1 = ObjectExtensions.<ConstantEvent>operator_doubleArrow(_createConstantEvent_1, _function_1);
    this.trueEvent = _doubleArrow_1;
  }
  
  public Event getOrMaterialize(final Output output) {
    return this.getOrMaterialize(output.getComponent(), output.getEventDeclaration());
  }
  
  public Event getOrMaterialize(final Component component, final EventDeclaration eventDeclaration) {
    Event _xblockexpression = null;
    {
      final EventMaterializer.EventKey<EventDeclaration> eventKey = new EventMaterializer.EventKey<EventDeclaration>(component, eventDeclaration);
      this.pushEventKey(eventKey);
      Event _xtrycatchfinallyexpression = null;
      try {
        final Function<EventMaterializer.EventKey<EventDeclaration>, Event> _function = (EventMaterializer.EventKey<EventDeclaration> it) -> {
          return this.materialize(it.component, it.event);
        };
        _xtrycatchfinallyexpression = this.materializationCache.computeIfAbsent(eventKey, _function);
      } finally {
        this.popEventKey(eventKey);
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  protected Event materialize(final Component component, final EventDeclaration eventDeclaration) {
    RandomEvent _xblockexpression = null;
    {
      String _name = component.getName();
      String _plus = (_name + "_");
      String _name_1 = eventDeclaration.getName();
      final String eventName = (_plus + _name_1);
      RandomEvent _switchResult = null;
      boolean _matched = false;
      if (eventDeclaration instanceof InputEvent) {
        _matched=true;
        return this.materializeConnectedEvent(component, ((InputEvent)eventDeclaration));
      }
      if (!_matched) {
        if (eventDeclaration instanceof BasicEventDefinition) {
          _matched=true;
          BasicEvent _xblockexpression_1 = null;
          {
            final BasicEvent basicEvent = this._ftFactory.createBasicEvent();
            basicEvent.setDistribution(EcoreUtil.<Distribution>copy(((BasicEventDefinition)eventDeclaration).getDistribution()));
            _xblockexpression_1 = basicEvent;
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        if (eventDeclaration instanceof GateDefinition) {
          _matched=true;
          Gate _xblockexpression_1 = null;
          {
            final EventCollection inputs = this.collectInputs(component, ((GateDefinition)eventDeclaration));
            Gate _switchResult_1 = null;
            boolean _matched_1 = false;
            if (eventDeclaration instanceof AndGateDefinition) {
              _matched_1=true;
              AndGate _xifexpression = null;
              boolean _containsFalseEvent = inputs.containsFalseEvent();
              if (_containsFalseEvent) {
                return this.falseEvent;
              } else {
                AndGate _xifexpression_1 = null;
                boolean _isEmpty = inputs.isEmpty();
                if (_isEmpty) {
                  return this.trueEvent;
                } else {
                  AndGate _xifexpression_2 = null;
                  boolean _containsExactlyOneRandomEvent = inputs.containsExactlyOneRandomEvent();
                  if (_containsExactlyOneRandomEvent) {
                    return inputs.toSingleRandomEvent();
                  } else {
                    _xifexpression_2 = this._ftFactory.createAndGate();
                  }
                  _xifexpression_1 = _xifexpression_2;
                }
                _xifexpression = _xifexpression_1;
              }
              _switchResult_1 = _xifexpression;
            }
            if (!_matched_1) {
              if (eventDeclaration instanceof OrGateDefinition) {
                _matched_1=true;
                OrGate _xifexpression = null;
                boolean _containsTrueEvent = inputs.containsTrueEvent();
                if (_containsTrueEvent) {
                  return this.trueEvent;
                } else {
                  OrGate _xifexpression_1 = null;
                  boolean _isEmpty = inputs.isEmpty();
                  if (_isEmpty) {
                    return this.falseEvent;
                  } else {
                    OrGate _xifexpression_2 = null;
                    boolean _containsExactlyOneRandomEvent = inputs.containsExactlyOneRandomEvent();
                    if (_containsExactlyOneRandomEvent) {
                      return inputs.toSingleRandomEvent();
                    } else {
                      _xifexpression_2 = this._ftFactory.createOrGate();
                    }
                    _xifexpression_1 = _xifexpression_2;
                  }
                  _xifexpression = _xifexpression_1;
                }
                _switchResult_1 = _xifexpression;
              }
            }
            if (!_matched_1) {
              if (eventDeclaration instanceof KOfMGateDefinition) {
                _matched_1=true;
                Gate _xblockexpression_2 = null;
                {
                  int _count = inputs.getCount();
                  int _k = ((KOfMGateDefinition)eventDeclaration).getK();
                  int _multiply = (_count * _k);
                  int _m = ((KOfMGateDefinition)eventDeclaration).getM();
                  final int requiredTrueInputs = (_multiply / _m);
                  int _trueEventCount = inputs.getTrueEventCount();
                  final int k = (requiredTrueInputs - _trueEventCount);
                  final int m = inputs.getVariableEventCount();
                  Gate _xifexpression = null;
                  if ((k == 0)) {
                    return this.trueEvent;
                  } else {
                    Gate _xifexpression_1 = null;
                    if ((k > m)) {
                      return this.falseEvent;
                    } else {
                      Gate _xifexpression_2 = null;
                      boolean _containsExactlyOneRandomEvent = inputs.containsExactlyOneRandomEvent();
                      if (_containsExactlyOneRandomEvent) {
                        return inputs.toSingleRandomEvent();
                      } else {
                        Gate _xifexpression_3 = null;
                        if ((k == 1)) {
                          _xifexpression_3 = this._ftFactory.createOrGate();
                        } else {
                          Gate _xifexpression_4 = null;
                          if ((k == m)) {
                            _xifexpression_4 = this._ftFactory.createAndGate();
                          } else {
                            KOfMGate _xblockexpression_3 = null;
                            {
                              final KOfMGate kOfMGate = this._ftFactory.createKOfMGate();
                              kOfMGate.setK(k);
                              _xblockexpression_3 = kOfMGate;
                            }
                            _xifexpression_4 = _xblockexpression_3;
                          }
                          _xifexpression_3 = _xifexpression_4;
                        }
                        _xifexpression_2 = _xifexpression_3;
                      }
                      _xifexpression_1 = _xifexpression_2;
                    }
                    _xifexpression = _xifexpression_1;
                  }
                  _xblockexpression_2 = _xifexpression;
                }
                _switchResult_1 = _xblockexpression_2;
              }
            }
            if (!_matched_1) {
              throw new IllegalArgumentException(("Unknown gate definition: " + eventDeclaration));
            }
            final Gate gate = _switchResult_1;
            gate.getInputEvents().addAll(inputs.getRandomEvents());
            _xblockexpression_1 = gate;
          }
          _switchResult = _xblockexpression_1;
        }
      }
      if (!_matched) {
        throw new IllegalArgumentException(("Unknown event declaration: " + eventDeclaration));
      }
      final RandomEvent event = _switchResult;
      event.setName(eventName);
      _xblockexpression = event;
    }
    return _xblockexpression;
  }
  
  protected Event materializeConnectedEvent(final Component component, final InputEvent inputEvent) {
    Event _xblockexpression = null;
    {
      boolean _isMultiple = inputEvent.isMultiple();
      if (_isMultiple) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Cannot materialize multiple nput ");
        String _name = component.getName();
        _builder.append(_name);
        _builder.append("_");
        String _name_1 = inputEvent.getName();
        _builder.append(_name_1);
        throw new IllegalArgumentException(_builder.toString());
      }
      final Input input = this.findInput(component, inputEvent);
      final EList<Connection> incomingConnections = input.getIncomingConnections();
      int _size = incomingConnections.size();
      boolean _notEquals = (_size != 1);
      if (_notEquals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Input ");
        String _name_2 = component.getName();
        _builder_1.append(_name_2);
        _builder_1.append("_");
        String _name_3 = inputEvent.getName();
        _builder_1.append(_name_3);
        _builder_1.append(" has ");
        int _size_1 = incomingConnections.size();
        _builder_1.append(_size_1);
        _builder_1.append(" connections instead of 1");
        throw new IllegalArgumentException(_builder_1.toString());
      }
      final Output output = IterableExtensions.<Connection>head(incomingConnections).getOutput();
      _xblockexpression = this.getOrMaterialize(output.getComponent(), output.getEventDeclaration());
    }
    return _xblockexpression;
  }
  
  protected EventCollection collectInputs(final Component component, final GateDefinition gateDefinition) {
    EventCollection _xblockexpression = null;
    {
      final EventCollection.Builder builder = EventCollection.builder();
      EList<EventDeclaration> _inputEvents = gateDefinition.getInputEvents();
      for (final EventDeclaration inputEventDeclaration : _inputEvents) {
        boolean _matched = false;
        if (inputEventDeclaration instanceof InputEvent) {
          boolean _isMultiple = ((InputEvent)inputEventDeclaration).isMultiple();
          if (_isMultiple) {
            _matched=true;
            final EventCollection materializedEvents = this.getOrMaterializeConnectedEvents(component, ((InputEvent)inputEventDeclaration));
            builder.addAll(materializedEvents);
          }
        }
        if (!_matched) {
          builder.add(this.getOrMaterialize(component, inputEventDeclaration));
        }
      }
      _xblockexpression = builder.build();
    }
    return _xblockexpression;
  }
  
  protected EventCollection getOrMaterializeConnectedEvents(final Component component, final InputEvent inputEvent) {
    EventCollection _xblockexpression = null;
    {
      final EventMaterializer.EventKey<InputEvent> inputKey = new EventMaterializer.EventKey<InputEvent>(component, inputEvent);
      this.pushEventKey(inputKey);
      EventCollection _xtrycatchfinallyexpression = null;
      try {
        final Function<EventMaterializer.EventKey<InputEvent>, EventCollection> _function = (EventMaterializer.EventKey<InputEvent> it) -> {
          return this.materializeConnectedEvents(it.component, it.event);
        };
        _xtrycatchfinallyexpression = this.multipleInputCache.computeIfAbsent(inputKey, _function);
      } finally {
        this.popEventKey(inputKey);
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  protected EventCollection materializeConnectedEvents(final Component component, final InputEvent inputEvent) {
    EventCollection _xblockexpression = null;
    {
      final Input input = this.findInput(component, inputEvent);
      final EventCollection.Builder builder = EventCollection.builder();
      EList<Connection> _incomingConnections = input.getIncomingConnections();
      for (final Connection connection : _incomingConnections) {
        {
          final Event materializedEvent = this.getOrMaterialize(connection.getOutput());
          builder.add(materializedEvent);
        }
      }
      _xblockexpression = builder.build();
    }
    return _xblockexpression;
  }
  
  protected Input findInput(final Component component, final InputEvent inputEvent) {
    final Function1<Input, Boolean> _function = (Input it) -> {
      InputEvent _inputEvent = it.getInputEvent();
      return Boolean.valueOf(Objects.equal(_inputEvent, inputEvent));
    };
    final Input input = IterableExtensions.<Input>findFirst(component.getInputs(), _function);
    if ((input == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("No input ");
      _builder.append(inputEvent);
      _builder.append(" in component ");
      _builder.append(component);
      throw new IllegalArgumentException(_builder.toString());
    }
    return input;
  }
  
  private void pushEventKey(final EventMaterializer.EventKey<? extends EventDeclaration> eventKey) {
    boolean _add = this.path.add(eventKey);
    boolean _not = (!_add);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Circular dependency [");
      {
        for(final EventMaterializer.EventKey<? extends EventDeclaration> ancestor : this.path) {
          _builder.append(ancestor);
          _builder.append(", ");
        }
      }
      _builder.append(eventKey);
      _builder.append("] detected");
      throw new IllegalStateException(_builder.toString());
    }
  }
  
  private boolean popEventKey(final EventMaterializer.EventKey<? extends EventDeclaration> eventKey) {
    return this.path.remove(eventKey);
  }
}
