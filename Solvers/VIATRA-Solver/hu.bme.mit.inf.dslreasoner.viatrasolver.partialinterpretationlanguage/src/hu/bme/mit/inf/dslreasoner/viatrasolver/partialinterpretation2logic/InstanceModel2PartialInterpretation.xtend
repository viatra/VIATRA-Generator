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
import java.util.HashSet
import java.util.Set
import java.math.BigDecimal
import org.eclipse.emf.ecore.EAttribute

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
		
		val referencesUsed = ecore2Logic.allReferencesInScope(ecore2LogicTrace).toSet
		val attributesUsed = ecore2Logic.allAttributesInScope(ecore2LogicTrace).toSet
		
		val typeScope = createTypeScopesFromKnownAttributeValues(objects,attributesUsed)
		val tracedOutput = partialInterpretationInitialiser.initialisePartialInterpretation(problem, typeScope)
		val partialInterpretation = tracedOutput.output
		val partialInterpretationTrace = tracedOutput.trace
		
		val Map<EObject,DefinedElement> object2DefinedElement = new HashMap
	
		// EObject -> DefinedElement
		for(objectIndex : 0..<objects.size) {
			val object = objects.get(objectIndex)
			val element = createDefinedElement => [
				it.name = if(withID) 
					{ '''o «objectIndex+1»''' } else 
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
	
	private def createTypeScopesFromKnownAttributeValues(List<EObject> objects, Set<EAttribute> attributesUsed) {
		val Set<Integer> integers = new HashSet
		val Set<BigDecimal> reals = new HashSet
		val Set<String> strings = new HashSet
		for(object: objects) {
			for(attribute : object.eClass.EAllAttributes.filter[attributesUsed.contains(it)]) {
				val value = object.eGet(attribute)
				if(value !== null) {
					if(value instanceof List<?>) {
						for(v : value) {
							shortValue(v,integers,reals,strings)
						}
					} else {
						shortValue(value,integers,reals,strings)
					}
				}
			}
		}
		return new TypeScopes => [
			it.knownIntegers += integers
			it.knownReals += reals
			it.knownStrings += strings
		]
	}
	private def dispatch shortValue(Boolean value, Set<Integer> integers, Set<BigDecimal> reals, Set<String> strings) {
		// Do nothing
	}
	private def dispatch shortValue(Integer value, Set<Integer> integers, Set<BigDecimal> reals, Set<String> strings) {
		integers += value
	}
	private def dispatch shortValue(Float value, Set<Integer> integers, Set<BigDecimal> reals, Set<String> strings) {
		reals += BigDecimal.valueOf(value)
	}
	private def dispatch shortValue(Double value, Set<Integer> integers, Set<BigDecimal> reals, Set<String> strings) {
		reals += BigDecimal.valueOf(value)
	}
	private def dispatch shortValue(String value, Set<Integer> integers, Set<BigDecimal> reals, Set<String> strings) {
		strings += value
	}
	private def dispatch shortValue(Void value, Set<Integer> integers, Set<BigDecimal> reals, Set<String> strings) {
		// Do nothing
	}
	private def dispatch shortValue(Object value, Set<Integer> integers, Set<BigDecimal> reals, Set<String> strings) {
		// Do nothing
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
	
	dispatch protected def translateValue(Boolean value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		value.lookup(partialInterpretationTrace.primitiveValues.booleanMap)
	}
	
	dispatch protected def translateValue(Integer value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		value.lookup(partialInterpretationTrace.primitiveValues.integerMap)
	}
	
	dispatch protected def translateValue(Double value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		BigDecimal.valueOf(value).lookup(partialInterpretationTrace.primitiveValues.realMap)
	}
	
	dispatch protected def translateValue(Float value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		BigDecimal.valueOf(value).lookup(partialInterpretationTrace.primitiveValues.realMap)
	}
	
	dispatch protected def translateValue(String value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		value.lookup(partialInterpretationTrace.primitiveValues.stringMap)
	}
}