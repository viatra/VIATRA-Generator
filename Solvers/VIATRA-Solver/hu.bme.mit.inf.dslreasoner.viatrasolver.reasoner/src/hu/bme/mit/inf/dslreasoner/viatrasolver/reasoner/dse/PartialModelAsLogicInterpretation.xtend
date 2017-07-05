package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink

class PartialModelAsLogicInterpretation implements LogicModelInterpretation{
	val PartialInterpretation partialInterpretation
	val Map<EObject, EObject> trace;
	val Map<TypeDeclaration,PartialTypeInterpratation> type2Interpretation
	val Map<RelationDeclaration,PartialRelationInterpretation> relation2Interpretation
	val Map<DefinedElement,DefinedElement> elementBackwardTrace
	
	new(PartialInterpretation partialInterpretation, Map<EObject, EObject> forwardMap) {
		this.partialInterpretation = partialInterpretation
		this.trace = forwardMap
		this.type2Interpretation = initTypes(partialInterpretation.partialtypeinterpratation)
		this.relation2Interpretation = initRelations(partialInterpretation.partialrelationinterpretation)
		this.elementBackwardTrace = initElementBackwardTrace(trace)
	}
	
	def initTypes(List<PartialTypeInterpratation> types) {
		types.toMap[it.interpretationOf]
	}
	def initRelations(List<PartialRelationInterpretation> relations) {
		relations.toMap[it.interpretationOf]
	}
	def initElementBackwardTrace(Map<EObject, EObject> trace) {
		val entryBackwardMap = new HashMap
		for(entry: trace.entrySet) {
			if(entry.key instanceof DefinedElement) {
				entryBackwardMap.put(entry.value as DefinedElement, entry.key as DefinedElement)
			}
		}
		return entryBackwardMap
	}
	
	override getElements(Type type) {
		val t1 = type.lookup(trace) as TypeDeclaration
		val t2 = t1.lookup(this.type2Interpretation)
		return t2.elements.map[it.elementLookupBackward]
	}
	
	def elementLookupForward(DefinedElement e) {
		if(this.trace.containsKey(e)) return e.lookup(trace) as DefinedElement
		else return e;
	}
	def elementLookupBackward(DefinedElement e) {
		if(this.elementBackwardTrace.containsKey(e)) return e.lookup(this.elementBackwardTrace)
		else return e;
	}
	
	override getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution) {
		if(parameterSubstitution.size == 2) {
			val param1 = (parameterSubstitution.get(0) as DefinedElement).elementLookupForward
			val param2 = (parameterSubstitution.get(1) as DefinedElement).elementLookupForward
			val r1 = relation.lookup(trace) as RelationDeclaration
			val r2 = r1.lookup(this.relation2Interpretation)
			val links = r2.relationlinks.filter(BinaryElementRelationLink)
			val existLink = links.exists[it.param1 == param1 && it.param2 == param2]
			//println(existLink)
			return existLink
		} else throw new UnsupportedOperationException
	}
	
	override getInterpretation(ConstantDeclaration constant) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getMinimalInteger() {0}
	override getMaximalInteger() {0}
}