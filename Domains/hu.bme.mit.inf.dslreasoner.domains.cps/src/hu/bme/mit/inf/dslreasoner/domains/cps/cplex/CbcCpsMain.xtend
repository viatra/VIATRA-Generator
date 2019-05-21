package hu.bme.mit.inf.dslreasoner.domains.cps.cplex

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.util.concurrent.TimeUnit

class CbcCpsMain {
	static val PROBLEM_FILE = "problem.lp"
	static val SOLUTION_FILE = "solution.txt"

	private new() {
		new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
			new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, CpsPackage.eINSTANCE)
		val generator = new CpsGenerator(1, 4, 1)
		val problem = generator.generateCpsProblem
		val toLp = new CpsToLpTranslator(problem, 10, true)
		val lp = toLp.lpProblem
		val writer = new BufferedWriter(new FileWriter(PROBLEM_FILE))
		try {
			writer.append(lp)
		} finally {
			writer.close
		}
		val process = new ProcessBuilder().inheritIO.command("cbc", PROBLEM_FILE, "solve", "solu", SOLUTION_FILE).start
		if (!process.waitFor(120, TimeUnit.SECONDS)) {
			System.err.println("Timeout reached")
			process.destroyForcibly
			System.exit(-1)
		}
		if (process.exitValue != 0) {
			System.err.println("Unexpected exit value " + process.exitValue)
			System.exit(-1)
		}
		val reader = new BufferedReader(new FileReader(SOLUTION_FILE))
		try {
			reader.lines.forEach[println(it)]
		} finally {
			reader.close
		}
	}
}
