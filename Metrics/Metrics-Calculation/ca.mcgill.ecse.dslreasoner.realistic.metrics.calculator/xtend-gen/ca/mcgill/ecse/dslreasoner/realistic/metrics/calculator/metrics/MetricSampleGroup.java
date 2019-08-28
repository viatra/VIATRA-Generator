package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import java.util.HashMap;
import java.util.List;

@SuppressWarnings("all")
public class MetricSampleGroup {
  public List<Double> mpcSamples;
  
  public List<Double> naSamples;
  
  public List<Double> outDegreeSamples;
  
  public HashMap<String, List<Integer>> typedOutDegreeSamples;
  
  public HashMap<String, Double> nodeTypeSamples;
  
  public HashMap<String, Double> edgeTypeSamples;
}
