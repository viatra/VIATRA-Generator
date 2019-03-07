package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import java.util.List
import java.util.ArrayList

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2VampireLanguageMapper_ScopeMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val Logic2VampireLanguageMapper base
	private val VLSVariable variable = createVLSVariable => [it.name = "A"]

	public new(Logic2VampireLanguageMapper base) {
		this.base = base
	}

	def dispatch public void transformScope(LogicSolverConfiguration config, Logic2VampireLanguageMapperTrace trace) {

//		HANDLE ERRORS RELATED TO MAX > MIN
//		HANDLE ERROR RELATED TO SUM(MIN TYPES) > MAX OBJECTS
//		NOT SPECIFIED MEANS =0 ?
		// 1. make a list of constants equaling the min number of specified objects
		val GLOBAL_MIN = config.typeScopes.minNewElements
		val GLOBAL_MAX = config.typeScopes.maxNewElements

		val localInstances = newArrayList

		// Handling Minimum_General
		if (GLOBAL_MIN != 0) {
			getInstanceConstants(GLOBAL_MIN, 0, localInstances, trace, false) // fix last param
			makeFofFormula(localInstances, trace, true, "object")
		}

		// Handling Maximum_General
		if (GLOBAL_MAX != 0) {
			getInstanceConstants(GLOBAL_MAX, 0, localInstances, trace, true) // fix last param
			makeFofFormula(localInstances, trace, false, "object")
		}

		// Handling Minimum_Specific
		var i = 0
		var minNum = -1
		for (t : config.typeScopes.minNewElementsByType.keySet) {
			minNum = t.lookup(config.typeScopes.minNewElementsByType)
			if (minNum != 0) {
				getInstanceConstants(i+minNum, i, localInstances, trace, false)
				i += minNum
				makeFofFormula(localInstances, trace, true, t.toString)//fix last param
			}
		}

		//TODO: calc sum of mins, compare to current value of i
		
		// Handling Maximum_Specific
		for (t : config.typeScopes.maxNewElementsByType.keySet) {
			var maxNum = t.lookup(config.typeScopes.maxNewElementsByType)
			minNum = t.lookup(config.typeScopes.minNewElementsByType)
			if (maxNum != 0) {
				var forLimit = Math.min(GLOBAL_MAX, i+maxNum-minNum)
				getInstanceConstants(GLOBAL_MAX, i, localInstances, trace, false)
				makeFofFormula(localInstances, trace, false, t.toString)//fix last param
			}
		}

		// 3. Specify uniqueness of elements
		if (trace.uniqueInstances.length != 0) {
			val uniqueness = createVLSFofFormula => [
				it.name = "typeUniqueness"
				it.fofRole = "axiom"
				it.fofFormula = support.establishUniqueness(trace.uniqueInstances)
			]
			trace.specification.formulas += uniqueness
		}

	}

	def protected void getInstanceConstants(int numElems, int init, ArrayList list,
		Logic2VampireLanguageMapperTrace trace, boolean addToTrace) {
		list.clear
		for (var i = init; i < numElems; i++) {
			val num = i + 1
			val cst = createVLSConstant => [
				it.name = "o" + num
			]
			if (addToTrace) {
				trace.uniqueInstances.add(cst)
			}
			list.add(cst)
		}
	}

	def protected void makeFofFormula(ArrayList list, Logic2VampireLanguageMapperTrace trace, boolean minimum, String name) {
		val cstDec = createVLSFofFormula => [
			it.name = support.toIDMultiple("typeScope", if(minimum) "min" else "max", name)
			it.fofRole = "axiom"
			it.fofFormula = createVLSUniversalQuantifier => [
				it.variables += support.duplicate(variable)
				// check below
				it.operand = createVLSImplies => [
					if (minimum) {
						it.left = support.unfoldOr(list.map [ i |
							createVLSEquality => [
								it.left = createVLSVariable => [it.name = variable.name]
								it.right = i
							]
						])
						it.right = support.topLevelTypeFunc
					} else {
						it.right = support.unfoldOr(list.map [ i |
							createVLSEquality => [
								it.left = createVLSVariable => [it.name = variable.name]
								it.right = i
							]
						])
						it.left = support.topLevelTypeFunc
					}
				]
			]
		]
		trace.specification.formulas += cstDec
	}

}
