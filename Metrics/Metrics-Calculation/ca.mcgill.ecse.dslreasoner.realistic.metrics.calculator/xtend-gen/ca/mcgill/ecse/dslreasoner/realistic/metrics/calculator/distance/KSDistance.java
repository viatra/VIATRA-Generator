package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.CostDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class KSDistance extends CostDistance {
  private static Object ksTester /* Skipped initializer because of errors */;
  
  private MetricSampleGroup g;
  
  public KSDistance(final MetricSampleGroup g) {
    this.g = g;
  }
  
  @Override
  public double mpcDistance(final List<Double> samples) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field KSDistance.ksTester refers to the missing type Object"
      + "\nkolmogorovSmirnovStatistic cannot be resolved");
  }
  
  @Override
  public double naDistance(final List<Double> samples) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field KSDistance.ksTester refers to the missing type Object"
      + "\nkolmogorovSmirnovStatistic cannot be resolved");
  }
  
  @Override
  public double outDegreeDistance(final List<Double> samples) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field KSDistance.ksTester refers to the missing type Object"
      + "\nkolmogorovSmirnovStatistic cannot be resolved");
  }
  
  public double typedOutDegreeDistance(final HashMap<String, List<Integer>> map) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field KSDistance.ksTester refers to the missing type Object"
      + "\nkolmogorovSmirnovStatistic cannot be resolved");
  }
  
  public double nodeTypeDistance(final HashMap<String, Double> samples) {
    HashMap<String, Double> typesDistMap = this.g.nodeTypeSamples;
    ArrayList<Double> sourceDist = CollectionLiterals.<Double>newArrayList();
    ArrayList<Double> instanceDist = CollectionLiterals.<Double>newArrayList();
    Set<String> _keySet = typesDistMap.keySet();
    for (final String key : _keySet) {
      {
        sourceDist.add(typesDistMap.get(key));
        instanceDist.add(samples.getOrDefault(key, Double.valueOf(0.0)));
      }
    }
    return this.ks_distance_two_dist(sourceDist, instanceDist);
  }
  
  public double edgeTypeDistance(final HashMap<String, Double> samples) {
    HashMap<String, Double> typesDistMap = this.g.edgeTypeSamples;
    ArrayList<Double> sourceDist = CollectionLiterals.<Double>newArrayList();
    ArrayList<Double> instanceDist = CollectionLiterals.<Double>newArrayList();
    Set<String> _keySet = typesDistMap.keySet();
    for (final String key : _keySet) {
      {
        sourceDist.add(typesDistMap.get(key));
        instanceDist.add(samples.getOrDefault(key, Double.valueOf(0.0)));
      }
    }
    return this.ks_distance_two_dist(sourceDist, instanceDist);
  }
  
  public double ks_distance_two_dist(final List<Double> dist1, final List<Double> dist2) {
    double ksStatistics = 0.0;
    double sum1 = 0.0;
    double sum2 = 0.0;
    for (int i = 0; (i < dist1.size()); i++) {
      {
        double _sum1 = sum1;
        Double _get = dist1.get(i);
        sum1 = (_sum1 + (_get).doubleValue());
        double _sum2 = sum2;
        Double _get_1 = dist2.get(i);
        sum2 = (_sum2 + (_get_1).doubleValue());
        ksStatistics = Math.max(ksStatistics, Math.abs((sum1 - sum2)));
      }
    }
    return ksStatistics;
  }
}
