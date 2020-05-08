package org.eclipse.viatra.solver.language.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.solver.language.serializer.SolverLanguageSyntacticSequencer;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class SolverLanguageSyntheticTokenSyntacticSequencer extends SolverLanguageSyntacticSequencer {
  @Override
  protected String getTRANSITIVE_CLOSUREToken(final EObject semanticObject, final RuleCall ruleCall, final INode node) {
    return "+";
  }
  
  @Override
  protected String getREFLEXIVE_TRANSITIVE_CLOSUREToken(final EObject semanticObject, final RuleCall ruleCall, final INode node) {
    return "*";
  }
  
  @Override
  protected String getFULL_STOPToken(final EObject semanticObject, final RuleCall ruleCall, final INode node) {
    return ".";
  }
}
