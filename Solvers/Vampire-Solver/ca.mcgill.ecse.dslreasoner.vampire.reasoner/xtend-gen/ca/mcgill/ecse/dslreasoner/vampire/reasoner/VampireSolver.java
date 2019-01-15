package ca.mcgill.ecse.dslreasoner.vampire.reasoner;

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup;
import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetupGenerated;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapper_FilteredTypes;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasonerException;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.io.PrintWriter;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class VampireSolver extends LogicReasoner {
  public VampireSolver() {
    VampireLanguagePackage.eINSTANCE.eClass();
    final VampireLanguageStandaloneSetupGenerated x = new VampireLanguageStandaloneSetupGenerated();
    VampireLanguageStandaloneSetup.doSetup();
  }
  
  private final Logic2VampireLanguageMapper forwardMapper = new Logic2VampireLanguageMapper(new Logic2VampireLanguageMapper_TypeMapper_FilteredTypes());
  
  private final String fileName = "problem.tptp";
  
  @Override
  public LogicResult solve(final LogicProblem problem, final LogicSolverConfiguration configuration, final ReasonerWorkspace workspace) throws LogicReasonerException {
    try {
      final VampireSolverConfiguration vampireConfig = this.asConfig(configuration);
      final long transformationStart = System.currentTimeMillis();
      final TracedOutput<VampireModel, Logic2VampireLanguageMapperTrace> result = this.forwardMapper.transformProblem(problem, vampireConfig);
      final VampireModel vampireProblem = result.getOutput();
      final Logic2VampireLanguageMapperTrace forwardTrace = result.getTrace();
      String fileURI = null;
      String vampireCode = null;
      if (vampireConfig.writeToFile) {
        fileURI = workspace.writeModel(vampireProblem, this.fileName).toFileString();
      } else {
        vampireCode = workspace.writeModelToString(vampireProblem, this.fileName);
      }
      long _currentTimeMillis = System.currentTimeMillis();
      final long transformationTime = (_currentTimeMillis - transformationStart);
      final PrintWriter out = new PrintWriter("output/files/vampireCode.tptp");
      out.println(vampireCode);
      out.close();
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
