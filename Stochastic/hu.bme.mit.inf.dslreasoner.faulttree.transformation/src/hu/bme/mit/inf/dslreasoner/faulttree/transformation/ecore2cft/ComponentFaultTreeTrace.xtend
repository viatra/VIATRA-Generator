package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.xtend.lib.annotations.Accessors

class ComponentFaultTreeTrace {
	@Accessors val componentFaultTree = CftFactory.eINSTANCE.createComponentFaultTree

	val nameGenerator = new ComponentNameGenerator
	val Map<IPatternMatch, ComponentInstanceTrace> componentInstancesMap = newHashMap

	def instantiateComponent(IPatternMatch patternMatch, ComponentDefinition componenDefinition) {
		if (componentInstancesMap.containsKey(patternMatch)) {
			throw new IllegalArgumentException("Already instantiated component for match: " + patternMatch)
		}
		val componentTrace = new ComponentInstanceTrace(componentFaultTree, componenDefinition, nameGenerator)
		componentInstancesMap.put(patternMatch, componentTrace)
		componentTrace
	}

	def setTopLevel(ComponentInstanceTrace trace) {
		if (componentFaultTree.topEvent !== null) {
			throw new IllegalArgumentException("Top level component already set")
		}
		val outputs = trace.outputs
		if (outputs.size !== 1) {
			throw new IllegalArgumentException("Top level component must have 1 output, got " + outputs.size +
				" instead")
		}
		componentFaultTree.topEvent = outputs.head
	}

	def lookup(IPatternMatch patternMatch) {
		componentInstancesMap.get(patternMatch)
	}
}
