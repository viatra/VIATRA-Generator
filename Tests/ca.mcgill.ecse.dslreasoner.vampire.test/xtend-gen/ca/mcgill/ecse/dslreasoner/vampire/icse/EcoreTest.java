package ca.mcgill.ecse.dslreasoner.vampire.icse;

import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage;
import ca.mcgill.ecse.dslreasoner.vampire.icse.GeneralTest;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class EcoreTest {
  public static void main(final String[] args) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initialModels/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("output/FEcoreTest/");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder_1.toString(), "");
      workspace.initAndClear();
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = GeneralTest.loadMetamodel(filesystemPackage.eINSTANCE);
      final EList<EObject> partialModel = GeneralTest.loadPartialModel(inputs, "fs/filesystemInstance.xmi");
      final Object queries = null;
      InputOutput.<String>println("DSL loaded");
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel);
      final LogicProblem logicProblem = modelGenerationProblem.getOutput();
      InputOutput.<String>println("Problem created");
      LogicResult solution = null;
      LogicReasoner reasoner = null;
      VampireSolver _vampireSolver = new VampireSolver();
      reasoner = _vampireSolver;
      VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
      final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
        it.documentationLevel = DocumentationLevel.FULL;
      };
      final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
      solution = reasoner.solve(logicProblem, vampireConfig, workspace);
      InputOutput.<String>println("Problem solved");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
