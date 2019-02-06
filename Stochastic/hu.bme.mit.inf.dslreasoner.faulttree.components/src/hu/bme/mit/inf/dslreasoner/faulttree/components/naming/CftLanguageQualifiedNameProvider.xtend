package hu.bme.mit.inf.dslreasoner.faulttree.components.naming

import com.google.inject.Inject
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

class CftLanguageQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	@Inject PackageNameProvider packageNameProvider

	def qualifiedName(ComponentDefinition componentDefinition) {
		computePackageQualifiedName(componentDefinition, componentDefinition.name)
	}

	def qualifiedName(TransformationDefinition transformationDefinition) {
		computePackageQualifiedName(transformationDefinition, transformationDefinition.name)
	}

	private def computePackageQualifiedName(EObject eObj, String name) {
		if (name === null) {
			return null
		}
		val packageQualifier = packageNameProvider.getPackageName(eObj)
		packageQualifier.append(name)
	}
}
