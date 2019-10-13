package ca.mcgill.ecse.dslreasoner.vampire.icse;

import ca.mcgill.ecse.dslreasoner.vampire.icse.GeneralTest;
import ca.mcgill.ecse.dslreasoner.vampire.queries.Patterns;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.BackendSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.CompositeElement;
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Region;
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition;
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicTrace;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class YakinduTest {
  public static void main(final String[] args) {
    try {
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      long _currentTimeMillis = System.currentTimeMillis();
      final Date date = new Date(_currentTimeMillis);
      final SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
      final String formattedDate = format.format(date);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initialModels/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("output/YakinduTest/");
      final FileSystemWorkspace dataWorkspace = new FileSystemWorkspace(_builder_1.toString(), "");
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("output/YakinduTest/");
      String _plus = (_builder_2.toString() + formattedDate);
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("/");
      String _plus_1 = (_plus + _builder_3);
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_plus_1, "");
      workspace.initAndClear();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> map = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      map.put("logicproblem", _xMIResourceFactoryImpl);
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = GeneralTest.loadMetamodel(YakindummPackage.eINSTANCE);
      final EList<EObject> partialModel = GeneralTest.loadPartialModel(inputs, "yakindu/Yakindu.xmi");
      final ViatraQuerySetDescriptor queries = GeneralTest.loadQueries(metamodel, Patterns.instance());
      InputOutput.<String>println("DSL loaded");
      int SZ_TOP = 150;
      int SZ_BOT = 150;
      int INC = 10;
      int REPS = 10;
      final int RUNTIME = 300;
      final int EXACT = (-1);
      if ((EXACT != (-1))) {
        SZ_TOP = EXACT;
        SZ_BOT = EXACT;
        INC = 1;
        REPS = 10;
      }
      final ArrayList<BackendSolver> BACKENDSOLVERS = CollectionLiterals.<BackendSolver>newArrayList(
        BackendSolver.Z3);
      String str = "";
      for (final BackendSolver solver : BACKENDSOLVERS) {
        String _str = str;
        String _substring = solver.name().substring(0, 1);
        str = (_str + _substring);
      }
      URI _workspaceURI = dataWorkspace.getWorkspaceURI();
      String _plus_2 = (_workspaceURI + "//_stats");
      String _plus_3 = (_plus_2 + formattedDate);
      String _plus_4 = (_plus_3 + "-");
      String _plus_5 = (_plus_4 + str);
      String _plus_6 = (_plus_5 + Integer.valueOf(SZ_BOT));
      String _plus_7 = (_plus_6 + "to");
      String _plus_8 = (_plus_7 + Integer.valueOf(SZ_TOP));
      String _plus_9 = (_plus_8 + "by");
      String _plus_10 = (_plus_9 + Integer.valueOf(INC));
      String _plus_11 = (_plus_10 + 
        "x");
      String _plus_12 = (_plus_11 + Integer.valueOf(REPS));
      String _plus_13 = (_plus_12 + ".csv");
      PrintWriter writer = new PrintWriter(_plus_13);
      writer.append("solver,size,transTime,sat?,satTime,model?,modelTime\n");
      ArrayList<Object> solverTimes = CollectionLiterals.<Object>newArrayList();
      ArrayList<Object> transformationTimes = CollectionLiterals.<Object>newArrayList();
      LogicResult solution = null;
      for (final BackendSolver BESOLVER : BACKENDSOLVERS) {
        {
          int i = SZ_BOT;
          boolean _while = (i <= SZ_TOP);
          while (_while) {
            {
              final int num = ((i - SZ_BOT) / INC);
              InputOutput.println();
              String _name = BESOLVER.name();
              String _plus_14 = ("SOLVER: " + _name);
              String _plus_15 = (_plus_14 + ", SIZE=");
              String _plus_16 = (_plus_15 + Integer.valueOf(i));
              InputOutput.<String>println(_plus_16);
              InputOutput.println();
              solverTimes.clear();
              transformationTimes.clear();
              for (int j = 0; (j < REPS); j++) {
                {
                  InputOutput.<String>print((("<<Run number " + Integer.valueOf(j)) + ">> :"));
                  Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
                  final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
                  TracedOutput<LogicProblem, Ecore2Logic_Trace> modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel);
                  Viatra2LogicConfiguration _viatra2LogicConfiguration = new Viatra2LogicConfiguration();
                  TracedOutput<LogicProblem, Viatra2LogicTrace> validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem, _viatra2LogicConfiguration);
                  LogicProblem problem = modelGenerationProblem.getOutput();
                  long startTime = System.currentTimeMillis();
                  VampireSolver reasoner = null;
                  VampireSolver _vampireSolver = new VampireSolver();
                  reasoner = _vampireSolver;
                  final HashMap<Class, Integer> classMapMin = new HashMap<Class, Integer>();
                  classMapMin.put(Region.class, Integer.valueOf(1));
                  classMapMin.put(Transition.class, Integer.valueOf(2));
                  classMapMin.put(CompositeElement.class, Integer.valueOf(3));
                  final Map<Type, Integer> typeMapMin = GeneralTest.getTypeMap(classMapMin, metamodel, ecore2Logic, 
                    modelGenerationProblem.getTrace());
                  final HashMap<Class, Integer> classMapMax = new HashMap<Class, Integer>();
                  classMapMax.put(Region.class, Integer.valueOf(5));
                  classMapMax.put(Transition.class, Integer.valueOf(2));
                  final Map<Type, Integer> typeMapMax = GeneralTest.getTypeMap(classMapMax, metamodel, ecore2Logic, 
                    modelGenerationProblem.getTrace());
                  final int size = i;
                  final int inc = INC;
                  final int iter = j;
                  VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
                  final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
                    it.documentationLevel = DocumentationLevel.FULL;
                    it.iteration = iter;
                    it.runtimeLimit = RUNTIME;
                    it.typeScopes.minNewElements = size;
                    it.genModel = true;
                    it.server = true;
                    it.solver = BESOLVER;
                    it.contCycleLevel = 5;
                    it.uniquenessDuplicates = false;
                  };
                  final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
                  solution = reasoner.solve(problem, vampireConfig, workspace);
                  String _name_1 = vampireConfig.solver.name();
                  String _plus_17 = (_name_1 + ",");
                  writer.append(_plus_17);
                  String _plus_18 = (Integer.valueOf(size) + ",");
                  writer.append(_plus_18);
                  int _transformationTime = solution.getStatistics().getTransformationTime();
                  double _divide = (_transformationTime / 1000.0);
                  String _plus_19 = (Double.valueOf(_divide) + ",");
                  writer.append(_plus_19);
                  final Function1<StatisticEntry, Boolean> _function_1 = (StatisticEntry it) -> {
                    String _name_2 = it.getName();
                    return Boolean.valueOf(Objects.equal(_name_2, "satOut"));
                  };
                  StatisticEntry _get = ((StatisticEntry[])Conversions.unwrapArray(IterableExtensions.<StatisticEntry>filter(solution.getStatistics().getEntries(), _function_1), StatisticEntry.class))[0];
                  final String satOut = ((StringStatisticEntry) _get).getValue();
                  final Function1<StatisticEntry, Boolean> _function_2 = (StatisticEntry it) -> {
                    String _name_2 = it.getName();
                    return Boolean.valueOf(Objects.equal(_name_2, "satTime"));
                  };
                  StatisticEntry _get_1 = ((StatisticEntry[])Conversions.unwrapArray(IterableExtensions.<StatisticEntry>filter(solution.getStatistics().getEntries(), _function_2), StatisticEntry.class))[0];
                  final double satTime = ((RealStatisticEntry) _get_1).getValue();
                  final Function1<StatisticEntry, Boolean> _function_3 = (StatisticEntry it) -> {
                    String _name_2 = it.getName();
                    return Boolean.valueOf(Objects.equal(_name_2, "modOut"));
                  };
                  StatisticEntry _get_2 = ((StatisticEntry[])Conversions.unwrapArray(IterableExtensions.<StatisticEntry>filter(solution.getStatistics().getEntries(), _function_3), StatisticEntry.class))[0];
                  final String modOut = ((StringStatisticEntry) _get_2).getValue();
                  final Function1<StatisticEntry, Boolean> _function_4 = (StatisticEntry it) -> {
                    String _name_2 = it.getName();
                    return Boolean.valueOf(Objects.equal(_name_2, "modTime"));
                  };
                  StatisticEntry _get_3 = ((StatisticEntry[])Conversions.unwrapArray(IterableExtensions.<StatisticEntry>filter(solution.getStatistics().getEntries(), _function_4), StatisticEntry.class))[0];
                  final double modTime = ((RealStatisticEntry) _get_3).getValue();
                  writer.append((satOut + ","));
                  String _plus_20 = (Double.valueOf(satTime) + ",");
                  writer.append(_plus_20);
                  writer.append((modOut + ","));
                  String _plus_21 = (Double.valueOf(modTime) + "");
                  writer.append(_plus_21);
                  writer.append("\n");
                }
              }
            }
            int _i = i;
            i = (_i + INC);
            _while = (i <= SZ_TOP);
          }
        }
      }
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
