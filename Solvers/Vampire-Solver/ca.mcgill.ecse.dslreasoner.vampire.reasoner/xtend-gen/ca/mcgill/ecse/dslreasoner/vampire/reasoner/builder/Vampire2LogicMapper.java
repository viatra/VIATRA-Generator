package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireSolutionModel;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Vampire2LogicMapper {
  @Extension
  private final LogicresultFactory resultFactory = LogicresultFactory.eINSTANCE;
  
  public LogicResult transformOutput(final LogicProblem problem, final int requiredNumberOfSolution, final VampireSolutionModel vampireSolution, final Logic2VampireLanguageMapperTrace trace, final long transformationTime) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field aswers is undefined for the type VampireSolutionModel"
      + "\nThe method or field key is undefined for the type Object"
      + "\nThe method or field monitoredAlloySolution is undefined"
      + "\nThe method or field monitoredAlloySolution is undefined"
      + "\nThe method or field monitoredAlloySolution is undefined"
      + "\nThe method or field monitoredAlloySolution is undefined"
      + "\nThe method transformStatistics(MonitoredAlloySolution, long) from the type Vampire2LogicMapper refers to the missing type MonitoredAlloySolution"
      + "\nThe method transformStatistics(MonitoredAlloySolution, long) from the type Vampire2LogicMapper refers to the missing type MonitoredAlloySolution"
      + "\nThe method transformStatistics(MonitoredAlloySolution, long) from the type Vampire2LogicMapper refers to the missing type MonitoredAlloySolution"
      + "\nmap cannot be resolved"
      + "\ntoList cannot be resolved"
      + "\nfinishedBeforeTimeout cannot be resolved"
      + "\n! cannot be resolved"
      + "\nlast cannot be resolved"
      + "\nsatisfiable cannot be resolved"
      + "\n|| cannot be resolved");
  }
  
  public Statistics transformStatistics(final /* MonitoredAlloySolution */Object solution, final long transformationTime) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot cast from Object to int"
      + "\nCannot cast from Object to int"
      + "\naswers cannot be resolved"
      + "\nsize cannot be resolved"
      + "\naswers cannot be resolved"
      + "\nget cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nintValue cannot be resolved"
      + "\nkodkodTime cannot be resolved"
      + "\nkodkodTime cannot be resolved"
      + "\nwarnings cannot be resolved");
  }
  
  public Long sum(final Iterable<Long> ints) {
    final Function2<Long, Long, Long> _function = (Long p1, Long p2) -> {
      return Long.valueOf(((p1).longValue() + (p2).longValue()));
    };
    return IterableExtensions.<Long>reduce(ints, _function);
  }
}
