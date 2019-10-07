package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.MonitoredVampireSolution;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Vampire2LogicMapper {
  @Extension
  private final LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE;
  
  public ModelResult transformOutput(final LogicProblem problem, final int requiredNumberOfSolution, final MonitoredVampireSolution monitoredVampireSolution, final Logic2VampireLanguageMapperTrace trace, final long transformationTime) {
    ModelResult _createModelResult = this.resultFactory.createModelResult();
    final Procedure1<ModelResult> _function = (ModelResult it) -> {
      it.setProblem(problem);
      EList<Object> _representation = it.getRepresentation();
      VampireModel _generatedModel = monitoredVampireSolution.getGeneratedModel();
      _representation.add(_generatedModel);
      it.setTrace(trace);
      it.setStatistics(this.transformStatistics(monitoredVampireSolution, transformationTime));
    };
    return ObjectExtensions.<ModelResult>operator_doubleArrow(_createModelResult, _function);
  }
  
  public Statistics transformStatistics(final MonitoredVampireSolution solution, final long transformationTime) {
    Statistics _createStatistics = this.resultFactory.createStatistics();
    final Procedure1<Statistics> _function = (Statistics it) -> {
      long _solverTime = solution.getSolverTime();
      it.setTransformationTime(((int) _solverTime));
    };
    return ObjectExtensions.<Statistics>operator_doubleArrow(_createStatistics, _function);
  }
}
