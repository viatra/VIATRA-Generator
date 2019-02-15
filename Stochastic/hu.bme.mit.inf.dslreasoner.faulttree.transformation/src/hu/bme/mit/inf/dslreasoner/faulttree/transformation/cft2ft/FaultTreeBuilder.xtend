package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent
import java.util.Collection
import org.eclipse.xtend.lib.annotations.Accessors

class FaultTreeBuilder {
	@Accessors
	val faultTree = FtFactory.eINSTANCE.createFaultTree

	def addTopLevel(RandomEvent event) {
		if (faultTree.topEvent !== null) {
			throw new IllegalStateException("Top event was already set")
		}
		add(event)
		faultTree.topEvent = event
	}

	protected def void add(RandomEvent event) {
		if (faultTree.eContainer == faultTree) {
			return
		}
		if (faultTree.eContainer !== null) {
			throw new IllegalStateException("Event is already in a different fault tree")
		}
		faultTree.events += event
		if (event instanceof Gate) {
			addAll(event.inputEvents)
		}
	}

	protected def addAll(Collection<RandomEvent> events) {
		for (event : events) {
			add(event)
		}
	}
}
