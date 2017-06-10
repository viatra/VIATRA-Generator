/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.util;

import hu.bme.mit.inf.dslreasoner.smtLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage
 * @generated
 */
public class SmtLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmtLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmtLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SmtLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SmtLanguageSwitch<Adapter> modelSwitch =
    new SmtLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseSMTDocument(SMTDocument object)
      {
        return createSMTDocumentAdapter();
      }
      @Override
      public Adapter caseSMTInput(SMTInput object)
      {
        return createSMTInputAdapter();
      }
      @Override
      public Adapter caseSMTOutput(SMTOutput object)
      {
        return createSMTOutputAdapter();
      }
      @Override
      public Adapter caseSMTOption(SMTOption object)
      {
        return createSMTOptionAdapter();
      }
      @Override
      public Adapter caseSMTType(SMTType object)
      {
        return createSMTTypeAdapter();
      }
      @Override
      public Adapter caseSMTEnumLiteral(SMTEnumLiteral object)
      {
        return createSMTEnumLiteralAdapter();
      }
      @Override
      public Adapter caseSMTEnumeratedTypeDeclaration(SMTEnumeratedTypeDeclaration object)
      {
        return createSMTEnumeratedTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseSMTSetTypeDeclaration(SMTSetTypeDeclaration object)
      {
        return createSMTSetTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseSMTTypeReference(SMTTypeReference object)
      {
        return createSMTTypeReferenceAdapter();
      }
      @Override
      public Adapter caseSMTComplexTypeReference(SMTComplexTypeReference object)
      {
        return createSMTComplexTypeReferenceAdapter();
      }
      @Override
      public Adapter caseSMTPrimitiveTypeReference(SMTPrimitiveTypeReference object)
      {
        return createSMTPrimitiveTypeReferenceAdapter();
      }
      @Override
      public Adapter caseSMTIntTypeReference(SMTIntTypeReference object)
      {
        return createSMTIntTypeReferenceAdapter();
      }
      @Override
      public Adapter caseSMTBoolTypeReference(SMTBoolTypeReference object)
      {
        return createSMTBoolTypeReferenceAdapter();
      }
      @Override
      public Adapter caseSMTRealTypeReference(SMTRealTypeReference object)
      {
        return createSMTRealTypeReferenceAdapter();
      }
      @Override
      public Adapter caseSMTFunctionDeclaration(SMTFunctionDeclaration object)
      {
        return createSMTFunctionDeclarationAdapter();
      }
      @Override
      public Adapter caseSMTFunctionDefinition(SMTFunctionDefinition object)
      {
        return createSMTFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseSMTTerm(SMTTerm object)
      {
        return createSMTTermAdapter();
      }
      @Override
      public Adapter caseSMTSymbolicDeclaration(SMTSymbolicDeclaration object)
      {
        return createSMTSymbolicDeclarationAdapter();
      }
      @Override
      public Adapter caseSMTSymbolicValue(SMTSymbolicValue object)
      {
        return createSMTSymbolicValueAdapter();
      }
      @Override
      public Adapter caseSMTAtomicTerm(SMTAtomicTerm object)
      {
        return createSMTAtomicTermAdapter();
      }
      @Override
      public Adapter caseSMTIntLiteral(SMTIntLiteral object)
      {
        return createSMTIntLiteralAdapter();
      }
      @Override
      public Adapter caseSMTBoolLiteral(SMTBoolLiteral object)
      {
        return createSMTBoolLiteralAdapter();
      }
      @Override
      public Adapter caseSMTRealLiteral(SMTRealLiteral object)
      {
        return createSMTRealLiteralAdapter();
      }
      @Override
      public Adapter caseSMTSortedVariable(SMTSortedVariable object)
      {
        return createSMTSortedVariableAdapter();
      }
      @Override
      public Adapter caseSMTQuantifiedExpression(SMTQuantifiedExpression object)
      {
        return createSMTQuantifiedExpressionAdapter();
      }
      @Override
      public Adapter caseSMTExists(SMTExists object)
      {
        return createSMTExistsAdapter();
      }
      @Override
      public Adapter caseSMTForall(SMTForall object)
      {
        return createSMTForallAdapter();
      }
      @Override
      public Adapter caseSMTBoolOperation(SMTBoolOperation object)
      {
        return createSMTBoolOperationAdapter();
      }
      @Override
      public Adapter caseSMTAnd(SMTAnd object)
      {
        return createSMTAndAdapter();
      }
      @Override
      public Adapter caseSMTOr(SMTOr object)
      {
        return createSMTOrAdapter();
      }
      @Override
      public Adapter caseSMTImpl(SMTImpl object)
      {
        return createSMTImplAdapter();
      }
      @Override
      public Adapter caseSMTNot(SMTNot object)
      {
        return createSMTNotAdapter();
      }
      @Override
      public Adapter caseSMTIff(SMTIff object)
      {
        return createSMTIffAdapter();
      }
      @Override
      public Adapter caseSMTITE(SMTITE object)
      {
        return createSMTITEAdapter();
      }
      @Override
      public Adapter caseSMTLet(SMTLet object)
      {
        return createSMTLetAdapter();
      }
      @Override
      public Adapter caseSMTInlineConstantDefinition(SMTInlineConstantDefinition object)
      {
        return createSMTInlineConstantDefinitionAdapter();
      }
      @Override
      public Adapter caseSMTRelation(SMTRelation object)
      {
        return createSMTRelationAdapter();
      }
      @Override
      public Adapter caseSMTEquals(SMTEquals object)
      {
        return createSMTEqualsAdapter();
      }
      @Override
      public Adapter caseSMTDistinct(SMTDistinct object)
      {
        return createSMTDistinctAdapter();
      }
      @Override
      public Adapter caseSMTLT(SMTLT object)
      {
        return createSMTLTAdapter();
      }
      @Override
      public Adapter caseSMTMT(SMTMT object)
      {
        return createSMTMTAdapter();
      }
      @Override
      public Adapter caseSMTLEQ(SMTLEQ object)
      {
        return createSMTLEQAdapter();
      }
      @Override
      public Adapter caseSMTMEQ(SMTMEQ object)
      {
        return createSMTMEQAdapter();
      }
      @Override
      public Adapter caseSMTIntOperation(SMTIntOperation object)
      {
        return createSMTIntOperationAdapter();
      }
      @Override
      public Adapter caseSMTPlus(SMTPlus object)
      {
        return createSMTPlusAdapter();
      }
      @Override
      public Adapter caseSMTMinus(SMTMinus object)
      {
        return createSMTMinusAdapter();
      }
      @Override
      public Adapter caseSMTMultiply(SMTMultiply object)
      {
        return createSMTMultiplyAdapter();
      }
      @Override
      public Adapter caseSMTDivison(SMTDivison object)
      {
        return createSMTDivisonAdapter();
      }
      @Override
      public Adapter caseSMTDiv(SMTDiv object)
      {
        return createSMTDivAdapter();
      }
      @Override
      public Adapter caseSMTMod(SMTMod object)
      {
        return createSMTModAdapter();
      }
      @Override
      public Adapter caseSMTAssertion(SMTAssertion object)
      {
        return createSMTAssertionAdapter();
      }
      @Override
      public Adapter caseSMTCardinalityConstraint(SMTCardinalityConstraint object)
      {
        return createSMTCardinalityConstraintAdapter();
      }
      @Override
      public Adapter caseSMTSatCommand(SMTSatCommand object)
      {
        return createSMTSatCommandAdapter();
      }
      @Override
      public Adapter caseSMTSimpleSatCommand(SMTSimpleSatCommand object)
      {
        return createSMTSimpleSatCommandAdapter();
      }
      @Override
      public Adapter caseSMTComplexSatCommand(SMTComplexSatCommand object)
      {
        return createSMTComplexSatCommandAdapter();
      }
      @Override
      public Adapter caseSMTGetModelCommand(SMTGetModelCommand object)
      {
        return createSMTGetModelCommandAdapter();
      }
      @Override
      public Adapter caseSMTReasoningTactic(SMTReasoningTactic object)
      {
        return createSMTReasoningTacticAdapter();
      }
      @Override
      public Adapter caseSMTBuiltinTactic(SMTBuiltinTactic object)
      {
        return createSMTBuiltinTacticAdapter();
      }
      @Override
      public Adapter caseSMTReasoningCombinator(SMTReasoningCombinator object)
      {
        return createSMTReasoningCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTAndThenCombinator(SMTAndThenCombinator object)
      {
        return createSMTAndThenCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTOrElseCombinator(SMTOrElseCombinator object)
      {
        return createSMTOrElseCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTParOrCombinator(SMTParOrCombinator object)
      {
        return createSMTParOrCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTParThenCombinator(SMTParThenCombinator object)
      {
        return createSMTParThenCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTTryForCombinator(SMTTryForCombinator object)
      {
        return createSMTTryForCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTIfCombinator(SMTIfCombinator object)
      {
        return createSMTIfCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTWhenCombinator(SMTWhenCombinator object)
      {
        return createSMTWhenCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTFailIfCombinator(SMTFailIfCombinator object)
      {
        return createSMTFailIfCombinatorAdapter();
      }
      @Override
      public Adapter caseSMTUsingParamCombinator(SMTUsingParamCombinator object)
      {
        return createSMTUsingParamCombinatorAdapter();
      }
      @Override
      public Adapter caseReasoningProbe(ReasoningProbe object)
      {
        return createReasoningProbeAdapter();
      }
      @Override
      public Adapter caseReasoningTacticParameter(ReasoningTacticParameter object)
      {
        return createReasoningTacticParameterAdapter();
      }
      @Override
      public Adapter caseSMTResult(SMTResult object)
      {
        return createSMTResultAdapter();
      }
      @Override
      public Adapter caseSMTErrorResult(SMTErrorResult object)
      {
        return createSMTErrorResultAdapter();
      }
      @Override
      public Adapter caseSMTUnsupportedResult(SMTUnsupportedResult object)
      {
        return createSMTUnsupportedResultAdapter();
      }
      @Override
      public Adapter caseSMTSatResult(SMTSatResult object)
      {
        return createSMTSatResultAdapter();
      }
      @Override
      public Adapter caseSMTModelResult(SMTModelResult object)
      {
        return createSMTModelResultAdapter();
      }
      @Override
      public Adapter caseSMTStatisticValue(SMTStatisticValue object)
      {
        return createSMTStatisticValueAdapter();
      }
      @Override
      public Adapter caseSMTStatisticIntValue(SMTStatisticIntValue object)
      {
        return createSMTStatisticIntValueAdapter();
      }
      @Override
      public Adapter caseSMTStatisticDoubleValue(SMTStatisticDoubleValue object)
      {
        return createSMTStatisticDoubleValueAdapter();
      }
      @Override
      public Adapter caseSMTStatisticsSection(SMTStatisticsSection object)
      {
        return createSMTStatisticsSectionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument <em>SMT Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
   * @generated
   */
  public Adapter createSMTDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput <em>SMT Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
   * @generated
   */
  public Adapter createSMTInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput <em>SMT Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput
   * @generated
   */
  public Adapter createSMTOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption <em>SMT Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption
   * @generated
   */
  public Adapter createSMTOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType <em>SMT Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType
   * @generated
   */
  public Adapter createSMTTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral <em>SMT Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral
   * @generated
   */
  public Adapter createSMTEnumLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration <em>SMT Enumerated Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration
   * @generated
   */
  public Adapter createSMTEnumeratedTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSetTypeDeclaration <em>SMT Set Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSetTypeDeclaration
   * @generated
   */
  public Adapter createSMTSetTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTypeReference <em>SMT Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTypeReference
   * @generated
   */
  public Adapter createSMTTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference <em>SMT Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference
   * @generated
   */
  public Adapter createSMTComplexTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPrimitiveTypeReference <em>SMT Primitive Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPrimitiveTypeReference
   * @generated
   */
  public Adapter createSMTPrimitiveTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference <em>SMT Int Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference
   * @generated
   */
  public Adapter createSMTIntTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference <em>SMT Bool Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference
   * @generated
   */
  public Adapter createSMTBoolTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference <em>SMT Real Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference
   * @generated
   */
  public Adapter createSMTRealTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration <em>SMT Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration
   * @generated
   */
  public Adapter createSMTFunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition <em>SMT Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition
   * @generated
   */
  public Adapter createSMTFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm <em>SMT Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm
   * @generated
   */
  public Adapter createSMTTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration <em>SMT Symbolic Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration
   * @generated
   */
  public Adapter createSMTSymbolicDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue <em>SMT Symbolic Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue
   * @generated
   */
  public Adapter createSMTSymbolicValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAtomicTerm <em>SMT Atomic Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAtomicTerm
   * @generated
   */
  public Adapter createSMTAtomicTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral <em>SMT Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral
   * @generated
   */
  public Adapter createSMTIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral <em>SMT Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral
   * @generated
   */
  public Adapter createSMTBoolLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral <em>SMT Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral
   * @generated
   */
  public Adapter createSMTRealLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable <em>SMT Sorted Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable
   * @generated
   */
  public Adapter createSMTSortedVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression <em>SMT Quantified Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression
   * @generated
   */
  public Adapter createSMTQuantifiedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTExists <em>SMT Exists</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTExists
   * @generated
   */
  public Adapter createSMTExistsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTForall <em>SMT Forall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTForall
   * @generated
   */
  public Adapter createSMTForallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolOperation <em>SMT Bool Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolOperation
   * @generated
   */
  public Adapter createSMTBoolOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd <em>SMT And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd
   * @generated
   */
  public Adapter createSMTAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr <em>SMT Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr
   * @generated
   */
  public Adapter createSMTOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl <em>SMT Impl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl
   * @generated
   */
  public Adapter createSMTImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTNot <em>SMT Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTNot
   * @generated
   */
  public Adapter createSMTNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff <em>SMT Iff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff
   * @generated
   */
  public Adapter createSMTIffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE <em>SMTITE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE
   * @generated
   */
  public Adapter createSMTITEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet <em>SMT Let</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet
   * @generated
   */
  public Adapter createSMTLetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition <em>SMT Inline Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition
   * @generated
   */
  public Adapter createSMTInlineConstantDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRelation <em>SMT Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRelation
   * @generated
   */
  public Adapter createSMTRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals <em>SMT Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals
   * @generated
   */
  public Adapter createSMTEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDistinct <em>SMT Distinct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDistinct
   * @generated
   */
  public Adapter createSMTDistinctAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT <em>SMTLT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT
   * @generated
   */
  public Adapter createSMTLTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT <em>SMTMT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT
   * @generated
   */
  public Adapter createSMTMTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ <em>SMTLEQ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ
   * @generated
   */
  public Adapter createSMTLEQAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ <em>SMTMEQ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ
   * @generated
   */
  public Adapter createSMTMEQAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation <em>SMT Int Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation
   * @generated
   */
  public Adapter createSMTIntOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPlus <em>SMT Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPlus
   * @generated
   */
  public Adapter createSMTPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMinus <em>SMT Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMinus
   * @generated
   */
  public Adapter createSMTMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMultiply <em>SMT Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMultiply
   * @generated
   */
  public Adapter createSMTMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDivison <em>SMT Divison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDivison
   * @generated
   */
  public Adapter createSMTDivisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDiv <em>SMT Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDiv
   * @generated
   */
  public Adapter createSMTDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMod <em>SMT Mod</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMod
   * @generated
   */
  public Adapter createSMTModAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion <em>SMT Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion
   * @generated
   */
  public Adapter createSMTAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint <em>SMT Cardinality Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint
   * @generated
   */
  public Adapter createSMTCardinalityConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatCommand <em>SMT Sat Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatCommand
   * @generated
   */
  public Adapter createSMTSatCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSimpleSatCommand <em>SMT Simple Sat Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSimpleSatCommand
   * @generated
   */
  public Adapter createSMTSimpleSatCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand <em>SMT Complex Sat Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand
   * @generated
   */
  public Adapter createSMTComplexSatCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTGetModelCommand <em>SMT Get Model Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTGetModelCommand
   * @generated
   */
  public Adapter createSMTGetModelCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic <em>SMT Reasoning Tactic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic
   * @generated
   */
  public Adapter createSMTReasoningTacticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBuiltinTactic <em>SMT Builtin Tactic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBuiltinTactic
   * @generated
   */
  public Adapter createSMTBuiltinTacticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningCombinator <em>SMT Reasoning Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningCombinator
   * @generated
   */
  public Adapter createSMTReasoningCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator <em>SMT And Then Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator
   * @generated
   */
  public Adapter createSMTAndThenCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator <em>SMT Or Else Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator
   * @generated
   */
  public Adapter createSMTOrElseCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParOrCombinator <em>SMT Par Or Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParOrCombinator
   * @generated
   */
  public Adapter createSMTParOrCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator <em>SMT Par Then Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator
   * @generated
   */
  public Adapter createSMTParThenCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator <em>SMT Try For Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator
   * @generated
   */
  public Adapter createSMTTryForCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator <em>SMT If Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator
   * @generated
   */
  public Adapter createSMTIfCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator <em>SMT When Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator
   * @generated
   */
  public Adapter createSMTWhenCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator <em>SMT Fail If Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator
   * @generated
   */
  public Adapter createSMTFailIfCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator <em>SMT Using Param Combinator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator
   * @generated
   */
  public Adapter createSMTUsingParamCombinatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe <em>Reasoning Probe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe
   * @generated
   */
  public Adapter createReasoningProbeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter <em>Reasoning Tactic Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter
   * @generated
   */
  public Adapter createReasoningTacticParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTResult <em>SMT Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTResult
   * @generated
   */
  public Adapter createSMTResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult <em>SMT Error Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult
   * @generated
   */
  public Adapter createSMTErrorResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult <em>SMT Unsupported Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult
   * @generated
   */
  public Adapter createSMTUnsupportedResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult <em>SMT Sat Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult
   * @generated
   */
  public Adapter createSMTSatResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult <em>SMT Model Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult
   * @generated
   */
  public Adapter createSMTModelResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue <em>SMT Statistic Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue
   * @generated
   */
  public Adapter createSMTStatisticValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue <em>SMT Statistic Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue
   * @generated
   */
  public Adapter createSMTStatisticIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue <em>SMT Statistic Double Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue
   * @generated
   */
  public Adapter createSMTStatisticDoubleValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection <em>SMT Statistics Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection
   * @generated
   */
  public Adapter createSMTStatisticsSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SmtLanguageAdapterFactory
