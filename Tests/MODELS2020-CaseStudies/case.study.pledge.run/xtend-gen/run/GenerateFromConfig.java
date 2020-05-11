package run;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Command;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Config;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigEntry;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigSpecification;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.File;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileSpecification;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntervallNumber;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.NumberSpecification;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectTypeScope;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RuntimeEntry;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Scope;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeSpecification;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.TypeScope;
import hu.bme.mit.inf.dslreasoner.application.execution.ScriptExecutor;
import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class GenerateFromConfig {
  private static final int SIZE_LB = 1;
  
  private static final int SIZE_UB = 1;
  
  private static final int SIZE_MUL = 1;
  
  private static final int SIZE_INC = 5;
  
  private static int REPS = 1;
  
  private static final int RUNTIME = 2100;
  
  private static final String DOMAIN = "Taxation";
  
  private static final boolean QUERIES = true;
  
  private static final boolean INITIAL = true;
  
  private static final boolean INDIV_WRT = true;
  
  private static final boolean GLOBAL_WRT = true;
  
  private static final String q2t = new Function0<String>() {
    @Override
    public String apply() {
      String _xifexpression = null;
      if (GenerateFromConfig.QUERIES) {
        _xifexpression = "Y";
      } else {
        _xifexpression = "N";
      }
      return _xifexpression;
    }
  }.apply();
  
  public static void main(final String[] args) {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      long _currentTimeMillis = System.currentTimeMillis();
      final Date date = new Date(_currentTimeMillis);
      final SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
      String _format = format.format(date);
      final String formattedDate = ((GenerateFromConfig.DOMAIN + "-") + _format);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("output/");
      String _plus = (_builder.toString() + formattedDate);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/");
      String _plus_1 = (_plus + _builder_1);
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_plus_1, "");
      workspace.initAndClear();
      InputOutput.<String>println("Input and output workspaces are created");
      final ScriptExecutor executor = new ScriptExecutor();
      final String path = (("config//generic" + GenerateFromConfig.DOMAIN) + ".vsconfig");
      ConfigurationScript config = StandaloneScriptExecutor.loadScript(path);
      InputOutput.<String>println("Config File loaded");
      PrintWriter global_writer = null;
      final String header = "domain, queries?,size,model?,timeout,measuredTime,TransformatonTime,SolverTime\n";
      if (GenerateFromConfig.GLOBAL_WRT) {
        URI _workspaceURI = workspace.getWorkspaceURI();
        String _plus_2 = (_workspaceURI + "//_");
        String _plus_3 = (_plus_2 + GenerateFromConfig.DOMAIN);
        String _plus_4 = (_plus_3 + Integer.valueOf(GenerateFromConfig.SIZE_LB));
        String _plus_5 = (_plus_4 + "to");
        String _plus_6 = (_plus_5 + Integer.valueOf(GenerateFromConfig.SIZE_UB));
        String _plus_7 = (_plus_6 + "x");
        String _plus_8 = (_plus_7 + Integer.valueOf(GenerateFromConfig.REPS));
        String _plus_9 = (_plus_8 + "q");
        String _plus_10 = (_plus_9 + GenerateFromConfig.q2t);
        String _plus_11 = (_plus_10 + "-");
        String _plus_12 = (_plus_11 + formattedDate);
        String _plus_13 = (_plus_12 + ".csv");
        PrintWriter _printWriter = new PrintWriter(_plus_13);
        global_writer = _printWriter;
        global_writer.append(header);
      }
      int NEXT_INC = GenerateFromConfig.SIZE_INC;
      {
        int size = GenerateFromConfig.SIZE_LB;
        boolean _while = (size <= GenerateFromConfig.SIZE_UB);
        while (_while) {
          {
            int _NEXT_INC = NEXT_INC;
            NEXT_INC = (_NEXT_INC * GenerateFromConfig.SIZE_MUL);
            PrintWriter indiv_writer = null;
            if (GenerateFromConfig.INDIV_WRT) {
              URI _workspaceURI_1 = workspace.getWorkspaceURI();
              String _plus_14 = (_workspaceURI_1 + "//__");
              String _plus_15 = (_plus_14 + GenerateFromConfig.DOMAIN);
              String _plus_16 = (_plus_15 + "Sz");
              String _plus_17 = (_plus_16 + Integer.valueOf(size));
              String _plus_18 = (_plus_17 + "x");
              String _plus_19 = (_plus_18 + Integer.valueOf(GenerateFromConfig.REPS));
              String _plus_20 = (_plus_19 + "q");
              String _plus_21 = (_plus_20 + GenerateFromConfig.q2t);
              String _plus_22 = (_plus_21 + "-");
              String _plus_23 = (_plus_22 + formattedDate);
              String _plus_24 = (_plus_23 + 
                ".csv");
              PrintWriter _printWriter_1 = new PrintWriter(_plus_24);
              indiv_writer = _printWriter_1;
              indiv_writer.append(header);
            }
            InputOutput.println();
            InputOutput.<String>println(((("DOMAIN: " + GenerateFromConfig.DOMAIN) + ", SIZE=") + Integer.valueOf(size)));
            for (int i = 0; (i < GenerateFromConfig.REPS); i++) {
              {
                InputOutput.<String>print((("<<Run number " + Integer.valueOf(i)) + ">> : "));
                final ArrayList<Integer> knownIntegers = new ArrayList<Integer>();
                CollectionExtensions.<Integer>addAll(knownIntegers, Integer.valueOf(0), Integer.valueOf(10), Integer.valueOf(20), Integer.valueOf(30), Integer.valueOf(40), Integer.valueOf(50));
                final ArrayList<BigDecimal> knownReals = new ArrayList<BigDecimal>();
                BigDecimal _bigDecimal = new BigDecimal("0.0");
                CollectionExtensions.<BigDecimal>addAll(knownReals, _bigDecimal);
                final ArrayList<String> knownStrings = new ArrayList<String>();
                CollectionExtensions.<String>addAll(knownStrings, "r0", "r1", "r2", "r3", "r4", "r5", "r6");
                final String outputPath = (((((("output/" + formattedDate) + "/size") + Integer.valueOf(size)) + "/run") + Integer.valueOf(i)) + "/models/");
                final String debugPath = (((((("output/" + formattedDate) + "/size") + Integer.valueOf(size)) + "/run") + Integer.valueOf(i)) + "/debug/");
                final String logPath = (debugPath + "log.txt");
                final String statsPath = (debugPath + "statistics.csv");
                Command _get = config.getCommands().get(0);
                final GenerationTask genTask = ((GenerationTask) _get);
                if ((!GenerateFromConfig.QUERIES)) {
                  genTask.setPatterns(null);
                }
                if ((!GenerateFromConfig.INITIAL)) {
                  genTask.setPartialModel(null);
                }
                Scope _scope = genTask.getScope();
                final ScopeSpecification scopeSpec = ((ScopeSpecification) _scope);
                TypeScope _get_1 = scopeSpec.getScopes().get(0);
                final ObjectTypeScope objScope = ((ObjectTypeScope) _get_1);
                NumberSpecification _number = objScope.getNumber();
                final IntervallNumber interval = ((IntervallNumber) _number);
                interval.setMin(size);
                interval.setMaxUnlimited(true);
                Config _config = genTask.getConfig();
                final ConfigSpecification configScope = ((ConfigSpecification) _config);
                ConfigEntry _get_2 = configScope.getEntries().get(0);
                final RuntimeEntry runtimeEntry = ((RuntimeEntry) _get_2);
                runtimeEntry.setMillisecLimit(GenerateFromConfig.RUNTIME);
                File _debugFolder = genTask.getDebugFolder();
                final FileSpecification debug = ((FileSpecification) _debugFolder);
                debug.setPath(debugPath);
                File _tagetFolder = genTask.getTagetFolder();
                final FileSpecification output = ((FileSpecification) _tagetFolder);
                output.setPath(outputPath);
                File _targetLogFile = genTask.getTargetLogFile();
                final FileSpecification log = ((FileSpecification) _targetLogFile);
                log.setPath(logPath);
                File _targetStatisticsFile = genTask.getTargetStatisticsFile();
                final FileSpecification stats = ((FileSpecification) _targetStatisticsFile);
                stats.setPath(statsPath);
                final long startTime = System.currentTimeMillis();
                NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
                executor.executeScript(config, _nullProgressMonitor);
                long _currentTimeMillis_1 = System.currentTimeMillis();
                final long measuredTime = (_currentTimeMillis_1 - startTime);
                InputOutput.<String>println((("<<END ->" + Double.valueOf((measuredTime / 1000.0))) + "s >>\n"));
                final Runtime r = Runtime.getRuntime();
                r.gc();
                r.gc();
                r.gc();
                Thread.sleep(3000);
              }
            }
            if (GenerateFromConfig.INDIV_WRT) {
              indiv_writer.close();
            }
          }
          int _size = size;
          size = (_size + NEXT_INC);
          _while = (size <= GenerateFromConfig.SIZE_UB);
        }
      }
      if (GenerateFromConfig.GLOBAL_WRT) {
        global_writer.close();
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
  
  public static void writeInterpretation(final LogicResult solution, final Logic2Ecore logic2Ecore, final ReasonerWorkspace workspace, final String id, final ViatraReasoner reasoner, final TracedOutput<LogicProblem, Ecore2Logic_Trace> mgProb) {
    final List<? extends LogicModelInterpretation> interpretations = reasoner.getInterpretations(((ModelResult) solution));
    int _size = interpretations.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer interpIndex : _doubleDotLessThan) {
      {
        final LogicModelInterpretation interpretation = interpretations.get((interpIndex).intValue());
        final EObject model = logic2Ecore.transformInterpretation(interpretation, mgProb.getTrace());
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("sol-");
        _builder.append(id);
        _builder.append("_");
        _builder.append(interpIndex);
        _builder.append(".xmi");
        workspace.writeModel(model, _builder.toString());
      }
    }
  }
  
  public static void writeRepresentation(final LogicResult solution, final ReasonerWorkspace workspace, final String id) {
    final EList<Object> representations = solution.getRepresentation();
    int _size = representations.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer representationIndex : _doubleDotLessThan) {
      {
        final Object representation = representations.get((representationIndex).intValue());
        if ((representation instanceof PartialInterpretation)) {
          final String gml = new PartialInterpretation2Gml().transform(((PartialInterpretation)representation));
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("sol-");
          _builder.append(id);
          _builder.append("_");
          _builder.append(representationIndex);
          _builder.append(".gml");
          workspace.writeText(_builder.toString(), gml);
          final PartialInterpretationVisualisation png = new GraphvizVisualiser().visualiseConcretization(((PartialInterpretation)representation));
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("sol-");
          _builder_1.append(id);
          _builder_1.append("_");
          _builder_1.append(representationIndex);
          _builder_1.append(".png");
          png.writeToFile(workspace, _builder_1.toString());
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("sol-");
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
