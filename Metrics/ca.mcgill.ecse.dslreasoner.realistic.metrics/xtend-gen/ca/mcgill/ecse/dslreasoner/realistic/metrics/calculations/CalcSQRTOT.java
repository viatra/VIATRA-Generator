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
import java.util.HashSet;
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
    final Map<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>> deep2shallowNeighbours = new HashMap<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>>();
    for (final Object deepNode : nhDeepNodes) {
      {
        final Set<AbstractNodeDescriptor> neighbours = new HashSet<AbstractNodeDescriptor>();
        final FurtherNodeDescriptor deepNodeDesc = ((FurtherNodeDescriptor) deepNode);
        Set _keySet = deepNodeDesc.getIncomingEdges().keySet();
        for (final Object inEdge : _keySet) {
          {
            final IncomingRelation edgeDesc = ((IncomingRelation) inEdge);
            Object _from = edgeDesc.getFrom();
            neighbours.add(((AbstractNodeDescriptor) _from));
          }
        }
        Set _keySet_1 = deepNodeDesc.getOutgoingEdges().keySet();
        for (final Object outEdge : _keySet_1) {
          {
            final OutgoingRelation edgeDesc = ((OutgoingRelation) outEdge);
            Object _to = edgeDesc.getTo();
            neighbours.add(((AbstractNodeDescriptor) _to));
          }
        }
        deep2shallowNeighbours.put(deepNodeDesc, neighbours);
      }
    }
    double totalSQR = 0.0;
    double tot2ndNeighbours = 0.0;
    for (final Object deepNode_1 : nhDeepNodes) {
      {
        final FurtherNodeDescriptor deepNodeDesc = ((FurtherNodeDescriptor) deepNode_1);
        double numSquares = 0.0;
        boolean _isEmpty = Util.toLocalNode(deepNodeDesc).getTypes().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          final Set<AbstractNodeDescriptor> relevantNodes = CollectionsUtil.<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>>lookup(deepNodeDesc, deep2shallowNeighbours);
          for (final AbstractNodeDescriptor rel1 : relevantNodes) {
            for (final AbstractNodeDescriptor rel2 : relevantNodes) {
              boolean _notEquals = (!Objects.equal(rel1, rel2));
              if (_notEquals) {
                for (final Object pot2ndN : nhDeepNodes) {
                  boolean _notEquals_1 = (!Objects.equal(deepNode_1, pot2ndN));
                  if (_notEquals_1) {
                    final FurtherNodeDescriptor pot2ndNDesc = ((FurtherNodeDescriptor) pot2ndN);
                    final Set<AbstractNodeDescriptor> neighbours = CollectionsUtil.<FurtherNodeDescriptor, Set<AbstractNodeDescriptor>>lookup(pot2ndNDesc, deep2shallowNeighbours);
                    boolean _contains = neighbours.contains(rel1);
                    if (_contains) {
                      tot2ndNeighbours++;
                    }
                    if ((neighbours.contains(rel1) && neighbours.contains(rel2))) {
                      numSquares++;
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
