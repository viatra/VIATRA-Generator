package hu.bme.mit.inf.dslreasoner.domains.cps.dse

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsQueries
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.addon.querybasedfeatures.runtime.QueryBasedFeatureSettingDelegateFactory
import org.eclipse.viatra.addon.querybasedfeatures.runtime.handler.QueryBasedFeatures
import org.eclipse.viatra.dse.api.DesignSpaceExplorer
import org.eclipse.viatra.dse.api.DesignSpaceExplorer.DseLoggingLevel
import org.eclipse.viatra.query.runtime.extensibility.SingletonQueryGroupProvider
import org.eclipse.viatra.query.runtime.registry.QuerySpecificationRegistry
import org.eclipse.viatra.query.runtime.registry.connector.QueryGroupProviderSourceConnector

class RuleBasedCpsMain {
	private new() {
		new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def void main(String[] args) {
		DesignSpaceExplorer.turnOnLogging(DseLoggingLevel.VERBOSE_FULL)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
			new XMIResourceFactoryImpl)
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(QueryBasedFeatures.ANNOTATION_SOURCE,
			new QueryBasedFeatureSettingDelegateFactory)
		EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, CpsPackage.eINSTANCE)
		QuerySpecificationRegistry.instance.addSource(
			new QueryGroupProviderSourceConnector("CpsQueries", new SingletonQueryGroupProvider(CpsQueries.instance),
				true))
		val generator = new CpsGenerator(1, 4, 1)
		val problem = generator.generateCpsProblem
//		problem.eResource.save(emptyMap)
		val solver = new RuleBasedCpsSolver
		solver.solve(problem)
	}
}
