package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcNDA;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CalcNDC {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  public static double getNDCfromModel(final EObject model) {
    final double NDA = CalcNDA.getNDAfromModel(model);
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    final double NDC = (NDA / numNodes);
    return NDC;
  }
  
  public static double getNDCfromNHShape(final PartialInterpretation pm) {
    return CalcNDC.getNDCfromNHShape(pm, Integer.valueOf(1));
  }
  
  public static double getNDCfromNHShape(final PartialInterpretation pm, final Integer depth) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcNDC.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation);
    final GraphShape<Object, Object> gs = CalcNDC.neighbouhood2ShapeGraph.createShapeGraph(nh, pm);
    final double NDA = CalcNDA.getNDAfromNHShape(pm, depth);
    final List<GraphNodeDescriptorGND> nodes = gs.getNodes();
    int numNodes = 0;
    for (final GraphNodeDescriptorGND node : nodes) {
      int _numNodes = numNodes;
      Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(node.getCorrespondingAND(), nhRep);
      numNodes = (_numNodes + (((Integer) _lookup)).intValue());
    }
    final double NDC = (NDA / numNodes);
    return NDC;
  }
}
