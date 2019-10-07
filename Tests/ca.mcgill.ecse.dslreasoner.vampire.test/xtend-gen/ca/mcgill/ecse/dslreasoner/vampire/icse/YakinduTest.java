package ca.mcgill.ecse.dslreasoner.vampire.icse;

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.queries.FamPatterns;
import ca.mcgill.ecse.dslreasoner.vampire.icse.GeneralTest;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import functionalarchitecture.FunctionalarchitecturePackage;
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
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initialModels/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("output/YakinduTest/");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder_1.toString(), "");
      workspace.initAndClear();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> map = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      map.put("logicproblem", _xMIResourceFactoryImpl);
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = GeneralTest.loadMetamodel(FunctionalarchitecturePackage.eINSTANCE);
      final EList<EObject> partialModel = GeneralTest.loadPartialModel(inputs, "FAM/FaModel.xmi");
      final ViatraQuerySetDescriptor queries = GeneralTest.loadQueries(metamodel, FamPatterns.instance());
      InputOutput.<String>println("DSL loaded");
      int MAX = 150;
      int START = 10;
      int INC = 20;
      int REPS = 1;
      final int EXACT = (-1);
      if ((EXACT != (-1))) {
        MAX = EXACT;
        START = EXACT;
        INC = 1;
        REPS = 5;
      }
      URI _workspaceURI = workspace.getWorkspaceURI();
      String _plus = (_workspaceURI + "//yakinduStats.csv");
      PrintWriter writer = new PrintWriter(_plus);
      writer.append("size,");
      for (int x = 0; (x < REPS); x++) {
        writer.append((("t" + Integer.valueOf(x)) + ","));
      }
      writer.append("avg\n");
      double totalTime = 0.0;
      double totFound = 0.0;
      boolean modelFound = true;
      LogicResult solution = null;
      {
        int i = START;
        boolean _while = (i <= MAX);
        while (_while) {
          {
            final int num = ((i - START) / INC);
            InputOutput.<String>print((((("Generation " + Integer.valueOf(num)) + ": SIZE=") + Integer.valueOf(i)) + " Attempt: "));
            String _plus_1 = (Integer.valueOf(i) + ",");
            writer.append(_plus_1);
            totalTime = 0.0;
            totFound = 0.0;
            modelFound = true;
            for (int j = 0; (j < REPS); j++) {
              {
                InputOutput.<Integer>print(Integer.valueOf(j));
                Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
                final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
                LogicProblem problem = modelGenerationProblem.getOutput();
                problem = instanceModel2Logic.transform(modelGenerationProblem, partialModel).getOutput();
                workspace.writeModel(problem, "Yakindu.logicproblem");
                long startTime = System.currentTimeMillis();
                VampireSolver reasoner = null;
                VampireSolver _vampireSolver = new VampireSolver();
                reasoner = _vampireSolver;
                final int size = i;
                final int inc = INC;
                VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
                final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
                  it.documentationLevel = DocumentationLevel.FULL;
                  it.typeScopes.minNewElements = (size - inc);
                  it.typeScopes.maxNewElements = size;
                  it.contCycleLevel = 5;
                  it.uniquenessDuplicates = false;
                };
                final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
                solution = reasoner.solve(problem, vampireConfig, workspace);
                Object _get = ((ModelResult) solution).getRepresentation().get(0);
                final VampireModel soln = ((VampireModel) _get);
                int _transformationTime = solution.getStatistics().getTransformationTime();
                final double time = (_transformationTime / 1000.0);
                String _plus_2 = (Double.valueOf(time) + ",");
                writer.append(_plus_2);
                InputOutput.<String>print((("(" + Double.valueOf(time)) + ").."));
                double _talTime = totalTime;
                totalTime = (_talTime + time);
                double _tFound = totFound;
                totFound = (_tFound + 1);
              }
            }
            InputOutput.println();
            double avg = 0.0;
            if ((totFound == 0)) {
              avg = (-1);
            } else {
              avg = (totalTime / totFound);
            }
            writer.append(Double.valueOf(avg).toString());
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
