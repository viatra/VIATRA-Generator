package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import java.util.ArrayList
import java.util.Collection
import java.util.List

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.Collections

class Logic2VampireLanguageMapper_TypeMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val Logic2VampireLanguageMapper base

	new(Logic2VampireLanguageMapper base) {
		LogicproblemPackage.eINSTANCE.class
		this.base = base
	}

	def protected transformTypes(Collection<Type> types, Collection<DefinedElement> elements,
		Logic2VampireLanguageMapper mapper, Logic2VampireLanguageMapperTrace trace) {

//		val typeTrace = new Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes
//		trace.typeMapperTrace = typeTrace
		val VLSVariable variable = createVLSVariable => [it.name = "A"]

		// 1. Each type (class) is a predicate with a single variable as input
		for (type : types) {
			val typePred = createVLSFunction => [
				it.constant = support.toIDMultiple("t", type.name.split(" ").get(0))
				it.terms += support.duplicate(variable)
			]
//			typeTrace.type2Predicate.put(type, typePred)
			trace.type2Predicate.put(type, typePred)
		}

		// 2. Map each ENUM type definition to fof formula
		for (type : types.filter(TypeDefinition)) {
			val List<VLSFunction> orElems = newArrayList
			for (e : type.elements) {
				val enumElemPred = createVLSFunction => [
					val splitName = e.name.split(" ")
					if( splitName.length > 2) {
						it.constant = support.toIDMultiple("e", splitName.get(0), splitName.get(2))
					}
					else {
						it.constant = support.toIDMultiple("e", splitName.get(0))
					}
					it.terms += support.duplicate(variable)
				]
//				typeTrace.element2Predicate.put(e, enumElemPred)
				trace.element2Predicate.put(e, enumElemPred)
				orElems.add(enumElemPred)
			}

			val res = createVLSFofFormula => [
				it.name = support.toIDMultiple("typeDef", type.name.split(" ").get(0))
				// below is temporary solution
				it.fofRole = "axiom"
				it.fofFormula = createVLSUniversalQuantifier => [
					it.variables += support.duplicate(variable)
					it.operand = createVLSEquivalent => [
						it.left = type.lookup(trace.type2Predicate)
						it.right = support.unfoldOr(orElems)
					]
				]

			]
			trace.specification.formulas += res

			// Create objects for the enum elements
			val List<VLSTerm> enumScopeElems = newArrayList
			for (var i = 0; i < type.elements.length; i++) {
				val num = i + 1
				val cstTerm = createVLSFunctionAsTerm => [
					it.functor = "eo" + num
				]
				val cst = support.toConstant(cstTerm)
				trace.uniqueInstances.add(cst)
				val fct = support.duplicate(type.elements.get(i).lookup(trace.element2Predicate), cstTerm)
				enumScopeElems.add(fct)
				
				//For paradox Only
				for (var j = 0; j < type.elements.length; j++) {
					if(j != i) {
						val op = support.duplicate(type.elements.get(j).lookup(trace.element2Predicate), cstTerm)
						val negFct = createVLSUnaryNegation => [
							it.operand = op
						]
						enumScopeElems.add(negFct)
					}
				}
				//End Paradox
//				enumScopeElems.add(support.topLevelTypeFunc(cstTerm))
			}
			
			
			
			val enumScope = createVLSFofFormula => [
				it.name = support.toIDMultiple("enumScope", type.name.split(" ").get(0))
				// below is temporary solution
				it.fofRole = "axiom"			
				it.fofFormula = support.unfoldAnd(enumScopeElems)
			]
			
			trace.specification.formulas += enumScope
		}

		// HIERARCHY HANDLER
		// 3. For each non-abstract type, create an and sequence containing all typedeclaration predicates
		// and store in a map
//		println(types.filter[!isIsAbstract])
		for (t1 : types.filter[!isIsAbstract].filter(TypeDeclaration)) {
			for (t2 : types) {
				// possible improvement: check all supertypes and decide if negated or not based on negations/not negations of supertypes
				if (t1 == t2 || support.dfsSupertypeCheck(t1, t2)) {
//					typeTrace.type2PossibleNot.put(t2, support.duplicate(t2.lookup(typeTrace.type2Predicate)))
					trace.type2PossibleNot.put(t2, support.duplicate(t2.lookup(trace.type2Predicate)))
				} else {
//					typeTrace.type2PossibleNot.put(t2, createVLSUnaryNegation => [
					trace.type2PossibleNot.put(t2, createVLSUnaryNegation => [
						it.operand = support.duplicate(t2.lookup(trace.type2Predicate))
					])
				}
			}
//			typeTrace.type2And.put(t1, support.unfoldAnd(new ArrayList<VLSTerm>(typeTrace.type2PossibleNot.values)))
//			typeTrace.type2PossibleNot.clear
			trace.type2And.put(t1, support.unfoldAnd(new ArrayList<VLSTerm>(trace.type2PossibleNot.values)))
			trace.type2PossibleNot.clear
		}

		// 5. create fof function that is an or with all the elements in map
		val hierarch = createVLSFofFormula => [
			it.name = "inheritanceHierarchyHandler"
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				it.variables += support.duplicate(variable)
				it.operand = createVLSEquivalent => [
					it.left = support.topLevelTypeFunc
//					it.right = support.unfoldOr(new ArrayList<VLSTerm>(typeTrace.type2And.values))
					val reversedList = new ArrayList<VLSTerm>(trace.type2And.values)
//					Collections.reverse(reversedList)
					it.right = support.unfoldOr(reversedList)
				]
			]
		]

		trace.specification.formulas += hierarch

	}

	// below are from previous interface
	def protected transformTypeReference(Type referred, Logic2VampireLanguageMapper mapper,
		Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def protected getUndefinedSupertype(Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def protected getUndefinedSupertypeScope(int undefinedScope, Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def protected transformReference(DefinedElement referred, Logic2VampireLanguageMapperTrace trace) {
		createVLSDoubleQuote => [
			it.value = "\"a" + referred.name + "\""
		]
	}

	def protected getTypeInterpreter() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
