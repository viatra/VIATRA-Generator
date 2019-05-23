package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import java.util.Properties
import org.moeaframework.Executor
import org.moeaframework.Instrumenter
import org.moeaframework.algorithm.PeriodicAction
import org.moeaframework.core.TerminationCondition
import org.moeaframework.core.spi.AlgorithmFactory
import uk.ac.kcl.inf.mdeoptimiser.interfaces.cli.Run
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.Optimisation
import uk.ac.kcl.inf.mdeoptimiser.languages.mopt.SolverSpec
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.OptimisationInterpreter
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.executor.SolutionGenerator
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.MoeaOptimisation
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.algorithms.MoeaOptimisationAlgorithmProvider
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.instrumentation.PopulationCollector
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.moea.problem.MoeaOptimisationProblem
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.operators.adaptation.MutationStepSizeStrategyFactory
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.output.MDEOBatch

class ExcludedMoeaOptimisation extends MoeaOptimisation {
	SolutionGenerator solutionGenerator
	Instrumenter algorithmStepSizeInstrumenter

	override execute(SolverSpec solverSpec, SolutionGenerator solutionGenerator) {
		this.solutionGenerator = solutionGenerator
		super.execute(solverSpec, solutionGenerator)
	}

	override Instrumenter runOptimisation(SolverSpec solverSpec, Properties optimisationProperties) {
		val algorithmFactory = new AlgorithmFactory
		algorithmFactory.addProvider(new MoeaOptimisationAlgorithmProvider)

		algorithmStepSizeInstrumenter = new Instrumenter().addExcludedPackage("org.eclipse").withProblemClass(
			MoeaOptimisationProblem, solutionGenerator).attachApproximationSetCollector().attachElapsedTimeCollector().
			attachPopulationSizeCollector.attach(new PopulationCollector()).withFrequency(1).withFrequencyType(
				PeriodicAction.FrequencyType.STEPS)

		var stepSizeStrategy = new MutationStepSizeStrategyFactory(solverSpec.algorithm, algorithmStepSizeInstrumenter).
			strategy

		solutionGenerator.setMutationStepSizeStrategy(stepSizeStrategy)

		// TODO: Place this in a better location. 
		// Exclude JDK packages from Instrumenter
		this.algorithmStepSizeInstrumenter.addExcludedPackage("jdk")

		new Executor().usingAlgorithmFactory(algorithmFactory).withAlgorithm(solverSpec.algorithm.name) // Initialize problem with our solution generator
		.withProblemClass(MoeaOptimisationProblem, solutionGenerator).withProperties(optimisationProperties).
			withInstrumenter(algorithmStepSizeInstrumenter).withTerminationCondition(
				optimisationProperties.get("terminationCondition") as TerminationCondition).run()

		return algorithmStepSizeInstrumenter
	}
}

class ExcludedOptimisationInterpreter extends OptimisationInterpreter {
	val Optimisation model

	new(String projectPath, Optimisation model) {
		super(projectPath, model)
		this.model = model
	}

	override start() {
		// This model provider loads the model given by the user in the DSL
		var solutionGenerator = new SolutionGenerator(model, getBreedingOperators, getMutationOperators,
			getModelProvider, getMetamodel);

		return new ExcludedMoeaOptimisation().execute(model.solver, solutionGenerator)
	}

}

class ExcludedRun extends Run {
	override runBatch(String moptProjectPath, Optimisation optimisationModel, Integer batch, boolean singleBatch) {
		val optimisationInterpreter = new ExcludedOptimisationInterpreter(moptProjectPath, optimisationModel);
		val startTime = System.nanoTime();
		val optimisationOutcome = optimisationInterpreter.start();
		val endTime = System.nanoTime();
		val experimentDuration = ((endTime - startTime) / 1000000);
		val generatedRules = optimisationInterpreter.getRulegenOperators();
		return new MDEOBatch(batch, experimentDuration, optimisationOutcome, generatedRules, singleBatch);
	}
}
