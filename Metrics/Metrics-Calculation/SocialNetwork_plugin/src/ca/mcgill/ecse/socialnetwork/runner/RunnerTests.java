package ca.mcgill.ecse.socialnetwork.runner;

import org.junit.Test;

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;

public class RunnerTests {
	private static String runWithPath(String path) {
		String message = StandaloneScriptExecutor.executeScript(path);
		return message;
	}
	
	@Test
	public void generateModel() {
		String message = runWithPath("SocialNetworkGeneration.vsconfig");
		System.out.println(message);
	}
}
