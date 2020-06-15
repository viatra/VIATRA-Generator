/**
 * generated by Xtext 2.14.0
 */
package ca.mcgill.ecse.dslreasoner.vampireLanguage.impl;

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSExistentialQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTffTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage;

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
 * An implementation of the model object '<em><b>VLS Existential Quantifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSExistentialQuantifierImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSExistentialQuantifierImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VLSExistentialQuantifierImpl extends VLSTermImpl implements VLSExistentialQuantifier
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<VLSTffTerm> variables;

  /**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected VLSTerm operand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VLSExistentialQuantifierImpl()
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
    return VampireLanguagePackage.Literals.VLS_EXISTENTIAL_QUANTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VLSTffTerm> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<VLSTffTerm>(VLSTffTerm.class, this, VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VLSTerm getOperand()
  {
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand(VLSTerm newOperand, NotificationChain msgs)
  {
    VLSTerm oldOperand = operand;
    operand = newOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND, oldOperand, newOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand(VLSTerm newOperand)
  {
    if (newOperand != operand)
    {
      NotificationChain msgs = null;
      if (operand != null)
        msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND, null, msgs);
      if (newOperand != null)
        msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND, null, msgs);
      msgs = basicSetOperand(newOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND, newOperand, newOperand));
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
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND:
        return basicSetOperand(null, msgs);
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
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__VARIABLES:
        return getVariables();
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND:
        return getOperand();
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
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends VLSTffTerm>)newValue);
        return;
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND:
        setOperand((VLSTerm)newValue);
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
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__VARIABLES:
        getVariables().clear();
        return;
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND:
        setOperand((VLSTerm)null);
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
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__VARIABLES:
        return variables != null && !variables.isEmpty();
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER__OPERAND:
        return operand != null;
    }
    return super.eIsSet(featureID);
  }

} //VLSExistentialQuantifierImpl
