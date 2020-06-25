package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class TypeDistributionCalculator {
	public static def void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(YakindummPackage.eNS_URI, YakindummPackage.eINSTANCE)

		println("model,className,count")
		val directory = new File(args.get(0))
		for (file : directory.listFiles) {
			val modelName = file.name
			val resourceSet = new ResourceSetImpl
			val resource = resourceSet.getResource(URI.createFileURI(file.absolutePath), true)
			val objectsByTypeName = resource.allContents.filter [ obj |
				val featureName = obj.eContainingFeature?.name
				// Filter out "derived containment" references in Ecore.
				// See https://stackoverflow.com/a/46340165
				featureName != "eGenericType" && featureName != "eGenericSuperTypes"
			].groupBy[eClass.name]
			for (pair : objectsByTypeName.entrySet) {
				println('''«modelName»,«pair.key»,«pair.value.size»''')
			}
		}
	}
}
