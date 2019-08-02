package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;

@SuppressWarnings("all")
public abstract class Metric {
  public abstract String[][] evaluate(final GraphStatistic g);
  
  public abstract Object evaluateSamples(final GraphStatistic g);
}
