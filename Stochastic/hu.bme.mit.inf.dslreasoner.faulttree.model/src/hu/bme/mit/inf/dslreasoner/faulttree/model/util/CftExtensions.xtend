package hu.bme.mit.inf.dslreasoner.faulttree.model.util

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ModalElement
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality

final class CftExtensions {
	private new() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def isMoreConcreteThan(Modality newModality, Modality original) {
		switch (original) {
			case MAY: newModality != Modality.MAY
			case CURRENT: newModality == Modality.MUST
			case MUST: false
		}
	}

	static def currentlyExists(ModalElement element) {
		element.exists != Modality.MAY
	}

	static def mustExist(ModalElement element) {
		element.exists == Modality.MUST
	}

	static def appearsExactlyOnce(Component componentInstance) {
		componentInstance.mustExist && !componentInstance.multipleAllowed
	}
	
	/**
	 * Checks whether the connection and its target component are both currently present.
	 * 
	 * A currently present connection without a present target component is a partial model error,
	 * so we throw an exception instead of returning <code>false</code>.
	 * 
	 * @param connection The connection to check.
	 * @throws IllegalStateException When the target component is not currently present.
	 */
	static def isCurrentlyConnected(Connection connection) {
		if (connection.output.component.currentlyExists) {
			throw new IllegalStateException("Inconsistent partial model: current connection to a component that may not currently exist")
		}
		connection.currentlyExists
	}
}
