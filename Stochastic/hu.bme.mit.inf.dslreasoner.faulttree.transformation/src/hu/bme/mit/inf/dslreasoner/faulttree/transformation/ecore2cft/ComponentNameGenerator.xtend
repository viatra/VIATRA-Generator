package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition
import java.util.Map

class ComponentNameGenerator {
	static val DEFAULT_NAME = "__unnamed"

	val Map<ComponentDefinition, Integer> instanceCounts = newHashMap

	def nextName(ComponentDefinition componentDefinition) {
		val instanceCount = instanceCounts.getOrDefault(componentDefinition, 0)
		instanceCounts.put(componentDefinition, instanceCount + 1)
		(componentDefinition.name ?: DEFAULT_NAME) + instanceCount
	}
}
