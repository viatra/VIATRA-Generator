package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import linkedList.LinkedListPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import simpleStatechart.SimpleStatechartPackage;

@SuppressWarnings("all")
public class CSERposterSample {
  private final static InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private final static PartialInterpretation2Gml partialVisualizer = new PartialInterpretation2Gml();
  
  private final static Neighbourhood2Gml neighbourhoodVisualizer = new Neighbourhood2Gml();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  private final static int depth = 0;
  
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
      final String instModName = "thursdayModel";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("resources");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder.toString(), "");
      final EObject model = workspace.<EObject>readModel(EObject.class, (instModName + ".xmi"));
      final EPackage pckg = model.eClass().getEPackage();
      List<EClass> _list = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
      Set<EClass> _emptySet = Collections.<EClass>emptySet();
      List<EEnum> _list_1 = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
      final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
        return it.getELiterals();
      };
      List<EEnumLiteral> _list_2 = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(IterableExtensions.<EEnum, EList<EEnumLiteral>>map(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class), _function)));
      final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
        return it.getEReferences();
      };
      List<EReference> _list_3 = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(IterableExtensions.<EClass, EList<EReference>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_1)));
      final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
        return it.getEAttributes();
      };
      List<EAttribute> _list_4 = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(IterableExtensions.<EClass, EList<EAttribute>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_2)));
      final EcoreMetamodelDescriptor metamodel = new EcoreMetamodelDescriptor(_list, _emptySet, 
        false, _list_1, _list_2, _list_3, _list_4);
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTransformationOutput = CSERposterSample.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      final PartialInterpretation partialModelOutput = CSERposterSample.partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource(), 
        false);
      final PrintWriter writer = new PrintWriter((((outputs + "//") + instModName) + "MODEL.gml"));
      writer.print(CSERposterSample.partialVisualizer.transform(partialModelOutput));
      writer.close();
      final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> hood = CSERposterSample.neighbourhoodComputer.createRepresentation(partialModelOutput, CSERposterSample.depth, Integer.MAX_VALUE, 
        Integer.MAX_VALUE);
      final PrintWriter w2 = new PrintWriter(((((outputs + "/") + instModName) + Integer.valueOf(CSERposterSample.depth)) + "NEIGHBOURHOOD.gml"));
      w2.close();
      final GraphShape<Object, Object> y = CSERposterSample.neighbouhood2ShapeGraph.createShapeGraph(hood, partialModelOutput);
      InputOutput.<GraphShape<Object, Object>>println(y);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
