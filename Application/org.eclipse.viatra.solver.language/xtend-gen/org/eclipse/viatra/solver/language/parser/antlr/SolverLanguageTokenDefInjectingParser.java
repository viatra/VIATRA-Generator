package org.eclipse.viatra.solver.language.parser.antlr;

import com.google.inject.Inject;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.viatra.solver.language.parser.antlr.SolverLanguageParser;
import org.eclipse.viatra.solver.language.parser.antlr.SolverLanguageTokenSource;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;

@SuppressWarnings("all")
public class SolverLanguageTokenDefInjectingParser extends SolverLanguageParser {
  @Inject
  private ITokenDefProvider tokenDefProvider;
  
  @Override
  protected TokenSource createLexer(final CharStream stream) {
    SolverLanguageTokenSource _xblockexpression = null;
    {
      TokenSource _createLexer = super.createLexer(stream);
      final SolverLanguageTokenSource tokenSource = ((SolverLanguageTokenSource) _createLexer);
      tokenSource.initializeTokenDefsFrom(this.tokenDefProvider);
      _xblockexpression = tokenSource;
    }
    return _xblockexpression;
  }
}
