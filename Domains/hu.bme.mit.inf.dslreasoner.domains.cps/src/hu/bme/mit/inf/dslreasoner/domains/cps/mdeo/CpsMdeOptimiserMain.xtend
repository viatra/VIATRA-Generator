package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import uk.ac.kcl.inf.mdeoptimiser.interfaces.cli.Run

class CpsMdeOptimiserMain {
	static val PROJECT_PATH = "."
	static val PROBLEM_PATH = "model/problem.xmi"
	static val MOPT_PATH = "src/hu/bme/mit/inf/dslreasoner/domains/cps/mdeo/cps.mopt"

	private new() {
		new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	public static def void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
			new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, CpsPackage.eINSTANCE)
		val generator = new CpsGenerator(1, 4, 1)
		val problem = generator.generateCpsProblem
		problem.eResource.URI = URI.createFileURI(PROBLEM_PATH)
		problem.eResource.save(emptyMap)
		fixupHenshinModel("model/cps.henshin", "model/cps_fixup.henshin", #{"cps.ecore" -> CpsPackage.eNS_URI})
		Run.main(#["-p", PROJECT_PATH, "-m", MOPT_PATH])
	}

	private def static void fixupHenshinModel(String originalPath, String outputPath, Map<String, String> remapMap) {
		val reader = new BufferedReader(new FileReader(originalPath))
		try {
			val writer = new BufferedWriter(new FileWriter(outputPath))
			try {
				var String line
				while ((line = reader.readLine) !== null) {
					for (entry : remapMap.entrySet) {
						line = line.replace(entry.key, entry.value)
					}
					writer.write(line)
					writer.write("\n")
				}
			} finally {
				writer.close
			}
		} finally {
			reader.close
		}
	}
}
