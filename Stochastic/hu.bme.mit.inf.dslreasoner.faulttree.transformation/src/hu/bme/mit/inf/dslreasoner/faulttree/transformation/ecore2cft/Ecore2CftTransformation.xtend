package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition
import java.util.List
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine

class Ecore2CftTransformation {
	val List<MappingHandler> mappingHandlers

	new(TransformationDefinition transformationDefinition, ViatraQueryEngine viatraQueryEngine) {
		val mappingQueries = new MappingQueries(transformationDefinition, viatraQueryEngine)
		mappingHandlers = ImmutableList.copyOf(transformationDefinition.mappingDefinitions.map [ mappingDefinition |
			new MappingHandler(mappingDefinition, mappingQueries)
		])
	}

	def createComponentFaultTree() {
		val trace = new ComponentFaultTreeTrace
		for (handler : mappingHandlers) {
			handler.instantiateComponents(trace)
		}
		for (handler : mappingHandlers) {
			handler.instantiateConnections(trace)
		}
	}
}
