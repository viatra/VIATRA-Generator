package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SatelliteQueries;
import java.util.WeakHashMap;
import java.util.function.Function;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchHints;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;

@SuppressWarnings("all")
public class LocalSearchEngineManager {
  public static final LocalSearchEngineManager INSTANCE = new LocalSearchEngineManager();
  
  private final WeakHashMap<EObject, ViatraQueryEngine> engineMap = new WeakHashMap<EObject, ViatraQueryEngine>();
  
  private LocalSearchEngineManager() {
  }
  
  public ViatraQueryEngine getEngine(final EObject eObject) {
    final Function<EObject, ViatraQueryEngine> _function = (EObject it) -> {
      ViatraQueryEngine _xblockexpression = null;
      {
        final EMFScope scope = new EMFScope(it);
        final QueryEvaluationHint localSearchHints = LocalSearchHints.getDefault().build();
        final ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions().withDefaultHint(localSearchHints).withDefaultBackend(
          localSearchHints.getQueryBackendFactory()).build();
        final ViatraQueryEngine engine = AdvancedViatraQueryEngine.on(scope, options);
        SatelliteQueries.instance().prepare(engine);
        _xblockexpression = engine;
      }
      return _xblockexpression;
    };
    return this.engineMap.computeIfAbsent(eObject, _function);
  }
}
