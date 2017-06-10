/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ALS Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionCallImpl#getReferredDefinition <em>Referred Definition</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionCallImpl#getReferredNumericOperator <em>Referred Numeric Operator</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionCallImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSFunctionCallImpl extends ALSTermImpl implements ALSFunctionCall
{
  /**
   * The cached value of the '{@link #getReferredDefinition() <em>Referred Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferredDefinition()
   * @generated
   * @ordered
   */
  protected ALSDefinition referredDefinition;

  /**
   * The default value of the '{@link #getReferredNumericOperator() <em>Referred Numeric Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferredNumericOperator()
   * @generated
   * @ordered
   */
  protected static final ALSNumericOperator REFERRED_NUMERIC_OPERATOR_EDEFAULT = ALSNumericOperator.PLUS;

  /**
   * The cached value of the '{@link #getReferredNumericOperator() <em>Referred Numeric Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferredNumericOperator()
   * @generated
   * @ordered
   */
  protected ALSNumericOperator referredNumericOperator = REFERRED_NUMERIC_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<ALSTerm> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSFunctionCallImpl()
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
    return AlloyLanguagePackage.Literals.ALS_FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSDefinition getReferredDefinition()
  {
    if (referredDefinition != null && referredDefinition.eIsProxy())
    {
      InternalEObject oldReferredDefinition = (InternalEObject)referredDefinition;
      referredDefinition = (ALSDefinition)eResolveProxy(oldReferredDefinition);
      if (referredDefinition != oldReferredDefinition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_DEFINITION, oldReferredDefinition, referredDefinition));
      }
    }
    return referredDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSDefinition basicGetReferredDefinition()
  {
    return referredDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferredDefinition(ALSDefinition newReferredDefinition)
  {
    ALSDefinition oldReferredDefinition = referredDefinition;
    referredDefinition = newReferredDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_DEFINITION, oldReferredDefinition, referredDefinition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSNumericOperator getReferredNumericOperator()
  {
    return referredNumericOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferredNumericOperator(ALSNumericOperator newReferredNumericOperator)
  {
    ALSNumericOperator oldReferredNumericOperator = referredNumericOperator;
    referredNumericOperator = newReferredNumericOperator == null ? REFERRED_NUMERIC_OPERATOR_EDEFAULT : newReferredNumericOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR, oldReferredNumericOperator, referredNumericOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSTerm> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ALSTerm>(ALSTerm.class, this, AlloyLanguagePackage.ALS_FUNCTION_CALL__PARAMS);
    }
    return params;
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
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_DEFINITION:
        if (resolve) return getReferredDefinition();
        return basicGetReferredDefinition();
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR:
        return getReferredNumericOperator();
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__PARAMS:
        return getParams();
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
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_DEFINITION:
        setReferredDefinition((ALSDefinition)newValue);
        return;
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR:
        setReferredNumericOperator((ALSNumericOperator)newValue);
        return;
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ALSTerm>)newValue);
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
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_DEFINITION:
        setReferredDefinition((ALSDefinition)null);
        return;
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR:
        setReferredNumericOperator(REFERRED_NUMERIC_OPERATOR_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__PARAMS:
        getParams().clear();
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
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_DEFINITION:
        return referredDefinition != null;
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR:
        return referredNumericOperator != REFERRED_NUMERIC_OPERATOR_EDEFAULT;
      case AlloyLanguagePackage.ALS_FUNCTION_CALL__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (referredNumericOperator: ");
    result.append(referredNumericOperator);
    result.append(')');
    return result.toString();
  }

} //ALSFunctionCallImpl
