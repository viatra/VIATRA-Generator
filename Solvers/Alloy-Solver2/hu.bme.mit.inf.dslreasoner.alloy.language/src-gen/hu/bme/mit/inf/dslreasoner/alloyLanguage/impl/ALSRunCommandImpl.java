/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALS Run Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRunCommandImpl#getTypeScopes <em>Type Scopes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSRunCommandImpl extends MinimalEObjectImpl.Container implements ALSRunCommand
{
  /**
   * The cached value of the '{@link #getTypeScopes() <em>Type Scopes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeScopes()
   * @generated
   * @ordered
   */
  protected EList<ALSTypeScope> typeScopes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSRunCommandImpl()
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
    return AlloyLanguagePackage.Literals.ALS_RUN_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSTypeScope> getTypeScopes()
  {
    if (typeScopes == null)
    {
      typeScopes = new EObjectContainmentEList<ALSTypeScope>(ALSTypeScope.class, this, AlloyLanguagePackage.ALS_RUN_COMMAND__TYPE_SCOPES);
    }
    return typeScopes;
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
      case AlloyLanguagePackage.ALS_RUN_COMMAND__TYPE_SCOPES:
        return ((InternalEList<?>)getTypeScopes()).basicRemove(otherEnd, msgs);
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
      case AlloyLanguagePackage.ALS_RUN_COMMAND__TYPE_SCOPES:
        return getTypeScopes();
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
      case AlloyLanguagePackage.ALS_RUN_COMMAND__TYPE_SCOPES:
        getTypeScopes().clear();
        getTypeScopes().addAll((Collection<? extends ALSTypeScope>)newValue);
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
      case AlloyLanguagePackage.ALS_RUN_COMMAND__TYPE_SCOPES:
        getTypeScopes().clear();
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
      case AlloyLanguagePackage.ALS_RUN_COMMAND__TYPE_SCOPES:
        return typeScopes != null && !typeScopes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ALSRunCommandImpl
