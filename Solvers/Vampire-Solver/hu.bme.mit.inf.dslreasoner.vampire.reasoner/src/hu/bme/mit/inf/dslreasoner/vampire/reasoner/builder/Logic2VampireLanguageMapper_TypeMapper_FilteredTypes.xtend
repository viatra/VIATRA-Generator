package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import java.util.ArrayList
import java.util.Collection

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2VampireLanguageMapper_TypeMapper_FilteredTypes implements Logic2VampireLanguageMapper_TypeMapper {
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE

	new() {
		LogicproblemPackage.eINSTANCE.class
	}

	override transformTypes(Collection<Type> types, Collection<DefinedElement> elements,
		Logic2VampireLanguageMapper mapper, Logic2VampireLanguageMapperTrace trace) {
		val typeTrace = new Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes
		trace.typeMapperTrace = typeTrace

		val VLSVariable variable = createVLSVariable => [it.name = "A"] // did not work
		// 1. store predicates for declarations in trace
		for (type : types) {
			val typePred = createVLSFunction => [
				it.constant = support.toIDMultiple("type", type.name)
				it.terms += createVLSVariable => [it.name = variable.name]
			]
			typeTrace.type2Predicate.put(type, typePred)
		}

		// 2. Map each type definition to fof formula
		for (type : types.filter(TypeDefinition)) {

			val res = createVLSFofFormula => [
				it.name = support.toIDMultiple("typeDef", type.name)
				// below is temporary solution
				it.fofRole = "axiom"
				it.fofFormula = createVLSUniversalQuantifier => [
					it.variables += createVLSVariable => [it.name = variable.name]
					it.operand = createVLSEquivalent => [
						it.left = createVLSFunction => [
							it.constant = type.lookup(typeTrace.type2Predicate).constant
							it.terms += createVLSVariable => [it.name = "A"]
						]

						type.lookup(typeTrace.type2Predicate)
						it.right = support.unfoldOr(type.elements.map [ e |
							createVLSEquality => [
								it.left = createVLSVariable => [it.name = variable.name]
//								it.right = createVLSDoubleQuote => [
//									it.value = "\"" + e.name + "\""
//								]
								it.right = createVLSDoubleQuote => [
									it.value = "\"a" + e.name + "\""
								]
							]
						])
					]
				]

			]
			trace.specification.formulas += res
		}
		// 2.5. Currently allowing duplicate types. Not problematic cuz strings are by def unique
		// 3. For each non-abstract type, create an and sequence containing all typedeclaration predicates
		// and store in a map
//		val List<VLSTerm> type2PossibleNot = new ArrayList
//		val List<VLSTerm> type2And = new ArrayList
		for (type : types.filter[!isIsAbstract]) {
			for (type2 : types) {
				// possible improvement: check all supertypes and decide if negated or not based on negations/not negations of supertypes
				if (type == type2 || dfsSupertypeCheck(type, type2)) {
					typeTrace.type2PossibleNot.put(type2, createVLSFunction => [
						it.constant = type2.lookup(typeTrace.type2Predicate).constant
						it.terms += createVLSVariable => [it.name = "A"]
					])
				} else {
					typeTrace.type2PossibleNot.put(type2, createVLSUnaryNegation => [
						it.operand = createVLSFunction => [
							it.constant = type2.lookup(typeTrace.type2Predicate).constant
							it.terms += createVLSVariable => [it.name = "A"]
						]
					])
				}
//				typeTrace.type2PossibleNot.put(type2, type2.lookup(typeTrace.type2Predicate))
			}
			typeTrace.type2And.put(type, support.unfoldAnd(new ArrayList<VLSTerm>(typeTrace.type2PossibleNot.values)))
//			typeTrace.type2And.put(type, type.lookup(typeTrace.type2Predicate) )
			typeTrace.type2PossibleNot.clear
		}

		// 5. create fof function that is an or with all the elements in map
		val hierarch = createVLSFofFormula => [
			it.name = "hierarchyHandler"
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				it.variables += createVLSVariable => [it.name = "A"]
				it.operand = support.unfoldOr(new ArrayList<VLSTerm>(typeTrace.type2And.values))
			]
		]

		trace.specification.formulas += hierarch
	}

	def boolean dfsSupertypeCheck(Type type, Type type2) {
		// There is surely a better way to do this
		if (type.supertypes.isEmpty)
			return false
		else {
			if (type.supertypes.contains(type2))
				return true
			else {
				for (supertype : type.supertypes) {
					if(dfsSupertypeCheck(supertype, type2)) return true
				}
			}
		}
	}

	override transformTypeReference(Type referred, Logic2VampireLanguageMapper mapper,
		Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getUndefinedSupertype(Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getUndefinedSupertypeScope(int undefinedScope, Logic2VampireLanguageMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override transformReference(DefinedElement referred, Logic2VampireLanguageMapperTrace trace) {
		createVLSDoubleQuote => [
			it.value = "\"a" + referred.name + "\""
		]
	}

	override getTypeInterpreter() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
