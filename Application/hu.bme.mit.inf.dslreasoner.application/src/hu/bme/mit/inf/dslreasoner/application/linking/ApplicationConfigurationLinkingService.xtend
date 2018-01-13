package hu.bme.mit.inf.dslreasoner.application.linking

import com.google.inject.Inject
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ViatraImport
import java.util.Collections
import java.util.Optional
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProvider
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.INode

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
    		super.getLinkedObjects(context, ref, node)
        }
        return super.getLinkedObjects(context, ref, node)
    }

    private def getEPackage(EPackageImport packageImport, ILeafNode node) {
        getMetamodelNsUri(node).flatMap [ uri |
            Optional.ofNullable(metamodelProvider.loadEPackage(uri, packageImport.eResource.resourceSet))
        ].map [ ePackage |
            Collections.singletonList(ePackage as EObject)
        ].orElse(emptyList)
    }

    private def getMetamodelNsUri(ILeafNode node) {
        try {
            val convertedValue = valueConverterService.toValue(node.text,
                linkingHelper.getRuleNameFrom(node.grammarElement), node)
            Optional.of(convertedValue as String)
        } catch (ValueConverterException e) {
            Optional.empty
        }
    }
}