/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT If Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIfCombinatorImpl#getProbe <em>Probe</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIfCombinatorImpl#getIfTactic <em>If Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIfCombinatorImpl#getElseTactic <em>Else Tactic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTIfCombinatorImpl extends SMTReasoningCombinatorImpl implements SMTIfCombinator
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
   * The cached value of the '{@link #getIfTactic() <em>If Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfTactic()
   * @generated
   * @ordered
   */
  protected SMTReasoningTactic ifTactic;

  /**
   * The cached value of the '{@link #getElseTactic() <em>Else Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseTactic()
   * @generated
   * @ordered
   */
  protected SMTReasoningTactic elseTactic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTIfCombinatorImpl()
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
    return SmtLanguagePackage.Literals.SMT_IF_COMBINATOR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE, oldProbe, newProbe);
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
        msgs = ((InternalEObject)probe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE, null, msgs);
      if (newProbe != null)
        msgs = ((InternalEObject)newProbe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE, null, msgs);
      msgs = basicSetProbe(newProbe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE, newProbe, newProbe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic getIfTactic()
  {
    return ifTactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfTactic(SMTReasoningTactic newIfTactic, NotificationChain msgs)
  {
    SMTReasoningTactic oldIfTactic = ifTactic;
    ifTactic = newIfTactic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC, oldIfTactic, newIfTactic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfTactic(SMTReasoningTactic newIfTactic)
  {
    if (newIfTactic != ifTactic)
    {
      NotificationChain msgs = null;
      if (ifTactic != null)
        msgs = ((InternalEObject)ifTactic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC, null, msgs);
      if (newIfTactic != null)
        msgs = ((InternalEObject)newIfTactic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC, null, msgs);
      msgs = basicSetIfTactic(newIfTactic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC, newIfTactic, newIfTactic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic getElseTactic()
  {
    return elseTactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseTactic(SMTReasoningTactic newElseTactic, NotificationChain msgs)
  {
    SMTReasoningTactic oldElseTactic = elseTactic;
    elseTactic = newElseTactic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC, oldElseTactic, newElseTactic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseTactic(SMTReasoningTactic newElseTactic)
  {
    if (newElseTactic != elseTactic)
    {
      NotificationChain msgs = null;
      if (elseTactic != null)
        msgs = ((InternalEObject)elseTactic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC, null, msgs);
      if (newElseTactic != null)
        msgs = ((InternalEObject)newElseTactic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC, null, msgs);
      msgs = basicSetElseTactic(newElseTactic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC, newElseTactic, newElseTactic));
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
      case SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE:
        return basicSetProbe(null, msgs);
      case SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC:
        return basicSetIfTactic(null, msgs);
      case SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC:
        return basicSetElseTactic(null, msgs);
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
      case SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE:
        return getProbe();
      case SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC:
        return getIfTactic();
      case SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC:
        return getElseTactic();
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
      case SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE:
        setProbe((ReasoningProbe)newValue);
        return;
      case SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC:
        setIfTactic((SMTReasoningTactic)newValue);
        return;
      case SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC:
        setElseTactic((SMTReasoningTactic)newValue);
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
      case SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE:
        setProbe((ReasoningProbe)null);
        return;
      case SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC:
        setIfTactic((SMTReasoningTactic)null);
        return;
      case SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC:
        setElseTactic((SMTReasoningTactic)null);
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
      case SmtLanguagePackage.SMT_IF_COMBINATOR__PROBE:
        return probe != null;
      case SmtLanguagePackage.SMT_IF_COMBINATOR__IF_TACTIC:
        return ifTactic != null;
      case SmtLanguagePackage.SMT_IF_COMBINATOR__ELSE_TACTIC:
        return elseTactic != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTIfCombinatorImpl
