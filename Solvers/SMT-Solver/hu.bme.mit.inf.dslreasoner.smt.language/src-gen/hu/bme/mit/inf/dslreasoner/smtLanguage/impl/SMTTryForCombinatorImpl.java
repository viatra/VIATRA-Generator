/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Try For Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTryForCombinatorImpl#getTactic <em>Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTryForCombinatorImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTTryForCombinatorImpl extends SMTReasoningCombinatorImpl implements SMTTryForCombinator
{
  /**
   * The cached value of the '{@link #getTactic() <em>Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTactic()
   * @generated
   * @ordered
   */
  protected SMTReasoningTactic tactic;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final int TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected int time = TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTTryForCombinatorImpl()
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
    return SmtLanguagePackage.Literals.SMT_TRY_FOR_COMBINATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic getTactic()
  {
    return tactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTactic(SMTReasoningTactic newTactic, NotificationChain msgs)
  {
    SMTReasoningTactic oldTactic = tactic;
    tactic = newTactic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC, oldTactic, newTactic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTactic(SMTReasoningTactic newTactic)
  {
    if (newTactic != tactic)
    {
      NotificationChain msgs = null;
      if (tactic != null)
        msgs = ((InternalEObject)tactic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC, null, msgs);
      if (newTactic != null)
        msgs = ((InternalEObject)newTactic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC, null, msgs);
      msgs = basicSetTactic(newTactic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC, newTactic, newTactic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(int newTime)
  {
    int oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TIME, oldTime, time));
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
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC:
        return basicSetTactic(null, msgs);
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
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC:
        return getTactic();
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TIME:
        return getTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC:
        setTactic((SMTReasoningTactic)newValue);
        return;
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TIME:
        setTime((Integer)newValue);
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
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC:
        setTactic((SMTReasoningTactic)null);
        return;
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TIME:
        setTime(TIME_EDEFAULT);
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
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TACTIC:
        return tactic != null;
      case SmtLanguagePackage.SMT_TRY_FOR_COMBINATOR__TIME:
        return time != TIME_EDEFAULT;
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
    result.append(" (time: ");
    result.append(time);
    result.append(')');
    return result.toString();
  }

} //SMTTryForCombinatorImpl
