package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

@SuppressWarnings("all")
public class TotalCostFitnessFunction implements IGuidanceFunction {
  @Override
  public String getName() {
    return "TotalCost";
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
        int _cost = cost;
        int _size = appType.getInstances().size();
        int _multiply = (5 * _size);
        cost = (_cost + _multiply);
      }
      EList<HostType> _hostTypes = cps.getHostTypes();
      for (final HostType hostType : _hostTypes) {
        int _cost_1 = cost;
        int _cost_2 = hostType.getCost();
        int _size_1 = hostType.getInstances().size();
        int _multiply_1 = (_cost_2 * _size_1);
        cost = (_cost_1 + _multiply_1);
      }
      _xblockexpression = cost;
    }
    return _xblockexpression;
  }
}
