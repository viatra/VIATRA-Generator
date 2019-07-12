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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
    double totalC = 0.0;
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
        double _talC = totalC;
        totalC = (_talC + sqr);
      }
    }
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    final double avgC = (totalC / numNodes);
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
    double totalSQR = 0.0;
    for (final Object deepNode : nhDeepNodes) {
      {
        final List<AbstractNodeDescriptor> relevantNodes = CollectionLiterals.<AbstractNodeDescriptor>newArrayList();
        final FurtherNodeDescriptor nhDeepNodeDesc = ((FurtherNodeDescriptor) deepNode);
        Set _keySet = nhDeepNodeDesc.getIncomingEdges().keySet();
        for (final Object inEdge : _keySet) {
          {
            final IncomingRelation edgeDesc = ((IncomingRelation) inEdge);
            Object _from = edgeDesc.getFrom();
            relevantNodes.add(((AbstractNodeDescriptor) _from));
          }
        }
        Set _keySet_1 = nhDeepNodeDesc.getOutgoingEdges().keySet();
        for (final Object outEdge : _keySet_1) {
          {
            final OutgoingRelation edgeDesc = ((OutgoingRelation) outEdge);
            Object _to = edgeDesc.getTo();
            relevantNodes.add(((AbstractNodeDescriptor) _to));
          }
        }
        double numerator = 0.0;
        double denominator = 0.0;
        for (final Object pot2ndN : nhDeepNodes) {
          {
            numerator = 0.0;
            denominator = 0.0;
            boolean _notEquals = (!Objects.equal(deepNode, pot2ndN));
            if (_notEquals) {
              final List<AbstractNodeDescriptor> neighbours = CollectionLiterals.<AbstractNodeDescriptor>newArrayList();
              final FurtherNodeDescriptor pot2ndNDesc = ((FurtherNodeDescriptor) pot2ndN);
              Set _keySet_2 = nhDeepNodeDesc.getIncomingEdges().keySet();
              for (final Object inEdge_1 : _keySet_2) {
                {
                  final IncomingRelation edgeDesc = ((IncomingRelation) inEdge_1);
                  Object _from = edgeDesc.getFrom();
                  neighbours.add(((AbstractNodeDescriptor) _from));
                }
              }
              Set _keySet_3 = nhDeepNodeDesc.getOutgoingEdges().keySet();
              for (final Object outEdge_1 : _keySet_3) {
                {
                  final OutgoingRelation edgeDesc = ((OutgoingRelation) outEdge_1);
                  Object _to = edgeDesc.getTo();
                  neighbours.add(((AbstractNodeDescriptor) _to));
                }
              }
              int numRelNodes = 0;
              for (final AbstractNodeDescriptor relNode : relevantNodes) {
                boolean _contains = neighbours.contains(relNode);
                if (_contains) {
                  int _numRelNodes = numRelNodes;
                  numRelNodes = (_numRelNodes + 1);
                }
              }
              final Integer factorialVal = Util.factorial(Integer.valueOf(numRelNodes));
              double _denominator = denominator;
              Object _lookup = CollectionsUtil.<Object, Object>lookup(pot2ndNDesc, nhDeepRep);
              int _multiply = ((factorialVal).intValue() * (((Integer) _lookup)).intValue());
              denominator = (_denominator + _multiply);
              if ((numRelNodes > 1)) {
                double _numerator = numerator;
                Object _lookup_1 = CollectionsUtil.<Object, Object>lookup(pot2ndNDesc, nhDeepRep);
                int _multiply_1 = ((factorialVal).intValue() * (((Integer) _lookup_1)).intValue());
                numerator = (_numerator + _multiply_1);
              }
            }
          }
        }
        if ((numerator != 0)) {
          double _talSQR = totalSQR;
          totalSQR = (_talSQR + (numerator / denominator));
        }
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
