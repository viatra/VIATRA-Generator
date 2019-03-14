package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
import java.util.List
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference

class Logic2VampireLanguageMapper_ContainmentMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val Logic2VampireLanguageMapper base
	private val VLSVariable variable = createVLSVariable => [it.name = "A"]

	public new(Logic2VampireLanguageMapper base) {
		this.base = base
	}

	def public void transformContainment(List<ContainmentHierarchy> hierarchies,
		Logic2VampireLanguageMapperTrace trace) {

		// TODO CONSIDER CASE WHERE MULTIPLE CONTAINMMENT HIERARCHIES EXIST
		// TEMP
		val hierarchy = hierarchies.get(0)

		val containmentListCopy = hierarchy.typesOrderedInHierarchy
		val relationsList = hierarchy.containmentRelations
		// STEP 1
		// Find root element
		for (l : relationsList) {
			var pointingTo = (l.parameters.get(1) as ComplexTypeReference).referred as Type
			containmentListCopy.remove(pointingTo)
			for (c : pointingTo.subtypes) {
				containmentListCopy.remove(c)
			}
		}

		// State that there must exist 1 and only 1 root element
		val topName = containmentListCopy.get(0).lookup(trace.type2Predicate).constant.toString
		val topTerm = support.duplicate(containmentListCopy.get(0).lookup(trace.type2Predicate))

		val contTop = createVLSFofFormula => [
			it.name = support.toIDMultiple("containment_topLevel", topName)
			it.fofRole = "axiom"

			it.fofFormula = createVLSUniversalQuantifier => [
				it.variables += support.duplicate(variable)
				it.operand = createVLSEquivalent => [
					it.left = topTerm
					it.right = createVLSEquality => [
						it.left = support.duplicate(variable)
						it.right = createVLSConstant => [
							it.name = "o1"
						]
					]
				]
			]
//			it.fofFormula = support.duplicate(
//				topTerm,
//				createVLSFunctionAsTerm => [
//					it.functor = "o1"
//				]
//			)
		]
		trace.specification.formulas += contTop

		// STEP 2
		// for each edge, if the pointedTo element exists,the edge must exist also
		val varA = createVLSVariable => [it.name = "A"]
		val varB = createVLSVariable => [it.name = "B"]
		val varList = newArrayList(varB, varA)

		for (l : relationsList) {
			val relName = (l as RelationDeclaration).lookup(trace.rel2Predicate).constant.toString
			val fromType = (l.parameters.get(0) as ComplexTypeReference).referred as Type
			val toType = (l.parameters.get(1) as ComplexTypeReference).referred as Type

			val relFormula = createVLSFofFormula => [
				it.name = support.toIDMultiple("containment", relName)
				it.fofRole = "axiom"

				it.fofFormula = createVLSUniversalQuantifier => [
					it.variables += support.duplicate(varA)
					it.operand = createVLSImplies => [
						it.left = support.duplicate(toType.lookup(trace.type2Predicate), varA)
						it.right = createVLSExistentialQuantifier => [
							it.variables += support.duplicate(varB)
							it.operand = createVLSAnd => [
								it.left = support.duplicate(fromType.lookup(trace.type2Predicate), varB)
								it.right = support.duplicate((l as RelationDeclaration).lookup(trace.rel2Predicate),
									varList)
							]
						]

						createVLSEquality => [
							it.left = support.duplicate(variable)
							it.right = createVLSConstant => [
								it.name = "o1"
							]
						]
					]
				]
			]
			trace.specification.formulas += relFormula
			var pointingTo = (l.parameters.get(1) as ComplexTypeReference).referred as Type
			containmentListCopy.remove(pointingTo)
			for (c : pointingTo.subtypes) {
				containmentListCopy.remove(c)
			}
		}

	// STEP 3
	// Ensure that an objct only has 1 parent
	// STEP 4
	// Ensure that there are no cycles in the hierarchy (maybe same as for step3?)
	}
}
