package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import com.google.common.collect.Maps
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.faulttree.model.util.CftExtensions.*

class ComponentInstanceTrace {
	val componentInstance = CftFactory.eINSTANCE.createComponent
	val Map<InputEvent, InputTrace> inputEventsMap
	val Map<EventDeclaration, Output> outputEventsMap

	protected new(ComponentFaultTree faultTree, ComponentDefinition componentDefinition,
		ComponentNameGenerator nameGenerator, Modality exists, boolean multipleAllowed) {
		componentInstance.componentDefinition = componentDefinition
		componentInstance.name = nameGenerator.nextName(componentDefinition)
		componentInstance.exists = exists
		componentInstance.multipleAllowed = multipleAllowed
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
		assign(inputEvent, sourceComponent, outputEvent, Modality.MUST)
	}

	def void assign(EventDeclaration inputEvent, ComponentInstanceTrace sourceComponent, EventDeclaration outputEvent,
		Modality exists) {
		val inputTrace = inputEventsMap.get(inputEvent)
		if (inputTrace === null) {
			throw new IllegalArgumentException("Unknown input: " + inputEvent)
		}
		val output = sourceComponent.outputEventsMap.get(outputEvent)
		if (output === null) {
			throw new IllegalArgumentException("Unknown output: " + outputEvent)
		}
		inputTrace.assign(output, exists)
	}

	protected def getOutputs() {
		componentInstance.outputs
	}

	protected def appearsExactlyOnce() {
		componentInstance.appearsExactlyOnce
	}
}
