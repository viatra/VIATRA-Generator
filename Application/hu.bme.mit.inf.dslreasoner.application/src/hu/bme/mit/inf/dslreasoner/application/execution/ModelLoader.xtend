package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelSpecification
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject

class ModelLoader {
	
	def List<EObject> loadModel(PartialModelSpecification specification, ScriptExecutor scriptExecutor) {
		val entries = specification.entry
		if (entries.size == 1) {
			var URI uri
			try {
				uri = URI::createURI(
					scriptExecutor.getFileSpecification(specification.entry.head.path).path
				)
			} catch (IllegalArgumentException e) {
				return null
			}

			val resourceSet = specification.eResource.resourceSet
			val resource = resourceSet.getResource(uri, true)
			if (resource === null) {
			} else {
				return resource.allContents.toList
			}
		} else {
			throw new UnsupportedOperationException('''Currently single partial models are supported''')
		}

	}
}
