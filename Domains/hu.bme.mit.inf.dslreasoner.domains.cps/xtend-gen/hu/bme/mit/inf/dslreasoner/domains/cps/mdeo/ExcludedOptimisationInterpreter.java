package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import hu.bme.mit.inf.dslreasoner.domains.cps.mdeo.ExcludedMoeaOptimisation;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.model.Unit;
import org.moeaframework.Instrumenter;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Optimisation;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IModelProvider;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.OptimisationInterpreter;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.executor.SolutionGenerator;

@SuppressWarnings("all")
public class ExcludedOptimisationInterpreter extends OptimisationInterpreter {
  private final Optimisation model;
  
  public ExcludedOptimisationInterpreter(final String projectPath, final Optimisation model) {
    super(projectPath, model);
    this.model = model;
  }
  
  @Override
  public Instrumenter start() {
    List<Unit> _breedingOperators = this.getBreedingOperators();
    List<Unit> _mutationOperators = this.getMutationOperators();
    IModelProvider _modelProvider = this.getModelProvider();
    EPackage _metamodel = this.getMetamodel();
    SolutionGenerator solutionGenerator = new SolutionGenerator(this.model, _breedingOperators, _mutationOperators, _modelProvider, _metamodel);
    return new ExcludedMoeaOptimisation().execute(this.model.getSolver(), solutionGenerator);
  }
}
