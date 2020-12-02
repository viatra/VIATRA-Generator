package hu.bme.mit.inf.dslreasoner.application.linking

import com.google.inject.Inject
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ViatraImport
import java.util.Collections
import java.util.Optional
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProvider
import org.eclipse.xtext.conversion.IValueConverterService
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.INode

class ApplicationConfigurationLinkingService extends DefaultLinkingService {
	@Inject IValueConverterService valueConverterService
	@Inject IMetamodelProvider metamodelProvider

	public static extension ApplicationConfigurationPackage pac = ApplicationConfigurationPackage.eINSTANCE

	override getLinkedObjects(EObject context, EReference ref, INode node) {
		if (context instanceof EPackageImport) {
			if (ref == EPackageImport_ImportedPackage && node instanceof ILeafNode) {
				return getEPackage(context, node as ILeafNode)
			}
		} else if (context instanceof ViatraImport) {
			if (ref == viatraImport_ImportedViatra) {
				return getViatra(context, node)
			}
		}
		return super.getLinkedObjects(context, ref, node)
	}

	private def getEPackage(EPackageImport packageImport, ILeafNode node) {
		val x = getNSUri(node)
		if (x.isPresent) {
			val uriString = x.get
			val epackageByMetamodelProvider = metamodelProvider.loadEPackage(uriString,
				packageImport.eResource.resourceSet)
			val epackageByMe = ePackageByMe(packageImport.eResource.resourceSet, uriString)
			if (epackageByMetamodelProvider !== null) {
				return Collections.singletonList(epackageByMetamodelProvider as EObject)
			} else if (epackageByMe !== null) {
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
		getByUri(viatraImport, viatraImport_ImportedViatra, node)
	}
	
	private def getByUri(EObject context, EReference ref, INode node) {
		val linkedObjects = super.getLinkedObjects(context, ref, node)
		if (!linkedObjects.empty) {
			return linkedObjects
		}
		val uri = getNSUri(node)
		if (uri.present) {
			var URI createdURI
			try {
				createdURI = URI.createURI(uri.get)
			} catch (IllegalArgumentException e) {
				return #[]
			}
			var Resource res
			try {
				res = context.eResource.resourceSet.getResource(createdURI, true);
			} catch (RuntimeException e) {
				return #[]
			}
			if (res !== null && res.contents !== null) {
				return res.contents.filter[ref.EType.isInstance(it)].toList
			}
		}
		return #[]
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
