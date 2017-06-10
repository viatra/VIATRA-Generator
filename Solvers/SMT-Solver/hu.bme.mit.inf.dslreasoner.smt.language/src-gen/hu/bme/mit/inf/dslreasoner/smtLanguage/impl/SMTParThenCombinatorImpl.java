/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage.impl;

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic;
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMT Par Then Combinator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParThenCombinatorImpl#getPreProcessingTactic <em>Pre Processing Tactic</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParThenCombinatorImpl#getParalellyPostpricessingTactic <em>Paralelly Postpricessing Tactic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SMTParThenCombinatorImpl extends SMTReasoningCombinatorImpl implements SMTParThenCombinator
{
  /**
   * The cached value of the '{@link #getPreProcessingTactic() <em>Pre Processing Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreProcessingTactic()
   * @generated
   * @ordered
   */
  protected SMTReasoningTactic preProcessingTactic;

  /**
   * The cached value of the '{@link #getParalellyPostpricessingTactic() <em>Paralelly Postpricessing Tactic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParalellyPostpricessingTactic()
   * @generated
   * @ordered
   */
  protected SMTReasoningTactic paralellyPostpricessingTactic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMTParThenCombinatorImpl()
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
    return SmtLanguagePackage.Literals.SMT_PAR_THEN_COMBINATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic getPreProcessingTactic()
  {
    return preProcessingTactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreProcessingTactic(SMTReasoningTactic newPreProcessingTactic, NotificationChain msgs)
  {
    SMTReasoningTactic oldPreProcessingTactic = preProcessingTactic;
    preProcessingTactic = newPreProcessingTactic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC, oldPreProcessingTactic, newPreProcessingTactic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreProcessingTactic(SMTReasoningTactic newPreProcessingTactic)
  {
    if (newPreProcessingTactic != preProcessingTactic)
    {
      NotificationChain msgs = null;
      if (preProcessingTactic != null)
        msgs = ((InternalEObject)preProcessingTactic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC, null, msgs);
      if (newPreProcessingTactic != null)
        msgs = ((InternalEObject)newPreProcessingTactic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC, null, msgs);
      msgs = basicSetPreProcessingTactic(newPreProcessingTactic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC, newPreProcessingTactic, newPreProcessingTactic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMTReasoningTactic getParalellyPostpricessingTactic()
  {
    return paralellyPostpricessingTactic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParalellyPostpricessingTactic(SMTReasoningTactic newParalellyPostpricessingTactic, NotificationChain msgs)
  {
    SMTReasoningTactic oldParalellyPostpricessingTactic = paralellyPostpricessingTactic;
    paralellyPostpricessingTactic = newParalellyPostpricessingTactic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC, oldParalellyPostpricessingTactic, newParalellyPostpricessingTactic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParalellyPostpricessingTactic(SMTReasoningTactic newParalellyPostpricessingTactic)
  {
    if (newParalellyPostpricessingTactic != paralellyPostpricessingTactic)
    {
      NotificationChain msgs = null;
      if (paralellyPostpricessingTactic != null)
        msgs = ((InternalEObject)paralellyPostpricessingTactic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC, null, msgs);
      if (newParalellyPostpricessingTactic != null)
        msgs = ((InternalEObject)newParalellyPostpricessingTactic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC, null, msgs);
      msgs = basicSetParalellyPostpricessingTactic(newParalellyPostpricessingTactic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC, newParalellyPostpricessingTactic, newParalellyPostpricessingTactic));
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
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC:
        return basicSetPreProcessingTactic(null, msgs);
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC:
        return basicSetParalellyPostpricessingTactic(null, msgs);
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
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC:
        return getPreProcessingTactic();
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC:
        return getParalellyPostpricessingTactic();
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
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC:
        setPreProcessingTactic((SMTReasoningTactic)newValue);
        return;
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC:
        setParalellyPostpricessingTactic((SMTReasoningTactic)newValue);
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
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC:
        setPreProcessingTactic((SMTReasoningTactic)null);
        return;
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC:
        setParalellyPostpricessingTactic((SMTReasoningTactic)null);
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
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC:
        return preProcessingTactic != null;
      case SmtLanguagePackage.SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC:
        return paralellyPostpricessingTactic != null;
    }
    return super.eIsSet(featureID);
  }

} //SMTParThenCombinatorImpl
