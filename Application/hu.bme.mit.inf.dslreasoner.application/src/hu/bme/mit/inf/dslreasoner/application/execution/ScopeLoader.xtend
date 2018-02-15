package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ClassTypeScope
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ExactNumber
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntEnumberation
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntegerTypeScope
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.IntervallNumber
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectTypeScope
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RealEnumeration
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RealTypeScope
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.StringEnumeration
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.StringTypeScope
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import org.eclipse.emf.ecore.EClass

class ScopeLoader {	
	def TypeScopes loadScope(ScopeSpecification specification, LogicProblem problem, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		val res = new TypeScopes
		for(scopeSpecification : specification.scopes) {
			setSpecification(scopeSpecification,res,ecore2Logic,trace)
		}
		return res 
	}
	
	def dispatch setSpecification(ObjectTypeScope scope, TypeScopes aggregated, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		//val existingObjects = 
		aggregated.minNewElements = getLowerLimit(scope.number)
		aggregated.maxNewElements = getUpperLimit(scope.number)
	}
	def dispatch setSpecification(ClassTypeScope scope, TypeScopes aggregated, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		val target = scope.type.element
		if(target.feature != null) {
			throw new IllegalArgumentException('''Feature scopes are not supported: "«target.feature.name»"!''')
		} else {
			val targetClassifier = target.classifier
			if(targetClassifier instanceof EClass) {
				val type = ecore2Logic.TypeofEClass(trace,targetClassifier)
				aggregated.minNewElementsByType.put(type,getLowerLimit(scope.number))
				aggregated.maxNewElementsByType.put(type,getUpperLimit(scope.number))
			} else {
				throw new IllegalArgumentException('''Non-EClass scopes are not supported: "«targetClassifier.name»"!''')
			}
		}
	}
	def dispatch setSpecification(IntegerTypeScope scope, TypeScopes aggregated, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		aggregated.minNewIntegers = scope.number.lowerLimit
		aggregated.maxNewIntegers = scope.number.upperLimit
	}
	def dispatch setSpecification(RealTypeScope scope, TypeScopes aggregated, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		aggregated.minNewReals = scope.number.lowerLimit
		aggregated.maxNewReals = scope.number.upperLimit
	}
	def dispatch setSpecification(StringTypeScope scope, TypeScopes aggregated, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		aggregated.minNewStrings = scope.number.lowerLimit
		aggregated.maxNewStrings = scope.number.upperLimit
	}
	
	def dispatch getLowerLimit(IntervallNumber specification) {
		return specification.min
	}
	def dispatch getLowerLimit(ExactNumber specification) {
		if(specification.isExactUnlimited) return 0
		else return specification.exactNumber
	}
	def dispatch getLowerLimit(IntEnumberation specification) { 0 }
	def dispatch getLowerLimit(RealEnumeration specification) { 0 }
	def dispatch getLowerLimit(StringEnumeration specification) { 0 }
	def dispatch getUpperLimit(IntervallNumber specification) {
		if(specification.isMaxUnlimited) return -1
		else return specification.maxNumber
	}
	def dispatch getUpperLimit(ExactNumber specification) {
		if(specification.isExactUnlimited) return -1
		else return specification.exactNumber
	}
	def dispatch getUpperLimit(IntEnumberation specification) { 0 }
	def dispatch getUpperLimit(RealEnumeration specification) { 0 }
	def dispatch getUpperLimit(StringEnumeration specification) { 0 }
}