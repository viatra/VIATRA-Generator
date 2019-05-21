package hu.bme.mit.inf.dslreasoner.domains.cps.dse;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.Request;
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;
import java.util.Arrays;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra.dse.statecode.IStateCoder;
import org.eclipse.viatra.dse.statecode.IStateCoderFactory;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CpsStateCoder implements IStateCoder {
  public static class Factory implements IStateCoderFactory {
    @Override
    public IStateCoder createStateCoder() {
      return new CpsStateCoder();
    }
  }
  
  private CyberPhysicalSystem cps;
  
  protected CpsStateCoder() {
  }
  
  @Override
  public void init(final Notifier notifier) {
    CyberPhysicalSystem _switchResult = null;
    boolean _matched = false;
    if (notifier instanceof ResourceSet) {
      _matched=true;
      _switchResult = this.getCpsFromResourceSet(((ResourceSet)notifier));
    }
    if (!_matched) {
      if (notifier instanceof Resource) {
        _matched=true;
        _switchResult = this.getCpsFromResource(((Resource)notifier));
      }
    }
    if (!_matched) {
      if (notifier instanceof CyberPhysicalSystem) {
        _matched=true;
        _switchResult = ((CyberPhysicalSystem)notifier);
      }
    }
    if (!_matched) {
      throw new IllegalArgumentException("notifier is not a CyberPhysicalSystem");
    }
    this.cps = _switchResult;
  }
  
  private CyberPhysicalSystem getCpsFromResourceSet(final ResourceSet resourceSet) {
    CyberPhysicalSystem _xblockexpression = null;
    {
      boolean _isEmpty = resourceSet.getResources().isEmpty();
      if (_isEmpty) {
        throw new IllegalArgumentException("No Resource in ResourceSet");
      }
      final Resource resource = IterableExtensions.<Resource>head(resourceSet.getResources());
      _xblockexpression = this.getCpsFromResource(resource);
    }
    return _xblockexpression;
  }
  
  private CyberPhysicalSystem getCpsFromResource(final Resource resource) {
    CyberPhysicalSystem _xblockexpression = null;
    {
      boolean _isEmpty = resource.getContents().isEmpty();
      if (_isEmpty) {
        throw new IllegalArgumentException("No EObject in Resource");
      }
      final EObject cps = IterableExtensions.<EObject>head(resource.getContents());
      CyberPhysicalSystem _xifexpression = null;
      if ((cps instanceof CyberPhysicalSystem)) {
        _xifexpression = ((CyberPhysicalSystem)cps);
      } else {
        throw new IllegalArgumentException("EObject in Resource is not a CyberPhysicalSystem");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public String createStateCode() {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenationClient _createRequestsCode = this.createRequestsCode();
    _builder.append(_createRequestsCode);
    CharSequence _createHostTypesCode = this.createHostTypesCode();
    _builder.append(_createHostTypesCode);
    return _builder.toString();
  }
  
  private StringConcatenationClient createRequestsCode() {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        {
          EList<Request> _requests = CpsStateCoder.this.cps.getRequests();
          for(final Request request : _requests) {
            StringConcatenationClient _createRequestCode = CpsStateCoder.this.createRequestCode(request);
            _builder.append(_createRequestCode);
          }
        }
      }
    };
    return _client;
  }
  
  private StringConcatenationClient createRequestCode(final Request request) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("[");
        {
          EList<Requirement> _requirements = request.getRequirements();
          for(final Requirement requirement : _requirements) {
            StringConcatenationClient _createRequirementCode = CpsStateCoder.this.createRequirementCode(requirement);
            _builder.append(_createRequirementCode);
          }
        }
        _builder.append("]");
      }
    };
    return _client;
  }
  
  private StringConcatenationClient createRequirementCode(final Requirement requirement) {
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("[");
        {
          EList<ApplicationInstance> _instances = requirement.getInstances();
          boolean _hasElements = false;
          for(final ApplicationInstance app : _instances) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            String _createAppCode = CpsStateCoder.this.createAppCode(app);
            _builder.append(_createAppCode);
          }
        }
        _builder.append("]");
      }
    };
    return _client;
  }
  
  private String createAppCode(final ApplicationInstance app) {
    String _xifexpression = null;
    HostInstance _allocatedTo = app.getAllocatedTo();
    boolean _tripleEquals = (_allocatedTo == null);
    if (_tripleEquals) {
      _xifexpression = "-";
    } else {
      _xifexpression = this.createMatchArgumentCode(app.getAllocatedTo());
    }
    return _xifexpression;
  }
  
  private CharSequence createHostTypesCode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    {
      EList<HostType> _hostTypes = this.cps.getHostTypes();
      boolean _hasElements = false;
      for(final HostType hostType : _hostTypes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        int _size = hostType.getInstances().size();
        _builder.append(_size);
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public String createActivationCode(final IPatternMatch match) {
    StringConcatenation _builder = new StringConcatenation();
    String _simpleName = match.specification().getSimpleName();
    _builder.append(_simpleName);
    _builder.append("(");
    {
      Object[] _array = match.toArray();
      boolean _hasElements = false;
      for(final Object arg : _array) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _createMatchArgumentCode = this.createMatchArgumentCode(arg);
        _builder.append(_createMatchArgumentCode);
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _createMatchArgumentCode(final Requirement requirement) {
    String _xblockexpression = null;
    {
      final EObject request = requirement.eContainer();
      String _xifexpression = null;
      if ((request instanceof Request)) {
        String _xblockexpression_1 = null;
        {
          EObject _eContainer = ((Request)request).eContainer();
          boolean _notEquals = (!Objects.equal(_eContainer, this.cps));
          if (_notEquals) {
            throw new IllegalArgumentException("Request is not contained in the CPS");
          }
          final int requestIndex = this.cps.getRequests().indexOf(request);
          final int requirementIndex = ((Request)request).getRequirements().indexOf(requirement);
          String _plus = (Integer.valueOf(requestIndex) + ".");
          _xblockexpression_1 = (_plus + Integer.valueOf(requirementIndex));
        }
        _xifexpression = _xblockexpression_1;
      } else {
        throw new IllegalArgumentException("Requirement is not contained in a request");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected String _createMatchArgumentCode(final ApplicationInstance app) {
    String _xblockexpression = null;
    {
      final Requirement requirement = app.getRequirement();
      if ((requirement == null)) {
        throw new IllegalArgumentException("Application instance is not associated with a requirement");
      }
      final int instanceIndex = requirement.getInstances().indexOf(app);
      String _createMatchArgumentCode = this.createMatchArgumentCode(requirement);
      String _plus = (_createMatchArgumentCode + ".");
      _xblockexpression = (_plus + Integer.valueOf(instanceIndex));
    }
    return _xblockexpression;
  }
  
  protected String _createMatchArgumentCode(final HostInstance host) {
    String _xblockexpression = null;
    {
      final EObject hostType = host.eContainer();
      String _xifexpression = null;
      if ((hostType instanceof HostType)) {
        String _xblockexpression_1 = null;
        {
          final int hostIndex = ((HostType)hostType).getInstances().indexOf(host);
          String _createMatchArgumentCode = this.createMatchArgumentCode(hostType);
          String _plus = (_createMatchArgumentCode + ".");
          _xblockexpression_1 = (_plus + Integer.valueOf(hostIndex));
        }
        _xifexpression = _xblockexpression_1;
      } else {
        throw new IllegalArgumentException("Host is not contained in a host type");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected String _createMatchArgumentCode(final HostType hostType) {
    String _xblockexpression = null;
    {
      EObject _eContainer = hostType.eContainer();
      boolean _notEquals = (!Objects.equal(_eContainer, this.cps));
      if (_notEquals) {
        throw new IllegalArgumentException("Host type is not contained in the CPS");
      }
      final int hostTypeIndex = this.cps.getHostTypes().indexOf(hostType);
      _xblockexpression = Integer.valueOf(hostTypeIndex).toString();
    }
    return _xblockexpression;
  }
  
  protected String _createMatchArgumentCode(final Object object) {
    throw new IllegalArgumentException("Unknown match argument: ");
  }
  
  protected String createMatchArgumentCode(final Object app) {
    if (app instanceof ApplicationInstance) {
      return _createMatchArgumentCode((ApplicationInstance)app);
    } else if (app instanceof HostInstance) {
      return _createMatchArgumentCode((HostInstance)app);
    } else if (app instanceof HostType) {
      return _createMatchArgumentCode((HostType)app);
    } else if (app instanceof Requirement) {
      return _createMatchArgumentCode((Requirement)app);
    } else if (app != null) {
      return _createMatchArgumentCode(app);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(app).toString());
    }
  }
}
