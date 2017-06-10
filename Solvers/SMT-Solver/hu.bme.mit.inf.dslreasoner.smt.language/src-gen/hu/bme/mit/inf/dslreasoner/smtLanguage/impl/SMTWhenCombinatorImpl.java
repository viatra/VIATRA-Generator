/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT When Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTWhenCombinatorImpl#getProbe <em>Probe</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTWhenCombinatorImpl#getTactic <em>Tactic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTWhenCombinatorImpl extends SMTReasoningCombinatorImpl implements SMTWhenCombinator
{
  /**
   * The cached value of the '{@link #getProbe() <em>Probe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbe()
   * @generated
   * @ordered
   */
  protected ReasoningProbe probe;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTWhenCombinatorImpl()
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
    return SmtLanguagePackage.Literals.SMT_WHEN_COMBINATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReasoningProbe getProbe()
  {
    return probe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProbe(ReasoningProbe newProbe, NotificationChain msgs)
  {
    ReasoningProbe oldProbe = probe;
    probe = newProbe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE, oldProbe, newProbe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProbe(ReasoningProbe newProbe)
  {
    if (newProbe != probe)
    {
      NotificationChain msgs = null;
      if (probe != null)
        msgs = ((InternalEObject)probe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE, null, msgs);
      if (newProbe != null)
        msgs = ((InternalEObject)newProbe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE, null, msgs);
      msgs = basicSetProbe(newProbe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE, newProbe, newProbe));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC, oldTactic, newTactic);
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
        msgs = ((InternalEObject)tactic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC, null, msgs);
      if (newTactic != null)
        msgs = ((InternalEObject)newTactic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC, null, msgs);
      msgs = basicSetTactic(newTactic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC, newTactic, newTactic));
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
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE:
        return basicSetProbe(null, msgs);
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC:
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
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE:
        return getProbe();
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC:
        return getTactic();
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
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE:
        setProbe((ReasoningProbe)newValue);
        return;
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC:
        setTactic((SMTReasoningTactic)newValue);
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
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE:
        setProbe((ReasoningProbe)null);
        return;
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC:
        setTactic((SMTReasoningTactic)null);
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
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__PROBE:
        return probe != null;
      case SmtLanguagePackage.SMT_WHEN_COMBINATOR__TACTIC:
        return tactic != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTWhenCombinatorImpl
