package hu.bme.mit.inf.dslreasoner.application.execution

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelSpecification

class ModelLoader {
	
	def loadModel(PartialModelSpecification specification, ScriptExecutor scriptExecutor) {
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

			val resourceSet = new ResourceSetImpl
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
