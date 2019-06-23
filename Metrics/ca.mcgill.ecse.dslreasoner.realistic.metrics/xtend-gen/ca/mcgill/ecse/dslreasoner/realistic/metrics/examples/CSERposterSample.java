package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;
import linkedList.LinkedListPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import simpleStatechart.SimpleStatechartPackage;

@SuppressWarnings("all")
public class CSERposterSample {
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private final static PartialInterpretation2Gml partialVisualizer = new PartialInterpretation2Gml();
  
  private final static Neighbourhood2Gml neighbourhoodVisualizer = new Neighbourhood2Gml();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  private final static int depth = 1;
  
  private final static String REALISTIC = "simpleSCRealistic";
  
  private final static String IRREALISTIC = "simpleSCIrrealistic";
  
  public static void main(final String[] args) {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      YakindummPackage.eINSTANCE.eClass();
      LinkedListPackage.eINSTANCE.eClass();
      SimpleStatechartPackage.eINSTANCE.eClass();
      ReteEngine.class.getClass();
      final String outputs = "outputs";
      final String instModName = "sampleList";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("resources");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder.toString(), "");
      final EObject model = workspace.<EObject>readModel(EObject.class, (instModName + ".xmi"));
      final PartialInterpretation partialModelOutput = Util.getPartialModel(workspace, model);
      final PrintWriter writer = new PrintWriter((((((outputs + "/") + instModName) + "/") + instModName) + "MODEL.gml"));
      writer.print(CSERposterSample.partialVisualizer.transform(partialModelOutput));
      writer.close();
      final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> hood = CSERposterSample.neighbourhoodComputer.createRepresentation(partialModelOutput, CSERposterSample.depth, Integer.MAX_VALUE, 
        Integer.MAX_VALUE);
      final PrintWriter w2 = new PrintWriter(((((((outputs + "/") + instModName) + "/") + instModName) + Integer.valueOf(CSERposterSample.depth)) + "NEIGHBOURHOOD.gml"));
      w2.print(CSERposterSample.neighbourhoodVisualizer.transform2gml(hood, partialModelOutput));
      w2.close();
      final PrintWriter w3 = new PrintWriter(((((((outputs + "/") + instModName) + "/") + instModName) + Integer.valueOf(CSERposterSample.depth)) + "SHAPE.txt"));
      final GraphShape<Object, Object> y = CSERposterSample.neighbouhood2ShapeGraph.createShapeGraph(hood, partialModelOutput);
      List<GraphNodeDescriptorGND> _nodes = y.getNodes();
      for (final GraphNodeDescriptorGND node : _nodes) {
        {
          w3.println("----------------------");
          w3.println("NEW NODE");
          Set<String> locNode = Util.toLocalNode(node.getCorrespondingAND());
          w3.println(("   -node type  : " + locNode));
          w3.println("   -Incoming Relations:");
          List<IncomingRelationGND> _incomingEdges = node.getIncomingEdges();
          for (final IncomingRelationGND inRel : _incomingEdges) {
            {
              w3.println("       -----------------");
              w3.println("       -IN RELATION:");
              String _type = inRel.getType();
              String _plus = ("              -type    : " + _type);
              w3.println(_plus);
              locNode = Util.toLocalNode(inRel.getFrom().getCorrespondingAND());
              w3.println(("              -from    : " + locNode));
              List<Integer> _sourceDistrib = inRel.getSourceDistrib();
              String _plus_1 = ("              -srcDis  : " + _sourceDistrib);
              w3.println(_plus_1);
              List<Integer> _targetDistrib = inRel.getTargetDistrib();
              String _plus_2 = ("              -trgDis  : " + _targetDistrib);
              w3.println(_plus_2);
            }
          }
          w3.println();
          w3.println("    -Outgoing Relations:");
          List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
          for (final OutgoingRelationGND outRel : _outgoingEdges) {
            {
              w3.println("       -----------------");
              w3.println("       -OUT RELATION:");
              String _type = outRel.getType();
              String _plus = ("              -type    : " + _type);
              w3.println(_plus);
              locNode = Util.toLocalNode(outRel.getTo().getCorrespondingAND());
              w3.println(("              -to    : " + locNode));
              List<Integer> _sourceDistrib = outRel.getSourceDistrib();
              String _plus_1 = ("              -srcDis  : " + _sourceDistrib);
              w3.println(_plus_1);
              List<Integer> _targetDistrib = outRel.getTargetDistrib();
              String _plus_2 = ("              -trgDis  : " + _targetDistrib);
              w3.println(_plus_2);
            }
          }
        }
      }
      w3.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
