package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo;

import hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo.LocalSearchEngineManager;
import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

@SuppressWarnings("all")
public abstract class MetricBasedGuidanceFunction implements IGuidanceFunction {
  private final IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification;
  
  protected MetricBasedGuidanceFunction(final IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> querySpecification) {
    this.querySpecification = querySpecification;
    int _size = querySpecification.getParameters().size();
    boolean _notEquals = (_size != 1);
    if (_notEquals) {
      throw new IllegalArgumentException("Metric must have a single parameter");
    }
  }
  
  @Override
  public double computeFitness(final Solution model) {
    double _xblockexpression = (double) 0;
    {
      final double value = this.getMetricValue(model);
      _xblockexpression = this.computeFitness(value);
    }
    return _xblockexpression;
  }
  
  protected double computeFitness(final double metricValue) {
    return metricValue;
  }
  
  private double getMetricValue(final Solution solution) {
    double _xblockexpression = (double) 0;
    {
      final EObject model = solution.getModel();
      final ViatraQueryEngine queryEngine = LocalSearchEngineManager.INSTANCE.getEngine(model);
      final ViatraQueryMatcher<? extends IPatternMatch> matcher = this.querySpecification.getMatcher(queryEngine);
      final Iterator<? extends IPatternMatch> iterator = matcher.getAllMatches().iterator();
      boolean _hasNext = iterator.hasNext();
      boolean _not = (!_hasNext);
      if (_not) {
        throw new IllegalStateException("Too few matches");
      }
      final Object objectValue = iterator.next().get(0);
      double _xifexpression = (double) 0;
      if ((objectValue instanceof Number)) {
        double _xblockexpression_1 = (double) 0;
        {
          final double doubleValue = ((Number)objectValue).doubleValue();
          boolean _hasNext_1 = iterator.hasNext();
          if (_hasNext_1) {
            throw new IllegalStateException("Too many matches");
          }
          _xblockexpression_1 = doubleValue;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        throw new IllegalStateException("Metric value must be a number");
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
