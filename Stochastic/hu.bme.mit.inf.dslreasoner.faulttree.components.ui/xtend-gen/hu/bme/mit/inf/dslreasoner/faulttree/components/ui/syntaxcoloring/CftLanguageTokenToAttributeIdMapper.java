package hu.bme.mit.inf.dslreasoner.faulttree.components.ui.syntaxcoloring;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;

@SuppressWarnings("all")
public class CftLanguageTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
  @Override
  protected String calculateId(final String tokenName, final int tokenType) {
    String _switchResult = null;
    if (tokenName != null) {
      switch (tokenName) {
        case "RULE_T_DOUBLE":
          _switchResult = HighlightingStyles.NUMBER_ID;
          break;
        default:
          _switchResult = super.calculateId(tokenName, tokenType);
          break;
      }
    } else {
      _switchResult = super.calculateId(tokenName, tokenType);
    }
    return _switchResult;
  }
}
