package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class CalcNDA {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  public static double getNDAfromModel(final EObject model) {
    final Map<EObject, Set<EObject>> dim2NumActNodes = Util.dim2NumActNodesFromModel(model);
    double totalNDA = 0.0;
    Collection<Set<EObject>> _values = dim2NumActNodes.values();
    for (final Set<EObject> actNodes : _values) {
      double _talNDA = totalNDA;
      int _length = ((Object[])Conversions.unwrapArray(actNodes, Object.class)).length;
      totalNDA = (_talNDA + _length);
    }
    final int numDims = ((Object[])Conversions.unwrapArray(dim2NumActNodes.keySet(), Object.class)).length;
    final double avgNDA = (totalNDA / numDims);
    return avgNDA;
  }
  
  public static double getNDAfromNHShape(final PartialInterpretation pm) {
    return CalcNDA.getNDAfromNHShape(pm, Integer.valueOf(1));
  }
  
  public static double getNDAfromNHShape(final PartialInterpretation pm, final Integer depth) {
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
}
