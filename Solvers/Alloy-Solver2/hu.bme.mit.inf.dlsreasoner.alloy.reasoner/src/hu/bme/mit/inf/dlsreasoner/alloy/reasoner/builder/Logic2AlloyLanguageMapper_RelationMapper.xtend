package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import java.util.HashMap

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import java.util.List
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm

class Logic2AlloyLanguageMapper_RelationMapper {	
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper base;
	public new(Logic2AlloyLanguageMapper base) {
		this.base = base
	}
		
	def dispatch public void transformRelation(RelationDeclaration r, Logic2AlloyLanguageMapperTrace trace) {
		if(!trace.relationDefinitions.containsKey(r)) {
			if(r.transformToHostedField(trace)) {
				transformRelationDeclarationToHostedField(r,trace)
			} else {
				transformRelationDeclarationToGlobalField(r,trace)
			}
		}
	}
	
	def public createRelationDeclaration(String name, List<TypeReference> paramTypes, Logic2AlloyLanguageMapperTrace trace) {
		val field = createALSFieldDeclaration => [
			it.name = support.toID(name)
			it.type = support.unfoldReferenceDirectProduct(base,paramTypes,trace)
		]
		trace.logicLanguageBody.fields += field
		return field
	}
	
	def protected transformToHostedField(RelationDeclaration r, Logic2AlloyLanguageMapperTrace trace) {
		val first = r.parameters.get(0)
		if(r.parameters.size == 2) {
			if(first instanceof ComplexTypeReference) {
				val types = base.typeMapper.transformTypeReference(first.referred,base,trace)
				if(types.size == 1) {
					return true
				}
			}
		}
		return false
	}
	
	def protected transformRelationDeclarationToHostedField(RelationDeclaration r, Logic2AlloyLanguageMapperTrace trace) {
		val hostType = (r.parameters.head as ComplexTypeReference).referred
		
		val targetBody = base.typeMapper.transformTypeReference(hostType,base,trace).get(0).eContainer as ALSSignatureBody
		val field = createALSFieldDeclaration => [
			it.name = support.toID(r.getName)
			it.multiplicity = ALSMultiplicity.SET
			it.type = base.transformTypeReference(r.parameters.get(1),trace)
		]
		targetBody.fields += field
		trace.relationDeclaration2Field.put(r,field)
		
	}
	
	def protected transformRelationDeclarationToGlobalField(RelationDeclaration r, Logic2AlloyLanguageMapperTrace trace) {
		val field = createALSFieldDeclaration => [
			it.name = support.toID(r.name)
			it.type = support.unfoldReferenceDirectProduct(base,r.parameters,trace)
		]
		trace.logicLanguageBody.fields += field
		trace.relationDeclaration2Global.put(r, field)
	}

	def dispatch public void transformRelation(RelationDefinition r, Logic2AlloyLanguageMapperTrace trace) {
		val res = createALSRelationDefinition => [
			name = support.toID(r.name)
			// fill the variables later
			// fill the expression later
		]
		
		trace.relationDefinition2Predicate.put(r,res)
		trace.specification.relationDefinitions+=res;
	}
	
	def protected void transformRelationDefinitionSpecification(RelationDefinition r, Logic2AlloyLanguageMapperTrace trace) {
		val predicate = r.lookup(trace.relationDefinition2Predicate)
		if(predicate !== null) {
			val variableMap = new HashMap
			for(variable : r.variables) {
				val v = createALSVariableDeclaration => [
					it.name = support.toID(variable.name)
					it.range = base.transformTypeReference(variable.range,trace)
				]
				predicate.variables+=v
				variableMap.put(variable,v)
			}
			predicate.value = base.transformTerm(r.value,trace,variableMap)
		}
	}
	
	def public transformRelationReference(RelationDeclaration relation, Logic2AlloyLanguageMapperTrace trace) {
		if(relation.transformToHostedField(trace)) {
			return createALSReference => [it.referred = relation.lookup(trace.relationDeclaration2Field) ]
		} else {
			return createALSJoin => [
				leftOperand = createALSReference => [referred = trace.logicLanguage]
				rightOperand = createALSReference => [ referred = relation.lookup(trace.relationDeclaration2Global) ]]
		}
	}
	
	def public getRelationReference(RelationDeclaration relation, Logic2AlloyLanguageMapperTrace trace) {
		if(relation.transformToHostedField(trace)) {
			return relation.lookup(trace.relationDeclaration2Field)
		} else {
			return relation.lookup(trace.relationDeclaration2Global)
		}
	}
	
	public def dispatch void prepareTransitiveClosure(RelationDeclaration relation, Logic2AlloyLanguageMapperTrace trace) {
		// There is nothing to do, relation can be used in ^relation expressions
		if(transformToHostedField(relation,trace)) {
			trace.relationInTransitiveToHosterField.put(relation,relation.lookup(trace.relationDeclaration2Field))
		} else {
			trace.relationInTransitiveToGlobalField.put(relation,relation.lookup(trace.relationDeclaration2Global))
		}
	}
	public def dispatch void prepareTransitiveClosure(RelationDefinition relation, Logic2AlloyLanguageMapperTrace trace) {
		if(relation.parameters.size === 2) {
			/** 1. Create a relation that can be used in ^relation expressions */ 
			val declaration = this.createRelationDeclaration('''AsDeclaration «relation.name»''',relation.parameters,trace)
			trace.relationInTransitiveToHosterField.put(relation,declaration)
			/** 2. Add fact that the declaration corresponds to the definition */
			val fact = createALSFactDeclaration => [
				it.name = '''EqualsAsDeclaration «relation.name»'''
				it.term = createALSQuantifiedEx => [
					val a = createALSVariableDeclaration => [
						it.name = "a"
						it.range = base.transformTypeReference(relation.parameters.get(0),trace)
					]
					val b = createALSVariableDeclaration => [
						it.name = "b"
						it.range = base.transformTypeReference(relation.parameters.get(1),trace)
					]
					it.variables += a
					it.variables += b
					it.type = ALSMultiplicity::ALL
					it.expression = createALSIff => [
						it.leftOperand = createALSFunctionCall => [
							it.referredDefinition = relation.lookup(trace.relationDefinition2Predicate)
							it.params += createALSReference => [ it.referred = a ]
							it.params += createALSReference => [ it.referred = b ]
						]
						it.rightOperand = createALSSubset => [
							it.leftOperand = createALSJoin => [
								it.leftOperand = createALSReference => [ referred = a ]
								it.rightOperand = createALSReference => [ referred = b ]
							]
							it.rightOperand = createALSJoin => [
								leftOperand = createALSReference => [referred = trace.logicLanguage]
								rightOperand = createALSReference => [ referred = declaration ]
							]
						]
					]
				]
			]
			trace.specification.factDeclarations += fact
			return
		} else {
			throw new AssertionError('''A non-binary relation "«relation.name»" is used in transitive clousure!''')
		}
	}
		
	def public transformTransitiveRelationReference(Relation relation, ALSTerm source, ALSTerm target, Logic2AlloyLanguageMapperTrace trace) {
		val alsTargetRelation = if(trace.relationInTransitiveToGlobalField.containsKey(relation)) {
			createALSJoin => [
				leftOperand = createALSReference => [referred = trace.logicLanguage]
				rightOperand = createALSReference => [ referred =relation.lookup(trace.relationInTransitiveToGlobalField) ]
			]
		} else if(trace.relationInTransitiveToHosterField.containsKey(relation)){
			createALSReference => [it.referred = relation.lookup(trace.relationInTransitiveToHosterField) ]
		} else {
			throw new AssertionError('''Relation «relation.name» is not prepared to transitive closure!''')
		}
		return createALSSubset => [
			it.leftOperand = createALSJoin => [
				it.leftOperand = source
				it.rightOperand = target
			]
			it.rightOperand = createAlSTransitiveClosure => [it.operand = alsTargetRelation]
			
		]
	}
}