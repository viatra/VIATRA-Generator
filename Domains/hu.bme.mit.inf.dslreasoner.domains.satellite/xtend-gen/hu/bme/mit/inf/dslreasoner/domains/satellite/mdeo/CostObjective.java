package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo;

import hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo.MetricBasedGuidanceFunction;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CostMetric;

@SuppressWarnings("all")
public class CostObjective extends MetricBasedGuidanceFunction {
  public CostObjective() {
    super(CostMetric.instance());
  }
  
  @Override
  public String getName() {
    return "Cost";
  }
}
