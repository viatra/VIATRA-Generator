package hu.bme.mit.inf.dslreasoner.domains.cps.cplex;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.Request;
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CpsToLpTranslator {
  private static final double MINIMUM_MEMORY_USAGE = 0.25;
  
  private static final double MINIMUM_HDD_USAGE = 0.25;
  
  private final CyberPhysicalSystem cps;
  
  private final Map<Requirement, ? extends List<String>> appInstances;
  
  private final Map<HostType, ? extends List<String>> hostInstances;
  
  private final boolean breakSymmetry;
  
  public CpsToLpTranslator(final CyberPhysicalSystem cps, final int hostInstanceCount, final boolean breakSymmetry) {
    this.cps = cps;
    this.appInstances = this.createAppInstances();
    this.hostInstances = this.createHostInstances(hostInstanceCount);
    this.breakSymmetry = breakSymmetry;
  }
  
  private ImmutableMap<Requirement, ImmutableList<String>> createAppInstances() {
    ImmutableMap<Requirement, ImmutableList<String>> _xblockexpression = null;
    {
      final ImmutableMap.Builder<Requirement, ImmutableList<String>> builder = ImmutableMap.<Requirement, ImmutableList<String>>builder();
      int i = 0;
      Iterable<Requirement> _requirements = this.getRequirements();
      for (final Requirement req : _requirements) {
        {
          final ImmutableList.Builder<String> listBuilder = ImmutableList.<String>builder();
          for (int j = 0; (j < req.getCount()); j++) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("r");
            _builder.append(i);
            _builder.append("a");
            _builder.append(j);
            listBuilder.add(_builder.toString());
          }
          builder.put(req, listBuilder.build());
          i++;
        }
      }
      _xblockexpression = builder.build();
    }
    return _xblockexpression;
  }
  
  private ImmutableMap<HostType, ImmutableList<String>> createHostInstances(final int hostInstanceCount) {
    ImmutableMap<HostType, ImmutableList<String>> _xblockexpression = null;
    {
      final ImmutableMap.Builder<HostType, ImmutableList<String>> builder = ImmutableMap.<HostType, ImmutableList<String>>builder();
      int i = 0;
      EList<HostType> _hostTypes = this.cps.getHostTypes();
      for (final HostType hostType : _hostTypes) {
        {
          final ImmutableList.Builder<String> listBuilder = ImmutableList.<String>builder();
          for (int j = 0; (j < hostInstanceCount); j++) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("h");
            _builder.append(i);
            _builder.append("i");
            _builder.append(j);
            listBuilder.add(_builder.toString());
          }
          builder.put(hostType, listBuilder.build());
          i++;
        }
      }
      _xblockexpression = builder.build();
    }
    return _xblockexpression;
  }
  
  public CharSequence getLpProblem() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Minimize");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("total_cost: ");
    CharSequence _objective = this.getObjective();
    _builder.append(_objective, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("Subject To");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _constraints = this.getConstraints();
    _builder.append(_constraints, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("Bounds");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _bounds = this.getBounds();
    _builder.append(_bounds, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("Binary");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _binaryVariables = this.getBinaryVariables();
    _builder.append(_binaryVariables, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("End");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence getObjective() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Pair<HostType, String>> _hostInstancesWithType = this.getHostInstancesWithType();
      boolean _hasElements = false;
      for(final Pair<HostType, String> pair : _hostInstancesWithType) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" + ", "");
        }
        int _cost = pair.getKey().getCost();
        _builder.append(_cost);
        _builder.append(" ");
        CharSequence _existsVariable = this.getExistsVariable(pair.getValue());
        _builder.append(_existsVariable);
      }
    }
    return _builder;
  }
  
  private CharSequence getConstraints() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<Pair<ApplicationType, String>> _appInstancesWithType = this.getAppInstancesWithType();
      for(final Pair<ApplicationType, String> appPair : _appInstancesWithType) {
        String _value = appPair.getValue();
        _builder.append(_value);
        _builder.append("_allocated: ");
        {
          Iterable<String> _possibleHostInstances = this.getPossibleHostInstances(appPair.getKey());
          boolean _hasElements = false;
          for(final String host : _possibleHostInstances) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(" + ", "");
            }
            CharSequence _allocatedToVariable = this.getAllocatedToVariable(appPair.getValue(), host);
            _builder.append(_allocatedToVariable);
          }
        }
        _builder.append(" = 1");
        _builder.newLineIfNotEmpty();
        {
          Iterable<String> _possibleHostInstances_1 = this.getPossibleHostInstances(appPair.getKey());
          for(final String host_1 : _possibleHostInstances_1) {
            String _value_1 = appPair.getValue();
            _builder.append(_value_1);
            _builder.append("_to_");
            _builder.append(host_1);
            _builder.append("_exists: ");
            CharSequence _existsVariable = this.getExistsVariable(host_1);
            _builder.append(_existsVariable);
            _builder.append(" - ");
            CharSequence _allocatedToVariable_1 = this.getAllocatedToVariable(appPair.getValue(), host_1);
            _builder.append(_allocatedToVariable_1);
            _builder.append(" >= 0");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      Iterable<Pair<HostType, String>> _hostInstancesWithType = this.getHostInstancesWithType();
      for(final Pair<HostType, String> hostPair : _hostInstancesWithType) {
        String _value_2 = hostPair.getValue();
        _builder.append(_value_2);
        _builder.append("_mem_use: ");
        {
          Iterable<Pair<ResourceRequirement, String>> _possibleAppInstancesWithRequirements = this.getPossibleAppInstancesWithRequirements(hostPair.getKey());
          boolean _hasElements_1 = false;
          for(final Pair<ResourceRequirement, String> appPair_1 : _possibleAppInstancesWithRequirements) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(" + ", "");
            }
            int _requiredMemory = appPair_1.getKey().getRequiredMemory();
            _builder.append(_requiredMemory);
            _builder.append(" ");
            CharSequence _allocatedToVariable_2 = this.getAllocatedToVariable(appPair_1.getValue(), hostPair.getValue());
            _builder.append(_allocatedToVariable_2);
          }
        }
        _builder.append(" - ");
        int _defaultMemory = hostPair.getKey().getDefaultMemory();
        _builder.append(_defaultMemory);
        _builder.append(" ");
        CharSequence _memoryUsageVariable = this.getMemoryUsageVariable(hostPair.getValue());
        _builder.append(_memoryUsageVariable);
        _builder.append(" = 0");
        _builder.newLineIfNotEmpty();
        String _value_3 = hostPair.getValue();
        _builder.append(_value_3);
        _builder.append("_hdd_use: ");
        {
          Iterable<Pair<ResourceRequirement, String>> _possibleAppInstancesWithRequirements_1 = this.getPossibleAppInstancesWithRequirements(hostPair.getKey());
          boolean _hasElements_2 = false;
          for(final Pair<ResourceRequirement, String> appPair_2 : _possibleAppInstancesWithRequirements_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(" + ", "");
            }
            int _requiredHdd = appPair_2.getKey().getRequiredHdd();
            _builder.append(_requiredHdd);
            _builder.append(" ");
            CharSequence _allocatedToVariable_3 = this.getAllocatedToVariable(appPair_2.getValue(), hostPair.getValue());
            _builder.append(_allocatedToVariable_3);
          }
        }
        _builder.append(" - ");
        int _defaultHdd = hostPair.getKey().getDefaultHdd();
        _builder.append(_defaultHdd);
        _builder.append(" ");
        CharSequence _hddUsageVariable = this.getHddUsageVariable(hostPair.getValue());
        _builder.append(_hddUsageVariable);
        _builder.append(" = 0");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("average_mem: ");
    {
      Iterable<String> _allHostInstances = this.getAllHostInstances();
      boolean _hasElements_3 = false;
      for(final String host_2 : _allHostInstances) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(" + ", "");
        }
        CharSequence _memoryUsageVariable_1 = this.getMemoryUsageVariable(host_2);
        _builder.append(_memoryUsageVariable_1);
        _builder.append(" - ");
        _builder.append(CpsToLpTranslator.MINIMUM_MEMORY_USAGE);
        _builder.append(" ");
        CharSequence _existsVariable_1 = this.getExistsVariable(host_2);
        _builder.append(_existsVariable_1);
      }
    }
    _builder.append(" >= 0");
    _builder.newLineIfNotEmpty();
    _builder.append("average_hdd: ");
    {
      Iterable<String> _allHostInstances_1 = this.getAllHostInstances();
      boolean _hasElements_4 = false;
      for(final String host_3 : _allHostInstances_1) {
        if (!_hasElements_4) {
          _hasElements_4 = true;
        } else {
          _builder.appendImmediate(" + ", "");
        }
        CharSequence _memoryUsageVariable_2 = this.getMemoryUsageVariable(host_3);
        _builder.append(_memoryUsageVariable_2);
        _builder.append(" - ");
        _builder.append(CpsToLpTranslator.MINIMUM_HDD_USAGE);
        _builder.append(" ");
        CharSequence _existsVariable_2 = this.getExistsVariable(host_3);
        _builder.append(_existsVariable_2);
      }
    }
    _builder.append(" >= 0");
    _builder.newLineIfNotEmpty();
    {
      final Function1<Requirement, Boolean> _function = (Requirement it) -> {
        int _count = it.getCount();
        return Boolean.valueOf((_count > 1));
      };
      Iterable<Pair<Integer, Requirement>> _indexed = IterableExtensions.<Requirement>indexed(IterableExtensions.<Requirement>filter(this.getRequirements(), _function));
      for(final Pair<Integer, Requirement> reqPair : _indexed) {
        {
          final Function1<ResourceRequirement, List<String>> _function_1 = (ResourceRequirement it) -> {
            return this.hostInstances.get(it.getHostType());
          };
          Iterable<String> _flatMap = IterableExtensions.<ResourceRequirement, String>flatMap(reqPair.getValue().getType().getRequirements(), _function_1);
          for(final String host_4 : _flatMap) {
            _builder.append("r");
            Integer _key = reqPair.getKey();
            _builder.append(_key);
            _builder.append("_");
            _builder.append(host_4);
            _builder.append("_redundant: ");
            {
              List<String> _get = this.appInstances.get(reqPair.getValue());
              boolean _hasElements_5 = false;
              for(final String app : _get) {
                if (!_hasElements_5) {
                  _hasElements_5 = true;
                } else {
                  _builder.appendImmediate(" + ", "");
                }
                CharSequence _allocatedToVariable_4 = this.getAllocatedToVariable(app, host_4);
                _builder.append(_allocatedToVariable_4);
              }
            }
            _builder.append(" <= 1");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      if (this.breakSymmetry) {
        {
          Collection<? extends List<String>> _values = this.hostInstances.values();
          for(final List<String> hosts : _values) {
            {
              int _size = hosts.size();
              int _minus = (_size - 1);
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _minus, true);
              for(final Integer i : _doubleDotLessThan) {
                String _get_1 = hosts.get(((i).intValue() + 1));
                _builder.append(_get_1);
                _builder.append("_after_");
                String _get_2 = hosts.get((i).intValue());
                _builder.append(_get_2);
                _builder.append(": ");
                CharSequence _existsVariable_3 = this.getExistsVariable(hosts.get((i).intValue()));
                _builder.append(_existsVariable_3);
                _builder.append(" - ");
                CharSequence _existsVariable_4 = this.getExistsVariable(hosts.get(((i).intValue() + 1)));
                _builder.append(_existsVariable_4);
                _builder.append(" >= 0");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  private CharSequence getBounds() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<String> _allHostInstances = this.getAllHostInstances();
      for(final String host : _allHostInstances) {
        _builder.append("0 <= ");
        CharSequence _memoryUsageVariable = this.getMemoryUsageVariable(host);
        _builder.append(_memoryUsageVariable);
        _builder.append(" <= 1");
        _builder.newLineIfNotEmpty();
        _builder.append("0 <= ");
        CharSequence _hddUsageVariable = this.getHddUsageVariable(host);
        _builder.append(_hddUsageVariable);
        _builder.append(" <= 1");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  private CharSequence getBinaryVariables() {
    StringConcatenation _builder = new StringConcatenation();
    {
      Iterable<String> _allHostInstances = this.getAllHostInstances();
      for(final String host : _allHostInstances) {
        CharSequence _existsVariable = this.getExistsVariable(host);
        _builder.append(_existsVariable);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Iterable<Pair<ApplicationType, String>> _appInstancesWithType = this.getAppInstancesWithType();
      for(final Pair<ApplicationType, String> appPair : _appInstancesWithType) {
        {
          Iterable<String> _possibleHostInstances = this.getPossibleHostInstances(appPair.getKey());
          for(final String host_1 : _possibleHostInstances) {
            CharSequence _allocatedToVariable = this.getAllocatedToVariable(appPair.getValue(), host_1);
            _builder.append(_allocatedToVariable);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  private Iterable<Requirement> getRequirements() {
    final Function1<Request, EList<Requirement>> _function = (Request it) -> {
      return it.getRequirements();
    };
    return IterableExtensions.<Request, Requirement>flatMap(this.cps.getRequests(), _function);
  }
  
  private Iterable<String> getAllHostInstances() {
    final Function1<List<String>, List<String>> _function = (List<String> it) -> {
      return it;
    };
    return IterableExtensions.flatMap(this.hostInstances.values(), _function);
  }
  
  private Iterable<Pair<HostType, String>> getHostInstancesWithType() {
    final Function1<Map.Entry<HostType, ? extends List<String>>, List<Pair<HostType, String>>> _function = (Map.Entry<HostType, ? extends List<String>> pair) -> {
      final Function1<String, Pair<HostType, String>> _function_1 = (String it) -> {
        HostType _key = pair.getKey();
        return Pair.<HostType, String>of(_key, it);
      };
      return ListExtensions.<String, Pair<HostType, String>>map(pair.getValue(), _function_1);
    };
    return IterableExtensions.flatMap(this.hostInstances.entrySet(), _function);
  }
  
  private Iterable<Pair<ApplicationType, String>> getAppInstancesWithType() {
    final Function1<Map.Entry<Requirement, ? extends List<String>>, List<Pair<ApplicationType, String>>> _function = (Map.Entry<Requirement, ? extends List<String>> pair) -> {
      final Function1<String, Pair<ApplicationType, String>> _function_1 = (String it) -> {
        ApplicationType _type = pair.getKey().getType();
        return Pair.<ApplicationType, String>of(_type, it);
      };
      return ListExtensions.<String, Pair<ApplicationType, String>>map(pair.getValue(), _function_1);
    };
    return IterableExtensions.flatMap(this.appInstances.entrySet(), _function);
  }
  
  private Iterable<String> getPossibleHostInstances(final ApplicationType appType) {
    final Function1<ResourceRequirement, List<String>> _function = (ResourceRequirement req) -> {
      return this.hostInstances.get(req.getHostType());
    };
    return IterableExtensions.<ResourceRequirement, String>flatMap(appType.getRequirements(), _function);
  }
  
  private Iterable<Pair<ResourceRequirement, String>> getPossibleAppInstancesWithRequirements(final HostType hostType) {
    final Function1<Map.Entry<Requirement, ? extends List<String>>, List<Pair<ResourceRequirement, String>>> _function = (Map.Entry<Requirement, ? extends List<String>> pair) -> {
      List<Pair<ResourceRequirement, String>> _xblockexpression = null;
      {
        final Function1<ResourceRequirement, Boolean> _function_1 = (ResourceRequirement it) -> {
          HostType _hostType = it.getHostType();
          return Boolean.valueOf(Objects.equal(_hostType, hostType));
        };
        final ResourceRequirement resourceReq = IterableExtensions.<ResourceRequirement>findFirst(pair.getKey().getType().getRequirements(), _function_1);
        List<Pair<ResourceRequirement, String>> _xifexpression = null;
        if ((resourceReq == null)) {
          _xifexpression = CollectionLiterals.<Pair<ResourceRequirement, String>>emptyList();
        } else {
          final Function1<String, Pair<ResourceRequirement, String>> _function_2 = (String it) -> {
            return Pair.<ResourceRequirement, String>of(resourceReq, it);
          };
          _xifexpression = ListExtensions.<String, Pair<ResourceRequirement, String>>map(pair.getValue(), _function_2);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return IterableExtensions.flatMap(this.appInstances.entrySet(), _function);
  }
  
  private CharSequence getExistsVariable(final String hostInstance) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(hostInstance);
    _builder.append("_exists");
    return _builder;
  }
  
  private CharSequence getMemoryUsageVariable(final String hostInstance) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(hostInstance);
    _builder.append("_mem");
    return _builder;
  }
  
  private CharSequence getHddUsageVariable(final String hostInstance) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(hostInstance);
    _builder.append("_hdd");
    return _builder;
  }
  
  private CharSequence getAllocatedToVariable(final String appInstance, final String hostInstance) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(appInstance);
    _builder.append("_to_");
    _builder.append(hostInstance);
    return _builder;
  }
}
