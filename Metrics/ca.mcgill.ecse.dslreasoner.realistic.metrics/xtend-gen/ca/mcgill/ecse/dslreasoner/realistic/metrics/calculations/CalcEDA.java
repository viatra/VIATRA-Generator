package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.MetricsCalculationUsingShapes;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class CalcEDA {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  public static double getEDAfromModel(final EObject model) {
    final Map<EObject, Integer> dim2Occ = Util.dim2NumOccurencesFromModel(model);
    InputOutput.<String>print("Real  :");
    MetricsCalculationUsingShapes.printer(dim2Occ);
    InputOutput.println();
    int totalEDA = Util.sum(dim2Occ.values());
    final int numDims = ((Object[])Conversions.unwrapArray(dim2Occ.keySet(), Object.class)).length;
    Double _valueOf = Double.valueOf(totalEDA);
    final double avgEDA = ((_valueOf).doubleValue() / numDims);
    return avgEDA;
  }
  
  public static double getEDAfromNHShape(final PartialInterpretation pm) {
    return CalcEDA.getEDAfromNHShape(pm, Integer.valueOf(1), Integer.valueOf(0));
  }
  
  public static double getEDAfromNHShape(final PartialInterpretation pm, final Integer depth, final Integer vers) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = CalcEDA.neighbourhoodComputer.createRepresentation(pm, (depth).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation);
    final GraphShape<Object, Object> gs = CalcEDA.neighbouhood2ShapeGraph.createShapeGraph(nh, pm);
    List<GraphNodeDescriptorGND> _nodes = gs.getNodes();
    final List<GraphNodeDescriptorGND> nodes = ((List<GraphNodeDescriptorGND>) _nodes);
    final Map<String, Double> dim2Occ = new HashMap<String, Double>();
    double newVal = 0.0;
    for (final GraphNodeDescriptorGND node : nodes) {
      List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
      for (final OutgoingRelationGND dim : _outgoingEdges) {
        {
          final String dimName = dim.getType();
          Object _lookup = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(node.getCorrespondingAND(), nhRep);
          final Integer numNodeOcc = ((Integer) _lookup);
          final int numNodeChildren = dim.getSourceDistrib().size();
          final GraphNodeDescriptorGND toNode = dim.getTo();
          Object _lookup_1 = CollectionsUtil.<AbstractNodeDescriptor, Object>lookup(toNode.getCorrespondingAND(), nhRep);
          final Integer numToNodeOcc = ((Integer) _lookup_1);
          final int numToNodeChildren = dim.getTargetDistrib().size();
          double amountToAdd = 0.0;
          if (vers != null) {
            switch (vers) {
              case 0:
                int _sum = Util.sum(dim.getSourceDistrib());
                int _multiply = (_sum * (numNodeOcc).intValue());
                int _divide = (_multiply / numNodeChildren);
                amountToAdd = _divide;
                break;
              case 1:
                int _sum_1 = Util.sum(dim.getTargetDistrib());
                int _multiply_1 = (_sum_1 * (numToNodeOcc).intValue());
                int _divide_1 = (_multiply_1 / numToNodeChildren);
                amountToAdd = _divide_1;
                break;
              default:
                int _sum_2 = Util.sum(dim.getSourceDistrib());
                int _multiply_2 = (_sum_2 * (numNodeOcc).intValue());
                int _divide_2 = (_multiply_2 / numNodeChildren);
                int _sum_3 = Util.sum(dim.getTargetDistrib());
                int _multiply_3 = (_sum_3 * (numToNodeOcc).intValue());
                int _divide_3 = (_multiply_3 / numToNodeChildren);
                int _plus = (_divide_2 + _divide_3);
                double _divide_4 = (_plus / 2.0);
                amountToAdd = _divide_4;
                break;
            }
          } else {
            int _sum_2 = Util.sum(dim.getSourceDistrib());
            int _multiply_2 = (_sum_2 * (numNodeOcc).intValue());
            int _divide_2 = (_multiply_2 / numNodeChildren);
            int _sum_3 = Util.sum(dim.getTargetDistrib());
            int _multiply_3 = (_sum_3 * (numToNodeOcc).intValue());
            int _divide_3 = (_multiply_3 / numToNodeChildren);
            int _plus = (_divide_2 + _divide_3);
            double _divide_4 = (_plus / 2.0);
            amountToAdd = _divide_4;
          }
          boolean _contains = dim2Occ.keySet().contains(dimName);
          if (_contains) {
            Double _lookup_2 = CollectionsUtil.<String, Double>lookup(dimName, dim2Occ);
            double _plus_1 = ((_lookup_2).doubleValue() + amountToAdd);
            newVal = _plus_1;
          } else {
            newVal = amountToAdd;
          }
          dim2Occ.put(dimName, Double.valueOf(newVal));
        }
      }
    }
    InputOutput.<String>println(("Calc    :" + dim2Occ));
    double totalEDA = Util.sum2(dim2Occ.values());
    final int numDims = ((Object[])Conversions.unwrapArray(dim2Occ.keySet(), Object.class)).length;
    Double _valueOf = Double.valueOf(totalEDA);
    final double avgEDA = ((_valueOf).doubleValue() / numDims);
    return avgEDA;
  }
}
