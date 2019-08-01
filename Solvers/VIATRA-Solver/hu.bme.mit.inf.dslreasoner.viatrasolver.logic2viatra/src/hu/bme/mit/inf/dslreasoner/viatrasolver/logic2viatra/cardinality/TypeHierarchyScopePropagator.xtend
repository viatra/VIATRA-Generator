package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope

class TypeHierarchyScopePropagator extends ScopePropagator {

	new(PartialInterpretation p, ModelGenerationStatistics statistics) {
		super(p, statistics)
	}

	protected override doPropagateAllScopeConstraints() {
		var boolean hadChanged
		do {
			hadChanged = false
			for (superScopeEntry : superScopes.entrySet) {
				val sub = superScopeEntry.key
				hadChanged = propagateLowerLimitUp(sub, partialInterpretation) || hadChanged
				hadChanged = propagateUpperLimitDown(sub, partialInterpretation) || hadChanged
				for (sup : superScopeEntry.value) {
					hadChanged = propagateLowerLimitUp(sub, sup) || hadChanged
					hadChanged = propagateUpperLimitDown(sub, sup) || hadChanged
				}
			}
		} while (hadChanged)
	}

	private def propagateLowerLimitUp(Scope subScope, Scope superScope) {
		if (subScope.minNewElements > superScope.minNewElements) {
			superScope.minNewElements = subScope.minNewElements
			return true
		} else {
			return false
		}
	}

	private def propagateUpperLimitDown(Scope subScope, Scope superScope) {
		if (superScope.maxNewElements >= 0 &&
			(superScope.maxNewElements < subScope.maxNewElements || subScope.maxNewElements < 0)) {
//			println('''
//			«(subScope.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name» -> «(superScope.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name»
//			subScope.maxNewElements «subScope.maxNewElements» = superScope.maxNewElements «superScope.maxNewElements»
//			''')
			subScope.maxNewElements = superScope.maxNewElements
			return true
		} else {
			return false
		}
	}

	private def propagateLowerLimitUp(Scope subScope, PartialInterpretation p) {
		if (subScope.minNewElements > p.minNewElements) {
//			println('''
//			«(subScope.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name» -> nodes
//			p.minNewElements «p.minNewElements» = subScope.minNewElements «subScope.minNewElements»
//			''')
			p.minNewElements = subScope.minNewElements
			return true
		} else {
			return false
		}
	}

	private def propagateUpperLimitDown(Scope subScope, PartialInterpretation p) {
		if (p.maxNewElements >= 0 && (p.maxNewElements < subScope.maxNewElements || subScope.maxNewElements < 0)) {
//			println('''
//			«(subScope.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name» -> nodes
//			subScope.maxNewElements «subScope.maxNewElements» = p.maxNewElements «p.maxNewElements»
//			''')
			subScope.maxNewElements = p.maxNewElements
			return true
		} else {
			return false
		}
	}
}
