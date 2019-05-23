package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ResourceUtilizationUtil {
  private ResourceUtilizationUtil() {
    new IllegalStateException("This is a static utility class and should not be instantiated directly.");
  }
  
  public static int getMemoryUtilization(final HostInstance host) {
    int _xblockexpression = (int) 0;
    {
      int utilization = 0;
      EList<ApplicationInstance> _applications = host.getApplications();
      for (final ApplicationInstance app : _applications) {
        {
          final Function1<ResourceRequirement, Boolean> _function = (ResourceRequirement it) -> {
            HostType _hostType = it.getHostType();
            HostType _type = host.getType();
            return Boolean.valueOf(Objects.equal(_hostType, _type));
          };
          final ResourceRequirement req = IterableExtensions.<ResourceRequirement>findFirst(app.getType().getRequirements(), _function);
          if ((req != null)) {
            int _utilization = utilization;
            int _requiredMemory = req.getRequiredMemory();
            utilization = (_utilization + _requiredMemory);
          }
        }
      }
      _xblockexpression = utilization;
    }
    return _xblockexpression;
  }
  
  public static int getHddUtilization(final HostInstance host) {
    int _xblockexpression = (int) 0;
    {
      int utilization = 0;
      EList<ApplicationInstance> _applications = host.getApplications();
      for (final ApplicationInstance app : _applications) {
        {
          final Function1<ResourceRequirement, Boolean> _function = (ResourceRequirement it) -> {
            HostType _hostType = it.getHostType();
            HostType _type = host.getType();
            return Boolean.valueOf(Objects.equal(_hostType, _type));
          };
          final ResourceRequirement req = IterableExtensions.<ResourceRequirement>findFirst(app.getType().getRequirements(), _function);
          if ((req != null)) {
            int _utilization = utilization;
            int _requiredHdd = req.getRequiredHdd();
            utilization = (_utilization + _requiredHdd);
          }
        }
      }
      _xblockexpression = utilization;
    }
    return _xblockexpression;
  }
}
