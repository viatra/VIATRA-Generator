/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe;
import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAtomicTerm;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolOperation;
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
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet;
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
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPrimitiveTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRelation;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSetTypeDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSimpleSatCommand;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTypeReference;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguageFactory;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmtLanguagePackageImpl extends EPackageImpl implements SmtLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtEnumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtEnumeratedTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtSetTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtComplexTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtPrimitiveTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtIntTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtBoolTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtRealTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtFunctionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtFunctionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtSymbolicDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtSymbolicValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtAtomicTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtIntLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtBoolLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtRealLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtSortedVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtQuantifiedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtExistsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtForallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtBoolOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtImplEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtNotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtIffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtiteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtLetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtInlineConstantDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtEqualsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtDistinctEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtltEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtleqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtmeqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtIntOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtPlusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtMinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtMultiplyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtDivisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtDivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtModEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtCardinalityConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtSatCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtSimpleSatCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtComplexSatCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtGetModelCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtReasoningTacticEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtBuiltinTacticEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtReasoningCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtAndThenCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtOrElseCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtParOrCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtParThenCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtTryForCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtIfCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtWhenCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtFailIfCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtUsingParamCombinatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reasoningProbeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reasoningTacticParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtErrorResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtUnsupportedResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtSatResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtModelResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtStatisticValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtStatisticIntValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtStatisticDoubleValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smtStatisticsSectionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SmtLanguagePackageImpl()
  {
    super(eNS_URI, SmtLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SmtLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SmtLanguagePackage init()
  {
    if (isInited) return (SmtLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(SmtLanguagePackage.eNS_URI);

    // Obtain or create and register package
    SmtLanguagePackageImpl theSmtLanguagePackage = (SmtLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SmtLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SmtLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSmtLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theSmtLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSmtLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SmtLanguagePackage.eNS_URI, theSmtLanguagePackage);
    return theSmtLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTDocument()
  {
    return smtDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTDocument_Input()
  {
    return (EReference)smtDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTDocument_Output()
  {
    return (EReference)smtDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTInput()
  {
    return smtInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInput_Options()
  {
    return (EReference)smtInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInput_TypeDeclarations()
  {
    return (EReference)smtInputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInput_FunctionDeclarations()
  {
    return (EReference)smtInputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInput_FunctionDefinition()
  {
    return (EReference)smtInputEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInput_Assertions()
  {
    return (EReference)smtInputEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInput_SatCommand()
  {
    return (EReference)smtInputEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInput_GetModelCommand()
  {
    return (EReference)smtInputEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTOutput()
  {
    return smtOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTOutput_SatResult()
  {
    return (EReference)smtOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTOutput_GetModelResult()
  {
    return (EReference)smtOutputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTOutput_Statistics()
  {
    return (EReference)smtOutputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTOption()
  {
    return smtOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTOption_Name()
  {
    return (EAttribute)smtOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTOption_Value()
  {
    return (EReference)smtOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTType()
  {
    return smtTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTType_Name()
  {
    return (EAttribute)smtTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTEnumLiteral()
  {
    return smtEnumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTEnumeratedTypeDeclaration()
  {
    return smtEnumeratedTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTEnumeratedTypeDeclaration_Elements()
  {
    return (EReference)smtEnumeratedTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTSetTypeDeclaration()
  {
    return smtSetTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTTypeReference()
  {
    return smtTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTComplexTypeReference()
  {
    return smtComplexTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTComplexTypeReference_Referred()
  {
    return (EReference)smtComplexTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTPrimitiveTypeReference()
  {
    return smtPrimitiveTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTIntTypeReference()
  {
    return smtIntTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTBoolTypeReference()
  {
    return smtBoolTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTRealTypeReference()
  {
    return smtRealTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTFunctionDeclaration()
  {
    return smtFunctionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTFunctionDeclaration_Parameters()
  {
    return (EReference)smtFunctionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTFunctionDeclaration_Range()
  {
    return (EReference)smtFunctionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTFunctionDefinition()
  {
    return smtFunctionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTFunctionDefinition_Parameters()
  {
    return (EReference)smtFunctionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTFunctionDefinition_Range()
  {
    return (EReference)smtFunctionDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTFunctionDefinition_Value()
  {
    return (EReference)smtFunctionDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTTerm()
  {
    return smtTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTSymbolicDeclaration()
  {
    return smtSymbolicDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTSymbolicDeclaration_Name()
  {
    return (EAttribute)smtSymbolicDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTSymbolicValue()
  {
    return smtSymbolicValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTSymbolicValue_SymbolicReference()
  {
    return (EReference)smtSymbolicValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTSymbolicValue_ParameterSubstitutions()
  {
    return (EReference)smtSymbolicValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTAtomicTerm()
  {
    return smtAtomicTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTIntLiteral()
  {
    return smtIntLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTIntLiteral_Value()
  {
    return (EAttribute)smtIntLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTBoolLiteral()
  {
    return smtBoolLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTBoolLiteral_Value()
  {
    return (EAttribute)smtBoolLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTRealLiteral()
  {
    return smtRealLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTRealLiteral_Value()
  {
    return (EAttribute)smtRealLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTSortedVariable()
  {
    return smtSortedVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTSortedVariable_Range()
  {
    return (EReference)smtSortedVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTQuantifiedExpression()
  {
    return smtQuantifiedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTQuantifiedExpression_QuantifiedVariables()
  {
    return (EReference)smtQuantifiedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTQuantifiedExpression_Expression()
  {
    return (EReference)smtQuantifiedExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTQuantifiedExpression_Pattern()
  {
    return (EReference)smtQuantifiedExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTExists()
  {
    return smtExistsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTForall()
  {
    return smtForallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTBoolOperation()
  {
    return smtBoolOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTAnd()
  {
    return smtAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTAnd_Operands()
  {
    return (EReference)smtAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTOr()
  {
    return smtOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTOr_Operands()
  {
    return (EReference)smtOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTImpl()
  {
    return smtImplEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTImpl_LeftOperand()
  {
    return (EReference)smtImplEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTImpl_RightOperand()
  {
    return (EReference)smtImplEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTNot()
  {
    return smtNotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTNot_Operand()
  {
    return (EReference)smtNotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTIff()
  {
    return smtIffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTIff_LeftOperand()
  {
    return (EReference)smtIffEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTIff_RightOperand()
  {
    return (EReference)smtIffEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTITE()
  {
    return smtiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTITE_Condition()
  {
    return (EReference)smtiteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTITE_If()
  {
    return (EReference)smtiteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTITE_Else()
  {
    return (EReference)smtiteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTLet()
  {
    return smtLetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTLet_InlineConstantDefinitions()
  {
    return (EReference)smtLetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTLet_Term()
  {
    return (EReference)smtLetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTInlineConstantDefinition()
  {
    return smtInlineConstantDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTInlineConstantDefinition_Definition()
  {
    return (EReference)smtInlineConstantDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTRelation()
  {
    return smtRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTEquals()
  {
    return smtEqualsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTEquals_LeftOperand()
  {
    return (EReference)smtEqualsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTEquals_RightOperand()
  {
    return (EReference)smtEqualsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTDistinct()
  {
    return smtDistinctEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTDistinct_Operands()
  {
    return (EReference)smtDistinctEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTLT()
  {
    return smtltEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTLT_LeftOperand()
  {
    return (EReference)smtltEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTLT_RightOperand()
  {
    return (EReference)smtltEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTMT()
  {
    return smtmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTMT_LeftOperand()
  {
    return (EReference)smtmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTMT_RightOperand()
  {
    return (EReference)smtmtEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTLEQ()
  {
    return smtleqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTLEQ_LeftOperand()
  {
    return (EReference)smtleqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTLEQ_RightOperand()
  {
    return (EReference)smtleqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTMEQ()
  {
    return smtmeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTMEQ_LeftOperand()
  {
    return (EReference)smtmeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTMEQ_RightOperand()
  {
    return (EReference)smtmeqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTIntOperation()
  {
    return smtIntOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTIntOperation_LeftOperand()
  {
    return (EReference)smtIntOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTIntOperation_RightOperand()
  {
    return (EReference)smtIntOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTPlus()
  {
    return smtPlusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTMinus()
  {
    return smtMinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTMultiply()
  {
    return smtMultiplyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTDivison()
  {
    return smtDivisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTDiv()
  {
    return smtDivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTMod()
  {
    return smtModEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTAssertion()
  {
    return smtAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTAssertion_Value()
  {
    return (EReference)smtAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTCardinalityConstraint()
  {
    return smtCardinalityConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTCardinalityConstraint_Type()
  {
    return (EReference)smtCardinalityConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTCardinalityConstraint_Elements()
  {
    return (EReference)smtCardinalityConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTSatCommand()
  {
    return smtSatCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTSimpleSatCommand()
  {
    return smtSimpleSatCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTComplexSatCommand()
  {
    return smtComplexSatCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTComplexSatCommand_Method()
  {
    return (EReference)smtComplexSatCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTGetModelCommand()
  {
    return smtGetModelCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTReasoningTactic()
  {
    return smtReasoningTacticEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTBuiltinTactic()
  {
    return smtBuiltinTacticEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTBuiltinTactic_Name()
  {
    return (EAttribute)smtBuiltinTacticEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTReasoningCombinator()
  {
    return smtReasoningCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTAndThenCombinator()
  {
    return smtAndThenCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTAndThenCombinator_Tactics()
  {
    return (EReference)smtAndThenCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTOrElseCombinator()
  {
    return smtOrElseCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTOrElseCombinator_Tactics()
  {
    return (EReference)smtOrElseCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTParOrCombinator()
  {
    return smtParOrCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTParOrCombinator_Tactics()
  {
    return (EReference)smtParOrCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTParThenCombinator()
  {
    return smtParThenCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTParThenCombinator_PreProcessingTactic()
  {
    return (EReference)smtParThenCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTParThenCombinator_ParalellyPostpricessingTactic()
  {
    return (EReference)smtParThenCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTTryForCombinator()
  {
    return smtTryForCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTTryForCombinator_Tactic()
  {
    return (EReference)smtTryForCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTTryForCombinator_Time()
  {
    return (EAttribute)smtTryForCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTIfCombinator()
  {
    return smtIfCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTIfCombinator_Probe()
  {
    return (EReference)smtIfCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTIfCombinator_IfTactic()
  {
    return (EReference)smtIfCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTIfCombinator_ElseTactic()
  {
    return (EReference)smtIfCombinatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTWhenCombinator()
  {
    return smtWhenCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTWhenCombinator_Probe()
  {
    return (EReference)smtWhenCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTWhenCombinator_Tactic()
  {
    return (EReference)smtWhenCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTFailIfCombinator()
  {
    return smtFailIfCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTFailIfCombinator_Probe()
  {
    return (EReference)smtFailIfCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTUsingParamCombinator()
  {
    return smtUsingParamCombinatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTUsingParamCombinator_Tactic()
  {
    return (EReference)smtUsingParamCombinatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTUsingParamCombinator_Parameters()
  {
    return (EReference)smtUsingParamCombinatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReasoningProbe()
  {
    return reasoningProbeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReasoningProbe_Name()
  {
    return (EAttribute)reasoningProbeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReasoningTacticParameter()
  {
    return reasoningTacticParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReasoningTacticParameter_Name()
  {
    return (EAttribute)reasoningTacticParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReasoningTacticParameter_Value()
  {
    return (EReference)reasoningTacticParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTResult()
  {
    return smtResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTErrorResult()
  {
    return smtErrorResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTErrorResult_Message()
  {
    return (EAttribute)smtErrorResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTUnsupportedResult()
  {
    return smtUnsupportedResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTUnsupportedResult_Command()
  {
    return (EAttribute)smtUnsupportedResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTSatResult()
  {
    return smtSatResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTSatResult_Sat()
  {
    return (EAttribute)smtSatResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTSatResult_Unsat()
  {
    return (EAttribute)smtSatResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTSatResult_Unknown()
  {
    return (EAttribute)smtSatResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTModelResult()
  {
    return smtModelResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTModelResult_NewFunctionDeclarations()
  {
    return (EReference)smtModelResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTModelResult_TypeDefinitions()
  {
    return (EReference)smtModelResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTModelResult_NewFunctionDefinitions()
  {
    return (EReference)smtModelResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTStatisticValue()
  {
    return smtStatisticValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTStatisticValue_Name()
  {
    return (EAttribute)smtStatisticValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTStatisticIntValue()
  {
    return smtStatisticIntValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTStatisticIntValue_Value()
  {
    return (EAttribute)smtStatisticIntValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTStatisticDoubleValue()
  {
    return smtStatisticDoubleValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSMTStatisticDoubleValue_Value()
  {
    return (EAttribute)smtStatisticDoubleValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSMTStatisticsSection()
  {
    return smtStatisticsSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSMTStatisticsSection_Values()
  {
    return (EReference)smtStatisticsSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmtLanguageFactory getSmtLanguageFactory()
  {
    return (SmtLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    smtDocumentEClass = createEClass(SMT_DOCUMENT);
    createEReference(smtDocumentEClass, SMT_DOCUMENT__INPUT);
    createEReference(smtDocumentEClass, SMT_DOCUMENT__OUTPUT);

    smtInputEClass = createEClass(SMT_INPUT);
    createEReference(smtInputEClass, SMT_INPUT__OPTIONS);
    createEReference(smtInputEClass, SMT_INPUT__TYPE_DECLARATIONS);
    createEReference(smtInputEClass, SMT_INPUT__FUNCTION_DECLARATIONS);
    createEReference(smtInputEClass, SMT_INPUT__FUNCTION_DEFINITION);
    createEReference(smtInputEClass, SMT_INPUT__ASSERTIONS);
    createEReference(smtInputEClass, SMT_INPUT__SAT_COMMAND);
    createEReference(smtInputEClass, SMT_INPUT__GET_MODEL_COMMAND);

    smtOutputEClass = createEClass(SMT_OUTPUT);
    createEReference(smtOutputEClass, SMT_OUTPUT__SAT_RESULT);
    createEReference(smtOutputEClass, SMT_OUTPUT__GET_MODEL_RESULT);
    createEReference(smtOutputEClass, SMT_OUTPUT__STATISTICS);

    smtOptionEClass = createEClass(SMT_OPTION);
    createEAttribute(smtOptionEClass, SMT_OPTION__NAME);
    createEReference(smtOptionEClass, SMT_OPTION__VALUE);

    smtTypeEClass = createEClass(SMT_TYPE);
    createEAttribute(smtTypeEClass, SMT_TYPE__NAME);

    smtEnumLiteralEClass = createEClass(SMT_ENUM_LITERAL);

    smtEnumeratedTypeDeclarationEClass = createEClass(SMT_ENUMERATED_TYPE_DECLARATION);
    createEReference(smtEnumeratedTypeDeclarationEClass, SMT_ENUMERATED_TYPE_DECLARATION__ELEMENTS);

    smtSetTypeDeclarationEClass = createEClass(SMT_SET_TYPE_DECLARATION);

    smtTypeReferenceEClass = createEClass(SMT_TYPE_REFERENCE);

    smtComplexTypeReferenceEClass = createEClass(SMT_COMPLEX_TYPE_REFERENCE);
    createEReference(smtComplexTypeReferenceEClass, SMT_COMPLEX_TYPE_REFERENCE__REFERRED);

    smtPrimitiveTypeReferenceEClass = createEClass(SMT_PRIMITIVE_TYPE_REFERENCE);

    smtIntTypeReferenceEClass = createEClass(SMT_INT_TYPE_REFERENCE);

    smtBoolTypeReferenceEClass = createEClass(SMT_BOOL_TYPE_REFERENCE);

    smtRealTypeReferenceEClass = createEClass(SMT_REAL_TYPE_REFERENCE);

    smtFunctionDeclarationEClass = createEClass(SMT_FUNCTION_DECLARATION);
    createEReference(smtFunctionDeclarationEClass, SMT_FUNCTION_DECLARATION__PARAMETERS);
    createEReference(smtFunctionDeclarationEClass, SMT_FUNCTION_DECLARATION__RANGE);

    smtFunctionDefinitionEClass = createEClass(SMT_FUNCTION_DEFINITION);
    createEReference(smtFunctionDefinitionEClass, SMT_FUNCTION_DEFINITION__PARAMETERS);
    createEReference(smtFunctionDefinitionEClass, SMT_FUNCTION_DEFINITION__RANGE);
    createEReference(smtFunctionDefinitionEClass, SMT_FUNCTION_DEFINITION__VALUE);

    smtTermEClass = createEClass(SMT_TERM);

    smtSymbolicDeclarationEClass = createEClass(SMT_SYMBOLIC_DECLARATION);
    createEAttribute(smtSymbolicDeclarationEClass, SMT_SYMBOLIC_DECLARATION__NAME);

    smtSymbolicValueEClass = createEClass(SMT_SYMBOLIC_VALUE);
    createEReference(smtSymbolicValueEClass, SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE);
    createEReference(smtSymbolicValueEClass, SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS);

    smtAtomicTermEClass = createEClass(SMT_ATOMIC_TERM);

    smtIntLiteralEClass = createEClass(SMT_INT_LITERAL);
    createEAttribute(smtIntLiteralEClass, SMT_INT_LITERAL__VALUE);

    smtBoolLiteralEClass = createEClass(SMT_BOOL_LITERAL);
    createEAttribute(smtBoolLiteralEClass, SMT_BOOL_LITERAL__VALUE);

    smtRealLiteralEClass = createEClass(SMT_REAL_LITERAL);
    createEAttribute(smtRealLiteralEClass, SMT_REAL_LITERAL__VALUE);

    smtSortedVariableEClass = createEClass(SMT_SORTED_VARIABLE);
    createEReference(smtSortedVariableEClass, SMT_SORTED_VARIABLE__RANGE);

    smtQuantifiedExpressionEClass = createEClass(SMT_QUANTIFIED_EXPRESSION);
    createEReference(smtQuantifiedExpressionEClass, SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES);
    createEReference(smtQuantifiedExpressionEClass, SMT_QUANTIFIED_EXPRESSION__EXPRESSION);
    createEReference(smtQuantifiedExpressionEClass, SMT_QUANTIFIED_EXPRESSION__PATTERN);

    smtExistsEClass = createEClass(SMT_EXISTS);

    smtForallEClass = createEClass(SMT_FORALL);

    smtBoolOperationEClass = createEClass(SMT_BOOL_OPERATION);

    smtAndEClass = createEClass(SMT_AND);
    createEReference(smtAndEClass, SMT_AND__OPERANDS);

    smtOrEClass = createEClass(SMT_OR);
    createEReference(smtOrEClass, SMT_OR__OPERANDS);

    smtImplEClass = createEClass(SMT_IMPL);
    createEReference(smtImplEClass, SMT_IMPL__LEFT_OPERAND);
    createEReference(smtImplEClass, SMT_IMPL__RIGHT_OPERAND);

    smtNotEClass = createEClass(SMT_NOT);
    createEReference(smtNotEClass, SMT_NOT__OPERAND);

    smtIffEClass = createEClass(SMT_IFF);
    createEReference(smtIffEClass, SMT_IFF__LEFT_OPERAND);
    createEReference(smtIffEClass, SMT_IFF__RIGHT_OPERAND);

    smtiteEClass = createEClass(SMTITE);
    createEReference(smtiteEClass, SMTITE__CONDITION);
    createEReference(smtiteEClass, SMTITE__IF);
    createEReference(smtiteEClass, SMTITE__ELSE);

    smtLetEClass = createEClass(SMT_LET);
    createEReference(smtLetEClass, SMT_LET__INLINE_CONSTANT_DEFINITIONS);
    createEReference(smtLetEClass, SMT_LET__TERM);

    smtInlineConstantDefinitionEClass = createEClass(SMT_INLINE_CONSTANT_DEFINITION);
    createEReference(smtInlineConstantDefinitionEClass, SMT_INLINE_CONSTANT_DEFINITION__DEFINITION);

    smtRelationEClass = createEClass(SMT_RELATION);

    smtEqualsEClass = createEClass(SMT_EQUALS);
    createEReference(smtEqualsEClass, SMT_EQUALS__LEFT_OPERAND);
    createEReference(smtEqualsEClass, SMT_EQUALS__RIGHT_OPERAND);

    smtDistinctEClass = createEClass(SMT_DISTINCT);
    createEReference(smtDistinctEClass, SMT_DISTINCT__OPERANDS);

    smtltEClass = createEClass(SMTLT);
    createEReference(smtltEClass, SMTLT__LEFT_OPERAND);
    createEReference(smtltEClass, SMTLT__RIGHT_OPERAND);

    smtmtEClass = createEClass(SMTMT);
    createEReference(smtmtEClass, SMTMT__LEFT_OPERAND);
    createEReference(smtmtEClass, SMTMT__RIGHT_OPERAND);

    smtleqEClass = createEClass(SMTLEQ);
    createEReference(smtleqEClass, SMTLEQ__LEFT_OPERAND);
    createEReference(smtleqEClass, SMTLEQ__RIGHT_OPERAND);

    smtmeqEClass = createEClass(SMTMEQ);
    createEReference(smtmeqEClass, SMTMEQ__LEFT_OPERAND);
    createEReference(smtmeqEClass, SMTMEQ__RIGHT_OPERAND);

    smtIntOperationEClass = createEClass(SMT_INT_OPERATION);
    createEReference(smtIntOperationEClass, SMT_INT_OPERATION__LEFT_OPERAND);
    createEReference(smtIntOperationEClass, SMT_INT_OPERATION__RIGHT_OPERAND);

    smtPlusEClass = createEClass(SMT_PLUS);

    smtMinusEClass = createEClass(SMT_MINUS);

    smtMultiplyEClass = createEClass(SMT_MULTIPLY);

    smtDivisonEClass = createEClass(SMT_DIVISON);

    smtDivEClass = createEClass(SMT_DIV);

    smtModEClass = createEClass(SMT_MOD);

    smtAssertionEClass = createEClass(SMT_ASSERTION);
    createEReference(smtAssertionEClass, SMT_ASSERTION__VALUE);

    smtCardinalityConstraintEClass = createEClass(SMT_CARDINALITY_CONSTRAINT);
    createEReference(smtCardinalityConstraintEClass, SMT_CARDINALITY_CONSTRAINT__TYPE);
    createEReference(smtCardinalityConstraintEClass, SMT_CARDINALITY_CONSTRAINT__ELEMENTS);

    smtSatCommandEClass = createEClass(SMT_SAT_COMMAND);

    smtSimpleSatCommandEClass = createEClass(SMT_SIMPLE_SAT_COMMAND);

    smtComplexSatCommandEClass = createEClass(SMT_COMPLEX_SAT_COMMAND);
    createEReference(smtComplexSatCommandEClass, SMT_COMPLEX_SAT_COMMAND__METHOD);

    smtGetModelCommandEClass = createEClass(SMT_GET_MODEL_COMMAND);

    smtReasoningTacticEClass = createEClass(SMT_REASONING_TACTIC);

    smtBuiltinTacticEClass = createEClass(SMT_BUILTIN_TACTIC);
    createEAttribute(smtBuiltinTacticEClass, SMT_BUILTIN_TACTIC__NAME);

    smtReasoningCombinatorEClass = createEClass(SMT_REASONING_COMBINATOR);

    smtAndThenCombinatorEClass = createEClass(SMT_AND_THEN_COMBINATOR);
    createEReference(smtAndThenCombinatorEClass, SMT_AND_THEN_COMBINATOR__TACTICS);

    smtOrElseCombinatorEClass = createEClass(SMT_OR_ELSE_COMBINATOR);
    createEReference(smtOrElseCombinatorEClass, SMT_OR_ELSE_COMBINATOR__TACTICS);

    smtParOrCombinatorEClass = createEClass(SMT_PAR_OR_COMBINATOR);
    createEReference(smtParOrCombinatorEClass, SMT_PAR_OR_COMBINATOR__TACTICS);

    smtParThenCombinatorEClass = createEClass(SMT_PAR_THEN_COMBINATOR);
    createEReference(smtParThenCombinatorEClass, SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC);
    createEReference(smtParThenCombinatorEClass, SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC);

    smtTryForCombinatorEClass = createEClass(SMT_TRY_FOR_COMBINATOR);
    createEReference(smtTryForCombinatorEClass, SMT_TRY_FOR_COMBINATOR__TACTIC);
    createEAttribute(smtTryForCombinatorEClass, SMT_TRY_FOR_COMBINATOR__TIME);

    smtIfCombinatorEClass = createEClass(SMT_IF_COMBINATOR);
    createEReference(smtIfCombinatorEClass, SMT_IF_COMBINATOR__PROBE);
    createEReference(smtIfCombinatorEClass, SMT_IF_COMBINATOR__IF_TACTIC);
    createEReference(smtIfCombinatorEClass, SMT_IF_COMBINATOR__ELSE_TACTIC);

    smtWhenCombinatorEClass = createEClass(SMT_WHEN_COMBINATOR);
    createEReference(smtWhenCombinatorEClass, SMT_WHEN_COMBINATOR__PROBE);
    createEReference(smtWhenCombinatorEClass, SMT_WHEN_COMBINATOR__TACTIC);

    smtFailIfCombinatorEClass = createEClass(SMT_FAIL_IF_COMBINATOR);
    createEReference(smtFailIfCombinatorEClass, SMT_FAIL_IF_COMBINATOR__PROBE);

    smtUsingParamCombinatorEClass = createEClass(SMT_USING_PARAM_COMBINATOR);
    createEReference(smtUsingParamCombinatorEClass, SMT_USING_PARAM_COMBINATOR__TACTIC);
    createEReference(smtUsingParamCombinatorEClass, SMT_USING_PARAM_COMBINATOR__PARAMETERS);

    reasoningProbeEClass = createEClass(REASONING_PROBE);
    createEAttribute(reasoningProbeEClass, REASONING_PROBE__NAME);

    reasoningTacticParameterEClass = createEClass(REASONING_TACTIC_PARAMETER);
    createEAttribute(reasoningTacticParameterEClass, REASONING_TACTIC_PARAMETER__NAME);
    createEReference(reasoningTacticParameterEClass, REASONING_TACTIC_PARAMETER__VALUE);

    smtResultEClass = createEClass(SMT_RESULT);

    smtErrorResultEClass = createEClass(SMT_ERROR_RESULT);
    createEAttribute(smtErrorResultEClass, SMT_ERROR_RESULT__MESSAGE);

    smtUnsupportedResultEClass = createEClass(SMT_UNSUPPORTED_RESULT);
    createEAttribute(smtUnsupportedResultEClass, SMT_UNSUPPORTED_RESULT__COMMAND);

    smtSatResultEClass = createEClass(SMT_SAT_RESULT);
    createEAttribute(smtSatResultEClass, SMT_SAT_RESULT__SAT);
    createEAttribute(smtSatResultEClass, SMT_SAT_RESULT__UNSAT);
    createEAttribute(smtSatResultEClass, SMT_SAT_RESULT__UNKNOWN);

    smtModelResultEClass = createEClass(SMT_MODEL_RESULT);
    createEReference(smtModelResultEClass, SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS);
    createEReference(smtModelResultEClass, SMT_MODEL_RESULT__TYPE_DEFINITIONS);
    createEReference(smtModelResultEClass, SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS);

    smtStatisticValueEClass = createEClass(SMT_STATISTIC_VALUE);
    createEAttribute(smtStatisticValueEClass, SMT_STATISTIC_VALUE__NAME);

    smtStatisticIntValueEClass = createEClass(SMT_STATISTIC_INT_VALUE);
    createEAttribute(smtStatisticIntValueEClass, SMT_STATISTIC_INT_VALUE__VALUE);

    smtStatisticDoubleValueEClass = createEClass(SMT_STATISTIC_DOUBLE_VALUE);
    createEAttribute(smtStatisticDoubleValueEClass, SMT_STATISTIC_DOUBLE_VALUE__VALUE);

    smtStatisticsSectionEClass = createEClass(SMT_STATISTICS_SECTION);
    createEReference(smtStatisticsSectionEClass, SMT_STATISTICS_SECTION__VALUES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    smtEnumLiteralEClass.getESuperTypes().add(this.getSMTSymbolicDeclaration());
    smtEnumeratedTypeDeclarationEClass.getESuperTypes().add(this.getSMTType());
    smtSetTypeDeclarationEClass.getESuperTypes().add(this.getSMTType());
    smtComplexTypeReferenceEClass.getESuperTypes().add(this.getSMTTypeReference());
    smtPrimitiveTypeReferenceEClass.getESuperTypes().add(this.getSMTTypeReference());
    smtIntTypeReferenceEClass.getESuperTypes().add(this.getSMTPrimitiveTypeReference());
    smtBoolTypeReferenceEClass.getESuperTypes().add(this.getSMTPrimitiveTypeReference());
    smtRealTypeReferenceEClass.getESuperTypes().add(this.getSMTPrimitiveTypeReference());
    smtFunctionDeclarationEClass.getESuperTypes().add(this.getSMTSymbolicDeclaration());
    smtFunctionDefinitionEClass.getESuperTypes().add(this.getSMTSymbolicDeclaration());
    smtSymbolicValueEClass.getESuperTypes().add(this.getSMTTerm());
    smtAtomicTermEClass.getESuperTypes().add(this.getSMTTerm());
    smtIntLiteralEClass.getESuperTypes().add(this.getSMTAtomicTerm());
    smtBoolLiteralEClass.getESuperTypes().add(this.getSMTAtomicTerm());
    smtRealLiteralEClass.getESuperTypes().add(this.getSMTAtomicTerm());
    smtSortedVariableEClass.getESuperTypes().add(this.getSMTSymbolicDeclaration());
    smtQuantifiedExpressionEClass.getESuperTypes().add(this.getSMTTerm());
    smtExistsEClass.getESuperTypes().add(this.getSMTQuantifiedExpression());
    smtForallEClass.getESuperTypes().add(this.getSMTQuantifiedExpression());
    smtBoolOperationEClass.getESuperTypes().add(this.getSMTTerm());
    smtAndEClass.getESuperTypes().add(this.getSMTBoolOperation());
    smtOrEClass.getESuperTypes().add(this.getSMTBoolOperation());
    smtImplEClass.getESuperTypes().add(this.getSMTBoolOperation());
    smtNotEClass.getESuperTypes().add(this.getSMTBoolOperation());
    smtIffEClass.getESuperTypes().add(this.getSMTBoolOperation());
    smtiteEClass.getESuperTypes().add(this.getSMTTerm());
    smtLetEClass.getESuperTypes().add(this.getSMTTerm());
    smtInlineConstantDefinitionEClass.getESuperTypes().add(this.getSMTSymbolicDeclaration());
    smtRelationEClass.getESuperTypes().add(this.getSMTTerm());
    smtEqualsEClass.getESuperTypes().add(this.getSMTRelation());
    smtDistinctEClass.getESuperTypes().add(this.getSMTRelation());
    smtltEClass.getESuperTypes().add(this.getSMTRelation());
    smtmtEClass.getESuperTypes().add(this.getSMTRelation());
    smtleqEClass.getESuperTypes().add(this.getSMTRelation());
    smtmeqEClass.getESuperTypes().add(this.getSMTRelation());
    smtIntOperationEClass.getESuperTypes().add(this.getSMTTerm());
    smtPlusEClass.getESuperTypes().add(this.getSMTIntOperation());
    smtMinusEClass.getESuperTypes().add(this.getSMTIntOperation());
    smtMultiplyEClass.getESuperTypes().add(this.getSMTIntOperation());
    smtDivisonEClass.getESuperTypes().add(this.getSMTIntOperation());
    smtDivEClass.getESuperTypes().add(this.getSMTIntOperation());
    smtModEClass.getESuperTypes().add(this.getSMTIntOperation());
    smtSimpleSatCommandEClass.getESuperTypes().add(this.getSMTSatCommand());
    smtComplexSatCommandEClass.getESuperTypes().add(this.getSMTSatCommand());
    smtBuiltinTacticEClass.getESuperTypes().add(this.getSMTReasoningTactic());
    smtReasoningCombinatorEClass.getESuperTypes().add(this.getSMTReasoningTactic());
    smtAndThenCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtOrElseCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtParOrCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtParThenCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtTryForCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtIfCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtWhenCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtFailIfCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtUsingParamCombinatorEClass.getESuperTypes().add(this.getSMTReasoningCombinator());
    smtErrorResultEClass.getESuperTypes().add(this.getSMTResult());
    smtUnsupportedResultEClass.getESuperTypes().add(this.getSMTResult());
    smtSatResultEClass.getESuperTypes().add(this.getSMTResult());
    smtModelResultEClass.getESuperTypes().add(this.getSMTResult());
    smtStatisticIntValueEClass.getESuperTypes().add(this.getSMTStatisticValue());
    smtStatisticDoubleValueEClass.getESuperTypes().add(this.getSMTStatisticValue());

    // Initialize classes and features; add operations and parameters
    initEClass(smtDocumentEClass, SMTDocument.class, "SMTDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTDocument_Input(), this.getSMTInput(), null, "input", null, 0, 1, SMTDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTDocument_Output(), this.getSMTOutput(), null, "output", null, 0, 1, SMTDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtInputEClass, SMTInput.class, "SMTInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTInput_Options(), this.getSMTOption(), null, "options", null, 0, -1, SMTInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTInput_TypeDeclarations(), this.getSMTType(), null, "typeDeclarations", null, 0, -1, SMTInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTInput_FunctionDeclarations(), this.getSMTFunctionDeclaration(), null, "functionDeclarations", null, 0, -1, SMTInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTInput_FunctionDefinition(), this.getSMTFunctionDefinition(), null, "functionDefinition", null, 0, -1, SMTInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTInput_Assertions(), this.getSMTAssertion(), null, "assertions", null, 0, -1, SMTInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTInput_SatCommand(), this.getSMTSatCommand(), null, "satCommand", null, 0, 1, SMTInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTInput_GetModelCommand(), this.getSMTGetModelCommand(), null, "getModelCommand", null, 0, 1, SMTInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtOutputEClass, SMTOutput.class, "SMTOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTOutput_SatResult(), this.getSMTResult(), null, "satResult", null, 0, 1, SMTOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTOutput_GetModelResult(), this.getSMTResult(), null, "getModelResult", null, 0, 1, SMTOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTOutput_Statistics(), this.getSMTStatisticsSection(), null, "statistics", null, 0, 1, SMTOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtOptionEClass, SMTOption.class, "SMTOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, SMTOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTOption_Value(), this.getSMTAtomicTerm(), null, "value", null, 0, 1, SMTOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtTypeEClass, SMTType.class, "SMTType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTType_Name(), ecorePackage.getEString(), "name", null, 0, 1, SMTType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtEnumLiteralEClass, SMTEnumLiteral.class, "SMTEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtEnumeratedTypeDeclarationEClass, SMTEnumeratedTypeDeclaration.class, "SMTEnumeratedTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTEnumeratedTypeDeclaration_Elements(), this.getSMTEnumLiteral(), null, "elements", null, 0, -1, SMTEnumeratedTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtSetTypeDeclarationEClass, SMTSetTypeDeclaration.class, "SMTSetTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtTypeReferenceEClass, SMTTypeReference.class, "SMTTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtComplexTypeReferenceEClass, SMTComplexTypeReference.class, "SMTComplexTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTComplexTypeReference_Referred(), this.getSMTType(), null, "referred", null, 0, 1, SMTComplexTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtPrimitiveTypeReferenceEClass, SMTPrimitiveTypeReference.class, "SMTPrimitiveTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtIntTypeReferenceEClass, SMTIntTypeReference.class, "SMTIntTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtBoolTypeReferenceEClass, SMTBoolTypeReference.class, "SMTBoolTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtRealTypeReferenceEClass, SMTRealTypeReference.class, "SMTRealTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtFunctionDeclarationEClass, SMTFunctionDeclaration.class, "SMTFunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTFunctionDeclaration_Parameters(), this.getSMTTypeReference(), null, "parameters", null, 0, -1, SMTFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTFunctionDeclaration_Range(), this.getSMTTypeReference(), null, "range", null, 0, 1, SMTFunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtFunctionDefinitionEClass, SMTFunctionDefinition.class, "SMTFunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTFunctionDefinition_Parameters(), this.getSMTSortedVariable(), null, "parameters", null, 0, -1, SMTFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTFunctionDefinition_Range(), this.getSMTTypeReference(), null, "range", null, 0, 1, SMTFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTFunctionDefinition_Value(), this.getSMTTerm(), null, "value", null, 0, 1, SMTFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtTermEClass, SMTTerm.class, "SMTTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtSymbolicDeclarationEClass, SMTSymbolicDeclaration.class, "SMTSymbolicDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTSymbolicDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SMTSymbolicDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtSymbolicValueEClass, SMTSymbolicValue.class, "SMTSymbolicValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTSymbolicValue_SymbolicReference(), this.getSMTSymbolicDeclaration(), null, "symbolicReference", null, 0, 1, SMTSymbolicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTSymbolicValue_ParameterSubstitutions(), this.getSMTTerm(), null, "parameterSubstitutions", null, 0, -1, SMTSymbolicValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtAtomicTermEClass, SMTAtomicTerm.class, "SMTAtomicTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtIntLiteralEClass, SMTIntLiteral.class, "SMTIntLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTIntLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SMTIntLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtBoolLiteralEClass, SMTBoolLiteral.class, "SMTBoolLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTBoolLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, SMTBoolLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtRealLiteralEClass, SMTRealLiteral.class, "SMTRealLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTRealLiteral_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, SMTRealLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtSortedVariableEClass, SMTSortedVariable.class, "SMTSortedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTSortedVariable_Range(), this.getSMTTypeReference(), null, "range", null, 0, 1, SMTSortedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtQuantifiedExpressionEClass, SMTQuantifiedExpression.class, "SMTQuantifiedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTQuantifiedExpression_QuantifiedVariables(), this.getSMTSortedVariable(), null, "quantifiedVariables", null, 0, -1, SMTQuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTQuantifiedExpression_Expression(), this.getSMTTerm(), null, "expression", null, 0, 1, SMTQuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTQuantifiedExpression_Pattern(), this.getSMTTerm(), null, "pattern", null, 0, 1, SMTQuantifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtExistsEClass, SMTExists.class, "SMTExists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtForallEClass, SMTForall.class, "SMTForall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtBoolOperationEClass, SMTBoolOperation.class, "SMTBoolOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtAndEClass, SMTAnd.class, "SMTAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTAnd_Operands(), this.getSMTTerm(), null, "operands", null, 0, -1, SMTAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtOrEClass, SMTOr.class, "SMTOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTOr_Operands(), this.getSMTTerm(), null, "operands", null, 0, -1, SMTOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtImplEClass, SMTImpl.class, "SMTImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTImpl_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, SMTImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTImpl_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, SMTImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtNotEClass, SMTNot.class, "SMTNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTNot_Operand(), this.getSMTTerm(), null, "operand", null, 0, 1, SMTNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtIffEClass, SMTIff.class, "SMTIff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTIff_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, SMTIff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTIff_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, SMTIff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtiteEClass, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE.class, "SMTITE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTITE_Condition(), this.getSMTTerm(), null, "condition", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTITE_If(), this.getSMTTerm(), null, "if", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTITE_Else(), this.getSMTTerm(), null, "else", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtLetEClass, SMTLet.class, "SMTLet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTLet_InlineConstantDefinitions(), this.getSMTInlineConstantDefinition(), null, "inlineConstantDefinitions", null, 0, -1, SMTLet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTLet_Term(), this.getSMTTerm(), null, "term", null, 0, 1, SMTLet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtInlineConstantDefinitionEClass, SMTInlineConstantDefinition.class, "SMTInlineConstantDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTInlineConstantDefinition_Definition(), this.getSMTTerm(), null, "definition", null, 0, 1, SMTInlineConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtRelationEClass, SMTRelation.class, "SMTRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtEqualsEClass, SMTEquals.class, "SMTEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTEquals_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, SMTEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTEquals_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, SMTEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtDistinctEClass, SMTDistinct.class, "SMTDistinct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTDistinct_Operands(), this.getSMTTerm(), null, "operands", null, 0, -1, SMTDistinct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtltEClass, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT.class, "SMTLT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTLT_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTLT_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtmtEClass, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT.class, "SMTMT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTMT_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTMT_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtleqEClass, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ.class, "SMTLEQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTLEQ_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTLEQ_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtmeqEClass, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ.class, "SMTMEQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTMEQ_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTMEQ_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtIntOperationEClass, SMTIntOperation.class, "SMTIntOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTIntOperation_LeftOperand(), this.getSMTTerm(), null, "leftOperand", null, 0, 1, SMTIntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTIntOperation_RightOperand(), this.getSMTTerm(), null, "rightOperand", null, 0, 1, SMTIntOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtPlusEClass, SMTPlus.class, "SMTPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtMinusEClass, SMTMinus.class, "SMTMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtMultiplyEClass, SMTMultiply.class, "SMTMultiply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtDivisonEClass, SMTDivison.class, "SMTDivison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtDivEClass, SMTDiv.class, "SMTDiv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtModEClass, SMTMod.class, "SMTMod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtAssertionEClass, SMTAssertion.class, "SMTAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTAssertion_Value(), this.getSMTTerm(), null, "value", null, 0, 1, SMTAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtCardinalityConstraintEClass, SMTCardinalityConstraint.class, "SMTCardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTCardinalityConstraint_Type(), this.getSMTTypeReference(), null, "type", null, 0, 1, SMTCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTCardinalityConstraint_Elements(), this.getSMTSymbolicValue(), null, "elements", null, 0, -1, SMTCardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtSatCommandEClass, SMTSatCommand.class, "SMTSatCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtSimpleSatCommandEClass, SMTSimpleSatCommand.class, "SMTSimpleSatCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtComplexSatCommandEClass, SMTComplexSatCommand.class, "SMTComplexSatCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTComplexSatCommand_Method(), this.getSMTReasoningTactic(), null, "method", null, 0, 1, SMTComplexSatCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtGetModelCommandEClass, SMTGetModelCommand.class, "SMTGetModelCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtReasoningTacticEClass, SMTReasoningTactic.class, "SMTReasoningTactic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtBuiltinTacticEClass, SMTBuiltinTactic.class, "SMTBuiltinTactic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTBuiltinTactic_Name(), ecorePackage.getEString(), "name", null, 0, 1, SMTBuiltinTactic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtReasoningCombinatorEClass, SMTReasoningCombinator.class, "SMTReasoningCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtAndThenCombinatorEClass, SMTAndThenCombinator.class, "SMTAndThenCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTAndThenCombinator_Tactics(), this.getSMTReasoningTactic(), null, "tactics", null, 0, -1, SMTAndThenCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtOrElseCombinatorEClass, SMTOrElseCombinator.class, "SMTOrElseCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTOrElseCombinator_Tactics(), this.getSMTReasoningTactic(), null, "tactics", null, 0, -1, SMTOrElseCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtParOrCombinatorEClass, SMTParOrCombinator.class, "SMTParOrCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTParOrCombinator_Tactics(), this.getSMTReasoningTactic(), null, "tactics", null, 0, -1, SMTParOrCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtParThenCombinatorEClass, SMTParThenCombinator.class, "SMTParThenCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTParThenCombinator_PreProcessingTactic(), this.getSMTReasoningTactic(), null, "preProcessingTactic", null, 0, 1, SMTParThenCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTParThenCombinator_ParalellyPostpricessingTactic(), this.getSMTReasoningTactic(), null, "paralellyPostpricessingTactic", null, 0, 1, SMTParThenCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtTryForCombinatorEClass, SMTTryForCombinator.class, "SMTTryForCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTTryForCombinator_Tactic(), this.getSMTReasoningTactic(), null, "tactic", null, 0, 1, SMTTryForCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSMTTryForCombinator_Time(), ecorePackage.getEInt(), "time", null, 0, 1, SMTTryForCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtIfCombinatorEClass, SMTIfCombinator.class, "SMTIfCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTIfCombinator_Probe(), this.getReasoningProbe(), null, "probe", null, 0, 1, SMTIfCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTIfCombinator_IfTactic(), this.getSMTReasoningTactic(), null, "ifTactic", null, 0, 1, SMTIfCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTIfCombinator_ElseTactic(), this.getSMTReasoningTactic(), null, "elseTactic", null, 0, 1, SMTIfCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtWhenCombinatorEClass, SMTWhenCombinator.class, "SMTWhenCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTWhenCombinator_Probe(), this.getReasoningProbe(), null, "probe", null, 0, 1, SMTWhenCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTWhenCombinator_Tactic(), this.getSMTReasoningTactic(), null, "tactic", null, 0, 1, SMTWhenCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtFailIfCombinatorEClass, SMTFailIfCombinator.class, "SMTFailIfCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTFailIfCombinator_Probe(), this.getReasoningProbe(), null, "probe", null, 0, 1, SMTFailIfCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtUsingParamCombinatorEClass, SMTUsingParamCombinator.class, "SMTUsingParamCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTUsingParamCombinator_Tactic(), this.getSMTReasoningTactic(), null, "tactic", null, 0, 1, SMTUsingParamCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTUsingParamCombinator_Parameters(), this.getReasoningTacticParameter(), null, "parameters", null, 0, -1, SMTUsingParamCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reasoningProbeEClass, ReasoningProbe.class, "ReasoningProbe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReasoningProbe_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReasoningProbe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reasoningTacticParameterEClass, ReasoningTacticParameter.class, "ReasoningTacticParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReasoningTacticParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReasoningTacticParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReasoningTacticParameter_Value(), this.getSMTAtomicTerm(), null, "value", null, 0, 1, ReasoningTacticParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtResultEClass, SMTResult.class, "SMTResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smtErrorResultEClass, SMTErrorResult.class, "SMTErrorResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTErrorResult_Message(), ecorePackage.getEString(), "message", null, 0, 1, SMTErrorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtUnsupportedResultEClass, SMTUnsupportedResult.class, "SMTUnsupportedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTUnsupportedResult_Command(), ecorePackage.getEString(), "command", null, 0, 1, SMTUnsupportedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtSatResultEClass, SMTSatResult.class, "SMTSatResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTSatResult_Sat(), ecorePackage.getEBoolean(), "sat", null, 0, 1, SMTSatResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSMTSatResult_Unsat(), ecorePackage.getEBoolean(), "unsat", null, 0, 1, SMTSatResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSMTSatResult_Unknown(), ecorePackage.getEBoolean(), "unknown", null, 0, 1, SMTSatResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtModelResultEClass, SMTModelResult.class, "SMTModelResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTModelResult_NewFunctionDeclarations(), this.getSMTFunctionDeclaration(), null, "newFunctionDeclarations", null, 0, -1, SMTModelResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTModelResult_TypeDefinitions(), this.getSMTCardinalityConstraint(), null, "typeDefinitions", null, 0, -1, SMTModelResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMTModelResult_NewFunctionDefinitions(), this.getSMTFunctionDefinition(), null, "newFunctionDefinitions", null, 0, -1, SMTModelResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtStatisticValueEClass, SMTStatisticValue.class, "SMTStatisticValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTStatisticValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, SMTStatisticValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtStatisticIntValueEClass, SMTStatisticIntValue.class, "SMTStatisticIntValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTStatisticIntValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SMTStatisticIntValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtStatisticDoubleValueEClass, SMTStatisticDoubleValue.class, "SMTStatisticDoubleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSMTStatisticDoubleValue_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, SMTStatisticDoubleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smtStatisticsSectionEClass, SMTStatisticsSection.class, "SMTStatisticsSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMTStatisticsSection_Values(), this.getSMTStatisticValue(), null, "values", null, 0, -1, SMTStatisticsSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SmtLanguagePackageImpl
