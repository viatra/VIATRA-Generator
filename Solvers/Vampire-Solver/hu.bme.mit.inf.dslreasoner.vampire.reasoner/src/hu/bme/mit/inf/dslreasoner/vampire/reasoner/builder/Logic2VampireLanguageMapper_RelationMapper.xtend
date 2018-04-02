package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import java.util.ArrayList

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
		for (variable : r.variables) {
			val v = createVLSVariable => [
				it.name = support.toIDMultiple("Var", variable.name)
			]
			trace.relationVar2VLS.put(variable, v)

			val varType = createVLSFunction => [
				it.constant = support.toIDMultiple("type" /*, name of type*/)
				it.terms += createVLSVariable => [
					it.name = support.toIDMultiple("Var", variable.name)
				]
			]
			trace.relationVar2TypeDec.put(variable, varType)
		}

		val res = createVLSFofFormula => [
			it.name = support.toIDMultiple("relation", r.name)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				for (variable : r.variables) {
					val v = createVLSVariable => [
						it.name = variable.lookup(trace.relationVar2VLS).name
					]
					it.variables += v

				}
				it.operand = createVLSImplies => [
					it.left = support.unfoldAnd(new ArrayList<VLSTerm>(trace.relationVar2TypeDec.values))
					it.right = createVLSEquivalent => [
						it.left = createVLSFunction => [
							it.constant = support.toIDMultiple("rel", r.name)
							for (variable : r.variables) {
								val v = createVLSVariable => [
									it.name = variable.lookup(trace.relationVar2VLS).name
								]
								it.terms += v

							}
						]
						it.right = base.transformTerm(r.value, trace, trace.relationVar2VLS)
					]

				]

			]

		]

		// trace.relationDefinition2Predicate.put(r,res)
		trace.specification.formulas += res;
	}

}
