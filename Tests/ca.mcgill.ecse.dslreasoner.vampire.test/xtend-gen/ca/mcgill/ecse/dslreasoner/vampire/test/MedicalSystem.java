package ca.mcgill.ecse.dslreasoner.vampire.test;

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MedicalSystem {
  public static void main(final String[] args) {
    try {
      MedicalSystem.init();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("outputModels/");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder.toString(), "");
      workspace.initAndClear();
      final LogicProblem root = MedicalSystem.load();
      InputOutput.<String>println("Problem Loaded");
      LogicResult solution = null;
      LogicReasoner reasoner = null;
      VampireSolver _vampireSolver = new VampireSolver();
      reasoner = _vampireSolver;
      VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
      final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
        it.writeToFile = false;
      };
      final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
      solution = reasoner.solve(root, vampireConfig, workspace);
      InputOutput.<String>println("Problem Solved");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static LogicProblem load() {
    LogicProblem _xblockexpression = null;
    {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      final Resource resource = resourceSet.getResource(URI.createURI("inputLPs/newMedicalSystem.logicproblem"), true);
      EObject _get = resource.getContents().get(0);
      final LogicProblem root = ((LogicProblem) _get);
      _xblockexpression = root;
    }
    return _xblockexpression;
  }
  
  protected static void init() {
    LogiclanguagePackage.eINSTANCE.eClass();
    LogicproblemPackage.eINSTANCE.eClass();
    Ecore2logicannotationsPackage.eINSTANCE.eClass();
    Viatra2LogicAnnotationsPackage.eINSTANCE.eClass();
    final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    final Map<String, Object> map = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    map.put("logicproblem", _xMIResourceFactoryImpl);
    XMIResourceFactoryImpl _xMIResourceFactoryImpl_1 = new XMIResourceFactoryImpl();
    map.put("tptp", _xMIResourceFactoryImpl_1);
    VampireLanguageStandaloneSetup.doSetup();
  }
}
