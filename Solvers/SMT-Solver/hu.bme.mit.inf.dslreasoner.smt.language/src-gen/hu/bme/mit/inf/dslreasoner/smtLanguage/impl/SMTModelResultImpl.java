/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Model Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModelResultImpl#getNewFunctionDeclarations <em>New Function Declarations</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModelResultImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModelResultImpl#getNewFunctionDefinitions <em>New Function Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTModelResultImpl extends SMTResultImpl implements SMTModelResult
{
  /**
   * The cached value of the '{@link #getNewFunctionDeclarations() <em>New Function Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewFunctionDeclarations()
   * @generated
   * @ordered
   */
  protected EList<SMTFunctionDeclaration> newFunctionDeclarations;

  /**
   * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinitions()
   * @generated
   * @ordered
   */
  protected EList<SMTCardinalityConstraint> typeDefinitions;

  /**
   * The cached value of the '{@link #getNewFunctionDefinitions() <em>New Function Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewFunctionDefinitions()
   * @generated
   * @ordered
   */
  protected EList<SMTFunctionDefinition> newFunctionDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTModelResultImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmtLanguagePackage.Literals.SMT_MODEL_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTFunctionDeclaration> getNewFunctionDeclarations()
  {
    if (newFunctionDeclarations == null)
    {
      newFunctionDeclarations = new EObjectContainmentEList<SMTFunctionDeclaration>(SMTFunctionDeclaration.class, this, SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS);
    }
    return newFunctionDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTCardinalityConstraint> getTypeDefinitions()
  {
    if (typeDefinitions == null)
    {
      typeDefinitions = new EObjectContainmentEList<SMTCardinalityConstraint>(SMTCardinalityConstraint.class, this, SmtLanguagePackage.SMT_MODEL_RESULT__TYPE_DEFINITIONS);
    }
    return typeDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SMTFunctionDefinition> getNewFunctionDefinitions()
  {
    if (newFunctionDefinitions == null)
    {
      newFunctionDefinitions = new EObjectContainmentEList<SMTFunctionDefinition>(SMTFunctionDefinition.class, this, SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS);
    }
    return newFunctionDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS:
        return ((InternalEList<?>)getNewFunctionDeclarations()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_MODEL_RESULT__TYPE_DEFINITIONS:
        return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS:
        return ((InternalEList<?>)getNewFunctionDefinitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS:
        return getNewFunctionDeclarations();
      case SmtLanguagePackage.SMT_MODEL_RESULT__TYPE_DEFINITIONS:
        return getTypeDefinitions();
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS:
        return getNewFunctionDefinitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS:
        getNewFunctionDeclarations().clear();
        getNewFunctionDeclarations().addAll((Collection<? extends SMTFunctionDeclaration>)newValue);
        return;
      case SmtLanguagePackage.SMT_MODEL_RESULT__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
        getTypeDefinitions().addAll((Collection<? extends SMTCardinalityConstraint>)newValue);
        return;
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS:
        getNewFunctionDefinitions().clear();
        getNewFunctionDefinitions().addAll((Collection<? extends SMTFunctionDefinition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS:
        getNewFunctionDeclarations().clear();
        return;
      case SmtLanguagePackage.SMT_MODEL_RESULT__TYPE_DEFINITIONS:
        getTypeDefinitions().clear();
        return;
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS:
        getNewFunctionDefinitions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS:
        return newFunctionDeclarations != null && !newFunctionDeclarations.isEmpty();
      case SmtLanguagePackage.SMT_MODEL_RESULT__TYPE_DEFINITIONS:
        return typeDefinitions != null && !typeDefinitions.isEmpty();
      case SmtLanguagePackage.SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS:
        return newFunctionDefinitions != null && !newFunctionDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SMTModelResultImpl
