package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.InputEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.faulttree.model.util.CftExtensions.*

class InputTrace {
	val Input input = CftFactory.eINSTANCE.createInput
	val Map<Output, Connection> connectionsMap = newHashMap

	protected new(Component component, InputEvent inputEvent) {
		input.inputEvent = inputEvent
		component.inputs += input
	}

	def void assign(Output output, Modality exists) {
		val connection = connectionsMap.get(output)
		if (connection === null) {
			val newConnection = CftFactory.eINSTANCE.createConnection
			newConnection.output = output
			newConnection.exists = exists
			input.incomingConnections += newConnection
			connectionsMap.put(output, newConnection)
		} else if (exists.isMoreConcreteThan(connection.exists)) {
			connection.exists = exists
		}
	}
}
