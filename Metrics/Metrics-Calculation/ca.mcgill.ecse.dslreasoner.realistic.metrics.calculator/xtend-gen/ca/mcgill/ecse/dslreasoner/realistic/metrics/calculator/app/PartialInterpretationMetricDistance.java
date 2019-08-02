package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.MetricDistanceGroup;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.EuclideanDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.JSDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.KSDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.StateData;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.PartialInterpretationGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeTypeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.predictor.LinearModel;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class PartialInterpretationMetricDistance {
  private KSDistance ks;
  
  private JSDistance js;
  
  private EuclideanDistance ed;
  
  private Map<Object, StateData> stateAndHistory;
  
  private /* OLSMultipleLinearRegression */Object regression;
  
  private List<StateData> samples;
  
  private MetricSampleGroup g;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private LinearModel linearModel;
  
  public PartialInterpretationMetricDistance() {
    throw new Error("Unresolved compilation problems:"
      + "\nOLSMultipleLinearRegression cannot be resolved."
      + "\nThe field PartialInterpretationMetricDistance.regression refers to the missing type OLSMultipleLinearRegression"
      + "\nThe field PartialInterpretationMetricDistance.regression refers to the missing type OLSMultipleLinearRegression"
      + "\nnoIntercept cannot be resolved");
  }
  
  public MetricDistanceGroup calculateMetricDistanceKS(final PartialInterpretation partial) {
    final ArrayList<Metric> metrics = new ArrayList<Metric>();
    OutDegreeMetric _outDegreeMetric = new OutDegreeMetric();
    metrics.add(_outDegreeMetric);
    NodeActivityMetric _nodeActivityMetric = new NodeActivityMetric();
    metrics.add(_nodeActivityMetric);
    MultiplexParticipationCoefficientMetric _multiplexParticipationCoefficientMetric = new MultiplexParticipationCoefficientMetric();
    metrics.add(_multiplexParticipationCoefficientMetric);
    NodeTypeMetric _nodeTypeMetric = new NodeTypeMetric();
    metrics.add(_nodeTypeMetric);
    final PartialInterpretationGraph metricCalculator = new PartialInterpretationGraph(partial, metrics, null);
    MetricSampleGroup metricSamples = metricCalculator.evaluateAllMetricsToSamples();
    double mpc = this.ks.mpcDistance(metricSamples.mpcSamples);
    double na = this.ks.naDistance(metricSamples.naSamples);
    double outDegree = this.ks.outDegreeDistance(metricSamples.outDegreeSamples);
    double nodeType = this.ks.nodeTypeDistance(metricSamples.nodeTypeSamples);
    MetricDistanceGroup distance = new MetricDistanceGroup(mpc, na, outDegree, nodeType);
    distance.nodeTypeInfo = metricSamples.nodeTypeSamples;
    return distance;
  }
  
  public MetricDistanceGroup calculateMetricEuclidean(final PartialInterpretation partial) {
    final ArrayList<Metric> metrics = new ArrayList<Metric>();
    OutDegreeMetric _outDegreeMetric = new OutDegreeMetric();
    metrics.add(_outDegreeMetric);
    NodeActivityMetric _nodeActivityMetric = new NodeActivityMetric();
    metrics.add(_nodeActivityMetric);
    MultiplexParticipationCoefficientMetric _multiplexParticipationCoefficientMetric = new MultiplexParticipationCoefficientMetric();
    metrics.add(_multiplexParticipationCoefficientMetric);
    final PartialInterpretationGraph metricCalculator = new PartialInterpretationGraph(partial, metrics, null);
    MetricSampleGroup metricSamples = metricCalculator.evaluateAllMetricsToSamples();
    double mpc = this.ed.mpcDistance(metricSamples.mpcSamples);
    double na = this.ed.naDistance(metricSamples.naSamples);
    double outDegree = this.ed.outDegreeDistance(metricSamples.outDegreeSamples);
    return new MetricDistanceGroup(mpc, na, outDegree);
  }
  
  public MetricDistanceGroup calculateMetricDistance(final PartialInterpretation partial) {
    final ArrayList<Metric> metrics = new ArrayList<Metric>();
    OutDegreeMetric _outDegreeMetric = new OutDegreeMetric();
    metrics.add(_outDegreeMetric);
    NodeActivityMetric _nodeActivityMetric = new NodeActivityMetric();
    metrics.add(_nodeActivityMetric);
    MultiplexParticipationCoefficientMetric _multiplexParticipationCoefficientMetric = new MultiplexParticipationCoefficientMetric();
    metrics.add(_multiplexParticipationCoefficientMetric);
    final PartialInterpretationGraph metricCalculator = new PartialInterpretationGraph(partial, metrics, null);
    MetricSampleGroup metricSamples = metricCalculator.evaluateAllMetricsToSamples();
    double mpc = this.js.mpcDistance(metricSamples.mpcSamples);
    double na = this.js.naDistance(metricSamples.naSamples);
    double outDegree = this.js.outDegreeDistance(metricSamples.outDegreeSamples);
    return new MetricDistanceGroup(mpc, na, outDegree);
  }
  
  public String resetRegression(final Object state) {
    String _xblockexpression = null;
    {
      this.samples.clear();
      boolean _containsKey = this.stateAndHistory.containsKey(state);
      if (_containsKey) {
        StateData data = this.stateAndHistory.get(state);
        Object curState = state;
        this.samples.add(data);
        while ((this.stateAndHistory.containsKey(data.getLastState()) && (!Objects.equal(data.getLastState(), curState)))) {
          {
            curState = data.getLastState();
            data = this.stateAndHistory.get(data.getLastState());
            this.samples.add(data);
          }
        }
        int _size = this.samples.size();
        boolean _equals = (_size == 0);
        if (_equals) {
          InputOutput.<String>println(("state: " + state));
          Object _lastState = data.getLastState();
          String _plus = ("last state: " + _lastState);
          InputOutput.<String>println(_plus);
        }
      }
      int _size_1 = this.samples.size();
      String _plus_1 = ("trajectory sample size:" + Integer.valueOf(_size_1));
      _xblockexpression = InputOutput.<String>println(_plus_1);
    }
    return _xblockexpression;
  }
  
  public boolean feedData(final Object state, final double[] features, final double value, final Object lastState) {
    boolean _xblockexpression = false;
    {
      StateData data = new StateData(features, value, lastState);
      this.stateAndHistory.put(state, data);
      _xblockexpression = this.samples.add(data);
    }
    return _xblockexpression;
  }
  
  public Object getPredictionForNextDataSample(final double[] features, final double value, final double[] featuresToPredict) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field PartialInterpretationMetricDistance.regression refers to the missing type OLSMultipleLinearRegression"
      + "\nThe method predict(double[]) from the type PartialInterpretationMetricDistance refers to the missing type Object"
      + "\nnewSampleData cannot be resolved");
  }
  
  private Object predict(final double[] featuresToPredict) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe field PartialInterpretationMetricDistance.regression refers to the missing type OLSMultipleLinearRegression"
      + "\nestimateRegressionParameters cannot be resolved"
      + "\nget cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nget cannot be resolved"
      + "\n* cannot be resolved");
  }
  
  public double[] calculateFeature(final int step, final int violations) {
    double[] features = new double[2];
    features[0] = 1;
    double _sqrt = Math.sqrt(step);
    double _plus = (_sqrt + 30);
    features[0] = _plus;
    features[1] = (1.0 / (step + 30));
    return features;
  }
  
  @Pure
  public LinearModel getLinearModel() {
    return this.linearModel;
  }
}
