package hu.bme.mit.inf.dslreasoner.smt.reasoner.builder

import org.eclipse.emf.common.util.URI
import java.io.InputStream
import java.io.IOException
import java.io.FileWriter
import java.io.File
import java.io.BufferedReader
import java.io.InputStreamReader
import org.eclipse.emf.common.CommonPlugin
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SmtSolverConfiguration

class SmtSolverException extends Exception{
	new(String s) { super(s) }
	new(String s, Exception e) { super(s,e) }
}

class SmtSolverHandler {
	public def callSolver(URI resourceURI, SmtSolverConfiguration configuration) {
		val URI smtUri = CommonPlugin.resolve(resourceURI) 
		val File smtFile = new File(smtUri.toFileString()) 
		
		val params =
			'''/smt2 /st«
			IF configuration.runtimeLimit != SmtSolverConfiguration::Unlimited» /T:«configuration.runtimeLimit»«ENDIF»«
			IF configuration.memoryLimit != SmtSolverConfiguration::Unlimited» /memory:«configuration.memoryLimit»«ENDIF»«
			IF configuration.fixRandomSeed» /rs:0«ENDIF
			» «smtFile.path»'''
			
		val Runtime runTime = Runtime.getRuntime()
				
		try {
			val process = runTime.exec(configuration.solverPath + " " + params)
			
			val FileWriter writer = new FileWriter(smtFile,true)
			writer.append("\n--------------\n")
			appendStream(writer, process.getInputStream())
			printStream(process.getErrorStream())
			writer.close
		} catch (IOException e) {
			throw new SmtSolverException(
				"Error during the input/output handling of the reasoner.", e)
		}
		
		return resourceURI
	}
	
	def private void printStream(InputStream inputStream) throws IOException {
		val BufferedReader input = new BufferedReader(new InputStreamReader(inputStream))
		var int line = -1
		while ((line = input.read()) != -1) {
			System.out.print(line as char)
		}
		input.close()
	}

	def private appendStream(FileWriter writer, InputStream inputStream) throws IOException {
		val BufferedReader input = new BufferedReader(new InputStreamReader(inputStream))
		var int line = -1
		while ((line = input.read()) != -1) {
			writer.append(line as char)
		}
	}
}