package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcSQRMAX {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  public static double getSQRMAXfromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Map<EObject, Set<EObject>> node2Neighbours = new HashMap<EObject, Set<EObject>>();
    Util.fillWithNodes(nodes, node2Neighbours);
    Util.getNeighboursList(nodes, node2Neighbours);
    double totalC = 0.0;
    double max2ndNeighbours = 0.0;
    double num1stNeighbours = 0.0;
    for (final EObject node : nodes) {
      {
        final Set<EObject> neighbours = CollectionsUtil.<EObject, Set<EObject>>lookup(node, node2Neighbours);
        num1stNeighbours = neighbours.size();
        max2ndNeighbours = 0;
        double numSquares = 0.0;
        for (final EObject neighbour1 : neighbours) {
          for (final EObject neighbour2 : neighbours) {
            boolean _notEquals = (!Objects.equal(neighbour1, neighbour2));
            if (_notEquals) {
              final Set<EObject> neighsOfNeigh = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour1, node2Neighbours);
              int _size = neighsOfNeigh.size();
              boolean _lessThan = (max2ndNeighbours < _size);
              if (_lessThan) {
                max2ndNeighbours = neighsOfNeigh.size();
              }
              for (final EObject neighOfNeigh1 : neighsOfNeigh) {
                if (((!Objects.equal(neighOfNeigh1, node)) && CollectionsUtil.<EObject, Set<EObject>>lookup(neighOfNeigh1, node2Neighbours).contains(neighbour2))) {
                  numSquares++;
                }
              }
            }
          }
        }
        final double num2ndNeighbours = (num1stNeighbours * max2ndNeighbours);
        double sqr = 0.0;
        if ((num2ndNeighbours != 0)) {
          sqr = (numSquares / num2ndNeighbours);
        }
        double _talC = totalC;
        totalC = (_talC + sqr);
      }
    }
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    final double avgC = (totalC / numNodes);
    return avgC;
  }
  
  public static double getSQRMAXfromNHLattice(final PartialInterpretation pm) {
    return 0.0;
  }
  
  public static double getSQRMAXfromNHLattice(final PartialInterpretation pm, final Integer depth) {
    return 0.0;
  }
}
