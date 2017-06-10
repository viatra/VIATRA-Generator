package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import java.util.HashMap

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2AlloyLanguageMapper_RelationMapper {	
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper base;
	public new(Logic2AlloyLanguageMapper base) {
		this.base = base
	}
		
	def dispatch protected void  transformRelation(RelationDeclaration r, Logic2AlloyLanguageMapperTrace trace) {
		if(!trace.relationDefinitions.containsKey(r)) {
			if(r.transformToHostedField(trace)) {
				transformRelationDeclarationToHostedField(r,trace)
			} else {
				transformRelationDeclarationToGlobalField(r,trace)
			}
		}
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

	def dispatch protected void transformRelation(RelationDefinition r, Logic2AlloyLanguageMapperTrace trace) {
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
}