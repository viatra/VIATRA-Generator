package hu.bme.mit.inf.dslreasoner.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import hu.bme.mit.inf.dslreasoner.services.SmtLanguageGrammarAccess


/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class SmtLanguageFormatter extends AbstractDeclarativeFormatter {

//	@Inject extension SmtLanguageGrammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
		val f = getGrammarAccess as SmtLanguageGrammarAccess
		c.setAutoLinewrap(100000);
		for(pair : f.findKeywordPairs("(",")")) {
			c.setNoSpace().after(pair.getFirst());
	      	c.setNoSpace().before(pair.getSecond());
		}
		c.setLinewrap.after(f.SMTAssertionRule)
		c.setLinewrap.after(f.SMTFunctionDeclarationRule)
		c.setLinewrap.after(f.SMTFunctionDefinitionRule)
		c.setLinewrap.after(f.SMTEnumeratedTypeDeclarationRule)
		c.setLinewrap.after(f.SMTSetTypeDeclarationRule)
		c.setLinewrap.after(f.SMTOptionRule)
	}
}
