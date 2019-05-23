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
public class TooLowAverageMemoryConstraint implements IGuidanceFunction {
  private static final double THRESHOLD = 0.25;
  
  @Override
  public String getName() {
    return "TooLowAverageMemory";
  }
  
  @Override
  public double computeFitness(final Solution solution) {
    double _xblockexpression = (double) 0;
    {
      EObject _model = solution.getModel();
      final CyberPhysicalSystem cps = ((CyberPhysicalSystem) _model);
      double sumUtilization = 0;
      int numHosts = 0;
      EList<HostType> _hostTypes = cps.getHostTypes();
      for (final HostType hostType : _hostTypes) {
        {
          int _numHosts = numHosts;
          int _size = hostType.getInstances().size();
          numHosts = (_numHosts + _size);
          EList<HostInstance> _instances = hostType.getInstances();
          for (final HostInstance host : _instances) {
            {
              final int utilization = ResourceUtilizationUtil.getMemoryUtilization(host);
              double _sumUtilization = sumUtilization;
              int _defaultMemory = hostType.getDefaultMemory();
              double _divide = (((double) utilization) / _defaultMemory);
              sumUtilization = (_sumUtilization + _divide);
            }
          }
        }
      }
      final double averageUtilization = (sumUtilization / numHosts);
      final double difference = (TooLowAverageMemoryConstraint.THRESHOLD - averageUtilization);
      double _xifexpression = (double) 0;
      if ((difference > 0)) {
        _xifexpression = difference;
      } else {
        _xifexpression = 0;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
