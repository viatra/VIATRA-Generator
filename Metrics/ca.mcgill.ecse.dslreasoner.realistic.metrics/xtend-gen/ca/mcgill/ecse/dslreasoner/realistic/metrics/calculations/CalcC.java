package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import com.google.common.base.Objects;
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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcC {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  public static double getCfromModel(final EObject model) {
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
    double totalC = 0.0;
    for (final EObject node_2 : nodes) {
      {
        final Set<EObject> neighbours = CollectionsUtil.<EObject, Set<EObject>>lookup(node_2, node2Neighbours);
        final int numNeighbours = ((Object[])Conversions.unwrapArray(neighbours, Object.class)).length;
        double numTriangles = 0.0;
        for (final EObject neighbour1 : neighbours) {
          for (final EObject neighbour2 : neighbours) {
            boolean _notEquals = (!Objects.equal(neighbour1, neighbour2));
            if (_notEquals) {
              boolean _contains = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour1, node2Neighbours).contains(neighbour2);
              if (_contains) {
                numTriangles++;
              }
            }
          }
        }
        double c = 0.0;
        if ((numTriangles > 0)) {
          c = ((numTriangles / numNeighbours) / (numNeighbours - 1));
        }
        double _talC = totalC;
        totalC = (_talC + c);
      }
    }
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    double avgC = 0.0;
    if ((totalC != 0)) {
      avgC = (totalC / numNodes);
    }
    return avgC;
  }
  
  public static double getCfromNHLattice(final PartialInterpretation pm, final Integer v) {
    return 0.0;
  }
  
  public static double getCfromNHLattice(final PartialInterpretation pm, final Integer depth, final Integer v) {
    return 1.0;
  }
}
