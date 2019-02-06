package hu.bme.mit.inf.dslreasoner.faulttree.components.ui.syntaxcoloring;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.KOfMGateDefinition;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class CftLanguageSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
  protected boolean _highlightElement(final KOfMGateDefinition gate, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    boolean _xblockexpression = false;
    {
      this.highlightFeature(acceptor, gate, CftPackage.Literals.KOF_MGATE_DEFINITION__K, DefaultHighlightingConfiguration.KEYWORD_ID);
      this.highlightFeature(acceptor, gate, CftPackage.Literals.KOF_MGATE_DEFINITION__M, DefaultHighlightingConfiguration.KEYWORD_ID);
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  protected boolean _highlightElement(final EObject eObject, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    return super.highlightElement(eObject, acceptor, cancelIndicator);
  }
  
  protected boolean highlightElement(final EObject gate, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    if (gate instanceof KOfMGateDefinition) {
      return _highlightElement((KOfMGateDefinition)gate, acceptor, cancelIndicator);
    } else if (gate != null) {
      return _highlightElement(gate, acceptor, cancelIndicator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gate, acceptor, cancelIndicator).toString());
    }
  }
}
