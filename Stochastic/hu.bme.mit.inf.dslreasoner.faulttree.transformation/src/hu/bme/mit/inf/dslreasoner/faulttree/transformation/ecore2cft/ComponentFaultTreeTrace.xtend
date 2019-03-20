package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftFactory
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.xtend.lib.annotations.Accessors

class ComponentFaultTreeTrace {
	@Accessors val componentFaultTree = CftFactory.eINSTANCE.createComponentFaultTree

	val nameGenerator = new ComponentNameGenerator
	val Map<IPatternMatch, ComponentInstanceTrace> componentInstancesMap = newHashMap

	def instantiateComponent(IPatternMatch patternMatch, ComponentDefinition componenDefinition) {
		instantiateComponent(patternMatch, componenDefinition, Modality.MUST, false)
	}

	def instantiateComponent(IPatternMatch patternMatch, ComponentDefinition componenDefinition, Modality exists,
		boolean allowMultiple) {
		if (componentInstancesMap.containsKey(patternMatch)) {
			throw new IllegalArgumentException("Already instantiated component for match: " + patternMatch)
		}
		val componentTrace = new ComponentInstanceTrace(componentFaultTree, componenDefinition, nameGenerator,
			exists, allowMultiple)
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
		if (!trace.appearsExactlyOnce) {
			throw new IllegalArgumentException("Top level must appear in the fault tree exactly once")
		}
		componentFaultTree.topEvent = outputs.head
	}

	def lookup(IPatternMatch patternMatch) {
		componentInstancesMap.get(patternMatch)
	}
}
