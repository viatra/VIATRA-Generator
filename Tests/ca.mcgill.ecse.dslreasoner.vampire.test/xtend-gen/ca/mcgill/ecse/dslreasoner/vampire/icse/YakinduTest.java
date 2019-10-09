package ca.mcgill.ecse.dslreasoner.vampire.icse;

import ca.mcgill.ecse.dslreasoner.vampire.icse.GeneralTest;
import ca.mcgill.ecse.dslreasoner.vampire.queries.Patterns;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
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
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
      final SimpleDateFormat format = new SimpleDateFormat("MMdd-HHmmss");
      final String formattedDate = format.format(date);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initialModels/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("output/YakinduTest/");
      String _plus = (_builder_1.toString() + formattedDate);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("/");
      String _plus_1 = (_plus + _builder_2);
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
      int MAX = 80;
      int START = 79;
      int INC = 1;
      int REPS = 3;
      final int EXACT = 130;
      if ((EXACT != (-1))) {
        MAX = EXACT;
        START = EXACT;
        INC = 5;
        REPS = 1;
      }
      URI _workspaceURI = workspace.getWorkspaceURI();
      String _plus_2 = (_workspaceURI + "//_yakinduStats.csv");
      PrintWriter writer = new PrintWriter(_plus_2);
      writer.append("size,");
      for (int x = 0; (x < REPS); x++) {
        writer.append(((((("tTransf" + Integer.valueOf(x)) + ",") + "tSolv") + Integer.valueOf(x)) + ","));
      }
      writer.append("medSolv,medTransf\n");
      ArrayList<Double> solverTimes = CollectionLiterals.<Double>newArrayList();
      ArrayList<Double> transformationTimes = CollectionLiterals.<Double>newArrayList();
      boolean modelFound = true;
      LogicResult solution = null;
      {
        int i = START;
        boolean _while = (i <= MAX);
        while (_while) {
          {
            final int num = ((i - START) / INC);
            InputOutput.<String>print((((("Generation " + Integer.valueOf(num)) + ": SIZE=") + Integer.valueOf(i)) + " Attempt: "));
            String _plus_3 = (Integer.valueOf(i) + ",");
            writer.append(_plus_3);
            solverTimes.clear();
            transformationTimes.clear();
            modelFound = true;
            for (int j = 0; (j < REPS); j++) {
              {
                InputOutput.<Integer>print(Integer.valueOf(j));
                Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
                final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
                TracedOutput<LogicProblem, Ecore2Logic_Trace> modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel);
                Viatra2LogicConfiguration _viatra2LogicConfiguration = new Viatra2LogicConfiguration();
                TracedOutput<LogicProblem, Viatra2LogicTrace> validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem, _viatra2LogicConfiguration);
                LogicProblem problem = modelGenerationProblem.getOutput();
                workspace.writeModel(problem, "Yakindu.logicproblem");
                long startTime = System.currentTimeMillis();
                VampireSolver reasoner = null;
                VampireSolver _vampireSolver = new VampireSolver();
                reasoner = _vampireSolver;
                final int size = i;
                final int inc = INC;
                final int iter = j;
                VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
                final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
                  it.documentationLevel = DocumentationLevel.FULL;
                  it.iteration = iter;
                  it.runtimeLimit = 60;
                  it.typeScopes.maxNewElements = size;
                  it.typeScopes.minNewElements = (size - 5);
                  it.contCycleLevel = 5;
                  it.uniquenessDuplicates = false;
                };
                final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
                solution = reasoner.solve(problem, vampireConfig, workspace);
                Object _get = ((ModelResult) solution).getRepresentation().get(0);
                final VampireModel soln = ((VampireModel) _get);
                int _transformationTime = solution.getStatistics().getTransformationTime();
                final double tTime = (_transformationTime / 1000.0);
                int _solverTime = solution.getStatistics().getSolverTime();
                final double sTime = (_solverTime / 1000.0);
                String _plus_4 = (Double.valueOf(tTime) + ",");
                String _plus_5 = (_plus_4 + Double.valueOf(sTime));
                String _plus_6 = (_plus_5 + ",");
                writer.append(_plus_6);
                InputOutput.<String>print((((("(" + Double.valueOf(tTime)) + "/") + Double.valueOf(sTime)) + "s).."));
                solverTimes.add(Double.valueOf(sTime));
                transformationTimes.add(Double.valueOf(tTime));
              }
            }
            InputOutput.println();
            Double solverMed = IterableExtensions.<Double>sort(solverTimes).get((REPS / 2));
            Double transformationMed = IterableExtensions.<Double>sort(transformationTimes).get((REPS / 2));
            String _string = solverMed.toString();
            String _plus_4 = (_string + ",");
            String _string_1 = transformationMed.toString();
            String _plus_5 = (_plus_4 + _string_1);
            writer.append(_plus_5);
            writer.append("\n");
          }
          int _i = i;
          i = (_i + INC);
          _while = (i <= MAX);
        }
      }
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
