package hu.bme.mit.inf.dslreasoner.diversitycalculator;

import TaxationWithRoot.TaxationWithRootPackage;
import com.google.common.collect.Iterables;
import familytree.FamilytreePackage;
import hu.bme.mit.inf.dslreasoner.diversitycalculator.FileComparator;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import satellite.SatellitePackage;

@SuppressWarnings("all")
public class MeasureDiversity {
  public static class BenchmarkConfig {
    private int range;
    
    private int size;
    
    private PrintWriter writer;
    
    private String scenario;
  }
  
  private static final InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private static final PartialInterpretation2ImmutableTypeLattice neiguboirhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private static final Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  private static void init() {
    LogiclanguagePackage.eINSTANCE.getClass();
    LogicproblemPackage.eINSTANCE.getClass();
    PartialinterpretationPackage.eINSTANCE.getClass();
    Ecore2logicannotationsPackage.eINSTANCE.getClass();
    Viatra2LogicAnnotationsPackage.eINSTANCE.getClass();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
    ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, LocalSearchEMFBackendFactory.INSTANCE);
  }
  
  public static void main(final String[] args) {
    try {
      MeasureDiversity.init();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("inputs");
      final String path = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("FamilyTree");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Satellite");
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Taxation");
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append("FamilyTreeNoNum");
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append("SatelliteNoNum");
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append("TaxationNoNum");
      final List<String> scenarios = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_builder_1.toString(), _builder_2.toString(), _builder_3.toString(), _builder_4.toString(), _builder_5.toString(), _builder_6.toString()));
      final PrintWriter writer = new PrintWriter((path + "/diversity.csv"), "UTF-8");
      for (final String scenario : scenarios) {
        {
          final MeasureDiversity.BenchmarkConfig config = new MeasureDiversity.BenchmarkConfig();
          config.writer = writer;
          config.range = 3;
          config.scenario = scenario;
          MeasureDiversity.measureDiversity(scenario, ((path + "/") + scenario), config);
          InputOutput.<String>println((scenario + " finished"));
        }
      }
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void measureDiversity(final String scenario, final String path, final MeasureDiversity.BenchmarkConfig config) {
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
        MeasureDiversity.measureDiversity(scenario, file, IterableExtensions.<File>toList(IterableExtensions.<String, File>map(xmiSubfiles, _function_1)), path, config);
      } else {
        for (final String subfile : subfiles) {
          MeasureDiversity.measureDiversity(scenario, ((path + "/") + subfile), config);
        }
      }
    } else {
      boolean _isFile = file.isFile();
      if (_isFile) {
      }
    }
  }
  
  public static void measureDiversity(final String scenario, final File parent, final List<File> files, final String path, final MeasureDiversity.BenchmarkConfig config) {
    final int depth = config.range;
    final FileSystemWorkspace workspace = new FileSystemWorkspace(path, "");
    EcorePackage.eINSTANCE.eClass();
    TaxationWithRootPackage.eINSTANCE.eClass();
    SatellitePackage.eINSTANCE.eClass();
    FamilytreePackage.eINSTANCE.eClass();
    FileComparator _fileComparator = new FileComparator();
    files.sort(_fileComparator);
    final HashMap<File, List<Map<? extends AbstractNodeDescriptor, Integer>>> modelShapeLists = new HashMap<File, List<Map<? extends AbstractNodeDescriptor, Integer>>>();
    final HashMap<File, Map<? extends AbstractNodeDescriptor, Integer>> modelShapes = new HashMap<File, Map<? extends AbstractNodeDescriptor, Integer>>();
    for (final File file : files) {
      {
        final EObject model = workspace.<EObject>readModel(EObject.class, file.getName());
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
        final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTransformationOutput = MeasureDiversity.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
        final PartialInterpretation partialModelOutput = MeasureDiversity.partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource(), 
          false);
        final List<Map<? extends AbstractNodeDescriptor, Integer>> list = MeasureDiversity.shapeList(partialModelOutput, depth);
        modelShapes.put(file, list.get((depth - 1)));
      }
    }
    final PrintWriter writer = config.writer;
    InputOutput.<String>println("Printing internal diversity of models");
    for (final File model : files) {
      {
        final Map<? extends AbstractNodeDescriptor, Integer> modelshape = modelShapes.get(model);
        final Function2<Integer, Integer, Integer> _function = (Integer a, Integer b) -> {
          return Integer.valueOf(((a).intValue() + (b).intValue()));
        };
        final Integer amounts = IterableExtensions.<Integer>reduce(modelshape.values(), _function);
        int _size = modelshape.size();
        final double shapes = ((double) _size);
        writer.println(((((config.scenario + ",") + model) + ",") + Double.valueOf((shapes / (amounts).intValue()))));
      }
    }
  }
  
  public static ArrayList<List<File>> getRandomOrders(final List<File> files, final int number) {
    final ArrayList<List<File>> sequences = new ArrayList<List<File>>();
    for (int i = 0; (i < number); i++) {
      {
        final ArrayList<File> seq = new ArrayList<File>(files);
        Collections.shuffle(seq);
        sequences.add(seq);
      }
    }
    return sequences;
  }
  
  public static void printShapeNumbersOnRandomOrders(final List<File> files, final HashMap<File, Map<? extends AbstractNodeDescriptor, Integer>> shapes, final int number) {
    final ArrayList<List<File>> sequences = new ArrayList<List<File>>();
    InputOutput.<String>println("Printing generated random orders (models apper in original order)");
    for (int i = 0; (i < number); i++) {
      {
        final ArrayList<File> seq = new ArrayList<File>(files);
        Collections.shuffle(seq);
        sequences.add(seq);
        InputOutput.<String>println("Model;NewIndex");
        for (final File model : files) {
          String _plus = (model + ",");
          int _indexOf = seq.indexOf(model);
          String _plus_1 = (_plus + Integer.valueOf(_indexOf));
          InputOutput.<String>println(_plus_1);
        }
      }
    }
    InputOutput.<String>println("Printing generated random orders (models apper in original order)");
    InputOutput.<String>println("SeqNo;Index;Model;NewShapes;AllShapes");
    int seqindx = 0;
    for (final List<File> seq : sequences) {
      {
        final HashSet<AbstractNodeDescriptor> currshapes = new HashSet<AbstractNodeDescriptor>();
        int indx = 0;
        for (final File model : seq) {
          {
            final int beforesize = currshapes.size();
            currshapes.addAll(shapes.get(model).keySet());
            final int aftersize = currshapes.size();
            final int diff = (aftersize - beforesize);
            String _plus = (Integer.valueOf(seqindx) + ",");
            String _plus_1 = (_plus + Integer.valueOf(indx));
            String _plus_2 = (_plus_1 + ",");
            String _plus_3 = (_plus_2 + model);
            String _plus_4 = (_plus_3 + ",");
            String _plus_5 = (_plus_4 + Integer.valueOf(diff));
            String _plus_6 = (_plus_5 + ",");
            int _size = currshapes.size();
            String _plus_7 = (_plus_6 + Integer.valueOf(_size));
            InputOutput.<String>println(_plus_7);
            indx++;
          }
        }
        seqindx++;
      }
    }
  }
  
  public static void printShapeNumbers(final List<File> order, final Map<File, Map<? extends AbstractNodeDescriptor, Integer>> shapes) {
    InputOutput.<String>println("Model;InternalDiversity;NewShapes;AllCurrentShapes");
    final HashSet<AbstractNodeDescriptor> currshapes = new HashSet<AbstractNodeDescriptor>();
    for (final File file : order) {
      {
        final int beforesize = currshapes.size();
        currshapes.addAll(shapes.get(file).keySet());
        final int aftersize = currshapes.size();
        final int diff = (aftersize - beforesize);
        String _plus = (file + ",");
        int _size = shapes.get(file).size();
        String _plus_1 = (_plus + Integer.valueOf(_size));
        String _plus_2 = (_plus_1 + ",");
        String _plus_3 = (_plus_2 + Integer.valueOf(diff));
        String _plus_4 = (_plus_3 + ",");
        int _size_1 = currshapes.size();
        String _plus_5 = (_plus_4 + Integer.valueOf(_size_1));
        InputOutput.<String>println(_plus_5);
      }
    }
  }
  
  protected static String runIndex(final String name) {
    final String res = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(name.split("\\.")))).split("_")[0];
    boolean _startsWith = res.startsWith("result");
    if (_startsWith) {
      return res.substring(6);
    } else {
      return res;
    }
  }
  
  protected static String modelIndex(final String name) {
    return IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(name.split("\\.")))).split("_")[1];
  }
  
  protected static LinkedList<Set<Integer>> representationList(final PartialInterpretation partialModel, final int depth) {
    final LinkedList<Set<Integer>> list = new LinkedList<Set<Integer>>();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, depth, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> neighbourhood = MeasureDiversity.neiguboirhoodComputer.createRepresentation(partialModel, (i).intValue(), 0, 0);
        final Function1<AbstractNodeDescriptor, Integer> _function = (AbstractNodeDescriptor it) -> {
          return Integer.valueOf(it.hashCode());
        };
        list.add(IterableExtensions.<Integer>toSet(IterableExtensions.map(neighbourhood.getModelRepresentation().keySet(), _function)));
      }
    }
    return list;
  }
  
  protected static List<Map<? extends AbstractNodeDescriptor, Integer>> shapeList(final PartialInterpretation partialModel, final int depth) {
    final LinkedList<Map<? extends AbstractNodeDescriptor, Integer>> list = new LinkedList<Map<? extends AbstractNodeDescriptor, Integer>>();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, depth, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> neighbourhood = MeasureDiversity.neiguboirhoodComputer.createRepresentation(partialModel, (i).intValue(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        final EList<DefinedElement> openWorldElements = partialModel.getOpenWorldElements();
        final Function1<DefinedElement, AbstractNodeDescriptor> _function = (DefinedElement it) -> {
          return neighbourhood.getNodeRepresentations().get(it);
        };
        final Set<AbstractNodeDescriptor> representationsOfOpenElements = IterableExtensions.<AbstractNodeDescriptor>toSet(ListExtensions.<DefinedElement, AbstractNodeDescriptor>map(openWorldElements, _function));
        Map<? extends AbstractNodeDescriptor, Integer> _modelRepresentation = neighbourhood.getModelRepresentation();
        final HashMap<AbstractNodeDescriptor, Integer> allElementRepresentation = new HashMap<AbstractNodeDescriptor, Integer>(_modelRepresentation);
        final Consumer<AbstractNodeDescriptor> _function_1 = (AbstractNodeDescriptor it) -> {
          allElementRepresentation.remove(it);
        };
        representationsOfOpenElements.forEach(_function_1);
        final Map<Integer, Integer> hashedRepresentation = new HashMap<Integer, Integer>();
        Set<Map.Entry<AbstractNodeDescriptor, Integer>> _entrySet = allElementRepresentation.entrySet();
        for (final Map.Entry<AbstractNodeDescriptor, Integer> entry : _entrySet) {
          hashedRepresentation.put(Integer.valueOf(entry.getKey().getDataHash()), entry.getValue());
        }
        list.add(allElementRepresentation);
      }
    }
    return list;
  }
}
