package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
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
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcSQRNUM extends CalcMetric {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  @Override
  public double calcFromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Map<EObject, Set<EObject>> node2Neighbours = new HashMap<EObject, Set<EObject>>();
    Util.fillWithNodes(nodes, node2Neighbours);
    Util.getNeighboursList(nodes, node2Neighbours);
    double numSquares = 0.0;
    for (final EObject node : nodes) {
      {
        final Set<EObject> neighboursD1 = CollectionsUtil.<EObject, Set<EObject>>lookup(node, node2Neighbours);
        for (final EObject neighbour1 : neighboursD1) {
          {
            final Set<EObject> neighboursD2 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour1, node2Neighbours);
            for (final EObject neighbour2 : neighboursD2) {
              {
                final Set<EObject> neighboursD3 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour2, node2Neighbours);
                for (final EObject neighbour3 : neighboursD3) {
                  {
                    final Set<EObject> neighboursD4 = CollectionsUtil.<EObject, Set<EObject>>lookup(neighbour3, node2Neighbours);
                    boolean _contains = neighboursD4.contains(node);
                    if (_contains) {
                      numSquares++;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    String _plus = (Double.valueOf(numSquares) + " ");
    InputOutput.<String>print(_plus);
    return numSquares;
  }
  
  @Override
  public double calcFromNHLattice(final PartialInterpretation pm) {
    return this.calcFromNHLattice(pm, Integer.valueOf(5));
  }
  
  @Override
  public double calcFromNHLattice(final PartialInterpretation pm, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcSQRNUM.neighbourhoodComputer.createRepresentation(pm, ((depth).intValue() + 1), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhDeepRep = ((HashMap) _modelRepresentation);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation_1 = CalcSQRNUM.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE).getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation_1);
    final Set nhDeepNodes = nhDeepRep.keySet();
    final Set nhNodes = nhRep.keySet();
    final Map<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>> deep2shallowNeighbours = new HashMap<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>();
    final Map<AbstractNodeDescriptor, Map<FurtherNodeDescriptor, Integer>> shallow2deepNeighbours = new HashMap<AbstractNodeDescriptor, Map<FurtherNodeDescriptor, Integer>>();
    for (final Object deepNode : nhDeepNodes) {
      HashMap<AbstractNodeDescriptor, Integer> _hashMap = new HashMap<AbstractNodeDescriptor, Integer>();
      deep2shallowNeighbours.put(((FurtherNodeDescriptor) deepNode), _hashMap);
    }
    for (final Object node : nhNodes) {
      HashMap<FurtherNodeDescriptor, Integer> _hashMap_1 = new HashMap<FurtherNodeDescriptor, Integer>();
      shallow2deepNeighbours.put(((AbstractNodeDescriptor) node), _hashMap_1);
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
            Object _lookup_1 = CollectionsUtil.<Object, Object>lookup(inEdge, deepNodeDesc.getIncomingEdges());
            Util.putInside(edgeFromAND, deepNodeDesc, (((Integer) _lookup_1)).intValue(), shallow2deepNeighbours);
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
            Object _lookup_1 = CollectionsUtil.<Object, Object>lookup(outEdge, deepNodeDesc.getOutgoingEdges());
            Util.putInside(edgeToAND, deepNodeDesc, (((Integer) _lookup_1)).intValue(), shallow2deepNeighbours);
          }
        }
      }
    }
    double numSquares = 0.0;
    for (final Object n0 : nhDeepNodes) {
      {
        final FurtherNodeDescriptor n0Desc = ((FurtherNodeDescriptor) n0);
        boolean _isEmpty = Util.toLocalNode(n0Desc).getTypes().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          Object _lookup = CollectionsUtil.<Object, Object>lookup(n0Desc, nhDeepRep);
          final Integer deepNodeMultip = ((Integer) _lookup);
          final Set<AbstractNodeDescriptor> neighboursD1 = CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(n0Desc, deep2shallowNeighbours).keySet();
          for (final AbstractNodeDescriptor n1 : neighboursD1) {
            {
              Object _lookup_1 = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(n1, nhRep);
              final Integer n1Multip = ((Integer) _lookup_1);
              final Set<FurtherNodeDescriptor> neighboursD2 = CollectionsUtil.<AbstractNodeDescriptor, Map<FurtherNodeDescriptor, Integer>>lookup(n1, shallow2deepNeighbours).keySet();
              for (final FurtherNodeDescriptor n2 : neighboursD2) {
                {
                  Object _lookup_2 = CollectionsUtil.<Object, Object>lookup(n2, nhDeepRep);
                  final Integer n2Multip = ((Integer) _lookup_2);
                  final Set<AbstractNodeDescriptor> neighboursD3 = CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(n2, deep2shallowNeighbours).keySet();
                  for (final AbstractNodeDescriptor n3 : neighboursD3) {
                    {
                      Object _lookup_3 = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(n3, nhRep);
                      final Integer n3Multip = ((Integer) _lookup_3);
                      final Set<FurtherNodeDescriptor> neighboursD4 = CollectionsUtil.<AbstractNodeDescriptor, Map<FurtherNodeDescriptor, Integer>>lookup(n3, shallow2deepNeighbours).keySet();
                      boolean _contains = neighboursD4.contains(n0Desc);
                      if (_contains) {
                        Integer _lookup_4 = CollectionsUtil.<AbstractNodeDescriptor, Integer>lookup(n1, CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(n0Desc, deep2shallowNeighbours));
                        Integer _lookup_5 = CollectionsUtil.<FurtherNodeDescriptor, Integer>lookup(n2, CollectionsUtil.<AbstractNodeDescriptor, Map<FurtherNodeDescriptor, Integer>>lookup(n1, shallow2deepNeighbours));
                        int _multiply = ((((Integer) _lookup_4)).intValue() * 
                          (((Integer) _lookup_5)).intValue());
                        Integer _lookup_6 = CollectionsUtil.<AbstractNodeDescriptor, Integer>lookup(n3, CollectionsUtil.<FurtherNodeDescriptor, Map<AbstractNodeDescriptor, Integer>>lookup(n2, deep2shallowNeighbours));
                        int _multiply_1 = (_multiply * 
                          (((Integer) _lookup_6)).intValue());
                        Integer _lookup_7 = CollectionsUtil.<FurtherNodeDescriptor, Integer>lookup(n0Desc, CollectionsUtil.<AbstractNodeDescriptor, Map<FurtherNodeDescriptor, Integer>>lookup(n3, shallow2deepNeighbours));
                        int _multiply_2 = (_multiply_1 * 
                          (((Integer) _lookup_7)).intValue());
                        int _multiply_3 = (_multiply_2 * (deepNodeMultip).intValue());
                        int _multiply_4 = (_multiply_3 * (n1Multip).intValue());
                        int _multiply_5 = (_multiply_4 * (n2Multip).intValue());
                        final int toAdd = (_multiply_5 * (n3Multip).intValue());
                        double _numSquares = numSquares;
                        numSquares = (_numSquares + toAdd);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    String _plus = (Double.valueOf(numSquares) + " ");
    InputOutput.<String>print(_plus);
    return numSquares;
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
