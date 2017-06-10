/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmtLanguageFactoryImpl extends EFactoryImpl implements SmtLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SmtLanguageFactory init()
  {
    try
    {
      SmtLanguageFactory theSmtLanguageFactory = (SmtLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(SmtLanguagePackage.eNS_URI);
      if (theSmtLanguageFactory != null)
      {
        return theSmtLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SmtLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmtLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SmtLanguagePackage.SMT_DOCUMENT: return createSMTDocument();
      case SmtLanguagePackage.SMT_INPUT: return createSMTInput();
      case SmtLanguagePackage.SMT_OUTPUT: return createSMTOutput();
      case SmtLanguagePackage.SMT_OPTION: return createSMTOption();
      case SmtLanguagePackage.SMT_TYPE: return createSMTType();
      case SmtLanguagePackage.SMT_ENUM_LITERAL: return createSMTEnumLiteral();
      case SmtLanguagePackage.SMT_ENUMERATED_TYPE_DECLARATION: return createSMTEnumeratedTypeDeclaration();
      case SmtLanguagePackage.SMT_SET_TYPE_DECLARATION: return createSMTSetTypeDeclaration();
      case SmtLanguagePackage.SMT_TYPE_REFERENCE: return createSMTTypeReference();
      case SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE: return createSMTComplexTypeReference();
      case SmtLanguagePackage.SMT_PRIMITIVE_TYPE_REFERENCE: return createSMTPrimitiveTypeReference();
      case SmtLanguagePackage.SMT_INT_TYPE_REFERENCE: return createSMTIntTypeReference();
      case SmtLanguagePackage.SMT_BOOL_TYPE_REFERENCE: return createSMTBoolTypeReference();
      case SmtLanguagePackage.SMT_REAL_TYPE_REFERENCE: return createSMTRealTypeReference();
      case SmtLanguagePackage.SMT_FUNCTION_DECLARATION: return createSMTFunctionDeclaration();
      case SmtLanguagePackage.SMT_FUNCTION_DEFINITION: return createSMTFunctionDefinition();
      case SmtLanguagePackage.SMT_TERM: return createSMTTerm();
      case SmtLanguagePackage.SMT_SYMBOLIC_DECLARATION: return createSMTSymbolicDeclaration();
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE: return createSMTSymbolicValue();
      case SmtLanguagePackage.SMT_ATOMIC_TERM: return createSMTAtomicTerm();
      case SmtLanguagePackage.SMT_INT_LITERAL: return createSMTIntLiteral();
      case SmtLanguagePackage.SMT_BOOL_LITERAL: return createSMTBoolLiteral();
      case SmtLanguagePackage.SMT_REAL_LITERAL: return createSMTRealLiteral();
      case SmtLanguagePackage.SMT_SORTED_VARIABLE: return createSMTSortedVariable();
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION: return createSMTQuantifiedExpression();
      case SmtLanguagePackage.SMT_EXISTS: return createSMTExists();
      case SmtLanguagePackage.SMT_FORALL: return createSMTForall();
      case SmtLanguagePackage.SMT_BOOL_OPERATION: return createSMTBoolOperation();
      case SmtLanguagePackage.SMT_AND: return createSMTAnd();
      case SmtLanguagePackage.SMT_OR: return createSMTOr();
      case SmtLanguagePackage.SMT_IMPL: return createSMTImpl();
      case SmtLanguagePackage.SMT_NOT: return createSMTNot();
      case SmtLanguagePackage.SMT_IFF: return createSMTIff();
      case SmtLanguagePackage.SMTITE: return createSMTITE();
      case SmtLanguagePackage.SMT_LET: return createSMTLet();
      case SmtLanguagePackage.SMT_INLINE_CONSTANT_DEFINITION: return createSMTInlineConstantDefinition();
      case SmtLanguagePackage.SMT_RELATION: return createSMTRelation();
      case SmtLanguagePackage.SMT_EQUALS: return createSMTEquals();
      case SmtLanguagePackage.SMT_DISTINCT: return createSMTDistinct();
      case SmtLanguagePackage.SMTLT: return createSMTLT();
      case SmtLanguagePackage.SMTMT: return createSMTMT();
      case SmtLanguagePackage.SMTLEQ: return createSMTLEQ();
      case SmtLanguagePackage.SMTMEQ: return createSMTMEQ();
      case SmtLanguagePackage.SMT_INT_OPERATION: return createSMTIntOperation();
      case SmtLanguagePackage.SMT_PLUS: return createSMTPlus();
      case SmtLanguagePackage.SMT_MINUS: return createSMTMinus();
      case SmtLanguagePackage.SMT_MULTIPLY: return createSMTMultiply();
      case SmtLanguagePackage.SMT_DIVISON: return createSMTDivison();
      case SmtLanguagePackage.SMT_DIV: return createSMTDiv();
      case SmtLanguagePackage.SMT_MOD: return createSMTMod();
      case SmtLanguagePackage.SMT_ASSERTION: return createSMTAssertion();
      case SmtLanguagePackage.SMT_CARDINALITY_CONSTRAINT: return createSMTCardinalityConstraint();
      case SmtLanguagePackage.SMT_SAT_COMMAND: return createSMTSatCommand();
      case SmtLanguagePackage.SMT_SIMPLE_SAT_COMMAND: return createSMTSimpleSatCommand();
      case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND: return createSMTComplexSatCommand();
      case SmtLanguagePackage.SMT_GET_MODEL_COMMAND: return createSMTGetModelCommand();
      case SmtLanguagePackage.SMT_REASONING_TACTIC: return createSMTReasoningTactic();
      case SmtLanguagePackage.SMT_BUILTIN_TACTIC: return createSMTBuiltinTactic();
      case SmtLanguagePackage.SMT_REASONING_COMBINATOR: return createSMTReasoningCombinator();
      case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR: return createSMTAndThenCombinator();
      case SmtLanguagePackage.SMT_OR_ELSE_COMBINATOR: return createSMTOrElseCombinator();
      case SmtLanguagePackage.SMT_PAR_OR_COMBINATOR: return createSMTParOrCombinator();
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR: return createSMTParThenCombinator();
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR: return createSMTTryForCombinator();
      case SmtLanguagePackage.SMT_IF_COMBINATOR: return createSMTIfCombinator();
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR: return createSMTWhenCombinator();
      case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR: return createSMTFailIfCombinator();
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR: return createSMTUsingParamCombinator();
      case SmtLanguagePackage.REASONING_PROBE: return createReasoningProbe();
      case SmtLanguagePackage.REASONING_TACTIC_PARAMETER: return createReasoningTacticParameter();
      case SmtLanguagePackage.SMT_RESULT: return createSMTResult();
      case SmtLanguagePackage.SMT_ERROR_RESULT: return createSMTErrorResult();
      case SmtLanguagePackage.SMT_UNSUPPORTED_RESULT: return createSMTUnsupportedResult();
      case SmtLanguagePackage.SMT_SAT_RESULT: return createSMTSatResult();
      case SmtLanguagePackage.SMT_MODEL_RESULT: return createSMTModelResult();
      case SmtLanguagePackage.SMT_STATISTIC_VALUE: return createSMTStatisticValue();
      case SmtLanguagePackage.SMT_STATISTIC_INT_VALUE: return createSMTStatisticIntValue();
      case SmtLanguagePackage.SMT_STATISTIC_DOUBLE_VALUE: return createSMTStatisticDoubleValue();
      case SmtLanguagePackage.SMT_STATISTICS_SECTION: return createSMTStatisticsSection();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTDocument createSMTDocument()
  {
    SMTDocumentImpl smtDocument = new SMTDocumentImpl();
    return smtDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTInput createSMTInput()
  {
    SMTInputImpl smtInput = new SMTInputImpl();
    return smtInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTOutput createSMTOutput()
  {
    SMTOutputImpl smtOutput = new SMTOutputImpl();
    return smtOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTOption createSMTOption()
  {
    SMTOptionImpl smtOption = new SMTOptionImpl();
    return smtOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTType createSMTType()
  {
    SMTTypeImpl smtType = new SMTTypeImpl();
    return smtType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTEnumLiteral createSMTEnumLiteral()
  {
    SMTEnumLiteralImpl smtEnumLiteral = new SMTEnumLiteralImpl();
    return smtEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTEnumeratedTypeDeclaration createSMTEnumeratedTypeDeclaration()
  {
    SMTEnumeratedTypeDeclarationImpl smtEnumeratedTypeDeclaration = new SMTEnumeratedTypeDeclarationImpl();
    return smtEnumeratedTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSetTypeDeclaration createSMTSetTypeDeclaration()
  {
    SMTSetTypeDeclarationImpl smtSetTypeDeclaration = new SMTSetTypeDeclarationImpl();
    return smtSetTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTTypeReference createSMTTypeReference()
  {
    SMTTypeReferenceImpl smtTypeReference = new SMTTypeReferenceImpl();
    return smtTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTComplexTypeReference createSMTComplexTypeReference()
  {
    SMTComplexTypeReferenceImpl smtComplexTypeReference = new SMTComplexTypeReferenceImpl();
    return smtComplexTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTPrimitiveTypeReference createSMTPrimitiveTypeReference()
  {
    SMTPrimitiveTypeReferenceImpl smtPrimitiveTypeReference = new SMTPrimitiveTypeReferenceImpl();
    return smtPrimitiveTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTIntTypeReference createSMTIntTypeReference()
  {
    SMTIntTypeReferenceImpl smtIntTypeReference = new SMTIntTypeReferenceImpl();
    return smtIntTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTBoolTypeReference createSMTBoolTypeReference()
  {
    SMTBoolTypeReferenceImpl smtBoolTypeReference = new SMTBoolTypeReferenceImpl();
    return smtBoolTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTRealTypeReference createSMTRealTypeReference()
  {
    SMTRealTypeReferenceImpl smtRealTypeReference = new SMTRealTypeReferenceImpl();
    return smtRealTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTFunctionDeclaration createSMTFunctionDeclaration()
  {
    SMTFunctionDeclarationImpl smtFunctionDeclaration = new SMTFunctionDeclarationImpl();
    return smtFunctionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTFunctionDefinition createSMTFunctionDefinition()
  {
    SMTFunctionDefinitionImpl smtFunctionDefinition = new SMTFunctionDefinitionImpl();
    return smtFunctionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTTerm createSMTTerm()
  {
    SMTTermImpl smtTerm = new SMTTermImpl();
    return smtTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSymbolicDeclaration createSMTSymbolicDeclaration()
  {
    SMTSymbolicDeclarationImpl smtSymbolicDeclaration = new SMTSymbolicDeclarationImpl();
    return smtSymbolicDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSymbolicValue createSMTSymbolicValue()
  {
    SMTSymbolicValueImpl smtSymbolicValue = new SMTSymbolicValueImpl();
    return smtSymbolicValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTAtomicTerm createSMTAtomicTerm()
  {
    SMTAtomicTermImpl smtAtomicTerm = new SMTAtomicTermImpl();
    return smtAtomicTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTIntLiteral createSMTIntLiteral()
  {
    SMTIntLiteralImpl smtIntLiteral = new SMTIntLiteralImpl();
    return smtIntLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTBoolLiteral createSMTBoolLiteral()
  {
    SMTBoolLiteralImpl smtBoolLiteral = new SMTBoolLiteralImpl();
    return smtBoolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTRealLiteral createSMTRealLiteral()
  {
    SMTRealLiteralImpl smtRealLiteral = new SMTRealLiteralImpl();
    return smtRealLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSortedVariable createSMTSortedVariable()
  {
    SMTSortedVariableImpl smtSortedVariable = new SMTSortedVariableImpl();
    return smtSortedVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTQuantifiedExpression createSMTQuantifiedExpression()
  {
    SMTQuantifiedExpressionImpl smtQuantifiedExpression = new SMTQuantifiedExpressionImpl();
    return smtQuantifiedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTExists createSMTExists()
  {
    SMTExistsImpl smtExists = new SMTExistsImpl();
    return smtExists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTForall createSMTForall()
  {
    SMTForallImpl smtForall = new SMTForallImpl();
    return smtForall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTBoolOperation createSMTBoolOperation()
  {
    SMTBoolOperationImpl smtBoolOperation = new SMTBoolOperationImpl();
    return smtBoolOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTAnd createSMTAnd()
  {
    SMTAndImpl smtAnd = new SMTAndImpl();
    return smtAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTOr createSMTOr()
  {
    SMTOrImpl smtOr = new SMTOrImpl();
    return smtOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTImpl createSMTImpl()
  {
    SMTImplImpl smtImpl = new SMTImplImpl();
    return smtImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTNot createSMTNot()
  {
    SMTNotImpl smtNot = new SMTNotImpl();
    return smtNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTIff createSMTIff()
  {
    SMTIffImpl smtIff = new SMTIffImpl();
    return smtIff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTITE createSMTITE()
  {
    SMTITEImpl smtite = new SMTITEImpl();
    return smtite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTLet createSMTLet()
  {
    SMTLetImpl smtLet = new SMTLetImpl();
    return smtLet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTInlineConstantDefinition createSMTInlineConstantDefinition()
  {
    SMTInlineConstantDefinitionImpl smtInlineConstantDefinition = new SMTInlineConstantDefinitionImpl();
    return smtInlineConstantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTRelation createSMTRelation()
  {
    SMTRelationImpl smtRelation = new SMTRelationImpl();
    return smtRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTEquals createSMTEquals()
  {
    SMTEqualsImpl smtEquals = new SMTEqualsImpl();
    return smtEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTDistinct createSMTDistinct()
  {
    SMTDistinctImpl smtDistinct = new SMTDistinctImpl();
    return smtDistinct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTLT createSMTLT()
  {
    SMTLTImpl smtlt = new SMTLTImpl();
    return smtlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTMT createSMTMT()
  {
    SMTMTImpl smtmt = new SMTMTImpl();
    return smtmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTLEQ createSMTLEQ()
  {
    SMTLEQImpl smtleq = new SMTLEQImpl();
    return smtleq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTMEQ createSMTMEQ()
  {
    SMTMEQImpl smtmeq = new SMTMEQImpl();
    return smtmeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTIntOperation createSMTIntOperation()
  {
    SMTIntOperationImpl smtIntOperation = new SMTIntOperationImpl();
    return smtIntOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTPlus createSMTPlus()
  {
    SMTPlusImpl smtPlus = new SMTPlusImpl();
    return smtPlus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTMinus createSMTMinus()
  {
    SMTMinusImpl smtMinus = new SMTMinusImpl();
    return smtMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTMultiply createSMTMultiply()
  {
    SMTMultiplyImpl smtMultiply = new SMTMultiplyImpl();
    return smtMultiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTDivison createSMTDivison()
  {
    SMTDivisonImpl smtDivison = new SMTDivisonImpl();
    return smtDivison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTDiv createSMTDiv()
  {
    SMTDivImpl smtDiv = new SMTDivImpl();
    return smtDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTMod createSMTMod()
  {
    SMTModImpl smtMod = new SMTModImpl();
    return smtMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTAssertion createSMTAssertion()
  {
    SMTAssertionImpl smtAssertion = new SMTAssertionImpl();
    return smtAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTCardinalityConstraint createSMTCardinalityConstraint()
  {
    SMTCardinalityConstraintImpl smtCardinalityConstraint = new SMTCardinalityConstraintImpl();
    return smtCardinalityConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSatCommand createSMTSatCommand()
  {
    SMTSatCommandImpl smtSatCommand = new SMTSatCommandImpl();
    return smtSatCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSimpleSatCommand createSMTSimpleSatCommand()
  {
    SMTSimpleSatCommandImpl smtSimpleSatCommand = new SMTSimpleSatCommandImpl();
    return smtSimpleSatCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTComplexSatCommand createSMTComplexSatCommand()
  {
    SMTComplexSatCommandImpl smtComplexSatCommand = new SMTComplexSatCommandImpl();
    return smtComplexSatCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTGetModelCommand createSMTGetModelCommand()
  {
    SMTGetModelCommandImpl smtGetModelCommand = new SMTGetModelCommandImpl();
    return smtGetModelCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic createSMTReasoningTactic()
  {
    SMTReasoningTacticImpl smtReasoningTactic = new SMTReasoningTacticImpl();
    return smtReasoningTactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTBuiltinTactic createSMTBuiltinTactic()
  {
    SMTBuiltinTacticImpl smtBuiltinTactic = new SMTBuiltinTacticImpl();
    return smtBuiltinTactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningCombinator createSMTReasoningCombinator()
  {
    SMTReasoningCombinatorImpl smtReasoningCombinator = new SMTReasoningCombinatorImpl();
    return smtReasoningCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTAndThenCombinator createSMTAndThenCombinator()
  {
    SMTAndThenCombinatorImpl smtAndThenCombinator = new SMTAndThenCombinatorImpl();
    return smtAndThenCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTOrElseCombinator createSMTOrElseCombinator()
  {
    SMTOrElseCombinatorImpl smtOrElseCombinator = new SMTOrElseCombinatorImpl();
    return smtOrElseCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTParOrCombinator createSMTParOrCombinator()
  {
    SMTParOrCombinatorImpl smtParOrCombinator = new SMTParOrCombinatorImpl();
    return smtParOrCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTParThenCombinator createSMTParThenCombinator()
  {
    SMTParThenCombinatorImpl smtParThenCombinator = new SMTParThenCombinatorImpl();
    return smtParThenCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTTryForCombinator createSMTTryForCombinator()
  {
    SMTTryForCombinatorImpl smtTryForCombinator = new SMTTryForCombinatorImpl();
    return smtTryForCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTIfCombinator createSMTIfCombinator()
  {
    SMTIfCombinatorImpl smtIfCombinator = new SMTIfCombinatorImpl();
    return smtIfCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTWhenCombinator createSMTWhenCombinator()
  {
    SMTWhenCombinatorImpl smtWhenCombinator = new SMTWhenCombinatorImpl();
    return smtWhenCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTFailIfCombinator createSMTFailIfCombinator()
  {
    SMTFailIfCombinatorImpl smtFailIfCombinator = new SMTFailIfCombinatorImpl();
    return smtFailIfCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTUsingParamCombinator createSMTUsingParamCombinator()
  {
    SMTUsingParamCombinatorImpl smtUsingParamCombinator = new SMTUsingParamCombinatorImpl();
    return smtUsingParamCombinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReasoningProbe createReasoningProbe()
  {
    ReasoningProbeImpl reasoningProbe = new ReasoningProbeImpl();
    return reasoningProbe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReasoningTacticParameter createReasoningTacticParameter()
  {
    ReasoningTacticParameterImpl reasoningTacticParameter = new ReasoningTacticParameterImpl();
    return reasoningTacticParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTResult createSMTResult()
  {
    SMTResultImpl smtResult = new SMTResultImpl();
    return smtResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTErrorResult createSMTErrorResult()
  {
    SMTErrorResultImpl smtErrorResult = new SMTErrorResultImpl();
    return smtErrorResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTUnsupportedResult createSMTUnsupportedResult()
  {
    SMTUnsupportedResultImpl smtUnsupportedResult = new SMTUnsupportedResultImpl();
    return smtUnsupportedResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTSatResult createSMTSatResult()
  {
    SMTSatResultImpl smtSatResult = new SMTSatResultImpl();
    return smtSatResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTModelResult createSMTModelResult()
  {
    SMTModelResultImpl smtModelResult = new SMTModelResultImpl();
    return smtModelResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTStatisticValue createSMTStatisticValue()
  {
    SMTStatisticValueImpl smtStatisticValue = new SMTStatisticValueImpl();
    return smtStatisticValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTStatisticIntValue createSMTStatisticIntValue()
  {
    SMTStatisticIntValueImpl smtStatisticIntValue = new SMTStatisticIntValueImpl();
    return smtStatisticIntValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTStatisticDoubleValue createSMTStatisticDoubleValue()
  {
    SMTStatisticDoubleValueImpl smtStatisticDoubleValue = new SMTStatisticDoubleValueImpl();
    return smtStatisticDoubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTStatisticsSection createSMTStatisticsSection()
  {
    SMTStatisticsSectionImpl smtStatisticsSection = new SMTStatisticsSectionImpl();
    return smtStatisticsSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmtLanguagePackage getSmtLanguagePackage()
  {
    return (SmtLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SmtLanguagePackage getPackage()
  {
    return SmtLanguagePackage.eINSTANCE;
  }

} //SmtLanguageFactoryImpl
