package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcSQRCNT {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  public static double getSQRCNTfromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Map<EObject, Set<EObject>> node2Neighbours = new HashMap<EObject, Set<EObject>>();
    Util.fillWithNodes(nodes, node2Neighbours);
    Util.getNeighboursList(nodes, node2Neighbours);
    double totalSQR = 0.0;
    double numNeighbours = 0.0;
    for (final EObject node : nodes) {
      {
        final Set<EObject> neighbours = CollectionsUtil.<EObject, Set<EObject>>lookup(node, node2Neighbours);
        numNeighbours = neighbours.size();
        double numSquares = 0.0;
        for (final EObject neighbour1 : neighbours) {
          {
            final Set<EObject> neighsOfNeigh = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour1, node2Neighbours);
            for (final EObject neighbour2 : neighbours) {
              {
                boolean foundSquare = false;
                boolean _notEquals = (!Objects.equal(neighbour1, neighbour2));
                if (_notEquals) {
                  for (final EObject neighOfNeigh1 : neighsOfNeigh) {
                    if ((!foundSquare)) {
                      if (((!Objects.equal(neighOfNeigh1, node)) && 
                        CollectionsUtil.<EObject, Set<EObject>>lookup(neighOfNeigh1, node2Neighbours).contains(neighbour2))) {
                        numSquares++;
                        foundSquare = true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        double sqr = 0.0;
        if ((numSquares != 0)) {
          sqr = ((numSquares / numNeighbours) / (numNeighbours - 1));
        }
        double _talSQR = totalSQR;
        totalSQR = (_talSQR + sqr);
      }
    }
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    double avgSQR = 0.0;
    if ((totalSQR != 0)) {
      avgSQR = (totalSQR / numNodes);
    }
    return avgSQR;
  }
  
  public static double getSQRCNTfromNHLattice(final PartialInterpretation pm) {
    return 0.0;
  }
  
  public static double getSQRCNTfromNHLattice(final PartialInterpretation pm, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcSQRCNT.neighbourhoodComputer.createRepresentation(pm, ((depth).intValue() + 1), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhDeepRep = ((HashMap) _modelRepresentation);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation_1 = CalcSQRCNT.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE).getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation_1);
    final Set nhDeepNodes = nhDeepRep.keySet();
    final Set nhNodes = nhRep.keySet();
    final Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> deep2shallowNeighbours = new HashMap<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>>();
    Util.getNeighbourSet(nhDeepNodes, deep2shallowNeighbours);
    double totalSQR = 0.0;
    double totNumNodes = 0.0;
    double numNeighbours = 0.0;
    for (final Object deepNode : nhDeepNodes) {
      {
        final FurtherNodeDescriptor deepNodeDesc = ((FurtherNodeDescriptor) deepNode);
        boolean _isEmpty = Util.toLocalNode(deepNodeDesc).getTypes().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          final Set<AbstractNodeDescriptor> relevantNodes = CollectionsUtil.<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>>lookup(deepNodeDesc, deep2shallowNeighbours);
          numNeighbours = relevantNodes.size();
          double numSquares = 0.0;
          for (final AbstractNodeDescriptor rel1 : relevantNodes) {
            for (final AbstractNodeDescriptor rel2 : relevantNodes) {
              {
                boolean foundSquare = false;
                boolean _notEquals = (!Objects.equal(rel1, rel2));
                if (_notEquals) {
                  for (final Object pot2ndN : nhDeepNodes) {
                    if ((!foundSquare)) {
                      boolean _notEquals_1 = (!Objects.equal(deepNode, pot2ndN));
                      if (_notEquals_1) {
                        final FurtherNodeDescriptor pot2ndNDesc = ((FurtherNodeDescriptor) pot2ndN);
                        final Set<AbstractNodeDescriptor> neighbours = CollectionsUtil.<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>>lookup(pot2ndNDesc, deep2shallowNeighbours);
                        if ((neighbours.contains(rel1) && neighbours.contains(rel2))) {
                          numSquares++;
                          foundSquare = true;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          double sqr = 0.0;
          if ((numSquares != 0)) {
            sqr = ((numSquares / numNeighbours) / (numNeighbours - 1));
          }
          Object _lookup = CollectionsUtil.<Object, Object>lookup(deepNode, nhDeepRep);
          Integer numOcc = ((Integer) _lookup);
          double _sqr = sqr;
          sqr = (_sqr * (numOcc).intValue());
          double _tNumNodes = totNumNodes;
          totNumNodes = (_tNumNodes + (numOcc).intValue());
          double _talSQR = totalSQR;
          totalSQR = (_talSQR + sqr);
        }
      }
    }
    double avgSQR = 0.0;
    if ((totalSQR != 0)) {
      avgSQR = (totalSQR / totNumNodes);
    }
    return avgSQR;
  }
  
  public static void printMap(final Map<AbstractNodeDescriptor, Integer> nhDeepRep, final Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> map) {
    Set<FurtherNodeDescriptor> _keySet = map.keySet();
    for (final FurtherNodeDescriptor key : _keySet) {
      Integer _lookup = CollectionsUtil.<AbstractNodeDescriptor, Integer>lookup(key, nhDeepRep);
      String _plus = (_lookup + " ");
      String _plus_1 = (_plus + key);
      String _plus_2 = (_plus_1 + " -> ");
      Set<AbstractNodeDescriptor> _lookup_1 = CollectionsUtil.<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>>lookup(key, map);
      String _plus_3 = (_plus_2 + _lookup_1);
      InputOutput.<String>println(_plus_3);
    }
  }
}
