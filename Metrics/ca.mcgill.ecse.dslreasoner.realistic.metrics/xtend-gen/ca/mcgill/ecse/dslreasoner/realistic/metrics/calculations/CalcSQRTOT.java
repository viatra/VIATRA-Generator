package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation;
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
public class CalcSQRTOT {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  public static double getSQRTOTfromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Map<EObject, Set<EObject>> node2Neighbours = new HashMap<EObject, Set<EObject>>();
    Util.fillWithNodes(nodes, node2Neighbours);
    Util.getNeighboursList(nodes, node2Neighbours);
    double totalSQR = 0.0;
    double tot2ndNeighbours = 0.0;
    double num1stNeighbours = 0.0;
    for (final EObject node : nodes) {
      {
        final Set<EObject> neighbours = CollectionsUtil.<EObject, Set<EObject>>lookup(node, node2Neighbours);
        num1stNeighbours = neighbours.size();
        tot2ndNeighbours = 0;
        double numSquares = 0.0;
        for (final EObject neighbour1 : neighbours) {
          {
            final Set<EObject> neighsOfNeigh = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour1, node2Neighbours);
            double _t2ndNeighbours = tot2ndNeighbours;
            int _size = neighsOfNeigh.size();
            int _minus = (_size - 1);
            tot2ndNeighbours = (_t2ndNeighbours + _minus);
            for (final EObject neighbour2 : neighbours) {
              boolean _notEquals = (!Objects.equal(neighbour1, neighbour2));
              if (_notEquals) {
                for (final EObject neighOfNeigh1 : neighsOfNeigh) {
                  if (((!Objects.equal(neighOfNeigh1, node)) && CollectionsUtil.<EObject, Set<EObject>>lookup(neighOfNeigh1, node2Neighbours).contains(neighbour2))) {
                    numSquares++;
                  }
                }
              }
            }
          }
        }
        final double num2ndNeighbours = tot2ndNeighbours;
        double sqr = 0.0;
        if ((num2ndNeighbours != 0)) {
          sqr = (numSquares / num2ndNeighbours);
        }
        double _talSQR = totalSQR;
        totalSQR = (_talSQR + sqr);
      }
    }
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    final double avgC = (totalSQR / numNodes);
    return avgC;
  }
  
  public static double getSQRTOTfromNHLattice(final PartialInterpretation pm) {
    return 0.0;
  }
  
  public static double getSQRTOTfromNHLattice(final PartialInterpretation pm, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcSQRTOT.neighbourhoodComputer.createRepresentation(pm, ((depth).intValue() + 1), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhDeepRep = ((HashMap) _modelRepresentation);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation_1 = CalcSQRTOT.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE).getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation_1);
    final Set nhDeepNodes = nhDeepRep.keySet();
    final Set nhNodes = nhRep.keySet();
    final Map<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>> deep2shallowNeighbours = new HashMap<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>();
    for (final Object deepNode : nhDeepNodes) {
      HashMap<AbstractNodeDescriptor, Integer> _hashMap = new HashMap<AbstractNodeDescriptor, Integer>();
      deep2shallowNeighbours.put(((FurtherNodeDescriptor) deepNode), _hashMap);
    }
    for (final Object deepNode_1 : nhDeepNodes) {
      {
        final Map<AbstractNodeDescriptor, Integer> neighbours = new HashMap<AbstractNodeDescriptor, Integer>();
        final FurtherNodeDescriptor deepNodeDesc = ((FurtherNodeDescriptor) deepNode_1);
        Set _keySet = deepNodeDesc.getIncomingEdges().keySet();
        for (final Object inEdge : _keySet) {
          {
            final IncomingRelation edgeDesc = ((IncomingRelation) inEdge);
            Object _from = edgeDesc.getFrom();
            final AbstractNodeDescriptor edgeFromAND = ((AbstractNodeDescriptor) _from);
            Object _lookup = CollectionsUtil.<Object, Object>lookup(inEdge, deepNodeDesc.getIncomingEdges());
            Util.putInside(deepNodeDesc, edgeFromAND, (((Integer) _lookup)).intValue(), deep2shallowNeighbours);
          }
        }
        Set _keySet_1 = deepNodeDesc.getOutgoingEdges().keySet();
        for (final Object outEdge : _keySet_1) {
          {
            final OutgoingRelation edgeDesc = ((OutgoingRelation) outEdge);
            Object _to = edgeDesc.getTo();
            final AbstractNodeDescriptor edgeToAND = ((AbstractNodeDescriptor) _to);
            Object _lookup = CollectionsUtil.<Object, Object>lookup(outEdge, deepNodeDesc.getOutgoingEdges());
            Util.putInside(deepNodeDesc, edgeToAND, (((Integer) _lookup)).intValue(), deep2shallowNeighbours);
          }
        }
      }
    }
    double totalSQR = 0.0;
    double tot2ndNeighbours = 0.0;
    for (final Object deepNode_2 : nhDeepNodes) {
      {
        final FurtherNodeDescriptor deepNodeDesc = ((FurtherNodeDescriptor) deepNode_2);
        double numSquares = 0.0;
        boolean _isEmpty = Util.toLocalNode(deepNodeDesc).getTypes().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          final Set<AbstractNodeDescriptor> relevantNodes = CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(deepNodeDesc, deep2shallowNeighbours).keySet();
          for (final AbstractNodeDescriptor rel1 : relevantNodes) {
            for (final AbstractNodeDescriptor rel2 : relevantNodes) {
              boolean _notEquals = (!Objects.equal(rel1, rel2));
              if (_notEquals) {
                for (final Object pot2ndN : nhDeepNodes) {
                  boolean _notEquals_1 = (!Objects.equal(deepNode_2, pot2ndN));
                  if (_notEquals_1) {
                    final FurtherNodeDescriptor pot2ndNDesc = ((FurtherNodeDescriptor) pot2ndN);
                    final Set<AbstractNodeDescriptor> neighbours = CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(pot2ndNDesc, deep2shallowNeighbours).keySet();
                    boolean _contains = neighbours.contains(rel1);
                    if (_contains) {
                      double _t2ndNeighbours = tot2ndNeighbours;
                      Integer _lookup = CollectionsUtil.<AbstractNodeDescriptor, Integer>lookup(rel1, CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(pot2ndNDesc, deep2shallowNeighbours));
                      tot2ndNeighbours = (_t2ndNeighbours + (((Integer) _lookup)).intValue());
                    }
                    if ((neighbours.contains(rel1) && neighbours.contains(rel2))) {
                      double _numSquares = numSquares;
                      Integer _lookup_1 = CollectionsUtil.<AbstractNodeDescriptor, Integer>lookup(rel1, CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(pot2ndNDesc, deep2shallowNeighbours));
                      Integer _lookup_2 = CollectionsUtil.<AbstractNodeDescriptor, Integer>lookup(rel2, CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(pot2ndNDesc, deep2shallowNeighbours));
                      int _multiply = ((((Integer) _lookup_1)).intValue() * 
                        (((Integer) _lookup_2)).intValue());
                      numSquares = (_numSquares + _multiply);
                    }
                  }
                }
              }
            }
          }
        }
        double sqr = 0.0;
        if ((tot2ndNeighbours != 0)) {
          sqr = (numSquares / tot2ndNeighbours);
        }
        double _talSQR = totalSQR;
        totalSQR = (_talSQR + sqr);
      }
    }
    final int numDeepNodes = ((Object[])Conversions.unwrapArray(nhDeepNodes, Object.class)).length;
    double averageSQR = 0.0;
    if ((totalSQR != 0)) {
      averageSQR = (totalSQR / numDeepNodes);
    }
    return averageSQR;
  }
}
