package hu.bme.mit.inf.dslreasoner.faulttree.components.naming

import com.google.inject.Inject
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName

class PackageNameProvider {
	val IQualifiedNameConverter qualifiedNameConverter

	@FinalFieldsConstructor
	@Inject
	new() {
	}
	
	def getPackageName(EObject eObj) {
		if (eObj === null) {
			return QualifiedName.EMPTY
		}
		val pacakgeName = EcoreUtil2.getContainerOfType(eObj, CftModel)?.packageName
		if (pacakgeName.isNullOrEmpty) {
			QualifiedName.EMPTY
		} else {
			qualifiedNameConverter.toQualifiedName(pacakgeName)
		}
	}
}
