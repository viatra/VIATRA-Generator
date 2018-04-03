package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import org.eclipse.emf.common.util.EList
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term

class Logic2VampireLanguageMapper_Support {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE

	// ID Handler
	def protected String toIDMultiple(String... ids) {
		ids.map[it.split("\\s+").join("_")].join("_")
	}

	def protected String toID(String ids) {
		ids.split("\\s+").join("_")
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

	def protected unfoldDistinctTerms(Logic2VampireLanguageMapper m, EList<Term> operands,
		Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
			if(operands.size == 1) { return m.transformTerm(operands.head,trace,variables) }
		else if(operands.size > 1) {
			val notEquals = new ArrayList<VLSTerm>(operands.size*operands.size/2)
			for(i:0..<operands.size) {
				for(j: i+1..<operands.size) {
					notEquals+=createVLSInequality=>[
						it.left= m.transformTerm(operands.get(i),trace,variables)
						it.right = m.transformTerm(operands.get(j),trace,variables)
					]
				}
			}
			return notEquals.unfoldAnd
		 }
		else throw new UnsupportedOperationException('''Logic operator with 0 operands!''')
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
	def protected VLSTerm createUniversallyQuantifiedExpression(Logic2VampireLanguageMapper mapper,
		QuantifiedExpression expression, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		val variableMap = expression.quantifiedVariables.toInvertedMap [ v |
			createVLSVariable => [it.name = toIDMultiple("Var", v.name)]
		]

		val typedefs = new ArrayList<VLSTerm>
		for (variable : expression.quantifiedVariables) {
			val eq = createVLSFunction => [
				it.constant = toIDMultiple("type", (variable.range as ComplexTypeReference).referred.name)
				it.terms += createVLSVariable => [
					it.name = toIDMultiple("Var", variable.name)
				]

			]
			typedefs.add(eq)
		}
		

		createVLSUniversalQuantifier => [
			it.variables += variableMap.values
			it.operand = createVLSImplies => [
				it.left = unfoldAnd(typedefs)
				it.right = mapper.transformTerm(expression.expression, trace, variables.withAddition(variableMap))
			]
		]
	}

	def protected VLSTerm createExistentiallyQuantifiedExpression(Logic2VampireLanguageMapper mapper,
		QuantifiedExpression expression, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		val variableMap = expression.quantifiedVariables.toInvertedMap [ v |
			createVLSVariable => [it.name = toIDMultiple("Var", v.name)]
		]

		val typedefs = new ArrayList<VLSTerm>
		for (variable : expression.quantifiedVariables) {
			val eq = createVLSFunction => [
				it.constant = toIDMultiple("type", (variable.range as ComplexTypeReference).referred.name)
				it.terms += createVLSVariable => [
					it.name = toIDMultiple("Var", variable.name)
				]
			]
			typedefs.add(eq)
		}

		typedefs.add(mapper.transformTerm(expression.expression, trace, variables.withAddition(variableMap)))
		createVLSExistentialQuantifier => [
			it.variables += variableMap.values
			it.operand = unfoldAnd(typedefs)

		]
	}

	def protected withAddition(Map<Variable, VLSVariable> map1, Map<Variable, VLSVariable> map2) {
		new HashMap(map1) => [putAll(map2)]
	}

}
