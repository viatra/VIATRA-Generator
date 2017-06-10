/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Fail If Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFailIfCombinatorImpl#getProbe <em>Probe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTFailIfCombinatorImpl extends SMTReasoningCombinatorImpl implements SMTFailIfCombinator
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTFailIfCombinatorImpl()
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
    return SmtLanguagePackage.Literals.SMT_FAIL_IF_COMBINATOR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE, oldProbe, newProbe);
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
        msgs = ((InternalEObject)probe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE, null, msgs);
      if (newProbe != null)
        msgs = ((InternalEObject)newProbe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE, null, msgs);
      msgs = basicSetProbe(newProbe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE, newProbe, newProbe));
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
      case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE:
        return basicSetProbe(null, msgs);
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
      case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE:
        return getProbe();
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
      case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE:
        setProbe((ReasoningProbe)newValue);
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
      case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE:
        setProbe((ReasoningProbe)null);
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
      case SmtLanguagePackage.SMT_FAIL_IF_COMBINATOR__PROBE:
        return probe != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTFailIfCombinatorImpl
