package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSAnd
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
import java.util.HashMap
import java.util.List
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

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
		//TODO throw error is there exists a circular containment that does not involve hierarchy
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
		val varC = createVLSVariable => [it.name = "C"]
		val varList = newArrayList(varB, varA)
		val Map<VLSFunction, List<VLSFunction>> type2cont = new HashMap
		for (l : relationsList) {
			val rel = support.duplicate((l as RelationDeclaration).lookup(trace.rel2Predicate), varList)
//			val fromType = (l.parameters.get(0) as ComplexTypeReference).referred as Type
			val toType = ((l.parameters.get(1) as ComplexTypeReference).referred as Type)
			val toFunc = toType.lookup(trace.type2Predicate)

			addToMap(type2cont, toFunc, rel)

			for (c : toType.subtypes) {
				addToMap(type2cont, toFunc, rel)
			}
//			for (c : support.listSubtypes(toType)) {
//				addToMap(type2cont, toFunc, rel)
//			}

//			val listForAnd = newArrayList
////			listForAnd.add(support.duplicate(fromType.lookup(trace.type2Predicate), varB))
//			listForAnd.add(support.duplicate((l as RelationDeclaration).lookup(trace.rel2Predicate), varList))
//			listForAnd.add(createVLSInequality => [
//				it.left = support.duplicate(varA)
//				it.right = support.duplicate(varB)
//			])
			// remove subtypes of elements being pointed to
//			var pointingTo = (l.parameters.get(1) as ComplexTypeReference).referred as Type
//			containmentListCopy.remove(pointingTo)
//			for (c : pointingTo.subtypes) {
//				containmentListCopy.remove(c)
//			}
			// STEP 3
			// Ensure that an objct only has 1 parent
			val relFormula = createVLSFofFormula => [
				it.name = support.toIDMultiple("noDupCont", rel.constant.toString)
				it.fofRole = "axiom"
				it.fofFormula = createVLSExistentialQuantifier => [
					it.variables += support.duplicate(varA)
					it.variables += support.duplicate(varB)
					it.operand = createVLSImplies => [
						it.left = support.duplicate(rel, newArrayList(varA, varB))
						it.right = createVLSUnaryNegation => [
							it.operand = createVLSExistentialQuantifier => [
								it.variables += support.duplicate(varC)
								it.variables += support.duplicate(varB)
								it.operand = support.duplicate(rel, newArrayList(varC, varB))

							]
						]
					]
				]
			]
			trace.specification.formulas += relFormula

		}

// STEP  CONT'D
		for (e : type2cont.entrySet) {
			val relFormula = createVLSFofFormula => [
				it.name = support.toIDMultiple("containment", e.key.constant.toString)
				it.fofRole = "axiom"

				it.fofFormula = createVLSUniversalQuantifier => [
					it.variables += support.duplicate(varA)
					it.operand = createVLSImplies => [
						it.left = support.duplicate(e.key, varA)
						it.right = createVLSExistentialQuantifier => [
							it.variables += support.duplicate(varB)
							if (e.value.length > 1) {
								it.operand = makeUnique(e.value)
							} else {
								it.operand = e.value.get(0)
							}

						]
					]
				]
			]
			trace.specification.formulas += relFormula

		}

	// STEP 4
	// Ensure that there are no cycles in the hierarchy (maybe same as for step3?)
	}

	protected def VLSTerm makeUnique(List<VLSFunction> list) {
		val List<VLSTerm> possibleNots = newArrayList
		val List<VLSTerm> uniqueRels = newArrayList

		for (t1 : list) {
			for (t2 : list) {
				if (t1 == t2) {
					val fct = support.duplicate(t2)
					possibleNots.add(fct)
				} else {
					val op = support.duplicate(t2)
					val negFct = createVLSUnaryNegation => [
						it.operand = op
					]
					possibleNots.add(negFct)
				}
			}
			uniqueRels.add(support.unfoldAnd(possibleNots))
			possibleNots.clear
		}
		return support.unfoldOr(uniqueRels)
	}

	protected def Object addToMap(Map<VLSFunction, List<VLSFunction>> type2cont, VLSFunction toFunc, VLSFunction rel) {
		if (!type2cont.containsKey(toFunc)) {
			type2cont.put(toFunc, newArrayList(rel))
		} else {
			if (!type2cont.get(toFunc).contains(rel)) {
				type2cont.get(toFunc).add(rel)
			// type2cont.replace(toFunc, newArrayList(firstRel))
			}

		}
	}
}
