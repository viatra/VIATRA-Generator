package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import com.google.common.collect.ImmutableMap
import com.google.common.collect.Maps
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.Variable
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class MappingHandler {
	val ViatraQueryMatcher<? extends IPatternMatch> matcher
	val MappingDefinition mappingDefinition
	val Map<LookupDefinition, LookupHandler> lookupHandlers

	new(MappingDefinition mappingDefinition, MappingQueries mappingQueries) {
		matcher = mappingQueries.getMatcher(mappingDefinition)
		this.mappingDefinition = mappingDefinition
		val variables = newHashSet
		for (assignment : mappingDefinition.assignments) {
			variables += assignment.input.component
			variables += assignment.output.component
		}
		lookupHandlers = ImmutableMap.copyOf(variables.filter(LookupDefinition).toMap([it], [ lookupDefinition |
			mappingQueries.createLookupHandler(mappingDefinition, lookupDefinition)
		]))
	}

	def instantiateComponents(ComponentFaultTreeTrace faultTreeTrace) {
		if (!hasComponentInstace) {
			return
		}
		matcher.forEachMatch [ match |
			val componentTrace = faultTreeTrace.instantiateComponent(match, componentDefinition)
			if (isTopLevel) {
				faultTreeTrace.topLevel = componentTrace
			}
		]
	}

	def instantiateConnections(ComponentFaultTreeTrace faultTreeTrace) {
		if (!hasConnections) {
			return
		}
		matcher.forEachMatch [ match |
			val lookedUpComponents = lookupComponents(faultTreeTrace, match)
			for (assignment : mappingDefinition.assignments) {
				val input = assignment.input
				val inputComponent = lookedUpComponents.get(input.component)
				val output = assignment.output
				val outputComponent = lookedUpComponents.get(output.component)
				if (inputComponent !== null && outputComponent !== null) {
					inputComponent.assign(input.event, outputComponent, output.event)
				}
			}
		]
	}

	private def Map<Variable, ComponentInstanceTrace> lookupComponents(ComponentFaultTreeTrace faultTreeTrace,
		IPatternMatch match) {
		val lookedUpComponents = Maps.newHashMapWithExpectedSize(lookupHandlers.size + 1)
		if (hasComponentInstace) {
			val componentInstance = faultTreeTrace.lookup(match)
			lookedUpComponents.put(mappingDefinition.componentInstance, componentInstance)
		}
		for (pair : lookupHandlers.entrySet) {
			val componentInstance = pair.value.lookupForMatch(faultTreeTrace, match)
			if (componentInstance !== null) {
				lookedUpComponents.put(pair.key, componentInstance)
			}
		}
		lookedUpComponents
	}

	private def getComponentDefinition() {
		mappingDefinition.componentInstance?.componentType
	}

	private def hasComponentInstace() {
		componentDefinition !== null
	}

	private def isTopLevel() {
		mappingDefinition.topLevel
	}

	private def hasConnections() {
		!mappingDefinition.assignments.empty
	}
}
