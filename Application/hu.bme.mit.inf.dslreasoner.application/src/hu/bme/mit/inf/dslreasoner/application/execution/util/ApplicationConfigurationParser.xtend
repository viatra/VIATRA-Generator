package hu.bme.mit.inf.dslreasoner.application.execution.util

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript

class ApplicationConfigurationParser {
	public def parse(URI uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(uri,true)
		val content = res.contents.head
		if(content instanceof ConfigurationScript) {
			return content
		} else {
			throw new IllegalArgumentException('''Content is not an ConfigurationScript! (got: «content.class.simpleName»)''')
		}
	}
}
