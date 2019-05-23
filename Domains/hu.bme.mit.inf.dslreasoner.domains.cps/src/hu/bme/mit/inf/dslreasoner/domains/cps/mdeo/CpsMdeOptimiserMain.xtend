package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import uk.ac.kcl.inf.mdeoptimiser.languages.MoptStandaloneSetup

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
		val generator = new CpsGenerator(1, 4, 2)
		val problem = generator.generateCpsProblem
		problem.eResource.URI = URI.createFileURI(PROBLEM_PATH)
		problem.eResource.save(emptyMap)
		val injector = new MoptStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.getInstance(ExcludedRun).run(PROJECT_PATH, MOPT_PATH)
	}
}
