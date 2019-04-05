package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import java.util.ArrayList
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.HashMap
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import java.util.List

class Logic2VampireLanguageMapper_ScopeMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val Logic2VampireLanguageMapper base
	private val VLSVariable variable = createVLSVariable => [it.name = "A"]

	public new(Logic2VampireLanguageMapper base) {
		this.base = base
	}

	def dispatch public void transformScope(LogicSolverConfiguration config, Logic2VampireLanguageMapperTrace trace) {
		val ABSOLUTE_MIN = 0
		val ABSOLUTE_MAX = Integer.MAX_VALUE

//		TODO HANDLE ERRORS RELATED TO MAX > MIN
//		TODO HANDLE ERROR RELATED TO SUM(MIN TYPES)+1(for root) > MAX OBJECTS
//		TODO HANDLE 
		// 1. make a list of constants equaling the min number of specified objects
		val GLOBAL_MIN = config.typeScopes.minNewElements
		val GLOBAL_MAX = config.typeScopes.maxNewElements

		val localInstances = newArrayList

		val consistant = GLOBAL_MAX > GLOBAL_MIN

		// Handling Minimum_General
		if (GLOBAL_MIN != ABSOLUTE_MIN) {
			// *
			getInstanceConstants(GLOBAL_MIN, 0, localInstances, trace, true, !consistant)
			if (consistant) {
				for (i : trace.uniqueInstances) {
					localInstances.add(support.duplicate(i))
				}
				makeFofFormula(localInstances, trace, true, null)
			} else {
				makeFofFormula(trace.uniqueInstances as ArrayList, trace, true, null)
			}
		}

		// Handling Maximum_General
		if (GLOBAL_MAX != ABSOLUTE_MAX) {
			getInstanceConstants(GLOBAL_MAX, 0, localInstances, trace, true, consistant)
			if (consistant) {
				makeFofFormula(trace.uniqueInstances as ArrayList, trace, false, null)
			} else {
				makeFofFormula(localInstances, trace, false, null)
			}
		}

		// Handling Minimum_Specific
		var i = 1
		var minNum = -1
		var Map<Type, Integer> startPoints = new HashMap
		for (t : config.typeScopes.minNewElementsByType.keySet) {
			minNum = t.lookup(config.typeScopes.minNewElementsByType)
			if (minNum != 0) {
				getInstanceConstants(i + minNum, i, localInstances, trace, true, false)
				startPoints.put(t, i)
				i += minNum
				makeFofFormula(localInstances, trace, true, t)
			}
		}

		// TODO: calc sum of mins, compare to current value of i
		// Handling Maximum_Specific
		for (t : config.typeScopes.maxNewElementsByType.keySet) {
			var maxNum = t.lookup(config.typeScopes.maxNewElementsByType)
			minNum = t.lookup(config.typeScopes.minNewElementsByType)
			var startpoint = t.lookup(startPoints)
			if (minNum != 0) {
				getInstanceConstants(startpoint + minNum, startpoint, localInstances, trace, true, false)
			}
			if (maxNum != minNum) {
				var instEndInd = Math.min(GLOBAL_MAX, i + maxNum - minNum)
				getInstanceConstants(instEndInd, i, localInstances, trace, false, false)
				makeFofFormula(localInstances, trace, false, t)
			}
		}

// 3. Specify uniqueness of elements
		// TEMP
		val DUPLICATES = false

		val numInst = trace.uniqueInstances.length
		var ind = 1
		if (numInst != 0) {
			if (DUPLICATES) {
				// W/ DUPLICATES
				for (e : trace.uniqueInstances) {
					val x = ind
					val uniqueness = createVLSFofFormula => [
						it.name = support.toIDMultiple("t_uniqueness", e.name)
						it.fofRole = "axiom"
						it.fofFormula = support.establishUniqueness(trace.uniqueInstances, e)
					]
					trace.specification.formulas += uniqueness
					ind++
				}
			} else {
				// W/O DUPLICATES
				for (e : trace.uniqueInstances.subList(0, numInst - 1)) {
					val x = ind
					val uniqueness = createVLSFofFormula => [
						it.name = support.toIDMultiple("t_uniqueness", e.name)
						it.fofRole = "axiom"
						it.fofFormula = support.establishUniqueness(trace.uniqueInstances.subList(x, numInst), e)
					]
					trace.specification.formulas += uniqueness
					ind++
				}
			}
		}
	}

	def protected void getInstanceConstants(int endInd, int startInd, ArrayList list,
		Logic2VampireLanguageMapperTrace trace, boolean clear, boolean addToTrace) {
		if (clear) {
			list.clear
		}
		for (var i = startInd; i < endInd; i++) {
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

	def protected void makeFofFormula(ArrayList list, Logic2VampireLanguageMapperTrace trace, boolean minimum,
		Type type) {
		var nm = ""
		var VLSTerm tm = null
		if (type === null) {
			nm = "object"
			tm = support.topLevelTypeFunc
		} else {
			nm = type.lookup(trace.type2Predicate).constant.toString
			tm = createVLSAnd => [
				it.left = support.duplicate(type.lookup(trace.type2Predicate))
				it.right = support.topLevelTypeFunc
			]
//			tm = support.duplicate(type.lookup(trace.type2Predicate))
		}
		val name = nm
		val term = tm

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
						it.right = term
					} else {
						it.left = term
						it.right = support.unfoldOr(list.map [ i |
							createVLSEquality => [
								it.left = createVLSVariable => [it.name = variable.name]
								it.right = i
							]
						])

					}
				]
			]
		]
		trace.specification.formulas += cstDec
	}

}
