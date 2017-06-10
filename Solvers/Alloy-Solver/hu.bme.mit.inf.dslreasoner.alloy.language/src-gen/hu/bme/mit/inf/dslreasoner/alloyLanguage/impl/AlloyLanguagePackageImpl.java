/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSCardinality;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumLiteral;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIden;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInt;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntScope;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInverseRelation;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNone;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNot;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUnaryMinus;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUniv;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlSTransitiveClosure;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlloyLanguagePackageImpl extends EPackageImpl implements AlloyLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsRelationDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsEnumDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsEnumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsSignatureDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsSignatureBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsFieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsFunctionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsRelationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsFactDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsRunCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsTypeScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsSigScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsIntScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsQuantifiedExEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsOrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsIffEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsImplEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsAndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsEqualsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsNotEqualsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsSubsetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsLessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsLeqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsMoreEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsMeqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsOverrideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsRangeRestrictionRightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsRangeRestrictionLeftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsMinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsPlusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsIntersectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsDirectProductEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsNotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsInverseRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alSTransitiveClosureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsReflectiveTransitiveClosureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsUnaryMinusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsSumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsFunctionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsNoneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsIdenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsUnivEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alsNumberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum alsMultiplicityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum alsNumericOperatorEEnum = null;

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
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AlloyLanguagePackageImpl()
  {
    super(eNS_URI, AlloyLanguageFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link AlloyLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AlloyLanguagePackage init()
  {
    if (isInited) return (AlloyLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(AlloyLanguagePackage.eNS_URI);

    // Obtain or create and register package
    AlloyLanguagePackageImpl theAlloyLanguagePackage = (AlloyLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlloyLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlloyLanguagePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAlloyLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theAlloyLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAlloyLanguagePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AlloyLanguagePackage.eNS_URI, theAlloyLanguagePackage);
    return theAlloyLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSDocument()
  {
    return alsDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDocument_EnumDeclarations()
  {
    return (EReference)alsDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDocument_SignatureBodies()
  {
    return (EReference)alsDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDocument_FunctionDefinitions()
  {
    return (EReference)alsDocumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDocument_RelationDefinitions()
  {
    return (EReference)alsDocumentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDocument_FactDeclarations()
  {
    return (EReference)alsDocumentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDocument_RunCommand()
  {
    return (EReference)alsDocumentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSRelationDeclaration()
  {
    return alsRelationDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSRelationDeclaration_Name()
  {
    return (EAttribute)alsRelationDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSTypeDeclaration()
  {
    return alsTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSEnumDeclaration()
  {
    return alsEnumDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSEnumDeclaration_Literal()
  {
    return (EReference)alsEnumDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSEnumLiteral()
  {
    return alsEnumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSSignatureDeclaration()
  {
    return alsSignatureDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSSignatureBody()
  {
    return alsSignatureBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSSignatureBody_Multiplicity()
  {
    return (EAttribute)alsSignatureBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSSignatureBody_Abstract()
  {
    return (EAttribute)alsSignatureBodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSignatureBody_Declarations()
  {
    return (EReference)alsSignatureBodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSignatureBody_Supertype()
  {
    return (EReference)alsSignatureBodyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSignatureBody_Superset()
  {
    return (EReference)alsSignatureBodyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSignatureBody_Fields()
  {
    return (EReference)alsSignatureBodyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSFieldDeclaration()
  {
    return alsFieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSFieldDeclaration_Multiplicity()
  {
    return (EAttribute)alsFieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSFieldDeclaration_Type()
  {
    return (EReference)alsFieldDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSDefinition()
  {
    return alsDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSDefinition_Name()
  {
    return (EAttribute)alsDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDefinition_Variables()
  {
    return (EReference)alsDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDefinition_Value()
  {
    return (EReference)alsDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSFunctionDefinition()
  {
    return alsFunctionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSFunctionDefinition_Type()
  {
    return (EReference)alsFunctionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSRelationDefinition()
  {
    return alsRelationDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSFactDeclaration()
  {
    return alsFactDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSFactDeclaration_Name()
  {
    return (EAttribute)alsFactDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSFactDeclaration_Term()
  {
    return (EReference)alsFactDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSTerm()
  {
    return alsTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSVariableDeclaration()
  {
    return alsVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSVariableDeclaration_Range()
  {
    return (EReference)alsVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSRunCommand()
  {
    return alsRunCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSRunCommand_TypeScopes()
  {
    return (EReference)alsRunCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSTypeScope()
  {
    return alsTypeScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSTypeScope_Number()
  {
    return (EAttribute)alsTypeScopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSSigScope()
  {
    return alsSigScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSSigScope_Exactly()
  {
    return (EAttribute)alsSigScopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSigScope_Type()
  {
    return (EReference)alsSigScopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSIntScope()
  {
    return alsIntScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSQuantifiedEx()
  {
    return alsQuantifiedExEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSQuantifiedEx_Type()
  {
    return (EAttribute)alsQuantifiedExEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSQuantifiedEx_Disj()
  {
    return (EAttribute)alsQuantifiedExEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSQuantifiedEx_Variables()
  {
    return (EReference)alsQuantifiedExEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSQuantifiedEx_Expression()
  {
    return (EReference)alsQuantifiedExEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSOr()
  {
    return alsOrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSOr_LeftOperand()
  {
    return (EReference)alsOrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSOr_RightOperand()
  {
    return (EReference)alsOrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSIff()
  {
    return alsIffEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSIff_LeftOperand()
  {
    return (EReference)alsIffEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSIff_RightOperand()
  {
    return (EReference)alsIffEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSImpl()
  {
    return alsImplEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSImpl_LeftOperand()
  {
    return (EReference)alsImplEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSImpl_RightOperand()
  {
    return (EReference)alsImplEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSImpl_ElseOperand()
  {
    return (EReference)alsImplEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSAnd()
  {
    return alsAndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSAnd_LeftOperand()
  {
    return (EReference)alsAndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSAnd_RightOperand()
  {
    return (EReference)alsAndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSEquals()
  {
    return alsEqualsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSEquals_LeftOperand()
  {
    return (EReference)alsEqualsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSEquals_RightOperand()
  {
    return (EReference)alsEqualsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSNotEquals()
  {
    return alsNotEqualsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSNotEquals_LeftOperand()
  {
    return (EReference)alsNotEqualsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSNotEquals_RightOperand()
  {
    return (EReference)alsNotEqualsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSSubset()
  {
    return alsSubsetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSubset_LeftOperand()
  {
    return (EReference)alsSubsetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSubset_RightOperand()
  {
    return (EReference)alsSubsetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSLess()
  {
    return alsLessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSLess_LeftOperand()
  {
    return (EReference)alsLessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSLess_RightOperand()
  {
    return (EReference)alsLessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSLeq()
  {
    return alsLeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSLeq_LeftOperand()
  {
    return (EReference)alsLeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSLeq_RightOperand()
  {
    return (EReference)alsLeqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSMore()
  {
    return alsMoreEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSMore_LeftOperand()
  {
    return (EReference)alsMoreEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSMore_RightOperand()
  {
    return (EReference)alsMoreEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSMeq()
  {
    return alsMeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSMeq_LeftOperand()
  {
    return (EReference)alsMeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSMeq_RightOperand()
  {
    return (EReference)alsMeqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSOverride()
  {
    return alsOverrideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSOverride_LeftOperand()
  {
    return (EReference)alsOverrideEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSOverride_RightOperand()
  {
    return (EReference)alsOverrideEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSRangeRestrictionRight()
  {
    return alsRangeRestrictionRightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSRangeRestrictionRight_Relation()
  {
    return (EReference)alsRangeRestrictionRightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSRangeRestrictionRight_Filter()
  {
    return (EReference)alsRangeRestrictionRightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSRangeRestrictionLeft()
  {
    return alsRangeRestrictionLeftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSRangeRestrictionLeft_Filter()
  {
    return (EReference)alsRangeRestrictionLeftEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSRangeRestrictionLeft_Relation()
  {
    return (EReference)alsRangeRestrictionLeftEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSJoin()
  {
    return alsJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSJoin_LeftOperand()
  {
    return (EReference)alsJoinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSJoin_RightOperand()
  {
    return (EReference)alsJoinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSMinus()
  {
    return alsMinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSMinus_LeftOperand()
  {
    return (EReference)alsMinusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSMinus_RightOperand()
  {
    return (EReference)alsMinusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSPlus()
  {
    return alsPlusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSPlus_LeftOperand()
  {
    return (EReference)alsPlusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSPlus_RightOperand()
  {
    return (EReference)alsPlusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSIntersection()
  {
    return alsIntersectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSIntersection_LeftOperand()
  {
    return (EReference)alsIntersectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSIntersection_RightOperand()
  {
    return (EReference)alsIntersectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSDirectProduct()
  {
    return alsDirectProductEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDirectProduct_LeftOperand()
  {
    return (EReference)alsDirectProductEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSDirectProduct_LeftMultiplicit()
  {
    return (EAttribute)alsDirectProductEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSDirectProduct_RightMultiplicit()
  {
    return (EAttribute)alsDirectProductEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSDirectProduct_RightOperand()
  {
    return (EReference)alsDirectProductEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSNot()
  {
    return alsNotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSNot_Operand()
  {
    return (EReference)alsNotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSInverseRelation()
  {
    return alsInverseRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSInverseRelation_Operand()
  {
    return (EReference)alsInverseRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlSTransitiveClosure()
  {
    return alSTransitiveClosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlSTransitiveClosure_Operand()
  {
    return (EReference)alSTransitiveClosureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSReflectiveTransitiveClosure()
  {
    return alsReflectiveTransitiveClosureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSReflectiveTransitiveClosure_Operand()
  {
    return (EReference)alsReflectiveTransitiveClosureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSCardinality()
  {
    return alsCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSCardinality_Operand()
  {
    return (EReference)alsCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSUnaryMinus()
  {
    return alsUnaryMinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSUnaryMinus_Operand()
  {
    return (EReference)alsUnaryMinusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSSum()
  {
    return alsSumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSum_Variables()
  {
    return (EReference)alsSumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSSum_Expression()
  {
    return (EReference)alsSumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSFunctionCall()
  {
    return alsFunctionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSFunctionCall_ReferredDefinition()
  {
    return (EReference)alsFunctionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSFunctionCall_ReferredNumericOperator()
  {
    return (EAttribute)alsFunctionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSFunctionCall_Params()
  {
    return (EReference)alsFunctionCallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSNone()
  {
    return alsNoneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSIden()
  {
    return alsIdenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSUniv()
  {
    return alsUnivEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSInt()
  {
    return alsIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSReference()
  {
    return alsReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getALSReference_Referred()
  {
    return (EReference)alsReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getALSNumberLiteral()
  {
    return alsNumberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getALSNumberLiteral_Value()
  {
    return (EAttribute)alsNumberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getALSMultiplicity()
  {
    return alsMultiplicityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getALSNumericOperator()
  {
    return alsNumericOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlloyLanguageFactory getAlloyLanguageFactory()
  {
    return (AlloyLanguageFactory)getEFactoryInstance();
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
    alsDocumentEClass = createEClass(ALS_DOCUMENT);
    createEReference(alsDocumentEClass, ALS_DOCUMENT__ENUM_DECLARATIONS);
    createEReference(alsDocumentEClass, ALS_DOCUMENT__SIGNATURE_BODIES);
    createEReference(alsDocumentEClass, ALS_DOCUMENT__FUNCTION_DEFINITIONS);
    createEReference(alsDocumentEClass, ALS_DOCUMENT__RELATION_DEFINITIONS);
    createEReference(alsDocumentEClass, ALS_DOCUMENT__FACT_DECLARATIONS);
    createEReference(alsDocumentEClass, ALS_DOCUMENT__RUN_COMMAND);

    alsRelationDeclarationEClass = createEClass(ALS_RELATION_DECLARATION);
    createEAttribute(alsRelationDeclarationEClass, ALS_RELATION_DECLARATION__NAME);

    alsTypeDeclarationEClass = createEClass(ALS_TYPE_DECLARATION);

    alsEnumDeclarationEClass = createEClass(ALS_ENUM_DECLARATION);
    createEReference(alsEnumDeclarationEClass, ALS_ENUM_DECLARATION__LITERAL);

    alsEnumLiteralEClass = createEClass(ALS_ENUM_LITERAL);

    alsSignatureDeclarationEClass = createEClass(ALS_SIGNATURE_DECLARATION);

    alsSignatureBodyEClass = createEClass(ALS_SIGNATURE_BODY);
    createEAttribute(alsSignatureBodyEClass, ALS_SIGNATURE_BODY__MULTIPLICITY);
    createEAttribute(alsSignatureBodyEClass, ALS_SIGNATURE_BODY__ABSTRACT);
    createEReference(alsSignatureBodyEClass, ALS_SIGNATURE_BODY__DECLARATIONS);
    createEReference(alsSignatureBodyEClass, ALS_SIGNATURE_BODY__SUPERTYPE);
    createEReference(alsSignatureBodyEClass, ALS_SIGNATURE_BODY__SUPERSET);
    createEReference(alsSignatureBodyEClass, ALS_SIGNATURE_BODY__FIELDS);

    alsFieldDeclarationEClass = createEClass(ALS_FIELD_DECLARATION);
    createEAttribute(alsFieldDeclarationEClass, ALS_FIELD_DECLARATION__MULTIPLICITY);
    createEReference(alsFieldDeclarationEClass, ALS_FIELD_DECLARATION__TYPE);

    alsDefinitionEClass = createEClass(ALS_DEFINITION);
    createEAttribute(alsDefinitionEClass, ALS_DEFINITION__NAME);
    createEReference(alsDefinitionEClass, ALS_DEFINITION__VARIABLES);
    createEReference(alsDefinitionEClass, ALS_DEFINITION__VALUE);

    alsFunctionDefinitionEClass = createEClass(ALS_FUNCTION_DEFINITION);
    createEReference(alsFunctionDefinitionEClass, ALS_FUNCTION_DEFINITION__TYPE);

    alsRelationDefinitionEClass = createEClass(ALS_RELATION_DEFINITION);

    alsFactDeclarationEClass = createEClass(ALS_FACT_DECLARATION);
    createEAttribute(alsFactDeclarationEClass, ALS_FACT_DECLARATION__NAME);
    createEReference(alsFactDeclarationEClass, ALS_FACT_DECLARATION__TERM);

    alsTermEClass = createEClass(ALS_TERM);

    alsVariableDeclarationEClass = createEClass(ALS_VARIABLE_DECLARATION);
    createEReference(alsVariableDeclarationEClass, ALS_VARIABLE_DECLARATION__RANGE);

    alsRunCommandEClass = createEClass(ALS_RUN_COMMAND);
    createEReference(alsRunCommandEClass, ALS_RUN_COMMAND__TYPE_SCOPES);

    alsTypeScopeEClass = createEClass(ALS_TYPE_SCOPE);
    createEAttribute(alsTypeScopeEClass, ALS_TYPE_SCOPE__NUMBER);

    alsSigScopeEClass = createEClass(ALS_SIG_SCOPE);
    createEAttribute(alsSigScopeEClass, ALS_SIG_SCOPE__EXACTLY);
    createEReference(alsSigScopeEClass, ALS_SIG_SCOPE__TYPE);

    alsIntScopeEClass = createEClass(ALS_INT_SCOPE);

    alsQuantifiedExEClass = createEClass(ALS_QUANTIFIED_EX);
    createEAttribute(alsQuantifiedExEClass, ALS_QUANTIFIED_EX__TYPE);
    createEAttribute(alsQuantifiedExEClass, ALS_QUANTIFIED_EX__DISJ);
    createEReference(alsQuantifiedExEClass, ALS_QUANTIFIED_EX__VARIABLES);
    createEReference(alsQuantifiedExEClass, ALS_QUANTIFIED_EX__EXPRESSION);

    alsOrEClass = createEClass(ALS_OR);
    createEReference(alsOrEClass, ALS_OR__LEFT_OPERAND);
    createEReference(alsOrEClass, ALS_OR__RIGHT_OPERAND);

    alsIffEClass = createEClass(ALS_IFF);
    createEReference(alsIffEClass, ALS_IFF__LEFT_OPERAND);
    createEReference(alsIffEClass, ALS_IFF__RIGHT_OPERAND);

    alsImplEClass = createEClass(ALS_IMPL);
    createEReference(alsImplEClass, ALS_IMPL__LEFT_OPERAND);
    createEReference(alsImplEClass, ALS_IMPL__RIGHT_OPERAND);
    createEReference(alsImplEClass, ALS_IMPL__ELSE_OPERAND);

    alsAndEClass = createEClass(ALS_AND);
    createEReference(alsAndEClass, ALS_AND__LEFT_OPERAND);
    createEReference(alsAndEClass, ALS_AND__RIGHT_OPERAND);

    alsEqualsEClass = createEClass(ALS_EQUALS);
    createEReference(alsEqualsEClass, ALS_EQUALS__LEFT_OPERAND);
    createEReference(alsEqualsEClass, ALS_EQUALS__RIGHT_OPERAND);

    alsNotEqualsEClass = createEClass(ALS_NOT_EQUALS);
    createEReference(alsNotEqualsEClass, ALS_NOT_EQUALS__LEFT_OPERAND);
    createEReference(alsNotEqualsEClass, ALS_NOT_EQUALS__RIGHT_OPERAND);

    alsSubsetEClass = createEClass(ALS_SUBSET);
    createEReference(alsSubsetEClass, ALS_SUBSET__LEFT_OPERAND);
    createEReference(alsSubsetEClass, ALS_SUBSET__RIGHT_OPERAND);

    alsLessEClass = createEClass(ALS_LESS);
    createEReference(alsLessEClass, ALS_LESS__LEFT_OPERAND);
    createEReference(alsLessEClass, ALS_LESS__RIGHT_OPERAND);

    alsLeqEClass = createEClass(ALS_LEQ);
    createEReference(alsLeqEClass, ALS_LEQ__LEFT_OPERAND);
    createEReference(alsLeqEClass, ALS_LEQ__RIGHT_OPERAND);

    alsMoreEClass = createEClass(ALS_MORE);
    createEReference(alsMoreEClass, ALS_MORE__LEFT_OPERAND);
    createEReference(alsMoreEClass, ALS_MORE__RIGHT_OPERAND);

    alsMeqEClass = createEClass(ALS_MEQ);
    createEReference(alsMeqEClass, ALS_MEQ__LEFT_OPERAND);
    createEReference(alsMeqEClass, ALS_MEQ__RIGHT_OPERAND);

    alsOverrideEClass = createEClass(ALS_OVERRIDE);
    createEReference(alsOverrideEClass, ALS_OVERRIDE__LEFT_OPERAND);
    createEReference(alsOverrideEClass, ALS_OVERRIDE__RIGHT_OPERAND);

    alsRangeRestrictionRightEClass = createEClass(ALS_RANGE_RESTRICTION_RIGHT);
    createEReference(alsRangeRestrictionRightEClass, ALS_RANGE_RESTRICTION_RIGHT__RELATION);
    createEReference(alsRangeRestrictionRightEClass, ALS_RANGE_RESTRICTION_RIGHT__FILTER);

    alsRangeRestrictionLeftEClass = createEClass(ALS_RANGE_RESTRICTION_LEFT);
    createEReference(alsRangeRestrictionLeftEClass, ALS_RANGE_RESTRICTION_LEFT__FILTER);
    createEReference(alsRangeRestrictionLeftEClass, ALS_RANGE_RESTRICTION_LEFT__RELATION);

    alsJoinEClass = createEClass(ALS_JOIN);
    createEReference(alsJoinEClass, ALS_JOIN__LEFT_OPERAND);
    createEReference(alsJoinEClass, ALS_JOIN__RIGHT_OPERAND);

    alsMinusEClass = createEClass(ALS_MINUS);
    createEReference(alsMinusEClass, ALS_MINUS__LEFT_OPERAND);
    createEReference(alsMinusEClass, ALS_MINUS__RIGHT_OPERAND);

    alsPlusEClass = createEClass(ALS_PLUS);
    createEReference(alsPlusEClass, ALS_PLUS__LEFT_OPERAND);
    createEReference(alsPlusEClass, ALS_PLUS__RIGHT_OPERAND);

    alsIntersectionEClass = createEClass(ALS_INTERSECTION);
    createEReference(alsIntersectionEClass, ALS_INTERSECTION__LEFT_OPERAND);
    createEReference(alsIntersectionEClass, ALS_INTERSECTION__RIGHT_OPERAND);

    alsDirectProductEClass = createEClass(ALS_DIRECT_PRODUCT);
    createEReference(alsDirectProductEClass, ALS_DIRECT_PRODUCT__LEFT_OPERAND);
    createEAttribute(alsDirectProductEClass, ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT);
    createEAttribute(alsDirectProductEClass, ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT);
    createEReference(alsDirectProductEClass, ALS_DIRECT_PRODUCT__RIGHT_OPERAND);

    alsNotEClass = createEClass(ALS_NOT);
    createEReference(alsNotEClass, ALS_NOT__OPERAND);

    alsInverseRelationEClass = createEClass(ALS_INVERSE_RELATION);
    createEReference(alsInverseRelationEClass, ALS_INVERSE_RELATION__OPERAND);

    alSTransitiveClosureEClass = createEClass(AL_STRANSITIVE_CLOSURE);
    createEReference(alSTransitiveClosureEClass, AL_STRANSITIVE_CLOSURE__OPERAND);

    alsReflectiveTransitiveClosureEClass = createEClass(ALS_REFLECTIVE_TRANSITIVE_CLOSURE);
    createEReference(alsReflectiveTransitiveClosureEClass, ALS_REFLECTIVE_TRANSITIVE_CLOSURE__OPERAND);

    alsCardinalityEClass = createEClass(ALS_CARDINALITY);
    createEReference(alsCardinalityEClass, ALS_CARDINALITY__OPERAND);

    alsUnaryMinusEClass = createEClass(ALS_UNARY_MINUS);
    createEReference(alsUnaryMinusEClass, ALS_UNARY_MINUS__OPERAND);

    alsSumEClass = createEClass(ALS_SUM);
    createEReference(alsSumEClass, ALS_SUM__VARIABLES);
    createEReference(alsSumEClass, ALS_SUM__EXPRESSION);

    alsFunctionCallEClass = createEClass(ALS_FUNCTION_CALL);
    createEReference(alsFunctionCallEClass, ALS_FUNCTION_CALL__REFERRED_DEFINITION);
    createEAttribute(alsFunctionCallEClass, ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR);
    createEReference(alsFunctionCallEClass, ALS_FUNCTION_CALL__PARAMS);

    alsNoneEClass = createEClass(ALS_NONE);

    alsIdenEClass = createEClass(ALS_IDEN);

    alsUnivEClass = createEClass(ALS_UNIV);

    alsIntEClass = createEClass(ALS_INT);

    alsReferenceEClass = createEClass(ALS_REFERENCE);
    createEReference(alsReferenceEClass, ALS_REFERENCE__REFERRED);

    alsNumberLiteralEClass = createEClass(ALS_NUMBER_LITERAL);
    createEAttribute(alsNumberLiteralEClass, ALS_NUMBER_LITERAL__VALUE);

    // Create enums
    alsMultiplicityEEnum = createEEnum(ALS_MULTIPLICITY);
    alsNumericOperatorEEnum = createEEnum(ALS_NUMERIC_OPERATOR);
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
    alsTypeDeclarationEClass.getESuperTypes().add(this.getALSRelationDeclaration());
    alsEnumDeclarationEClass.getESuperTypes().add(this.getALSTypeDeclaration());
    alsEnumLiteralEClass.getESuperTypes().add(this.getALSRelationDeclaration());
    alsSignatureDeclarationEClass.getESuperTypes().add(this.getALSTypeDeclaration());
    alsFieldDeclarationEClass.getESuperTypes().add(this.getALSRelationDeclaration());
    alsFunctionDefinitionEClass.getESuperTypes().add(this.getALSDefinition());
    alsRelationDefinitionEClass.getESuperTypes().add(this.getALSDefinition());
    alsVariableDeclarationEClass.getESuperTypes().add(this.getALSRelationDeclaration());
    alsSigScopeEClass.getESuperTypes().add(this.getALSTypeScope());
    alsIntScopeEClass.getESuperTypes().add(this.getALSTypeScope());
    alsQuantifiedExEClass.getESuperTypes().add(this.getALSTerm());
    alsOrEClass.getESuperTypes().add(this.getALSTerm());
    alsIffEClass.getESuperTypes().add(this.getALSTerm());
    alsImplEClass.getESuperTypes().add(this.getALSTerm());
    alsAndEClass.getESuperTypes().add(this.getALSTerm());
    alsEqualsEClass.getESuperTypes().add(this.getALSTerm());
    alsNotEqualsEClass.getESuperTypes().add(this.getALSTerm());
    alsSubsetEClass.getESuperTypes().add(this.getALSTerm());
    alsLessEClass.getESuperTypes().add(this.getALSTerm());
    alsLeqEClass.getESuperTypes().add(this.getALSTerm());
    alsMoreEClass.getESuperTypes().add(this.getALSTerm());
    alsMeqEClass.getESuperTypes().add(this.getALSTerm());
    alsOverrideEClass.getESuperTypes().add(this.getALSTerm());
    alsRangeRestrictionRightEClass.getESuperTypes().add(this.getALSTerm());
    alsRangeRestrictionLeftEClass.getESuperTypes().add(this.getALSTerm());
    alsJoinEClass.getESuperTypes().add(this.getALSTerm());
    alsMinusEClass.getESuperTypes().add(this.getALSTerm());
    alsPlusEClass.getESuperTypes().add(this.getALSTerm());
    alsIntersectionEClass.getESuperTypes().add(this.getALSTerm());
    alsDirectProductEClass.getESuperTypes().add(this.getALSTerm());
    alsNotEClass.getESuperTypes().add(this.getALSTerm());
    alsInverseRelationEClass.getESuperTypes().add(this.getALSTerm());
    alSTransitiveClosureEClass.getESuperTypes().add(this.getALSTerm());
    alsReflectiveTransitiveClosureEClass.getESuperTypes().add(this.getALSTerm());
    alsCardinalityEClass.getESuperTypes().add(this.getALSTerm());
    alsUnaryMinusEClass.getESuperTypes().add(this.getALSTerm());
    alsSumEClass.getESuperTypes().add(this.getALSTerm());
    alsFunctionCallEClass.getESuperTypes().add(this.getALSTerm());
    alsNoneEClass.getESuperTypes().add(this.getALSTerm());
    alsIdenEClass.getESuperTypes().add(this.getALSTerm());
    alsUnivEClass.getESuperTypes().add(this.getALSTerm());
    alsIntEClass.getESuperTypes().add(this.getALSTerm());
    alsReferenceEClass.getESuperTypes().add(this.getALSTerm());
    alsNumberLiteralEClass.getESuperTypes().add(this.getALSTerm());

    // Initialize classes and features; add operations and parameters
    initEClass(alsDocumentEClass, ALSDocument.class, "ALSDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSDocument_EnumDeclarations(), this.getALSEnumDeclaration(), null, "enumDeclarations", null, 0, -1, ALSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDocument_SignatureBodies(), this.getALSSignatureBody(), null, "signatureBodies", null, 0, -1, ALSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDocument_FunctionDefinitions(), this.getALSFunctionDefinition(), null, "functionDefinitions", null, 0, -1, ALSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDocument_RelationDefinitions(), this.getALSRelationDefinition(), null, "relationDefinitions", null, 0, -1, ALSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDocument_FactDeclarations(), this.getALSFactDeclaration(), null, "factDeclarations", null, 0, -1, ALSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDocument_RunCommand(), this.getALSRunCommand(), null, "runCommand", null, 0, 1, ALSDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsRelationDeclarationEClass, ALSRelationDeclaration.class, "ALSRelationDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSRelationDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ALSRelationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsTypeDeclarationEClass, ALSTypeDeclaration.class, "ALSTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsEnumDeclarationEClass, ALSEnumDeclaration.class, "ALSEnumDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSEnumDeclaration_Literal(), this.getALSEnumLiteral(), null, "literal", null, 0, -1, ALSEnumDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsEnumLiteralEClass, ALSEnumLiteral.class, "ALSEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsSignatureDeclarationEClass, ALSSignatureDeclaration.class, "ALSSignatureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsSignatureBodyEClass, ALSSignatureBody.class, "ALSSignatureBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSSignatureBody_Multiplicity(), this.getALSMultiplicity(), "multiplicity", null, 0, 1, ALSSignatureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getALSSignatureBody_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, ALSSignatureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSSignatureBody_Declarations(), this.getALSSignatureDeclaration(), null, "declarations", null, 0, -1, ALSSignatureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSSignatureBody_Supertype(), this.getALSSignatureDeclaration(), null, "supertype", null, 0, 1, ALSSignatureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSSignatureBody_Superset(), this.getALSSignatureDeclaration(), null, "superset", null, 0, -1, ALSSignatureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSSignatureBody_Fields(), this.getALSFieldDeclaration(), null, "fields", null, 0, -1, ALSSignatureBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsFieldDeclarationEClass, ALSFieldDeclaration.class, "ALSFieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSFieldDeclaration_Multiplicity(), this.getALSMultiplicity(), "multiplicity", null, 0, 1, ALSFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSFieldDeclaration_Type(), this.getALSTerm(), null, "type", null, 0, 1, ALSFieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsDefinitionEClass, ALSDefinition.class, "ALSDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ALSDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDefinition_Variables(), this.getALSVariableDeclaration(), null, "variables", null, 0, -1, ALSDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDefinition_Value(), this.getALSTerm(), null, "value", null, 0, 1, ALSDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsFunctionDefinitionEClass, ALSFunctionDefinition.class, "ALSFunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSFunctionDefinition_Type(), this.getALSTerm(), null, "type", null, 0, 1, ALSFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsRelationDefinitionEClass, ALSRelationDefinition.class, "ALSRelationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsFactDeclarationEClass, ALSFactDeclaration.class, "ALSFactDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSFactDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ALSFactDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSFactDeclaration_Term(), this.getALSTerm(), null, "term", null, 0, 1, ALSFactDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsTermEClass, ALSTerm.class, "ALSTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsVariableDeclarationEClass, ALSVariableDeclaration.class, "ALSVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSVariableDeclaration_Range(), this.getALSTerm(), null, "range", null, 0, 1, ALSVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsRunCommandEClass, ALSRunCommand.class, "ALSRunCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSRunCommand_TypeScopes(), this.getALSTypeScope(), null, "typeScopes", null, 0, -1, ALSRunCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsTypeScopeEClass, ALSTypeScope.class, "ALSTypeScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSTypeScope_Number(), ecorePackage.getEInt(), "number", null, 0, 1, ALSTypeScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsSigScopeEClass, ALSSigScope.class, "ALSSigScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSSigScope_Exactly(), ecorePackage.getEBoolean(), "exactly", null, 0, 1, ALSSigScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSSigScope_Type(), this.getALSSignatureDeclaration(), null, "type", null, 0, 1, ALSSigScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsIntScopeEClass, ALSIntScope.class, "ALSIntScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsQuantifiedExEClass, ALSQuantifiedEx.class, "ALSQuantifiedEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSQuantifiedEx_Type(), this.getALSMultiplicity(), "type", null, 0, 1, ALSQuantifiedEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getALSQuantifiedEx_Disj(), ecorePackage.getEBoolean(), "disj", null, 0, 1, ALSQuantifiedEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSQuantifiedEx_Variables(), this.getALSVariableDeclaration(), null, "variables", null, 0, -1, ALSQuantifiedEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSQuantifiedEx_Expression(), this.getALSTerm(), null, "expression", null, 0, 1, ALSQuantifiedEx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsOrEClass, ALSOr.class, "ALSOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSOr_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSOr_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsIffEClass, ALSIff.class, "ALSIff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSIff_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSIff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSIff_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSIff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsImplEClass, ALSImpl.class, "ALSImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSImpl_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSImpl_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSImpl_ElseOperand(), this.getALSTerm(), null, "elseOperand", null, 0, 1, ALSImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsAndEClass, ALSAnd.class, "ALSAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSAnd_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSAnd_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsEqualsEClass, ALSEquals.class, "ALSEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSEquals_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSEquals_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsNotEqualsEClass, ALSNotEquals.class, "ALSNotEquals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSNotEquals_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSNotEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSNotEquals_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSNotEquals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsSubsetEClass, ALSSubset.class, "ALSSubset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSSubset_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSSubset_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsLessEClass, ALSLess.class, "ALSLess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSLess_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSLess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSLess_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSLess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsLeqEClass, ALSLeq.class, "ALSLeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSLeq_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSLeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSLeq_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSLeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsMoreEClass, ALSMore.class, "ALSMore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSMore_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSMore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSMore_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSMore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsMeqEClass, ALSMeq.class, "ALSMeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSMeq_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSMeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSMeq_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSMeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsOverrideEClass, ALSOverride.class, "ALSOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSOverride_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSOverride_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsRangeRestrictionRightEClass, ALSRangeRestrictionRight.class, "ALSRangeRestrictionRight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSRangeRestrictionRight_Relation(), this.getALSTerm(), null, "relation", null, 0, 1, ALSRangeRestrictionRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSRangeRestrictionRight_Filter(), this.getALSTerm(), null, "filter", null, 0, 1, ALSRangeRestrictionRight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsRangeRestrictionLeftEClass, ALSRangeRestrictionLeft.class, "ALSRangeRestrictionLeft", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSRangeRestrictionLeft_Filter(), this.getALSTerm(), null, "filter", null, 0, 1, ALSRangeRestrictionLeft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSRangeRestrictionLeft_Relation(), this.getALSTerm(), null, "relation", null, 0, 1, ALSRangeRestrictionLeft.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsJoinEClass, ALSJoin.class, "ALSJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSJoin_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSJoin_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsMinusEClass, ALSMinus.class, "ALSMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSMinus_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSMinus_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsPlusEClass, ALSPlus.class, "ALSPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSPlus_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSPlus_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSPlus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsIntersectionEClass, ALSIntersection.class, "ALSIntersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSIntersection_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSIntersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSIntersection_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSIntersection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsDirectProductEClass, ALSDirectProduct.class, "ALSDirectProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSDirectProduct_LeftOperand(), this.getALSTerm(), null, "leftOperand", null, 0, 1, ALSDirectProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getALSDirectProduct_LeftMultiplicit(), this.getALSMultiplicity(), "leftMultiplicit", null, 0, 1, ALSDirectProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getALSDirectProduct_RightMultiplicit(), this.getALSMultiplicity(), "rightMultiplicit", null, 0, 1, ALSDirectProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSDirectProduct_RightOperand(), this.getALSTerm(), null, "rightOperand", null, 0, 1, ALSDirectProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsNotEClass, ALSNot.class, "ALSNot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSNot_Operand(), this.getALSTerm(), null, "operand", null, 0, 1, ALSNot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsInverseRelationEClass, ALSInverseRelation.class, "ALSInverseRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSInverseRelation_Operand(), this.getALSTerm(), null, "operand", null, 0, 1, ALSInverseRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alSTransitiveClosureEClass, AlSTransitiveClosure.class, "AlSTransitiveClosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlSTransitiveClosure_Operand(), this.getALSTerm(), null, "operand", null, 0, 1, AlSTransitiveClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsReflectiveTransitiveClosureEClass, ALSReflectiveTransitiveClosure.class, "ALSReflectiveTransitiveClosure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSReflectiveTransitiveClosure_Operand(), this.getALSTerm(), null, "operand", null, 0, 1, ALSReflectiveTransitiveClosure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsCardinalityEClass, ALSCardinality.class, "ALSCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSCardinality_Operand(), this.getALSTerm(), null, "operand", null, 0, 1, ALSCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsUnaryMinusEClass, ALSUnaryMinus.class, "ALSUnaryMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSUnaryMinus_Operand(), this.getALSTerm(), null, "operand", null, 0, 1, ALSUnaryMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsSumEClass, ALSSum.class, "ALSSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSSum_Variables(), this.getALSVariableDeclaration(), null, "variables", null, 0, -1, ALSSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSSum_Expression(), this.getALSTerm(), null, "expression", null, 0, 1, ALSSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsFunctionCallEClass, ALSFunctionCall.class, "ALSFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSFunctionCall_ReferredDefinition(), this.getALSDefinition(), null, "referredDefinition", null, 0, 1, ALSFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getALSFunctionCall_ReferredNumericOperator(), this.getALSNumericOperator(), "referredNumericOperator", null, 0, 1, ALSFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getALSFunctionCall_Params(), this.getALSTerm(), null, "params", null, 0, -1, ALSFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsNoneEClass, ALSNone.class, "ALSNone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsIdenEClass, ALSIden.class, "ALSIden", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsUnivEClass, ALSUniv.class, "ALSUniv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsIntEClass, ALSInt.class, "ALSInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alsReferenceEClass, ALSReference.class, "ALSReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getALSReference_Referred(), this.getALSRelationDeclaration(), null, "referred", null, 0, 1, ALSReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alsNumberLiteralEClass, ALSNumberLiteral.class, "ALSNumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getALSNumberLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ALSNumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(alsMultiplicityEEnum, ALSMultiplicity.class, "ALSMultiplicity");
    addEEnumLiteral(alsMultiplicityEEnum, ALSMultiplicity.ALL);
    addEEnumLiteral(alsMultiplicityEEnum, ALSMultiplicity.NO);
    addEEnumLiteral(alsMultiplicityEEnum, ALSMultiplicity.SOME);
    addEEnumLiteral(alsMultiplicityEEnum, ALSMultiplicity.LONE);
    addEEnumLiteral(alsMultiplicityEEnum, ALSMultiplicity.ONE);
    addEEnumLiteral(alsMultiplicityEEnum, ALSMultiplicity.SET);

    initEEnum(alsNumericOperatorEEnum, ALSNumericOperator.class, "ALSNumericOperator");
    addEEnumLiteral(alsNumericOperatorEEnum, ALSNumericOperator.PLUS);
    addEEnumLiteral(alsNumericOperatorEEnum, ALSNumericOperator.SUB);
    addEEnumLiteral(alsNumericOperatorEEnum, ALSNumericOperator.MUL);
    addEEnumLiteral(alsNumericOperatorEEnum, ALSNumericOperator.REM);
    addEEnumLiteral(alsNumericOperatorEEnum, ALSNumericOperator.DIV);

    // Create resource
    createResource(eNS_URI);
  }

} //AlloyLanguagePackageImpl
