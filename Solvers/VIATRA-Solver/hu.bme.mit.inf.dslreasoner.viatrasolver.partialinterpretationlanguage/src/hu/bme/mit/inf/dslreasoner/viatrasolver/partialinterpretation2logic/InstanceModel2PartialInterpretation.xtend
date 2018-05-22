package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.PartialInterpretationInitialiser
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.Problem2PartialInterpretationTrace
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class InstanceModel2PartialInterpretation {
	val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	val extension PartialinterpretationFactory factory2 = PartialinterpretationFactory.eINSTANCE
	val Ecore2Logic ecore2Logic = new Ecore2Logic
	val partialInterpretationInitialiser = new PartialInterpretationInitialiser
	
	public def transform(
		TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTranslationResult,
		Resource resource,
		boolean withID) 
	{
		val objects = resource.allContents.toList
		return transform(metamodelTranslationResult,objects,withID)
	}
	
	public def transform(
		TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTranslationResult,
		List<EObject> objects,
		boolean withID) 
	{
		val problem = metamodelTranslationResult.output
		val ecore2LogicTrace = metamodelTranslationResult.trace
		val tracedOutput = partialInterpretationInitialiser.initialisePartialInterpretation(problem, new TypeScopes)
		val partialInterpretation = tracedOutput.output
		val partialInterpretationTrace = tracedOutput.trace
		
		val Map<EObject,DefinedElement> object2DefinedElement = new HashMap
	
		// EObject -> DefinedElement
		for(objectIndex : 0..<objects.size) {
			val object = objects.get(objectIndex)
			val element = createDefinedElement => [
				it.name = if(withID) 
					{ '''PartialObject«objectIndex»''' } else 
					{ null }
			]
			
			// Add element to interpretation
			partialInterpretation.newElements += element
			
			// Define the types
			val type = ecore2Logic.TypeofEClass(ecore2LogicTrace,object.eClass) as TypeDeclaration
			val interpretation = type.lookup(partialInterpretationTrace.type2Interpretation)
			interpretation.elements += element
			interpretation.supertypeInterpretation.forEach[elements += element]
			
			// Trace handling
			object2DefinedElement.put(object, element)
		}
		
		val referencesUsed = ecore2Logic.allReferencesInScope(ecore2LogicTrace).toSet
		val attributesUsed = ecore2Logic.allAttributesInScope(ecore2LogicTrace).toSet
		for(source : objects) {
			// Translating the references
			for(reference : source.eClass.EAllReferences.filter[
				referencesUsed.contains(it) && !it.derived]) 
			{
				val type = ecore2Logic.relationOfReference(ecore2LogicTrace,reference)
				val interpretation = type.lookup(partialInterpretationTrace.relation2Interpretation)
				val sourceElement = source.lookup(object2DefinedElement)
				if(reference.isMany) {
					val listOfTargets = source.eGet(reference) as List<? extends EObject>
					for(target : listOfTargets) {
						if(target !== null && object2DefinedElement.containsKey(target)) {
							val targetElement = target.lookup(object2DefinedElement)
							translateLink(interpretation,sourceElement,targetElement)
						}
					}
				} else {
					val target = source.eGet(reference) as EObject
					if(target !== null && object2DefinedElement.containsKey(target)) {
						val targetElement = target.lookup(object2DefinedElement)
						translateLink(interpretation,sourceElement,targetElement)
					}
				}
			}
			
			// Transforming the attributes
			for(attribute : source.eClass.EAllAttributes.filter[attributesUsed.contains(it) && !it.derived]) {
				val type = ecore2Logic.relationOfAttribute(ecore2LogicTrace,attribute)
				val interpretation = type.lookup(partialInterpretationTrace.relation2Interpretation)
				val sourceElement = source.lookup(object2DefinedElement)
				if(attribute.isMany) {
					val listOfTargets = source.eGet(attribute) as List<? extends EObject>
					for(target : listOfTargets) {
						val value = translateValue(target,ecore2LogicTrace,partialInterpretationTrace)
						if(value !== null) {
							translateLink(interpretation,sourceElement,value)
						}
					}
				} else {
					val target = source.eGet(attribute)
					if(target !== null) {
						val value = translateValue(target,ecore2LogicTrace,partialInterpretationTrace)
						if(value !== null) {
							translateLink(interpretation,sourceElement,value)
						}
					}
				}
			}
		}
		
		return partialInterpretation
	}
	
	protected def translateLink(PartialRelationInterpretation interpretation, DefinedElement source, DefinedElement target) {
		interpretation.relationlinks += createBinaryElementRelationLink => [it.param1 = source it.param2 = target]
	}
	
	dispatch protected def translateValue(Enumerator value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		val term = this.ecore2Logic.Literal(ecore2LogicTrace,value)
		if(term instanceof DefinedElement) {
			return term
		}
		else throw new AssertionError('''term should be a defined element?''')
	}
	
	dispatch protected def translateValue(Object value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		//throw new UnsupportedOperationException('''Mapping of «value.class.simpleName» in partial models is currently not supported!''')
	}
}