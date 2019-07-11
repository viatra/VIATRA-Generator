package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcSQROSZ {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  public static double getSQROSZfromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Map<EObject, Set<EObject>> node2Neighbours = new HashMap<EObject, Set<EObject>>();
    for (final EObject node : nodes) {
      HashSet<EObject> _hashSet = new HashSet<EObject>();
      node2Neighbours.put(node, _hashSet);
    }
    for (final EObject node_1 : nodes) {
      EList<EReference> _eAllReferences = node_1.eClass().getEAllReferences();
      for (final EReference reference : _eAllReferences) {
        {
          final Object pointingTo = node_1.eGet(reference);
          if ((!(pointingTo instanceof List))) {
            if ((pointingTo != null)) {
              CollectionsUtil.<EObject, Set<EObject>>lookup(node_1, node2Neighbours).add(((EObject) pointingTo));
              CollectionsUtil.<EObject, Set<EObject>>lookup(((EObject) pointingTo), node2Neighbours).add(node_1);
            }
          } else {
            final List pointingToSet = ((List) pointingTo);
            boolean _isEmpty = pointingToSet.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              for (final Object target : pointingToSet) {
                {
                  CollectionsUtil.<EObject, Set<EObject>>lookup(node_1, node2Neighbours).add(((EObject) target));
                  CollectionsUtil.<EObject, Set<EObject>>lookup(((EObject) target), node2Neighbours).add(node_1);
                }
              }
            }
          }
        }
      }
    }
    double totalSQR = 0.0;
    double totalDenom = 0.0;
    double num1stNeighbours = 0.0;
    double num2ndNeighbours = 0.0;
    double num3rdNeighbours = 0.0;
    double num4thNeighbours = 0.0;
    for (final EObject node_2 : nodes) {
      {
        final Set<EObject> neighbours = CollectionsUtil.<EObject, Set<EObject>>lookup(node_2, node2Neighbours);
        num1stNeighbours = neighbours.size();
        for (final EObject neighbour1 : neighbours) {
          {
            final Set<EObject> neighbours1 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour1, node2Neighbours);
            num2ndNeighbours = neighbours1.size();
            for (final EObject neighbour2 : neighbours1) {
              {
                final Set<EObject> neighbours2 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour2, node2Neighbours);
                num3rdNeighbours = neighbours2.size();
                for (final EObject neighbour3 : neighbours2) {
                  {
                    final Set<EObject> neighbours3 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour3, node2Neighbours);
                    num4thNeighbours = neighbours3.size();
                    boolean _contains = neighbours3.contains(node_2);
                    if (_contains) {
                      double _talSQR = totalSQR;
                      totalSQR = (_talSQR + 1);
                    }
                    double _talDenom = totalDenom;
                    totalDenom = (_talDenom + (((num1stNeighbours * num2ndNeighbours) * num3rdNeighbours) * num4thNeighbours));
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
  
  public static double getSQROSZfromNHLattice(final PartialInterpretation pm) {
    return 0.0;
  }
  
  public static double getSQROSZfromNHLattice(final PartialInterpretation pm, final Integer depth) {
    return 0.0;
  }
}
