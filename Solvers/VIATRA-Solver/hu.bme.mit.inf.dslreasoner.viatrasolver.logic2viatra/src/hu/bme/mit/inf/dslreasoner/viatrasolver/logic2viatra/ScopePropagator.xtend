package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
import java.util.HashMap
import java.util.Map
import java.util.Set
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import java.util.HashSet

class ScopePropagator {
	PartialInterpretation partialInterpretation
	Map<PartialTypeInterpratation,Scope> type2Scope
	
	val Map<Scope, Set<Scope>> superScopes
	val Map<Scope, Set<Scope>> subScopes
	
	public new(PartialInterpretation p) {
		partialInterpretation = p
		type2Scope = new HashMap
		for(scope : p.scopes) {
			type2Scope.put(scope.targetTypeInterpretation,scope)
		}
		
		superScopes = new HashMap
		subScopes = new HashMap
		for(scope : p.scopes) {
			superScopes.put(scope,new HashSet)
			subScopes.put(scope,new HashSet)
		}
		
		for(scope : p.scopes) {
			val target = scope.targetTypeInterpretation
			if(target instanceof PartialComplexTypeInterpretation) {
				val supertypeInterpretations = target.supertypeInterpretation
				for(supertypeInterpretation : supertypeInterpretations) {
					val supertypeScope = type2Scope.get(supertypeInterpretation)
					superScopes.get(scope).add(supertypeScope)
					subScopes.get(supertypeScope).add(scope)
				}
			}
		}
	}
	
	def public propagateAllScopeConstraints() {
		var boolean hadChanged
		do{
			hadChanged = false
			for(superScopeEntry : superScopes.entrySet) {
				val sub = superScopeEntry.key
				hadChanged = propagateLowerLimitUp(sub,partialInterpretation) || hadChanged
				hadChanged = propagateUpperLimitDown(sub,partialInterpretation) || hadChanged
				for(sup: superScopeEntry.value) {
					hadChanged = propagateLowerLimitUp(sub,sup) || hadChanged
					hadChanged = propagateUpperLimitDown(sub,sup) || hadChanged
				}
			}
		} while(hadChanged)
//		println('''All constraints are propagated.''')
	}
	
	def public propagateAdditionToType(PartialTypeInterpratation t) {
//		println('''Adding to «(t as PartialComplexTypeInterpretation).interpretationOf.name»''')
		val targetScope = type2Scope.get(t)
		if(targetScope != null){
			targetScope.removeOne
			val sups = superScopes.get(targetScope)
			sups.forEach[removeOne]
		}
		
		if(this.partialInterpretation.minNewElements > 0) {
			this.partialInterpretation.minNewElements = this.partialInterpretation.minNewElements-1
		}
		if(this.partialInterpretation.maxNewElements > 0) {
			this.partialInterpretation.maxNewElements = this.partialInterpretation.maxNewElements-1
		} else if(this.partialInterpretation.maxNewElements === 0) {
			throw new IllegalArgumentException('''Inconsistent object creation: lower node limit is 0!''')
		}
		
//		subScopes.get(targetScope).forEach[propagateUpperLimitDown(it,targetScope)]
//		for(sup: sups) {
//			subScopes.get(sup).forEach[propagateUpperLimitDown(it,sup)]
//		}
//		for(scope : type2Scope.values) {
//			propagateUpperLimitDown(scope,partialInterpretation)
//		}

		propagateAllScopeConstraints
		
//		println('''Target Scope: «targetScope.minNewElements» - «targetScope.maxNewElements»''')
//		println(''' «this.partialInterpretation.minNewElements» - «this.partialInterpretation.maxNewElements»''')
//		this.partialInterpretation.scopes.forEach[println(''' «(it.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name»: «it.minNewElements»-«it.maxNewElements»''')]
//		println('''All constraints are propagated upon increasing «(t as PartialComplexTypeInterpretation).interpretationOf.name»''')
	}
	
	private def propagateLowerLimitUp(Scope subScope, Scope superScope) {
		if(subScope.minNewElements>superScope.minNewElements) {
//			println('''
//			«(subScope.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name» -> «(superScope.targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf.name»
//			superScope.minNewElements «superScope.minNewElements» = subScope.minNewElements «subScope.minNewElements»
//			''')
			superScope.minNewElements = subScope.minNewElements
			return true
		} else {
			return false
		}
	}
	
	private def propagateUpperLimitDown(Scope subScope, Scope superScope) {
		if(superScope.maxNewElements>=0 && (superScope.maxNewElements<subScope.maxNewElements || subScope.maxNewElements<0)) {
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
		if(subScope.minNewElements>p.minNewElements) {
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
		if(p.maxNewElements>=0 && (p.maxNewElements<subScope.maxNewElements || subScope.maxNewElements<0)) {
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
	private def removeOne(Scope scope) {
		if(scope.maxNewElements===0) {
			throw new IllegalArgumentException('''Inconsistent object creation: «scope.targetTypeInterpretation»''')
		} else if(scope.maxNewElements>0) {
			scope.maxNewElements= scope.maxNewElements-1
		}
		if(scope.minNewElements>0) {
			scope.minNewElements= scope.minNewElements-1
		}
	}
}
			