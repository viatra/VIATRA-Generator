package hu.bme.mit.inf.dslreasoner.application.validation

import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage

class MetamodelValidator {
	def validateMetamodel(EcoreMetamodelDescriptor descriptor) {
		val errors = new LinkedList
		this.allSupertypesAreIncluded(descriptor.classes,errors)
		this.allEnumTypesareIncluded(descriptor.enums,descriptor.literals,errors)
		this.referenceEndpointsAreIncluded(descriptor.classes,descriptor.references,errors)
		this.attributeSourcePontIsIncluded(descriptor.classes,descriptor.attributes,errors)
		this.attributeTargetIsSupported(descriptor.attributes,errors)
		return errors
	}
	
	
	private def supportedEDataType(EDataType dataType) {
		val extension l = EcorePackage.eINSTANCE
		return #[EInt, EBoolean, EString, EDouble, EFloat].contains(dataType)
	}
	
	def allSupertypesAreIncluded(List<EClass> classes, List<String> errors) {
		for(c : classes) {
			for(s : c.ESuperTypes) {
				if(!classes.contains(s)) {
					errors.add('''Metamodel contains "«c.name»" but not contains its supertype "«s.name»"!''')
				}
			}
		}
	}
	def allEnumTypesareIncluded(List<EEnum> enums, List<EEnumLiteral> literals, List<String> errors) {
		for(l: literals) {
			if(!enums.contains(l.EEnum)) {
				errors.add('''Metamodel contains literal "«l.name»" but does not contains enum "«l.EEnum.name»"!''')
			}
		}
	}
	def referenceEndpointsAreIncluded(List<EClass> classes, List<EReference> references, List<String> errors) {
		for(reference : references) {
			val src = reference.EContainingClass
			if(!classes.contains(src)) {
				errors.add('''Metamodel contains reference "«reference.name»" but does not contains its source type "«src.name»"!''')
			}
			
			val trg = reference.EReferenceType
			if(!classes.contains(trg)) {
				errors.add('''Metamodel contains reference "«reference.name»" but does not contains its target type "«trg.name»"!''')
			}
		}
	}
	def attributeSourcePontIsIncluded(List<EClass> classes, List<EAttribute> attributes, List<String> errors) {
		for(attribute : attributes) {
			val src = attribute.containerClass
			if(!classes.contains(src)) {
				errors.add('''Metamodel contains attribute "«attribute.name»" but does not contains its source type "«src.name»"!''')
			}
		}
	}
	def attributeTargetIsSupported(List<EAttribute> attributes, List<String> errors) {
		for(attribute: attributes) {
			val trg = attribute.EAttributeType
			if(!supportedEDataType(trg)) {
				errors.add('''Metamodels contains attribute "«attribute.name»" with unsupported type "«trg.name»"!''')
			}
		}
	}
}