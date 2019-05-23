package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.Request;
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

@SuppressWarnings("all")
public class NotSatisfiedRequirementsConstraint implements IGuidanceFunction {
  @Override
  public String getName() {
    return "NotSatisfiedRequirements";
  }
  
  @Override
  public double computeFitness(final Solution solution) {
    int _xblockexpression = (int) 0;
    {
      EObject _model = solution.getModel();
      final CyberPhysicalSystem cps = ((CyberPhysicalSystem) _model);
      int cost = 0;
      EList<Request> _requests = cps.getRequests();
      for (final Request request : _requests) {
        EList<Requirement> _requirements = request.getRequirements();
        for (final Requirement requirement : _requirements) {
          {
            int _cost = cost;
            int _count = requirement.getCount();
            int _size = requirement.getInstances().size();
            int _minus = (_count - _size);
            int _abs = Math.abs(_minus);
            cost = (_cost + _abs);
            EList<ApplicationInstance> _instances = requirement.getInstances();
            for (final ApplicationInstance app : _instances) {
              ApplicationType _type = app.getType();
              ApplicationType _type_1 = requirement.getType();
              boolean _notEquals = (!Objects.equal(_type, _type_1));
              if (_notEquals) {
                cost++;
              }
            }
          }
        }
      }
      _xblockexpression = cost;
    }
    return _xblockexpression;
  }
}
