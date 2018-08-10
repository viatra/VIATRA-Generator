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
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink
import java.math.BigDecimal
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data class KnownElements {
	val Map<Type,Set<DefinedElement>> knownElementsByType
	val Set<Integer> knownIntegers
	val Set<BigDecimal> knownReals
	val Set<String> knownStrings
}

class ScopeLoader {	
	def loadScope(ScopeSpecification specification, LogicProblem problem, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		val res = new TypeScopes
		val knownElements = initialiseknownElements(problem,res)
		val inconsistencies = new LinkedList<String>()
		
		for(scopeSpecification : specification.scopes) {
			setSpecification(scopeSpecification,res,knownElements,ecore2Logic,trace,inconsistencies)
		}
		
		return res -> inconsistencies
	}
	
	def protected initialiseknownElements(LogicProblem p, TypeScopes s) {
		val Map<Type,Set<DefinedElement>> res = new HashMap
		for(definedType : p.types.filter(TypeDefinition)) {
			val supertypes = definedType.<Type>transitiveClosureStar[x|x.supertypes]
			for(supertype : supertypes) {
				for(element : definedType.elements) {
					res.putOrAddToSet(supertype,element)
				}
			}
		}
		val partailModelContents = p.annotations.filter(PartialModelRelation2Assertion).map[target].toList.map[eAllContents.toIterable].flatten.toList
		s.knownIntegers += partailModelContents.filter(IntLiteral).map[it.value]
		s.knownReals += partailModelContents.filter(RealLiteral).map[it.value]
		s.knownStrings += partailModelContents.filter(StringLiteral).map[it.value]
				
		res
	}
	
	def dispatch getElements(UnaryElementRelationLink link) {
		#[link.param1]
	}
	def dispatch getElements(BinaryElementRelationLink link) {
		#[link.param1,link.param2]
	}
	def dispatch getElements(NaryRelationLink link) {
		link.elements
	}
	
	def dispatch setSpecification(ObjectTypeScope scope, TypeScopes aggregated, Map<Type, Set<DefinedElement>> knownElements, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace, List<String> inconsistencies) {
		val numberOfKnownElements = knownElements.values.flatten.toSet.size
		
		aggregated.minNewElements = updateLowerLimit(scope.isSetsNew,numberOfKnownElements,aggregated.minNewElements,getLowerLimit(scope.number))
		aggregated.maxNewElements = updateUpperLimit(scope.isSetsNew,numberOfKnownElements,aggregated.maxNewElements,getUpperLimit(scope.number))
		
		if(aggregated.maxNewElements < 0) {
			inconsistencies+='''Inconsistent scope: problem already contains «numberOfKnownElements» elements, but scope sets the upper limit to «getUpperLimit(scope.number)»!'''
		}
	}
	def dispatch setSpecification(ClassTypeScope scope, TypeScopes aggregated, Map<Type, Set<DefinedElement>> knownElements, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace, List<String> inconsistencies) {
		val target = scope.type.element
		if(target.feature !== null) {
			throw new IllegalArgumentException('''Feature scopes are not supported: "«target.feature.name»"!''')
		} else {
			val targetClassifier = target.classifier
			if(targetClassifier instanceof EClass) {
				val type = ecore2Logic.TypeofEClass(trace,targetClassifier)
				val known = type.lookup(knownElements).size
				aggregated.minNewElementsByType.put(type,
						updateLowerLimit(
							scope.setsNew,
							known,
							type.lookup(aggregated.minNewElementsByType),
							getLowerLimit(scope.number)
						)
					)
				aggregated.maxNewElementsByType.put(type,
						updateUpperLimit(
							scope.setsNew,
							known,
							type.lookup(aggregated.minNewElementsByType),
							getUpperLimit(scope.number)
						)
					)
			} else {
				throw new IllegalArgumentException('''Non-EClass scopes are not supported: "«targetClassifier.name»"!''')
			}
		}
	}
	def dispatch setSpecification(IntegerTypeScope scope, TypeScopes aggregated, Map<Type, Set<DefinedElement>> knownElements, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace, List<String> inconsistencies) {
		val number = scope.number
		if(number instanceof IntEnumberation) {
			addToKnownCollection(aggregated.knownIntegers,number.entry,scope.isSetsNew,inconsistencies)
		} else {
			aggregated.minNewIntegers = updateLowerLimit(scope.isSetsNew,aggregated.knownIntegers.size,aggregated.minNewIntegers,number.lowerLimit)
			aggregated.maxNewIntegers = updateLowerLimit(scope.isSetsNew,aggregated.knownIntegers.size,aggregated.maxNewIntegers,number.upperLimit)
		}
	}
	
	def dispatch setSpecification(RealTypeScope scope, TypeScopes aggregated, Map<Type, Set<DefinedElement>> knownElements, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace, List<String> inconsistencies) {
		val number = scope.number
		if(number instanceof RealEnumeration) {
			val x = number.entry;
			<BigDecimal>addToKnownCollection(aggregated.knownReals,x,scope.isSetsNew,inconsistencies)
		} else {
			aggregated.minNewReals = updateLowerLimit(scope.isSetsNew,aggregated.knownReals.size,aggregated.minNewReals,number.lowerLimit)
			aggregated.maxNewReals = updateLowerLimit(scope.isSetsNew,aggregated.knownReals.size,aggregated.maxNewReals,number.upperLimit)
		}
	}
	def dispatch setSpecification(StringTypeScope scope, TypeScopes aggregated, Map<Type, Set<DefinedElement>> knownElements, Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace, List<String> inconsistencies) {
		val number = scope.number
		if(number instanceof StringEnumeration) {
			<String>addToKnownCollection(aggregated.knownStrings,number.entry,scope.isSetsNew,inconsistencies)
		} else {
			aggregated.minNewStrings = updateLowerLimit(scope.isSetsNew,aggregated.knownStrings.size,aggregated.minNewStrings,number.lowerLimit)
			aggregated.maxNewStrings = updateLowerLimit(scope.isSetsNew,aggregated.knownStrings.size,aggregated.maxNewStrings,number.upperLimit)
		}
	}
	def <Type> addToKnownCollection(Set<Type> known, List<Type> definedInScope, boolean isSetNew, List<String> inconsistencies) {
		if(isSetNew) {
				known += definedInScope
			} else {
				if(!definedInScope.containsAll(known)) {
					val notDefinedInScope = known.filter[!definedInScope.contains(it)]
					inconsistencies += '''Inconsistent scope: problem already contains literal«IF notDefinedInScope.size > 0»s«ENDIF» that excluded by a scope: «FOR e: notDefinedInScope SEPARATOR ", "»«e»«ENDFOR».'''
				}
				//known.clear
				known += definedInScope
			}
	}
	
	def updateLowerLimit(boolean isAdditional, int known, int original, int value) {
		if(isAdditional) {
			return Math.max(original,value)
		} else {
			return Math.max(original,value-known)
		}
	}
	def updateUpperLimit(boolean isAdditional, int known, int original, int value) {
		if(isAdditional) {
			return Math.min(original,value)
		} else {
			val target = if(value == Integer.MAX_VALUE) { Integer.MAX_VALUE } else {value-known}
			return Math.min(original,target)
		}
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
		if(specification.isMaxUnlimited) return Integer.MAX_VALUE
		else return specification.maxNumber
	}
	def dispatch getUpperLimit(ExactNumber specification) {
		if(specification.isExactUnlimited) return Integer.MAX_VALUE
		else return specification.exactNumber
	}
	
}