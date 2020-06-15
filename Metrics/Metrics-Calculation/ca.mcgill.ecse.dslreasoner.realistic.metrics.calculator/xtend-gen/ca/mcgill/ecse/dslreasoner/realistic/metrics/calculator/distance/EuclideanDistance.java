package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.CostDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import com.google.common.collect.Sets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

@SuppressWarnings("all")
public class EuclideanDistance extends CostDistance {
  private MetricSampleGroup g;
  
  private HashMap<String, Double> mpcPMF;
  
  private HashMap<String, Double> naPMF;
  
  private HashMap<String, Double> outDegreePMF;
  
  private DecimalFormat formatter;
  
  public EuclideanDistance(final MetricSampleGroup g) {
    this.g = g;
    List<Double> mpcSamples = g.mpcSamples;
    final ToDoubleFunction<Double> _function = (Double it) -> {
      return (it).doubleValue();
    };
    double[] naSamples = g.naSamples.stream().mapToDouble(_function).toArray();
    final ToDoubleFunction<Double> _function_1 = (Double it) -> {
      return (it).doubleValue();
    };
    double[] outDegreeSamples = g.outDegreeSamples.stream().mapToDouble(_function_1).toArray();
    DecimalFormat _decimalFormat = new DecimalFormat("#0.00000");
    this.formatter = _decimalFormat;
    final List<Double> _converted_mpcSamples = (List<Double>)mpcSamples;
    this.mpcPMF = this.pmfFromSamples(((double[])Conversions.unwrapArray(_converted_mpcSamples, double.class)), this.formatter);
    this.naPMF = this.pmfFromSamples(naSamples, this.formatter);
    this.outDegreePMF = this.pmfFromSamples(outDegreeSamples, this.formatter);
  }
  
  @Override
  public double naDistance(final List<Double> samples) {
    HashMap<String, Double> pmfMap = this.pmfFromSamples(((double[])Conversions.unwrapArray(samples, double.class)), this.formatter);
    return this.euclideanDistance(pmfMap, this.naPMF);
  }
  
  @Override
  public double mpcDistance(final List<Double> samples) {
    HashMap<String, Double> pmfMap = this.pmfFromSamples(((double[])Conversions.unwrapArray(samples, double.class)), this.formatter);
    return this.euclideanDistance(pmfMap, this.mpcPMF);
  }
  
  @Override
  public double outDegreeDistance(final List<Double> samples) {
    HashMap<String, Double> pmfMap = this.pmfFromSamples(((double[])Conversions.unwrapArray(samples, double.class)), this.formatter);
    return this.euclideanDistance(pmfMap, this.outDegreePMF);
  }
  
  private double euclideanDistance(final HashMap<String, Double> pmf1, final HashMap<String, Double> pmf2) {
    Sets.SetView<String> keys = Sets.<String>union(pmf1.keySet(), pmf2.keySet());
    ArrayList<Double> pmfList1 = this.pmfMapToList(pmf1, keys);
    ArrayList<Double> pmfList2 = this.pmfMapToList(pmf2, keys);
    double distance = 0.0;
    for (int i = 0; (i < pmfList1.size()); i++) {
      double _distance = distance;
      Double _get = pmfList1.get(i);
      Double _get_1 = pmfList2.get(i);
      double _plus = DoubleExtensions.operator_plus(_get, _get_1);
      double _pow = Math.pow(_plus, 2);
      distance = (_distance + _pow);
    }
    return Math.sqrt(distance);
  }
  
  private ArrayList<Double> pmfMapToList(final Map<String, Double> map, final Set<String> keys) {
    ArrayList<Double> list = new ArrayList<Double>();
    for (final String key : keys) {
      {
        Double value = map.getOrDefault(key, Double.valueOf(0.0));
        list.add(value);
      }
    }
    return list;
  }
}
