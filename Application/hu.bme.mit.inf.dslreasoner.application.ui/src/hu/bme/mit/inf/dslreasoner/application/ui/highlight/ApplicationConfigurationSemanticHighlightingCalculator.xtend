package hu.bme.mit.inf.dslreasoner.application.ui.highlight

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelElement
import java.util.WeakHashMap
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator

class ApplicationConfigurationSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	public static val MetamodelElementIDPrefix = "MetamodelElementColor";

	val metamodelElement2ID = new WeakHashMap<EClassifier,String>
	val colorCalculator = new ColorCalculator
	
		override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if (resource == null || resource.getParseResult() == null) {
			return
		} else {
			val metamodelElements = resource.allContents.filter(MetamodelElement)
//			val root = resource.getParseResult().getRootNode();
//			for (node : root.getAsTreeIterable()) {
//				
//				if (node.getGrammarElement() instanceof CrossReference) {
//					acceptor.addPosition(node.getOffset(), node.getLength(), ApplicationConfigurationHighlightConfiguration.CROSS_REF);
//				}
//			}
			while(metamodelElements.hasNext) {
				val mentamodelElement = metamodelElements.next
				val node = NodeModelUtils::getNode(mentamodelElement)
				acceptor.addPosition(
					node.getOffset(),
					node.getLength(),
					getMetamodelElementColorID(mentamodelElement)
				)
			}
		}
	}
	
	def getMetamodelElementColorID(MetamodelElement element) {
		val classifier = element.classifier
		if(classifier === null) {
			return "default"
		} else if(classifier.eIsProxy) {
			return "default"
		} else {
			if(metamodelElement2ID.containsKey(classifier)) {
				return metamodelElement2ID.get(classifier)
			} else {
				val id = calculateMetamodelElementID(classifier)
				metamodelElement2ID.put(classifier,id)
				return id
			}
		}
	}
	private def String calculateMetamodelElementID(EClassifier c) {
		val randomColor = colorCalculator.getColor(c)
		'''«MetamodelElementIDPrefix» «randomColor.get(0)» «randomColor.get(1)» «randomColor.get(2)»'''
	}
}
