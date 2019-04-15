package hu.bme.mit.inf.dslreasoner.domains.satellite.runner;

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public final class SatelliteGeneratorMain {
  private SatelliteGeneratorMain() {
    throw new IllegalStateException("This is a static utility class and should not be instantiated directly.");
  }
  
  public static void main(final String[] args) {
    InputOutput.<String>println(StandaloneScriptExecutor.executeScript("configs/generation.vsconfig"));
  }
}
