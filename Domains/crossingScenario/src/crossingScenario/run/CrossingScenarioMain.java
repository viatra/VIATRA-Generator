package crossingScenario.run;

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;

public class CrossingScenarioMain {
	private CrossingScenarioMain() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.");
	}
	
	public static void main(String[] args) {
		String errorMessages = StandaloneScriptExecutor.executeScript("inputs/crossingScenarioGen.vsconfig");
		if(errorMessages!=null) {
			System.out.println(errorMessages);
		}
	}
}
