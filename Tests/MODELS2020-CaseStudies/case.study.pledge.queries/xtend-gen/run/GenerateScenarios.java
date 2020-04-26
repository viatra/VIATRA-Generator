package run;

import Taxation.TaxationPackage;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class GenerateScenarios {
  public static void main(final String[] args) {
    try {
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      long _currentTimeMillis = System.currentTimeMillis();
      final Date date = new Date(_currentTimeMillis);
      final SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
      final String formattedDate = format.format(date);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("output/");
      String _plus = (_builder.toString() + formattedDate);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/");
      String _plus_1 = (_plus + _builder_1);
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_plus_1, "");
      workspace.initAndClear();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> map = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      map.put("logicproblem", _xMIResourceFactoryImpl);
      InputOutput.<String>println("Input and output workspaces are created");
      InputOutput.<EClass>print(IterableExtensions.<EClass>toList(Iterables.<EClass>filter(TaxationPackage.eINSTANCE.getEClassifiers(), EClass.class)).get(0));
      final EcoreMetamodelDescriptor metamodel = GenerateScenarios.loadMetamodel(TaxationPackage.eINSTANCE);
      InputOutput.<String>println("DSL loaded");
      final int SIZE = 10;
      int REPS = 1;
      final int RUNTIME = 300;
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      LogicProblem problem = modelGenerationProblem.getOutput();
      workspace.writeModel(problem, "scenario.logicproblem");
      InputOutput.<String>println("Problem created");
      for (int i = 0; (i <= REPS); i++) {
        {
          ViatraReasoner reasoner = new ViatraReasoner();
          ViatraReasonerConfiguration _viatraReasonerConfiguration = new ViatraReasonerConfiguration();
          final Procedure1<ViatraReasonerConfiguration> _function = (ViatraReasonerConfiguration it) -> {
            it.runtimeLimit = RUNTIME;
            it.typeScopes.maxNewElements = SIZE;
            it.typeScopes.minNewElements = SIZE;
          };
          final ViatraReasonerConfiguration solverConfig = ObjectExtensions.<ViatraReasonerConfiguration>operator_doubleArrow(_viatraReasonerConfiguration, _function);
          LogicResult solution = reasoner.solve(problem, solverConfig, workspace);
          InputOutput.<String>print("Problem Solved");
          final Runtime r = Runtime.getRuntime();
          r.gc();
          r.gc();
          r.gc();
          Thread.sleep(3000);
        }
      }
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
}
