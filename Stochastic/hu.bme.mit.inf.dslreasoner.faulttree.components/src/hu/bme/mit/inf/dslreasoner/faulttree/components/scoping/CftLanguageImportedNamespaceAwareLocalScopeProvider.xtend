package hu.bme.mit.inf.dslreasoner.faulttree.components.scoping

import com.google.inject.Inject
import com.google.inject.Singleton
import hu.bme.mit.inf.dslreasoner.faulttree.components.naming.PackageNameProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.ICaseInsensitivityHelper
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider

@Singleton
class CftLanguageImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
	@Inject PackageNameProvider packageNameProvider

	@Inject
	new() {
	}

	new(IGlobalScopeProvider globalScopeProvider, IQualifiedNameProvider qualifiedNameProvider,
		IQualifiedNameConverter qualifiedNameConverter, ICaseInsensitivityHelper caseInsensitivityHelper) {
		super(globalScopeProvider, qualifiedNameProvider, qualifiedNameConverter, caseInsensitivityHelper)
		packageNameProvider = new PackageNameProvider(qualifiedNameConverter)
	}

	override protected internalGetImportedNamespaceResolvers(EObject context, boolean ignoreCase) {
		val resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase)
		val packageName = packageNameProvider.getPackageName(context)
		if (!packageName.empty) {
			val packageNormalizer = doCreateImportNormalizer(packageName, true, ignoreCase)
			resolvers.add(0, packageNormalizer)
		}
		resolvers
	}
	
	def createImportNormalizedScope(IScope elements, EObject context, EReference reference) {
		val ignoreCase = isIgnoreCase(reference)
		val type = reference.EReferenceType
		val namespaceResolvers = getImportedNamespaceResolvers(context, ignoreCase)
		createImportScope(elements, namespaceResolvers, null, type, ignoreCase)
	}
}
