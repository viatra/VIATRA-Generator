/*
 * generated by Xtext 2.17.0
 */
package hu.bme.mit.inf.dslreasoner.application.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ApplicationConfigurationAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("hu/bme/mit/inf/dslreasoner/application/parser/antlr/internal/InternalApplicationConfiguration.tokens");
	}
}
