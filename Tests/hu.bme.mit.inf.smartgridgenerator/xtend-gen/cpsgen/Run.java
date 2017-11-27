package cpsgen;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicTrace;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import hu.bme.mit.inf.smartgrid.SmartgridPackage;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import patterns.Pattern;

@SuppressWarnings("all")
public class Run {
  /**
   * Initializes the files needed for the generate method. Iterates over all the query specifications contained by <b>queriesToGenerateFrom</b>
   *  and calls the generate method for each ViatraQuerySetDescriptor.
   */
  public static void main(final String[] args) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initialModels/");
      final FileSystemWorkspace initialModelsLocation = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("outputModels/");
      final FileSystemWorkspace outputModelsLocation = new FileSystemWorkspace(_builder_1.toString(), "");
      outputModelsLocation.initAndClear();
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = Run.loadMetamodel(SmartgridPackage.eINSTANCE);
      final List<EObject> initialModel = Run.loadInitialModel(initialModelsLocation, "grid.xmi");
      final ViatraQuerySetDescriptor queries = Run.loadQueries(metamodel);
      InputOutput.<String>println("DSL loaded");
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, initialModel);
      Viatra2LogicConfiguration _viatra2LogicConfiguration = new Viatra2LogicConfiguration();
      final TracedOutput<LogicProblem, Viatra2LogicTrace> validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelGenerationProblem, _viatra2LogicConfiguration);
      final LogicProblem logicProblem = validModelExtensionProblem.getOutput();
      InputOutput.<String>println("Problem created");
      LogicResult solution = null;
      LogicReasoner reasoner = null;
      ViatraReasoner _viatraReasoner = new ViatraReasoner();
      reasoner = _viatraReasoner;
      ViatraReasonerConfiguration _viatraReasonerConfiguration = new ViatraReasonerConfiguration();
      final Procedure1<ViatraReasonerConfiguration> _function = (ViatraReasonerConfiguration it) -> {
        it.typeScopes.maxNewElements = 100;
        it.typeScopes.minNewElements = 100;
        it.solutionScope.numberOfRequiredSolution = 1;
        final Function1<IQuerySpecification<?>, PQuery> _function_1 = (IQuerySpecification<?> it_1) -> {
          return it_1.getInternalQueryRepresentation();
        };
        it.existingQueries = ListExtensions.map(queries.getPatterns(), _function_1);
        it.debugCongiguration.logging = false;
      };
      final ViatraReasonerConfiguration viatraConfig = ObjectExtensions.<ViatraReasonerConfiguration>operator_doubleArrow(_viatraReasonerConfiguration, _function);
      solution = reasoner.solve(logicProblem, viatraConfig, outputModelsLocation);
      InputOutput.<String>println("Problem solved");
      final List<? extends LogicModelInterpretation> interpretations = reasoner.getInterpretations(((ModelResult) solution));
      final LinkedList<EObject> models = new LinkedList<EObject>();
      for (final LogicModelInterpretation interpretation : interpretations) {
        {
          final EObject instanceModel = logic2Ecore.transformInterpretation(interpretation, modelGenerationProblem.getTrace());
          models.add(instanceModel);
        }
      }
      Run.writeSolution(solution, outputModelsLocation, Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList()));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Creates an EcoreMetamodelDescriptor as the metamodel to be used by the generator.
   */
  private static EcoreMetamodelDescriptor loadMetamodel(final EPackage pckg) {
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
    final List<EAttribute> attributes = CollectionLiterals.<EAttribute>emptyList();
    return new EcoreMetamodelDescriptor(classes, Collections.<EClass>unmodifiableSet(CollectionLiterals.<EClass>newHashSet()), false, enums, literals, references, attributes);
  }
  
  /**
   * Creates a <b>ViatraQuerySetDescriptor</b> from the provided metamodel, baseSpecifications and specifications.
   * Well-formedness patterns must be marked with the <b>@Constraint</b> annotation.
   * All the patterns referred by the <b>specifications</b> must be included in <b>baseSpecifications</b>. The non referred queries are filtered automatically.
   * 
   * @param metamodel
   * @param baseSpecifications
   * @param specifications
   */
  private static ViatraQuerySetDescriptor loadQueries(final EcoreMetamodelDescriptor metamodel) {
    try {
      final Pattern i = Pattern.instance();
      final List<IQuerySpecification<?>> patterns = IterableExtensions.<IQuerySpecification<?>>toList(i.getSpecifications());
      final Function1<IQuerySpecification<?>, Boolean> _function = (IQuerySpecification<?> it) -> {
        final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it_1) -> {
          String _name = it_1.getName();
          return Boolean.valueOf(Objects.equal(_name, "Constraint"));
        };
        return Boolean.valueOf(IterableExtensions.<PAnnotation>exists(it.getAllAnnotations(), _function_1));
      };
      final Set<IQuerySpecification<?>> wfPatterns = IterableExtensions.<IQuerySpecification<?>>toSet(IterableExtensions.<IQuerySpecification<?>>filter(patterns, _function));
      final LinkedHashMap<PQuery, EStructuralFeature> derivedFeatures = new LinkedHashMap<PQuery, EStructuralFeature>();
      final ViatraQuerySetDescriptor res = new ViatraQuerySetDescriptor(patterns, wfPatterns, derivedFeatures);
      return res;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Loads the initial model and registers the resource.
   */
  public static List<EObject> loadInitialModel(final FileSystemWorkspace location, final String fileName) {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
    return IteratorExtensions.<EObject>toList(location.<EObject>readModel(EObject.class, fileName).eResource().getAllContents());
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
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("solution");
              _builder.append(representationNumber);
              _builder.append(".partialinterpretation");
              workspace.writeModel(((EObject)representation), _builder.toString());
              final PartialInterpretation2Gml partialInterpretation2GML = new PartialInterpretation2Gml();
              final String gml = partialInterpretation2GML.transform(((PartialInterpretation)representation));
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("solutionVisualisation.gml");
              workspace.writeText(_builder_1.toString(), gml);
            } else {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("solution");
              _builder_2.append(representationNumber);
              _builder_2.append(".txt");
              workspace.writeText(_builder_2.toString(), representation.toString());
            }
          }
        }
        for (final EObject model : models) {
          workspace.writeModel(model, "model.xmi");
        }
        _xblockexpression = InputOutput.<String>println("Solution saved and visualised");
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
}
