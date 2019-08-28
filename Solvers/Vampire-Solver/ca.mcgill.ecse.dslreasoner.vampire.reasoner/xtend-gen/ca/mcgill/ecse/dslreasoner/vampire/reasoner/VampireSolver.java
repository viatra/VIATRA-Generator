package ca.mcgill.ecse.dslreasoner.vampire.reasoner;

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup;
import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetupGenerated;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Vampire2LogicMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireHandler;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class VampireSolver extends LogicReasoner {
  public VampireSolver() {
    VampireLanguagePackage.eINSTANCE.eClass();
    final VampireLanguageStandaloneSetupGenerated x = new VampireLanguageStandaloneSetupGenerated();
    VampireLanguageStandaloneSetup.doSetup();
  }
  
  private final Logic2VampireLanguageMapper forwardMapper = new Logic2VampireLanguageMapper();
  
  private final Vampire2LogicMapper backwardMapper = new Vampire2LogicMapper();
  
  private final VampireHandler handler = new VampireHandler();
  
  private String fileName = "problem.tptp";
  
  public LogicResult solve(final LogicProblem problem, final LogicSolverConfiguration config, final ReasonerWorkspace workspace, final String location) {
    try {
      LogicResult _xblockexpression = null;
      {
        this.fileName = (location + this.fileName);
        _xblockexpression = this.solve(problem, config, workspace);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public LogicResult solve(final LogicProblem problem, final LogicSolverConfiguration config, final ReasonerWorkspace workspace) throws LogicReasonerException {
    final VampireSolverConfiguration vampireConfig = this.asConfig(config);
    final long transformationStart = System.currentTimeMillis();
    final TracedOutput<VampireModel, Logic2VampireLanguageMapperTrace> result = this.forwardMapper.transformProblem(problem, vampireConfig);
    final VampireModel vampireProblem = result.getOutput();
    final Logic2VampireLanguageMapperTrace forwardTrace = result.getTrace();
    String fileURI = null;
    String vampireCode = null;
    vampireCode = workspace.writeModelToString(vampireProblem, this.fileName);
    final boolean writeFile = ((vampireConfig.documentationLevel == DocumentationLevel.NORMAL) || 
      (vampireConfig.documentationLevel == DocumentationLevel.FULL));
    if (writeFile) {
      fileURI = workspace.writeModel(vampireProblem, this.fileName).toFileString();
    }
    long _currentTimeMillis = System.currentTimeMillis();
    final long transformationTime = (_currentTimeMillis - transformationStart);
    final long solverStart = System.currentTimeMillis();
    final EList<EObject> result2 = this.handler.callSolver(vampireProblem, workspace, vampireConfig);
    long _currentTimeMillis_1 = System.currentTimeMillis();
    final long solvingTime = (_currentTimeMillis_1 - solverStart);
    return null;
  }
  
  public VampireSolverConfiguration asConfig(final LogicSolverConfiguration configuration) {
    if ((configuration instanceof VampireSolverConfiguration)) {
      return ((VampireSolverConfiguration)configuration);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The configuration have to be an ");
      String _simpleName = VampireSolverConfiguration.class.getSimpleName();
      _builder.append(_simpleName);
      _builder.append("!");
      throw new IllegalArgumentException(_builder.toString());
    }
  }
  
  @Override
  public List<? extends LogicModelInterpretation> getInterpretations(final ModelResult modelResult) {
    return null;
  }
}
