package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output
import java.util.Map

class InputTrace {
	val Input input = CftFactory.eINSTANCE.createInput
	val Map<Output, Connection> connectionsMap = newHashMap

	protected new(Component component, InputEvent inputEvent) {
		input.inputEvent = inputEvent
		component.inputs += input
	}

	def void assign(Output output) {
		val connection = connectionsMap.get(output)
		if (connection === null) {
			val newConnection = CftFactory.eINSTANCE.createConnection
			newConnection.output = output
			input.incomingConnections += newConnection
			connectionsMap.put(output, newConnection)
		}
	}
}
