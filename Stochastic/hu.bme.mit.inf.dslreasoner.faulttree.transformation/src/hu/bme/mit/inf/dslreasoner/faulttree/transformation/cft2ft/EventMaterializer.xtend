package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.AndGateDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.EventDeclaration
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.GateDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.OrGateDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory
import java.util.LinkedHashSet
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.faulttree.model.util.CftExtensions.*

class EventMaterializer {
	extension val FtFactory = FtFactory.eINSTANCE

	val Map<EventKey<EventDeclaration>, Event> materializationCache = newHashMap
	val Map<EventKey<InputEvent>, EventCollection> multipleInputCache = newHashMap
	val ConstantEvent falseEvent
	val ConstantEvent trueEvent
	val path = new LinkedHashSet<EventKey<? extends EventDeclaration>>

	new() {
		falseEvent = createConstantEvent => [
			failed = false
		]
		trueEvent = createConstantEvent => [
			failed = true
		]
	}

	def getOrMaterialize(Output output) {
		getOrMaterialize(output.component, output.eventDeclaration)
	}

	def Event getOrMaterialize(Component component, EventDeclaration eventDeclaration) {
		val eventKey = new EventKey(component, eventDeclaration)
		pushEventKey(eventKey)
		try {
			// computeIfAbsent cannot be used recursively, so we must manually cache the event. 
			var event = materializationCache.get(eventKey)
			if (event === null) {
				event = materialize(component, eventDeclaration)
				materializationCache.put(eventKey, event)
			}
			event
		} finally {
			popEventKey(eventKey)
		}
	}

	protected def materialize(Component component, EventDeclaration eventDeclaration) {
		val eventName = component.name + "_" + eventDeclaration.name
		val event = switch (eventDeclaration) {
			InputEvent:
				return materializeConnectedEvent(component, eventDeclaration)
			BasicEventDefinition: {
				val basicEvent = createBasicEvent
				basicEvent.distribution = EcoreUtil.copy(eventDeclaration.distribution)
				basicEvent
			}
			GateDefinition: {
				val inputs = collectInputs(component, eventDeclaration)
				val gate = switch (eventDeclaration) {
					AndGateDefinition:
						if (inputs.containsFalseEvent) {
							return falseEvent
						} else if (inputs.empty) {
							return trueEvent
						} else if (inputs.containsExactlyOneRandomEvent) {
							return inputs.toSingleRandomEvent
						} else {
							createAndGate
						}
					OrGateDefinition:
						if (inputs.containsTrueEvent) {
							return trueEvent
						} else if (inputs.empty) {
							return falseEvent
						} else if (inputs.containsExactlyOneRandomEvent) {
							return inputs.toSingleRandomEvent
						} else {
							createOrGate
						}
					KOfMGateDefinition: {
						val requiredTrueInputs = inputs.count * eventDeclaration.k / eventDeclaration.m
						val k = requiredTrueInputs - inputs.getTrueEventCount
						val m = inputs.variableEventCount
						if (k == 0) {
							return trueEvent
						} else if (k > m) {
							return falseEvent
						} else if (inputs.containsExactlyOneRandomEvent) {
							return inputs.toSingleRandomEvent
						} else if (k == 1) {
							createOrGate
						} else if (k == m) {
							createAndGate
						} else {
							val kOfMGate = createKOfMGate
							kOfMGate.k = k
							kOfMGate
						}
					}
					default:
						throw new IllegalArgumentException("Unknown gate definition: " + eventDeclaration)
				}
				gate.inputEvents.addAll(inputs.getRandomEvents)
				gate
			}
			default:
				throw new IllegalArgumentException("Unknown event declaration: " + eventDeclaration)
		}
		event.name = eventName
		event
	}

	protected def materializeConnectedEvent(Component component, InputEvent inputEvent) {
		if (inputEvent.multiple) {
			throw new IllegalArgumentException('''Cannot materialize multiple nput «component.name»_«inputEvent.name»''')
		}
		val input = findInput(component, inputEvent)
		val incomingConnections = input.incomingConnections
		if (incomingConnections.size != 1) {
			throw new IllegalArgumentException('''Input «component.name»_«inputEvent.name» has «incomingConnections.size» connections instead of 1''')
		}
		val output = incomingConnections.head.output
		getOrMaterialize(output.component, output.eventDeclaration)
	}

	protected def collectInputs(Component component, GateDefinition gateDefinition) {
		val builder = EventCollection.builder
		for (inputEventDeclaration : gateDefinition.inputEvents) {
			switch (inputEventDeclaration) {
				InputEvent case inputEventDeclaration.multiple: {
					val materializedEvents = getOrMaterializeConnectedEvents(component, inputEventDeclaration)
					builder.addAll(materializedEvents)
				}
				default:
					builder.add(getOrMaterialize(component, inputEventDeclaration))
			}
		}
		builder.build
	}

	protected def getOrMaterializeConnectedEvents(Component component, InputEvent inputEvent) {
		val inputKey = new EventKey(component, inputEvent)
		pushEventKey(inputKey)
		try {
			// computeIfAbsent cannot be used recursively, so we must manually cache the event. 
			var eventCollection = multipleInputCache.get(inputKey)
			if (eventCollection === null) {
				eventCollection = materializeConnectedEvents(component, inputEvent)
				multipleInputCache.put(inputKey, eventCollection)
			}
			eventCollection
		} finally {
			popEventKey(inputKey)
		}
	}

	protected def materializeConnectedEvents(Component component, InputEvent inputEvent) {
		val input = findInput(component, inputEvent)
		val builder = EventCollection.builder
		for (connection : input.incomingConnections) {
			if (connection.isCurrentlyConnected) {
				val materializedEvent = getOrMaterialize(connection.output)
				builder.add(materializedEvent)
			}
		}
		builder.build
	}

	protected def findInput(Component component, InputEvent inputEvent) {
		val input = component.inputs.findFirst[it.inputEvent == inputEvent]
		if (input === null) {
			throw new IllegalArgumentException('''No input «inputEvent» in component «component»''')
		}
		return input
	}

	private def pushEventKey(EventKey<? extends EventDeclaration> eventKey) {
		if (!path.add(eventKey)) {
			throw new IllegalStateException(
			'''Circular dependency [«FOR ancestor : path»«ancestor», «ENDFOR»«eventKey»] detected''')
		}
	}

	private def popEventKey(EventKey<? extends EventDeclaration> eventKey) {
		path.remove(eventKey)
	}

	@Data
	protected static class EventKey<T extends EventDeclaration> {
		val Component component
		val T event

		override toString() '''«component.name»_«event.name»'''
	}
}
