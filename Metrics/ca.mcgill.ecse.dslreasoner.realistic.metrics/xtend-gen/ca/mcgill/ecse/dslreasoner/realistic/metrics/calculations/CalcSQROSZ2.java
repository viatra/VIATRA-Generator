package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcSQROSZ2 {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  public static double getSQROSZ2fromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Map<EObject, Set<EObject>> node2Neighbours = new HashMap<EObject, Set<EObject>>();
    Util.fillWithNodes(nodes, node2Neighbours);
    Util.getNeighboursList(nodes, node2Neighbours);
    double totalSQR = 0.0;
    double totalDenom = 0.0;
    double num4thNeighbours = 0.0;
    for (final EObject node : nodes) {
      {
        final Set<EObject> neighbours = CollectionsUtil.<EObject, Set<EObject>>lookup(node, node2Neighbours);
        for (final EObject neighbour1 : neighbours) {
          {
            final Set<EObject> neighbours1 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour1, node2Neighbours);
            for (final EObject neighbour2 : neighbours1) {
              {
                final Set<EObject> neighbours2 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour2, node2Neighbours);
                for (final EObject neighbour3 : neighbours2) {
                  {
                    final Set<EObject> neighbours3 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour3, node2Neighbours);
                    num4thNeighbours = neighbours3.size();
                    boolean _contains = neighbours3.contains(node);
                    if (_contains) {
                      double _talSQR = totalSQR;
                      totalSQR = (_talSQR + 1);
                    }
                    double _talDenom = totalDenom;
                    totalDenom = (_talDenom + num4thNeighbours);
                  }
                }
              }
            }
          }
        }
      }
    }
    final double avgSQR = (totalSQR / totalDenom);
    return avgSQR;
  }
  
  public static double getSQROSZ2fromNHLattice(final PartialInterpretation pm) {
    return 0.0;
  }
  
  public static double getSQROSZ2fromNHLattice(final PartialInterpretation pm, final Integer depth) {
    return 0.0;
  }
}
