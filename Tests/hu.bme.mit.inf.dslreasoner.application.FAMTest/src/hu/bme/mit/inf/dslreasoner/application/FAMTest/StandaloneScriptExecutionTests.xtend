package hu.bme.mit.inf.dslreasoner.application.FAMTest

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor
import org.junit.Test
import org.junit.Assert

class StandaloneScriptExecutionTests {
	private def runWithPath(String path, String expectedMessage) {
		val message = StandaloneScriptExecutor.executeScript(path)
		Assert.assertEquals(expectedMessage,message)
	}
	private def runWithPathCheckingPrefix(String path, String prefix) {
		val message = StandaloneScriptExecutor.executeScript(path)
		Assert.assertTrue(message.startsWith(prefix))
	}
	private def runWithPath(String path) {
		runWithPath(path,null)
	}
	
	@Test
	def void invalidExtension() {
		runWithPath("invalid","Unsupported file extension: invalid")
	}
	@Test
	def void nonexistingFile() {
		runWithPathCheckingPrefix("invalid.vsconfig","Unable to load Configuration Script!")
	}
	@Test
	def void errorousImports() {
		runWithPath("configs/ErrorousImports.vsconfig",'''
		The Configuration Script contains 4 errors:
				Couldn't resolve reference to EPackage 'error'.
				Couldn't resolve reference to PatternModel 'error'.
				Couldn't resolve reference to EPackage 'functionalarchitecture'.
				Couldn't resolve reference to PatternModel 'hu.bme.mit.inf.dslreasoner.domains.fam'.
		''')
	}
	@Test
	def void generateFAM() {
		runWithPath("configs/generation.vsconfig")
	}
}