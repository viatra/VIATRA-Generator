package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Accessors

class ScopePropagator {
	@Accessors(PROTECTED_GETTER) val PartialInterpretation partialInterpretation
	@Accessors(PROTECTED_GETTER) val ModelGenerationStatistics statistics
	val Map<PartialTypeInterpratation, Scope> type2Scope
	@Accessors(PROTECTED_GETTER) val Map<Scope, Set<Scope>> superScopes
	@Accessors(PROTECTED_GETTER) val Map<Scope, Set<Scope>> subScopes

	new(PartialInterpretation p, ModelGenerationStatistics statistics) {
		partialInterpretation = p
		this.statistics = statistics
		type2Scope = new HashMap
		for (scope : p.scopes) {
			type2Scope.put(scope.targetTypeInterpretation, scope)
		}

		superScopes = new HashMap
		subScopes = new HashMap
		for (scope : p.scopes) {
			superScopes.put(scope, new HashSet)
			subScopes.put(scope, new HashSet)
		}

		for (scope : p.scopes) {
			val target = scope.targetTypeInterpretation
			if (target instanceof PartialComplexTypeInterpretation) {
				val supertypeInterpretations = target.supertypeInterpretation
				for (supertypeInterpretation : supertypeInterpretations) {
					val supertypeScope = type2Scope.get(supertypeInterpretation)
					superScopes.get(scope).add(supertypeScope)
					subScopes.get(supertypeScope).add(scope)
				}
			}
		}
		var boolean changed
		do {
			changed = false
			for (scope : p.scopes) {
				val subScopeSet = subScopes.get(scope)
				val superScopeSet = superScopes.get(scope)
				for (subScope : subScopeSet) {
					changed = changed || superScopes.get(subScope).addAll(superScopeSet)
				}
				for (superScope : superScopeSet) {
					changed = changed || subScopes.get(superScope).addAll(subScopeSet)
				}
			}
		} while (changed)
		
		copyScopeBoundsToHeuristic()
	}

	def propagateAllScopeConstraints() {
		statistics.incrementScopePropagationCount()
		doPropagateAllScopeConstraints()
	}
	
	protected def copyScopeBoundsToHeuristic() {
		partialInterpretation.minNewElementsHeuristic = partialInterpretation.minNewElements
		for (scope : partialInterpretation.scopes) {
			scope.minNewElementsHeuristic = scope.minNewElements
		}
	}

	protected def void doPropagateAllScopeConstraints() {
		// Nothing to propagate.
	}

	def decrementTypeScope(PartialTypeInterpratation t) {
//		println('''Adding to «(t as PartialComplexTypeInterpretation).interpretationOf.name»''')
		val targetScope = type2Scope.get(t)
		if (targetScope !== null) {
			targetScope.removeOne
			val sups = superScopes.get(targetScope)
			sups.forEach[removeOne]
		}
		if (this.partialInterpretation.minNewElements > 0) {
			this.partialInterpretation.minNewElements = this.partialInterpretation.minNewElements - 1
		}
		if (this.partialInterpretation.minNewElementsHeuristic > 0) {
			this.partialInterpretation.minNewElementsHeuristic = this.partialInterpretation.minNewElementsHeuristic - 1
		}
		if (this.partialInterpretation.maxNewElements > 0) {
			this.partialInterpretation.maxNewElements = this.partialInterpretation.maxNewElements - 1
		} else if (this.partialInterpretation.maxNewElements === 0) {
			setScopesInvalid()
		}

//		println('''Target Scope: «targetScope.minNewElements» - «targetScope.maxNewElements»''')
//		println(''' «this.partialInterpretation.minNewElements» - «this.partialInterpretation.maxNewElements»''')
//		this.partialInterpretation.scopes.forEach[println(''' «(it.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name»: «it.minNewElements»-«it.maxNewElements»''')]
//		println('''All constraints are propagated upon increasing «(t as PartialComplexTypeInterpretation).interpretationOf.name»''')
	}
	
	protected def setScopesInvalid() {
		partialInterpretation.minNewElements = Integer.MAX_VALUE
		partialInterpretation.maxNewElements = 0
		for (scope : partialInterpretation.scopes) {
			scope.minNewElements = Integer.MAX_VALUE
			scope.maxNewElements = 0
		}
	}

	def isPropagationNeededAfterAdditionToRelation(Relation r) {
		false
	}

	private def removeOne(Scope scope) {
		if (scope.minNewElements > 0) {
			scope.minNewElements = scope.minNewElements - 1
		}
		if (scope.minNewElementsHeuristic > 0) {
			scope.minNewElementsHeuristic = scope.minNewElementsHeuristic - 1
		}
		if (scope.maxNewElements > 0) {
			scope.maxNewElements = scope.maxNewElements - 1
		} else if (scope.maxNewElements === 0) {
			setScopesInvalid()
		}
	}
}
