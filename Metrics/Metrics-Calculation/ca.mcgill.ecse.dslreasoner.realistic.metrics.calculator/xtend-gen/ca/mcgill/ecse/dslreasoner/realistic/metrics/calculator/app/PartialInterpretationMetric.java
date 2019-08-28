package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.JSDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.KSDistance;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.PartialInterpretationGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.CsvFileWriter;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class PartialInterpretationMetric {
  private static KSDistance ks;
  
  private static JSDistance js;
  
  public static void initPaths() {
    new File("debug/metric/").mkdir();
    new File("debug/metric/trajectories/").mkdir();
  }
  
  public static void calculateMetric(final PartialInterpretation partial, final String path, final String currentStateId, final Integer counter) {
    final ArrayList<Metric> metrics = new ArrayList<Metric>();
    OutDegreeMetric _outDegreeMetric = new OutDegreeMetric();
    metrics.add(_outDegreeMetric);
    NodeActivityMetric _nodeActivityMetric = new NodeActivityMetric();
    metrics.add(_nodeActivityMetric);
    MultiplexParticipationCoefficientMetric _multiplexParticipationCoefficientMetric = new MultiplexParticipationCoefficientMetric();
    metrics.add(_multiplexParticipationCoefficientMetric);
    new File(path).mkdir();
    final String filename = (((((path + "/state_") + currentStateId) + "-") + counter) + ".csv");
    final PartialInterpretationGraph metricCalculator = new PartialInterpretationGraph(partial, metrics, currentStateId);
    CsvFileWriter.write(metricCalculator.evaluateAllMetrics(), filename);
  }
  
  public static void outputTrajectories(final PartialInterpretation empty, final /* List<Solution> */Object solutions) {
    throw new Error("Unresolved compilation problems:"
      + "\nshortestTrajectory cannot be resolved"
      + "\nmodel cannot be resolved"
      + "\ndoNextTransformation cannot be resolved"
      + "\nstateCoder cannot be resolved"
      + "\ncreateStateCode cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\ngetModel cannot be resolved"
      + "\nstateCoder cannot be resolved"
      + "\ncreateStateCode cannot be resolved"
      + "\ntoString cannot be resolved");
  }
}
