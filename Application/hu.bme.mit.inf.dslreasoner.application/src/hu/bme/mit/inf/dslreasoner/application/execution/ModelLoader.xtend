package hu.bme.mit.inf.dslreasoner.application.execution

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

class ModelLoader {
	def loadModel(String path, Context context) {
		var URI uri 
		try {
			uri = URI::createURI(path)
		} catch(IllegalArgumentException e) {
			context.writeError('''Malformed uri: "«uri»"!''')
			return null
		}
		
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.getResource(uri,true)
		if(resource === null) {
			
		} else {
			return resource
		}
	}	
}