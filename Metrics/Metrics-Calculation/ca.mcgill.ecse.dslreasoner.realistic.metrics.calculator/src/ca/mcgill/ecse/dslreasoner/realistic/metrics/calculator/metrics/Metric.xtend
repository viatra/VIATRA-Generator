package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic

abstract class Metric {
	abstract def String[][] evaluate(GraphStatistic g);
	abstract def double[] evaluateSamples(GraphStatistic g);
}