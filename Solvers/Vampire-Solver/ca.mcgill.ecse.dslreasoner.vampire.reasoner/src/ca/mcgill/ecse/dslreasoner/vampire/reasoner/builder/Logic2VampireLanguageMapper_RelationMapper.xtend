package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
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

	def dispatch public void transformRelation(RelationDeclaration r, Logic2VampireLanguageMapperTrace trace, Logic2VampireLanguageMapper mapper) {

		// 1. store all variables in support wrt their name
		// 1.1 if variable has type, creating list of type declarations
		val List<VLSVariable> relVar2VLS = new ArrayList
		val List<VLSFunction> relVar2TypeDecComply = new ArrayList
		for (i : 0 ..< r.parameters.length) {

			val v = createVLSVariable => [
				it.name = support.toIDMultiple("V", i.toString)
			]
			relVar2VLS.add(v)

			val relType = (r.parameters.get(i) as ComplexTypeReference).referred
			val varTypeComply = support.duplicate(relType.lookup(trace.type2Predicate), v)
			relVar2TypeDecComply.add(varTypeComply)

		}

		//deciding name of relation
		val nameArray = r.name.split(" ")
		var relNameVar = ""
		if (nameArray.length == 3) {
			relNameVar = support.toIDMultiple(nameArray.get(0), nameArray.get(2))
		}
		else {
			relNameVar = r.name
		}
		val relName = relNameVar
		
		val comply = createVLSFofFormula=> [
			
			it.name = support.toIDMultiple("compliance", relName)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				for (v : relVar2VLS) {
					it.variables += support.duplicate(v)
				}
				it.operand = createVLSImplies => [
					val rel = createVLSFunction => [
						it.constant = support.toIDMultiple("r", relName)
						for (v : relVar2VLS) {
							it.terms += support.duplicate(v)
						}
					]
					trace.rel2Predicate.put(r, rel)
					trace.predicate2Relation.put(rel, r)
					it.left = support.duplicate(rel)
					it.right = support.unfoldAnd(relVar2TypeDecComply)
				]
			]
		]

		trace.specification.formulas += comply
	}

	def dispatch public void transformRelation(RelationDefinition r, Logic2VampireLanguageMapperTrace trace, Logic2VampireLanguageMapper mapper) {
		
//		println("XXXXXXXXXXXXXXXXX")

// 1. store all variables in support wrt their name
		// 1.1 if variable has type, creating list of type declarations
		val Map<Variable, VLSVariable> relVar2VLS = new HashMap
		val List<VLSVariable> vars = newArrayList
		val List<VLSFunction> relVar2TypeDecComply = new ArrayList
		for (i : 0 ..< r.parameters.length) {

			val v = createVLSVariable => [
				it.name = support.toIDMultiple("V", i.toString)
			]
			relVar2VLS.put(r.variables.get(i), v)
			vars.add(v)

			val relType = (r.parameters.get(i) as ComplexTypeReference).referred
			val varTypeComply = support.duplicate(relType.lookup(trace.type2Predicate), v)
			relVar2TypeDecComply.add(varTypeComply)

		}

		//deciding name of relation
		val nameArray = r.name.split(" ")
		var relNameVar = ""
		if (nameArray.length == 3) {
			relNameVar = support.toIDMultiple(nameArray.get(0), nameArray.get(2))
		}
		else {
			relNameVar = r.name
		}
		val relName = relNameVar
		
		//define logic for pattern
//		val map = new HashMap
//		map.put(r.variables.get(0), createVLSVariable)
		val definition = mapper.transformTerm(r.value, trace, relVar2VLS)
		
		
		
		
		//get entire contents of and
		val compliance = support.unfoldAnd(relVar2TypeDecComply)
		val compDefn = createVLSAnd=> [
			it.left = compliance
			it.right = definition
		]
		
		val relDef = createVLSFofFormula=> [
			
			it.name = support.toID(relName)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				for (v : vars) {
					it.variables += support.duplicate(v)
				}
				it.operand = createVLSImplies => [
					val rel = createVLSFunction => [
						it.constant = support.toIDMultiple("r", relName)
						for (v : vars) {
							it.terms += support.duplicate(v)
						}
					]
					trace.relDef2Predicate.put(r, rel)
					trace.predicate2RelDef.put(rel, r)
					it.left = support.duplicate(rel)
					it.right = compDefn
				]
			]
		]

		trace.specification.formulas += relDef

	}

}
