package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import java.util.Properties;
import org.moeaframework.Executor;
import org.moeaframework.Instrumenter;
import org.moeaframework.algorithm.PeriodicAction;
import org.moeaframework.core.TerminationCondition;
import org.moeaframework.core.spi.AlgorithmFactory;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.AlgorithmSpec;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.executor.SolutionGenerator;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.MoeaOptimisation;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.algorithms.MoeaOptimisationAlgorithmProvider;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.instrumentation.PopulationCollector;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.problem.MoeaOptimisationProblem;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.adaptation.MutationStepSizeStrategy;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.adaptation.MutationStepSizeStrategyFactory;

@SuppressWarnings("all")
public class ExcludedMoeaOptimisation extends MoeaOptimisation {
  private SolutionGenerator solutionGenerator;
  
  private Instrumenter algorithmStepSizeInstrumenter;
  
  @Override
  public Instrumenter execute(final SolverSpec solverSpec, final SolutionGenerator solutionGenerator) {
    Instrumenter _xblockexpression = null;
    {
      this.solutionGenerator = solutionGenerator;
      _xblockexpression = super.execute(solverSpec, solutionGenerator);
    }
    return _xblockexpression;
  }
  
  @Override
  public Instrumenter runOptimisation(final SolverSpec solverSpec, final Properties optimisationProperties) {
    final AlgorithmFactory algorithmFactory = new AlgorithmFactory();
    MoeaOptimisationAlgorithmProvider _moeaOptimisationAlgorithmProvider = new MoeaOptimisationAlgorithmProvider();
    algorithmFactory.addProvider(_moeaOptimisationAlgorithmProvider);
    Instrumenter _attachPopulationSizeCollector = new Instrumenter().addExcludedPackage("org.eclipse").withProblemClass(
      MoeaOptimisationProblem.class, this.solutionGenerator).attachApproximationSetCollector().attachElapsedTimeCollector().attachPopulationSizeCollector();
    PopulationCollector _populationCollector = new PopulationCollector();
    this.algorithmStepSizeInstrumenter = _attachPopulationSizeCollector.attach(_populationCollector).withFrequency(1).withFrequencyType(
      PeriodicAction.FrequencyType.STEPS);
    AlgorithmSpec _algorithm = solverSpec.getAlgorithm();
    MutationStepSizeStrategy stepSizeStrategy = new MutationStepSizeStrategyFactory(_algorithm, this.algorithmStepSizeInstrumenter).getStrategy();
    this.solutionGenerator.setMutationStepSizeStrategy(stepSizeStrategy);
    this.algorithmStepSizeInstrumenter.addExcludedPackage("jdk");
    Object _get = optimisationProperties.get("terminationCondition");
    new Executor().usingAlgorithmFactory(algorithmFactory).withAlgorithm(solverSpec.getAlgorithm().getName()).withProblemClass(MoeaOptimisationProblem.class, this.solutionGenerator).withProperties(optimisationProperties).withInstrumenter(this.algorithmStepSizeInstrumenter).withTerminationCondition(
      ((TerminationCondition) _get)).run();
    return this.algorithmStepSizeInstrumenter;
  }
}
