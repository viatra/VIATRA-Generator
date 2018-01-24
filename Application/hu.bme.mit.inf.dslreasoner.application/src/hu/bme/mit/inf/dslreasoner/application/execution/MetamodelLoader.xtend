package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelSpecification
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.AllPackageEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelElement
import org.eclipse.xtext.xbase.lib.Functions.Function1
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelEntry
import java.util.LinkedHashSet

class MetamodelLoader {
	
	def private static init() {
		EcorePackage.eINSTANCE.EClass
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore",new XMIResourceFactoryImpl)
	}
	
	public new() { init }
	
	def loadMetamodel(MetamodelSpecification specification, ResourceSet rs) throws IllegalArgumentException {

		val Set<EClass> classes = new LinkedHashSet
		val Set<EEnum> enums = new LinkedHashSet
		val Set<EEnumLiteral> literals = new LinkedHashSet
		val Set<EReference> references = new LinkedHashSet
		val Set<EAttribute> attributes = new LinkedHashSet
		
		/** Add all included types */
		for(entry : specification.entries) {
			classes+=entry.classes
			enums+=entry.enums
			literals+=entry.literals
			references+=entry.references
			attributes+=entry.attributes
		}
		
		return new EcoreMetamodelDescriptor(classes.toList, emptySet, false, enums.toList, literals.toList, references.toList, attributes.toList)
	}
	
	def <T> List<T> extractElements(MetamodelEntry entry, Function1<AllPackageEntry,Iterable<T>> packageEntryExtractor, Function1<MetamodelElement,Iterable<T>> metamodelElementExtractor) {
		if(entry instanceof MetamodelElement) {
			return metamodelElementExtractor.apply(entry).toList
		} else if(entry instanceof AllPackageEntry) {
			val excluded = entry.exclusion.map[metamodelElementExtractor.apply(it)].flatten.toSet
			return packageEntryExtractor.apply(entry).filter[!excluded.contains(it)].toList
		} else throw new IllegalArgumentException('''Unsupported entry type: "«entry.class.simpleName»"!''')
	}
	
	def getClasses(MetamodelEntry entry) {
		return entry.extractElements(
			[package.EClassifiers.filter(EClass)],
			[val classifier = it.classifier
				if(classifier instanceof EClass){ if(it.feature === null) { return #[classifier]} }
				return emptyList
			]
		)
	}
	def getEnums(MetamodelEntry entry) {
		return entry.extractElements(
			[package.EClassifiers.filter(EEnum)],
			[val classifier = it.classifier
				if(classifier instanceof EEnum){ if(it.feature === null) { return #[classifier]} }
				return emptyList
			]
		)
	}
	def getLiterals(MetamodelEntry entry) {
		return entry.extractElements(
			[package.EClassifiers.filter(EEnum).map[ELiterals].flatten],
			[val feature = it.feature
				if(feature instanceof EEnumLiteral){ return #[feature] }
				return emptyList
			]
		)
	}
	def getReferences(MetamodelEntry entry) {
		return entry.extractElements(
			[package.EClassifiers.filter(EClass).map[EReferences].flatten],
			[val feature = it.feature
				if(feature instanceof EReference) { return #[feature] }
				return emptyList
			]
		)
	}
	def getAttributes(MetamodelEntry entry) {
		return entry.extractElements(
			[package.EClassifiers.filter(EClass).map[EAttributes].flatten],
			[val feature = it.feature
				if(feature instanceof EAttribute) {return #[feature]}
				return emptyList
			]
		)
	}
	
//	public def List<EPackage> loadPackageFromPath(String path, ResourceSet rs, Context context) throws RuntimeException {
//		var Resource resource;
//		try{
//			resource = rs.getResource(URI.createURI(path),true)
//		} catch(RuntimeException e) {
//			context.writeError('''Unable to load EPackage: Error in path "«path»"!''')
//			return #[]
//		}
//		val res = new ArrayList<EPackage>(resource.contents.size)
//		for(content: resource.contents) {
//			if(content instanceof EPackage) {
//				res += content
//			} else {
//				context.writeError('''Unable to load EPackage: The content of "«path»" is not an EPackage, but "«content.eClass.name»"!''')
//			}
//		}
//		return res
//	}
}