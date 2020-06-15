package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class NodeActivityMetric extends Metric {
  public final static String countName = "NACount";
  
  public final static String valueName = "NAValue";
  
  @Override
  public String[][] evaluate(final GraphStatistic g) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method newArrayOfSize(int) is not applicable for the arguments (int,int)");
  }
  
  @Override
  public Object evaluateSamples(final GraphStatistic g) {
    final ArrayList<Double> samples = new ArrayList<Double>();
    final Consumer<EObject> _function = (EObject it) -> {
      int _numOfEdgeTypes = g.numOfEdgeTypes(it);
      samples.add(Double.valueOf(((double) _numOfEdgeTypes)));
    };
    g.getAllNodes().forEach(_function);
    return samples;
  }
}
