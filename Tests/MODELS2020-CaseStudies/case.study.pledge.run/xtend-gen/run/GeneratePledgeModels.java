package run;

import Taxation.TaxationPackage;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DebugConfiguration;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
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
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
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
public class GeneratePledgeModels {
  public static void main(final String[] args) {
    try {
      final Injector x = new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      Map<String, Object> _extensionToFactoryMap_1 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
      _extensionToFactoryMap_1.put("logicproblem", _xMIResourceFactoryImpl_1);
      Map<String, Object> _extensionToFactoryMap_2 = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl_2 = new XMIResourceFactoryImpl();
      _extensionToFactoryMap_2.put("partialmodel", _xMIResourceFactoryImpl_2);
      ReteEngine.class.getClass();
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      long _currentTimeMillis = System.currentTimeMillis();
      final Date date = new Date(_currentTimeMillis);
      final SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
      final String formattedDate = format.format(date);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("inputs/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("output/");
      String _plus = (_builder_1.toString() + formattedDate);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/");
      String _plus_1 = (_plus + _builder_2);
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_plus_1, "");
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("output/");
      String _plus_2 = (_builder_3.toString() + formattedDate);
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("/debug/");
      String _plus_3 = (_plus_2 + _builder_4);
      final FileSystemWorkspace debug = new FileSystemWorkspace(_plus_3, "");
      workspace.initAndClear();
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = GeneratePledgeModels.loadMetamodel(TaxationPackage.eINSTANCE);
      final EList<EObject> partialModel = GeneratePledgeModels.loadPartialModel(inputs, "Household.xmi");
      InputOutput.<String>println("DSL loaded");
      final int SIZE = 2;
      int REPS = 1;
      final int RUNTIME = 600;
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      LogicProblem problem = modelGenerationProblem.getOutput();
      debug.writeModel(problem, "problem.logicproblem");
      InputOutput.<String>println("Problem created");
      for (int i = 0; (i < REPS); i++) {
        {
          ViatraReasoner reasoner = new ViatraReasoner();
          final TreeSet<Integer> knownIntegers = new TreeSet<Integer>();
          CollectionExtensions.<Integer>addAll(knownIntegers, Integer.valueOf(0));
          final TreeSet<BigDecimal> knownReals = new TreeSet<BigDecimal>();
          BigDecimal _bigDecimal = new BigDecimal("0.0");
          CollectionExtensions.<BigDecimal>addAll(knownReals, _bigDecimal);
          final TreeSet<String> knownStrings = new TreeSet<String>();
          CollectionExtensions.<String>addAll(knownStrings, "r0", "r1", "r2");
          ViatraReasonerConfiguration _viatraReasonerConfiguration = new ViatraReasonerConfiguration();
          final Procedure1<ViatraReasonerConfiguration> _function = (ViatraReasonerConfiguration it) -> {
            it.documentationLevel = DocumentationLevel.FULL;
            DebugConfiguration _debugConfiguration = new DebugConfiguration();
            final Procedure1<DebugConfiguration> _function_1 = (DebugConfiguration it_1) -> {
              it_1.logging = true;
            };
            DebugConfiguration _doubleArrow = ObjectExtensions.<DebugConfiguration>operator_doubleArrow(_debugConfiguration, _function_1);
            it.debugCongiguration = _doubleArrow;
            it.runtimeLimit = RUNTIME;
            boolean _isEmpty = knownIntegers.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              it.typeScopes.knownIntegers = knownIntegers;
            }
            boolean _isEmpty_1 = knownReals.isEmpty();
            boolean _not_1 = (!_isEmpty_1);
            if (_not_1) {
              it.typeScopes.knownReals = knownReals;
            }
          };
          final ViatraReasonerConfiguration solverConfig = ObjectExtensions.<ViatraReasonerConfiguration>operator_doubleArrow(_viatraReasonerConfiguration, _function);
          InputOutput.<String>println((("Run #" + Integer.valueOf(i)) + ":"));
          final long startTime = System.currentTimeMillis();
          LogicResult solution = reasoner.solve(problem, solverConfig, debug);
          long _currentTimeMillis_1 = System.currentTimeMillis();
          final long totalTime = (_currentTimeMillis_1 - startTime);
          InputOutput.<String>println("  Problem Solved");
          GeneratePledgeModels.writeStats(solution, totalTime, solverConfig);
          if ((solution instanceof ModelResult)) {
            GeneratePledgeModels.writeRepresentation(solution, workspace, i);
            GeneratePledgeModels.writeInterpretation(solution, logic2Ecore, workspace, i, reasoner, modelGenerationProblem);
            InputOutput.<String>println("  Solution saved and visualised");
          } else {
            String _string = solution.getClass().getSimpleName().toString();
            String _plus_4 = ("  Returned: " + _string);
            InputOutput.<String>println(_plus_4);
          }
          final Runtime r = Runtime.getRuntime();
          r.gc();
          r.gc();
          r.gc();
          Thread.sleep(3000);
        }
      }
      InputOutput.<String>println("---End---");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Map<Type, Integer> getTypeMap(final Map<Class, Integer> classMap, final EcoreMetamodelDescriptor metamodel, final Ecore2Logic e2l, final Ecore2Logic_Trace trace) {
    final HashMap<Type, Integer> typeMap = new HashMap<Type, Integer>();
    final Function1<EClass, String> _function = (EClass s) -> {
      return s.getName();
    };
    final Map<String, EClass> listMap = IterableExtensions.<String, EClass>toMap(metamodel.getClasses(), _function);
    Set<Class> _keySet = classMap.keySet();
    for (final Class elem : _keySet) {
      typeMap.put(
        e2l.TypeofEClass(trace, 
          listMap.get(elem.getSimpleName())), classMap.get(elem));
    }
    return typeMap;
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
  
  public static ViatraQuerySetDescriptor loadQueries(final EcoreMetamodelDescriptor metamodel, final IQueryGroup i) {
    final List<IQuerySpecification<?>> patterns = IterableExtensions.<IQuerySpecification<?>>toList(i.getSpecifications());
    final Function1<IQuerySpecification<?>, Boolean> _function = (IQuerySpecification<?> it) -> {
      final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it_1) -> {
        String _name = it_1.getName();
        return Boolean.valueOf(Objects.equal(_name, "Constraint"));
      };
      return Boolean.valueOf(IterableExtensions.<PAnnotation>exists(it.getAllAnnotations(), _function_1));
    };
    final Set<IQuerySpecification<?>> wfPatterns = IterableExtensions.<IQuerySpecification<?>>toSet(IterableExtensions.<IQuerySpecification<?>>filter(patterns, _function));
    final Map<IQuerySpecification<?>, EStructuralFeature> derivedFeatures = CollectionLiterals.<IQuerySpecification<?>, EStructuralFeature>emptyMap();
    final ViatraQuerySetDescriptor res = new ViatraQuerySetDescriptor(patterns, wfPatterns, derivedFeatures);
    return res;
  }
  
  public static void writeInterpretation(final LogicResult solution, final Logic2Ecore logic2Ecore, final ReasonerWorkspace workspace, final int i, final ViatraReasoner reasoner, final TracedOutput<LogicProblem, Ecore2Logic_Trace> mgProb) {
    final List<? extends LogicModelInterpretation> interpretations = reasoner.getInterpretations(((ModelResult) solution));
    int _size = interpretations.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer interpIndex : _doubleDotLessThan) {
      {
        final LogicModelInterpretation interpretation = interpretations.get((interpIndex).intValue());
        final EObject model = logic2Ecore.transformInterpretation(interpretation, mgProb.getTrace());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("solution");
        _builder.append(i);
        _builder.append("_");
        _builder.append(interpIndex);
        _builder.append(".xmi");
        workspace.writeModel(model, _builder.toString());
      }
    }
  }
  
  public static void writeRepresentation(final LogicResult solution, final ReasonerWorkspace workspace, final int i) {
    final EList<Object> representations = solution.getRepresentation();
    int _size = representations.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer representationIndex : _doubleDotLessThan) {
      {
        final Object representation = representations.get((representationIndex).intValue());
        if ((representation instanceof PartialInterpretation)) {
          final String gml = new PartialInterpretation2Gml().transform(((PartialInterpretation)representation));
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("solution");
          _builder.append(i);
          _builder.append("_");
          _builder.append(representationIndex);
          _builder.append(".gml");
          workspace.writeText(_builder.toString(), gml);
          final PartialInterpretationVisualisation png = new GraphvizVisualiser().visualiseConcretization(((PartialInterpretation)representation));
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("solution");
          _builder_1.append(i);
          _builder_1.append("_");
          _builder_1.append(representationIndex);
          _builder_1.append(".png");
          png.writeToFile(workspace, _builder_1.toString());
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("solution");
          _builder_2.append(representationIndex);
          _builder_2.append(".txt");
          workspace.writeText(_builder_2.toString(), representation.toString());
        }
      }
    }
  }
  
  public static String writeStats(final LogicResult solution, final long time, final ViatraReasonerConfiguration config) {
    String _xblockexpression = null;
    {
      final Statistics stats = solution.getStatistics();
      InputOutput.<String>println("  Statistics:");
      Object _xifexpression = null;
      if ((config.typeScopes.maxNewElements == 2147483647)) {
        _xifexpression = "*";
      } else {
        _xifexpression = Integer.valueOf(config.typeScopes.maxNewElements);
      }
      String _plus = ((("    #new nodes    : [" + Integer.valueOf(config.typeScopes.minNewElements)) + "..") + _xifexpression);
      String _plus_1 = (_plus + "]");
      InputOutput.<String>println(_plus_1);
      _xblockexpression = InputOutput.<String>println((("    \"solve\" time: " + Double.valueOf((((double) time) / 1000))) + " s"));
    }
    return _xblockexpression;
  }
}
