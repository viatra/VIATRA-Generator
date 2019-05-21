package hu.bme.mit.inf.dslreasoner.domains.cps.dse;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsFactory;
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.dse.CpsStateCoder;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.Allocate;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeMemoryMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CostMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CreateHostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.GuidanceObjective;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.RequirementNotSatisfied;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CompositeDirectionalThresholdObjective;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveKind;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.QueryBasedObjective;
import java.util.Collection;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.Solution;
import org.eclipse.viatra.dse.evolutionary.EvolutionaryStrategy;
import org.eclipse.viatra.dse.evolutionary.EvolutionaryStrategyBuilder;
import org.eclipse.viatra.dse.objectives.Fitness;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class RuleBasedCpsSolver {
  @Extension
  private final BatchTransformationRuleFactory _batchTransformationRuleFactory = new BatchTransformationRuleFactory();
  
  @Extension
  private final CpsFactory _cpsFactory = CpsFactory.eINSTANCE;
  
  public void solve(final CyberPhysicalSystem problem) {
    final DesignSpaceExplorer dse = new DesignSpaceExplorer();
    dse.addMetaModelPackage(CpsPackage.eINSTANCE);
    dse.setInitialModel(problem.eResource().getResourceSet());
    final Consumer<RequirementNotSatisfied.Match> _function = (RequirementNotSatisfied.Match it) -> {
      final ApplicationInstance app = this._cpsFactory.createApplicationInstance();
      EList<ApplicationInstance> _instances = it.getReq().getType().getInstances();
      _instances.add(app);
      EList<ApplicationInstance> _instances_1 = it.getReq().getInstances();
      _instances_1.add(app);
    };
    dse.addTransformationRule(this._batchTransformationRuleFactory.<RequirementNotSatisfied.Match, RequirementNotSatisfied.Matcher>createRule(RequirementNotSatisfied.instance()).action(_function).build());
    final Consumer<Allocate.Match> _function_1 = (Allocate.Match it) -> {
      ApplicationInstance _app = it.getApp();
      _app.setAllocatedTo(it.getHost());
    };
    dse.addTransformationRule(this._batchTransformationRuleFactory.<Allocate.Match, Allocate.Matcher>createRule(Allocate.instance()).action(_function_1).build());
    final Consumer<CreateHostInstance.Match> _function_2 = (CreateHostInstance.Match it) -> {
      EList<HostInstance> _instances = it.getHostType().getInstances();
      HostInstance _createHostInstance = this._cpsFactory.createHostInstance();
      _instances.add(_createHostInstance);
    };
    dse.addTransformationRule(this._batchTransformationRuleFactory.<CreateHostInstance.Match, CreateHostInstance.Matcher>createRule(CreateHostInstance.instance()).action(_function_2).build());
    GuidanceObjective _instance = GuidanceObjective.instance();
    ObjectiveThreshold.Inclusive _inclusive = new ObjectiveThreshold.Inclusive(0);
    QueryBasedObjective _queryBasedObjective = new QueryBasedObjective(_instance, ObjectiveKind.LOWER_IS_BETTER, _inclusive, 0);
    AverageFreeMemoryMetric _instance_1 = AverageFreeMemoryMetric.instance();
    ObjectiveThreshold.Inclusive _inclusive_1 = new ObjectiveThreshold.Inclusive(0.75);
    QueryBasedObjective _queryBasedObjective_1 = new QueryBasedObjective(_instance_1, ObjectiveKind.LOWER_IS_BETTER, _inclusive_1, 0);
    AverageFreeHddMetric _instance_2 = AverageFreeHddMetric.instance();
    ObjectiveThreshold.Inclusive _inclusive_2 = new ObjectiveThreshold.Inclusive(0.75);
    QueryBasedObjective _queryBasedObjective_2 = new QueryBasedObjective(_instance_2, ObjectiveKind.LOWER_IS_BETTER, _inclusive_2, 0);
    CompositeDirectionalThresholdObjective _compositeDirectionalThresholdObjective = new CompositeDirectionalThresholdObjective("Composite", _queryBasedObjective, _queryBasedObjective_1, _queryBasedObjective_2);
    dse.addObjective(_compositeDirectionalThresholdObjective);
    CostMetric _instance_3 = CostMetric.instance();
    QueryBasedObjective _queryBasedObjective_3 = new QueryBasedObjective(_instance_3, ObjectiveKind.LOWER_IS_BETTER, 
      ObjectiveThreshold.NO_THRESHOLD, 0);
    dse.addObjective(_queryBasedObjective_3);
    dse.setMaxNumberOfThreads(1);
    CpsStateCoder.Factory _factory = new CpsStateCoder.Factory();
    dse.setStateCoderFactory(_factory);
    final EvolutionaryStrategy strategy = EvolutionaryStrategyBuilder.createNsga2Strategy(25);
    dse.startExplorationWithTimeout(strategy, ((2 * 60) * 1000));
    Collection<Solution> _solutions = dse.getSolutions();
    for (final Solution solution : _solutions) {
      Object _stateCode = solution.getStateCode();
      String _plus = ("Found solution: " + _stateCode);
      String _plus_1 = (_plus + " ");
      Fitness _fitness = solution.getArbitraryTrajectory().getFitness();
      String _plus_2 = (_plus_1 + _fitness);
      InputOutput.<String>println(_plus_2);
    }
  }
}
