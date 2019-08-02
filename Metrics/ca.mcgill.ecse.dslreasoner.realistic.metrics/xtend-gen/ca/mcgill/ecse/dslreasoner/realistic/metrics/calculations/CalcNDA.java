package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class CalcNDA extends CalcMetric {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  @Override
  public double calcFromModel(final EObject model) {
    final Map<EObject, Set<EObject>> dim2NumActNodes = Util.dim2NumActNodesFromModel(model);
    double totalNDA = 0.0;
    Collection<Set<EObject>> _values = dim2NumActNodes.values();
    for (final Set<EObject> actNodes : _values) {
      double _talNDA = totalNDA;
      int _length = ((Object[])Conversions.unwrapArray(actNodes, Object.class)).length;
      totalNDA = (_talNDA + _length);
    }
    final int numDims = ((Object[])Conversions.unwrapArray(dim2NumActNodes.keySet(), Object.class)).length;
    double avgNDA = 0.0;
    if ((totalNDA != 0)) {
      avgNDA = (totalNDA / numDims);
    }
    return avgNDA;
  }
  
  public double getNDAfromNHShape(final PartialInterpretation pm) {
    return this.getNDAfromNHShape(pm, Integer.valueOf(1));
  }
  
  public double getNDAfromNHShape(final PartialInterpretation pm, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcNDA.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation);
    final GraphShape<Object, Object> nhShapeGraph = CalcNDA.neighbouhood2ShapeGraph.createShapeGraph(nh, pm);
    final Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodes = Util.dim2NumActNodesFromNHShape(nhShapeGraph);
    double totalNDA = 0.0;
    Collection<Set<AbstractNodeDescriptor>> _values = dim2NumActNodes.values();
    for (final Set<AbstractNodeDescriptor> actNodes : _values) {
      for (final AbstractNodeDescriptor actNode : actNodes) {
        {
          Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(actNode, nhRep);
          final Integer numInstances = ((Integer) _lookup);
          double _talNDA = totalNDA;
          totalNDA = (_talNDA + (numInstances).intValue());
        }
      }
    }
    final int numDims = ((Object[])Conversions.unwrapArray(dim2NumActNodes.keySet(), Object.class)).length;
    final double avgNDA = (totalNDA / numDims);
    return avgNDA;
  }
  
  @Override
  public double calcFromNHLattice(final PartialInterpretation pm) {
    return this.calcFromNHLattice(pm, Integer.valueOf(1));
  }
  
  @Override
  public double calcFromNHLattice(final PartialInterpretation pm, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcNDA.neighbourhoodComputer.createRepresentation(pm, ((depth).intValue() + 1), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhDeepRep = ((HashMap) _modelRepresentation);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation_1 = CalcNDA.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE).getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation_1);
    return this.calcFromNHLattice(nhDeepRep, nhRep, depth);
  }
  
  public double calcFromNHLattice(final HashMap nhDeepRep, final HashMap nhRep, final Integer depth) {
    final Set nhDeepNodes = nhDeepRep.keySet();
    final Set nhNodes = nhRep.keySet();
    final Map<String, Set<AbstractNodeDescriptor>> dim2ActNodes = CollectionLiterals.<String, Set<AbstractNodeDescriptor>>newHashMap();
    for (final Object node : nhDeepNodes) {
      {
        final FurtherNodeDescriptor nodeFND = ((FurtherNodeDescriptor) node);
        Set _keySet = nodeFND.getIncomingEdges().keySet();
        for (final Object edge : _keySet) {
          {
            final IncomingRelation<AbstractNodeDescriptor> edgeDesc = ((IncomingRelation<AbstractNodeDescriptor>) edge);
            final String dimName = edgeDesc.getType();
            boolean _contains = dim2ActNodes.keySet().contains(dimName);
            if (_contains) {
              CollectionsUtil.<String, Set<AbstractNodeDescriptor>>lookup(dimName, dim2ActNodes).add(edgeDesc.getFrom());
            } else {
              dim2ActNodes.put(dimName, CollectionLiterals.<AbstractNodeDescriptor>newHashSet(edgeDesc.getFrom()));
            }
          }
        }
        Set _keySet_1 = nodeFND.getOutgoingEdges().keySet();
        for (final Object edge_1 : _keySet_1) {
          {
            final OutgoingRelation<AbstractNodeDescriptor> edgeDesc = ((OutgoingRelation<AbstractNodeDescriptor>) edge_1);
            final String dimName = edgeDesc.getType();
            boolean _contains = dim2ActNodes.keySet().contains(dimName);
            if (_contains) {
              CollectionsUtil.<String, Set<AbstractNodeDescriptor>>lookup(dimName, dim2ActNodes).add(edgeDesc.getTo());
            } else {
              dim2ActNodes.put(dimName, CollectionLiterals.<AbstractNodeDescriptor>newHashSet(edgeDesc.getTo()));
            }
          }
        }
      }
    }
    double totalNDA = 0.0;
    Collection<Set<AbstractNodeDescriptor>> _values = dim2ActNodes.values();
    for (final Set<AbstractNodeDescriptor> actNodes : _values) {
      for (final AbstractNodeDescriptor actNode : actNodes) {
        {
          Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(actNode, nhRep);
          final Integer numInstances = ((Integer) _lookup);
          double _talNDA = totalNDA;
          totalNDA = (_talNDA + (numInstances).intValue());
        }
      }
    }
    final int numDims = ((Object[])Conversions.unwrapArray(dim2ActNodes.keySet(), Object.class)).length;
    double avgNDA = 0.0;
    if ((totalNDA != 0)) {
      avgNDA = (totalNDA / numDims);
    }
    return avgNDA;
  }
}
