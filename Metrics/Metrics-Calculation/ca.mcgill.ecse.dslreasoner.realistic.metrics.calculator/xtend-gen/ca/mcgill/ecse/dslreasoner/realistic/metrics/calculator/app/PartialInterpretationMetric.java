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
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

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
  
  public static void outputTrajectories(final PartialInterpretation empty, final List<Solution> solutions) {
    for (final Solution solution : solutions) {
      {
        final PartialInterpretation emptySolutionCopy = EcoreUtil.<PartialInterpretation>copy(empty);
        final SolutionTrajectory trajectory = solution.getShortestTrajectory();
        trajectory.setModel(emptySolutionCopy);
        final ArrayList<String> stateCodes = CollectionLiterals.<String>newArrayList();
        int counter = 0;
        while (trajectory.doNextTransformation()) {
          {
            final String stateId = trajectory.getStateCoder().createStateCode().toString();
            final Notifier interpretation = trajectory.getModel();
            InputOutput.<String>println(stateId);
            PartialInterpretationMetric.calculateMetric(((PartialInterpretation) interpretation), "debug/metric/output", stateId, Integer.valueOf(counter));
            stateCodes.add(stateId);
            counter++;
          }
        }
        try {
          new File("debug/metric/trajectories/").mkdir();
          String _string = trajectory.getStateCoder().createStateCode().toString();
          String _plus = ("debug/metric/trajectories/trajectory" + _string);
          final String path = (_plus + ".csv");
          File _file = new File(path);
          final PrintWriter writer = new PrintWriter(_file);
          final StringBuilder output = new StringBuilder();
          for (final String stateCode : stateCodes) {
            output.append((stateCode + "\n"));
          }
          writer.write(output.toString());
          writer.close();
        } catch (final Throwable _t) {
          if (_t instanceof FileNotFoundException) {
            final FileNotFoundException e = (FileNotFoundException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
}
