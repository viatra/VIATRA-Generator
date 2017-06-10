/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage.impl;

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm;
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration;
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
 * An implementation of the model object '<em><b>ALS Quantified Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl#isDisj <em>Disj</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALSQuantifiedExImpl extends ALSTermImpl implements ALSQuantifiedEx
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ALSMultiplicity TYPE_EDEFAULT = ALSMultiplicity.ALL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ALSMultiplicity type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isDisj() <em>Disj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisj()
   * @generated
   * @ordered
   */
  protected static final boolean DISJ_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDisj() <em>Disj</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDisj()
   * @generated
   * @ordered
   */
  protected boolean disj = DISJ_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<ALSVariableDeclaration> variables;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected ALSTerm expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ALSQuantifiedExImpl()
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
    return AlloyLanguagePackage.Literals.ALS_QUANTIFIED_EX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSMultiplicity getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ALSMultiplicity newType)
  {
    ALSMultiplicity oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_QUANTIFIED_EX__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDisj()
  {
    return disj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisj(boolean newDisj)
  {
    boolean oldDisj = disj;
    disj = newDisj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_QUANTIFIED_EX__DISJ, oldDisj, disj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ALSVariableDeclaration> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<ALSVariableDeclaration>(ALSVariableDeclaration.class, this, AlloyLanguagePackage.ALS_QUANTIFIED_EX__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ALSTerm getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(ALSTerm newExpression, NotificationChain msgs)
  {
    ALSTerm oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(ALSTerm newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION, newExpression, newExpression));
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
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__TYPE:
        return getType();
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__DISJ:
        return isDisj();
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__VARIABLES:
        return getVariables();
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION:
        return getExpression();
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
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__TYPE:
        setType((ALSMultiplicity)newValue);
        return;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__DISJ:
        setDisj((Boolean)newValue);
        return;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends ALSVariableDeclaration>)newValue);
        return;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION:
        setExpression((ALSTerm)newValue);
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
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__DISJ:
        setDisj(DISJ_EDEFAULT);
        return;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__VARIABLES:
        getVariables().clear();
        return;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION:
        setExpression((ALSTerm)null);
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
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__TYPE:
        return type != TYPE_EDEFAULT;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__DISJ:
        return disj != DISJ_EDEFAULT;
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__VARIABLES:
        return variables != null && !variables.isEmpty();
      case AlloyLanguagePackage.ALS_QUANTIFIED_EX__EXPRESSION:
        return expression != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", disj: ");
    result.append(disj);
    result.append(')');
    return result.toString();
  }

} //ALSQuantifiedExImpl
