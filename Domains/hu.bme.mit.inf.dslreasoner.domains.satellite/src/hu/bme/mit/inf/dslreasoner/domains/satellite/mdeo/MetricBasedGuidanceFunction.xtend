package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo

import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution

abstract class MetricBasedGuidanceFunction implements IGuidanceFunction {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification

	protected new(IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification) {
		this.querySpecification = querySpecification
		if (querySpecification.parameters.size != 1) {
			throw new IllegalArgumentException("Metric must have a single parameter")
		}
	}

	override computeFitness(Solution model) {
		val value = getMetricValue(model)
		computeFitness(value)
	}

	protected def double computeFitness(double metricValue) {
		metricValue
	}

	private def getMetricValue(Solution solution) {
		val model = solution.model
		val queryEngine = LocalSearchEngineManager.INSTANCE.getEngine(model)
		val matcher = querySpecification.getMatcher(queryEngine)
		val iterator = matcher.allMatches.iterator
		if (!iterator.hasNext) {
			throw new IllegalStateException("Too few matches")
		}
		val objectValue = iterator.next.get(0)
		if (objectValue instanceof Number) {
			val doubleValue = objectValue.doubleValue
			if (iterator.hasNext) {
				throw new IllegalStateException("Too many matches")
			}
			doubleValue
		} else {
			throw new IllegalStateException("Metric value must be a number")
		}
	}
}
