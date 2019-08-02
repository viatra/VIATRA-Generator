package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.EdgeTypeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeTypeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.TypedOutDegree;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public abstract class Graph {
  protected final static String META_MODEL_HEADER = "Meta Mode";
  
  protected final static String NUM_NODE_HEADER = "Number Of Nodes";
  
  protected final static String NUM_EDGE_TYPE_HEADER = "Number of Edge types";
  
  protected final static String STATE_ID_HEADER = "State Id";
  
  protected final GraphStatistic statistic = new GraphStatistic();
  
  protected List<Metric> metrics;
  
  protected String name = "";
  
  protected String metaModel = "";
  
  /**
   * evaluate all metrics for this model
   * return the result as a two dimentional list
   */
  public ArrayList<ArrayList<String>> evaluateAllMetrics() {
    final ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
    this.setBasicInformation(result);
    for (final Metric metric : this.metrics) {
      {
        final String[][] datas = metric.evaluate(this.statistic);
        for (final String[] row : datas) {
          ArrayList<String> _arrayList = new ArrayList<String>((Collection<? extends String>)Conversions.doWrapArray(row));
          result.add(_arrayList);
        }
      }
    }
    return result;
  }
  
  public MetricSampleGroup evaluateAllMetricsToSamples() {
    MetricSampleGroup sample = new MetricSampleGroup();
    for (final Metric metric : this.metrics) {
      if ((metric instanceof MultiplexParticipationCoefficientMetric)) {
        Object _evaluateSamples = ((MultiplexParticipationCoefficientMetric)metric).evaluateSamples(this.statistic);
        sample.mpcSamples = ((ArrayList<Double>) _evaluateSamples);
      } else {
        if ((metric instanceof NodeActivityMetric)) {
          Object _evaluateSamples_1 = ((NodeActivityMetric)metric).evaluateSamples(this.statistic);
          sample.naSamples = ((ArrayList<Double>) _evaluateSamples_1);
        } else {
          if ((metric instanceof OutDegreeMetric)) {
            Object _evaluateSamples_2 = ((OutDegreeMetric)metric).evaluateSamples(this.statistic);
            sample.outDegreeSamples = ((ArrayList<Double>) _evaluateSamples_2);
          } else {
            if ((metric instanceof TypedOutDegree)) {
              Object _evaluateSamples_3 = ((TypedOutDegree)metric).evaluateSamples(this.statistic);
              sample.typedOutDegreeSamples = ((HashMap<String, List<Integer>>) _evaluateSamples_3);
            } else {
              if ((metric instanceof NodeTypeMetric)) {
                Object _evaluateSamples_4 = ((NodeTypeMetric)metric).evaluateSamples(this.statistic);
                sample.nodeTypeSamples = ((HashMap<String, Double>) _evaluateSamples_4);
              } else {
                if ((metric instanceof EdgeTypeMetric)) {
                  Object _evaluateSamples_5 = ((EdgeTypeMetric)metric).evaluateSamples(this.statistic);
                  sample.edgeTypeSamples = ((HashMap<String, Double>) _evaluateSamples_5);
                }
              }
            }
          }
        }
      }
    }
    return sample;
  }
  
  public abstract void setBasicInformation(final ArrayList<ArrayList<String>> result);
  
  public abstract GraphStatistic getStatistic();
  
  public abstract String getName();
}
