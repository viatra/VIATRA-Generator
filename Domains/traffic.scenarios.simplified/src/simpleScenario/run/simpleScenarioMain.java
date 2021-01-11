package simpleScenario.run;

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;

public class simpleScenarioMain {
	private simpleScenarioMain() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.");
	}
	
	public static void main(String[] args) {
		String errorMessages = StandaloneScriptExecutor.executeScript("inputs/simpleScenarioGen.vsconfig");
		if(errorMessages!=null) {
			System.out.println(errorMessages);
		}
	}
}
