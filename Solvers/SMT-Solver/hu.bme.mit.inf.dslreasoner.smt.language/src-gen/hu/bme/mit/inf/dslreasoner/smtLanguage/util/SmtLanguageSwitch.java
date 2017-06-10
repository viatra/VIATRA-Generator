/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.util;

import hu.bme.mit.inf.dslreasoner.smtLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage
 * @generated
 */
public class SmtLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmtLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmtLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SmtLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SmtLanguagePackage.SMT_DOCUMENT:
      {
        SMTDocument smtDocument = (SMTDocument)theEObject;
        T result = caseSMTDocument(smtDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_INPUT:
      {
        SMTInput smtInput = (SMTInput)theEObject;
        T result = caseSMTInput(smtInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_OUTPUT:
      {
        SMTOutput smtOutput = (SMTOutput)theEObject;
        T result = caseSMTOutput(smtOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_OPTION:
      {
        SMTOption smtOption = (SMTOption)theEObject;
        T result = caseSMTOption(smtOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_TYPE:
      {
        SMTType smtType = (SMTType)theEObject;
        T result = caseSMTType(smtType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_ENUM_LITERAL:
      {
        SMTEnumLiteral smtEnumLiteral = (SMTEnumLiteral)theEObject;
        T result = caseSMTEnumLiteral(smtEnumLiteral);
        if (result == null) result = caseSMTSymbolicDeclaration(smtEnumLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_ENUMERATED_TYPE_DECLARATION:
      {
        SMTEnumeratedTypeDeclaration smtEnumeratedTypeDeclaration = (SMTEnumeratedTypeDeclaration)theEObject;
        T result = caseSMTEnumeratedTypeDeclaration(smtEnumeratedTypeDeclaration);
        if (result == null) result = caseSMTType(smtEnumeratedTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_SET_TYPE_DECLARATION:
      {
        SMTSetTypeDeclaration smtSetTypeDeclaration = (SMTSetTypeDeclaration)theEObject;
        T result = caseSMTSetTypeDeclaration(smtSetTypeDeclaration);
        if (result == null) result = caseSMTType(smtSetTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_TYPE_REFERENCE:
      {
        SMTTypeReference smtTypeReference = (SMTTypeReference)theEObject;
        T result = caseSMTTypeReference(smtTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_COMPLEX_TYPE_REFERENCE:
      {
        SMTComplexTypeReference smtComplexTypeReference = (SMTComplexTypeReference)theEObject;
        T result = caseSMTComplexTypeReference(smtComplexTypeReference);
        if (result == null) result = caseSMTTypeReference(smtComplexTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_PRIMITIVE_TYPE_REFERENCE:
      {
        SMTPrimitiveTypeReference smtPrimitiveTypeReference = (SMTPrimitiveTypeReference)theEObject;
        T result = caseSMTPrimitiveTypeReference(smtPrimitiveTypeReference);
        if (result == null) result = caseSMTTypeReference(smtPrimitiveTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_INT_TYPE_REFERENCE:
      {
        SMTIntTypeReference smtIntTypeReference = (SMTIntTypeReference)theEObject;
        T result = caseSMTIntTypeReference(smtIntTypeReference);
        if (result == null) result = caseSMTPrimitiveTypeReference(smtIntTypeReference);
        if (result == null) result = caseSMTTypeReference(smtIntTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_BOOL_TYPE_REFERENCE:
      {
        SMTBoolTypeReference smtBoolTypeReference = (SMTBoolTypeReference)theEObject;
        T result = caseSMTBoolTypeReference(smtBoolTypeReference);
        if (result == null) result = caseSMTPrimitiveTypeReference(smtBoolTypeReference);
        if (result == null) result = caseSMTTypeReference(smtBoolTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_REAL_TYPE_REFERENCE:
      {
        SMTRealTypeReference smtRealTypeReference = (SMTRealTypeReference)theEObject;
        T result = caseSMTRealTypeReference(smtRealTypeReference);
        if (result == null) result = caseSMTPrimitiveTypeReference(smtRealTypeReference);
        if (result == null) result = caseSMTTypeReference(smtRealTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_FUNCTION_DECLARATION:
      {
        SMTFunctionDeclaration smtFunctionDeclaration = (SMTFunctionDeclaration)theEObject;
        T result = caseSMTFunctionDeclaration(smtFunctionDeclaration);
        if (result == null) result = caseSMTSymbolicDeclaration(smtFunctionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_FUNCTION_DEFINITION:
      {
        SMTFunctionDefinition smtFunctionDefinition = (SMTFunctionDefinition)theEObject;
        T result = caseSMTFunctionDefinition(smtFunctionDefinition);
        if (result == null) result = caseSMTSymbolicDeclaration(smtFunctionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_TERM:
      {
        SMTTerm smtTerm = (SMTTerm)theEObject;
        T result = caseSMTTerm(smtTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_SYMBOLIC_DECLARATION:
      {
        SMTSymbolicDeclaration smtSymbolicDeclaration = (SMTSymbolicDeclaration)theEObject;
        T result = caseSMTSymbolicDeclaration(smtSymbolicDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_SYMBOLIC_VALUE:
      {
        SMTSymbolicValue smtSymbolicValue = (SMTSymbolicValue)theEObject;
        T result = caseSMTSymbolicValue(smtSymbolicValue);
        if (result == null) result = caseSMTTerm(smtSymbolicValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_ATOMIC_TERM:
      {
        SMTAtomicTerm smtAtomicTerm = (SMTAtomicTerm)theEObject;
        T result = caseSMTAtomicTerm(smtAtomicTerm);
        if (result == null) result = caseSMTTerm(smtAtomicTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_INT_LITERAL:
      {
        SMTIntLiteral smtIntLiteral = (SMTIntLiteral)theEObject;
        T result = caseSMTIntLiteral(smtIntLiteral);
        if (result == null) result = caseSMTAtomicTerm(smtIntLiteral);
        if (result == null) result = caseSMTTerm(smtIntLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_BOOL_LITERAL:
      {
        SMTBoolLiteral smtBoolLiteral = (SMTBoolLiteral)theEObject;
        T result = caseSMTBoolLiteral(smtBoolLiteral);
        if (result == null) result = caseSMTAtomicTerm(smtBoolLiteral);
        if (result == null) result = caseSMTTerm(smtBoolLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_REAL_LITERAL:
      {
        SMTRealLiteral smtRealLiteral = (SMTRealLiteral)theEObject;
        T result = caseSMTRealLiteral(smtRealLiteral);
        if (result == null) result = caseSMTAtomicTerm(smtRealLiteral);
        if (result == null) result = caseSMTTerm(smtRealLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_SORTED_VARIABLE:
      {
        SMTSortedVariable smtSortedVariable = (SMTSortedVariable)theEObject;
        T result = caseSMTSortedVariable(smtSortedVariable);
        if (result == null) result = caseSMTSymbolicDeclaration(smtSortedVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_QUANTIFIED_EXPRESSION:
      {
        SMTQuantifiedExpression smtQuantifiedExpression = (SMTQuantifiedExpression)theEObject;
        T result = caseSMTQuantifiedExpression(smtQuantifiedExpression);
        if (result == null) result = caseSMTTerm(smtQuantifiedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_EXISTS:
      {
        SMTExists smtExists = (SMTExists)theEObject;
        T result = caseSMTExists(smtExists);
        if (result == null) result = caseSMTQuantifiedExpression(smtExists);
        if (result == null) result = caseSMTTerm(smtExists);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_FORALL:
      {
        SMTForall smtForall = (SMTForall)theEObject;
        T result = caseSMTForall(smtForall);
        if (result == null) result = caseSMTQuantifiedExpression(smtForall);
        if (result == null) result = caseSMTTerm(smtForall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_BOOL_OPERATION:
      {
        SMTBoolOperation smtBoolOperation = (SMTBoolOperation)theEObject;
        T result = caseSMTBoolOperation(smtBoolOperation);
        if (result == null) result = caseSMTTerm(smtBoolOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_AND:
      {
        SMTAnd smtAnd = (SMTAnd)theEObject;
        T result = caseSMTAnd(smtAnd);
        if (result == null) result = caseSMTBoolOperation(smtAnd);
        if (result == null) result = caseSMTTerm(smtAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_OR:
      {
        SMTOr smtOr = (SMTOr)theEObject;
        T result = caseSMTOr(smtOr);
        if (result == null) result = caseSMTBoolOperation(smtOr);
        if (result == null) result = caseSMTTerm(smtOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_IMPL:
      {
        SMTImpl smtImpl = (SMTImpl)theEObject;
        T result = caseSMTImpl(smtImpl);
        if (result == null) result = caseSMTBoolOperation(smtImpl);
        if (result == null) result = caseSMTTerm(smtImpl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_NOT:
      {
        SMTNot smtNot = (SMTNot)theEObject;
        T result = caseSMTNot(smtNot);
        if (result == null) result = caseSMTBoolOperation(smtNot);
        if (result == null) result = caseSMTTerm(smtNot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_IFF:
      {
        SMTIff smtIff = (SMTIff)theEObject;
        T result = caseSMTIff(smtIff);
        if (result == null) result = caseSMTBoolOperation(smtIff);
        if (result == null) result = caseSMTTerm(smtIff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMTITE:
      {
        SMTITE smtite = (SMTITE)theEObject;
        T result = caseSMTITE(smtite);
        if (result == null) result = caseSMTTerm(smtite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_LET:
      {
        SMTLet smtLet = (SMTLet)theEObject;
        T result = caseSMTLet(smtLet);
        if (result == null) result = caseSMTTerm(smtLet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_INLINE_CONSTANT_DEFINITION:
      {
        SMTInlineConstantDefinition smtInlineConstantDefinition = (SMTInlineConstantDefinition)theEObject;
        T result = caseSMTInlineConstantDefinition(smtInlineConstantDefinition);
        if (result == null) result = caseSMTSymbolicDeclaration(smtInlineConstantDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_RELATION:
      {
        SMTRelation smtRelation = (SMTRelation)theEObject;
        T result = caseSMTRelation(smtRelation);
        if (result == null) result = caseSMTTerm(smtRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_EQUALS:
      {
        SMTEquals smtEquals = (SMTEquals)theEObject;
        T result = caseSMTEquals(smtEquals);
        if (result == null) result = caseSMTRelation(smtEquals);
        if (result == null) result = caseSMTTerm(smtEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_DISTINCT:
      {
        SMTDistinct smtDistinct = (SMTDistinct)theEObject;
        T result = caseSMTDistinct(smtDistinct);
        if (result == null) result = caseSMTRelation(smtDistinct);
        if (result == null) result = caseSMTTerm(smtDistinct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMTLT:
      {
        SMTLT smtlt = (SMTLT)theEObject;
        T result = caseSMTLT(smtlt);
        if (result == null) result = caseSMTRelation(smtlt);
        if (result == null) result = caseSMTTerm(smtlt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMTMT:
      {
        SMTMT smtmt = (SMTMT)theEObject;
        T result = caseSMTMT(smtmt);
        if (result == null) result = caseSMTRelation(smtmt);
        if (result == null) result = caseSMTTerm(smtmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMTLEQ:
      {
        SMTLEQ smtleq = (SMTLEQ)theEObject;
        T result = caseSMTLEQ(smtleq);
        if (result == null) result = caseSMTRelation(smtleq);
        if (result == null) result = caseSMTTerm(smtleq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMTMEQ:
      {
        SMTMEQ smtmeq = (SMTMEQ)theEObject;
        T result = caseSMTMEQ(smtmeq);
        if (result == null) result = caseSMTRelation(smtmeq);
        if (result == null) result = caseSMTTerm(smtmeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_INT_OPERATION:
      {
        SMTIntOperation smtIntOperation = (SMTIntOperation)theEObject;
        T result = caseSMTIntOperation(smtIntOperation);
        if (result == null) result = caseSMTTerm(smtIntOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_PLUS:
      {
        SMTPlus smtPlus = (SMTPlus)theEObject;
        T result = caseSMTPlus(smtPlus);
        if (result == null) result = caseSMTIntOperation(smtPlus);
        if (result == null) result = caseSMTTerm(smtPlus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_MINUS:
      {
        SMTMinus smtMinus = (SMTMinus)theEObject;
        T result = caseSMTMinus(smtMinus);
        if (result == null) result = caseSMTIntOperation(smtMinus);
        if (result == null) result = caseSMTTerm(smtMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_MULTIPLY:
      {
        SMTMultiply smtMultiply = (SMTMultiply)theEObject;
        T result = caseSMTMultiply(smtMultiply);
        if (result == null) result = caseSMTIntOperation(smtMultiply);
        if (result == null) result = caseSMTTerm(smtMultiply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_DIVISON:
      {
        SMTDivison smtDivison = (SMTDivison)theEObject;
        T result = caseSMTDivison(smtDivison);
        if (result == null) result = caseSMTIntOperation(smtDivison);
        if (result == null) result = caseSMTTerm(smtDivison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_DIV:
      {
        SMTDiv smtDiv = (SMTDiv)theEObject;
        T result = caseSMTDiv(smtDiv);
        if (result == null) result = caseSMTIntOperation(smtDiv);
        if (result == null) result = caseSMTTerm(smtDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_MOD:
      {
        SMTMod smtMod = (SMTMod)theEObject;
        T result = caseSMTMod(smtMod);
        if (result == null) result = caseSMTIntOperation(smtMod);
        if (result == null) result = caseSMTTerm(smtMod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_ASSERTION:
      {
        SMTAssertion smtAssertion = (SMTAssertion)theEObject;
        T result = caseSMTAssertion(smtAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_CARDINALITY_CONSTRAINT:
      {
        SMTCardinalityConstraint smtCardinalityConstraint = (SMTCardinalityConstraint)theEObject;
        T result = caseSMTCardinalityConstraint(smtCardinalityConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_SAT_COMMAND:
      {
        SMTSatCommand smtSatCommand = (SMTSatCommand)theEObject;
        T result = caseSMTSatCommand(smtSatCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_SIMPLE_SAT_COMMAND:
      {
        SMTSimpleSatCommand smtSimpleSatCommand = (SMTSimpleSatCommand)theEObject;
        T result = caseSMTSimpleSatCommand(smtSimpleSatCommand);
        if (result == null) result = caseSMTSatCommand(smtSimpleSatCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_COMPLEX_SAT_COMMAND:
      {
        SMTComplexSatCommand smtComplexSatCommand = (SMTComplexSatCommand)theEObject;
        T result = caseSMTComplexSatCommand(smtComplexSatCommand);
        if (result == null) result = caseSMTSatCommand(smtComplexSatCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_GET_MODEL_COMMAND:
      {
        SMTGetModelCommand smtGetModelCommand = (SMTGetModelCommand)theEObject;
        T result = caseSMTGetModelCommand(smtGetModelCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_REASONING_TACTIC:
      {
        SMTReasoningTactic smtReasoningTactic = (SMTReasoningTactic)theEObject;
        T result = caseSMTReasoningTactic(smtReasoningTactic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_BUILTIN_TACTIC:
      {
        SMTBuiltinTactic smtBuiltinTactic = (SMTBuiltinTactic)theEObject;
        T result = caseSMTBuiltinTactic(smtBuiltinTactic);
        if (result == null) result = caseSMTReasoningTactic(smtBuiltinTactic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_REASONING_COMBINATOR:
      {
        SMTReasoningCombinator smtReasoningCombinator = (SMTReasoningCombinator)theEObject;
        T result = caseSMTReasoningCombinator(smtReasoningCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtReasoningCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_AND_THEN_COMBINATOR:
      {
        SMTAndThenCombinator smtAndThenCombinator = (SMTAndThenCombinator)theEObject;
        T result = caseSMTAndThenCombinator(smtAndThenCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtAndThenCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtAndThenCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_OR_ELSE_COMBINATOR:
      {
        SMTOrElseCombinator smtOrElseCombinator = (SMTOrElseCombinator)theEObject;
        T result = caseSMTOrElseCombinator(smtOrElseCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtOrElseCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtOrElseCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_PAR_OR_COMBINATOR:
      {
        SMTParOrCombinator smtParOrCombinator = (SMTParOrCombinator)theEObject;
        T result = caseSMTParOrCombinator(smtParOrCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtParOrCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtParOrCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR:
      {
        SMTParThenCombinator smtParThenCombinator = (SMTParThenCombinator)theEObject;
        T result = caseSMTParThenCombinator(smtParThenCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtParThenCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtParThenCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR:
      {
        SMTTryForCombinator smtTryForCombinator = (SMTTryForCombinator)theEObject;
        T result = caseSMTTryForCombinator(smtTryForCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtTryForCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtTryForCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_IF_COMBINATOR:
      {
        SMTIfCombinator smtIfCombinator = (SMTIfCombinator)theEObject;
        T result = caseSMTIfCombinator(smtIfCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtIfCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtIfCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR:
      {
        SMTWhenCombinator smtWhenCombinator = (SMTWhenCombinator)theEObject;
        T result = caseSMTWhenCombinator(smtWhenCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtWhenCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtWhenCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR:
      {
        SMTFailIfCombinator smtFailIfCombinator = (SMTFailIfCombinator)theEObject;
        T result = caseSMTFailIfCombinator(smtFailIfCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtFailIfCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtFailIfCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_USING_PARAM_COMBINATOR:
      {
        SMTUsingParamCombinator smtUsingParamCombinator = (SMTUsingParamCombinator)theEObject;
        T result = caseSMTUsingParamCombinator(smtUsingParamCombinator);
        if (result == null) result = caseSMTReasoningCombinator(smtUsingParamCombinator);
        if (result == null) result = caseSMTReasoningTactic(smtUsingParamCombinator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.REASONING_PROBE:
      {
        ReasoningProbe reasoningProbe = (ReasoningProbe)theEObject;
        T result = caseReasoningProbe(reasoningProbe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.REASONING_TACTIC_PARAMETER:
      {
        ReasoningTacticParameter reasoningTacticParameter = (ReasoningTacticParameter)theEObject;
        T result = caseReasoningTacticParameter(reasoningTacticParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_RESULT:
      {
        SMTResult smtResult = (SMTResult)theEObject;
        T result = caseSMTResult(smtResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_ERROR_RESULT:
      {
        SMTErrorResult smtErrorResult = (SMTErrorResult)theEObject;
        T result = caseSMTErrorResult(smtErrorResult);
        if (result == null) result = caseSMTResult(smtErrorResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_UNSUPPORTED_RESULT:
      {
        SMTUnsupportedResult smtUnsupportedResult = (SMTUnsupportedResult)theEObject;
        T result = caseSMTUnsupportedResult(smtUnsupportedResult);
        if (result == null) result = caseSMTResult(smtUnsupportedResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_SAT_RESULT:
      {
        SMTSatResult smtSatResult = (SMTSatResult)theEObject;
        T result = caseSMTSatResult(smtSatResult);
        if (result == null) result = caseSMTResult(smtSatResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_MODEL_RESULT:
      {
        SMTModelResult smtModelResult = (SMTModelResult)theEObject;
        T result = caseSMTModelResult(smtModelResult);
        if (result == null) result = caseSMTResult(smtModelResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_STATISTIC_VALUE:
      {
        SMTStatisticValue smtStatisticValue = (SMTStatisticValue)theEObject;
        T result = caseSMTStatisticValue(smtStatisticValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_STATISTIC_INT_VALUE:
      {
        SMTStatisticIntValue smtStatisticIntValue = (SMTStatisticIntValue)theEObject;
        T result = caseSMTStatisticIntValue(smtStatisticIntValue);
        if (result == null) result = caseSMTStatisticValue(smtStatisticIntValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_STATISTIC_DOUBLE_VALUE:
      {
        SMTStatisticDoubleValue smtStatisticDoubleValue = (SMTStatisticDoubleValue)theEObject;
        T result = caseSMTStatisticDoubleValue(smtStatisticDoubleValue);
        if (result == null) result = caseSMTStatisticValue(smtStatisticDoubleValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmtLanguagePackage.SMT_STATISTICS_SECTION:
      {
        SMTStatisticsSection smtStatisticsSection = (SMTStatisticsSection)theEObject;
        T result = caseSMTStatisticsSection(smtStatisticsSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTDocument(SMTDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTInput(SMTInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTOutput(SMTOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTOption(SMTOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTType(SMTType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Enum Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTEnumLiteral(SMTEnumLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Enumerated Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Enumerated Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTEnumeratedTypeDeclaration(SMTEnumeratedTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Set Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Set Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTSetTypeDeclaration(SMTSetTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTTypeReference(SMTTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Complex Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Complex Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTComplexTypeReference(SMTComplexTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Primitive Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Primitive Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTPrimitiveTypeReference(SMTPrimitiveTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Int Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Int Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTIntTypeReference(SMTIntTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Bool Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Bool Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTBoolTypeReference(SMTBoolTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Real Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Real Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTRealTypeReference(SMTRealTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTFunctionDeclaration(SMTFunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTFunctionDefinition(SMTFunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTTerm(SMTTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Symbolic Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Symbolic Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTSymbolicDeclaration(SMTSymbolicDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Symbolic Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Symbolic Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTSymbolicValue(SMTSymbolicValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Atomic Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Atomic Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTAtomicTerm(SMTAtomicTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTIntLiteral(SMTIntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Bool Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTBoolLiteral(SMTBoolLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Real Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Real Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTRealLiteral(SMTRealLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Sorted Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Sorted Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTSortedVariable(SMTSortedVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Quantified Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Quantified Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTQuantifiedExpression(SMTQuantifiedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Exists</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Exists</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTExists(SMTExists object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Forall</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Forall</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTForall(SMTForall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Bool Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Bool Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTBoolOperation(SMTBoolOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTAnd(SMTAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTOr(SMTOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Impl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Impl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTImpl(SMTImpl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTNot(SMTNot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Iff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Iff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTIff(SMTIff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMTITE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMTITE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTITE(SMTITE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Let</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Let</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTLet(SMTLet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Inline Constant Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Inline Constant Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTInlineConstantDefinition(SMTInlineConstantDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTRelation(SMTRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTEquals(SMTEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Distinct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Distinct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTDistinct(SMTDistinct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMTLT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMTLT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTLT(SMTLT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMTMT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMTMT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTMT(SMTMT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMTLEQ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMTLEQ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTLEQ(SMTLEQ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMTMEQ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMTMEQ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTMEQ(SMTMEQ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Int Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Int Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTIntOperation(SMTIntOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTPlus(SMTPlus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTMinus(SMTMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Multiply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Multiply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTMultiply(SMTMultiply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Divison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Divison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTDivison(SMTDivison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTDiv(SMTDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Mod</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Mod</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTMod(SMTMod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTAssertion(SMTAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Cardinality Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Cardinality Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTCardinalityConstraint(SMTCardinalityConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Sat Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Sat Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTSatCommand(SMTSatCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Simple Sat Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Simple Sat Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTSimpleSatCommand(SMTSimpleSatCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Complex Sat Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Complex Sat Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTComplexSatCommand(SMTComplexSatCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Get Model Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Get Model Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTGetModelCommand(SMTGetModelCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Reasoning Tactic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Reasoning Tactic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTReasoningTactic(SMTReasoningTactic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Builtin Tactic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Builtin Tactic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTBuiltinTactic(SMTBuiltinTactic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Reasoning Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Reasoning Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTReasoningCombinator(SMTReasoningCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT And Then Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT And Then Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTAndThenCombinator(SMTAndThenCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Or Else Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Or Else Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTOrElseCombinator(SMTOrElseCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Par Or Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Par Or Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTParOrCombinator(SMTParOrCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Par Then Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Par Then Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTParThenCombinator(SMTParThenCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Try For Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Try For Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTTryForCombinator(SMTTryForCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT If Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT If Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTIfCombinator(SMTIfCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT When Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT When Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTWhenCombinator(SMTWhenCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Fail If Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Fail If Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTFailIfCombinator(SMTFailIfCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Using Param Combinator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Using Param Combinator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTUsingParamCombinator(SMTUsingParamCombinator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reasoning Probe</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reasoning Probe</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReasoningProbe(ReasoningProbe object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reasoning Tactic Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reasoning Tactic Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReasoningTacticParameter(ReasoningTacticParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTResult(SMTResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Error Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Error Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTErrorResult(SMTErrorResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Unsupported Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Unsupported Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTUnsupportedResult(SMTUnsupportedResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Sat Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Sat Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTSatResult(SMTSatResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Model Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Model Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTModelResult(SMTModelResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Statistic Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Statistic Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTStatisticValue(SMTStatisticValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Statistic Int Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Statistic Int Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTStatisticIntValue(SMTStatisticIntValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Statistic Double Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Statistic Double Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTStatisticDoubleValue(SMTStatisticDoubleValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SMT Statistics Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SMT Statistics Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSMTStatisticsSection(SMTStatisticsSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SmtLanguageSwitch
