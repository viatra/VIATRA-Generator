package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("all")
public abstract class CostDistance {
  public abstract double naDistance(final List<Double> samples);
  
  public abstract double mpcDistance(final List<Double> samples);
  
  public abstract double outDegreeDistance(final List<Double> samples);
  
  protected HashMap<String, Double> pmfFromSamples(final double[] samples, final DecimalFormat formatter) {
    int length = samples.length;
    HashMap<String, Double> pmfMap = new HashMap<String, Double>();
    for (final double sample : samples) {
      String _format = formatter.format(sample);
      Double _orDefault = pmfMap.getOrDefault(formatter.format(sample), Double.valueOf(0.0));
      double _plus = ((_orDefault).doubleValue() + (1.0 / length));
      pmfMap.put(_format, Double.valueOf(_plus));
    }
    return pmfMap;
  }
}
