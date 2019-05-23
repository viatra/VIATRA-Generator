package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

@SuppressWarnings("all")
public class NotAllocatedAppInstancesConstraint implements IGuidanceFunction {
  @Override
  public String getName() {
    return "NotAllocatedAppInstances";
  }
  
  @Override
  public double computeFitness(final Solution solution) {
    int _xblockexpression = (int) 0;
    {
      EObject _model = solution.getModel();
      final CyberPhysicalSystem cps = ((CyberPhysicalSystem) _model);
      int cost = 0;
      EList<ApplicationType> _applicationTypes = cps.getApplicationTypes();
      for (final ApplicationType appType : _applicationTypes) {
        EList<ApplicationInstance> _instances = appType.getInstances();
        for (final ApplicationInstance app : _instances) {
          if (((app.getAllocatedTo() == null) || (!IterableExtensions.<ResourceRequirement>exists(appType.getRequirements(), ((Function1<ResourceRequirement, Boolean>) (ResourceRequirement it) -> {
            HostType _hostType = it.getHostType();
            HostType _type = app.getAllocatedTo().getType();
            return Boolean.valueOf(Objects.equal(_hostType, _type));
          }))))) {
            cost++;
          }
        }
      }
      _xblockexpression = cost;
    }
    return _xblockexpression;
  }
}
