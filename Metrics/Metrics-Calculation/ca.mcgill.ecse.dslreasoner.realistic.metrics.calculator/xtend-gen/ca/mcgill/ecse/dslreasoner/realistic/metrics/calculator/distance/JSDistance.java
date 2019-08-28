package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.CostDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import com.google.common.collect.Sets;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

@SuppressWarnings("all")
public class JSDistance extends CostDistance {
  private HashMap<String, Double> mpcPMF;
  
  private HashMap<String, Double> naPMF;
  
  private HashMap<String, Double> outDegreePMF;
  
  private HashMap<String, Double> nodeTypesPMF;
  
  private DecimalFormat formatter;
  
  public JSDistance(final MetricSampleGroup g) {
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
    this.nodeTypesPMF = g.nodeTypeSamples;
  }
  
  private HashMap<String, Double> combinePMF(final HashMap<String, Double> pmf1, final HashMap<String, Double> pmf2) {
    HashMap<String, Double> pmfMap = new HashMap<String, Double>();
    Sets.SetView<String> union = Sets.<String>union(pmf1.keySet(), pmf2.keySet());
    for (final String key : union) {
      {
        Double _orDefault = pmf1.getOrDefault(key, Double.valueOf(0.0));
        Double _orDefault_1 = pmf2.getOrDefault(key, Double.valueOf(0.0));
        double _plus = DoubleExtensions.operator_plus(_orDefault, _orDefault_1);
        double value = ((1.0 / 2) * _plus);
        pmfMap.put(key, Double.valueOf(value));
      }
    }
    return pmfMap;
  }
  
  private double jsDivergence(final HashMap<String, Double> p, final HashMap<String, Double> q) {
    final HashMap<String, Double> m = this.combinePMF(q, p);
    double _klDivergence = this.klDivergence(p, m);
    double _multiply = ((1.0 / 2) * _klDivergence);
    double _klDivergence_1 = this.klDivergence(q, m);
    double _multiply_1 = ((1.0 / 2) * _klDivergence_1);
    double distance = (_multiply + _multiply_1);
    return distance;
  }
  
  public double klDivergence(final HashMap<String, Double> p, final HashMap<String, Double> q) {
    double distance = 0.0;
    Set<String> _keySet = q.keySet();
    for (final String key : _keySet) {
      boolean _containsKey = p.containsKey(key);
      if (_containsKey) {
        double _distance = distance;
        Double _get = p.get(key);
        Double _get_1 = q.get(key);
        Double _get_2 = p.get(key);
        double _divide = DoubleExtensions.operator_divide(_get_1, _get_2);
        double _log = Math.log(_divide);
        double _multiply = ((_get).doubleValue() * _log);
        double _log_1 = Math.log(2);
        double _divide_1 = (_multiply / _log_1);
        distance = (_distance - _divide_1);
      }
    }
    return distance;
  }
  
  @Override
  public double mpcDistance(final List<Double> samples) {
    final ToDoubleFunction<Double> _function = (Double it) -> {
      return (it).doubleValue();
    };
    HashMap<String, Double> map = this.pmfFromSamples(samples.stream().mapToDouble(_function).toArray(), this.formatter);
    int _size = map.size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      return 1;
    }
    return this.jsDivergence(map, this.mpcPMF);
  }
  
  @Override
  public double naDistance(final List<Double> samples) {
    final ToDoubleFunction<Double> _function = (Double it) -> {
      return (it).doubleValue();
    };
    HashMap<String, Double> map = this.pmfFromSamples(samples.stream().mapToDouble(_function).toArray(), this.formatter);
    int _size = map.size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      return 1;
    }
    return this.jsDivergence(map, this.naPMF);
  }
  
  @Override
  public double outDegreeDistance(final List<Double> samples) {
    final ToDoubleFunction<Double> _function = (Double it) -> {
      return (it).doubleValue();
    };
    HashMap<String, Double> map = this.pmfFromSamples(samples.stream().mapToDouble(_function).toArray(), this.formatter);
    int _size = map.size();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      return 1;
    }
    return this.jsDivergence(map, this.outDegreePMF);
  }
  
  public double nodeTypeDistance(final HashMap<String, Double> samples) {
    return this.klDivergence(samples, this.nodeTypesPMF);
  }
}
