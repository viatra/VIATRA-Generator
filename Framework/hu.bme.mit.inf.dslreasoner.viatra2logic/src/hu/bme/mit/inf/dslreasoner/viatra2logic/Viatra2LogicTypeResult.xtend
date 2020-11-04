package hu.bme.mit.inf.dslreasoner.viatra2logic

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.xbase.lib.Functions.Function0
import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference

@Data class Viatra2LogicTypeResult{
	Map<Pair<PQuery,PParameter>,Function0<TypeReference>> typesInParameters
	Map<Pair<PBody,PVariable>,Function0<TypeReference>> typesInBodies;
	
	def addType(PBody body, PVariable variable, TypeReference typeConstructor) {
		typesInBodies.put(body->variable,typeConstructor.createTypeConstructor)
	}
	def addType(PQuery query, PParameter variable, TypeReference typeConstructor) {
		typesInParameters.put(query->variable,typeConstructor.createTypeConstructor)
	}
	def getType(PBody body, PVariable variable) {
		return (body->variable).lookup(typesInBodies).apply
	}
	def getType(PQuery query, PParameter variable) {
		return (query->variable).lookup(typesInParameters).apply
	}
	
	def containsSolution(PBody body, PVariable variable) {
		return typesInBodies.containsKey(body->variable)
	}
	def containsSolution(PParameter variable) {
		return typesInParameters.containsKey(variable)
	}
	
	def dispatch Function0<TypeReference> createTypeConstructor(ComplexTypeReference ref) {
		return [LogiclanguageFactory.eINSTANCE.createComplexTypeReference=>[it.referred = ref.referred]]
	}
	def dispatch Function0<TypeReference> createTypeConstructor(PrimitiveTypeReference ref) {
		return [EcoreUtil.copy(ref)]
	}
}