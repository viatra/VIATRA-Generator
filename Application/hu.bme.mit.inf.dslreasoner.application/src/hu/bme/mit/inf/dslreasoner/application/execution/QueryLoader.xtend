package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternSpecification
import hu.bme.mit.inf.dslreasoner.application.execution.util.VQLParser
import java.util.LinkedHashMap
import org.eclipse.emf.ecore.resource.ResourceSet

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class QueryLoader {
	val parser = new VQLParser
	
	def loadQueries(PatternSpecification specification, ResourceSet rs, Context context) {
		val uris = specification.entries.map[path].toList
		val models = parser.parse(uris,rs,context)
		
		val res = new LinkedHashMap
		for(entry : specification.entries) {
			res.put(entry,entry.path.lookup(models))
		}
		
		return res
	}
	
	def pruneQueries(PatternSpecification specification, ResourceSet rs, Context context) {
		
	}
}