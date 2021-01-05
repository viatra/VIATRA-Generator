package hu.bme.mit.inf.dslreasoner.diversitycalculator;

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MeasureInternalDiversity {
  private static final InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private static final PartialInterpretation2ImmutableTypeLattice neiguboirhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private static final Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private static Object init() {
    Object _xblockexpression = null;
    {
      LogiclanguagePackage.eINSTANCE.getClass();
      LogicproblemPackage.eINSTANCE.getClass();
      PartialinterpretationPackage.eINSTANCE.getClass();
      Ecore2logicannotationsPackage.eINSTANCE.getClass();
      Viatra2LogicAnnotationsPackage.eINSTANCE.getClass();
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _xblockexpression = _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    MeasureInternalDiversity.init();
  }
  
  public static void run(final EcoreMetamodelDescriptor metamodel, final String path, final String scenario) {
    final int range = 20;
    MeasureInternalDiversity.measureDiversity(metamodel, scenario, path, range);
  }
  
  public static void measureDiversity(final EcoreMetamodelDescriptor metamodel, final String scenario, final String path, final int depth) {
    final File file = new File(path);
    boolean _isDirectory = file.isDirectory();
    if (_isDirectory) {
      final String[] subfiles = file.list();
      final Function1<String, Boolean> _function = (String it) -> {
        return Boolean.valueOf(it.endsWith(".xmi"));
      };
      final Iterable<String> xmiSubfiles = IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(subfiles)), _function);
      boolean _isEmpty = IterableExtensions.isEmpty(xmiSubfiles);
      boolean _not = (!_isEmpty);
      if (_not) {
        final Function1<String, File> _function_1 = (String it) -> {
          return new File(((path + "/") + it));
        };
        MeasureInternalDiversity.measureDiversity(metamodel, scenario, file, IterableExtensions.<File>toList(IterableExtensions.<String, File>map(xmiSubfiles, _function_1)), path, depth);
      } else {
        for (final String subfile : subfiles) {
          MeasureInternalDiversity.measureDiversity(metamodel, scenario, ((path + "/") + subfile), depth);
        }
      }
    } else {
      boolean _isFile = file.isFile();
      if (_isFile) {
      }
    }
  }
  
  public static void measureDiversity(final EcoreMetamodelDescriptor metamodel, final String scenario, final File parent, final List<File> files, final String path, final int depth) {
    final FileSystemWorkspace workspace = new FileSystemWorkspace(path, "");
    for (final File file : files) {
      {
        Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
        final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTransformationOutput = MeasureInternalDiversity.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
        final EObject model = workspace.<EObject>readModel(EObject.class, file.getName());
        final PartialInterpretation partialModel = MeasureInternalDiversity.partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource(), false);
        final LinkedList<Map<? extends AbstractNodeDescriptor, Integer>> list = MeasureInternalDiversity.representationList(partialModel, depth);
        try {
          final String runIndex = MeasureInternalDiversity.runIndex(file.getName());
          final String modelIndex = MeasureInternalDiversity.modelIndex(file.getName());
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(scenario);
          _builder.append(";");
          _builder.append(runIndex);
          _builder.append(";");
          _builder.append(modelIndex);
          InputOutput.<String>print(_builder.toString());
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append(scenario);
            _builder_1.append(";0;");
            String _name = file.getName();
            _builder_1.append(_name);
            InputOutput.<String>print(_builder_1.toString());
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        int _size = list.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for (final Integer i : _doubleDotLessThan) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(";");
          int _size_1 = list.get((i).intValue()).keySet().size();
          _builder.append(_size_1);
          InputOutput.<String>print(_builder.toString());
        }
        int _size_2 = list.getLast().keySet().size();
        double _multiply = (_size_2 * 1.0);
        int _size_3 = partialModel.getNewElements().size();
        double _divide = (_multiply / _size_3);
        String _plus = (";" + Double.valueOf(_divide));
        InputOutput.<String>print(_plus);
        InputOutput.println();
      }
    }
  }
  
  protected static String runIndex(final String name) {
    return IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(name.split("\\.")))).split("_")[1];
  }
  
  protected static String modelIndex(final String name) {
    return IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(name.split("\\.")))).split("_")[2];
  }
  
  protected static LinkedList<Map<? extends AbstractNodeDescriptor, Integer>> representationList(final PartialInterpretation partialModel, final int depth) {
    final LinkedList<Map<? extends AbstractNodeDescriptor, Integer>> list = new LinkedList<Map<? extends AbstractNodeDescriptor, Integer>>();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, depth, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> neighbourhood = MeasureInternalDiversity.neiguboirhoodComputer.createRepresentation(partialModel, (i).intValue(), 0, 0);
        list.add(neighbourhood.getModelRepresentation());
      }
    }
    return list;
  }
}
