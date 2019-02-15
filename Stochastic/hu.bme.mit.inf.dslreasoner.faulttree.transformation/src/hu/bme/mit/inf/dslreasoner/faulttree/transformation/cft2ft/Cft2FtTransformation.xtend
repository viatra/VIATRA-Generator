package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent

class Cft2FtTransformation {
	def createFaultTree(ComponentFaultTree componentFaultTree) {
		val materializer = new EventMaterializer
		val topEvent = materializer.getOrMaterialize(componentFaultTree.topEvent)
		switch (topEvent) {
			ConstantEvent:
				FtFactory.eINSTANCE.createConstantModel => [
					failed = topEvent.failed
				]
			RandomEvent: {
				val builder = new FaultTreeBuilder
				builder.addTopLevel(topEvent)
				builder.faultTree
			}
		}
	}
}
