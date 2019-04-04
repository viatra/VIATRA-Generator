package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunctionAsTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSInequality
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.EList

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2VampireLanguageMapper_Support {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE

// ID Handler
	def protected String toIDMultiple(String... ids) {
		ids.map[it.split("\\s+").join("_")].join("_")
	}

	def protected String toID(String ids) {
		ids.split("\\s+").join("_")
	}

// Term Handling
// TODO Make more general
	def protected VLSVariable duplicate(VLSVariable term) {
		return createVLSVariable => [it.name = term.name]
	}

	def protected VLSFunctionAsTerm duplicate(VLSFunctionAsTerm term) {
		return createVLSFunctionAsTerm => [it.functor = term.functor]
	}

	def protected VLSConstant duplicate(VLSConstant term) {
		return createVLSConstant => [it.name = term.name]
	}

	def protected VLSFunction duplicate(VLSFunction term) {
		return createVLSFunction => [
			it.constant = term.constant
			for (v : term.terms) {
				it.terms += duplicate(v as VLSVariable)
			}
		]
	}

	def protected VLSFunction duplicate(VLSFunction term, VLSVariable v) {
		return createVLSFunction => [
			it.constant = term.constant
			it.terms += duplicate(v)
		]
	}

	def protected VLSFunction duplicate(VLSFunction term, List<VLSVariable> vars) {
		return createVLSFunction => [
			it.constant = term.constant
			for (v : vars) {
				it.terms += duplicate(v)
			}
		]
	}

	def protected VLSFunction duplicate(VLSFunction term, VLSFunctionAsTerm v) {
		return createVLSFunction => [
			it.constant = term.constant
			it.terms += duplicate(v)
		]
	}

	def protected VLSConstant toConstant(VLSFunctionAsTerm term) {
		return createVLSConstant => [
			it.name = term.functor
		]
	}

	def protected VLSFunction topLevelTypeFunc() {
		return createVLSFunction => [
			it.constant = "object"
			it.terms += createVLSVariable => [
				it.name = "A"
			]
		]
	}

	def protected VLSFunction topLevelTypeFunc(VLSVariable v) {
		return createVLSFunction => [
			it.constant = "object"
			it.terms += duplicate(v)
		]
	}

	def protected VLSFunction topLevelTypeFunc(VLSFunctionAsTerm v) {
		return createVLSFunction => [
			it.constant = "object"
			it.terms += duplicate(v)
		]
	}

// TODO Make more general
	def establishUniqueness(List<VLSConstant> terms, VLSConstant t2) {
//		val List<VLSInequality> eqs = newArrayList
//		for (t1 : terms.subList(1, terms.length)) {
//			for (t2 : terms.subList(0, terms.indexOf(t1))) {
//				val eq = createVLSInequality => [
//					// TEMP
//					it.left = createVLSConstant => [it.name = t2.name]
//					it.right = createVLSConstant => [it.name = t1.name]
//				// TEMP
//				]
//				eqs.add(eq)
//			}
//		}
//		return unfoldAnd(eqs)
		val List<VLSInequality> eqs = newArrayList
		for (t1 : terms) {
			if (t1 != t2) {
				val eq = createVLSInequality => [
					it.left = createVLSConstant => [it.name = t2.name]
					it.right = createVLSConstant => [it.name = t1.name]
				]
				eqs.add(eq)
			}
		}
		return unfoldAnd(eqs)
	}

// Support Functions
// booleans
// AND and OR
	def protected VLSTerm unfoldAnd(List<? extends VLSTerm> operands) {
		if (operands.size == 1) {
			return operands.head
		} else if (operands.size > 1) {
			return createVLSAnd => [
				left = operands.head
				right = operands.subList(1, operands.size).unfoldAnd
			]
		} else
			throw new UnsupportedOperationException('''Logic operator with 0 operands!''')
	}

	def protected VLSTerm unfoldOr(List<? extends VLSTerm> operands) {
//		if(operands.size == 0) {basically return true}
		/*else*/ if (operands.size == 1) {
			return operands.head
		} else if (operands.size > 1) {
			return createVLSOr => [
				left = operands.head
				right = operands.subList(1, operands.size).unfoldOr
			]
		} else
			throw new UnsupportedOperationException('''Logic operator with 0 operands!''') // TEMP
	}

// can delete below
	def protected VLSTerm unfoldDistinctTerms(Logic2VampireLanguageMapper m, EList<Term> operands,
		Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		if (operands.size == 1) {
			return m.transformTerm(operands.head, trace, variables)
		} else if (operands.size > 1) {
			val notEquals = new ArrayList<VLSTerm>(operands.size * operands.size / 2)
			for (i : 0 ..< operands.size) {
				for (j : i + 1 ..< operands.size) {
					notEquals += createVLSInequality => [
						it.left = m.transformTerm(operands.get(i), trace, variables)
						it.right = m.transformTerm(operands.get(j), trace, variables)
					]
				}
			}
			return notEquals.unfoldAnd
		} else
			throw new UnsupportedOperationException('''Logic operator with 0 operands!''')
	}

// Symbolic
// def postprocessResultOfSymbolicReference(TypeReference type, VLSTerm term, Logic2VampireLanguageMapperTrace trace) {
//		if(type instanceof BoolTypeReference) {
//			return booleanToLogicValue(term ,trace)
//		}
//		else return term
//	}
//	def booleanToLogicValue(VLSTerm term, Logic2VampireLanguageMapperTrace trace) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
//	}
	/*
	 * def protected  String toID(List<String> ids) {
	 * 	ids.map[it.split("\\s+").join("'")].join("'")
	 * }
	 */
// QUANTIFIERS + VARIABLES
	def protected VLSTerm createQuantifiedExpression(Logic2VampireLanguageMapper mapper,
		QuantifiedExpression expression, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables,
		boolean isUniversal) {
		val variableMap = expression.quantifiedVariables.toInvertedMap [ v |
			createVLSVariable => [it.name = toIDMultiple("V", v.name)]
		]

		val typedefs = new ArrayList<VLSTerm>
		for (variable : expression.quantifiedVariables) {
			val eq = duplicate((variable.range as ComplexTypeReference).referred.lookup(trace.type2Predicate),
				variable.lookup(variableMap))
			typedefs.add(eq)
		}
		if (isUniversal) {
			createVLSUniversalQuantifier => [
				it.variables += variableMap.values
				it.operand = createVLSImplies => [
					it.left = unfoldAnd(typedefs)
					it.right = mapper.transformTerm(expression.expression, trace, variables.withAddition(variableMap))
				]
			]
		} else {
			typedefs.add(mapper.transformTerm(expression.expression, trace, variables.withAddition(variableMap)))
			createVLSExistentialQuantifier => [
				it.variables += variableMap.values
				it.operand = unfoldAnd(typedefs)

			]
		}

	}

	def protected boolean dfsSupertypeCheck(Type type, Type type2) {
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
	//TODO rewrite such that it uses "listSubTypes"
	def protected boolean dfsSubtypeCheck(Type type, Type type2) {
		// There is surely a better way to do this
		if (type.subtypes.isEmpty)
			return false
		else {
			if (type.subtypes.contains(type2))
				return true
			else {
				for (subtype : type.subtypes) {
					if(dfsSubtypeCheck(subtype, type2)) return true
				}
			}
		}
	}

	def protected List<Type> listSubtypes(Type t) {
		var List<Type> allSubtypes = newArrayList
		if (!t.subtypes.isEmpty) {
			for (subt : t.subtypes) {
				allSubtypes.add(subt)
				allSubtypes = listSubtypes(subt)
			}
		}
		return allSubtypes
	}

	def protected withAddition(Map<Variable, VLSVariable> map1, Map<Variable, VLSVariable> map2) {
		new HashMap(map1) => [putAll(map2)]
	}

}
