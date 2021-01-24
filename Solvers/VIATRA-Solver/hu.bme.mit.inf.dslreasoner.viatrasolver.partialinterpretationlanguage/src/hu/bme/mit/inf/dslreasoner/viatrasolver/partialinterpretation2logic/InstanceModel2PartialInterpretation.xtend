package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
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
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import org.eclipse.emf.ecore.EClass
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation

class InstanceModel2PartialInterpretation {
	val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	val extension PartialinterpretationFactory factory2 = PartialinterpretationFactory.eINSTANCE
	val Ecore2Logic ecore2Logic = new Ecore2Logic
	val partialInterpretationInitialiser = new PartialInterpretationInitialiser
	
	public def transform(
		TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTranslationResult,
		Map<String, Map<String, String>> ignoredAttribs,
		Resource resource, 
		boolean withID) 
	{
		val objectsBuilder = ImmutableList.builder
		val treeIterator = resource.allContents
		val referencesUsed = ecore2Logic.allReferencesInScope(metamodelTranslationResult.trace).toSet
		while (treeIterator.hasNext) {
			val object = treeIterator.next
			val containingReference = object.eContainmentFeature
			if (containingReference === null || referencesUsed.contains(containingReference)) {
				objectsBuilder.add(object)
			} else {
				treeIterator.prune
			}
		}
		val objects = objectsBuilder.build
		return transform(metamodelTranslationResult, ignoredAttribs, objects, withID)
	}
	
	public def transform(
		TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTranslationResult,
		Map<String, Map<String, String>> ignoredAttribs, 
		List<EObject> objects,
		boolean withID) 
	{
		val problem = metamodelTranslationResult.output
		val ecore2LogicTrace = metamodelTranslationResult.trace
		
		val referencesUsed = ecore2Logic.allReferencesInScope(ecore2LogicTrace).toSet
		val attributesUsed = ecore2Logic.allAttributesInScope(ecore2LogicTrace).toSet
		
		val typeScope = createTypeScopesFromKnownAttributeValues(objects,attributesUsed, ignoredAttribs)
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
				val isIgnored = checkIfIgnored(source, attribute, ignoredAttribs)
				val type = ecore2Logic.relationOfAttribute(ecore2LogicTrace, attribute)
				val interpretation = type.lookup(partialInterpretationTrace.relation2Interpretation)
				val sourceElement = source.lookup(object2DefinedElement)
				if (attribute.isMany) {
					val listOfTargets = source.eGet(attribute) as List<? extends EObject>
					for (target : listOfTargets) {
						var DefinedElement value = null
						if (!isIgnored) value = translateValue(target, ecore2LogicTrace, partialInterpretationTrace)
						else value = createUnknownElement(partialInterpretation, target)
						if (value !== null) {
							translateLink(interpretation, sourceElement, value)
						}
					}
				} else {
					val target = source.eGet(attribute)
					if (target !== null) {
						if (!isIgnored) {
							val value = translateValue(target, ecore2LogicTrace, partialInterpretationTrace)
							if (value !== null) {
								translateLink(interpretation, sourceElement, value)
							}
						}
						else translateLink(interpretation, sourceElement, createUnknownElement(partialInterpretation, target))
//						else value = null

					}
				}
			}
		}
		
		return partialInterpretation
	}

	private def createTypeScopesFromKnownAttributeValues(
		List<EObject> objects,
		Set<EAttribute> attributesUsed, 
		Map<String, Map<String, String>> ignoredAttribs)
	{
		val Set<Integer> integers = new HashSet
		val Set<Double> reals = new HashSet
		val Set<String> strings = new HashSet
		for (object : objects) {
			for (attribute : object.eClass.EAllAttributes.filter[attributesUsed.contains(it)]) {
				val isIgnored = checkIfIgnored(object, attribute, ignoredAttribs)
				
				if(!isIgnored) {
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
		}
		return new TypeScopes => [
			it.knownIntegers += integers
			it.knownReals += reals
			it.knownStrings += strings
		]
	}
	private def boolean checkIfIgnored(
		EObject object, 
		EAttribute attribute,
		Map<String, Map<String, String>> ignoredAttribs
	) {
		val classInIgnored = ignoredAttribs.get(object.eClass.name)
		val mayIgnored = (
					classInIgnored !== null && classInIgnored.containsKey("*")
					||
					classInIgnored !== null && classInIgnored.containsKey(attribute.name))

		var isIgnored = false
		if (mayIgnored) {
			var String specificIgnoredValue = null
			if (classInIgnored.containsKey("*")) 
				specificIgnoredValue = classInIgnored.get("*")
			else
				specificIgnoredValue = classInIgnored.get(attribute.name)
				
			if (specificIgnoredValue.equals("*"))
				isIgnored = true
			else {
				val value = object.eGet(attribute)
				if (typeof(Number).isAssignableFrom(value.class)) {
					isIgnored = (Double.valueOf(specificIgnoredValue) == value)
				} else {
					isIgnored = specificIgnoredValue.equals(value)
				}
			}
		}
		// DEBUG
		if (isIgnored) {
//		println("IGNORED")
//		println(object)
//		println(attribute)
//		println(object.eGet(attribute))
		}
		// END DEBUG
		return isIgnored
	}
	private def dispatch shortValue(Boolean value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
		// Do nothing
	}
	private def dispatch shortValue(Integer value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
		integers += value
	}
	private def dispatch shortValue(Short value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
		integers += Integer.valueOf(value)
	}
	private def dispatch shortValue(Float value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
		reals += Double.valueOf(value)
	}
	private def dispatch shortValue(Double value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
		reals += value
	}
	private def dispatch shortValue(String value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
		strings += value
	}
	private def dispatch shortValue(Void value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
		// Do nothing
	}
	private def dispatch shortValue(Object value, Set<Integer> integers, Set<Double> reals, Set<String> strings) {
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
	
	dispatch protected def translateValue(Short value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		Integer.valueOf(value).lookup(partialInterpretationTrace.primitiveValues.integerMap)
	}
	
	dispatch protected def translateValue(Double value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		value.lookup(partialInterpretationTrace.primitiveValues.realMap)
	}
	
	dispatch protected def translateValue(Float value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		Double.valueOf(value).lookup(partialInterpretationTrace.primitiveValues.realMap)
	}
	
	dispatch protected def translateValue(String value, Ecore2Logic_Trace ecore2LogicTrace, Problem2PartialInterpretationTrace partialInterpretationTrace) {
		value.lookup(partialInterpretationTrace.primitiveValues.stringMap)
	}
	
	dispatch protected def createUnknownElement(PartialInterpretation p, Enumerator value) {
		throw new UnsupportedOperationException("Currently we do not support ignored Enums")
		//TODO Unsure about this
	}
	
	dispatch protected def createUnknownElement(PartialInterpretation p, Boolean value) {
		val e = createBooleanElement => [valueSet = false]
		p.newElements += e
		return e
	}
	
	dispatch protected def createUnknownElement(PartialInterpretation p, Integer value) {
		val e = createIntegerElement => [valueSet = false]
		p.newElements += e
		return e
	}
	
	dispatch protected def createUnknownElement(PartialInterpretation p, Short value) {
		val e = createIntegerElement => [valueSet = false]
		p.newElements += e
		return e
	}
	
	dispatch protected def createUnknownElement(PartialInterpretation p, Double value) {
		val e = createRealElement => [it.valueSet = false]
		p.newElements += e
		return e
	}
	
	dispatch protected def createUnknownElement(PartialInterpretation p, Float value) {
		val e = createRealElement => [valueSet = false]
		p.newElements += e
		return e
	}
	
	dispatch protected def createUnknownElement(PartialInterpretation p, String value) {
		val e = createStringElement => [valueSet = false]
		p.newElements += e
		return e
	}
}