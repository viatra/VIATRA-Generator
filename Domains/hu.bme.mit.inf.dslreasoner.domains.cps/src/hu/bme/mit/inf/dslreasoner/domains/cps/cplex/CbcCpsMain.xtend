package hu.bme.mit.inf.dslreasoner.domains.cps.cplex

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import java.util.concurrent.TimeUnit
import java.util.regex.Pattern
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class CbcCpsMain {
	static val PROBLEM_FILE = "problem.lp"
	static val SOLUTION_FILE = "solution.txt"
	static val VALUE_REGEX = Pattern.compile("Optimal - objective value\\s*([0-9]+(\\.[0-9]+)?)")

	private new() {
		new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	public static def void main(String[] args) {
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
		var double value = Double.NaN
		try {
			var String line
			while ((line = reader.readLine) !== null) {
				println(line)
				val matcher = VALUE_REGEX.matcher(line)
				if (matcher.matches) {
					value = Double.parseDouble(matcher.group(1))
				}
			}
		} finally {
			reader.close
		}
		val applicationCost = problem.requests.flatMap[requirements.map[count]].reduce[p1, p2|p1 + p2] * 5
		val cost = applicationCost + value
		println
		println("Cost: " + cost)
	}
}
