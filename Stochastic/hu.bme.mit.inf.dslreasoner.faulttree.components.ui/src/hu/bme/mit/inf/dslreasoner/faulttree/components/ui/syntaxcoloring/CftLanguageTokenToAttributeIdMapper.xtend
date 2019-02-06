package hu.bme.mit.inf.dslreasoner.faulttree.components.ui.syntaxcoloring

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles

class CftLanguageTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	override protected calculateId(String tokenName, int tokenType) {
		switch (tokenName) {
			case "RULE_T_DOUBLE":
				HighlightingStyles.NUMBER_ID
			default:
				super.calculateId(tokenName, tokenType)	
		}
	}
}