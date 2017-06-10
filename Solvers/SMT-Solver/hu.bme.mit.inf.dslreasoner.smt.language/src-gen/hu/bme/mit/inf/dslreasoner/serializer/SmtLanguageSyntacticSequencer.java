package hu.bme.mit.inf.dslreasoner.serializer;

import com.google.inject.Inject;
import hu.bme.mit.inf.dslreasoner.services.SmtLanguageGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SmtLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SmtLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_SMTUsingParamCombinator_ExclamationMarkKeyword_1_1_or_UsingParamsKeyword_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SmtLanguageGrammarAccess) access;
		match_SMTUsingParamCombinator_ExclamationMarkKeyword_1_1_or_UsingParamsKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSMTUsingParamCombinatorAccess().getExclamationMarkKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getSMTUsingParamCombinatorAccess().getUsingParamsKeyword_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  			: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'!'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_SMTUsingParamCombinator_ExclamationMarkKeyword_1_1_or_UsingParamsKeyword_1_0.equals(syntax))
				emit_SMTUsingParamCombinator_ExclamationMarkKeyword_1_1_or_UsingParamsKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'using-params' | '!'
	 */
	protected void emit_SMTUsingParamCombinator_ExclamationMarkKeyword_1_1_or_UsingParamsKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
