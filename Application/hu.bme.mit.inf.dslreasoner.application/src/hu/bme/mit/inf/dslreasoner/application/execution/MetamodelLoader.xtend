package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ClassElement
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FeatureElement
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelSpecification
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
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
import org.eclipse.xtend.lib.annotations.Data

@Data
class Metamodel {
	List<EPackage> packages
	EcoreMetamodelDescriptor descriptor
} 

class MetamodelLoader {
	
	def private static init() {
		EcorePackage.eINSTANCE.EClass
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore",new XMIResourceFactoryImpl)
	}
	
	public new() { init }
	
	def loadMetamodel(List<String> specification, ResourceSet rs, Context context) {
		
	}
	
	def loadMetamodel(MetamodelSpecification specification, ResourceSet rs, Context context) {
		val Map<MetamodelEntry,List<EPackage>> entry2Packages = new HashMap
		
		for(entry : specification.entries) {
			val packagesInEntry = entry.path.path.loadPackageFromPath(rs,context)
			entry2Packages.put(entry,packagesInEntry)
		}
		
		return entry2Packages
	}
	
	public def pruneMetamodel(Map<MetamodelEntry,List<EPackage>> specification, ResourceSet rs, Context context) {
		val List<EClass> classes = new LinkedList
		val List<EEnum> enums = new LinkedList
		val List<EEnumLiteral> literals = new LinkedList
		val List<EReference> references = new LinkedList
		val List<EAttribute> attributes = new LinkedList
		
		
		/** Add all included types */
		for(entry : specification.entrySet) {
			val metamodelEntry = entry.key
			val packages = entry.value
			
			/** Excluted types */
			val excludedTypeNames = metamodelEntry.excluding.filter(ClassElement).map[name].toSet
			/** Excluded features */
			val excludedFeatureNames = metamodelEntry.excluding.filter(FeatureElement).map[it.container.name -> it.name].toSet
			
			/** Load the types */
			for(package : packages) {
				for(class : package.EClassifiers.filter(EClass)) {
					classes.addIfNotExcluded(class,excludedTypeNames)
				}
				for(enum : package.EClassifiers.filter(EEnum)) {
					val added = enums.addIfNotExcluded(enum,excludedTypeNames)
					if(added) {
						for(literal : enum.ELiterals) {
							literals.addIfNotExcluded(literal,enum,excludedFeatureNames)
						}
					}
				}
			}
		}
		
		/** Add all included references and attributes*/
		for(entry : specification.entrySet) {
			val metamodelEntry = entry.key
			val packages = entry.value
			
			/** Excluded features */
			val excludedFeatureNames = metamodelEntry.excluding.filter(FeatureElement).map[it.container.name -> it.name].toSet
			
			/** See if type is included */
			for(package : packages) {
				for(class : package.EClassifiers.filter(EClass)) {
					if(classes.contains(class)) {
						for(reference : class.EReferences) {
							if(classes.contains(reference.EType)) {
								references.addIfNotExcluded(reference,class,excludedFeatureNames)
							}
						}
						for(attribute : class.EAttributes) {
							val type = attribute.EType
							if(type instanceof EEnum) {
								if(enums.contains(type)) {
									attributes.addIfNotExcluded(attribute,class,excludedFeatureNames)
								} else if(type == EcorePackage.Literals) {
									if(enums.contains(type)) {
										attributes.addIfNotExcluded(attribute,class,excludedFeatureNames)
									}
								}
							} else if(supportedEDataType(type as EDataType)) {
								attributes.addIfNotExcluded(attribute,class,excludedFeatureNames)
							}
						}
					}
				}
			}
		}
	}
	
	private def supportedEDataType(EDataType dataType) {
		val extension l = EcorePackage.eINSTANCE
		return #[EInt, EBoolean, EString, EDouble, EFloat].contains(dataType)
	}
	
	private def <T extends ENamedElement> addIfNotExcluded(
		List<T> target,
		T element,
		Set<String> excluded)
	{
		if(excluded.contains(element.name)) {
			target += element
			return true
		} else {
			return false
		}
	}
	private def <T1 extends ENamedElement> addIfNotExcluded(
		List<T1> target,
		T1 element,
		ENamedElement container,
		Set<Pair<String,String>> excluded)
	{
		val pair = (container.name) -> (element.name)
		
		if(excluded.contains(pair)) {
			target += element
		}
	}
	
	private def List<EPackage> loadPackageFromPath(String path, ResourceSet rs, Context context) throws RuntimeException {
		var Resource resource;
		try{
			resource = rs.getResource(URI.createURI(path),true)
		} catch(RuntimeException e) {
			context.writeError('''Unable to load EPackage: Error in path "«path»"!''')
			return #[]
		}
		val res = new ArrayList<EPackage>(resource.contents.size)
		for(content: resource.contents) {
			if(content instanceof EPackage) {
				res += content
			} else {
				context.writeError('''Unable to load EPackage: The content of "«path»" is not an EPackage, but "«content.eClass.name»"!''')
			}
		}
		return res
	}
}