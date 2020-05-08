package org.eclipse.viatra.solver.language.parser.antlr

import com.google.inject.Inject
import org.antlr.runtime.CharStream
import org.eclipse.xtext.parser.antlr.ITokenDefProvider

class SolverLanguageTokenDefInjectingParser extends SolverLanguageParser {
	@Inject ITokenDefProvider tokenDefProvider

	override protected createLexer(CharStream stream) {
		val tokenSource = super.createLexer(stream) as SolverLanguageTokenSource
		tokenSource.initializeTokenDefsFrom(tokenDefProvider)
		tokenSource
	}

}
