package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.util.EcoreUtil

class Logic2AlloyLanguageMapper_Support {
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	
	/// ID handling
	def protected String toIDMultiple(String... ids) {
		ids.map[it.split("\\s+").join("'")].join("'")
	}
	
	def protected  String toID(String ids) {
		ids.split("\\s+").join("'")
	}
	def protected  String toID(List<String> ids) {
		ids.map[it.split("\\s+").join("'")].join("'")
	}
	
	/// Support functions
	
	def protected getBooleanType(Logic2AlloyLanguageMapperTrace trace) {
		if(trace.boolType!=null) {
			return trace.boolType
		} else {
			trace.boolType = createALSEnumDeclaration => [
				it.name = toID(#["util","boolean"])
				trace.boolTrue = createALSEnumLiteral =>[it.name=toID(#["util","boolean","true"])]
				it.literal += trace.boolTrue
				trace.boolFalse = createALSEnumLiteral =>[it.name=toID(#["util","boolean","false"])]
				it.literal += trace.boolFalse
			]
			trace.specification.enumDeclarations+=trace.boolType
			return trace.boolType
		}
	}
	def protected getBooleanTrue(Logic2AlloyLanguageMapperTrace trace) {
		getBooleanType(trace)
		return trace.boolTrue	
	}
	def protected getBooleanFalse(Logic2AlloyLanguageMapperTrace trace) {
		getBooleanType(trace)
		return trace.boolFalse
	}
	
	def protected booleanToLogicValue(ALSTerm boolReference, Logic2AlloyLanguageMapperTrace trace) {
		//println((boolReference as ALSReference).referred)
		createALSEquals => [
			leftOperand = EcoreUtil.copy(boolReference)
			rightOperand = createALSReference => [referred = getBooleanTrue(trace)]
		]
	}
	def protected booleanToEnumValue(ALSTerm value, Logic2AlloyLanguageMapperTrace trace) {
		if(value instanceof ALSEquals) {
			val rightOperand = value.rightOperand
			if(rightOperand instanceof ALSReference) {
				if(rightOperand.referred == getBooleanTrue(trace)) {
					return value.leftOperand
				}
			}
		}
		return value;
	}
	def protected prepareParameterOfSymbolicReference(TypeReference type, ALSTerm term, Logic2AlloyLanguageMapperTrace trace) {
		if(type instanceof BoolTypeReference) {
			return booleanToEnumValue(term,trace)
		}
		else return term
	}
	def protected postprocessResultOfSymbolicReference(TypeReference type, ALSTerm term, Logic2AlloyLanguageMapperTrace trace) {
		if(type instanceof BoolTypeReference) {
			return booleanToLogicValue(term,trace)
		}
		else return term
	}
	 
	def protected ALSTerm unfoldAnd(List<? extends ALSTerm> operands) {
		if(operands.size == 1) { return operands.head }
		else if(operands.size > 1) { return createALSAnd=>[
			leftOperand=operands.head
			rightOperand=operands.subList(1,operands.size).unfoldAnd
		]}
		else throw new UnsupportedOperationException('''Logic operator with 0 operands!''')
	}
	
	def protected ALSTerm unfoldOr(List<? extends ALSTerm> operands, Logic2AlloyLanguageMapperTrace trace) {
		if(operands.size == 0) { return unfoldTrueStatement(trace)}
		else if(operands.size == 1) { return operands.head }
		else if(operands.size > 1) { return createALSOr=>[
			leftOperand=operands.head
			rightOperand=unfoldOr(operands.subList(1,operands.size),trace)
		]}
		//else throw new UnsupportedOperationException('''Logic operator with 0 operands!''')
	}
	
	protected def unfoldTrueStatement(Logic2AlloyLanguageMapperTrace trace) {
		createALSEquals => [
				it.leftOperand = createALSReference => [it.referred = getBooleanTrue(trace)]
				it.rightOperand = createALSReference => [it.referred = getBooleanTrue(trace)]
			]
	}
	
	protected def unfoldTFalseStatement(Logic2AlloyLanguageMapper m, Logic2AlloyLanguageMapperTrace trace) {
		createALSEquals => [
				it.leftOperand = createALSReference => [it.referred = getBooleanTrue(trace)]
				it.rightOperand = createALSReference => [it.referred = getBooleanTrue(trace)]
			]
	}
	
	def protected ALSTerm unfoldPlus(List<? extends ALSTerm> operands) {
		if(operands.size == 1) { return operands.head }
		else if(operands.size > 1) { return createALSPlus=>[
			leftOperand=operands.head
			rightOperand=operands.subList(1,operands.size).unfoldPlus
		]}
		else return createALSNone
	}
	
	def protected ALSTerm unfoldIntersection(List<? extends ALSTerm> operands) {
		if(operands.size == 1) { return operands.head }
		else if(operands.size > 1) { return createALSIntersection=>[
			leftOperand=operands.head
			rightOperand=operands.subList(1,operands.size).unfoldIntersection
		]}
		else throw new UnsupportedOperationException('''Logic operator with 0 operands!''')
	}
	
	def protected ALSTerm unfoldDistinctTerms(Logic2AlloyLanguageMapper m, List<Term> operands, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		if(operands.size == 1) { return m.transformTerm(operands.head,trace,variables) }
		else if(operands.size > 1) {
			val notEquals = new ArrayList<ALSTerm>(operands.size*operands.size/2)
			for(i:0..<operands.size) {
				for(j: i+1..<operands.size) {
					notEquals+=createALSNotEquals=>[
						leftOperand = m.transformTerm(operands.get(i),trace,variables)
						rightOperand = m.transformTerm(operands.get(j),trace,variables)
					]
				}
			}
			return notEquals.unfoldAnd
		 }
		else throw new UnsupportedOperationException('''Logic operator with 0 operands!''')
	}
	
	def protected ALSTerm unfoldReferenceDirectProduct(Logic2AlloyLanguageMapper m, List<TypeReference> references,Logic2AlloyLanguageMapperTrace trace) {
		if(references.size == 1) return m.transformTypeReference(references.head,trace)
		else if(references.size > 1) return createALSDirectProduct => [
			it.leftOperand = m.transformTypeReference(references.head,trace)
			it.rightOperand = unfoldReferenceDirectProduct(m,references.subList(1,references.size),trace)
		]
		else throw new UnsupportedOperationException
	}
	
	def protected ALSTerm unfoldDotJoin(Logic2AlloyLanguageMapper m, List<Term> elements, ALSTerm target, Logic2AlloyLanguageMapperTrace trace,
		Map<Variable, ALSVariableDeclaration> variables) {
		if (elements.size == 1) {
			return createALSJoin => [
				it.leftOperand = m.transformTerm(elements.head,trace, variables)
				it.rightOperand = target
			]
		} else if (elements.size > 1) {
			return createALSJoin => [
				it.leftOperand = m.transformTerm(elements.last,trace, variables)
				it.rightOperand = m.unfoldDotJoin(elements.subList(0, elements.size - 1), target, trace, variables)
			]
		} else
			throw new UnsupportedOperationException
	}
	
	def protected ALSTerm unfoldTermDirectProduct(Logic2AlloyLanguageMapper m, List<Term> references,Logic2AlloyLanguageMapperTrace trace,Map<Variable, ALSVariableDeclaration> variables) {
		if(references.size == 1) return m.transformTerm(references.head,trace,variables)
		else if(references.size > 1) return createALSDirectProduct => [
			it.leftOperand = m.transformTerm(references.head,trace,variables)
			it.rightOperand = unfoldTermDirectProduct(m,references.subList(1,references.size),trace, variables)
		]
		else throw new UnsupportedOperationException
	}
	
	def protected createQuantifiedExpression(Logic2AlloyLanguageMapper m, QuantifiedExpression q, ALSMultiplicity multiplicity, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		val variableMap = q.quantifiedVariables.toInvertedMap[v | createALSVariableDeclaration=> [
				it.name = toID(v.name)
				it.range = m.transformTypeReference(v.range,trace) ]]
			
		createALSQuantifiedEx=>[
			it.type = multiplicity
			it.variables += variableMap.values
			it.expression = m.transformTerm(q.expression,trace,variables.withAddition(variableMap))
		]
	}
	
	def protected withAddition(Map<Variable, ALSVariableDeclaration> v1, Map<Variable, ALSVariableDeclaration> v2) { new HashMap(v1) => [putAll(v2)] }
}