/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.util;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.*;

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
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage
 * @generated
 */
public class AlloyLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlloyLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlloyLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AlloyLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
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
      case AlloyLanguagePackage.ALS_DOCUMENT:
      {
        ALSDocument alsDocument = (ALSDocument)theEObject;
        T result = caseALSDocument(alsDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_RELATION_DECLARATION:
      {
        ALSRelationDeclaration alsRelationDeclaration = (ALSRelationDeclaration)theEObject;
        T result = caseALSRelationDeclaration(alsRelationDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_TYPE_DECLARATION:
      {
        ALSTypeDeclaration alsTypeDeclaration = (ALSTypeDeclaration)theEObject;
        T result = caseALSTypeDeclaration(alsTypeDeclaration);
        if (result == null) result = caseALSRelationDeclaration(alsTypeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_ENUM_DECLARATION:
      {
        ALSEnumDeclaration alsEnumDeclaration = (ALSEnumDeclaration)theEObject;
        T result = caseALSEnumDeclaration(alsEnumDeclaration);
        if (result == null) result = caseALSTypeDeclaration(alsEnumDeclaration);
        if (result == null) result = caseALSRelationDeclaration(alsEnumDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_ENUM_LITERAL:
      {
        ALSEnumLiteral alsEnumLiteral = (ALSEnumLiteral)theEObject;
        T result = caseALSEnumLiteral(alsEnumLiteral);
        if (result == null) result = caseALSRelationDeclaration(alsEnumLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_SIGNATURE_DECLARATION:
      {
        ALSSignatureDeclaration alsSignatureDeclaration = (ALSSignatureDeclaration)theEObject;
        T result = caseALSSignatureDeclaration(alsSignatureDeclaration);
        if (result == null) result = caseALSTypeDeclaration(alsSignatureDeclaration);
        if (result == null) result = caseALSRelationDeclaration(alsSignatureDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_SIGNATURE_BODY:
      {
        ALSSignatureBody alsSignatureBody = (ALSSignatureBody)theEObject;
        T result = caseALSSignatureBody(alsSignatureBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_FIELD_DECLARATION:
      {
        ALSFieldDeclaration alsFieldDeclaration = (ALSFieldDeclaration)theEObject;
        T result = caseALSFieldDeclaration(alsFieldDeclaration);
        if (result == null) result = caseALSRelationDeclaration(alsFieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_DEFINITION:
      {
        ALSDefinition alsDefinition = (ALSDefinition)theEObject;
        T result = caseALSDefinition(alsDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_FUNCTION_DEFINITION:
      {
        ALSFunctionDefinition alsFunctionDefinition = (ALSFunctionDefinition)theEObject;
        T result = caseALSFunctionDefinition(alsFunctionDefinition);
        if (result == null) result = caseALSDefinition(alsFunctionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_RELATION_DEFINITION:
      {
        ALSRelationDefinition alsRelationDefinition = (ALSRelationDefinition)theEObject;
        T result = caseALSRelationDefinition(alsRelationDefinition);
        if (result == null) result = caseALSDefinition(alsRelationDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_FACT_DECLARATION:
      {
        ALSFactDeclaration alsFactDeclaration = (ALSFactDeclaration)theEObject;
        T result = caseALSFactDeclaration(alsFactDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_TERM:
      {
        ALSTerm alsTerm = (ALSTerm)theEObject;
        T result = caseALSTerm(alsTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_VARIABLE_DECLARATION:
      {
        ALSVariableDeclaration alsVariableDeclaration = (ALSVariableDeclaration)theEObject;
        T result = caseALSVariableDeclaration(alsVariableDeclaration);
        if (result == null) result = caseALSRelationDeclaration(alsVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_RUN_COMMAND:
      {
        ALSRunCommand alsRunCommand = (ALSRunCommand)theEObject;
        T result = caseALSRunCommand(alsRunCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_TYPE_SCOPE:
      {
        ALSTypeScope alsTypeScope = (ALSTypeScope)theEObject;
        T result = caseALSTypeScope(alsTypeScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_SIG_SCOPE:
      {
        ALSSigScope alsSigScope = (ALSSigScope)theEObject;
        T result = caseALSSigScope(alsSigScope);
        if (result == null) result = caseALSTypeScope(alsSigScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_INT_SCOPE:
      {
        ALSIntScope alsIntScope = (ALSIntScope)theEObject;
        T result = caseALSIntScope(alsIntScope);
        if (result == null) result = caseALSTypeScope(alsIntScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_STRING_SCOPE:
      {
        ALSStringScope alsStringScope = (ALSStringScope)theEObject;
        T result = caseALSStringScope(alsStringScope);
        if (result == null) result = caseALSTypeScope(alsStringScope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX:
      {
        ALSQuantifiedEx alsQuantifiedEx = (ALSQuantifiedEx)theEObject;
        T result = caseALSQuantifiedEx(alsQuantifiedEx);
        if (result == null) result = caseALSTerm(alsQuantifiedEx);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_OR:
      {
        ALSOr alsOr = (ALSOr)theEObject;
        T result = caseALSOr(alsOr);
        if (result == null) result = caseALSTerm(alsOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_IFF:
      {
        ALSIff alsIff = (ALSIff)theEObject;
        T result = caseALSIff(alsIff);
        if (result == null) result = caseALSTerm(alsIff);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_IMPL:
      {
        ALSImpl alsImpl = (ALSImpl)theEObject;
        T result = caseALSImpl(alsImpl);
        if (result == null) result = caseALSTerm(alsImpl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_AND:
      {
        ALSAnd alsAnd = (ALSAnd)theEObject;
        T result = caseALSAnd(alsAnd);
        if (result == null) result = caseALSTerm(alsAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_EQUALS:
      {
        ALSEquals alsEquals = (ALSEquals)theEObject;
        T result = caseALSEquals(alsEquals);
        if (result == null) result = caseALSTerm(alsEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_NOT_EQUALS:
      {
        ALSNotEquals alsNotEquals = (ALSNotEquals)theEObject;
        T result = caseALSNotEquals(alsNotEquals);
        if (result == null) result = caseALSTerm(alsNotEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_SUBSET:
      {
        ALSSubset alsSubset = (ALSSubset)theEObject;
        T result = caseALSSubset(alsSubset);
        if (result == null) result = caseALSTerm(alsSubset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_LESS:
      {
        ALSLess alsLess = (ALSLess)theEObject;
        T result = caseALSLess(alsLess);
        if (result == null) result = caseALSTerm(alsLess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_LEQ:
      {
        ALSLeq alsLeq = (ALSLeq)theEObject;
        T result = caseALSLeq(alsLeq);
        if (result == null) result = caseALSTerm(alsLeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_MORE:
      {
        ALSMore alsMore = (ALSMore)theEObject;
        T result = caseALSMore(alsMore);
        if (result == null) result = caseALSTerm(alsMore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_MEQ:
      {
        ALSMeq alsMeq = (ALSMeq)theEObject;
        T result = caseALSMeq(alsMeq);
        if (result == null) result = caseALSTerm(alsMeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_OVERRIDE:
      {
        ALSOverride alsOverride = (ALSOverride)theEObject;
        T result = caseALSOverride(alsOverride);
        if (result == null) result = caseALSTerm(alsOverride);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_RIGHT:
      {
        ALSRangeRestrictionRight alsRangeRestrictionRight = (ALSRangeRestrictionRight)theEObject;
        T result = caseALSRangeRestrictionRight(alsRangeRestrictionRight);
        if (result == null) result = caseALSTerm(alsRangeRestrictionRight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_RANGE_RESTRICTION_LEFT:
      {
        ALSRangeRestrictionLeft alsRangeRestrictionLeft = (ALSRangeRestrictionLeft)theEObject;
        T result = caseALSRangeRestrictionLeft(alsRangeRestrictionLeft);
        if (result == null) result = caseALSTerm(alsRangeRestrictionLeft);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_JOIN:
      {
        ALSJoin alsJoin = (ALSJoin)theEObject;
        T result = caseALSJoin(alsJoin);
        if (result == null) result = caseALSTerm(alsJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_MINUS:
      {
        ALSMinus alsMinus = (ALSMinus)theEObject;
        T result = caseALSMinus(alsMinus);
        if (result == null) result = caseALSTerm(alsMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_PLUS:
      {
        ALSPlus alsPlus = (ALSPlus)theEObject;
        T result = caseALSPlus(alsPlus);
        if (result == null) result = caseALSTerm(alsPlus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_INTERSECTION:
      {
        ALSIntersection alsIntersection = (ALSIntersection)theEObject;
        T result = caseALSIntersection(alsIntersection);
        if (result == null) result = caseALSTerm(alsIntersection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_DIRECT_PRODUCT:
      {
        ALSDirectProduct alsDirectProduct = (ALSDirectProduct)theEObject;
        T result = caseALSDirectProduct(alsDirectProduct);
        if (result == null) result = caseALSTerm(alsDirectProduct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_NOT:
      {
        ALSNot alsNot = (ALSNot)theEObject;
        T result = caseALSNot(alsNot);
        if (result == null) result = caseALSTerm(alsNot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_INVERSE_RELATION:
      {
        ALSInverseRelation alsInverseRelation = (ALSInverseRelation)theEObject;
        T result = caseALSInverseRelation(alsInverseRelation);
        if (result == null) result = caseALSTerm(alsInverseRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.AL_STRANSITIVE_CLOSURE:
      {
        AlSTransitiveClosure alSTransitiveClosure = (AlSTransitiveClosure)theEObject;
        T result = caseAlSTransitiveClosure(alSTransitiveClosure);
        if (result == null) result = caseALSTerm(alSTransitiveClosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_REFLECTIVE_TRANSITIVE_CLOSURE:
      {
        ALSReflectiveTransitiveClosure alsReflectiveTransitiveClosure = (ALSReflectiveTransitiveClosure)theEObject;
        T result = caseALSReflectiveTransitiveClosure(alsReflectiveTransitiveClosure);
        if (result == null) result = caseALSTerm(alsReflectiveTransitiveClosure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_CARDINALITY:
      {
        ALSCardinality alsCardinality = (ALSCardinality)theEObject;
        T result = caseALSCardinality(alsCardinality);
        if (result == null) result = caseALSTerm(alsCardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_UNARY_MINUS:
      {
        ALSUnaryMinus alsUnaryMinus = (ALSUnaryMinus)theEObject;
        T result = caseALSUnaryMinus(alsUnaryMinus);
        if (result == null) result = caseALSTerm(alsUnaryMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_SUM:
      {
        ALSSum alsSum = (ALSSum)theEObject;
        T result = caseALSSum(alsSum);
        if (result == null) result = caseALSTerm(alsSum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_FUNCTION_CALL:
      {
        ALSFunctionCall alsFunctionCall = (ALSFunctionCall)theEObject;
        T result = caseALSFunctionCall(alsFunctionCall);
        if (result == null) result = caseALSTerm(alsFunctionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_NONE:
      {
        ALSNone alsNone = (ALSNone)theEObject;
        T result = caseALSNone(alsNone);
        if (result == null) result = caseALSTerm(alsNone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_IDEN:
      {
        ALSIden alsIden = (ALSIden)theEObject;
        T result = caseALSIden(alsIden);
        if (result == null) result = caseALSTerm(alsIden);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_UNIV:
      {
        ALSUniv alsUniv = (ALSUniv)theEObject;
        T result = caseALSUniv(alsUniv);
        if (result == null) result = caseALSTerm(alsUniv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_INT:
      {
        ALSInt alsInt = (ALSInt)theEObject;
        T result = caseALSInt(alsInt);
        if (result == null) result = caseALSTerm(alsInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_STRING:
      {
        ALSString alsString = (ALSString)theEObject;
        T result = caseALSString(alsString);
        if (result == null) result = caseALSTerm(alsString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_REFERENCE:
      {
        ALSReference alsReference = (ALSReference)theEObject;
        T result = caseALSReference(alsReference);
        if (result == null) result = caseALSTerm(alsReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_NUMBER_LITERAL:
      {
        ALSNumberLiteral alsNumberLiteral = (ALSNumberLiteral)theEObject;
        T result = caseALSNumberLiteral(alsNumberLiteral);
        if (result == null) result = caseALSTerm(alsNumberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlloyLanguagePackage.ALS_STRING_LITERAL:
      {
        ALSStringLiteral alsStringLiteral = (ALSStringLiteral)theEObject;
        T result = caseALSStringLiteral(alsStringLiteral);
        if (result == null) result = caseALSTerm(alsStringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSDocument(ALSDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Relation Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Relation Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSRelationDeclaration(ALSRelationDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Type Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSTypeDeclaration(ALSTypeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Enum Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSEnumDeclaration(ALSEnumDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Enum Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSEnumLiteral(ALSEnumLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Signature Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Signature Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSSignatureDeclaration(ALSSignatureDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Signature Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Signature Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSSignatureBody(ALSSignatureBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSFieldDeclaration(ALSFieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSDefinition(ALSDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSFunctionDefinition(ALSFunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Relation Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Relation Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSRelationDefinition(ALSRelationDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Fact Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Fact Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSFactDeclaration(ALSFactDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSTerm(ALSTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSVariableDeclaration(ALSVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Run Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Run Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSRunCommand(ALSRunCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Type Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Type Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSTypeScope(ALSTypeScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Sig Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Sig Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSSigScope(ALSSigScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Int Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Int Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSIntScope(ALSIntScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS String Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS String Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSStringScope(ALSStringScope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Quantified Ex</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Quantified Ex</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSQuantifiedEx(ALSQuantifiedEx object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSOr(ALSOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Iff</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Iff</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSIff(ALSIff object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Impl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Impl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSImpl(ALSImpl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSAnd(ALSAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSEquals(ALSEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Not Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Not Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSNotEquals(ALSNotEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Subset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Subset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSSubset(ALSSubset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Less</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Less</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSLess(ALSLess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Leq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Leq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSLeq(ALSLeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS More</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS More</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSMore(ALSMore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Meq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Meq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSMeq(ALSMeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Override</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSOverride(ALSOverride object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Range Restriction Right</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Range Restriction Right</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSRangeRestrictionRight(ALSRangeRestrictionRight object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Range Restriction Left</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Range Restriction Left</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSRangeRestrictionLeft(ALSRangeRestrictionLeft object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSJoin(ALSJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSMinus(ALSMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSPlus(ALSPlus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Intersection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Intersection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSIntersection(ALSIntersection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Direct Product</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Direct Product</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSDirectProduct(ALSDirectProduct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSNot(ALSNot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Inverse Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Inverse Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSInverseRelation(ALSInverseRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Al STransitive Closure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Al STransitive Closure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlSTransitiveClosure(AlSTransitiveClosure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Reflective Transitive Closure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Reflective Transitive Closure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSReflectiveTransitiveClosure(ALSReflectiveTransitiveClosure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSCardinality(ALSCardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Unary Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Unary Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSUnaryMinus(ALSUnaryMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Sum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Sum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSSum(ALSSum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSFunctionCall(ALSFunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS None</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS None</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSNone(ALSNone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Iden</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Iden</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSIden(ALSIden object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Univ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Univ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSUniv(ALSUniv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSInt(ALSInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSString(ALSString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSReference(ALSReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSNumberLiteral(ALSNumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ALS String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ALS String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseALSStringLiteral(ALSStringLiteral object)
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

} //AlloyLanguageSwitch
