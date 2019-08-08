package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcMetric2;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcMPC extends CalcMetric2 {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  @Override
  public List<Double> calcFromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    Set<String> allDimensions = new HashSet<String>();
    Map<EObject, Map<String, Integer>> node2dims = new HashMap<EObject, Map<String, Integer>>();
    for (final EObject node : nodes) {
      node2dims.put(node, CollectionLiterals.<String, Integer>newHashMap());
    }
    for (final EObject node_1 : nodes) {
      EList<EReference> _eAllReferences = node_1.eClass().getEAllReferences();
      for (final EReference reference : _eAllReferences) {
        {
          final Object pointingTo = node_1.eGet(reference);
          if ((!(pointingTo instanceof List))) {
            if ((pointingTo != null)) {
              allDimensions.add(reference.getName());
              Util.putInside(node_1, reference.getName(), 1, node2dims);
              Util.putInside(((EObject) pointingTo), reference.getName(), 1, node2dims);
            }
          } else {
            final List pointingToList = ((List) pointingTo);
            boolean _isEmpty = pointingToList.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              allDimensions.add(reference.getName());
              Util.putInside(node_1, reference.getName(), pointingToList.size(), node2dims);
              for (final Object target : pointingToList) {
                Util.putInside(((EObject) target), reference.getName(), 1, node2dims);
              }
            }
          }
        }
      }
    }
    final List<Double> metricDistrib = CollectionLiterals.<Double>newArrayList();
    final Set<String> _converted_allDimensions = (Set<String>)allDimensions;
    final int totalNumDims = ((Object[])Conversions.unwrapArray(_converted_allDimensions, Object.class)).length;
    Collection<Map<String, Integer>> _values = node2dims.values();
    for (final Map<String, Integer> degrees : _values) {
      {
        int totalDegree = Util.sumInt(degrees.values());
        double partialMPC = 1.0;
        Collection<Integer> _values_1 = degrees.values();
        for (final Integer degree : _values_1) {
          double _partialMPC = partialMPC;
          float _floatValue = degree.floatValue();
          float _divide = (_floatValue / totalDegree);
          double _pow = Math.pow(_divide, 2);
          partialMPC = (_partialMPC - _pow);
        }
        double mpcVal = 0.0;
        float _floatValue_1 = Integer.valueOf(totalNumDims).floatValue();
        double _multiply = (_floatValue_1 * partialMPC);
        boolean _notEquals = (_multiply != 0);
        if (_notEquals) {
          float _floatValue_2 = Integer.valueOf(totalNumDims).floatValue();
          float _divide_1 = (_floatValue_2 / (totalNumDims - 1));
          double _multiply_1 = (_divide_1 * partialMPC);
          mpcVal = _multiply_1;
        }
        metricDistrib.add(Double.valueOf(mpcVal));
      }
    }
    return metricDistrib;
  }
  
  @Override
  public List<Double> calcFromNHLattice(final PartialInterpretation pm) {
    return this.calcFromNHLattice(pm, Integer.valueOf(1));
  }
  
  @Override
  public List<Double> calcFromNHLattice(final PartialInterpretation pm, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcMPC.neighbourhoodComputer.createRepresentation(pm, ((depth).intValue() + 1), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhDeepRep = ((HashMap) _modelRepresentation);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation_1 = CalcMPC.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE).getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation_1);
    final Set nhDeepNodes = nhDeepRep.keySet();
    final Set nhNodes = nhRep.keySet();
    final Map<AbstractNodeDescriptor, List<FurtherNodeDescriptor>> AND2children = new HashMap<AbstractNodeDescriptor, List<FurtherNodeDescriptor>>();
    for (final Object deepNodeKey : nhDeepNodes) {
      {
        final FurtherNodeDescriptor deepNodeDesc = ((FurtherNodeDescriptor) deepNodeKey);
        Object _previousRepresentation = deepNodeDesc.getPreviousRepresentation();
        final AbstractNodeDescriptor parentDesc = ((AbstractNodeDescriptor) _previousRepresentation);
        boolean _contains = AND2children.keySet().contains(parentDesc);
        if (_contains) {
          CollectionsUtil.<AbstractNodeDescriptor, List<FurtherNodeDescriptor>>lookup(parentDesc, AND2children).add(deepNodeDesc);
        } else {
          AND2children.put(parentDesc, CollectionLiterals.<FurtherNodeDescriptor>newArrayList(deepNodeDesc));
        }
      }
    }
    double totalMPC = 0.0;
    double totalDegree = 0.0;
    double partialMPC = 0.0;
    int numNodes = 0;
    int numToAdd = 0;
    Set<String> allDimensions = new HashSet<String>();
    Map<String, Integer> dim2Num = new HashMap<String, Integer>();
    List<Double> rawMetrics = CollectionLiterals.<Double>newArrayList();
    for (final Object node : nhNodes) {
      {
        final AbstractNodeDescriptor nodeAND = ((AbstractNodeDescriptor) node);
        boolean _isEmpty = Util.toLocalNode(nodeAND).getTypes().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          totalDegree = 0.0;
          List<FurtherNodeDescriptor> _lookup = CollectionsUtil.<AbstractNodeDescriptor, List<FurtherNodeDescriptor>>lookup(nodeAND, AND2children);
          for (final FurtherNodeDescriptor child : _lookup) {
            {
              Set _keySet = child.getIncomingEdges().keySet();
              for (final Object inEdge : _keySet) {
                {
                  final IncomingRelation<AbstractNodeDescriptor> edgeDesc = ((IncomingRelation<AbstractNodeDescriptor>) inEdge);
                  final String edgeName = edgeDesc.getType();
                  allDimensions.add(edgeName);
                  Object _lookup_1 = CollectionsUtil.<Object, Object>lookup(inEdge, child.getIncomingEdges());
                  numToAdd = (((Integer) _lookup_1)).intValue();
                  double _talDegree = totalDegree;
                  totalDegree = (_talDegree + numToAdd);
                  boolean _contains = dim2Num.keySet().contains(edgeName);
                  if (_contains) {
                    Integer _lookup_2 = CollectionsUtil.<String, Integer>lookup(edgeName, dim2Num);
                    int _plus = ((_lookup_2).intValue() + numToAdd);
                    dim2Num.put(edgeName, Integer.valueOf(_plus));
                  } else {
                    dim2Num.put(edgeName, Integer.valueOf(numToAdd));
                  }
                }
              }
              Set _keySet_1 = child.getOutgoingEdges().keySet();
              for (final Object outEdge : _keySet_1) {
                {
                  final OutgoingRelation<AbstractNodeDescriptor> edgeDesc = ((OutgoingRelation<AbstractNodeDescriptor>) outEdge);
                  final String edgeName = edgeDesc.getType();
                  allDimensions.add(edgeName);
                  Object _lookup_1 = CollectionsUtil.<Object, Object>lookup(outEdge, child.getOutgoingEdges());
                  numToAdd = (((Integer) _lookup_1)).intValue();
                  double _talDegree = totalDegree;
                  totalDegree = (_talDegree + numToAdd);
                  boolean _contains = dim2Num.keySet().contains(edgeName);
                  if (_contains) {
                    Integer _lookup_2 = CollectionsUtil.<String, Integer>lookup(edgeName, dim2Num);
                    int _plus = ((_lookup_2).intValue() + numToAdd);
                    dim2Num.put(edgeName, Integer.valueOf(_plus));
                  } else {
                    dim2Num.put(edgeName, Integer.valueOf(numToAdd));
                  }
                }
              }
            }
          }
          partialMPC = 1.0;
          Collection<Integer> _values = dim2Num.values();
          for (final Integer degree : _values) {
            double _partialMPC = partialMPC;
            float _floatValue = degree.floatValue();
            double _divide = (_floatValue / totalDegree);
            double _pow = Math.pow(_divide, 2);
            partialMPC = (_partialMPC - _pow);
          }
          Object _lookup_1 = CollectionsUtil.<Object, Object>lookup(node, nhRep);
          final Integer numOccurrences = ((Integer) _lookup_1);
          for (int i = 0; (i < (numOccurrences).intValue()); i++) {
            rawMetrics.add(Double.valueOf(partialMPC));
          }
          dim2Num.clear();
        }
      }
    }
    List<Double> metricDistrib = CollectionLiterals.<Double>newArrayList();
    final int totalNumDims = allDimensions.size();
    float _floatValue = Integer.valueOf(totalNumDims).floatValue();
    final float multiplier = (_floatValue / (totalNumDims - 1));
    for (final Double rawVal : rawMetrics) {
      if (((rawVal).doubleValue() == 0)) {
        metricDistrib.add(Double.valueOf(0.0));
      } else {
        metricDistrib.add(Double.valueOf((multiplier * (rawVal).doubleValue())));
      }
    }
    return metricDistrib;
  }
  
  public static double getMPCfromNHShape(final PartialInterpretation pm) {
    return CalcMPC.getMPCfromNHShape(pm, Integer.valueOf(1));
  }
  
  public static double getMPCfromNHShape(final PartialInterpretation partialModel, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcMPC.neighbourhoodComputer.createRepresentation(partialModel, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation);
    final GraphShape<Object, Object> nhShapeGraph = CalcMPC.neighbouhood2ShapeGraph.createShapeGraph(nh, partialModel);
    double totalMPC = 0.0;
    double totalDegree = 0.0;
    double partialMPC = 0.0;
    int numNodes = 0;
    int numToAdd = 0;
    Set<String> allDimensions = new HashSet<String>();
    Map<String, Integer> type2Num = new HashMap<String, Integer>();
    List<GraphNodeDescriptorGND> _nodes = nhShapeGraph.getNodes();
    for (final GraphNodeDescriptorGND node : _nodes) {
      {
        totalDegree = 0.0;
        List<IncomingRelationGND> _incomingEdges = node.getIncomingEdges();
        for (final IncomingRelationGND inEdge : _incomingEdges) {
          {
            final String edgeName = inEdge.getType();
            allDimensions.add(edgeName);
            numToAdd = Util.sumInt(inEdge.getTargetDistrib());
            double _talDegree = totalDegree;
            totalDegree = (_talDegree + numToAdd);
            boolean _contains = type2Num.keySet().contains(edgeName);
            if (_contains) {
              Integer _lookup = CollectionsUtil.<String, Integer>lookup(edgeName, type2Num);
              int _plus = ((_lookup).intValue() + numToAdd);
              type2Num.put(edgeName, Integer.valueOf(_plus));
            } else {
              type2Num.put(edgeName, Integer.valueOf(numToAdd));
            }
          }
        }
        List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
        for (final OutgoingRelationGND outEdge : _outgoingEdges) {
          {
            final String edgeName = outEdge.getType();
            allDimensions.add(edgeName);
            numToAdd = Util.sumInt(outEdge.getSourceDistrib());
            double _talDegree = totalDegree;
            totalDegree = (_talDegree + numToAdd);
            boolean _contains = type2Num.keySet().contains(edgeName);
            if (_contains) {
              Integer _lookup = CollectionsUtil.<String, Integer>lookup(edgeName, type2Num);
              int _plus = ((_lookup).intValue() + numToAdd);
              type2Num.put(edgeName, Integer.valueOf(_plus));
            } else {
              type2Num.put(edgeName, Integer.valueOf(numToAdd));
            }
          }
        }
        partialMPC = 1.0;
        Collection<Integer> _values = type2Num.values();
        for (final Integer degree : _values) {
          double _partialMPC = partialMPC;
          float _floatValue = degree.floatValue();
          double _divide = (_floatValue / totalDegree);
          double _pow = Math.pow(_divide, 2);
          partialMPC = (_partialMPC - _pow);
        }
        Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(node.getCorrespondingAND(), nhRep);
        final Integer numOccurrences = ((Integer) _lookup);
        int _numNodes = numNodes;
        numNodes = (_numNodes + (numOccurrences).intValue());
        double _talMPC = totalMPC;
        totalMPC = (_talMPC + (partialMPC * (numOccurrences).intValue()));
        type2Num.clear();
      }
    }
    final int totalNumDims = allDimensions.size();
    float _floatValue = Integer.valueOf(totalNumDims).floatValue();
    float _divide = (_floatValue / (totalNumDims - 1));
    final double averageMPC = (_divide * (totalMPC / numNodes));
    return averageMPC;
  }
}
