package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SatelliteQueries
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution

class PatternMatchConstraint implements IGuidanceFunction {
	static val CONSTRAINT_ANNOTATION_NAME = "Constraint"

	val queries = ImmutableList.copyOf(SatelliteQueries.instance.specifications.filter [
		allAnnotations.exists[name == CONSTRAINT_ANNOTATION_NAME]
	])

	override getName() {
		"PatternMatch"
	}

	override computeFitness(Solution solution) {
		val model = solution.model
		val queryEngine = LocalSearchEngineManager.INSTANCE.getEngine(model)
		var int matchCount = 0
		for (query : queries) {
			val matcher = query.getMatcher(queryEngine)
			matchCount += matcher.countMatches
		}
		matchCount
	}
}
