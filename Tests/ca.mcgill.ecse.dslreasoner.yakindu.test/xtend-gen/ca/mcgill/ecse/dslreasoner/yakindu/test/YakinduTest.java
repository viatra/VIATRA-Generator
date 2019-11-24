package ca.mcgill.ecse.dslreasoner.yakindu.test;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolutionScope;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class YakinduTest {
  private static String inWS = "input";
  
  private static String outWS = "output";
  
  private static String imName = "Yakindu.xmi";
  
  public static void main(final String[] args) {
    try {
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("/");
      String _plus = (YakinduTest.inWS + _builder);
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_plus, "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/");
      String _plus_1 = (YakinduTest.outWS + _builder_1);
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_plus_1, "");
      workspace.initAndClear();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> map = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      map.put("logicproblem", _xMIResourceFactoryImpl);
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = YakinduTest.loadMetamodel(YakindummPackage.eINSTANCE);
      final EList<EObject> partialModel = YakinduTest.loadPartialModel(inputs, YakinduTest.imName);
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      TracedOutput<LogicProblem, Ecore2Logic_Trace> modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel);
      LogicProblem problem = modelExtensionProblem.getOutput();
      InputOutput.<String>println("Modelling environment Loaded");
      final SolutionScope ss = new SolutionScope();
      ss.numberOfRequiredSolution = 5;
      ViatraReasoner reasoner = new ViatraReasoner();
      ViatraReasonerConfiguration _viatraReasonerConfiguration = new ViatraReasonerConfiguration();
      final Procedure1<ViatraReasonerConfiguration> _function = (ViatraReasonerConfiguration it) -> {
        it.solutionScope = ss;
        it.typeScopes.maxNewElements = 10;
        it.typeScopes.minNewElements = 5;
      };
      final ViatraReasonerConfiguration vampireConfig = ObjectExtensions.<ViatraReasonerConfiguration>operator_doubleArrow(_viatraReasonerConfiguration, _function);
      InputOutput.<String>println("Problem Ready");
      LogicResult solution = reasoner.solve(problem, vampireConfig, workspace);
      InputOutput.<String>println("Problem solved");
      final List<? extends LogicModelInterpretation> interpretations = reasoner.getInterpretations(((ModelResult) solution));
      final LinkedList<EObject> models = new LinkedList<EObject>();
      for (final LogicModelInterpretation interpretation : interpretations) {
        {
          final EObject instanceModel = logic2Ecore.transformInterpretation(interpretation, modelGenerationProblem.getTrace());
          models.add(instanceModel);
        }
      }
      YakinduTest.writeSolution(solution, workspace, models);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static EcoreMetamodelDescriptor loadMetamodel(final EPackage pckg) {
    final List<EClass> classes = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
    final List<EEnum> enums = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
    final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
      return it.getELiterals();
    };
    final List<EEnumLiteral> literals = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(ListExtensions.<EEnum, EList<EEnumLiteral>>map(enums, _function)));
    final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
      return it.getEReferences();
    };
    final List<EReference> references = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(ListExtensions.<EClass, EList<EReference>>map(classes, _function_1)));
    final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
      return it.getEAttributes();
    };
    final List<EAttribute> attributes = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(ListExtensions.<EClass, EList<EAttribute>>map(classes, _function_2)));
    return new EcoreMetamodelDescriptor(classes, Collections.<EClass>unmodifiableSet(CollectionLiterals.<EClass>newHashSet()), false, enums, literals, references, attributes);
  }
  
  public static EList<EObject> loadPartialModel(final ReasonerWorkspace inputs, final String path) {
    EList<EObject> _xblockexpression = null;
    {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      _xblockexpression = inputs.<EObject>readModel(EObject.class, path).eResource().getContents();
    }
    return _xblockexpression;
  }
  
  public static String writeSolution(final LogicResult solution, final ReasonerWorkspace workspace, final List<EObject> models) {
    String _xifexpression = null;
    if ((solution instanceof ModelResult)) {
      String _xblockexpression = null;
      {
        final EList<Object> representations = ((ModelResult)solution).getRepresentation();
        int _size = representations.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for (final Integer representationIndex : _doubleDotLessThan) {
          {
            final Object representation = representations.get((representationIndex).intValue());
            final int representationNumber = ((representationIndex).intValue() + 1);
            if ((representation instanceof PartialInterpretation)) {
              final PartialInterpretation2Gml partialInterpretation2GML = new PartialInterpretation2Gml();
              final String gml = partialInterpretation2GML.transform(((PartialInterpretation)representation));
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("solution");
              _builder.append(representationNumber);
              _builder.append("Visualisation.gml");
              workspace.writeText(_builder.toString(), gml);
            } else {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("solution");
              _builder_1.append(representationNumber);
              _builder_1.append(".txt");
              workspace.writeText(_builder_1.toString(), representation.toString());
            }
          }
        }
        int _size_1 = models.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
        for (final Integer modelIndex : _doubleDotLessThan_1) {
          {
            final EObject model = models.get((modelIndex).intValue());
            final int representationNumber = ((modelIndex).intValue() + 1);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("model");
            _builder.append(representationNumber);
            _builder.append(".xmi");
            workspace.writeModel(model, _builder.toString());
          }
        }
        _xblockexpression = InputOutput.<String>println("Solution saved and visualised");
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
