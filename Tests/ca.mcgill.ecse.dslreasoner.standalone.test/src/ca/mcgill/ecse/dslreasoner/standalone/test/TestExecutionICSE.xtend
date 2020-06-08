package ca.mcgill.ecse.dslreasoner.standalone.test

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor

class TestExecutionICSE {
	def static void main(String[] args) {
		val fileSystemPath = "configs/fileSystem.vsconfig";
	    val ecorePath = "configs/ecore.vsconfig";
	    val yakinduPath = "configs/yakindu.vsconfig";
	    val famPath = "configs/fam.vsconfig";
//	    val yakinduWithWFPath = "configs/yakinduWF.vsconfig";
//	    val famWithWFPath = "configs/famWF.vsconfig";
	    val exp1 = StandaloneScriptExecutor.executeScript(fileSystemPath);
	    println(exp1)
//	    val exp2 = StandaloneScriptExecutor.executeScript(ecorePath);
//	    println(exp2)
	    val exp3 = StandaloneScriptExecutor.executeScript(yakinduPath);
	    println(exp3)
	    val exp4 = StandaloneScriptExecutor.executeScript(famPath);
	    println(exp4)
	}
}