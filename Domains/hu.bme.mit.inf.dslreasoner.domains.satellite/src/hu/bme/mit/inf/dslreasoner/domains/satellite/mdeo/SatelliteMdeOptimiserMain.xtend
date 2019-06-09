package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import java.util.Map
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import satellite.SatellitePackage
import uk.ac.kcl.inf.mdeoptimiser.interfaces.cli.Run

class SatelliteMdeOptimiserMain {
	static val PROJECT_PATH = "."
	static val MOPT_PATH = "src/hu/bme/mit/inf/dslreasoner/domains/satellite/mdeo/satellite.mopt"

	private new() {
		new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	public static def void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
			new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(SatellitePackage.eNS_URI, SatellitePackage.eINSTANCE)
		fixupHenshinModel("model/satellite.henshin", "model/satellite_fixup.henshin",
			#{"satellite.ecore" -> SatellitePackage.eNS_URI})
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
