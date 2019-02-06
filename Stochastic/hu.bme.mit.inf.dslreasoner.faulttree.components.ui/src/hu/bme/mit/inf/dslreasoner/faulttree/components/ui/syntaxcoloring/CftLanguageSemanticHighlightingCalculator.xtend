package hu.bme.mit.inf.dslreasoner.faulttree.components.ui.syntaxcoloring

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.util.CancelIndicator

import static hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage.Literals.*
import static org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration.*

class CftLanguageSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	protected dispatch def highlightElement(KOfMGateDefinition gate, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		acceptor.highlightFeature(gate, KOF_MGATE_DEFINITION__K, KEYWORD_ID)
		acceptor.highlightFeature(gate, KOF_MGATE_DEFINITION__M, KEYWORD_ID)
		false
	}
	
	protected dispatch def highlightElement(EObject eObject, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		super.highlightElement(eObject, acceptor, cancelIndicator)
	}
}
