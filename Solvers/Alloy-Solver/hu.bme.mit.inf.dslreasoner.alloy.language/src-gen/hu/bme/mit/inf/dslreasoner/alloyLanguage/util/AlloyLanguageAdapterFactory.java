/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.util;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage
 * @generated
 */
public class AlloyLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlloyLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlloyLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AlloyLanguagePackage.eINSTANCE;
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
  protected AlloyLanguageSwitch<Adapter> modelSwitch =
    new AlloyLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseALSDocument(ALSDocument object)
      {
        return createALSDocumentAdapter();
      }
      @Override
      public Adapter caseALSRelationDeclaration(ALSRelationDeclaration object)
      {
        return createALSRelationDeclarationAdapter();
      }
      @Override
      public Adapter caseALSTypeDeclaration(ALSTypeDeclaration object)
      {
        return createALSTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseALSEnumDeclaration(ALSEnumDeclaration object)
      {
        return createALSEnumDeclarationAdapter();
      }
      @Override
      public Adapter caseALSEnumLiteral(ALSEnumLiteral object)
      {
        return createALSEnumLiteralAdapter();
      }
      @Override
      public Adapter caseALSSignatureDeclaration(ALSSignatureDeclaration object)
      {
        return createALSSignatureDeclarationAdapter();
      }
      @Override
      public Adapter caseALSSignatureBody(ALSSignatureBody object)
      {
        return createALSSignatureBodyAdapter();
      }
      @Override
      public Adapter caseALSFieldDeclaration(ALSFieldDeclaration object)
      {
        return createALSFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseALSDefinition(ALSDefinition object)
      {
        return createALSDefinitionAdapter();
      }
      @Override
      public Adapter caseALSFunctionDefinition(ALSFunctionDefinition object)
      {
        return createALSFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseALSRelationDefinition(ALSRelationDefinition object)
      {
        return createALSRelationDefinitionAdapter();
      }
      @Override
      public Adapter caseALSFactDeclaration(ALSFactDeclaration object)
      {
        return createALSFactDeclarationAdapter();
      }
      @Override
      public Adapter caseALSTerm(ALSTerm object)
      {
        return createALSTermAdapter();
      }
      @Override
      public Adapter caseALSVariableDeclaration(ALSVariableDeclaration object)
      {
        return createALSVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseALSRunCommand(ALSRunCommand object)
      {
        return createALSRunCommandAdapter();
      }
      @Override
      public Adapter caseALSTypeScope(ALSTypeScope object)
      {
        return createALSTypeScopeAdapter();
      }
      @Override
      public Adapter caseALSSigScope(ALSSigScope object)
      {
        return createALSSigScopeAdapter();
      }
      @Override
      public Adapter caseALSIntScope(ALSIntScope object)
      {
        return createALSIntScopeAdapter();
      }
      @Override
      public Adapter caseALSStringScope(ALSStringScope object)
      {
        return createALSStringScopeAdapter();
      }
      @Override
      public Adapter caseALSQuantifiedEx(ALSQuantifiedEx object)
      {
        return createALSQuantifiedExAdapter();
      }
      @Override
      public Adapter caseALSOr(ALSOr object)
      {
        return createALSOrAdapter();
      }
      @Override
      public Adapter caseALSIff(ALSIff object)
      {
        return createALSIffAdapter();
      }
      @Override
      public Adapter caseALSImpl(ALSImpl object)
      {
        return createALSImplAdapter();
      }
      @Override
      public Adapter caseALSAnd(ALSAnd object)
      {
        return createALSAndAdapter();
      }
      @Override
      public Adapter caseALSEquals(ALSEquals object)
      {
        return createALSEqualsAdapter();
      }
      @Override
      public Adapter caseALSNotEquals(ALSNotEquals object)
      {
        return createALSNotEqualsAdapter();
      }
      @Override
      public Adapter caseALSSubset(ALSSubset object)
      {
        return createALSSubsetAdapter();
      }
      @Override
      public Adapter caseALSLess(ALSLess object)
      {
        return createALSLessAdapter();
      }
      @Override
      public Adapter caseALSLeq(ALSLeq object)
      {
        return createALSLeqAdapter();
      }
      @Override
      public Adapter caseALSMore(ALSMore object)
      {
        return createALSMoreAdapter();
      }
      @Override
      public Adapter caseALSMeq(ALSMeq object)
      {
        return createALSMeqAdapter();
      }
      @Override
      public Adapter caseALSOverride(ALSOverride object)
      {
        return createALSOverrideAdapter();
      }
      @Override
      public Adapter caseALSRangeRestrictionRight(ALSRangeRestrictionRight object)
      {
        return createALSRangeRestrictionRightAdapter();
      }
      @Override
      public Adapter caseALSRangeRestrictionLeft(ALSRangeRestrictionLeft object)
      {
        return createALSRangeRestrictionLeftAdapter();
      }
      @Override
      public Adapter caseALSJoin(ALSJoin object)
      {
        return createALSJoinAdapter();
      }
      @Override
      public Adapter caseALSMinus(ALSMinus object)
      {
        return createALSMinusAdapter();
      }
      @Override
      public Adapter caseALSPlus(ALSPlus object)
      {
        return createALSPlusAdapter();
      }
      @Override
      public Adapter caseALSIntersection(ALSIntersection object)
      {
        return createALSIntersectionAdapter();
      }
      @Override
      public Adapter caseALSDirectProduct(ALSDirectProduct object)
      {
        return createALSDirectProductAdapter();
      }
      @Override
      public Adapter caseALSNot(ALSNot object)
      {
        return createALSNotAdapter();
      }
      @Override
      public Adapter caseALSInverseRelation(ALSInverseRelation object)
      {
        return createALSInverseRelationAdapter();
      }
      @Override
      public Adapter caseAlSTransitiveClosure(AlSTransitiveClosure object)
      {
        return createAlSTransitiveClosureAdapter();
      }
      @Override
      public Adapter caseALSReflectiveTransitiveClosure(ALSReflectiveTransitiveClosure object)
      {
        return createALSReflectiveTransitiveClosureAdapter();
      }
      @Override
      public Adapter caseALSCardinality(ALSCardinality object)
      {
        return createALSCardinalityAdapter();
      }
      @Override
      public Adapter caseALSUnaryMinus(ALSUnaryMinus object)
      {
        return createALSUnaryMinusAdapter();
      }
      @Override
      public Adapter caseALSSum(ALSSum object)
      {
        return createALSSumAdapter();
      }
      @Override
      public Adapter caseALSFunctionCall(ALSFunctionCall object)
      {
        return createALSFunctionCallAdapter();
      }
      @Override
      public Adapter caseALSNone(ALSNone object)
      {
        return createALSNoneAdapter();
      }
      @Override
      public Adapter caseALSIden(ALSIden object)
      {
        return createALSIdenAdapter();
      }
      @Override
      public Adapter caseALSUniv(ALSUniv object)
      {
        return createALSUnivAdapter();
      }
      @Override
      public Adapter caseALSInt(ALSInt object)
      {
        return createALSIntAdapter();
      }
      @Override
      public Adapter caseALSString(ALSString object)
      {
        return createALSStringAdapter();
      }
      @Override
      public Adapter caseALSReference(ALSReference object)
      {
        return createALSReferenceAdapter();
      }
      @Override
      public Adapter caseALSNumberLiteral(ALSNumberLiteral object)
      {
        return createALSNumberLiteralAdapter();
      }
      @Override
      public Adapter caseALSStringLiteral(ALSStringLiteral object)
      {
        return createALSStringLiteralAdapter();
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
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument <em>ALS Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument
   * @generated
   */
  public Adapter createALSDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration <em>ALS Relation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration
   * @generated
   */
  public Adapter createALSRelationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeDeclaration <em>ALS Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeDeclaration
   * @generated
   */
  public Adapter createALSTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration <em>ALS Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration
   * @generated
   */
  public Adapter createALSEnumDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumLiteral <em>ALS Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumLiteral
   * @generated
   */
  public Adapter createALSEnumLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration <em>ALS Signature Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
   * @generated
   */
  public Adapter createALSSignatureDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody <em>ALS Signature Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
   * @generated
   */
  public Adapter createALSSignatureBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration <em>ALS Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration
   * @generated
   */
  public Adapter createALSFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition <em>ALS Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition
   * @generated
   */
  public Adapter createALSDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition <em>ALS Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition
   * @generated
   */
  public Adapter createALSFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition <em>ALS Relation Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition
   * @generated
   */
  public Adapter createALSRelationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration <em>ALS Fact Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration
   * @generated
   */
  public Adapter createALSFactDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm <em>ALS Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm
   * @generated
   */
  public Adapter createALSTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration <em>ALS Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration
   * @generated
   */
  public Adapter createALSVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand <em>ALS Run Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand
   * @generated
   */
  public Adapter createALSRunCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope <em>ALS Type Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope
   * @generated
   */
  public Adapter createALSTypeScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope <em>ALS Sig Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope
   * @generated
   */
  public Adapter createALSSigScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntScope <em>ALS Int Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntScope
   * @generated
   */
  public Adapter createALSIntScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringScope <em>ALS String Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringScope
   * @generated
   */
  public Adapter createALSStringScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx <em>ALS Quantified Ex</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx
   * @generated
   */
  public Adapter createALSQuantifiedExAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr <em>ALS Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr
   * @generated
   */
  public Adapter createALSOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff <em>ALS Iff</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff
   * @generated
   */
  public Adapter createALSIffAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl <em>ALS Impl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl
   * @generated
   */
  public Adapter createALSImplAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd <em>ALS And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd
   * @generated
   */
  public Adapter createALSAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals <em>ALS Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals
   * @generated
   */
  public Adapter createALSEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals <em>ALS Not Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals
   * @generated
   */
  public Adapter createALSNotEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset <em>ALS Subset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset
   * @generated
   */
  public Adapter createALSSubsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess <em>ALS Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess
   * @generated
   */
  public Adapter createALSLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq <em>ALS Leq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq
   * @generated
   */
  public Adapter createALSLeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore <em>ALS More</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore
   * @generated
   */
  public Adapter createALSMoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq <em>ALS Meq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq
   * @generated
   */
  public Adapter createALSMeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride <em>ALS Override</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride
   * @generated
   */
  public Adapter createALSOverrideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight <em>ALS Range Restriction Right</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight
   * @generated
   */
  public Adapter createALSRangeRestrictionRightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft <em>ALS Range Restriction Left</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft
   * @generated
   */
  public Adapter createALSRangeRestrictionLeftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin <em>ALS Join</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin
   * @generated
   */
  public Adapter createALSJoinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus <em>ALS Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus
   * @generated
   */
  public Adapter createALSMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus <em>ALS Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus
   * @generated
   */
  public Adapter createALSPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection <em>ALS Intersection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection
   * @generated
   */
  public Adapter createALSIntersectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct <em>ALS Direct Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct
   * @generated
   */
  public Adapter createALSDirectProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNot <em>ALS Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNot
   * @generated
   */
  public Adapter createALSNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInverseRelation <em>ALS Inverse Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInverseRelation
   * @generated
   */
  public Adapter createALSInverseRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.AlSTransitiveClosure <em>Al STransitive Closure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlSTransitiveClosure
   * @generated
   */
  public Adapter createAlSTransitiveClosureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure <em>ALS Reflective Transitive Closure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure
   * @generated
   */
  public Adapter createALSReflectiveTransitiveClosureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSCardinality <em>ALS Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSCardinality
   * @generated
   */
  public Adapter createALSCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUnaryMinus <em>ALS Unary Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUnaryMinus
   * @generated
   */
  public Adapter createALSUnaryMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum <em>ALS Sum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum
   * @generated
   */
  public Adapter createALSSumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall <em>ALS Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall
   * @generated
   */
  public Adapter createALSFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNone <em>ALS None</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNone
   * @generated
   */
  public Adapter createALSNoneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIden <em>ALS Iden</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIden
   * @generated
   */
  public Adapter createALSIdenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUniv <em>ALS Univ</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUniv
   * @generated
   */
  public Adapter createALSUnivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInt <em>ALS Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInt
   * @generated
   */
  public Adapter createALSIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSString <em>ALS String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSString
   * @generated
   */
  public Adapter createALSStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference <em>ALS Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference
   * @generated
   */
  public Adapter createALSReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral <em>ALS Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral
   * @generated
   */
  public Adapter createALSNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringLiteral <em>ALS String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringLiteral
   * @generated
   */
  public Adapter createALSStringLiteralAdapter()
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

} //AlloyLanguageAdapterFactory
