package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.HashMap

class Logic2AlloyLanguageMapper_FunctionMapper {
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper base;
	public new(Logic2AlloyLanguageMapper base) {
		this.base = base
	}
	
	def protected dispatch transformFunction(FunctionDeclaration f, Logic2AlloyLanguageMapperTrace trace) {
		if(!trace.constantDefinitions.containsKey(f)) {
			if(transformedToHostedField(f,trace)) transformFunctionToFieldOfSignature(f,trace)
			else transformFunctionToGlobalRelation(f,trace)
		}
	}
	
	def protected transformedToHostedField(FunctionDeclaration f, Logic2AlloyLanguageMapperTrace trace) {
		if(f.parameters.size == 1 && f.parameters.head instanceof ComplexTypeReference) {
			val head = f.parameters.head
			if(head instanceof ComplexTypeReference) {
				val types = base.typeMapper.transformTypeReference(head.referred,base,trace)
				return types.size == 1
			}
		}
		return (f.parameters.size == 1 && f.parameters.head instanceof ComplexTypeReference)
	}
	def protected transformFunctionToFieldOfSignature(FunctionDeclaration f,Logic2AlloyLanguageMapperTrace trace) {
		val param = (f.parameters.head as ComplexTypeReference)
		val referred = param.referred
		val field = createALSFieldDeclaration => [
			it.name = support.toID(f.getName)
			it.multiplicity = ALSMultiplicity.ONE
			it.type = base.transformTypeReference(f.range,trace)
		]
		val host = base.typeMapper.transformTypeReference(referred,base,trace).get(0)
		(host.eContainer as ALSSignatureBody).fields += field
		trace.functionDeclaration2HostedField.put(f, field)
	}
	def protected transformFunctionToGlobalRelation(FunctionDeclaration f, Logic2AlloyLanguageMapperTrace trace) {
		val field = createALSFieldDeclaration => [
			it.name = support.toID(f.name)
			it.multiplicity = ALSMultiplicity.SET
			it.type = createALSDirectProduct => [
				it.leftOperand = support.unfoldReferenceDirectProduct(base,f.parameters,trace)
				it.rightMultiplicit = ALSMultiplicity.ONE
				it.rightOperand = base.transformTypeReference(f.range,trace)
			]
		]
		trace.logicLanguageBody.fields += field
		trace.functionDeclaration2LanguageField.put(f, field)
	}
	
	def protected dispatch transformFunction(FunctionDefinition f, Logic2AlloyLanguageMapperTrace trace) {
		val res = createALSFunctionDefinition => [
			name = support.toID(f.name)
			// variables + specification later
		]
		trace.specification.functionDefinitions+=res;
		trace.functionDefinition2Function.put(f,res)
	}
	
	def protected transformFunctionDefinitionSpecification(FunctionDefinition f, Logic2AlloyLanguageMapperTrace trace) {
		val target = f.lookup(trace.functionDefinition2Function)
		val variableMap = new HashMap
		for(variable : f.variable) {
			val v = createALSVariableDeclaration => [
				it.name = support.toID(variable.name)
				it.range = base.transformTypeReference(variable.range,trace)
				// specification later
			]
			target.variables+=v
			variableMap.put(variable,v)
		}
		target.value = base.transformTerm(f.value,trace,variableMap)
	}
	
}