package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSAnd
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import java.util.ArrayList
import java.util.Collection
import java.util.List

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

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
		val VLSVariable variable = createVLSVariable => [it.name = "A"]
		var globalCounter = 0

		// 1. Each type (class) is a predicate with a single variable as input
		for (type : types) {
			val typePred = createVLSFunction => [
				it.constant = support.toIDMultiple("t", type.name.split(" ").get(0))
				it.terms += support.duplicate(variable)
			]
			trace.type2Predicate.put(type, typePred)
		}

		// 2. Map each ENUM type definition to fof formula
		for (type : types.filter(TypeDefinition)) {

			// Create a VLSFunction for each Enum Element
			val List<VLSFunction> orElems = newArrayList
			for (e : type.elements) {
				val enumElemPred = createVLSFunction => [
					val splitName = e.name.split(" ")
					if (splitName.length > 2) {
						it.constant = support.toIDMultiple("e", splitName.get(0), splitName.get(2))
					} else {
						it.constant = support.toIDMultiple("e", splitName.get(0))
					}
					it.terms += support.duplicate(variable)
				]
				trace.element2Predicate.put(e, enumElemPred)
			}

			// Similar to InheritanceHierarchy for the Enum
			val List<VLSTerm> possibleNots = newArrayList
			val List<VLSTerm> typeDefs = newArrayList

			for (t1 : type.elements) {
				for (t2 : type.elements) {
					if (t1 == t2) {
						val fct = support.duplicate(t2.lookup(trace.element2Predicate), variable)
						possibleNots.add(fct)
					} else {
						val op = support.duplicate(t2.lookup(trace.element2Predicate), variable)
						val negFct = createVLSUnaryNegation => [
							it.operand = op
						]
						possibleNots.add(negFct)
					}
				}
				typeDefs.add(support.unfoldAnd(possibleNots))
				possibleNots.clear
			}

			// Implement Enum Inheritence Hierarchy
			val res = createVLSFofFormula => [
				it.name = support.toIDMultiple("typeDef", type.name.split(" ").get(0))
				it.fofRole = "axiom"
				it.fofFormula = createVLSUniversalQuantifier => [
					it.variables += support.duplicate(variable)
					it.operand = createVLSEquivalent => [
						it.left = type.lookup(trace.type2Predicate)
						it.right = createVLSAnd => [
							it.left = support.topLevelTypeFunc(variable)
							it.right = support.unfoldOr(typeDefs)
						]
//						it.right = support.unfoldOr((typeDefs))
					]
				]
			]
			trace.specification.formulas += res

			for (var i = globalCounter; i < globalCounter + type.elements.length; i++) {
				// Create objects for the enum elements
				val num = i + 1
				val cstTerm = createVLSFunctionAsTerm => [
					it.functor = "eo" + num
				]
				val cst = support.toConstant(cstTerm)
				trace.uniqueInstances.add(cst)

				val index = i
				val enumScope = createVLSFofFormula => [
					it.name = support.toIDMultiple("enumScope", type.name.split(" ").get(0),
						type.elements.get(index).name.split(" ").get(0))
					it.fofRole = "axiom"
					it.fofFormula = createVLSUniversalQuantifier => [
						it.variables += support.duplicate(variable)
						it.operand = createVLSEquivalent => [
							it.left = createVLSEquality => [
								it.left = support.duplicate(variable)
								it.right = support.duplicate(support.toConstant(cstTerm))
							]
							it.right = support.duplicate(type.elements.get(index).lookup(trace.element2Predicate),
								variable)
						]
					]
				]

				trace.specification.formulas += enumScope

			}
			globalCounter += type.elements.size
		}

		// HIERARCHY HANDLER
		// 3. For each non-abstract type, create an and sequence containing all typedeclaration predicates
		// and store in a map
		for (t1 : types.filter[!isIsAbstract]) {
			for (t2 : types) {
				// possible improvement: check all supertypes and decide if negated or not based on negations/not negations of supertypes
				if (t1 == t2 || support.dfsSupertypeCheck(t1, t2)) {
					trace.type2PossibleNot.put(t2, support.duplicate(t2.lookup(trace.type2Predicate)))
				} else {
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

		// 4. case where an object is not an object
		val List<VLSTerm> type2Not = newArrayList
		
		for(t : types) {
			type2Not.add(createVLSUnaryNegation => [
				it.operand = support.duplicate(t.lookup(trace.type2Predicate))
			])
		}

		val notObj = createVLSFofFormula => [
			it.name = "notObjectHandler"
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				it.variables += support.duplicate(variable)
				it.operand = createVLSEquivalent => [
					it.left = createVLSUnaryNegation => [
						it.operand = support.topLevelTypeFunc
					]
					it.right = support.unfoldAnd(type2Not)
				]
			]
		]

		trace.specification.formulas += notObj

		// 4. create fof function that is an or with all the elements in map
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
