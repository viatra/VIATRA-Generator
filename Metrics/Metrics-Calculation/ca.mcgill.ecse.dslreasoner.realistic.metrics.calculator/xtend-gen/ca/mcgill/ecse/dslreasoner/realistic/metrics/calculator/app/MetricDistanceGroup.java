package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app;

import java.util.HashMap;

@SuppressWarnings("all")
public class MetricDistanceGroup {
  private double mpcDistance;
  
  private double naDistance;
  
  private double outDegreeDistance;
  
  private double nodeTypeDistance;
  
  protected HashMap<String, Double> nodeTypeInfo;
  
  public MetricDistanceGroup(final double mpcDistance, final double naDistance, final double outDegreeDistance, final double nodeTypeDistance) {
    this.mpcDistance = mpcDistance;
    this.naDistance = naDistance;
    this.outDegreeDistance = outDegreeDistance;
    this.nodeTypeDistance = nodeTypeDistance;
  }
  
  public MetricDistanceGroup(final double mpcDistance, final double naDistance, final double outDegreeDistance) {
    this.mpcDistance = mpcDistance;
    this.naDistance = naDistance;
    this.outDegreeDistance = outDegreeDistance;
  }
  
  public double getNodeTypeDistance() {
    return this.nodeTypeDistance;
  }
  
  public double getMPCDistance() {
    return this.mpcDistance;
  }
  
  public double getNADistance() {
    return this.naDistance;
  }
  
  public double getOutDegreeDistance() {
    return this.outDegreeDistance;
  }
  
  public double getNodeTypePercentage(final String typeName) {
    return (this.nodeTypeInfo.getOrDefault(typeName, Double.valueOf(0.0))).doubleValue();
  }
}
