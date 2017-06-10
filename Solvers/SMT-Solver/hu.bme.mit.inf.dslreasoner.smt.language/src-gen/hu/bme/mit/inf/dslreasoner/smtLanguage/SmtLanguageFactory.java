/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage
 * @generated
 */
public interface SmtLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmtLanguageFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>SMT Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Document</em>'.
   * @generated
   */
  SMTDocument createSMTDocument();

  /**
   * Returns a new object of class '<em>SMT Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Input</em>'.
   * @generated
   */
  SMTInput createSMTInput();

  /**
   * Returns a new object of class '<em>SMT Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Output</em>'.
   * @generated
   */
  SMTOutput createSMTOutput();

  /**
   * Returns a new object of class '<em>SMT Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Option</em>'.
   * @generated
   */
  SMTOption createSMTOption();

  /**
   * Returns a new object of class '<em>SMT Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Type</em>'.
   * @generated
   */
  SMTType createSMTType();

  /**
   * Returns a new object of class '<em>SMT Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Enum Literal</em>'.
   * @generated
   */
  SMTEnumLiteral createSMTEnumLiteral();

  /**
   * Returns a new object of class '<em>SMT Enumerated Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Enumerated Type Declaration</em>'.
   * @generated
   */
  SMTEnumeratedTypeDeclaration createSMTEnumeratedTypeDeclaration();

  /**
   * Returns a new object of class '<em>SMT Set Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Set Type Declaration</em>'.
   * @generated
   */
  SMTSetTypeDeclaration createSMTSetTypeDeclaration();

  /**
   * Returns a new object of class '<em>SMT Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Type Reference</em>'.
   * @generated
   */
  SMTTypeReference createSMTTypeReference();

  /**
   * Returns a new object of class '<em>SMT Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Complex Type Reference</em>'.
   * @generated
   */
  SMTComplexTypeReference createSMTComplexTypeReference();

  /**
   * Returns a new object of class '<em>SMT Primitive Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Primitive Type Reference</em>'.
   * @generated
   */
  SMTPrimitiveTypeReference createSMTPrimitiveTypeReference();

  /**
   * Returns a new object of class '<em>SMT Int Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Int Type Reference</em>'.
   * @generated
   */
  SMTIntTypeReference createSMTIntTypeReference();

  /**
   * Returns a new object of class '<em>SMT Bool Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Bool Type Reference</em>'.
   * @generated
   */
  SMTBoolTypeReference createSMTBoolTypeReference();

  /**
   * Returns a new object of class '<em>SMT Real Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Real Type Reference</em>'.
   * @generated
   */
  SMTRealTypeReference createSMTRealTypeReference();

  /**
   * Returns a new object of class '<em>SMT Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Function Declaration</em>'.
   * @generated
   */
  SMTFunctionDeclaration createSMTFunctionDeclaration();

  /**
   * Returns a new object of class '<em>SMT Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Function Definition</em>'.
   * @generated
   */
  SMTFunctionDefinition createSMTFunctionDefinition();

  /**
   * Returns a new object of class '<em>SMT Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Term</em>'.
   * @generated
   */
  SMTTerm createSMTTerm();

  /**
   * Returns a new object of class '<em>SMT Symbolic Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Symbolic Declaration</em>'.
   * @generated
   */
  SMTSymbolicDeclaration createSMTSymbolicDeclaration();

  /**
   * Returns a new object of class '<em>SMT Symbolic Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Symbolic Value</em>'.
   * @generated
   */
  SMTSymbolicValue createSMTSymbolicValue();

  /**
   * Returns a new object of class '<em>SMT Atomic Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Atomic Term</em>'.
   * @generated
   */
  SMTAtomicTerm createSMTAtomicTerm();

  /**
   * Returns a new object of class '<em>SMT Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Int Literal</em>'.
   * @generated
   */
  SMTIntLiteral createSMTIntLiteral();

  /**
   * Returns a new object of class '<em>SMT Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Bool Literal</em>'.
   * @generated
   */
  SMTBoolLiteral createSMTBoolLiteral();

  /**
   * Returns a new object of class '<em>SMT Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Real Literal</em>'.
   * @generated
   */
  SMTRealLiteral createSMTRealLiteral();

  /**
   * Returns a new object of class '<em>SMT Sorted Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Sorted Variable</em>'.
   * @generated
   */
  SMTSortedVariable createSMTSortedVariable();

  /**
   * Returns a new object of class '<em>SMT Quantified Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Quantified Expression</em>'.
   * @generated
   */
  SMTQuantifiedExpression createSMTQuantifiedExpression();

  /**
   * Returns a new object of class '<em>SMT Exists</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Exists</em>'.
   * @generated
   */
  SMTExists createSMTExists();

  /**
   * Returns a new object of class '<em>SMT Forall</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Forall</em>'.
   * @generated
   */
  SMTForall createSMTForall();

  /**
   * Returns a new object of class '<em>SMT Bool Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Bool Operation</em>'.
   * @generated
   */
  SMTBoolOperation createSMTBoolOperation();

  /**
   * Returns a new object of class '<em>SMT And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT And</em>'.
   * @generated
   */
  SMTAnd createSMTAnd();

  /**
   * Returns a new object of class '<em>SMT Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Or</em>'.
   * @generated
   */
  SMTOr createSMTOr();

  /**
   * Returns a new object of class '<em>SMT Impl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Impl</em>'.
   * @generated
   */
  SMTImpl createSMTImpl();

  /**
   * Returns a new object of class '<em>SMT Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Not</em>'.
   * @generated
   */
  SMTNot createSMTNot();

  /**
   * Returns a new object of class '<em>SMT Iff</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Iff</em>'.
   * @generated
   */
  SMTIff createSMTIff();

  /**
   * Returns a new object of class '<em>SMTITE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMTITE</em>'.
   * @generated
   */
  SMTITE createSMTITE();

  /**
   * Returns a new object of class '<em>SMT Let</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Let</em>'.
   * @generated
   */
  SMTLet createSMTLet();

  /**
   * Returns a new object of class '<em>SMT Inline Constant Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Inline Constant Definition</em>'.
   * @generated
   */
  SMTInlineConstantDefinition createSMTInlineConstantDefinition();

  /**
   * Returns a new object of class '<em>SMT Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Relation</em>'.
   * @generated
   */
  SMTRelation createSMTRelation();

  /**
   * Returns a new object of class '<em>SMT Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Equals</em>'.
   * @generated
   */
  SMTEquals createSMTEquals();

  /**
   * Returns a new object of class '<em>SMT Distinct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Distinct</em>'.
   * @generated
   */
  SMTDistinct createSMTDistinct();

  /**
   * Returns a new object of class '<em>SMTLT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMTLT</em>'.
   * @generated
   */
  SMTLT createSMTLT();

  /**
   * Returns a new object of class '<em>SMTMT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMTMT</em>'.
   * @generated
   */
  SMTMT createSMTMT();

  /**
   * Returns a new object of class '<em>SMTLEQ</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMTLEQ</em>'.
   * @generated
   */
  SMTLEQ createSMTLEQ();

  /**
   * Returns a new object of class '<em>SMTMEQ</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMTMEQ</em>'.
   * @generated
   */
  SMTMEQ createSMTMEQ();

  /**
   * Returns a new object of class '<em>SMT Int Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Int Operation</em>'.
   * @generated
   */
  SMTIntOperation createSMTIntOperation();

  /**
   * Returns a new object of class '<em>SMT Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Plus</em>'.
   * @generated
   */
  SMTPlus createSMTPlus();

  /**
   * Returns a new object of class '<em>SMT Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Minus</em>'.
   * @generated
   */
  SMTMinus createSMTMinus();

  /**
   * Returns a new object of class '<em>SMT Multiply</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Multiply</em>'.
   * @generated
   */
  SMTMultiply createSMTMultiply();

  /**
   * Returns a new object of class '<em>SMT Divison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Divison</em>'.
   * @generated
   */
  SMTDivison createSMTDivison();

  /**
   * Returns a new object of class '<em>SMT Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Div</em>'.
   * @generated
   */
  SMTDiv createSMTDiv();

  /**
   * Returns a new object of class '<em>SMT Mod</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Mod</em>'.
   * @generated
   */
  SMTMod createSMTMod();

  /**
   * Returns a new object of class '<em>SMT Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Assertion</em>'.
   * @generated
   */
  SMTAssertion createSMTAssertion();

  /**
   * Returns a new object of class '<em>SMT Cardinality Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Cardinality Constraint</em>'.
   * @generated
   */
  SMTCardinalityConstraint createSMTCardinalityConstraint();

  /**
   * Returns a new object of class '<em>SMT Sat Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Sat Command</em>'.
   * @generated
   */
  SMTSatCommand createSMTSatCommand();

  /**
   * Returns a new object of class '<em>SMT Simple Sat Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Simple Sat Command</em>'.
   * @generated
   */
  SMTSimpleSatCommand createSMTSimpleSatCommand();

  /**
   * Returns a new object of class '<em>SMT Complex Sat Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Complex Sat Command</em>'.
   * @generated
   */
  SMTComplexSatCommand createSMTComplexSatCommand();

  /**
   * Returns a new object of class '<em>SMT Get Model Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Get Model Command</em>'.
   * @generated
   */
  SMTGetModelCommand createSMTGetModelCommand();

  /**
   * Returns a new object of class '<em>SMT Reasoning Tactic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Reasoning Tactic</em>'.
   * @generated
   */
  SMTReasoningTactic createSMTReasoningTactic();

  /**
   * Returns a new object of class '<em>SMT Builtin Tactic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Builtin Tactic</em>'.
   * @generated
   */
  SMTBuiltinTactic createSMTBuiltinTactic();

  /**
   * Returns a new object of class '<em>SMT Reasoning Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Reasoning Combinator</em>'.
   * @generated
   */
  SMTReasoningCombinator createSMTReasoningCombinator();

  /**
   * Returns a new object of class '<em>SMT And Then Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT And Then Combinator</em>'.
   * @generated
   */
  SMTAndThenCombinator createSMTAndThenCombinator();

  /**
   * Returns a new object of class '<em>SMT Or Else Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Or Else Combinator</em>'.
   * @generated
   */
  SMTOrElseCombinator createSMTOrElseCombinator();

  /**
   * Returns a new object of class '<em>SMT Par Or Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Par Or Combinator</em>'.
   * @generated
   */
  SMTParOrCombinator createSMTParOrCombinator();

  /**
   * Returns a new object of class '<em>SMT Par Then Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Par Then Combinator</em>'.
   * @generated
   */
  SMTParThenCombinator createSMTParThenCombinator();

  /**
   * Returns a new object of class '<em>SMT Try For Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Try For Combinator</em>'.
   * @generated
   */
  SMTTryForCombinator createSMTTryForCombinator();

  /**
   * Returns a new object of class '<em>SMT If Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT If Combinator</em>'.
   * @generated
   */
  SMTIfCombinator createSMTIfCombinator();

  /**
   * Returns a new object of class '<em>SMT When Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT When Combinator</em>'.
   * @generated
   */
  SMTWhenCombinator createSMTWhenCombinator();

  /**
   * Returns a new object of class '<em>SMT Fail If Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Fail If Combinator</em>'.
   * @generated
   */
  SMTFailIfCombinator createSMTFailIfCombinator();

  /**
   * Returns a new object of class '<em>SMT Using Param Combinator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Using Param Combinator</em>'.
   * @generated
   */
  SMTUsingParamCombinator createSMTUsingParamCombinator();

  /**
   * Returns a new object of class '<em>Reasoning Probe</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reasoning Probe</em>'.
   * @generated
   */
  ReasoningProbe createReasoningProbe();

  /**
   * Returns a new object of class '<em>Reasoning Tactic Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reasoning Tactic Parameter</em>'.
   * @generated
   */
  ReasoningTacticParameter createReasoningTacticParameter();

  /**
   * Returns a new object of class '<em>SMT Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Result</em>'.
   * @generated
   */
  SMTResult createSMTResult();

  /**
   * Returns a new object of class '<em>SMT Error Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Error Result</em>'.
   * @generated
   */
  SMTErrorResult createSMTErrorResult();

  /**
   * Returns a new object of class '<em>SMT Unsupported Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Unsupported Result</em>'.
   * @generated
   */
  SMTUnsupportedResult createSMTUnsupportedResult();

  /**
   * Returns a new object of class '<em>SMT Sat Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Sat Result</em>'.
   * @generated
   */
  SMTSatResult createSMTSatResult();

  /**
   * Returns a new object of class '<em>SMT Model Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Model Result</em>'.
   * @generated
   */
  SMTModelResult createSMTModelResult();

  /**
   * Returns a new object of class '<em>SMT Statistic Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Statistic Value</em>'.
   * @generated
   */
  SMTStatisticValue createSMTStatisticValue();

  /**
   * Returns a new object of class '<em>SMT Statistic Int Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Statistic Int Value</em>'.
   * @generated
   */
  SMTStatisticIntValue createSMTStatisticIntValue();

  /**
   * Returns a new object of class '<em>SMT Statistic Double Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Statistic Double Value</em>'.
   * @generated
   */
  SMTStatisticDoubleValue createSMTStatisticDoubleValue();

  /**
   * Returns a new object of class '<em>SMT Statistics Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SMT Statistics Section</em>'.
   * @generated
   */
  SMTStatisticsSection createSMTStatisticsSection();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SmtLanguagePackage getSmtLanguagePackage();

} //SmtLanguageFactory
