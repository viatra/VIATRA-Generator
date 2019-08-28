package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import com.google.common.base.Objects;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TypedClusteringCoefficientMetric extends Metric {
  public final static String countName = "TCCCount";
  
  public final static String valueName = "TCCValue";
  
  private final DecimalFormat formatter = new DecimalFormat("#0.00000");
  
  @Override
  public String[][] evaluate(final GraphStatistic g) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The method newArrayOfSize(int) is not applicable for the arguments (int,int)");
  }
  
  @Override
  public Object evaluateSamples(final GraphStatistic g) {
    final ArrayList<Double> samples = new ArrayList<Double>();
    final Consumer<EObject> _function = (EObject it) -> {
      samples.add(Double.valueOf(this.calculateTCC1(it, g)));
    };
    g.getAllNodes().forEach(_function);
    return samples;
  }
  
  /**
   * Compute TCC1 metric for node n
   */
  public double calculateTCC1(final EObject n, final GraphStatistic g) {
    int wedges = 0;
    int triangles = 0;
    List<String> _allTypes = g.getAllTypes();
    for (final String type1 : _allTypes) {
      {
        Collection<EObject> _get = g.getOutgoingEdges().get(type1).get(n);
        final HashSet<EObject> typed1RelatedOfN = new HashSet<EObject>(_get);
        Collection<EObject> _get_1 = g.incomingEdges().get(type1).get(n);
        final HashSet<EObject> type1EdgeSourceNodesOfN = new HashSet<EObject>(_get_1);
        typed1RelatedOfN.addAll(type1EdgeSourceNodesOfN);
        final int d = typed1RelatedOfN.size();
        int _wedges = wedges;
        wedges = (_wedges + (d * (d - 1)));
        for (final EObject n1 : typed1RelatedOfN) {
          for (final EObject n2 : typed1RelatedOfN) {
            List<String> _allTypes_1 = g.getAllTypes();
            for (final String type2 : _allTypes_1) {
              if (((!Objects.equal(type1, type2)) && (g.getOutgoingEdges().get(type2).containsEntry(n1, n2) || 
                g.getOutgoingEdges().get(type2).containsEntry(n2, n1)))) {
                triangles++;
              }
            }
          }
        }
      }
    }
    if ((wedges == 0.0)) {
      return 0.0;
    } else {
      return (((double) triangles) / wedges);
    }
  }
}
