package ca.mcgill.ecse.dslreasoner.vampire.icse;

import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.Dir;
import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.File;
import ca.mcgill.ecse.dslreasoner.standalone.test.filesystem.filesystemPackage;
import ca.mcgill.ecse.dslreasoner.vampire.icse.GeneralTest;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FileSystemTest {
  public static void main(final String[] args) {
    try {
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initialModels/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("output/FileSystemTest/");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder_1.toString(), "");
      workspace.initAndClear();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> map = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      map.put("logicproblem", _xMIResourceFactoryImpl);
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = GeneralTest.loadMetamodel(filesystemPackage.eINSTANCE);
      final EList<EObject> partialModel = GeneralTest.loadPartialModel(inputs, "fs/filesystemInstance.xmi");
      InputOutput.<String>println("DSL loaded");
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      LogicProblem problem = modelGenerationProblem.getOutput();
      problem = instanceModel2Logic.transform(modelGenerationProblem, partialModel).getOutput();
      workspace.writeModel(problem, "FileSystem.logicproblem");
      InputOutput.<String>println("Problem created");
      long startTime = System.currentTimeMillis();
      VampireSolver reasoner = null;
      VampireSolver _vampireSolver = new VampireSolver();
      reasoner = _vampireSolver;
      final HashMap<Class, Integer> classMapMin = new HashMap<Class, Integer>();
      classMapMin.put(Dir.class, Integer.valueOf(10));
      classMapMin.put(File.class, Integer.valueOf(5));
      final Map<Type, Integer> typeMapMin = GeneralTest.getTypeMap(classMapMin, metamodel, ecore2Logic, modelGenerationProblem.getTrace());
      final HashMap<Class, Integer> classMapMax = new HashMap<Class, Integer>();
      classMapMax.put(File.class, Integer.valueOf(15));
      classMapMax.put(Dir.class, Integer.valueOf(15));
      final Map<Type, Integer> typeMapMax = GeneralTest.getTypeMap(classMapMax, metamodel, ecore2Logic, modelGenerationProblem.getTrace());
      VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
      final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
        it.documentationLevel = DocumentationLevel.FULL;
        it.typeScopes.minNewElements = 10;
        it.typeScopes.maxNewElements = 25;
        int _size = typeMapMin.size();
        boolean _notEquals = (_size != 0);
        if (_notEquals) {
          it.typeScopes.minNewElementsByType = typeMapMin;
        }
        int _size_1 = typeMapMin.size();
        boolean _notEquals_1 = (_size_1 != 0);
        if (_notEquals_1) {
          it.typeScopes.maxNewElementsByType = typeMapMax;
        }
        it.contCycleLevel = 5;
        it.uniquenessDuplicates = false;
      };
      final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
      LogicResult solution = reasoner.solve(problem, vampireConfig, workspace);
      long _currentTimeMillis = System.currentTimeMillis();
      long _minus = (_currentTimeMillis - startTime);
      long totalTimeMin = (_minus / 60000);
      long _currentTimeMillis_1 = System.currentTimeMillis();
      long _minus_1 = (_currentTimeMillis_1 - startTime);
      long _divide = (_minus_1 / 1000);
      long totalTimeSec = (_divide % 60);
      InputOutput.<String>println("Problem solved");
      InputOutput.<String>println(((("Time was: " + Long.valueOf(totalTimeMin)) + ":") + Long.valueOf(totalTimeSec)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
