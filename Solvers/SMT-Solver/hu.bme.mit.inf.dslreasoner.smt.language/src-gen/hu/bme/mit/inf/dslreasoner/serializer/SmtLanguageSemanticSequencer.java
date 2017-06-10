package hu.bme.mit.inf.dslreasoner.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.mit.inf.dslreasoner.services.SmtLanguageGrammarAccess;
import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe;
import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBuiltinTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDistinct;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDiv;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDivison;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTExists;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTForall;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTGetModelCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMinus;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMod;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMultiply;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTNot;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParOrCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPlus;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSetTypeDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSimpleSatCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SmtLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmtLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmtLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmtLanguagePackage.REASONING_PROBE:
				if(context == grammarAccess.getReasoningProbeRule()) {
					sequence_ReasoningProbe(context, (ReasoningProbe) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.REASONING_TACTIC_PARAMETER:
				if(context == grammarAccess.getReasoningTacticParameterRule()) {
					sequence_ReasoningTacticParameter(context, (ReasoningTacticParameter) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_AND:
				if(context == grammarAccess.getSMTAndRule() ||
				   context == grammarAccess.getSMTBoolOperationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTAnd(context, (SMTAnd) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR:
				if(context == grammarAccess.getSMTAndThenCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule()) {
					sequence_SMTAndThenCombinator(context, (SMTAndThenCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_ASSERTION:
				if(context == grammarAccess.getSMTAssertionRule()) {
					sequence_SMTAssertion(context, (SMTAssertion) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_BOOL_LITERAL:
				if(context == grammarAccess.getSMTAtomicTermRule() ||
				   context == grammarAccess.getSMTBoolLiteralRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTBoolLiteral(context, (SMTBoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_BOOL_TYPE_REFERENCE:
				if(context == grammarAccess.getSMTBoolTypeReferenceRule() ||
				   context == grammarAccess.getSMTPrimitiveTypeReferenceRule() ||
				   context == grammarAccess.getSMTTypeReferenceRule()) {
					sequence_SMTBoolTypeReference(context, (SMTBoolTypeReference) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_BUILTIN_TACTIC:
				if(context == grammarAccess.getSMTBuiltinTacticRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule()) {
					sequence_SMTBuiltinTactic(context, (SMTBuiltinTactic) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_CARDINALITY_CONSTRAINT:
				if(context == grammarAccess.getSMTCardinalityConstraintRule()) {
					sequence_SMTCardinalityConstraint(context, (SMTCardinalityConstraint) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND:
				if(context == grammarAccess.getSMTComplexSatCommandRule() ||
				   context == grammarAccess.getSMTSatCommandRule()) {
					sequence_SMTComplexSatCommand(context, (SMTComplexSatCommand) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE:
				if(context == grammarAccess.getSMTComplexTypeReferenceRule() ||
				   context == grammarAccess.getSMTTypeReferenceRule()) {
					sequence_SMTComplexTypeReference(context, (SMTComplexTypeReference) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_DISTINCT:
				if(context == grammarAccess.getSMTDistinctRule() ||
				   context == grammarAccess.getSMTRelationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTDistinct(context, (SMTDistinct) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_DIV:
				if(context == grammarAccess.getSMTDivRule() ||
				   context == grammarAccess.getSMTIntOperationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTDiv(context, (SMTDiv) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_DIVISON:
				if(context == grammarAccess.getSMTDivisonRule() ||
				   context == grammarAccess.getSMTIntOperationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTDivison(context, (SMTDivison) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_DOCUMENT:
				if(context == grammarAccess.getSMTDocumentRule()) {
					sequence_SMTDocument(context, (SMTDocument) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_ENUM_LITERAL:
				if(context == grammarAccess.getSMTEnumLiteralRule() ||
				   context == grammarAccess.getSMTSymbolicDeclarationRule()) {
					sequence_SMTEnumLiteral(context, (SMTEnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_ENUMERATED_TYPE_DECLARATION:
				if(context == grammarAccess.getSMTEnumeratedTypeDeclarationRule() ||
				   context == grammarAccess.getSMTTypeRule()) {
					sequence_SMTEnumeratedTypeDeclaration(context, (SMTEnumeratedTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_EQUALS:
				if(context == grammarAccess.getSMTEqualsRule() ||
				   context == grammarAccess.getSMTRelationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTEquals(context, (SMTEquals) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_ERROR_RESULT:
				if(context == grammarAccess.getSMTErrorResultRule() ||
				   context == grammarAccess.getSMTResultRule()) {
					sequence_SMTErrorResult(context, (SMTErrorResult) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_EXISTS:
				if(context == grammarAccess.getSMTExistsRule() ||
				   context == grammarAccess.getSMTQuantifiedExpressionRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTExists(context, (SMTExists) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR:
				if(context == grammarAccess.getSMTFailIfCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule()) {
					sequence_SMTFailIfCombinator(context, (SMTFailIfCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_FORALL:
				if(context == grammarAccess.getSMTForallRule() ||
				   context == grammarAccess.getSMTQuantifiedExpressionRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTForall(context, (SMTForall) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_FUNCTION_DECLARATION:
				if(context == grammarAccess.getSMTFunctionDeclarationRule() ||
				   context == grammarAccess.getSMTSymbolicDeclarationRule()) {
					sequence_SMTFunctionDeclaration(context, (SMTFunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_FUNCTION_DEFINITION:
				if(context == grammarAccess.getSMTFunctionDefinitionRule() ||
				   context == grammarAccess.getSMTSymbolicDeclarationRule()) {
					sequence_SMTFunctionDefinition(context, (SMTFunctionDefinition) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_GET_MODEL_COMMAND:
				if(context == grammarAccess.getSMTGetModelCommandRule()) {
					sequence_SMTGetModelCommand(context, (SMTGetModelCommand) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMTITE:
				if(context == grammarAccess.getSMTITERule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTITE(context, (SMTITE) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_IF_COMBINATOR:
				if(context == grammarAccess.getSMTIfCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule()) {
					sequence_SMTIfCombinator(context, (SMTIfCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_IFF:
				if(context == grammarAccess.getSMTBoolOperationRule() ||
				   context == grammarAccess.getSMTIffRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTIff(context, (SMTIff) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_IMPL:
				if(context == grammarAccess.getSMTBoolOperationRule() ||
				   context == grammarAccess.getSMTImplRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTImpl(context, (SMTImpl) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_INLINE_CONSTANT_DEFINITION:
				if(context == grammarAccess.getSMTInlineConstantDefinitionRule() ||
				   context == grammarAccess.getSMTSymbolicDeclarationRule()) {
					sequence_SMTInlineConstantDefinition(context, (SMTInlineConstantDefinition) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_INPUT:
				if(context == grammarAccess.getSMTInputRule()) {
					sequence_SMTInput(context, (SMTInput) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_INT_LITERAL:
				if(context == grammarAccess.getSMTAtomicTermRule() ||
				   context == grammarAccess.getSMTIntLiteralRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTIntLiteral(context, (SMTIntLiteral) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_INT_TYPE_REFERENCE:
				if(context == grammarAccess.getSMTIntTypeReferenceRule() ||
				   context == grammarAccess.getSMTPrimitiveTypeReferenceRule() ||
				   context == grammarAccess.getSMTTypeReferenceRule()) {
					sequence_SMTIntTypeReference(context, (SMTIntTypeReference) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMTLEQ:
				if(context == grammarAccess.getSMTLEQRule() ||
				   context == grammarAccess.getSMTRelationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTLEQ(context, (SMTLEQ) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMTLT:
				if(context == grammarAccess.getSMTLTRule() ||
				   context == grammarAccess.getSMTRelationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTLT(context, (SMTLT) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_LET:
				if(context == grammarAccess.getSMTLetRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTLet(context, (SMTLet) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMTMEQ:
				if(context == grammarAccess.getSMTMEQRule() ||
				   context == grammarAccess.getSMTRelationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTMEQ(context, (SMTMEQ) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMTMT:
				if(context == grammarAccess.getSMTMTRule() ||
				   context == grammarAccess.getSMTRelationRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTMT(context, (SMTMT) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_MINUS:
				if(context == grammarAccess.getSMTIntOperationRule() ||
				   context == grammarAccess.getSMTMinusRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTMinus(context, (SMTMinus) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_MOD:
				if(context == grammarAccess.getSMTIntOperationRule() ||
				   context == grammarAccess.getSMTModRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTMod(context, (SMTMod) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_MODEL_RESULT:
				if(context == grammarAccess.getSMTModelResultRule() ||
				   context == grammarAccess.getSMTResultRule()) {
					sequence_SMTModelResult(context, (SMTModelResult) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_MULTIPLY:
				if(context == grammarAccess.getSMTIntOperationRule() ||
				   context == grammarAccess.getSMTMultiplyRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTMultiply(context, (SMTMultiply) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_NOT:
				if(context == grammarAccess.getSMTBoolOperationRule() ||
				   context == grammarAccess.getSMTNotRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTNot(context, (SMTNot) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_OPTION:
				if(context == grammarAccess.getSMTOptionRule()) {
					sequence_SMTOption(context, (SMTOption) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_OR:
				if(context == grammarAccess.getSMTBoolOperationRule() ||
				   context == grammarAccess.getSMTOrRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTOr(context, (SMTOr) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_OR_ELSE_COMBINATOR:
				if(context == grammarAccess.getSMTOrElseCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule()) {
					sequence_SMTOrElseCombinator(context, (SMTOrElseCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_OUTPUT:
				if(context == grammarAccess.getSMTOutputRule()) {
					sequence_SMTOutput(context, (SMTOutput) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_PAR_OR_COMBINATOR:
				if(context == grammarAccess.getSMTParOrCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule()) {
					sequence_SMTParOrCombinator(context, (SMTParOrCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR:
				if(context == grammarAccess.getSMTParThenCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule()) {
					sequence_SMTParThenCombinator(context, (SMTParThenCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_PLUS:
				if(context == grammarAccess.getSMTIntOperationRule() ||
				   context == grammarAccess.getSMTPlusRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTPlus(context, (SMTPlus) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_REAL_LITERAL:
				if(context == grammarAccess.getSMTAtomicTermRule() ||
				   context == grammarAccess.getSMTRealLiteralRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTRealLiteral(context, (SMTRealLiteral) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_REAL_TYPE_REFERENCE:
				if(context == grammarAccess.getSMTPrimitiveTypeReferenceRule() ||
				   context == grammarAccess.getSMTRealTypeReferenceRule() ||
				   context == grammarAccess.getSMTTypeReferenceRule()) {
					sequence_SMTRealTypeReference(context, (SMTRealTypeReference) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_SAT_RESULT:
				if(context == grammarAccess.getSMTResultRule() ||
				   context == grammarAccess.getSMTSatResultRule()) {
					sequence_SMTSatResult(context, (SMTSatResult) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_SET_TYPE_DECLARATION:
				if(context == grammarAccess.getSMTSetTypeDeclarationRule() ||
				   context == grammarAccess.getSMTTypeRule()) {
					sequence_SMTSetTypeDeclaration(context, (SMTSetTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_SIMPLE_SAT_COMMAND:
				if(context == grammarAccess.getSMTSatCommandRule() ||
				   context == grammarAccess.getSMTSimpleSatCommandRule()) {
					sequence_SMTSimpleSatCommand(context, (SMTSimpleSatCommand) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_SORTED_VARIABLE:
				if(context == grammarAccess.getSMTSortedVariableRule() ||
				   context == grammarAccess.getSMTSymbolicDeclarationRule()) {
					sequence_SMTSortedVariable(context, (SMTSortedVariable) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_STATISTIC_DOUBLE_VALUE:
				if(context == grammarAccess.getSMTStatisticDoubleValueRule() ||
				   context == grammarAccess.getSMTStatisticValueRule()) {
					sequence_SMTStatisticDoubleValue(context, (SMTStatisticDoubleValue) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_STATISTIC_INT_VALUE:
				if(context == grammarAccess.getSMTStatisticIntValueRule() ||
				   context == grammarAccess.getSMTStatisticValueRule()) {
					sequence_SMTStatisticIntValue(context, (SMTStatisticIntValue) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_STATISTICS_SECTION:
				if(context == grammarAccess.getSMTStatisticsSectionRule()) {
					sequence_SMTStatisticsSection(context, (SMTStatisticsSection) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_SYMBOLIC_VALUE:
				if(context == grammarAccess.getSMTSymbolicValueRule() ||
				   context == grammarAccess.getSMTTermRule()) {
					sequence_SMTSymbolicValue(context, (SMTSymbolicValue) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR:
				if(context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule() ||
				   context == grammarAccess.getSMTTryForCombinatorRule()) {
					sequence_SMTTryForCombinator(context, (SMTTryForCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_UNSUPPORTED_RESULT:
				if(context == grammarAccess.getSMTResultRule() ||
				   context == grammarAccess.getSMTUnsupportedResultRule()) {
					sequence_SMTUnsupportedResult(context, (SMTUnsupportedResult) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR:
				if(context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule() ||
				   context == grammarAccess.getSMTUsingParamCombinatorRule()) {
					sequence_SMTUsingParamCombinator(context, (SMTUsingParamCombinator) semanticObject); 
					return; 
				}
				else break;
			case SmtLanguagePackage.SMT_WHEN_COMBINATOR:
				if(context == grammarAccess.getSMTReasoningCombinatorRule() ||
				   context == grammarAccess.getSMTReasoningTacticRule() ||
				   context == grammarAccess.getSMTWhenCombinatorRule()) {
					sequence_SMTWhenCombinator(context, (SMTWhenCombinator) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ReasoningProbe(EObject context, ReasoningProbe semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.REASONING_PROBE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.REASONING_PROBE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReasoningProbeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PROPERTYNAME value=SMTAtomicTerm)
	 */
	protected void sequence_ReasoningTacticParameter(EObject context, ReasoningTacticParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.REASONING_TACTIC_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.REASONING_TACTIC_PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.REASONING_TACTIC_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.REASONING_TACTIC_PARAMETER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReasoningTacticParameterAccess().getNamePROPERTYNAMETerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getReasoningTacticParameterAccess().getValueSMTAtomicTermParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tactics+=SMTReasoningTactic+
	 */
	protected void sequence_SMTAndThenCombinator(EObject context, SMTAndThenCombinator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     operands+=SMTTerm+
	 */
	protected void sequence_SMTAnd(EObject context, SMTAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=SMTTerm
	 */
	protected void sequence_SMTAssertion(EObject context, SMTAssertion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_ASSERTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_ASSERTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTAssertionAccess().getValueSMTTermParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEANTERMINAL
	 */
	protected void sequence_SMTBoolLiteral(EObject context, SMTBoolLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_BOOL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_BOOL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTBoolLiteralAccess().getValueBOOLEANTERMINALParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SMTBoolTypeReference}
	 */
	protected void sequence_SMTBoolTypeReference(EObject context, SMTBoolTypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SMTBuiltinTactic(EObject context, SMTBuiltinTactic semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_BUILTIN_TACTIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_BUILTIN_TACTIC__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTBuiltinTacticAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=SMTTypeReference (elements+=SMTSymbolicValue* | elements+=SMTSymbolicValue))
	 */
	protected void sequence_SMTCardinalityConstraint(EObject context, SMTCardinalityConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     method=SMTReasoningTactic
	 */
	protected void sequence_SMTComplexSatCommand(EObject context, SMTComplexSatCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_COMPLEX_SAT_COMMAND__METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_COMPLEX_SAT_COMMAND__METHOD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTComplexSatCommandAccess().getMethodSMTReasoningTacticParserRuleCall_2_0(), semanticObject.getMethod());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     referred=[SMTType|ID]
	 */
	protected void sequence_SMTComplexTypeReference(EObject context, SMTComplexTypeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_COMPLEX_TYPE_REFERENCE__REFERRED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_COMPLEX_TYPE_REFERENCE__REFERRED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTComplexTypeReferenceAccess().getReferredSMTTypeIDTerminalRuleCall_0_1(), semanticObject.getReferred());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operands+=SMTTerm+
	 */
	protected void sequence_SMTDistinct(EObject context, SMTDistinct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTDiv(EObject context, SMTDiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTDivAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTDivAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTDivison(EObject context, SMTDivison semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTDivisonAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTDivisonAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (input=SMTInput output=SMTOutput?)
	 */
	protected void sequence_SMTDocument(EObject context, SMTDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SMTID
	 */
	protected void sequence_SMTEnumLiteral(EObject context, SMTEnumLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_SYMBOLIC_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_SYMBOLIC_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTEnumLiteralAccess().getNameSMTIDParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=SMTID elements+=SMTEnumLiteral+)
	 */
	protected void sequence_SMTEnumeratedTypeDeclaration(EObject context, SMTEnumeratedTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTEquals(EObject context, SMTEquals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_EQUALS__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_EQUALS__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_EQUALS__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_EQUALS__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTEqualsAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTEqualsAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_SMTErrorResult(EObject context, SMTErrorResult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_ERROR_RESULT__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_ERROR_RESULT__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTErrorResultAccess().getMessageSTRINGTerminalRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (quantifiedVariables+=SMTSortedVariable+ (expression=SMTTerm | (expression=SMTTerm pattern=SMTTerm)))
	 */
	protected void sequence_SMTExists(EObject context, SMTExists semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     probe=ReasoningProbe
	 */
	protected void sequence_SMTFailIfCombinator(EObject context, SMTFailIfCombinator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_FAIL_IF_COMBINATOR__PROBE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_FAIL_IF_COMBINATOR__PROBE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTFailIfCombinatorAccess().getProbeReasoningProbeParserRuleCall_2_0(), semanticObject.getProbe());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (quantifiedVariables+=SMTSortedVariable+ (expression=SMTTerm | (expression=SMTTerm pattern=SMTTerm)))
	 */
	protected void sequence_SMTForall(EObject context, SMTForall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SMTID parameters+=SMTTypeReference* range=SMTTypeReference)
	 */
	protected void sequence_SMTFunctionDeclaration(EObject context, SMTFunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SMTID parameters+=SMTSortedVariable* range=SMTTypeReference value=SMTTerm)
	 */
	protected void sequence_SMTFunctionDefinition(EObject context, SMTFunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SMTGetModelCommand}
	 */
	protected void sequence_SMTGetModelCommand(EObject context, SMTGetModelCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=SMTTerm if=SMTTerm else=SMTTerm)
	 */
	protected void sequence_SMTITE(EObject context, SMTITE semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTITE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTITE__CONDITION));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTITE__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTITE__IF));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTITE__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTITE__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTITEAccess().getConditionSMTTermParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getSMTITEAccess().getIfSMTTermParserRuleCall_3_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getSMTITEAccess().getElseSMTTermParserRuleCall_4_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (probe=ReasoningProbe ifTactic=SMTReasoningTactic elseTactic=SMTReasoningTactic)
	 */
	protected void sequence_SMTIfCombinator(EObject context, SMTIfCombinator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_IF_COMBINATOR__PROBE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_IF_COMBINATOR__PROBE));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_IF_COMBINATOR__IF_TACTIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_IF_COMBINATOR__IF_TACTIC));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_IF_COMBINATOR__ELSE_TACTIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_IF_COMBINATOR__ELSE_TACTIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTIfCombinatorAccess().getProbeReasoningProbeParserRuleCall_2_0(), semanticObject.getProbe());
		feeder.accept(grammarAccess.getSMTIfCombinatorAccess().getIfTacticSMTReasoningTacticParserRuleCall_3_0(), semanticObject.getIfTactic());
		feeder.accept(grammarAccess.getSMTIfCombinatorAccess().getElseTacticSMTReasoningTacticParserRuleCall_4_0(), semanticObject.getElseTactic());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTIff(EObject context, SMTIff semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_IFF__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_IFF__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_IFF__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_IFF__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTIffAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTIffAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTImpl(EObject context, SMTImpl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_IMPL__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_IMPL__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_IMPL__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_IMPL__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTImplAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTImplAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=SMTID definition=SMTTerm)
	 */
	protected void sequence_SMTInlineConstantDefinition(EObject context, SMTInlineConstantDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_SYMBOLIC_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_SYMBOLIC_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INLINE_CONSTANT_DEFINITION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INLINE_CONSTANT_DEFINITION__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTInlineConstantDefinitionAccess().getNameSMTIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSMTInlineConstantDefinitionAccess().getDefinitionSMTTermParserRuleCall_2_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         options+=SMTOption* 
	 *         (typeDeclarations+=SMTType | functionDeclarations+=SMTFunctionDeclaration | functionDefinition+=SMTFunctionDefinition | assertions+=SMTAssertion)* 
	 *         satCommand=SMTSatCommand 
	 *         getModelCommand=SMTGetModelCommand
	 *     )
	 */
	protected void sequence_SMTInput(EObject context, SMTInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_SMTIntLiteral(EObject context, SMTIntLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTIntLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SMTIntTypeReference}
	 */
	protected void sequence_SMTIntTypeReference(EObject context, SMTIntTypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTLEQ(EObject context, SMTLEQ semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTLEQ__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTLEQ__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTLEQ__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTLEQ__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTLEQAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTLEQAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTLT(EObject context, SMTLT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTLT__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTLT__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTLT__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTLT__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTLTAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTLTAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (inlineConstantDefinitions+=SMTInlineConstantDefinition+ term=SMTTerm)
	 */
	protected void sequence_SMTLet(EObject context, SMTLet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTMEQ(EObject context, SMTMEQ semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTMEQ__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTMEQ__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTMEQ__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTMEQ__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTMEQAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTMEQAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTMT(EObject context, SMTMT semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTMT__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTMT__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMTMT__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMTMT__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTMTAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTMTAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm?)
	 */
	protected void sequence_SMTMinus(EObject context, SMTMinus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTMod(EObject context, SMTMod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTModAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTModAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (newFunctionDeclarations+=SMTFunctionDeclaration | typeDefinitions+=SMTCardinalityConstraint | newFunctionDefinitions+=SMTFunctionDefinition)*
	 *     )
	 */
	protected void sequence_SMTModelResult(EObject context, SMTModelResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTMultiply(EObject context, SMTMultiply semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTMultiplyAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTMultiplyAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=SMTTerm
	 */
	protected void sequence_SMTNot(EObject context, SMTNot semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_NOT__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_NOT__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTNotAccess().getOperandSMTTermParserRuleCall_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PROPERTYNAME value=SMTAtomicTerm)
	 */
	protected void sequence_SMTOption(EObject context, SMTOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_OPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_OPTION__NAME));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_OPTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTOptionAccess().getNamePROPERTYNAMETerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSMTOptionAccess().getValueSMTAtomicTermParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tactics+=SMTReasoningTactic+
	 */
	protected void sequence_SMTOrElseCombinator(EObject context, SMTOrElseCombinator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     operands+=SMTTerm+
	 */
	protected void sequence_SMTOr(EObject context, SMTOr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statistics=SMTStatisticsSection?)
	 */
	protected void sequence_SMTOutput(EObject context, SMTOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     tactics+=SMTReasoningTactic+
	 */
	protected void sequence_SMTParOrCombinator(EObject context, SMTParOrCombinator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (preProcessingTactic=SMTReasoningTactic paralellyPostpricessingTactic=SMTReasoningTactic)
	 */
	protected void sequence_SMTParThenCombinator(EObject context, SMTParThenCombinator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTParThenCombinatorAccess().getPreProcessingTacticSMTReasoningTacticParserRuleCall_2_0(), semanticObject.getPreProcessingTactic());
		feeder.accept(grammarAccess.getSMTParThenCombinatorAccess().getParalellyPostpricessingTacticSMTReasoningTacticParserRuleCall_3_0(), semanticObject.getParalellyPostpricessingTactic());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=SMTTerm rightOperand=SMTTerm)
	 */
	protected void sequence_SMTPlus(EObject context, SMTPlus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_INT_OPERATION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTPlusAccess().getLeftOperandSMTTermParserRuleCall_2_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getSMTPlusAccess().getRightOperandSMTTermParserRuleCall_3_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=REAL
	 */
	protected void sequence_SMTRealLiteral(EObject context, SMTRealLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_REAL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_REAL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTRealLiteralAccess().getValueREALTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SMTRealTypeReference}
	 */
	protected void sequence_SMTRealTypeReference(EObject context, SMTRealTypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sat?='sat' | unsat?='unsat' | unknown?='unknown')
	 */
	protected void sequence_SMTSatResult(EObject context, SMTSatResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SMTID
	 */
	protected void sequence_SMTSetTypeDeclaration(EObject context, SMTSetTypeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTSetTypeDeclarationAccess().getNameSMTIDParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SMTSimpleSatCommand}
	 */
	protected void sequence_SMTSimpleSatCommand(EObject context, SMTSimpleSatCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=SMTID range=SMTTypeReference)
	 */
	protected void sequence_SMTSortedVariable(EObject context, SMTSortedVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_SYMBOLIC_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_SYMBOLIC_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_SORTED_VARIABLE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_SORTED_VARIABLE__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTSortedVariableAccess().getNameSMTIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSMTSortedVariableAccess().getRangeSMTTypeReferenceParserRuleCall_2_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PROPERTYNAME value=REAL)
	 */
	protected void sequence_SMTStatisticDoubleValue(EObject context, SMTStatisticDoubleValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_VALUE__NAME));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_DOUBLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_DOUBLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTStatisticDoubleValueAccess().getNamePROPERTYNAMETerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSMTStatisticDoubleValueAccess().getValueREALTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PROPERTYNAME value=INT)
	 */
	protected void sequence_SMTStatisticIntValue(EObject context, SMTStatisticIntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_VALUE__NAME));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_STATISTIC_INT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTStatisticIntValueAccess().getNamePROPERTYNAMETerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSMTStatisticIntValueAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=SMTStatisticValue*)
	 */
	protected void sequence_SMTStatisticsSection(EObject context, SMTStatisticsSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((symbolicReference=[SMTSymbolicDeclaration|ID] parameterSubstitutions+=SMTTerm+) | symbolicReference=[SMTSymbolicDeclaration|ID])
	 */
	protected void sequence_SMTSymbolicValue(EObject context, SMTSymbolicValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tactic=SMTReasoningTactic time=INT)
	 */
	protected void sequence_SMTTryForCombinator(EObject context, SMTTryForCombinator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_TRY_FOR_COMBINATOR__TACTIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_TRY_FOR_COMBINATOR__TACTIC));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_TRY_FOR_COMBINATOR__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_TRY_FOR_COMBINATOR__TIME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTTryForCombinatorAccess().getTacticSMTReasoningTacticParserRuleCall_2_0(), semanticObject.getTactic());
		feeder.accept(grammarAccess.getSMTTryForCombinatorAccess().getTimeINTTerminalRuleCall_3_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     command=ID
	 */
	protected void sequence_SMTUnsupportedResult(EObject context, SMTUnsupportedResult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_UNSUPPORTED_RESULT__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_UNSUPPORTED_RESULT__COMMAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTUnsupportedResultAccess().getCommandIDTerminalRuleCall_2_0(), semanticObject.getCommand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tactic=SMTReasoningTactic parameters+=ReasoningTacticParameter*)
	 */
	protected void sequence_SMTUsingParamCombinator(EObject context, SMTUsingParamCombinator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (probe=ReasoningProbe tactic=SMTReasoningTactic)
	 */
	protected void sequence_SMTWhenCombinator(EObject context, SMTWhenCombinator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_WHEN_COMBINATOR__PROBE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_WHEN_COMBINATOR__PROBE));
			if(transientValues.isValueTransient(semanticObject, SmtLanguagePackage.Literals.SMT_WHEN_COMBINATOR__TACTIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmtLanguagePackage.Literals.SMT_WHEN_COMBINATOR__TACTIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSMTWhenCombinatorAccess().getProbeReasoningProbeParserRuleCall_2_0(), semanticObject.getProbe());
		feeder.accept(grammarAccess.getSMTWhenCombinatorAccess().getTacticSMTReasoningTacticParserRuleCall_3_0(), semanticObject.getTactic());
		feeder.finish();
	}
}
