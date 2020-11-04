package run;

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;

public class FamilyTreeGen {
	public static void main(String[] args) {
		String errorMessages = StandaloneScriptExecutor.executeScript("inputs/familytreeGen.vsconfig");
		if(errorMessages!=null) {
			System.out.println(errorMessages);
		}
	}

}
