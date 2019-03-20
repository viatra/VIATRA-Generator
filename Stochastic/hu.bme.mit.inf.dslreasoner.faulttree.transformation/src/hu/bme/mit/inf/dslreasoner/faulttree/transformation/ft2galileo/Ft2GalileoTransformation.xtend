package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ft2galileo

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.AndGate
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.BasicEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantDistribution
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.KOfMGate
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.OrGate
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent
import org.eclipse.xtend2.lib.StringConcatenationClient

class Ft2GalileoTransformation {
	def toGalileo(FaultTree faultTree) '''
		toplevel "«faultTree.topEvent.name»";
		«FOR event : faultTree.events»
			"«event.name»" «defineEvent(event)»;
		«ENDFOR»
	'''

	protected dispatch def defineEvent(BasicEvent basicEvent) {
		// ft-diet (https://moves.rwth-aachen.de/ft-diet/) needs a dormancy factor.
		'''«defineDistribution(basicEvent.distribution)» dorm=0.0'''
	}

	protected dispatch def StringConcatenationClient defineDistribution(ConstantDistribution distribution) {
		'''p=«distribution.p»'''
	}

	protected dispatch def StringConcatenationClient defineDistribution(ExponentialDistribution distribution) {
		'''lambda=«distribution.lambda»'''
	}

	protected dispatch def StringConcatenationClient defineDistribution(Distribution distribution) {
		throw new IllegalArgumentException("Unknown distribution: " + distribution)
	}

	protected dispatch def StringConcatenationClient defineEvent(Gate gate) {
		'''«defineGate(gate)» «FOR input : gate.inputEvents SEPARATOR " "»"«input.name»"«ENDFOR»'''
	}

	protected dispatch def StringConcatenationClient defineGate(AndGate gate) '''and'''

	protected dispatch def StringConcatenationClient defineGate(OrGate gate) '''or'''

	protected dispatch def StringConcatenationClient defineGate(KOfMGate gate) '''«gate.k»of«gate.inputEvents.size»'''

	protected dispatch def StringConcatenationClient defineGate(Gate gate) {
		throw new IllegalArgumentException("Unknown gate: " + gate)
	}

	protected dispatch def StringConcatenationClient defineEvent(RandomEvent randomEvent) {
		throw new IllegalArgumentException("Unknown random even: " + randomEvent)
	}
}
