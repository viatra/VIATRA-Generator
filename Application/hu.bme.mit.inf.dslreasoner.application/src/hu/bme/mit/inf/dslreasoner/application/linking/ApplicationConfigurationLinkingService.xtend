package hu.bme.mit.inf.dslreasoner.application.linking

import com.google.inject.Inject
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ViatraImport
import java.util.Collections
import java.util.List
import java.util.Optional
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProvider
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EPackage

class ApplicationConfigurationLinkingService extends DefaultLinkingService{

    //@Inject Logger logger

    @Inject IValueConverterService valueConverterService
    @Inject IMetamodelProvider metamodelProvider
    
    public static extension ApplicationConfigurationPackage pac = ApplicationConfigurationPackage.eINSTANCE

    override getLinkedObjects(EObject context, EReference ref, INode node) {
    	if(context instanceof EPackageImport) {
    		if(ref == EPackageImport_ImportedPackage && node instanceof ILeafNode) {
    			return getEPackage(context as EPackageImport, node as ILeafNode)
    		}
    	} else if(context instanceof ViatraImport) {
    		if(ref == viatraImport_ImportedViatra) {
    			return getViatra(context as ViatraImport, node)
    		}
        } else if(context instanceof PatternEntry) {
        	if(ref === patternEntry_Package) {
        		return getViatraPackage(context as PatternEntry,node)
        	}
        }
        return super.getLinkedObjects(context, ref, node)
    }
	
	def getViatraPackage(PatternEntry entry, INode node) {
		val document = EcoreUtil2.getContainerOfType(entry,ConfigurationScript)
		val nodeString = valueConverterService.toValue(node.text,
                linkingHelper.getRuleNameFrom(node.grammarElement), node).toString.replaceAll("\\s","")
		val patternModels = document.imports.filter(ViatraImport).map[it.importedViatra].filterNull
		val List<EObject> patternModelsWithSameNamespace = patternModels.filter[nodeString.equals(it.packageName)].filter(EObject).toList
		return patternModelsWithSameNamespace
	}

    private def getEPackage(EPackageImport packageImport, ILeafNode node) {
        val x = getNSUri(node)
        if(x.isPresent) {
        	val uriString = x.get
        	val epackageByMetamodelProvider = metamodelProvider.loadEPackage(uriString, packageImport.eResource.resourceSet)
        	val epackageByMe = ePackageByMe(packageImport.eResource.resourceSet,uriString)
        	//println(epackageByMetamodelProvider)
        	//println(epackageByMe)
            if(epackageByMetamodelProvider!==null) {
            	return  Collections.singletonList(epackageByMetamodelProvider as EObject)
            } else if(epackageByMe !== null) {
            	return Collections.singletonList(epackageByMe as EObject)
            } else {
            	emptyList
            }           
        } else {
        	return emptyList
        }
    }
    
    private def ePackageByMe(ResourceSet rs, String uri) {
    	try {
    		val resource = rs.getResource(URI.createURI(uri), true);
    		return resource.contents.head as EPackage
    	} catch (Exception e) {
    		return null
    	}
    }
    
    private def getViatra(ViatraImport viatraImport, INode node) {
    	val uri = getNSUri(node)
    	if(uri.present) {
    		var URI createdURI
    		try{
    			createdURI = URI.createURI(uri.get)
    		}catch(IllegalArgumentException e) {
    			return super.getLinkedObjects(viatraImport, viatraImport_ImportedViatra, node)
    		}
    		var Resource res
    		try{
    			res = viatraImport.eResource.resourceSet.getResource(createdURI,true);
    		} catch(RuntimeException  e){
    			return super.getLinkedObjects(viatraImport, viatraImport_ImportedViatra, node)
    		}
    		if(res!==null && !res.contents.nullOrEmpty) {
    			return #[res.contents.head]
    		} else {
    			return super.getLinkedObjects(viatraImport, viatraImport_ImportedViatra, node)
    		}
    	} else {
    		return super.getLinkedObjects(viatraImport, viatraImport_ImportedViatra, node)
    	}
    }
    
    private def getNSUri(INode node) {
        try {
            val convertedValue = valueConverterService.toValue(node.text,
                linkingHelper.getRuleNameFrom(node.grammarElement), node)
            Optional.of(convertedValue as String)
        } catch (ValueConverterException e) {
            Optional.empty
        }
    }
}