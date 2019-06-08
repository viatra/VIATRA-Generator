package hu.bme.mit.inf.dslreasoner.domains.satellite.runner

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor

final class SatelliteGeneratorMain {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	public static def void main(String[] args) {
		println(StandaloneScriptExecutor.executeScript("configs/generation.vsconfig"))
	}
}
