package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import hu.bme.mit.inf.dslreasoner.domains.cps.mdeo.ExcludedOptimisationInterpreter;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EPackage;
import org.moeaframework.Instrumenter;
import uk.ac.kcl.inf.mdeoptimiser.interfaces.cli.Run;
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Optimisation;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.output.MDEOBatch;

@SuppressWarnings("all")
public class ExcludedRun extends Run {
  @Override
  public MDEOBatch runBatch(final String moptProjectPath, final Optimisation optimisationModel, final Integer batch, final boolean singleBatch) {
    final ExcludedOptimisationInterpreter optimisationInterpreter = new ExcludedOptimisationInterpreter(moptProjectPath, optimisationModel);
    final long startTime = System.nanoTime();
    final Instrumenter optimisationOutcome = optimisationInterpreter.start();
    final long endTime = System.nanoTime();
    final long experimentDuration = ((endTime - startTime) / 1000000);
    final Map<EPackage, List<org.eclipse.emf.henshin.model.Module>> generatedRules = optimisationInterpreter.getRulegenOperators();
    return new MDEOBatch(batch, experimentDuration, optimisationOutcome, generatedRules, singleBatch);
  }
}
