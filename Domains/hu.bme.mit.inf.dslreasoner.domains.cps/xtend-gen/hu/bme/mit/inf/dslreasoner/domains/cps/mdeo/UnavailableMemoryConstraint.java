package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.mdeo.ResourceUtilizationUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

@SuppressWarnings("all")
public class UnavailableMemoryConstraint implements IGuidanceFunction {
  @Override
  public String getName() {
    return "UnavailableMemory";
  }
  
  @Override
  public double computeFitness(final Solution solution) {
    int _xblockexpression = (int) 0;
    {
      EObject _model = solution.getModel();
      final CyberPhysicalSystem cps = ((CyberPhysicalSystem) _model);
      int cost = 0;
      EList<HostType> _hostTypes = cps.getHostTypes();
      for (final HostType hostType : _hostTypes) {
        EList<HostInstance> _instances = hostType.getInstances();
        for (final HostInstance host : _instances) {
          {
            final int utilization = ResourceUtilizationUtil.getMemoryUtilization(host);
            int _defaultMemory = hostType.getDefaultMemory();
            final int difference = (utilization - _defaultMemory);
            if ((difference > 0)) {
              int _cost = cost;
              cost = (_cost + difference);
            }
          }
        }
      }
      _xblockexpression = cost;
    }
    return _xblockexpression;
  }
}
