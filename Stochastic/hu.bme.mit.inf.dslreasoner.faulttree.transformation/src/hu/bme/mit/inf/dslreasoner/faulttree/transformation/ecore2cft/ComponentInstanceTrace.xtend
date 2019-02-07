package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import com.google.common.collect.Maps
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output
import java.util.Map

class ComponentInstanceTrace {
	val componentInstance = CftFactory.eINSTANCE.createComponent
	val Map<InputEvent, InputTrace> inputEventsMap
	val Map<EventDeclaration, Output> outputEventsMap

	protected new(ComponentFaultTree faultTree, ComponentDefinition componentDefinition,
		ComponentNameGenerator nameGenerator) {
		componentInstance.componentDefinition = componentDefinition
		componentInstance.name = nameGenerator.nextName(componentDefinition)
		inputEventsMap = Maps.newHashMapWithExpectedSize(componentDefinition.inputEvents.size)
		for (inputEvent : componentDefinition.inputEvents) {
			val inputTrace = new InputTrace(componentInstance, inputEvent)
			inputEventsMap.put(inputEvent, inputTrace)
		}
		outputEventsMap = Maps.newHashMapWithExpectedSize(componentDefinition.outputEvents.size)
		for (outputEvent : componentDefinition.outputEvents) {
			val output = CftFactory.eINSTANCE.createOutput
			output.eventDeclaration = outputEvent
			componentInstance.outputs += output
			outputEventsMap.put(outputEvent, output)
		}
		faultTree.components += componentInstance
	}

	def void assign(EventDeclaration inputEvent, ComponentInstanceTrace sourceComponent, EventDeclaration outputEvent) {
		val inputTrace = inputEventsMap.get(inputEvent)
		if (inputTrace === null) {
			throw new IllegalArgumentException("Unknown input: " + inputEvent)
		}
		val output = sourceComponent.outputEventsMap.get(outputEvent)
		if (output === null) {
			throw new IllegalArgumentException("Unknown output: " + outputEvent)
		}
		inputTrace.assign(output)
	}

	protected def getOutputs() {
		componentInstance.outputs
	}
}
