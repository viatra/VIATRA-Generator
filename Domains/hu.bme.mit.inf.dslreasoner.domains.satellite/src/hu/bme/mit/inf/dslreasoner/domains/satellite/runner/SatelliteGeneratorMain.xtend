package hu.bme.mit.inf.dslreasoner.domains.satellite.runner

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory

final class SatelliteGeneratorMain {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	public static def void main(String[] args) {
		ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE,
			ReteBackendFactory.INSTANCE)
		val res = StandaloneScriptExecutor.executeScript("configs/generation.vsconfig")
		if(res!==null) println(res)
	}
}
