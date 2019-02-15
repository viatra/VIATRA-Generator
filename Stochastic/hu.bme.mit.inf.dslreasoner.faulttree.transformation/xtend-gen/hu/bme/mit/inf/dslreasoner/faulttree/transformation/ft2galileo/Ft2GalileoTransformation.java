package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ft2galileo;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;

@SuppressWarnings("all")
public class Ft2GalileoTransformation {
  public CharSequence toGalileo(final FaultTree faultTree) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("toplevel ");
    String _name = faultTree.getTopEvent().getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      EList<RandomEvent> _events = faultTree.getEvents();
      for(final RandomEvent event : _events) {
        String _name_1 = event.getName();
        _builder.append(_name_1);
        _builder.append(" ");
        StringConcatenationClient _defineEvent = this.defineEvent(event);
        _builder.append(_defineEvent);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenationClient _defineEvent(final BasicEvent basicEvent) {
    return this.defineDistribution(basicEvent.getDistribution());
  }
  
  protected StringConcatenationClient _defineDistribution(final ConstantDistribution distribution) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("p=");
        double _p = distribution.getP();
        _builder.append(_p);
      }
    };
    return _client;
  }
  
  protected StringConcatenationClient _defineDistribution(final ExponentialDistribution distribution) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("lambda=");
        double _lambda = distribution.getLambda();
        _builder.append(_lambda);
      }
    };
    return _client;
  }
  
  protected StringConcatenationClient _defineDistribution(final Distribution distribution) {
    throw new IllegalArgumentException(("Unknown distribution: " + distribution));
  }
  
  protected StringConcatenationClient _defineEvent(final Gate gate) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        StringConcatenationClient _defineGate = Ft2GalileoTransformation.this.defineGate(gate);
        _builder.append(_defineGate);
        _builder.append(" ");
        {
          EList<RandomEvent> _inputEvents = gate.getInputEvents();
          boolean _hasElements = false;
          for(final RandomEvent input : _inputEvents) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" ", "");
            }
            String _name = input.getName();
            _builder.append(_name);
          }
        }
      }
    };
    return _client;
  }
  
  protected StringConcatenationClient _defineGate(final AndGate gate) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("and");
      }
    };
    return _client;
  }
  
  protected StringConcatenationClient _defineGate(final OrGate gate) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("or");
      }
    };
    return _client;
  }
  
  protected StringConcatenationClient _defineGate(final KOfMGate gate) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        int _k = gate.getK();
        _builder.append(_k);
        _builder.append("of");
        int _size = gate.getInputEvents().size();
        _builder.append(_size);
      }
    };
    return _client;
  }
  
  protected StringConcatenationClient _defineGate(final Gate gate) {
    throw new IllegalArgumentException(("Unknown gate: " + gate));
  }
  
  protected StringConcatenationClient _defineEvent(final RandomEvent randomEvent) {
    throw new IllegalArgumentException(("Unknown random even: " + randomEvent));
  }
  
  protected StringConcatenationClient defineEvent(final RandomEvent basicEvent) {
    if (basicEvent instanceof BasicEvent) {
      return _defineEvent((BasicEvent)basicEvent);
    } else if (basicEvent instanceof Gate) {
      return _defineEvent((Gate)basicEvent);
    } else if (basicEvent != null) {
      return _defineEvent(basicEvent);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(basicEvent).toString());
    }
  }
  
  protected StringConcatenationClient defineDistribution(final Distribution distribution) {
    if (distribution instanceof ConstantDistribution) {
      return _defineDistribution((ConstantDistribution)distribution);
    } else if (distribution instanceof ExponentialDistribution) {
      return _defineDistribution((ExponentialDistribution)distribution);
    } else if (distribution != null) {
      return _defineDistribution(distribution);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(distribution).toString());
    }
  }
  
  protected StringConcatenationClient defineGate(final Gate gate) {
    if (gate instanceof AndGate) {
      return _defineGate((AndGate)gate);
    } else if (gate instanceof KOfMGate) {
      return _defineGate((KOfMGate)gate);
    } else if (gate instanceof OrGate) {
      return _defineGate((OrGate)gate);
    } else if (gate != null) {
      return _defineGate(gate);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gate).toString());
    }
  }
}
