/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AlloyLanguageFactoryImpl extends EFactoryImpl implements AlloyLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AlloyLanguageFactory init()
  {
    try
    {
      AlloyLanguageFactory theAlloyLanguageFactory = (AlloyLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(AlloyLanguagePackage.eNS_URI);
      if (theAlloyLanguageFactory != null)
      {
        return theAlloyLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AlloyLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlloyLanguageFactoryImpl()
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
      case AlloyLanguagePackage.ALS_DOCUMENT: return createALSDocument();
      case AlloyLanguagePackage.ALS_RELATION_DECLARATION: return createALSRelationDeclaration();
      case AlloyLanguagePackage.ALS_TYPE_DECLARATION: return createALSTypeDeclaration();
      case AlloyLanguagePackage.ALS_ENUM_DECLARATION: return createALSEnumDeclaration();
      case AlloyLanguagePackage.ALS_ENUM_LITERAL: return createALSEnumLiteral();
      case AlloyLanguagePackage.ALS_SIGNATURE_DECLARATION: return createALSSignatureDeclaration();
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY: return createALSSignatureBody();
      case AlloyLanguagePackage.ALS_FIELD_DECLARATION: return createALSFieldDeclaration();
      case AlloyLanguagePackage.ALS_DEFINITION: return createALSDefinition();
      case AlloyLanguagePackage.ALS_FUNCTION_DEFINITION: return createALSFunctionDefinition();
      case AlloyLanguagePackage.ALS_RELATION_DEFINITION: return createALSRelationDefinition();
      case AlloyLanguagePackage.ALS_FACT_DECLARATION: return createALSFactDeclaration();
      case AlloyLanguagePackage.ALS_TERM: return createALSTerm();
      case AlloyLanguagePackage.ALS_VARIABLE_DECLARATION: return createALSVariableDeclaration();
      case AlloyLanguagePackage.ALS_RUN_COMMAND: return createALSRunCommand();
      case AlloyLanguagePackage.ALS_TYPE_SCOPE: return createALSTypeScope();
      case AlloyLanguagePackage.ALS_SIG_SCOPE: return createALSSigScope();
      case AlloyLanguagePackage.ALS_INT_SCOPE: return createALSIntScope();
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX: return createALSQuantifiedEx();
      case AlloyLanguagePackage.ALS_OR: return createALSOr();
      case AlloyLanguagePackage.ALS_IFF: return createALSIff();
      case AlloyLanguagePackage.ALS_IMPL: return createALSImpl();
      case AlloyLanguagePackage.ALS_AND: return createALSAnd();
      case AlloyLanguagePackage.ALS_EQUALS: return createALSEquals();
      case AlloyLanguagePackage.ALS_NOT_EQUALS: return createALSNotEquals();
      case AlloyLanguagePackage.ALS_SUBSET: return createALSSubset();
      case AlloyLanguagePackage.ALS_LESS: return createALSLess();
      case AlloyLanguagePackage.ALS_LEQ: return createALSLeq();
      case AlloyLanguagePackage.ALS_MORE: return createALSMore();
      case AlloyLanguagePackage.ALS_MEQ: return createALSMeq();
      case AlloyLanguagePackage.ALS_OVERRIDE: return createALSOverride();
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT: return createALSRangeRestrictionRight();
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_LEFT: return createALSRangeRestrictionLeft();
      case AlloyLanguagePackage.ALS_JOIN: return createALSJoin();
      case AlloyLanguagePackage.ALS_MINUS: return createALSMinus();
      case AlloyLanguagePackage.ALS_PLUS: return createALSPlus();
      case AlloyLanguagePackage.ALS_INTERSECTION: return createALSIntersection();
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT: return createALSDirectProduct();
      case AlloyLanguagePackage.ALS_NOT: return createALSNot();
      case AlloyLanguagePackage.ALS_INVERSE_RELATION: return createALSInverseRelation();
      case AlloyLanguagePackage.AL_STRANSITIVE_CLOSURE: return createAlSTransitiveClosure();
      case AlloyLanguagePackage.ALS_REFLECTIVE_TRANSITIVE_CLOSURE: return createALSReflectiveTransitiveClosure();
      case AlloyLanguagePackage.ALS_CARDINALITY: return createALSCardinality();
      case AlloyLanguagePackage.ALS_UNARY_MINUS: return createALSUnaryMinus();
      case AlloyLanguagePackage.ALS_SUM: return createALSSum();
      case AlloyLanguagePackage.ALS_FUNCTION_CALL: return createALSFunctionCall();
      case AlloyLanguagePackage.ALS_NONE: return createALSNone();
      case AlloyLanguagePackage.ALS_IDEN: return createALSIden();
      case AlloyLanguagePackage.ALS_UNIV: return createALSUniv();
      case AlloyLanguagePackage.ALS_INT: return createALSInt();
      case AlloyLanguagePackage.ALS_REFERENCE: return createALSReference();
      case AlloyLanguagePackage.ALS_NUMBER_LITERAL: return createALSNumberLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AlloyLanguagePackage.ALS_MULTIPLICITY:
        return createALSMultiplicityFromString(eDataType, initialValue);
      case AlloyLanguagePackage.ALS_NUMERIC_OPERATOR:
        return createALSNumericOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AlloyLanguagePackage.ALS_MULTIPLICITY:
        return convertALSMultiplicityToString(eDataType, instanceValue);
      case AlloyLanguagePackage.ALS_NUMERIC_OPERATOR:
        return convertALSNumericOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSDocument createALSDocument()
  {
    ALSDocumentImpl alsDocument = new ALSDocumentImpl();
    return alsDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRelationDeclaration createALSRelationDeclaration()
  {
    ALSRelationDeclarationImpl alsRelationDeclaration = new ALSRelationDeclarationImpl();
    return alsRelationDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTypeDeclaration createALSTypeDeclaration()
  {
    ALSTypeDeclarationImpl alsTypeDeclaration = new ALSTypeDeclarationImpl();
    return alsTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSEnumDeclaration createALSEnumDeclaration()
  {
    ALSEnumDeclarationImpl alsEnumDeclaration = new ALSEnumDeclarationImpl();
    return alsEnumDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSEnumLiteral createALSEnumLiteral()
  {
    ALSEnumLiteralImpl alsEnumLiteral = new ALSEnumLiteralImpl();
    return alsEnumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSSignatureDeclaration createALSSignatureDeclaration()
  {
    ALSSignatureDeclarationImpl alsSignatureDeclaration = new ALSSignatureDeclarationImpl();
    return alsSignatureDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSSignatureBody createALSSignatureBody()
  {
    ALSSignatureBodyImpl alsSignatureBody = new ALSSignatureBodyImpl();
    return alsSignatureBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSFieldDeclaration createALSFieldDeclaration()
  {
    ALSFieldDeclarationImpl alsFieldDeclaration = new ALSFieldDeclarationImpl();
    return alsFieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSDefinition createALSDefinition()
  {
    ALSDefinitionImpl alsDefinition = new ALSDefinitionImpl();
    return alsDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSFunctionDefinition createALSFunctionDefinition()
  {
    ALSFunctionDefinitionImpl alsFunctionDefinition = new ALSFunctionDefinitionImpl();
    return alsFunctionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRelationDefinition createALSRelationDefinition()
  {
    ALSRelationDefinitionImpl alsRelationDefinition = new ALSRelationDefinitionImpl();
    return alsRelationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSFactDeclaration createALSFactDeclaration()
  {
    ALSFactDeclarationImpl alsFactDeclaration = new ALSFactDeclarationImpl();
    return alsFactDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTerm createALSTerm()
  {
    ALSTermImpl alsTerm = new ALSTermImpl();
    return alsTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSVariableDeclaration createALSVariableDeclaration()
  {
    ALSVariableDeclarationImpl alsVariableDeclaration = new ALSVariableDeclarationImpl();
    return alsVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRunCommand createALSRunCommand()
  {
    ALSRunCommandImpl alsRunCommand = new ALSRunCommandImpl();
    return alsRunCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTypeScope createALSTypeScope()
  {
    ALSTypeScopeImpl alsTypeScope = new ALSTypeScopeImpl();
    return alsTypeScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSSigScope createALSSigScope()
  {
    ALSSigScopeImpl alsSigScope = new ALSSigScopeImpl();
    return alsSigScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSIntScope createALSIntScope()
  {
    ALSIntScopeImpl alsIntScope = new ALSIntScopeImpl();
    return alsIntScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSQuantifiedEx createALSQuantifiedEx()
  {
    ALSQuantifiedExImpl alsQuantifiedEx = new ALSQuantifiedExImpl();
    return alsQuantifiedEx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSOr createALSOr()
  {
    ALSOrImpl alsOr = new ALSOrImpl();
    return alsOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSIff createALSIff()
  {
    ALSIffImpl alsIff = new ALSIffImpl();
    return alsIff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSImpl createALSImpl()
  {
    ALSImplImpl alsImpl = new ALSImplImpl();
    return alsImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSAnd createALSAnd()
  {
    ALSAndImpl alsAnd = new ALSAndImpl();
    return alsAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSEquals createALSEquals()
  {
    ALSEqualsImpl alsEquals = new ALSEqualsImpl();
    return alsEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSNotEquals createALSNotEquals()
  {
    ALSNotEqualsImpl alsNotEquals = new ALSNotEqualsImpl();
    return alsNotEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSSubset createALSSubset()
  {
    ALSSubsetImpl alsSubset = new ALSSubsetImpl();
    return alsSubset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSLess createALSLess()
  {
    ALSLessImpl alsLess = new ALSLessImpl();
    return alsLess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSLeq createALSLeq()
  {
    ALSLeqImpl alsLeq = new ALSLeqImpl();
    return alsLeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMore createALSMore()
  {
    ALSMoreImpl alsMore = new ALSMoreImpl();
    return alsMore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMeq createALSMeq()
  {
    ALSMeqImpl alsMeq = new ALSMeqImpl();
    return alsMeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSOverride createALSOverride()
  {
    ALSOverrideImpl alsOverride = new ALSOverrideImpl();
    return alsOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRangeRestrictionRight createALSRangeRestrictionRight()
  {
    ALSRangeRestrictionRightImpl alsRangeRestrictionRight = new ALSRangeRestrictionRightImpl();
    return alsRangeRestrictionRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSRangeRestrictionLeft createALSRangeRestrictionLeft()
  {
    ALSRangeRestrictionLeftImpl alsRangeRestrictionLeft = new ALSRangeRestrictionLeftImpl();
    return alsRangeRestrictionLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSJoin createALSJoin()
  {
    ALSJoinImpl alsJoin = new ALSJoinImpl();
    return alsJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMinus createALSMinus()
  {
    ALSMinusImpl alsMinus = new ALSMinusImpl();
    return alsMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSPlus createALSPlus()
  {
    ALSPlusImpl alsPlus = new ALSPlusImpl();
    return alsPlus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSIntersection createALSIntersection()
  {
    ALSIntersectionImpl alsIntersection = new ALSIntersectionImpl();
    return alsIntersection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSDirectProduct createALSDirectProduct()
  {
    ALSDirectProductImpl alsDirectProduct = new ALSDirectProductImpl();
    return alsDirectProduct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSNot createALSNot()
  {
    ALSNotImpl alsNot = new ALSNotImpl();
    return alsNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSInverseRelation createALSInverseRelation()
  {
    ALSInverseRelationImpl alsInverseRelation = new ALSInverseRelationImpl();
    return alsInverseRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlSTransitiveClosure createAlSTransitiveClosure()
  {
    AlSTransitiveClosureImpl alSTransitiveClosure = new AlSTransitiveClosureImpl();
    return alSTransitiveClosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSReflectiveTransitiveClosure createALSReflectiveTransitiveClosure()
  {
    ALSReflectiveTransitiveClosureImpl alsReflectiveTransitiveClosure = new ALSReflectiveTransitiveClosureImpl();
    return alsReflectiveTransitiveClosure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSCardinality createALSCardinality()
  {
    ALSCardinalityImpl alsCardinality = new ALSCardinalityImpl();
    return alsCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSUnaryMinus createALSUnaryMinus()
  {
    ALSUnaryMinusImpl alsUnaryMinus = new ALSUnaryMinusImpl();
    return alsUnaryMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSSum createALSSum()
  {
    ALSSumImpl alsSum = new ALSSumImpl();
    return alsSum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSFunctionCall createALSFunctionCall()
  {
    ALSFunctionCallImpl alsFunctionCall = new ALSFunctionCallImpl();
    return alsFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSNone createALSNone()
  {
    ALSNoneImpl alsNone = new ALSNoneImpl();
    return alsNone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSIden createALSIden()
  {
    ALSIdenImpl alsIden = new ALSIdenImpl();
    return alsIden;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSUniv createALSUniv()
  {
    ALSUnivImpl alsUniv = new ALSUnivImpl();
    return alsUniv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSInt createALSInt()
  {
    ALSIntImpl alsInt = new ALSIntImpl();
    return alsInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSReference createALSReference()
  {
    ALSReferenceImpl alsReference = new ALSReferenceImpl();
    return alsReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSNumberLiteral createALSNumberLiteral()
  {
    ALSNumberLiteralImpl alsNumberLiteral = new ALSNumberLiteralImpl();
    return alsNumberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMultiplicity createALSMultiplicityFromString(EDataType eDataType, String initialValue)
  {
    ALSMultiplicity result = ALSMultiplicity.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertALSMultiplicityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSNumericOperator createALSNumericOperatorFromString(EDataType eDataType, String initialValue)
  {
    ALSNumericOperator result = ALSNumericOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertALSNumericOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlloyLanguagePackage getAlloyLanguagePackage()
  {
    return (AlloyLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AlloyLanguagePackage getPackage()
  {
    return AlloyLanguagePackage.eINSTANCE;
  }

} //AlloyLanguageFactoryImpl
