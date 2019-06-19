package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class MetricsCalculationUsingShapes {
  private final static InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private final static PartialInterpretation2Gml partialVisualizer = new PartialInterpretation2Gml();
  
  private final static Neighbourhood2Gml neighbourhoodVisualizer = new Neighbourhood2Gml();
  
  private static DecimalFormat df = new DecimalFormat("0.000");
  
  public static void main(final String[] args) {
    MetricsCalculationUsingShapes.df.setRoundingMode(RoundingMode.UP);
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
    YakindummPackage.eINSTANCE.eClass();
    ReteEngine.class.getClass();
    final String fileDir = "Human//";
    final String outputs = ("outputs//calculatedMetrics//" + fileDir);
    final String inputs = ("inputs//" + fileDir);
    final FileSystemWorkspace workspace = new FileSystemWorkspace(inputs, "");
    ArrayList<String> naForAllModelsWnh1 = CollectionLiterals.<String>newArrayList();
    ArrayList<String> naForAllModelsWnh2 = CollectionLiterals.<String>newArrayList();
    ArrayList<Object> naForAllModelsWnh3 = CollectionLiterals.<Object>newArrayList();
    ArrayList<String> naForAllModelsWOnh = CollectionLiterals.<String>newArrayList();
    ArrayList<Double> modelNA = CollectionLiterals.<Double>newArrayList();
    InputOutput.<String>println("Average NAs per model");
    List<String> _subList = workspace.allFiles().subList(0, 10);
    for (final String fileName : _subList) {
      {
        final String nameWOExt = fileName.substring(0, fileName.indexOf("."));
        final EObject model = workspace.<EObject>readModel(EObject.class, fileName);
        modelNA = MetricsCalculationUsingShapes.measureNAwithoutNH(model);
        naForAllModelsWOnh.add(MetricsCalculationUsingShapes.df.format(modelNA.get(0)));
        final PartialInterpretation partialModel = MetricsCalculationUsingShapes.getPartialModel(workspace, model);
        modelNA = MetricsCalculationUsingShapes.measureNAwithNH(partialModel);
        naForAllModelsWnh1.add(MetricsCalculationUsingShapes.df.format(modelNA.get(0)));
        naForAllModelsWnh2.add(MetricsCalculationUsingShapes.df.format(modelNA.get(1)));
      }
    }
    InputOutput.<String>println(("W/O NH : " + naForAllModelsWOnh));
    InputOutput.<String>println(("W/ NH 1: " + naForAllModelsWnh1));
    InputOutput.<String>println(("W/ NH 2: " + naForAllModelsWnh2));
    InputOutput.<String>println(("W/ NH 3: " + naForAllModelsWnh3));
  }
  
  public static ArrayList<Double> measureNAwithoutNH(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    final int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
    int currentNA = 0;
    ArrayList<String> seenDims = CollectionLiterals.<String>newArrayList();
    double totalNA = 0.0;
    for (final EObject node : nodes) {
      {
        currentNA = 0;
        seenDims.clear();
        EList<EReference> _eAllReferences = node.eClass().getEAllReferences();
        for (final EReference reference : _eAllReferences) {
          boolean _contains = seenDims.contains(reference.getName());
          boolean _not = (!_contains);
          if (_not) {
            currentNA++;
            seenDims.add(reference.getName());
          }
        }
        double _talNA = totalNA;
        totalNA = (_talNA + currentNA);
      }
    }
    final double averageNA = (totalNA / numNodes);
    return CollectionLiterals.<Double>newArrayList(Double.valueOf(averageNA));
  }
  
  public static ArrayList<Double> measureNAwithNH(final PartialInterpretation partialModel) {
    final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> nh = MetricsCalculationUsingShapes.neighbourhoodComputer.createRepresentation(partialModel, 1, Integer.MAX_VALUE, Integer.MAX_VALUE);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = nh.getModelRepresentation();
    final HashMap nhDeepRep = ((HashMap) _modelRepresentation);
    Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation_1 = MetricsCalculationUsingShapes.neighbourhoodComputer.createRepresentation(partialModel, 0, Integer.MAX_VALUE, Integer.MAX_VALUE).getModelRepresentation();
    final HashMap nhRep = ((HashMap) _modelRepresentation_1);
    final Set nhDeepNodes = nhDeepRep.keySet();
    final Set nhNodes = nhRep.keySet();
    Map<LocalNodeDescriptor, List<String>> activeDims = CollectionLiterals.<LocalNodeDescriptor, List<String>>newHashMap();
    for (final Object nhNode : nhNodes) {
      activeDims.put(((LocalNodeDescriptor) nhNode), CollectionLiterals.<String>newArrayList());
    }
    for (final Object nhDeepNode : nhDeepNodes) {
      {
        final FurtherNodeDescriptor nhDeepNodeDesc = ((FurtherNodeDescriptor) nhDeepNode);
        Object _previousRepresentation = nhDeepNodeDesc.getPreviousRepresentation();
        final LocalNodeDescriptor nhParentNode = ((LocalNodeDescriptor) _previousRepresentation);
        Set _keySet = nhDeepNodeDesc.getIncomingEdges().keySet();
        for (final Object inEdge : _keySet) {
          {
            final String edgeDim = ((IncomingRelation) inEdge).getType();
            boolean _contains = CollectionsUtil.<LocalNodeDescriptor, List<String>>lookup(nhParentNode, activeDims).contains(edgeDim);
            boolean _not = (!_contains);
            if (_not) {
              CollectionsUtil.<LocalNodeDescriptor, List<String>>lookup(nhParentNode, activeDims).add(edgeDim);
            }
          }
        }
        Set _keySet_1 = nhDeepNodeDesc.getOutgoingEdges().keySet();
        for (final Object outEdge : _keySet_1) {
          {
            final String edgeDim = ((OutgoingRelation) outEdge).getType();
            boolean _contains = CollectionsUtil.<LocalNodeDescriptor, List<String>>lookup(nhParentNode, activeDims).contains(edgeDim);
            boolean _not = (!_contains);
            if (_not) {
              CollectionsUtil.<LocalNodeDescriptor, List<String>>lookup(nhParentNode, activeDims).add(edgeDim);
            }
          }
        }
      }
    }
    final ArrayList<Integer> naDistrib = CollectionLiterals.<Integer>newArrayList();
    double totalNA = 0.0;
    double totalNAwithWeight = 0.0;
    int numModelElemsWithWeight = 0;
    Set<LocalNodeDescriptor> _keySet = activeDims.keySet();
    for (final LocalNodeDescriptor nhNode_1 : _keySet) {
      {
        List<String> activeDimsForNode = CollectionsUtil.<LocalNodeDescriptor, List<String>>lookup(nhNode_1, activeDims);
        Object _lookup = CollectionsUtil.<LocalNodeDescriptor, Object>lookup(nhNode_1, nhRep);
        Integer numNodeOccurences = ((Integer) _lookup);
        final List<String> _converted_activeDimsForNode = (List<String>)activeDimsForNode;
        naDistrib.add(Integer.valueOf(((Object[])Conversions.unwrapArray(_converted_activeDimsForNode, Object.class)).length));
        double _talNA = totalNA;
        final List<String> _converted_activeDimsForNode_1 = (List<String>)activeDimsForNode;
        int _length = ((Object[])Conversions.unwrapArray(_converted_activeDimsForNode_1, Object.class)).length;
        totalNA = (_talNA + _length);
        double _talNAwithWeight = totalNAwithWeight;
        final List<String> _converted_activeDimsForNode_2 = (List<String>)activeDimsForNode;
        int _length_1 = ((Object[])Conversions.unwrapArray(_converted_activeDimsForNode_2, Object.class)).length;
        int _multiply = (_length_1 * (numNodeOccurences).intValue());
        totalNAwithWeight = (_talNAwithWeight + _multiply);
        int _numModelElemsWithWeight = numModelElemsWithWeight;
        numModelElemsWithWeight = (_numModelElemsWithWeight + (numNodeOccurences).intValue());
      }
    }
    int _length = ((Object[])Conversions.unwrapArray(activeDims.values(), Object.class)).length;
    final double averageNA = (totalNA / _length);
    final double averageNAwithWeight = (totalNAwithWeight / numModelElemsWithWeight);
    return CollectionLiterals.<Double>newArrayList(Double.valueOf(averageNA), Double.valueOf(averageNAwithWeight));
  }
  
  public static PartialInterpretation getPartialModel(final FileSystemWorkspace workspace, final EObject model) {
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
    final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTransformationOutput = MetricsCalculationUsingShapes.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
    return MetricsCalculationUsingShapes.partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource(), false);
  }
}
