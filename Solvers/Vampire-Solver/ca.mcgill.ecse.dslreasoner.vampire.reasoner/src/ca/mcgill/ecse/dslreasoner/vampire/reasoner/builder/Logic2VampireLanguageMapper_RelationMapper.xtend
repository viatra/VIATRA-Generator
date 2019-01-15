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

	def dispatch public void transformRelation(RelationDefinition r, Logic2VampireLanguageMapperTrace trace) {

		// 1. store all variables in support wrt their name
		// 1.1 if variable has type, creating list of type declarations
		val Map<Variable, VLSVariable> relationVar2VLS = new HashMap
		val Map<Variable, VLSFunction> relationVar2TypeDecComply = new HashMap
		val Map<Variable, VLSFunction> relationVar2TypeDecRes = new HashMap
		val typedefs = new ArrayList<VLSTerm>
		for (variable : r.variables) {
			val v = createVLSVariable => [
				it.name = support.toIDMultiple("Var", variable.name)
			]
			relationVar2VLS.put(variable, v)

			val varTypeComply = createVLSFunction => [
				it.constant = support.toIDMultiple("type", (variable.range as ComplexTypeReference).referred.name)
				it.terms += createVLSVariable => [
					it.name = support.toIDMultiple("Var", variable.name)
				]
			]
			relationVar2TypeDecComply.put(variable, varTypeComply)
			
			val varTypeRes = createVLSFunction => [
				it.constant = support.toIDMultiple("type", (variable.range as ComplexTypeReference).referred.name)
				it.terms += createVLSVariable => [
					it.name = support.toIDMultiple("Var", variable.name)
				]
			]			
			relationVar2TypeDecRes.put(variable, varTypeRes)
		}

		val comply = createVLSFofFormula => [
			it.name = support.toIDMultiple("compliance", r.name)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				for (variable : r.variables) {
					val v = createVLSVariable => [
						it.name = variable.lookup(relationVar2VLS).name
					]
					it.variables += v

				}
				it.operand = createVLSImplies => [
					it.left = createVLSFunction => [
						it.constant = support.toIDMultiple("rel", r.name)
						for (variable : r.variables) {
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
			it.name = support.toIDMultiple("relation", r.name)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				for (variable : r.variables) {
					val v = createVLSVariable => [
						it.name = variable.lookup(relationVar2VLS).name
					]
					it.variables += v

				}
				it.operand = createVLSImplies => [
					it.left = support.unfoldAnd(new ArrayList<VLSTerm>(relationVar2TypeDecRes.values))
					it.right = createVLSEquivalent => [
						it.left = createVLSFunction => [
							it.constant = support.toIDMultiple("rel", r.name)
							for (variable : r.variables) {
								val v = createVLSVariable => [
									it.name = variable.lookup(relationVar2VLS).name
								]
								it.terms += v

							}
						]
						it.right = base.transformTerm(r.value, trace, relationVar2VLS)
					]

				]

			]

		]

		// trace.relationDefinition2Predicate.put(r,res)
		trace.specification.formulas += comply;
		trace.specification.formulas += res;

	}
	
	def dispatch public void transformRelation(RelationDeclaration r, Logic2VampireLanguageMapperTrace trace) {

		// 1. store all variables in support wrt their name
		// 1.1 if variable has type, creating list of type declarations
		val List<VLSVariable> relationVar2VLS = new ArrayList
		val List<VLSFunction> relationVar2TypeDecComply = new ArrayList
		val typedefs = new ArrayList<VLSTerm>
		
		for (i : 0..<r.parameters.length) {
			
			val v = createVLSVariable => [
				it.name = support.toIDMultiple("Var", i.toString)
			]
			relationVar2VLS.add(v)

			val varTypeComply = createVLSFunction => [
				it.constant = support.toIDMultiple("type", (r.parameters.get(i) as ComplexTypeReference).referred.name)
				it.terms += createVLSVariable => [
					it.name = support.toIDMultiple("Var", i.toString)
				]
			]
			relationVar2TypeDecComply.add(varTypeComply)

		}
		

		val comply = createVLSFofFormula => [
			it.name = support.toIDMultiple("compliance", r.name)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				
				for (i : 0..<r.parameters.length) {
					val v = createVLSVariable => [
						it.name = relationVar2VLS.get(i).name
					]
					it.variables += v

				}
				
				it.operand = createVLSImplies => [
					it.left = createVLSFunction => [
						it.constant = support.toIDMultiple("rel", r.name)
						
						for (i : 0..<r.parameters.length) {
							val v = createVLSVariable => [
								it.name = relationVar2VLS.get(i).name
							]
							it.terms += v
						}
						
					]
					it.right = support.unfoldAnd(relationVar2TypeDecComply)
				]
			]
		]

		// trace.relationDefinition2Predicate.put(r,res)
		trace.specification.formulas += comply
	}

}
