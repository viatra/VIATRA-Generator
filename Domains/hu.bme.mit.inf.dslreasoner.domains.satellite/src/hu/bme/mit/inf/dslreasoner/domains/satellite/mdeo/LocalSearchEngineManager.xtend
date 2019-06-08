package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SatelliteQueries
import java.util.WeakHashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchHints

class LocalSearchEngineManager {
	public static val INSTANCE = new LocalSearchEngineManager

	val WeakHashMap<EObject, ViatraQueryEngine> engineMap = new WeakHashMap

	private new() {
	}

	def getEngine(EObject eObject) {
		engineMap.computeIfAbsent(eObject) [
			val scope = new EMFScope(it)
			val localSearchHints = LocalSearchHints.^default.build
			val options = ViatraQueryEngineOptions.defineOptions.withDefaultHint(localSearchHints).withDefaultBackend(
				localSearchHints.queryBackendFactory).build
			val engine = AdvancedViatraQueryEngine.on(scope, options)
			SatelliteQueries.instance.prepare(engine)
			engine
		]
	}
}
