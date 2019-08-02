package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class MultiplexParticipationCoefficientMetric extends Metric {
  public final static String countName = "MPCCount";
  
  public final static String valueName = "MPCValue";
  
  @Override
  public String[][] evaluate(final GraphStatistic g) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method newArrayOfSize(int) is not applicable for the arguments (int,int)");
  }
  
  @Override
  public Object evaluateSamples(final GraphStatistic g) {
    final ArrayList<Double> samples = new ArrayList<Double>();
    final int typeCounts = g.getAllTypes().size();
    final Consumer<EObject> _function = (EObject it) -> {
      samples.add(Double.valueOf(this.calculateMPC(it, g, typeCounts)));
    };
    g.getAllNodes().forEach(_function);
    return samples;
  }
  
  public double calculateMPC(final EObject n, final GraphStatistic g, final int typeCounts) {
    int _outDegree = g.outDegree(n);
    int _inDegree = g.inDegree(n);
    final int edgeCounts = (_outDegree + _inDegree);
    double coef = 0.0;
    List<String> _allTypes = g.getAllTypes();
    for (final String type : _allTypes) {
      {
        int _dimentionalDegree = g.dimentionalDegree(n, type);
        final double degree = ((double) _dimentionalDegree);
        double _coef = coef;
        double _pow = Math.pow((degree / edgeCounts), 2);
        coef = (_coef + _pow);
      }
    }
    coef = (1 - coef);
    coef = ((coef * typeCounts) / (typeCounts - 1));
    boolean _isNaN = Double.isNaN(coef);
    if (_isNaN) {
      coef = 0;
    }
    return coef;
  }
}
