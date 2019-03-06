package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2VampireLanguageMapper_RelationMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val Logic2VampireLanguageMapper base

	public new(Logic2VampireLanguageMapper base) {
		this.base = base
	}

	def dispatch public void transformRelation(RelationDeclaration r, Logic2VampireLanguageMapperTrace trace) {

		// 1. store all variables in support wrt their name
		// 1.1 if variable has type, creating list of type declarations
		val List<VLSVariable> relVar2VLS = new ArrayList
		val List<VLSFunction> relVar2TypeDecComply = new ArrayList
		val typedefs = new ArrayList<VLSTerm>

		for (i : 0 ..< r.parameters.length) {

			val v = createVLSVariable => [
				it.name = support.toIDMultiple("V", i.toString)
			]
			relVar2VLS.add(v)
			
			val relType = (r.parameters.get(i) as ComplexTypeReference).referred
			val varTypeComply = support.duplicate(relType.lookup(trace.type2Predicate), v)
			relVar2TypeDecComply.add(varTypeComply)

		}

		val comply = createVLSFofFormula => [
			val nameArray = r.name.split(" ")
			it.name = support.toIDMultiple("compliance", nameArray.get(0),
				nameArray.get(2))
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [

				for (v : relVar2VLS) {
					it.variables += support.duplicate(v)
				}

				it.operand = createVLSImplies => [
					it.left = createVLSFunction => [
						it.constant = support.toIDMultiple("rel", r.name)

						for (i : 0 ..< r.parameters.length) {
							val v = createVLSVariable => [
								it.name = relVar2VLS.get(i).name
							]
							it.terms += v
						}

					]
					it.right = support.unfoldAnd(relVar2TypeDecComply)
				]
			]
		]

		// trace.relationDefinition2Predicate.put(r,res)
		trace.specification.formulas += comply
	}

	def dispatch public void transformRelation(RelationDefinition reldef, Logic2VampireLanguageMapperTrace trace) {

		// 1. store all variables in support wrt their name
		// 1.1 if variable has type, creating list of type declarations
//		val VLSVariable variable = createVLSVariable => [it.name = "A"]
		val Map<Variable, VLSVariable> relationVar2VLS = new HashMap
		val Map<Variable, VLSFunction> relationVar2TypeDecComply = new HashMap
		val Map<Variable, VLSFunction> relationVar2TypeDecRes = new HashMap
		val typedefs = new ArrayList<VLSTerm>

		for (variable : reldef.variables) {
			val v = createVLSVariable => [
				it.name = support.toIDMultiple("V", variable.name)
			]
			relationVar2VLS.put(variable, v)

			val varTypeComply = createVLSFunction => [
				it.constant = support.toIDMultiple("t", (variable.range as ComplexTypeReference).referred.name)
				it.terms += support.duplicate(v)
			]
			relationVar2TypeDecComply.put(variable, varTypeComply)
			relationVar2TypeDecRes.put(variable, support.duplicate(varTypeComply))
		}

		val comply = createVLSFofFormula => [
			val nameArray = reldef.name.split(" ")
			it.name = support.toIDMultiple("compliance", nameArray.get(nameArray.length - 2),
				nameArray.get(nameArray.length - 1))
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				for (variable : reldef.variables) {
					it.variables += support.duplicate(variable.lookup(relationVar2VLS))

				}
				it.operand = createVLSImplies => [
					it.left = createVLSFunction => [
						it.constant = support.toIDMultiple("rel", reldef.name)
						for (variable : reldef.variables) {
							val v = createVLSVariable => [
								it.name = variable.lookup(relationVar2VLS).name
							]
							it.terms += v
						}
					]
					it.right = support.unfoldAnd(new ArrayList<VLSTerm>(relationVar2TypeDecComply.values))
				]
			]
		]

		val res = createVLSFofFormula => [
			it.name = support.toIDMultiple("relation", reldef.name)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				for (variable : reldef.variables) {
					val v = createVLSVariable => [
						it.name = variable.lookup(relationVar2VLS).name
					]
					it.variables += v

				}
				it.operand = createVLSImplies => [
					it.left = support.unfoldAnd(new ArrayList<VLSTerm>(relationVar2TypeDecRes.values))
					it.right = createVLSEquivalent => [
						it.left = createVLSFunction => [
							it.constant = support.toIDMultiple("rel", reldef.name)
							for (variable : reldef.variables) {
								val v = createVLSVariable => [
									it.name = variable.lookup(relationVar2VLS).name
								]
								it.terms += v

							}
						]
						it.right = base.transformTerm(reldef.value, trace, relationVar2VLS)
					]

				]

			]

		]

		// trace.relationDefinition2Predicate.put(r,res)
		trace.specification.formulas += comply;
		trace.specification.formulas += res;

	}

}
