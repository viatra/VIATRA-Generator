package hu.bme.mit.inf.dslreasoner.application.validation

import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern

class QueryAndMetamodelValidator {
	
	def public validateQueryAndMetamodel(
		EcoreMetamodelDescriptor metamodel,
		Pair<ViatraQuerySetDescriptor, Set<Pattern>> viatra)
	{
		val patterns = viatra.value
		val elementsInMetamodel = 
			(metamodel.classes +
			metamodel.enums +
			metamodel.literals+
			metamodel.attributes +
			metamodel.references)
			.toSet
		val errors = new LinkedList
		for(pattern : patterns) {
			val elements = getReferredNamedElements(pattern)
			for(element : elements) {
				if(!elementsInMetamodel.contains(element)) {
					errors+='''Pattern "«pattern.name»" refers to an element "«element»" that is not included to the selected metamodel!'''
				}
			}
		}
		return errors
	}
	
	def getReferredNamedElements(Pattern pattern) {
		val elements = pattern.eAllContents.toList
		return elements.map[element|
			val references = element.eClass.EAllReferences
			return references.map[r |
				if(r.isMany) {
					return (element.eGet(r) as List<?>).filter(ENamedElement)
				} else {
					val value = element.eGet(r)
					if(value instanceof ENamedElement) return #[value]
					else return #[]
				}
			].flatten.filter(ENamedElement)
		].flatten
	}
}
