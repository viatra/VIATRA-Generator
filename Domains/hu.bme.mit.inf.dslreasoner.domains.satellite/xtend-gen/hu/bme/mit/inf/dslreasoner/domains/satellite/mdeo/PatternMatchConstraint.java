package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo.LocalSearchEngineManager;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SatelliteQueries;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction;
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution;

@SuppressWarnings("all")
public class PatternMatchConstraint implements IGuidanceFunction {
  private static final String CONSTRAINT_ANNOTATION_NAME = "Constraint";
  
  private final ImmutableList<IQuerySpecification<?>> queries = ImmutableList.<IQuerySpecification<?>>copyOf(IterableExtensions.<IQuerySpecification<?>>filter(SatelliteQueries.instance().getSpecifications(), ((Function1<IQuerySpecification<?>, Boolean>) (IQuerySpecification<?> it) -> {
    final Function1<PAnnotation, Boolean> _function = (PAnnotation it_1) -> {
      String _name = it_1.getName();
      return Boolean.valueOf(Objects.equal(_name, PatternMatchConstraint.CONSTRAINT_ANNOTATION_NAME));
    };
    return Boolean.valueOf(IterableExtensions.<PAnnotation>exists(it.getAllAnnotations(), _function));
  })));
  
  @Override
  public String getName() {
    return "PatternMatch";
  }
  
  @Override
  public double computeFitness(final Solution solution) {
    int _xblockexpression = (int) 0;
    {
      final EObject model = solution.getModel();
      final ViatraQueryEngine queryEngine = LocalSearchEngineManager.INSTANCE.getEngine(model);
      int matchCount = 0;
      for (final IQuerySpecification<?> query : this.queries) {
        {
          final ViatraQueryMatcher<? extends IPatternMatch> matcher = query.getMatcher(queryEngine);
          int _matchCount = matchCount;
          int _countMatches = matcher.countMatches();
          matchCount = (_matchCount + _countMatches);
        }
      }
      _xblockexpression = matchCount;
    }
    return _xblockexpression;
  }
}
