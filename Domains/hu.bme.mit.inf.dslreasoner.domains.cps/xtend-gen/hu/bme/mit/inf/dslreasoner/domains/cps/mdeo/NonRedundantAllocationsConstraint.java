package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

@SuppressWarnings("all")
public class NonRedundantAllocationsConstraint implements IGuidanceFunction {
  @Override
  public String getName() {
    return "NonRedundantAllocations";
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
            final HashMultiset<Requirement> bins = HashMultiset.<Requirement>create();
            EList<ApplicationInstance> _applications = host.getApplications();
            for (final ApplicationInstance app : _applications) {
              bins.add(app.getRequirement());
            }
            Set<Multiset.Entry<Requirement>> _entrySet = bins.entrySet();
            for (final Multiset.Entry<Requirement> entry : _entrySet) {
              int _cost = cost;
              int _count = entry.getCount();
              int _minus = (_count - 1);
              cost = (_cost + _minus);
            }
          }
        }
      }
      _xblockexpression = cost;
    }
    return _xblockexpression;
  }
}
